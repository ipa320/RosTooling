package de.fraunhofer.ipa.ros2.ide;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.lsp4j.ExecuteCommandParams;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.ide.server.ILanguageServerAccess;
import org.eclipse.xtext.ide.server.commands.IExecutableCommandService;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.inject.Inject;
import com.google.inject.Provider;

import de.fraunhofer.ipa.ros2.generator.Ros2Generator;

public class Ros2GeneratorCommandService implements IExecutableCommandService {

    @Inject Provider<GeneratorDelegate> generatorProvider;
    @Inject IResourceServiceProvider.Registry resourceServiceRegistry;

    private void log(String message) {
        try {
            File logFile = new File(System.getProperty("java.io.tmpdir"), "ros2_lsp_generator.log");
            String logEntry = LocalDateTime.now() + " [ROS2 LSP] " + message + "\n";
            Files.write(logFile.toPath(), logEntry.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception ignored) {
        }
    }

    @Override
    public List<String> initialize() {
        log("Advertising commands: ros2.generateWrappersServer, ros2.generateCppWrapper, ros2.generatePythonWrapper");
        return Lists.newArrayList(
            "ros2.generateWrappersServer",
            "ros2.generateCppWrapper",
            "ros2.generatePythonWrapper"
        );
    }

    @Override
    public Object execute(ExecuteCommandParams params, ILanguageServerAccess access, CancelIndicator cancelIndicator) {
        String command = params.getCommand();
        log("Executing command: " + command);
        if (!"ros2.generateWrappersServer".equals(command) &&
            !"ros2.generateWrappers".equals(command) &&
            !"ros2.generateCppWrapper".equals(command) &&
            !"ros2.generatePythonWrapper".equals(command)) {
            return Map.of("error", "Unknown command: " + command);
        }

        try {
            List<Object> args = params.getArguments();
            if (args == null || args.isEmpty()) {
                return Map.of("error", "No arguments provided");
            }

            String fileUriStr = parseStringArg(args.get(0));
            log("Target file URI: " + fileUriStr);
            URI uri = URI.createURI(fileUriStr);

            // Optional 2nd arg: Target Node names (List<String>)
            List<String> targetNodes = new ArrayList<>();
            if (args.size() > 1 && args.get(1) != null) {
                targetNodes = parseStringList(args.get(1));
            }

            // Optional 3rd arg: Language choice ("cpp", "python", "both")
            String language = "both";
            if ("ros2.generateCppWrapper".equals(command)) {
                language = "cpp";
            } else if ("ros2.generatePythonWrapper".equals(command)) {
                language = "python";
            } else if (args.size() > 2 && args.get(2) != null) {
                language = parseStringArg(args.get(2));
            }

            // Optional 4th arg: Target distro ("humble", "jazzy", "auto")
            String targetDistro = "auto";
            if (args.size() > 3 && args.get(3) != null) {
                targetDistro = parseStringArg(args.get(3));
            }

            // Optional 5th arg: Existing files in src-gen/<pkg> (to support hybrid preservation)
            List<String> existingFiles = new ArrayList<>();
            if (args.size() > 4 && args.get(4) != null) {
                existingFiles = parseStringList(args.get(4));
            }

            final List<String> finalTargetNodes = targetNodes;
            final String finalLanguage = language;
            final String finalDistro = targetDistro;
            final List<String> finalExistingFiles = existingFiles;

            CompletableFuture<Map<String, Object>> futureResult = access.doRead(fileUriStr, (context) -> {
                try {
                    Resource resource = context.getResource();
                    EcoreUtil.resolveAll(resource);
                    IResourceServiceProvider rsp = resourceServiceRegistry.getResourceServiceProvider(uri);
                    IGenerator2 generator = rsp.get(IGenerator2.class);
                    if (generator == null) {
                        return Map.of("error", "IGenerator2 not bound in Ros2 language module");
                    }

                    InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
                    GeneratorContext genContext = new GeneratorContext();
                    genContext.setCancelIndicator(cancelIndicator != null ? cancelIndicator : CancelIndicator.NullImpl);

                    if (generator instanceof Ros2Generator) {
                        ((Ros2Generator) generator).generateTargeted(
                            resource,
                            fsa,
                            finalTargetNodes,
                            finalLanguage,
                            finalDistro,
                            finalExistingFiles
                        );
                    } else {
                        generator.doGenerate(resource, fsa, genContext);
                    }

                    Map<String, String> files = fsa.getAllFiles().entrySet().stream()
                        .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().toString()));

                    log("Successfully generated " + files.size() + " files for " + fileUriStr);
                    return Map.of("success", true, "files", files, "count", files.size());
                } catch (Exception e) {
                    log("Generation failed: " + e.getMessage());
                    e.printStackTrace();
                    return Map.of("error", "Generation failed: " + e.getMessage());
                }
            });

            return futureResult.get();

        } catch (Exception e) {
            log("Execution error: " + e.getMessage());
            return Map.of("error", e.getMessage());
        }
    }

    private String parseStringArg(Object arg) {
        if (arg == null) return "";
        if (arg instanceof JsonPrimitive) {
            return ((JsonPrimitive) arg).getAsString();
        }
        String s = arg.toString();
        if (s.startsWith("\"") && s.endsWith("\"") && s.length() >= 2) {
            s = s.substring(1, s.length() - 1);
        }
        return s;
    }

    private List<String> parseStringList(Object arg) {
        List<String> list = new ArrayList<>();
        if (arg == null) return list;
        if (arg instanceof JsonArray) {
            for (JsonElement el : (JsonArray) arg) {
                list.add(el.getAsString());
            }
        } else if (arg instanceof List) {
            for (Object obj : (List<?>) arg) {
                list.add(parseStringArg(obj));
            }
        } else {
            String s = parseStringArg(arg);
            if (!s.isEmpty()) {
                list.add(s);
            }
        }
        return list;
    }
}
