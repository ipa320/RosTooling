package de.fraunhofer.ipa.rossystem.ide; // Or your specific package

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.naming.Context;

import java.util.concurrent.CompletableFuture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.lsp4j.ExecuteCommandParams;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.ide.server.ILanguageServerAccess;
import org.eclipse.xtext.ide.server.commands.IExecutableCommandService;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.GeneratorContext;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.common.collect.Lists;
import com.google.gson.JsonPrimitive;

public class RosSystemGeneratorCommandService implements IExecutableCommandService {
    
    // Because we are in the IDE module, we can safely inject these!
    @Inject Provider<GeneratorDelegate> generatorProvider;
    @Inject IResourceServiceProvider.Registry resourceServiceRegistry;
    
    private void forceLog(String message) {
        try {
            File logFile = new File(System.getProperty("java.io.tmpdir"), "ros_lsp_debug.log");
            String logEntry = LocalDateTime.now() + " [ROS LSP] " + message + "\n";
            Files.write(logFile.toPath(), logEntry.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (Exception e) {
            // Ignore
        }
    }

    @Override
    public List<String> initialize() {
        forceLog("initialize() CALLED! Advertising 'rossystem.generateCode'");
        return Lists.newArrayList("rossystem.generateCode");
    }

    @Override
    public Object execute(ExecuteCommandParams params, ILanguageServerAccess access, CancelIndicator cancelIndicator) {
        forceLog("execute() CALLED with ID: " + params.getCommand());
        forceLog("Raw arguments received: " + params.getArguments());
        if ("rossystem.generateCode".equals(params.getCommand())) {
            try {
            	if (params.getArguments() == null || params.getArguments().isEmpty()) {
            		forceLog("Error: Arguments list is empty or null! Client dropped the payload");
            		return Map.of("error", "No arguments provided by client");
            	}
            	Object firstArg = params.getArguments().get(0);
            	forceLog("First argument type: " + firstArg.getClass().getSimpleName());
            	forceLog("First argument value: " + firstArg.toString());
                String fileUriStr;
                if (firstArg instanceof JsonPrimitive) {
                	fileUriStr = ((JsonPrimitive) firstArg).getAsString();
                } else {
                	fileUriStr = firstArg.toString();
                	if (fileUriStr.startsWith("\"") && fileUriStr.endsWith("\"")) {
                		fileUriStr = fileUriStr.substring(1, fileUriStr.length() - 1);
                	}
                }
                forceLog("Cleaned URI received: " + fileUriStr);
                URI uri = URI.createURI(fileUriStr);
                
                forceLog("Requesting workspace-aware document from LSP ...");
                
                CompletableFuture<Map<String, Object>> futureResult = access.doRead(fileUriStr, (context) -> {
                	try {
						Resource resource = context.getResource();
						EcoreUtil.resolveAll(resource);
						IResourceServiceProvider rsp = resourceServiceRegistry.getResourceServiceProvider(uri);
						IGenerator2 generator = rsp.get(IGenerator2.class);
						if (generator == null) {
							forceLog("ERROR: IGenerator2 not bound in language module!");
							return Map.of("error", "Generator not found");
						}
						var fsa = new InMemoryFileSystemAccess();
						var context1 = new GeneratorContext();
						context1.setCancelIndicator(CancelIndicator.NullImpl);
						generator.doGenerate(resource, fsa, context1);
						
						Map<String, String> files = fsa.getAllFiles().entrySet().stream()
		                        .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().toString()));
		                
		                forceLog("SUCCESS: Generated " + files.size() + " files.");
		                return Map.of("success", true, "files", files, "count", files.size());
					} catch (Exception e) {
						forceLog("GENERATION ERROR: " + e.getMessage());
						e.printStackTrace();
						return Map.of("error", "Generation failed: " + e.getMessage());
					}
                });
                
                return futureResult.get();
                
            } catch (Exception e) {
                forceLog("ERROR: " + e.getMessage());
                return Map.of("error", e.getMessage());
            }
        }
        return Map.of("error", "Unknown command");
    }
}