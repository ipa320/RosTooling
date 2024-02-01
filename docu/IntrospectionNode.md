## Create a ROS model from a deployed robot using our introspection at runtime tool (for ROS 2 systems)

Please be sure that the tool is installed and your workspace setup, see the [installation guide](../README.md) for further details.

The tools documented here were conceived as a simple way to obtain models of systems already developed during their execution. This series of scripts uses the popular ROS rosgraph library to obtain a list of the interfaces present in the system at runtime.

You can install the tools directly on your workspace using the following command:

```
cd YourRos2WS/src
git clone git@github.com:ipa-nhg/ros2model.git
cd YourRos2WS
colcon build
```

To ask the monitoring module to capture all the nodes running on the system, please use the following command:

```
ros2 model running_node -ga -d ~/PathToModelsFolderOutput
```

The folder **PathToModelsFolderOutput** will contain all the model files.

For a single node, the following command can be called:
```
ros2 model running_node [-o Outputfile] <node-name>
```

For further information please check the [ros2model](https://github.com/ipa-cmh/ros2model) repository.
