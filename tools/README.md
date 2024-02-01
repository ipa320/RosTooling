## Ros model tools

1. <a href="#messages-services-and-actions-generator">Messages, services and actions generator</a>
2. <a href="#model-extractor-using-static-code-analysis">Model extractor using static code analysis</a>


## Messages, services and actions generator

A new communication object for the ROS tooling can only be generated if the interface already exists in ROS, consequently this tool requires a local ROS installation.

Source the ROS workspace that contains the packages where the ros messages, services or actions are defined. For example:

```
source /opt/ros/kinetic/setup.bash
```

Call the script giving as argument the name of the ROS package and save the ouput of the script as a ros file:

```
bash ros-model/tools/generate_messages_model_helper.sh *PACKAGE_NAME* > ros-model/ROSCommonObjects/de.fraunhofer.ipa.ros.communication.objects/basic_msgs/*PACKAGE_NAME*.ros
```

## Model extractor using static code analysis

### Using a ready-to-use docker container:
[DOCKER](docker/README.md)

### Manually with a HAROS local installation:
To extract the ROS model of a node we use the framework [HAROS](https://github.com/git-afsantos/haros).

Install HAROS using the following command:
```
[sudo] apt-get install cppcheck cccc libclang-3.8-dev
[sudo] pip install -e git+https://github.com/timtadh/pyflwor.git#egg=pyflwor
[sudo] pip install -Iv clang==3.8
export LD_LIBRARY_PATH=$LD_LIBRARY_PATH:/usr/lib/llvm-3.8/lib
[sudo] pip install haros
haros init
```
For further information and alternative installation methods please see: [HAROS installation](https://github.com/git-afsantos/haros#installation)

Install bonsai:
```
[sudo] pip install bonsai-code
```

Create your ROS workspace and clone the repository that contains the ROS code:
```
mkdir -p ~/haros/catkin_ws/src
cd ~/haros/catkin_ws/src
source /opt/ros/kinetic/setup.bash
catkin_init_workspace
git clone https://github.com/*GithubAccount*/*ROSRepository*
cd ~/haros/catkin_ws
catkin_make -DCMAKE_EXPORT_COMPILE_COMMANDS=1 -DCMAKE_CXX_COMPILER=/usr/bin/clang++-3.8
source ~/haros/catkin_ws/devel/setup.bash
```
Check the file **~/haros/catkin_ws/build/compile_commands.json** exists , if not:
```
cd ~/haros/catkin_ws/build
cmake -DCMAKE_EXPORT_COMPILE_COMMANDS=1 -DCMAKE_CXX_COMPILER=/usr/bin/clang++-3.8 ../src
```

Call the ROS model extractor tool:
```
python ros-model/tools/ros_model_extractor.py --package *RosPackageName* --name *RosNodeName* --node
```
A new "RosNodeName.ros" file will be created in your current folder.
