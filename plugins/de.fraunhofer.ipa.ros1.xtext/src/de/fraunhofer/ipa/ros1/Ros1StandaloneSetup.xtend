/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros1


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class Ros1StandaloneSetup extends Ros1StandaloneSetupGenerated {

	def static void doSetup() {
		new Ros1StandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
