## Create a ROS model from a deployed robot using our introspection at runtime tool

Please be sure that the tool is installed and your workspace setup, see the [installation guide](../README.md) for further details.

The tools documented here were conceived as a simple way to obtain models of systems already developed during their execution. This series of scripts uses the popular ROS rosgraph library to obtain a list of the interfaces present in the system at runtime. 

You can install the tools directly on your workspace using the following command:

```
mkdir -p my_catkin_ws/src
cd my_catkin_ws/src
catkin_init_workspace
rosinstall . https://raw.githubusercontent.com/ipa320/ros-model/master/docu/introspection.rosinstall
cd my_catkin_ws
catkin_make (or catkin build)
```

To start the monitoring software the snapshot node has to be started on the same machine where the software to be analysed is running:

```
source my_catkin_ws/devel/setup.bash
rosrun rosgraph_monitor rossystem_snapshot
```

This script will generate automatically a new file (.rossystem) under the folder: 'rosgraph_monitor/results'.
