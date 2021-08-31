# Ros Model

[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause) [![Build](https://travis-ci.org/ipa320/ros-model.svg?branch=master)](https://travis-ci.org/ipa320/ros-model) 

The main purpose of this effort is to combine the advantages of [ROS](http://wiki.ros.org/) and Model-Driven-Engineering techniques. This repository holds a family of metamodels defined as ecore models that together with its java and Xtext and Xtend grammar implementations facilitates the use of a set of tools and graphical plug-ins to create models from ROS code, compose and validate the composition of models, autogenerate deployment artifacts and check the use of standard specifications. 

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) - **nadia.hammoudeh.garcia@ipa.fraunhofer.de**

## Projects/Links related to this repository:

- Eclipse Tooling update site: [the update site](http://ros-model.seronet-project.de/updatesite/)

Related repositories:
- Python implementation for the static code analyzers and docker containers setups for different ROS distros: [ros-model-extractors](https://github.com/ipa320/ros-model-extractors)
- Language server for the RosModels (web-based models editor): [theia-ros-model](https://github.com/ipa-nhg/theia-ros-model)
- Python parsers (packed as a ROS package) for the ROS and ROSsystem models: [ros_model_parser](https://github.com/ipa320/ros_model_parser)
- Web interface to automatically extract models from public source code: [model extractor](http://ros-model.seronet-project.de/)
- Source code for the web interface (extract models for non-public available ROS packages): [ros-model-cloud](https://github.com/ipa320/ros-model-cloud)
- Runtime monitoring pipeline [rosgraph_monitor](https://github.com/ipa320/rosgraph_monitor)

Publications:
- Paper: Bootstrapping MDE Development from ROS Manual Code - Part 1: Metamodeling [IRC19 paper](https://ieeexplore.ieee.org/document/8675668)
- Paper: Bootstrapping MDE Development from ROS Manual Code - Part 2: Model Generation [Models paper](https://ieeexplore.ieee.org/document/8906937)
- Journal Paper: Bootstrapping MDE development from ROS manual code - Part 2: Model generation and leveraging models at runtime and  [SoSym paper](https://link.springer.com/article/10.1007/s10270-021-00873-2)

---------------------------------------------------------

# ROS TOOLING MANUAL

## Installation

- [(Recommended) From release version](docu/Installation.md#option-1-using-the-release-version-recommended)
- [Install the entire SeRoNet toolchain](https://www.seronet-projekt.de/plattform/tooling.html)
- [From Source code](docu/Installation.md#option-2-using-the-eclipse-installer---source-installation-ros-tooling-developers)

## Tutorials

- Create a model from your code:

  - (Prerequisite) [Add communication objects](docu/NewCommunicationObjects.md)
  - [Create a ROS model from your source code(static code analyzer)](docu/NewRosModel.md)
  - [Create a ROS model from a deployed robot using our introspection at runtime tool](docu/Introspection.md)
  - [Create new ROS components](docu/NewProject.md)
  - [Generation of code from models](docu/CodeGeneration.md)
  - [Parameters definition](docu/Parameters.md)

- Combine components to form a ROS System

  - [Define using the tooling a ROS system as a composition of components](docu/NewSystem.md)
  - [Create a ROS system model from your source code (static code analyzer)](docu/NewRosModel.md)
  - [System Model extraction using introspection at runtime](https://github.com/ipa-led/ros_graph_parser)

- Features

  - [Compare your model with a Specification](docu/CompareSpec.md)
  - [Introspection at design time](docu/simulateRuntime.md)
  - [Models combination](docu/ModelCombine.md)
  - Interoperability with other frameworks:
    - [Connect your ROS project with SeRoNet](docu/ROSSeRoNet.md)

- [Update Release versions (only for administrators)](docu/Release.md)

## Model examples

The [ros-model-experiments](https://github.com/ipa-nhg/ros-model-experiments/) repository holds some examples of models auto-generated using the tooling and its facilities.
