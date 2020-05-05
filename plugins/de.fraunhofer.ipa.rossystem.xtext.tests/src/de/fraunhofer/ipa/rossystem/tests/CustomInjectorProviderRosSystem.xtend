package de.fraunhofer.ipa.rossystem.tests

import de.fraunhofer.ipa.ros.tests.RosInjectorProvider
import de.fraunhofer.ipa.componentInterface.tests.ComponentInterfaceInjectorProvider

class CustomInjectorProviderRosSystem extends RosSystemInjectorProvider {
	
	override protected internalCreateInjector() {
		// trigger the injector creation of all three languages
		new RosInjectorProvider().injector
		new ComponentInterfaceInjectorProvider().injector	
		super.internalCreateInjector()
	}
}
