package de.fraunhofer.ipa.ros.ide.diagram

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
import org.eclipse.elk.core.options.SizeConstraint

class RosLayoutEngine extends ElkLayoutEngine {

	override layout(SModelRoot root) {
		if (root instanceof SGraph) {
			val configurator = new SprottyLayoutConfigurator
			configurator.configureByType('graph')
				.setProperty(CoreOptions.DIRECTION, Direction.DOWN)
				.setProperty(CoreOptions.SPACING_NODE_NODE, 30.0)
				.setProperty(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, 30.0)
			configurator.configureByType('node')
				.setProperty(CoreOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
				.setProperty(CoreOptions.PORT_ALIGNMENT_DEFAULT, PortAlignment.JUSTIFIED)
				.setProperty(CoreOptions.NODE_SIZE_CONSTRAINTS, SizeConstraint.free());
			configurator.configureByType('publisher_port')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.EAST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
			configurator.configureByType('subscriber_port')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.WEST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
			configurator.configureByType('service_server_port')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.EAST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
			configurator.configureByType('service_client_port')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.WEST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
			configurator.configureByType('action_server_port')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.EAST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
			configurator.configureByType('action_client_port')
				.setProperty(CoreOptions.PORT_SIDE, PortSide.WEST)
				.setProperty((CoreOptions.PORT_BORDER_OFFSET), 3.0)
				
			layout(root, configurator)
		}
	}
}
