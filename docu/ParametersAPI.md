## Parameters API

The types of parameters supported by the ROS tooling are the following:

* Boolean (true or false)
* Integer 
* Double
* String
* Base64
* List 
* Array
* Struct

and their description is allowed at ROS and ROSSystem model level. 

For the complete definition of parameters the user has to open the ROS model editor, where the language format is the following:
```
**parameters:**
  ParameterName:
    **type:** ParameterType
    **value:** ParameterValue
```

For example (for a .ros2 file):

```
test_parameters:
  artifacts: 
    test_parameters:
      node: params_example 
      parameters:
        string_test:
          type: String
        bool_test:
          type: Boolean
        array_test:
          type: Array [String]
        base64_test:
          type: Base64
        double_test:
          type: Double
        integer_test:
          type: Integer
        list_test:
          type: List [Integer,Integer,String]
        array_test:
          type: Array [String]
        struct_test:
          type: Struct [hello Integer, what String]
```

These parameters can be re-set at Rossystem level (that means for ROS developers, the case of the set of a new parameter value within a node include on a ROS launch file). For the tooling the format is the following:

```
- ParameterName : ParameterReferenceInRos2File
  **value:** ParameterValue
```

Continuing the previous example, the parameters redefinition looks:

```
test:
  nodes:
    params_node:
      from: "test_parameters.params_example"
      parameters:
        - test_s : "test_parameters::string_test"
          value: "hello"
        - test_b : "test_parameters::bool_test"
          value: true
        - test_d : "test_parameters::double_test"
          value: 1.1
        - test_i : "test_parameters::integer_test"
          value: 1
        - test_l: "test_parameters::list_test"
          value: [1,1,"hello"]
        - test_a:  "test_parameters::array_test"
          value: ["hello", "hola", "hallo"]
        - test_st: "test_parameters::struct_test"
          value: [
            hello: 1 
            what: "test"]
```
The model definition of parameters is also consider for the autogeneration of launch files and the component interfaces. Complementarily, and because of the complexity of the format, the .ros, the .componentinterface and the .rossystem language validators contain rules to check that the value given to the parameter has the correct type and also help messages that together with the auto-complete function (Ctrl+Space) facilitate to the user the creation of parameters.

