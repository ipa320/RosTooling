# Ros Model

[![License](https://img.shields.io/badge/License-BSD%203--Clause-blue.svg)](https://opensource.org/licenses/BSD-3-Clause)

[![Build](https://travis-ci.org/ipa320/ros-model.svg?branch=master)](https://travis-ci.org/ipa320/ros-model) (Travis CI)

Technical Maintainer: [**ipa-nhg**](https://github.com/ipa-nhg/) (**Nadia Hammoudeh Garcia**, **Fraunhofer IPA**) - **nadia.hammoudeh.garcia@ipa.fraunhofer.de**

This repository holds a family of metamodels defined as ecore models that together with its java and Xtext and Xtend grammar implementations facilitates the use of a set of tools and graphical plugins to create models from ROS code, compose and validate the composition of models, autogenerate deployment artifacts and check the use of standard specifications.

For further information about the metamodels, please check the [IRC19 paper](https://ieeexplore.ieee.org/document/8675668)

### Installation

#### Option 1: Using the Release version (Recommended)

In Eclipse, go to *Help* > *Install New Software...*. To install the latest version of the ROS tooling, add the update site URL [http://ros-model.seronet-project.de/updatesite/latest/](http://ros-model.seronet-project.de/updatesite/latest/) in the *Work with* section. If you wish to install an earlier version instead, go to the [the update site](http://ros-model.seronet-project.de/updatesite/), choose the desired version and copy its URL.

![alt text](docu/images/install_updatesite.png)

The category *ROS Model* appears in the *Name* area. Check the box in front of *ROS model* and click *Next* to review the list of items to be installed. Click *Next* again to read and accept the terms of the license agreements and afterwards click *Finish*. Eclipse will then start to install the ROS tooling and its dependencies. If you get a security warning about the authenticity, click OK. Finally, when asked, restart Eclipse to complete the installation process.

To start using the ROS tooling continue with the [step 1](#1-switch-to-the-ros-developer-perspective)

#### Option 2: Using the Eclipse Installer - Source installation (ROS tooling developers)

Download the official [Eclipse Installer](https://www.eclipse.org/downloads/packages/installer) for your preferred operating system. Execute the installer and choose the advanced mode (menu on the right-up corner). Select the Product *Eclipse Modeling tools* package, for the version it is recommended use *2018-12*.

![alt text](docu/images/eclipse_installer1.png)

Press *Next* and add a new *User project* pressing the green button *+*:
```
Catalog: Github Projects
Resource URIs: https://raw.githubusercontent.com/ipa320/ros-model/master/EclipseInstaller/ROSModel.setup
```
![alt text](docu/images/eclipse_installer2.png)

Select the the ROS Model project (under Github Projects -> <User>) and press next. 

By default the ROS tooling installation will be saved under the folder *ros-model-master* in your home directory. In case your github credentials are not setup on your machine, change the *Ros model Github repository* to the *HTTPs(read-write)* option.

Follow the installation instructions of the Oompth installer dialog, after the installation eclipse will be restarted to launch the ROS tooling configuration. Finally, when all the startup tasks finished press "Workbench".

To start using the ROS tooling continue with the [step 0](#0-start-the-ros-tooling-application)

### Setup the environment and start the eclipse application

#### 0: Start the ROS tooling application

:bangbang::bangbang: This is only needed if you installed the toolig from [source](#option-2-using-the-eclipse-installer---source-installation-ros-tooling-developers), if you installed the release version please continue directly with the [step 1](#1-switch-to-the-ros-developer-perspective)

select de.fraunhofer.ipa.ros.plugin and press the button *Run*

![alt text](docu/images/run_ros_tooling.png)

#### 1: Switch to the ROS Developer perspective

Go to Menu Window -> Perspective -> Open Perspective -> Other... -> ROS developer. Your application toolbar will be automatically configured.

#### 2: Import the common communication objects project

import the project located under the "examples" folder of this repository to the workbench of your application:
```
de.fraunhofer.ipa.ros.communication.objects
```
Now that your workspace is setup, you can start creating your [project and defining your ROS system](#Tutorials)

![alt text](docu/images/eclipse_app_empty.png)

## Tutorials

* [Create new ROS projects and define ROS nodes](docu/NewProject.md)
* [Create a ROS model from cpp code](docu/NewRosModel.md)
* [Generation of code from models](docu/CodeGeneration.md)
* [Define a ROS system as a composition of components](docu/NewSystem.md)
* [Compare your model with a Specification](docu/CompareSpec.md)
* [Add communication objects](docu/NewCommunicationObjects.md)
* [Model extraction using introspection at runtime](https://github.com/ipa-led/ros_graph_parser)
* [Introspection at design time](docu/simulateRuntime.md)

## Model examples

The [ros-model-experiments](https://github.com/ipa-nhg/ros-model-experiments/) reposirory holds some examples of models autogenerated using the tooling and its facilities.

## Update Release versions (only for administrators)

### 1. Update version

Run the command:

```
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=X.Y.0-SNAPSHOT -f plugins/de.fraunhofer.ipa.ros.parent/
```

This will upgrade the *pom.xml* and *MANIFEST.MF* of all the repositories.

### 2. Synchronize the ROS fetuare

Open in eclipse the file *de.fraunhofer.ipa.ros.feature/feature.xml* and under *Overview* press the button *Synchronize* and choose the second option *Copy versions from plug-in, feature and fragment manifest*

![alt text](docu/images/sync_feature.png)


Push to this GitHub repository the status

### 3. Export the updated feature

From the menu *File* select *Export* and choose the option *Deployable features* from *Plug-in Development* category. Select the *de.fraunhofer.ipa.ros.feature* Feature and give a path for destination (e.g. ~/Desktop/export)

The resulted folders and files have to be copied to the *updatesite/latest* folder fo the [Update Site server](http://ros-model.seronet-project.de/updatesite/latest/)

### 4. Add a new release on GitHub

Tag the current point of the history with the release number previously given (X.Y.0). Optionally upgrade the [exported files](#3-export-the-updated-feature) as a zip.

