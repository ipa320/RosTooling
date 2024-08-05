/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros1

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import ros.RosPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class Ros1StandaloneSetup extends Ros1StandaloneSetupGenerated {

    def static void doSetup() {
        new Ros1StandaloneSetup().createInjectorAndDoEMFRegistration()
    }
    
    override register(Injector injector) {
        EPackage.Registry.INSTANCE.put(RosPackage.eNS_URI, RosPackage.eINSTANCE)
        super.register(injector)
    }
}
