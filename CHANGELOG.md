# Changelog

All notable changes to the **RosTooling** model and generator plugins will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [3.3.0] - 2026-10-05

### Added
- **Composable Node Container & Component Launch Generation**:
  - Added support for launching ROS 2 nodes as composable components inside `ComposableNodeContainer` via `.rossystem` `processes:` definition.
  - Dynamically selects container executable: `component_container_mt` with `MultiThreadedExecutor` (when `proc.threads > 1`) or `component_container` with `SingleThreadedExecutor` (when `proc.threads <= 1`).
  - Emits container action hosting `launch_ros.descriptions.ComposableNode` instances with package, plugin (`<pkg>::<artCamel>Node`), node name, remappings, and parameters.
  - Preserves standalone execution: nodes not assigned to any process launch as standalone OS executables via `Node` or `LifecycleNode`.
  - Metamodel backwards compatibility: if `processes:` is omitted, all nodes launch as standalone executables as before.
  - Emits `<exec_depend>rclcpp_components</exec_depend>` in `package.xml` when component containers are modeled in the system.
- **C++ Component Architecture & Node Decoupling**:
  - Decoupled `«artCamel»Node` (which bridges ROS 2 communication wrappers to domain algorithms) from `Runner.cpp` into dedicated `include/<pkg>/«artCamel»Node.hpp` and `src/«artCamel»Node.cpp`.
  - Registered `«pkg»::«artCamel»Node` via `RCLCPP_COMPONENTS_REGISTER_NODE` in `Node.cpp`.
  - Added `«artCamel»Node.cpp` to `add_library(«artCamel»_component SHARED ...)` and registered nodes with `rclcpp_components_register_nodes`.
  - Refactored `Runner.cpp` into a lightweight executable entry point instantiating and spinning `«artCamel»Node`. This ensures both standalone executables and composable container nodes invoke the domain algorithm.
- **Action Client Timeout Configuration & Backward-Compatible Variadic Injection**:
  - Added optional timeout configuration to pure C++ core algorithms (`set_«name»_server_timeout()`, `get_«name»_server_timeout()`, and per-call `send_«name»_goal_async(..., timeout = std::nullopt)`).
  - Injected action client caller via variadic generic lambda `[this](const auto & goal, auto resp_cb, auto fb_cb, auto res_cb, auto ... timeout_opt)` in `Ros2CppRunnerCompiler.xtend`.
  - Ensures 100% backward compatibility: seamlessly converts to both legacy 2-argument (`goal_fn`, `cancel_fn`) and new timeout-enabled `GoalCaller` function signatures in protected `*Algorithm.hpp` files without compilation errors.
  - Added `cancel_all_«name»_goals_async()` method to action client wrappers and runners.
- **Package-Scoped File Persistence Checks**:
  - Scoped `alreadyExists` checks in `Ros2Generator.xtend` to only match files within the current package directory (`pkgName/include/pkgName/*Algorithm.hpp` and `pkgName/pkgName/*_logic.py`).
  - Moving algorithm or logic files to an external directory or another package no longer triggers false positive persistence matches; stubs are cleanly recreated within the package directory.
  - Scoped hybrid language detection patterns to only evaluate files within the active package path.
  - Scoped Eclipse handlers (`GenerationRos2CppHandler.java`, `GenerationRos2PythonHandler.java`) to collect files only from `src-gen/<pkgName>`.
- **Process Validation Rules in RosSystemValidator**:
  - Added `checkUniqueProcessAssignment`: reports an error if a node is assigned to multiple processes.
  - Added `checkProcessNodesRos2`: reports an error if a ROS 1 Catkin node is assigned to a component container process.
  - Added `checkProcessThreads`: reports an error if a process thread count is negative.
- **Targeted System Generation with Workspace Awareness**:
  - `RosSystemGeneratorCommandService.java` now accepts an `existingFiles` argument and forwards it to `RosSystemGenerator.generateSystemTargeted`.
  - Enables `.rossystem` code generation to inspect existing package structures in `src-gen/<pkg>` before generating or updating build files.
- **Dedicated Pure Python System Generation (`compile_package_xml_python`)**:
  - Added `compile_package_xml_python` in `PackageXmlCompiler.xtend` to emit a clean `<build_type>ament_python</build_type>` without CMake build tool dependencies.
