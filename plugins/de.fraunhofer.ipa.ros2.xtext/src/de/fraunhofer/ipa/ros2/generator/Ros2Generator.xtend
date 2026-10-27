package de.fraunhofer.ipa.ros2.generator

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ros.Node
import ros.Package

/**
 * Main code generator for ROS 2 package models (.ros2).
 * Deterministically generates C++, Python, or Hybrid ROS 2 node wrappers, runners,
 * algorithm stubs, and build configurations.
 */
class Ros2Generator extends AbstractGenerator {

    @Inject extension Ros2GeneratorHelpers
    @Inject extension Ros2CppWrapperCompiler
    @Inject extension Ros2CppRunnerCompiler
    @Inject extension Ros2PythonWrapperCompiler
    @Inject extension Ros2BuildArtifactsCompiler

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val fsaName = fsa.class.simpleName
        if (fsaName == "URIBasedFileSystemAccess" || fsaName == "FileSystemAccessImpl") {
            println("[LSP SHIELD] Blocked automatic background generation on startup for .ros2.")
            return
        }

        // Default invocation: generate both C++ and Python for all nodes targeting host distro
        generateTargeted(resource, fsa, null, "both", "auto", null)
    }

    def void generateTargeted(
        Resource resource,
        IFileSystemAccess2 fsa,
        List<String> targetNodes,
        String languageChoice,
        String targetDistro,
        List<String> existingFiles)
    {
        val distro = if (targetDistro === null || targetDistro.empty || "auto".equalsIgnoreCase(targetDistro)) {
            val envDistro = System.getenv("ROS_DISTRO")
            if (envDistro !== null && !envDistro.empty) envDistro else "humble"
        } else {
            targetDistro.toLowerCase()
        }

        val existingList = if (existingFiles !== null) existingFiles else new ArrayList<String>()

        for (pkg : resource.allContents.toIterable.filter(Package)) {
            val pkgName = pkg.name.toLowerCase
            val allPkgNodes = new ArrayList<Node>()
            for (art : pkg.artifact) {
                if (art.node !== null) {
                    allPkgNodes.add(art.node)
                }
            }

            // Determine which nodes from this resource should be generated
            val nodesToGenerate = new ArrayList<Node>()
            for (node : allPkgNodes) {
                if (targetNodes === null || targetNodes.empty ||
                    targetNodes.contains(node.artifactName) ||
                    targetNodes.contains(toCamelCase(node.artifactName)) ||
                    targetNodes.contains(node.name) ||
                    targetNodes.contains(toCamelCase(node.name))) {
                    nodesToGenerate.add(node)
                }
            }

            if (!nodesToGenerate.empty) {
                val lang = if (languageChoice === null || languageChoice.empty) "cpp" else languageChoice.toLowerCase()
                val genCpp = "cpp".equals(lang) || "both".equals(lang)
                val genPy = "python".equals(lang) || "both".equals(lang)

                // Track all C++ and Python nodes for build file configuration
                val cppNodes = new ArrayList<Node>()
                val pythonNodes = new ArrayList<Node>()

                // 1. Check existing files to preserve previously generated nodes of other languages (Hybrid support)
                //    Only consider files that belong to this package (pkgName/ or src-gen/pkgName/)
                val cppPattern = Pattern.compile(".*src/([A-Za-z0-9_]+)Wrapper\\.cpp")
                val pyPattern = Pattern.compile(".*([A-Za-z0-9_]+)/([A-Za-z0-9_]+)_wrapper\\.py")

                for (f : existingList) {
                    // Only consider files that belong to this package (pkgName/ or src-gen/pkgName/ or bare filenames)
                    val belongsToPackage = f.startsWith(pkgName + "/") || f.startsWith("src-gen/" + pkgName + "/") || !f.contains("/")
                    if (!belongsToPackage) {
                        // Skip files from other packages
                    } else {
                        val mCpp = cppPattern.matcher(f)
                        if (mCpp.matches()) {
                            val matchedName = mCpp.group(1)
                            val existingNode = allPkgNodes.findFirst[
                                toCamelCase(artifactName) == matchedName ||
                                artifactName == matchedName ||
                                toCamelCase(name) == matchedName ||
                                name == matchedName
                            ]
                            if (existingNode !== null && !cppNodes.contains(existingNode)) {
                                cppNodes.add(existingNode)
                            }
                        }
                        val mPy = pyPattern.matcher(f)
                        if (mPy.matches()) {
                            val matchedName = mPy.group(2)
                            val existingNode = allPkgNodes.findFirst[
                                toSnakeCase(artifactName) == matchedName ||
                                toSnakeCase(name) == matchedName ||
                                name == matchedName
                            ]
                            if (existingNode !== null && !pythonNodes.contains(existingNode)) {
                                pythonNodes.add(existingNode)
                            }
                        }
                    }
                }

                // 2. Generate C++ Artifacts
                if (genCpp) {
                    for (node : nodesToGenerate) {
                        if (!cppNodes.contains(node)) {
                            cppNodes.add(node)
                        }

                        // When generating C++, ensure node is not duplicated in pythonNodes and prune opposite-language files
                        pythonNodes.removeIf[it == node || it.name == node.name || it.artifactName == node.artifactName]
                        val snakeNode = toSnakeCase(node.name)
                        fsa.deleteFile(pkgName + "/" + pkgName + "/" + snakeNode + "_wrapper.py")
                        fsa.deleteFile(pkgName + "/" + pkgName + "/" + snakeNode + "_runner.py")
                        fsa.deleteFile(pkgName + "/" + pkgName + "/" + snakeNode + "_logic.py")

                        val artCamel = toCamelCase(node.artifactName)

                        // Wrapper Header (Overwritten on generation)
                        fsa.generateFile(
                            pkgName + "/include/" + pkgName + "/" + artCamel + "Wrapper.hpp",
                            compileHeader(pkg, node, artCamel)
                        )

                        // Wrapper Source (Overwritten on generation)
                        fsa.generateFile(
                            pkgName + "/src/" + artCamel + "Wrapper.cpp",
                            compileSource(pkg, node, artCamel)
                        )

                        // Standalone Runner & Component Export (Overwritten on generation)
                        fsa.generateFile(
                            pkgName + "/include/" + pkgName + "/" + artCamel + "Node.hpp",
                            compileCppNodeHeader(pkg, node, artCamel)
                        )
                        fsa.generateFile(
                            pkgName + "/src/" + artCamel + "Node.cpp",
                            compileCppNodeSource(pkg, node, artCamel)
                        )
                        fsa.generateFile(
                            pkgName + "/src/" + artCamel + "Runner.cpp",
                            compileCppRunner(pkg, node, artCamel)
                        )

                        // Pure Algorithm Template (Protected: only if not already existing within this package)
                        val algoHeaderPath = pkgName + "/include/" + pkgName + "/" + artCamel + "Algorithm.hpp"
                        val alreadyExists = existingList.exists[
                            it == algoHeaderPath ||
                            (it.startsWith(pkgName + "/") && it.endsWith("/" + artCamel + "Algorithm.hpp")) ||
                            (it.startsWith("src-gen/" + pkgName + "/") && it.endsWith("/" + artCamel + "Algorithm.hpp"))
                        ]
                        if (!alreadyExists) {
                            fsa.generateFile(algoHeaderPath, compileCoreLogicStub(pkg, node, artCamel))
                        }
                    }
                }

                // 3. Generate Python Artifacts
                if (genPy) {
                    // __init__.py
                    fsa.generateFile(pkgName + "/" + pkgName + "/__init__.py", "")

                    for (node : nodesToGenerate) {
                        if (!pythonNodes.contains(node)) {
                            pythonNodes.add(node)
                        }

                        // When generating Python, ensure node is not duplicated in cppNodes and prune opposite-language files
                        cppNodes.removeIf[it == node || it.name == node.name || it.artifactName == node.artifactName]
                        val artCamel = toCamelCase(node.artifactName)
                        fsa.deleteFile(pkgName + "/include/" + pkgName + "/" + artCamel + "Wrapper.hpp")
                        fsa.deleteFile(pkgName + "/include/" + pkgName + "/" + artCamel + "Node.hpp")
                        fsa.deleteFile(pkgName + "/include/" + pkgName + "/" + artCamel + "Algorithm.hpp")
                        fsa.deleteFile(pkgName + "/src/" + artCamel + "Wrapper.cpp")
                        fsa.deleteFile(pkgName + "/src/" + artCamel + "Node.cpp")
                        fsa.deleteFile(pkgName + "/src/" + artCamel + "Runner.cpp")

                        val snakeNode = toSnakeCase(node.name)

                        // Python Wrapper (Overwritten on generation)
                        fsa.generateFile(
                            pkgName + "/" + pkgName + "/" + snakeNode + "_wrapper.py",
                            compileWrapper(pkg, node)
                        )

                        // Python Runner Entrypoint (Overwritten on generation)
                        fsa.generateFile(
                            pkgName + "/" + pkgName + "/" + snakeNode + "_runner.py",
                            compilePythonRunner(pkg, node)
                        )

                        // Pure Logic Template (Protected: only if not already existing within this package)
                        val logicPath = pkgName + "/" + pkgName + "/" + snakeNode + "_logic.py"
                        val alreadyExists = existingList.exists[
                            it == logicPath ||
                            (it.startsWith(pkgName + "/") && it.endsWith("/" + snakeNode + "_logic.py")) ||
                            (it.startsWith("src-gen/" + pkgName + "/") && it.endsWith("/" + snakeNode + "_logic.py"))
                        ]
                        if (!alreadyExists) {
                            fsa.generateFile(logicPath, compileLogicStub(pkg, node))
                        }
                    }
                }

                // 4. Generate Build Files (Package.xml, CMakeLists.txt, setup.py)
                fsa.generateFile(
                    pkgName + "/package.xml",
                    compilePackageXml(pkg, cppNodes, pythonNodes, distro)
                )

                // If C++ is involved (pure C++ or hybrid), generate CMakeLists.txt
                if (!cppNodes.empty) {
                    fsa.generateFile(
                        pkgName + "/CMakeLists.txt",
                        compileCMakeLists(pkg, cppNodes, pythonNodes, distro)
                    )
                    // Prune redundant Python setuptools files in CMake packages
                    fsa.deleteFile(pkgName + "/setup.py")
                    fsa.deleteFile(pkgName + "/setup.cfg")
                    fsa.deleteFile(pkgName + "/pyproject.toml")
                    fsa.deleteFile(pkgName + "/resource/" + pkgName)
                } else if (!pythonNodes.empty) {
                    // Pure Python package
                    fsa.generateFile(
                        pkgName + "/resource/" + pkgName,
                        ""
                    )
                    fsa.generateFile(
                        pkgName + "/setup.py",
                        compileSetupPy(pkg, pythonNodes)
                    )
                    fsa.generateFile(
                        pkgName + "/setup.cfg",
                        compileSetupCfg(pkg)
                    )
                    // Prune redundant CMake and TOML files in pure Python packages
                    fsa.deleteFile(pkgName + "/CMakeLists.txt")
                    fsa.deleteFile(pkgName + "/pyproject.toml")
                }
            }
        }
    }
}
