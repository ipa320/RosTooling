# Installation and setup

### Option 1: Using the Release version (Recommended)

First the java environment have to be setup:

```
sudo apt-get install openjdk-19-jre
```

Then Eclipse can be installes. Please download the installer from the official eclipse [website](https://www.eclipse.org/downloads/packages/installer). Once you start the installer, select the package "Eclipse Modeling Tools".

![alt text](images/install_eclipse_modeling.png)

Press next, and then pick the java version 19 and the folder where you would like to install eclipse.

![alt text](images/install_eclipse_jdk_version.png)

Continue the installation, acepting the license, as usual.

Once the installation is completed, go to *Help* > *Install New Software...*. To install the latest version of the ROS tooling, add the update site URL [https://raw.githubusercontent.com/ipa320/RosTooling-update-site/2.0.0](https://raw.githubusercontent.com/ipa320/RosTooling-update-site/2.0.0)(*) in the *Work with* section.

![alt text](images/install_updatesite.png)

If none package is listed, please uncheck the option *Group items by category*. The category *ROS Model* appears in the *Name* area. Check the box in front of *ROS model* and click *Next* to review the list of items to be installed. Click *Next* again to read and accept the terms of the license agreements and afterwards click *Finish*. Eclipse will then start to install the ROS tooling and its dependencies. If you get a security warning about the authenticity, click OK. Finally, when asked, restart Eclipse to complete the installation process.

To start using the ROS tooling continue with the [step 1](#1-switch-to-the-ros-developer-perspective)

### Option 2: Using the Eclipse Installer - Source installation (ROS tooling developers)

First the java environment have to be setup, for eclipse it is recomended the installation of the version 8 (i.e. X=8) for Ubuntu 16.04 and 11 (i.e. X=11) for the 18.04 and 20.04:
```
sudo apt-get install openjdk-11-jre
```
Download the official [Eclipse Installer](https://www.eclipse.org/downloads/packages/installer) for your preferred operating system. Execute the installer and choose the advanced mode (menu on the right-up corner). Select the Product *Eclipse Modeling tools* package, for the version it is recommended *2021-12*.

![alt text](images/eclipse_installer1.png)

Press *Next* and add a new *User project* pressing the green button *+*:
```
Catalog: Github Projects
Resource URIs: https://raw.githubusercontent.com/ipa320/ros-model/master/EclipseInstaller/ROSModel.setup
```
Sometimes eclipse is not able to find the file, for those cases we recommend to download the file to the local memory of the machine and import it:

```
wget https://raw.githubusercontent.com/ipa320/ros-model/master/EclipseInstaller/ROSModel.setup
```

![alt text](images/eclipse_installer2.png)

Select the the ROS Model project (under Github Projects -> <User>) and press next. 

By default the ROS tooling installation will be saved under the folder *ros-model-master* in your home directory. To ensure that you have access to get the source code from GitHub, select the check box *Show all variable* and change the *Ros model Github repository* to the *HTTPs(read-write)* option, verify that the option *Github user ID* is set to "anonymous". 

![alt text](images/eclipse_installer3.png)

Follow the installation instructions of the Oompth installer dialog, after the installation eclipse will be restarted to launch the ROS tooling configuration. Finally, when all the startup tasks finished press "Workbench".

To start using the ROS tooling continue with the [step 0](#0-start-the-ros-tooling-application)

# Setup the environment and start the eclipse application

### 0: Start the ROS tooling application

:bangbang::bangbang: This is only needed if you installed the toolig from [source](#option-2-using-the-eclipse-installer---source-installation-ros-tooling-developers), if you installed the release version please continue directly with the [step 1](#1-switch-to-the-ros-developer-perspective)

select de.fraunhofer.ipa.ros.plugin and press the button *Run*

![alt text](images/run_ros_tooling.png)

### 1: Switch to the ROS Developer perspective

Go to Menu Window -> Perspective -> Open Perspective -> Other... -> ROS developer. Your application toolbar will be automatically configured.

### 2: Import the common communication objects project

import the project located under the "ROSCommonObjects" folder of this repository to the workbench of your application:
```
de.fraunhofer.ipa.ros.communication.objects
```

If you have internet a button can clone from GitHub the objects to your workspace and import them automatically:

![alt text](images/clone_and_import.png)

Now that your workspace is setup, you can start creating your [project and defining your ROS system](#Tutorials)
