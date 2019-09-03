# Messages, services and actions generator


:bangbang::bangbang: This tutorial requires a local ROS installation

A new communication object for the ROS tooling can only be generated if the interface already exists in ROS, consequently this tool requires a local ROS installation. 

Source the ROS workspace that contains the packages where the ros messages, services or actions are defined. For example:

```
source /opt/ros/kinetic/setup.bash
```

Call the script giving as argument the name of the ROS package and save the output of the script as a ros file:

```
bash ros-model/tools/generate_messages_model_helper.sh *PACKAGE_NAME* > ros-model/examples/de.fraunhofer.ipa.ros.communication.objects/basic_msgs/*PACKAGE_NAME*.ros
```
