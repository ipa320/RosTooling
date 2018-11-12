# Metamodeling From ROS To Systems

## Installation and setup requirements

* Download the official (Eclipse Oxygen Installer)[https://www.eclipse.org/downloads/download.php?file=/oomph/epp/oxygen/R2/eclipse-inst-linux64.tar.gz] and then choose the *Eclipse Modeling* tools package.
* Once Eclipse is installed go to the menu *Help* and open the *Eclipse Marketplace* to install the packages:
```
Sirius (version 6)
Eclipse Xtext (version 2.15)
Eclipse Xtend (version 2.15)
```

## Setup the work environment and start the software
### I. <a href="#RosArtifactProject">Create a ROS Model project</a>
### II. <a href="#RosSRGatewayProject">Create a Component Interface Metamodel for your ROS Model</a>
### III. <a href="#RosSystem">Create a System Metamodel</a>
### IV. <a href="#Examples">A motivating Example</a>

### I. Create a ROS Model project <a id="RosArtifactProject"/>

1.  Download the project into your local:
```
git clone --recursive https://github.com/ipa-nhg/ros-model.git
```
2. Open Eclipse and create a new workspace
3. Import below projects into the new workspace (File -> Import -> General -> Existing projects)

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
4. Start a new eclipse application by either
* de.fraunhofer.ipa.ros.sirius > plugin.xml and click *Launch an Eclipse application* or 
* *right click* de.fraunhofer.ipa.ros.sirius and *click* on Run As > Eclipse Application

5. Import the common communication objects project to the workbench of your application:
```
de.fraunhofer.ipa.ros.communication.objects
```
6. Create a new ROS model project (Menu > File > New > Other > ROS Model project)

7. Once the project is created, open the *representations.aird* file and add a new representation for your Ros artifact

Use the palette toolbar to add a new node, to configure your model use also the *Properties* view (if it is disabled go to *Window* > *Show view* > *Other* and choose *Properties*).

### II. Create a Component Interface Metamodel for your ROS Model <a id="RosSRGatewayProject"/>

1. Create a new ComponentInterface model (Menu > File > New > Other > ComponentInterface Model)

2. Open the model with the ComponentInterface Model Editor

3. Add your ros model as resource for the ComponentInterface ( *right click* and *click* on "Load resource.." and select the path of your model)

4. Use the *Properties* view to configure the component

### III. Create a System Metamodel <a id="RosSystem"/>

1. Create a new Rossystem model (Menu > File > New > Other > Rossystem Model)

2. Open the model with the ComponentInterface Model Editor

3. Add your Component Interfaces as resources for the ComponentInterface ( *right click* and *click* on "Load resource.." and select the path of your models)

4. Open the *represenation.aird* file with the Aird Editor and enable the representation of ROSSystem models

 Use the *Properties* view to configure the system
 
 
### IV. A motivating Example <a id="Examples"/>
 
1. Import the common communication objects project to the workbench of your application:
```
scan_composition_example
```
 
