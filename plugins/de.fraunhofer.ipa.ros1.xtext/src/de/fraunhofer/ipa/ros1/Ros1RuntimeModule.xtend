/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros1
import de.fraunhofer.ipa.ros.RosQNP
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.IScopeProvider
import de.fraunhofer.ipa.ros.scoping.RosSP

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class Ros1RuntimeModule extends AbstractRos1RuntimeModule {

    override Class<? extends IScopeProvider> bindIScopeProvider() {
        return RosSP
    }

    override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return RosQNP
    }

}
