# Messages, services and actions generator

### Autogeneration tools

For the autogeneration of of model objects we facilitate a bash (:bangbang::bangbang: this method requires a local ROS installation):

```
source /your_ROS_workspace
wget https://raw.githubusercontent.com/ipa320/RosCommonObjects/YamlFormat/de.fraunhofer.ipa.ros.communication.objects/basic_msgs/generate_messages_model_helper.sh
chmod +x generate_messages_model_helper.sh
./generate_messages_model_helper.sh ROS_PACKAGE_NAME > ROS_PACKAGE_NAME.ros
```

The file generated, independently of the method, will have a *.ros* extension and can be copied to the folder "basic_msgs" of the "de.fraunhofer.ipa.ros.communication.objects" project, please send us a pull request to our [repository](https://github.com/ipa320/RosCommonObjects.git) with your models to include them to the base dictionary automatically. Alternatively, for cases where the messages types are specific for a concrete component (like the ur_msgs for ur_driver or messages types defined within the same repository that the node). We recommended to follow the same approach that ROS does, define the communication objects models together with the node description, for our tooling that means copy the file to the project that will be created on the next step for your node description.

### ROS communication objects model language grammar

To modify the ROS models (.ros) manually the ROS tooling provides a customized editor which should be the default option to open the .ros extension files, otherwise it can be selected manually by a right click on the *MyFile.ros* file and choose *"Open with.."* and *"ROS Editor"*).

This editor contains an autocomplete function (by pressing Ctrl+Space) and will report any error made by editing. The first step is define a PackageSet (that correspond to a metapackage for ROS, this definition is optional and its name can be kept empty). Then, the ROS package which contains the msgs have to be defined and within it the option "spec" have to be selected to write down the objects. In the practice that means that the initial *.ros file that describes ROS objects looks:

```
ros_package_name:
  msgs:
    msg_name
      message
        type name
```

The grammar supports 3 types of communication objects messages, services and actions, and consequentially each of these 3 types support different specifications types:

- ROS msgs

```
ros_package_name:
  **msgs:**
    msg_name
      **message**
        ElementType ElementName
```

For example:
```
std_msgs:
  msgs:
    ColorRGBA
      message
        float32 r
        float32 g
        float32 b
        float32 a
```

- ROS srvs

```
ros_package_name:
  **srvs:**
    srv_name
      **request**
        ElementType ElementName
      **response**
        ElementType ElementName
```

For example:
```
std_srvs:
  srvs:
    SetBool
      request
        bool data
      response
        bool success
        string message
```


- ROS actions

```
ros_package_name:
  **actions:**
    action_name
      **goal**
        ElementType ElementName
      **result**
        ElementType ElementName
      **feedback**
        ElementType ElementName
```

For example:
```
control_msgs:
  actions:
    PointHead
      goal
        'geometry_msgs/msg/PointStamped'[] target
        'geometry_msgs/msg/Vector3'[] pointing_axis
        string pointing_frame
        'builtin_interfaces/msg/Duration'[] min_duration
        float64 max_velocity
      result
      feedback
        float64 pointing_angle_error
```

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
  - 'ROSPackage_name/NameOftheObject' (if it is described in other ROS package) -> for example **'geometry_msgs/Point32'**

- Arrays of element types:
  - ElementType[] -> for example **string[]** or **Point32[]** or **'geometry_msgs/Point32'[]**


Additionally the definition of constants with its value is also supported and follows a patter very similar to the ROS one: ```constanttype1 CONSTANTNAME1=constantvalue1```, for example ```byte OK=0 byte WARN=1 byte ERROR=2 byte STALE=3```.

The following extract shows the ROS model description correspondent to the [nav_msgs](http://wiki.ros.org/nav_msgs) package:

```
nav_msgs:
  msgs:
    Path
      message
        'std_msgs/msg/Header'[] header
        'geometry_msgs/msg/PoseStamped'[] poses
    OccupancyGrid
      message
        'std_msgs/msg/Header'[] header
        'nav_msgs/msg/MapMetaData'[] info
        int8[] data
    Odometry
      message
        'std_msgs/msg/Header'[] header
        string child_frame_id
        'geometry_msgs/msg/PoseWithCovariance'[] pose
        'geometry_msgs/msg/TwistWithCovariance'[] twist
    GridCells
      message
        'std_msgs/msg/Header'[] header
        float32 cell_width
        float32 cell_height
        'geometry_msgs/msg/Point'[] cells
    MapMetaData
      message
        'builtin_interfaces/msg/Time'[] map_load_time
        float32 resolution
        uint32 width
        uint32 height
        'geometry_msgs/msg/Pose'[] origin
  srvs:
    SetMap
      request
        'nav_msgs/msg/OccupancyGrid'[] map
        'geometry_msgs/msg/PoseWithCovarianceStamped'[] initial_pose
      response
        bool success
    LoadMap
      request
        string map_url
      response
        'nav_msgs/msg/OccupancyGrid'[] map
        uint8 result
    GetPlan
      request
        'geometry_msgs/msg/PoseStamped'[] start
        'geometry_msgs/msg/PoseStamped'[] goal
        float32 tolerance
      response
        'nav_msgs/msg/Path'[] plan
    GetMap
      request
      response
        'nav_msgs/msg/OccupancyGrid'[] map
```
:bangbang::bangbang: This model doesn't allow the creation of 2 specification with the same name, although they have different types. That means a ROS model like the following one is not allow:

```
my_msgs:
  msgs:
   hello:
    message
     String data 
  srvs:
   hello
     request
     response
      String data
```
The reason is that when one of these objects have to be referenced during the definition of a node it will be imposible for the model to distinguish which is the correct one (both are defined as my_msgs/Hello and whitin the dame model file). For these cases we recommend to split the objects into two different model files.

The repository [RosCommonObjects](https://github.com/ipa320/RosCommonObjects) holds further examples.
