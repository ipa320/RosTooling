## System Models visualization

The visualization of the models is built on top of the [PlantUML](https://plantuml.com/eclipse) viewer for Eclipse. To install this plugin the Eclipse Marketplace can be used. This tool can be easily opened under the menu Help->Eclipse Marketplace. Then Search the "PlantUML plugin" and install it.

The RosTooling will generate for every rossystem file a new PlaUML textual model compatible with the viewer. By default, the RosSystem compiler creates for every valid system model a file under src-gen/**SystemName**/resources/ called **SystemName**.puml.

The file can be opened with a standard textual editor and the corresponding model can be visualized by opening the visualizer, under "Window"->"Show View"->"Other" and searching for "PlantUML".
:bangbang the file with the extension *.puml must be open, otherwise, the visualizer will not detect it.
