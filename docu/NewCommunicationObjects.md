# Messages, services and actions generator

### Autogeneration tools

We facilitate a couple of tools to auto generate the corresponding model (these tools work only for messages and services, the action types, in the majority of the cases, have to be unfortunately implemented manually):

- Use our cloud facilities : [ROS Model Extractor](http://ros-model.seronet-project.de/) and navigate to the tag "Specification Analysis". There, if the package that contains the message types is released for Melodic you just have to give the name of the package and press **Submit**. Otherwise please specify first the name of the Git repository that hold the package

- Use locally the helper script (:bangbang::bangbang: this method requires a local ROS installation):

```
source /your_ROS_workspace
wget https://raw.githubusercontent.com/ipa320/ros-model-cloud/master/extractor-interface/scripts/generate_messages_model_helper.sh
chmod +x generate_messages_model_helper.sh
./generate_messages_model_helper.sh ROS_PACKAGE_NAME > ROS_PACKAGE_NAME.ros
```

The file generated, independently of the method, will have a *.ros* extension and can be copied to the folder "basic_msgs" of the "de.fraunhofer.ipa.ros.communication.objects" project, please send us a pull request to our [repository](https://github.com/ipa320/RosCommonObjects.git) with your models to include them to the base dictionary automatically. Alternatively, for cases where the messages types are specific for a concrete component (like the ur_msgs for ur_driver or messages types defined within the same repository that the node). We recommended to follow the same approach that ROS does, define the communication objects models together with the node description, for our tooling that means copy the file to the project that will be created on the next step for your node description.

### ROS communication objects model language grammar

To modify the ROS models (.ros) manually the ROS tooling provides a customized editor which should be the default option to open the .ros extension files, otherwise it can be selected manually by a right click on the *MyFile.ros* file and choose *"Open with.."* and *"ROS Editor"*).

This editor contains an autocomplete function (by pressing Ctrl+Space) and will report any error made by editing. The first step is define a PackageSet (that correspond to a metapackage for ROS, this definition is optional and its name can be kept empty). Then, the ROS package which contains the msgs have to be defined and within it the option "spec" have to be selected to write down the objects. In the practice that means that the initial *.ros file that describes ROS objects looks:

```
PackageSet { package {  CatkinPackage ros_package_name {
    spec {}
}}}
```

The grammar supports 3 types of communication objects TopicSpec (to describe ROS msgs), ServiceSpec (to describe ROS srvs) and ActionSpec (to describe ROS actions), and consequentially each of these 3 types support different specifications types:

- ROS msgs

  **TopicSpec** SpecName { **message** { ElementType ElementName ... } }

  ​     -> Example ```TopicSpec Point{ message { float64 x float64 y float64 z }}```

- ROS srvs

  **ServiceSpec** SpecName { **request** { ElementType ElementName ..} **response** { ElementType ElementName .. } }

  ​     -> Example  ```ServiceSpec SetBool{ request { bool data } response { bool success string message } }```

- ROS actions

  **ActionSpec** SpecName { **goal** { ElementType ElementName .. } **result** { ElementType ElementName ..} **feedback** { ElementType ElementName .. }}

  ​     -> Example ```ActionSpec Say { goal  { string test } result { bool sucess string message} feedback {} }```

Where , quite similar to ROS, the allowed element types are:

- Primitives:
  - bool
  - int8
  - uint8
  - int16
  - uint16
  - int32
  - uint32
  - int64
  - uint64
  - float32
  - float64
  - string
  - time
  - Header

- Relative reference to other object:
  - NameOftheObject (if it is described within the same ROS package) -> for example **Point32**
  - 'ROSPackage_name.NameOftheObject' (if it is described in other ROS package) -> for example **'geometry_msgs.Point32'**

- Arrays of element types:
  - ElementType[] -> for example **string[]** or **Point32[]** or **'geometry_msgs.Point32'[]**


Additionally the definition of constants with its value is also supported and follows a patter very similar to the ROS one: ```constanttype1 CONSTANTNAME1=constantvalue1```, for example ```byte OK=0 byte WARN=1 byte ERROR=2 byte STALE=3```.

The following extract shows the ROS model description correspondent to the [nav_msgs](http://wiki.ros.org/nav_msgs) package:

```
PackageSet {
    Package nav_msgs{ Specs {
      TopicSpec GetMapAction{ message { GetMapActionGoal action_goal GetMapActionResult action_result GetMapActionFeedback action_feedback }},
      TopicSpec GetMapActionFeedback{ message { Header header "actionlib_msgs.GoalStatus" status GetMapFeedback feedback }},
      TopicSpec GetMapActionGoal{ message { Header header "actionlib_msgs.GoalID" goal_id GetMapGoal goal }},
      TopicSpec GetMapActionResult{ message { Header header "actionlib_msgs.GoalStatus" status GetMapResult result }},
      TopicSpec GetMapFeedback{ message {  }},
      TopicSpec GetMapGoal{ message {  }},
      TopicSpec GetMapResult{ message { "nav_msgs.OccupancyGrid" map }},
      TopicSpec GridCells{ message { Header header float32 cell_width float32 cell_height "geometry_msgs.Point"[] cells }},
      TopicSpec MapMetaData{ message { time map_load_time float32 resolution uint32 width uint32 height "geometry_msgs.Pose" origin }},
      TopicSpec OccupancyGrid{ message { Header header MapMetaData info int8[] data }},
      TopicSpec Odometry{ message { Header header string child_frame_id "geometry_msgs.PoseWithCovariance" pose "geometry_msgs.TwistWithCovariance" twist }},
      TopicSpec Path{ message { Header header "geometry_msgs.PoseStamped"[] poses }},
      ServiceSpec GetMap{ request {  } response { "nav_msgs.OccupancyGrid" map } },
      ServiceSpec GetPlan{ request { "geometry_msgs.PoseStamped" start "geometry_msgs.PoseStamped" goal float32 tolerance } response { "nav_msgs.Path" plan } },
      ServiceSpec SetMap{ request { "nav_msgs.OccupancyGrid" map "geometry_msgs.PoseWithCovarianceStamped" initial_pose } response { bool success } }
    }}
}}
```
:bangbang::bangbang: This model doesn't allow the creation of 2 specification with the same name, although they have different types. That means a ROS model like the following one is not allow:

```
PackageSet {
    Package my_msgs { Specs {
      TopicSpec hello { message { String data }},
      ServiceSpec hello { request {  } response { String data }},
    }}
}}
```
The reason is that when one of these objects have to be referenced during the definition of a node it will be imposible for the model to distinguish which is the correct one (both are defined as my_msgs.Hello and whitin the dame model file). For these cases we recommend to split the objects into two different model files.

The repository [RosCommonObjects](https://github.com/ipa320/RosCommonObjects) holds further examples.