- **Launch & Config Installation Injections**:
  - Injected `install(DIRECTORY launch ... OPTIONAL)` and `config/` installation directives into existing `CMakeLists.txt` for monolithic packages lacking them.
  - Injected `<exec_depend>launch</exec_depend>`, `<exec_depend>launch_ros</exec_depend>`, and `<exec_depend>ament_index_python</exec_depend>` into existing `package.xml` files when system launch files are added.

### Changed
- **Unconditional `OPTIONAL` Launch & Configuration Installation in CMake**:
  - Replaced configure-time `if(EXISTS "${CMAKE_CURRENT_SOURCE_DIR}/launch")` and `config` conditional wrappers with unconditional `install(DIRECTORY launch DESTINATION share/${PROJECT_NAME} OPTIONAL)` in `Ros2BuildArtifactsCompiler.xtend` and `CMakeListsCompiler.xtend`.
  - Eliminates the configure-time ordering hazard where initial CMake configure evaluated `if(EXISTS ...)` to `FALSE` before launch files were generated, preventing them from being installed.
  - With `OPTIONAL`, CMake always registers the install rules into `cmake_install.cmake` and `ament_cmake_symlink_install.cmake`; when launch files are generated later from `.rossystem`, running `colcon build` immediately installs/symlinks them without requiring CMake reconfiguration.
  - Added automated migration in `RosSystemGenerator.xtend` to upgrade legacy `if(EXISTS .../launch)` blocks in existing `CMakeLists.txt` files to unconditional `OPTIONAL` directives.
- **Executable Naming Alignment Across Build Systems (Approach A)**:
  - Standardized C++ generated filenames to CamelCase matching artifact names (`«artCamel»Wrapper.hpp`, `«artCamel»Algorithm.hpp`, `«artCamel»Runner.cpp`).
  - Aligned C++ executable targets to match the exact modeled artifact name `«node.artifactName»` in `add_executable`, `target_link_libraries`, `ament_target_dependencies`, and `install(TARGETS ...)` (replacing `«CamelCase»_node`).
  - In hybrid CMake packages (`ament_cmake_python`), installed Python runners into `lib/${PROJECT_NAME}` using CMake `RENAME «node.artifactName»` so that executable binaries match the modeled artifact name without a `.py` extension.
  - Aligned Python `setup.py` `console_scripts` entry points to `«node.artifactName» = «pkg».«node.name»_runner:main`.
  - Unified `.rossystem` launch file generation: Launch files reference canonical `executable="«artifact.name»"`, which resolves identically across pure C++, pure Python, and hybrid packages without naming mismatches.
- **Removal of `pyproject.toml` Generation**:
  - Completely removed `pyproject.toml` generation from `Ros2BuildArtifactsCompiler.xtend` and `Ros2Generator.xtend`. Pure Python packages strictly adhere to standard ROS 2 `setup.py` and `setup.cfg`.
- **CMake Baseline**:
  - Updated `CMakeListsCompiler.xtend` minimum version requirement from `3.5` to `3.8`.

### Fixed
- **Monolithic Package Support & Build Collision Prevention**:
  - Resolved build system conflicts in monolithic packages where multiple nodes and bringup launch files share a single package directory.
  - Prevented generation of rogue `CMakeLists.txt` or CMake build configurations in pure Python packages.
  - Prevented generation of rogue `setup.py`, `setup.cfg`, or `__init__.py` in pure C++ bringup packages.
  - Filtered self-referential execution dependencies in `PackageXmlCompiler.xtend` (packages no longer declare dependencies on themselves).
- **Deterministic File Pruning for Clean Build Transitions**:
  - Added deterministic file pruning (`fsa.deleteFile`) for obsolete Python setuptools files (`setup.py`, `setup.cfg`, `pyproject.toml`, and setuptools resource package marker `resource/<pkg>`) in CMake and hybrid packages.
  - Added deterministic file pruning (`fsa.deleteFile`) for obsolete `CMakeLists.txt` and `pyproject.toml` in pure Python packages.
  - Strictly preserved PlantUML architecture diagrams (`resource/<pkg>.puml`) from deletion across all build file cleanup routines.
