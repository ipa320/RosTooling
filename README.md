# Ros Model

1. <a href="#RosNode">Describe a ROS node using Sirius</a>
2. <a href="#RosArtifactProject">Create a ROS artifact project</a>
3. <a href="#RosSRGatewayProject">Create a SeRoNet Gateway project for ROS</a>

#### Describe a ROS node using Sirius <a id="RosNode"/>

1. Import into a new Eclipse workspace the projects:

```
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.sirius
```
2. Start a new eclipse application by either (de.fraunhofer.ipa.ros.sirius -> plugin.xml and click *Launch an Eclipse application*) or (*right click* de.fraunhofer.ipa.ros.sirius and *click* on Run As > Eclipse Application)

3. Create a new modeling project (Menu > File > New > Project > Sirius > Modeling Project)

4. Create a new ROS model to hold the description of your node (inside the new modeling project, click New  > Other > Ros Model and choose  Model Object as *Artifact*)

5. Create a new representation for your artifact (open the file representarions.aird with the aird editor, enable the representation *component*, select *Artifact* diagram and click *New...*)

Use the palette toolbar to add a new node, to configure your model use also the *Properties* view.

#### Create a ROS artifact project <a id="RosArtifactProject"/>

1. Import into a new Eclipse workspace the projects:

```
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.sirius
de.fraunhofer.ipa.ros.xtext
de.fraunhofer.ipa.ros.xtext.ide
de.fraunhofer.ipa.ros.xtext.ui
de.fraunhofer.ipa.rosartifact.xtext
de.fraunhofer.ipa.rosartifact.xtext.ide
de.fraunhofer.ipa.rosartifact.xtext.ui
```
2. Start a new eclipse application (de.fraunhofer.ipa.ros.editor -> plugin.xml and click *Launch an Eclipse application*)

3. Import the common communication objects project to the workspaceof your application:
```
de.fraunhofer.ipa.ros.communication.objects
```
4. Create a new ROS artifact project (menu File > New > Other > ROS Artifact project)

Use the palette toolbar to add a new node, to configure your model use also the *Properties* view (if it is disabled go to *Window* > *Show view* > *Other* and choose *Properties*). 

#### Create a SeRoNet Gateway project for ROS <a id="RosSRGatewayProject"/>

1. Import into a new Eclipse workspace the projects:

```
de.fraunhofer.ipa.ros
de.fraunhofer.ipa.rosartifact.xtext
de.fraunhofer.ipa.rosartifact.xtext.ide
de.fraunhofer.ipa.rosartifact.xtext.ui
de.fraunhofer.ipa.ros.edit
de.fraunhofer.ipa.ros.editor
de.fraunhofer.ipa.ros.seronetgw
de.fraunhofer.ipa.ros.seronetgw.edit
de.fraunhofer.ipa.ros.seronetgw.editor
de.fraunhofer.ipa.ros.seronetgw.xtext
de.fraunhofer.ipa.ros.seronetgw.xtext.ide
de.fraunhofer.ipa.ros.seronetgw.xtext.ui
de.fraunhofer.ipa.ros.sirius
de.fraunhofer.ipa.ros.tests
de.fraunhofer.ipa.ros.xtext
de.fraunhofer.ipa.ros.xtext.ide
de.fraunhofer.ipa.ros.xtext.ui
```
2. Start a new eclipse application (de.fraunhofer.ipa.ros.editor -> plugin.xml and click *Launch an Eclipse application*)

3. Import the common communication objects project to the workspaceof your application:
```
de.fraunhofer.ipa.ros.communication.objects
```
4. Create a new ROS-SeRoNet gateway project (menu File > New > Other > ROS-SeRoNet gateway Project)

5. Give a name to your project and press *Next*

6. A new dialog will be open asking for a ROS input model, press *Browse Workspace..." and select the ROS model for which you want to generate a gateway (extension ".rosartifact"). You can create a new one by <a href="#RosArtifactProject">Create a ROS artifact project</a> step 3.

7. Expand the tree of the resouce *platform:/resource/YourProjectName/YourProjectName.rosgw* and select *Ros Gateway* using the view *Properties* (if it is disabled go to *Window* > *Show view* > *Other* and *Properties*) you can chosse the interfaces of the input ROS model you want to make available to your SeRoNet system.

8. You can add more ROS input models by the option *Load Resource..* in the "Right-click" menu of your resouce *platform:/resource/YourProjectName/YourProjectName.rosgw*
