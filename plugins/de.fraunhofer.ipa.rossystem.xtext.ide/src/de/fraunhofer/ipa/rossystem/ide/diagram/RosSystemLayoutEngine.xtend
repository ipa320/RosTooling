package de.fraunhofer.ipa.rossystem.ide.diagram

import org.eclipse.sprotty.SGraph
import org.eclipse.sprotty.SModelRoot
import org.eclipse.sprotty.layout.ElkLayoutEngine
import org.eclipse.sprotty.layout.SprottyLayoutConfigurator
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.PortAlignment
import org.eclipse.elk.core.options.PortConstraints

class RosSystemLayoutEngine extends ElkLayoutEngine {

	override layout(SModelRoot root) {
		if (root instanceof SGraph) {
			val configurator = new SprottyLayoutConfigurator
			configurator.configureByType('graph')
				.setProperty(CoreOptions.DIRECTION, Direction.DOWN)
				.setProperty(CoreOptions.SPACING_NODE_NODE, 30.0)
				.setProperty(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, 30.0)
			configurator.configureByType('component')
				.setProperty(CoreOptions.PORT_ALIGNMENT_DEFAULT, PortAlignment.CENTER)
				.setProperty(CoreOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_SIDE)
			configurator.configureByType('port_east')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.EAST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
			configurator.configureByType('port_west')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.WEST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
			layout(root, configurator)
		}
	}
}