- **Single-Language Node Enforcement & Duplicate Node Prevention**:
  - Enforced single-language implementation per node in `Ros2Generator.xtend`: regenerating a node in C++ automatically prunes it from `pythonNodes` and deletes opposite-language files (`_wrapper.py`, `_runner.py`, `_logic.py`); regenerating a node in Python prunes it from `cppNodes` and deletes opposite-language files (`Wrapper.hpp`, `Node.hpp`, `Algorithm.hpp`, `Wrapper.cpp`, `Node.cpp`, `Runner.cpp`).
- **Antlr Token Source Resilience**:
  - Updated `Ros2TokenSource.java` in both `ros2.xtext` and `ros2.xtext.ide` to use reflection-based fallback for resolving token rule constants (`RULE_WS`, `RULE_BEGIN`, `RULE_END`), preventing binary incompatibility crashes upon Antlr re-generation.


## [3.2.0] - 2026-09-30

### Added
- **Runtime Platform Services for Pure Core Logic**:
  - **Liveness Checking (`ok()`)**: Allows core algorithm execution loops to terminate gracefully on node interruption or shutdown (`rclcpp::ok()` / `rclpy.ok()`).
  - **Graceful Termination (`shutdown(reason)`)**: Enables domain logic to request process shutdown with optional reason logging (`rclcpp::shutdown()` / `rclpy.shutdown()`).
  - **Simulation-Synchronized Clock (`now()`, `now_seconds()`)**: Decoupled clock query returning standard `std::chrono::nanoseconds` or fractional seconds (`float`), respecting `/clock`, simulation pause, and bag replay without leaking ROS 2 time types into domain logic.
  - **Simulation-Synchronized Sleep (`sleep_for`)**: One-shot relative delays adhering to the simulation clock via `node->get_clock()->sleep_for(...)` and Python `Duration`.
  - **Simulation-Synchronized Rate (`Rate`, `RateFactory`, `create_rate`)**: Abstract `Rate` interface providing simulation-synchronized loop pacing with fallback implementations (`DefaultSteadyRate` in C++, `DefaultRate` in Python) for unit tests.
  - **Platform Logging Bridge**: Leveled logging (`log_debug`, `log_info`, `log_warn`, `log_error`) bridging pure algorithms directly to `RCLCPP_*` macros and Python node loggers.
  - **Timer Factory (`create_timer`)**: Pure delegate allowing core logic to schedule periodic callbacks driven by the node executor.
- **Action Client Feedback & Terminal State Forwarding**:
  - Asynchronous goal acceptance callback (`response_cb(bool accepted)`) notifying the algorithm whether a sent goal was accepted or rejected by the action server.
  - Pure `GoalStatus` enum (`UNKNOWN`, `SUCCEEDED`, `CANCELED`, `ABORTED`) forwarding action terminal states to the domain logic result callback without requiring `rclcpp_action` or `action_msgs` dependencies.
- **Dynamic Parameter Hooks & Validation**:
  - Parameter getters and setters (`get_param` / `get_parameter`, `set_parameter`).
  - `validate_parameter(name, proposed_value)` validation hook returning pure `ValidationResult::ok()` or `ValidationResult::reject(reason)` to inspect and reject invalid dynamic parameter updates.
  - `on_parameter_changed(name, value)` hook to trigger reactive updates in domain logic upon parameter reconfiguration.

### Changed
- **Artifact Naming Conventions**:
  - Standardized C++ generated filenames to CamelCase matching artifact names (`«artCamel»Wrapper.hpp`, `«artCamel»Algorithm.hpp`, `«artCamel»Node.cpp`).
  - Synchronized `CMakeLists.txt` executable targets and Python entrypoints with the artifact names.
- **Strict Mocking Enforcement**:
  - Calling unconfigured platform delegates (`ok`, `shutdown`, `now`, `sleep_for`) in standalone tests throws `std::logic_error` in C++ and raises `RuntimeError` in Python instead of silently defaulting, requiring test harnesses to explicitly mock the runtime platform.
- **LSP Command Refactoring**:
  - Renamed the advertised Language Server command to `ros2.generateWrappersServer` to prevent command collisions with IDE client commands.

### Fixed
- Fixed parameter default value extraction in `Ros2GeneratorHelpers.xtend`.
- Fixed loop generation syntax error when generating parameter handlers for nodes with zero parameters.
- Fixed lambda parameter syntax and missing semicolons in C++ runner generation.


