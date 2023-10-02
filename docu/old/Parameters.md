## Parameters API

The types of parameters supported by the ROS tooling are the following:

* Boolean (true or false)
* Integer
* Double
* String
* Base64
* List
* Array
* Struc

and their description is allowed at ROS and ROSSystem model level.

The definition of a parameter at ROS model level means that the ROS original node get or set a new parameter, this case is partially supported by the graphical editor, which allows only the definition of parameters of primitive types: String, Double, Integer and Boolean without a default value.

![alt text](../images/parameter_set.gif)

For the complete definition of parameters the user has to open the ROS model editor, where the language format is the following:

**Parameter** {**name** NAMEforPARAMETER **type** TYPEfromTHElistABOVE **default** DEFAULTVALUE}

This format is also valid for a ROSsystem file, case of ROS where a new parameter is created within a launch file.

For example (for a .ros file):

```
PackageSet {
  CatkinPackage test_parameters{
    Artifact  test_parameters {
      Node  { name test
         Parameters {
           Parameter { name string_test type String },
           Parameter { name bool_tets type Boolean },
           Parameter { name array_tets type Array {type String}},
           Parameter { name base64_test type Base64},
           Parameter { name double_test type Double},
           Parameter {name int_test type Integer},
           Parameter {name list_test type List {Integer,Integer,String}},
           Parameter {name struc_test type Struc
               {first_element Integer ,
               second_element List { Integer, String},
               third_element String ,
               last_element Struc { hello Integer, what String}}
           }}}
}}}
```
These parameters can be re-set at Rossystem level (that means for ROS developers, the case of the set of a new parameter value within a node include on a ROS launch file). For the tooling the format is the following:

 **RosParameter** NAMEforPARAMETER {**RefParameter** 'REFtoPARAMETERdefiniton' **value** PARAMETERVALUE}

Continuing the previous example, the parameters redefinition looks:

```
RosSystem { Name 'test_parameters_system'
  RosComponents (
    ComponentInterface {
      name test_param_component
        RosParameters {
          RosParameter {
            RefParameter "test_parameters.test_parameters.test.string_test" value test},
          RosParameter {
            RefParameter "test_parameters.test_parameters.test.bool_tets" value true },
          RosParameter {
            RefParameter "test_parameters.test_parameters.test.double_test" value 3.14 },
          RosParameter {
            RefParameter "test_parameters.test_parameters.test.base64_test" value 0b01 },
          RosParameter {
            RefParameter "test_parameters.test_parameters.test.int_test" value 5 },
          RosParameter {
            RefParameter "test_parameters.test_parameters.test.list_test" value  {1,2,test}},
          RosParameter {
            RefParameter "test_parameters.test_parameters.test.struc_test" value {
              { second_element {value{1,dsad}}},
              { last_element { value {
                 { hello {value 3} },
                 { what {value sd} }
}}}}}}})
}
```
The model definition of parameters is also consider for the autogeneration of launch files and the component interfaces. Complementarily, and because of the complexity of the format, the .ros, the .componentinterface and the .rossystem language validators contain rules to check that the value given to the parameter has the correct type and also help messages that together with the auto-complete function (Ctrl+Space) facilitate to the user the creation of parameters.
