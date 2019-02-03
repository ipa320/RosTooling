## Create a new Rossystem composing existing components

Please be sure that the tool is installed and your workspace setup, see the [installation guide](../README.md) for further details.

Import the example project scan_system_demo (under the "examples" folder of this repository) to the workbench of your application:

```
scan_system_demo
```

To create a new system you have to press the button "Add new Ros System"

![alt text](images/add_new_system.png)

A dialog will be open and ask you to select a folder to contain your new model, you can just select the "scan_system_demo" folder.

To modify easily the model you can use a Sirius representation. Open the file representation.aird with the Aird editor and in the menu representations choose the "RosSystem" option and press "New.." then choose the Ros System entity of your "*.rossystem" model and press finish.

A new window will appear where you can choose and add elements by selecting them on the side toolbar and the properties view. With the toolbar you can add a new component. Press the option "New component", a window will be openned and ask for a new name for you component

![alt text](images/new_component_side_bar.png)

Give a name and (optionally) a namespace to a new component, for example:

![alt text](images/new_component1.png)

Press the button "Browse.." and select the model "sick_s300.ros" of the rosnode folder. Repeat the previous process for the creation of other tree components:

```
Name: base_laser_left
NameSpace: base_laser_left
RosModel: rosnodes/sick_s300.ros
```

```
Name: base_laser_right
NameSpace: base_laser_right
RosModel: rosnodes/sick_s300.ros
```

```
Name: scan_unifier
NameSpace: 
RosModel: rosnodes/scan_unifier.ros
```

Now that the components are created you can define the desired connections between the components using the tool "Topic Connection", the only imposed rule to create connections is that the information object (message or service type) is the same on both sides. For our exmaple the natural connection to be created are the shown on the following figure:

![alt text](images/rossystem_withconnections.png)

If the modifications are correct and after save the changes, two files will be automatically generated 1) a componentinterface file of your full system in the folder "components" and 2) a launch file to start the selected ROS nodes in the correct predefined Namespace (in a new folder "src-gen").

