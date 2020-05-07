package de.fraunhofer.ipa.componentInterface.tests

import de.fraunhofer.ipa.ros.tests.RosInjectorProvider

class CustomInjectorProvider extends ComponentInterfaceInjectorProvider {
	
	override protected internalCreateInjector() {
		// trigger the injector creation of all three languages
		new RosInjectorProvider().injector
		super.internalCreateInjector()
	}
}
