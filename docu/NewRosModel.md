## Create a ROS model from your code

Please be sure that the tool is installed and your workspace setup, see the [installation guide](../README.md) for further details.

To extract the model we use static code analysis techniques, concreatelly the framework HAROS. To analyse a local ROS package you have first to install and setup [HAROS](../tools/README.md#model-extractor-using-static-code-analysis).

Once HAROS is installed and your workspace built you can invoke the extractor of ROS models from the tooling, by pressing the icon "Import ROS model":

![alt text](images/import_ros_model.png)

Choose the directory that should hold your model and press "Next >" a new dialog window will ask you for the name of the ROS package that contains your node and the name of the node. Finally you have to specify the workspace where it was build by choosing the *compile_commands.json* file. This file is allways locatd under your *catkin_ws/build* directory when you build your workspace using the make command option *-DCMAKE_EXPORT_COMPILE_COMMANDS=1*.

![alt text](images/compile_commands.png)

To check the created model open the file representation.aird with the Aird editor and in the menu representations choose the "component" option and press "New.." then choose the Artifact entity of your "*.ros" model and press finish.
