/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.rossystem

import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScopeProvider
import de.fraunhofer.ipa.rossystem.scoping.RosSystemSP

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class RosSystemRuntimeModule extends AbstractRosSystemRuntimeModule {

//   override Class<? extends IScopeProvider> bindIScopeProvider() {
//        return RosSystemSP
//    }
//
    override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return RosSystemQNP
    }
}
