/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.ide

import com.google.inject.Guice
import de.fraunhofer.ipa.rossystem.RosSystemRuntimeModule
import de.fraunhofer.ipa.rossystem.RosSystemStandaloneSetup
import org.eclipse.xtext.util.Modules2
import de.fraunhofer.ipa.ros.RosRuntimeModule

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RosSystemIdeSetup extends RosSystemStandaloneSetup {

		RosSystemIdeModule rosSystemIdeModule
		
		override createInjector() {
		rosSystemIdeModule = new RosSystemIdeModule;
		Guice.createInjector(Modules2.mixin(new RosRuntimeModule, rosSystemIdeModule))
		Guice.createInjector(Modules2.mixin(new RosSystemRuntimeModule, rosSystemIdeModule))
		
	}
	
}
