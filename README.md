# RosTooling

[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) [![ros-model CI](https://github.com/ipa320/ros-model/actions/workflows/build.yml/badge.svg)](https://github.com/ipa320/ros-model/actions/workflows/build.yml)

The main purpose of this effort is to combine the advantages of [ROS](http://wiki.ros.org/) and Model-Driven-Engineering techniques. This repository holds a family of metamodels defined as Ecore models and their corresponding Xtext-based DSLs (Domain Specific Language) implementation. 
The resulted models allow the description of ROS and ROS2 concepts and properties, like packages, artifacts, nodes, interfaces types, parameters... Moreover a complete system as composition of ROS components can be also modelled.

The models have associated tools, the following are some examples:
- Textual editors with grammar highlight, debug functionalities and auto-complete helpers.
- Validators to check the corretness and check the use of best practices
- Code geneators to automatically generate code, documentation, helper scripts...
- (ToBeDone) Graphical editor

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) - **nadia.hammoudeh.garcia@ipa.fraunhofer.de**

The **documentation** of the RosTooling is available under [https://ipa320.github.io/RosTooling.github.io/](https://ipa320.github.io/RosTooling.github.io/).

---------------------------------------------------------


Related repositories:
- ROS2 embedded code generator: [rossdl](https://github.com/CoreSenseEU/rossdl)
- Python parsers (packed as a ROS package) for the ROS and ROSsystem models: [ros_model_parser](https://github.com/ipa320/ros_model_parser)
- Python implementation for the static code analyzers and docker containers setups for different ROS distros: [ros-model-extractors](https://github.com/ipa320/ros-model-extractors)
- Runtime monitoring pipelines:
  - ROS1: [rosgraph_monitor](https://github.com/ipa320/rosgraph_monitor)
  - ROS2: [ros2mode](https://github.com/ipa-cmh/ros2model/)
- Eclipse update site: [RosTooling-update-site](https://github.com/ipa320/RosTooling-update-site)

Publications:
- Paper: Bootstrapping MDE Development from ROS Manual Code - Part 1: Metamodeling [IRC19 paper](https://ieeexplore.ieee.org/document/8675668)
- Paper: Bootstrapping MDE Development from ROS Manual Code - Part 2: Model Generation [Models paper](https://ieeexplore.ieee.org/document/8906937)
- Journal Paper: Bootstrapping MDE development from ROS manual code - Part 2: Model generation and leveraging models at runtime and  [SoSym paper](https://link.springer.com/article/10.1007/s10270-021-00873-2)
- Paper: Lifting ROS to Model-Driven Development: Lessons Learned from a bottom-up approach [RoSE paper](https://awortmann.github.io/downloads/preprints/2023/Lifting_ROS_to_Model-Driven_Development_-_Lessons_Learned_from_a_bottom-up_approach.pdf)



<!--
---------------------------------------------------------

# RosTooling Manual

## Installation

- [Eclipse feature](docu/Installation.md#option-1-using-the-release-version-recommended)
- [(Only for tooling developers) From Source code in eclipse](docu/Installation.md#option-2-using-the-eclipse-installer---source-installation-ros-tooling-developers)
- VS Code plugin(tbd) - WIP [vscode-RosTooling](https://github.com/ipa320/vscode-RosTooling)

## Tutorials v3

- Create component models:
  - (Prerequisite) [Add communication objects](docu/NewCommunicationObjects.md)
  - [Create manually a new ROS component description](docu/RosModelDescription.md)
  - [Generation of code from models](https://github.com/CoreSenseEU/rossdl#usage)
  - [Create a ROS model from a deployed robot using our introspection at runtime tool](docu/IntrospectionNode.md)
  - [Create a ROS model from your source code(static code analyzer)](docu/NewRosModel.md))

- Combine components to form a ROS System
  - [Create manually a new RosSystem description](docu/RosSystemModelDescription.md)
  - [Visualize a system using PlantUML](docu/PlantUML.md)
  
- Examples:
  - [Simple publisher-subscriber](docu/Example_PubSub.md)
  - [Turtlesim](docu/Example_Turtlesim.md)

- [Update Release versions (only for administrators)](docu/Release.md)

## Model examples

The repository [ros-model-examples](https://github.com/ipa-nhg/ros-model-examples) contains a set components and system examples.

---------------------------------------------------------
# OLD (out-of-date)

Links to related repositories:
- Language server for the RosModels (web-based models editor): [theia-ros-model](https://github.com/ipa-nhg/theia-ros-model)
- Web interface to automatically extract models from public source code: [model extractor](http://ros-model.seronet-project.de/)
- Source code for the web interface (extract models for non-public available ROS packages): [ros-model-cloud](https://github.com/ipa320/ros-model-cloud)

-->
