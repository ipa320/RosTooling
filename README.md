# Ros Model

1. <a href="#RosArtifactProject">Create a ROS Model project</a>
2. <a href="#RosSRGatewayProject">Create a Component Interface for your ROS Model</a>
3. <a href="#RosSystem">Create a RosSystem</a>
4. <a href="#Examples">Use the existing example</a>


1. Create a new and clean Workspace

2. File -> Import -> General -> Existing projects into Workspace:

```
de.fraunhofer.ipa.componentInterface
de.fraunhofer.ipa.componentInterface.edit
de.fraunhofer.ipa.componentInterface.editor
de.fraunhofer.ipa.componentInterface.xtext
de.fraunhofer.ipa.componentInterface.xtext.ide
de.fraunhofer.ipa.componentInterface.xtext.ui
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.sirius
de.fraunhofer.ipa.rossystem
de.fraunhofer.ipa.rossystem.edit
de.fraunhofer.ipa.rossystem.editor
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.xtext
de.fraunhofer.ipa.ros.xtext.ide
de.fraunhofer.ipa.ros.xtext.ui

```

3. Start a new eclipse application by either (de.fraunhofer.ipa.ros.sirius -> plugin.xml and click *Launch an Eclipse application*) or (*right click* de.fraunhofer.ipa.ros.sirius and *click* on Run As > Eclipse Application)


#### Create a ROS artifact project <a id="RosArtifactProject"/>

1. Import the common communication objects project to the workbench of your application:
```
de.fraunhofer.ipa.ros.communication.objects
```
3. Create a new ROS model project (menu File > New > Other > ROS Model project)

4. Once the project is created, open the *representations.aird* file and add a new representation for your Ros artifact

Use the palette toolbar to add a new node, to configure your model use also the *Properties* view (if it is disabled go to *Window* > *Show view* > *Other* and choose *Properties*). 

#### Create a Component Interface for your ROS Model <a id="RosSRGatewayProject"/>

1. Create a new ComponentInterface model (menu File > New > Other > ComponentInterface Model)

2. Open the model with the ComponentInterface Model Editor

3. Add your ros model as resource for the ComponentInterface ( *right click* and *click* on "Load resource.." and select the path of your model)

4. Use the *Properties* view to configure the component


#### Create a RosSystem <a id="RosSystem"/>

1. Create a new Rossystem model (menu File > New > Other > Rossystem Model)

2. Open the model with the ComponentInterface Model Editor

3. Add your Component Interfaces as resources for the ComponentInterface ( *right click* and *click* on "Load resource.." and select the path of your models)

4. Open the *represenation.aird* file with the Aird Editor and enable the representation of ROSSystem models

 Use the *Properties* view to configure the system
 
 
#### Use the existing example <a id="Examples"/>
 
1. Import the common communication objects project to the workbench of your application:
```
care-o-bot
```
 
