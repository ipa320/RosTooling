# Ros Model

[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) - **nadia.hammoudeh.garcia@ipa.fraunhofer.de**

1. <a href="#1--intro">Introduction</a>
2. <a href="#2--installation-requirements">Installation Requirements</a>
3. <a href="#3--start">Setup the work environment and start the software</a>


## Introduction <a id="1--intro"/>

This repository holds a family of models and its eclipse plugins to start MDE tools and:
- Define ROS nodes as a structured model that impose the use of ROS Best Practices
- Compose ROS nodes and define the runtime namespaces to start the nodes
- Validate the composition by checking at design time the future runtime connections
- Autogeneration of a launch file with the remaps and namespaces tags needed to ensure the communication

For all the steps graphical editors and wizards are available to guide the user.

The description of a ROS system is divided into 3 metamodels:

-**ROS Metamodel**: A model that encapsule all the ROS basic concepts: filesystem level, computational graph and deployment mechanisms. This model is completed with a Xtext grammar to enforce the use of standard and existing ROS mesages and assurance the use of ROS naming conventions. 

-**Component Interface Metamodel**: Adaptation of the concept of Component Interface of the OMG specification standard [Deployment and Configuration of Component-based Distributed Applications](https://www.omg.org/spec/DEPL/About-DEPL/) from a ROS node. This concept enables the use of the same model to describe monolithic ROS nodes and large ROS systems and 1) simplifies the deployment process of ROS systems (by composing sub-systems) and 2) facilitates the interconnection of a ROS application with other component-based architecture frameworks.


-**System Metamodel**: This metamodel allow the definition of a System (as a composition of Component Interfaces) and the conections between them. The tool validates at-design time the connections by evaluating 1) the no disparity of communication objects (messages or services) and 2) the no disparity of topics or services names.


## Installation and setup requirements <a id="2--installation-requirements"/>

Download the official [Eclipse Oxygen Installer](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/oxygen/R2/eclipse-inst-linux64.tar.gz) and choose the *Eclipse Modeling tools* package.

Once Eclipse is installed go to the menu *Help* and open the *Eclipse Marketplace* to install the packages:
```
Sirius (version 6)
Eclipse Xtext (version 2.15)
Eclipse Xtend (version 2.15)
```

## Setup the work environment and start the software <a id="3--start"/>

#### Setup the environment and start the eclipse application

1.  Download the project into your local:
```
git clone https://github.com/ipa-nhg/ros-model.git
```
2. Open Eclipse and create a new workspace

3. Import below projects (under the "plugins" folder of this repository) into the new workspace (File -> Import -> General -> Existing projects)

```
de.fraunhofer.ipa.componentInterface
de.fraunhofer.ipa.componentInterface.edit
de.fraunhofer.ipa.componentInterface.editor
de.fraunhofer.ipa.componentInterface.xtext
de.fraunhofer.ipa.componentInterface.xtext.ide
de.fraunhofer.ipa.componentInterface.xtext.ui
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.xtext
de.fraunhofer.ipa.ros.xtext.ide
de.fraunhofer.ipa.ros.xtext.ui
de.fraunhofer.ipa.ros.sirius
de.fraunhofer.ipa.rossystem
de.fraunhofer.ipa.rossystem.edit
de.fraunhofer.ipa.rossystem.editor
de.fraunhofer.ipa.rossystem.xtext
de.fraunhofer.ipa.rossystem.xtext.ide
de.fraunhofer.ipa.rossystem.xtext.ui

```
4. Start a new eclipse application by either
* de.fraunhofer.ipa.ros.sirius > plugin.xml and click *Launch an Eclipse application* or 
* *right click* de.fraunhofer.ipa.ros.sirius and *click* on Run As > Eclipse Application

5. Import the common communication objects project (under the "examples" folder of this repository) to the workbench of your application:
```
de.fraunhofer.ipa.ros.communication.objects
```

Now that your workspace is setup and the eclipse application running you can start creating your project and defining your ROS system

![alt text](docu/images/eclipse_app_empty.png)

