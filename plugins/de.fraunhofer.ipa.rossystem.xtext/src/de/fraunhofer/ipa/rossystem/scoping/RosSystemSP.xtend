package de.fraunhofer.ipa.rossystem.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.EcoreUtil2
import ros.Node
import ros.RosPackage

class RosSystemSP extends AbstractDeclarativeScopeProvider {

        override getScope(EObject context, EReference reference) {
        if (context instanceof Node) {
            if (reference == RosPackage.Literals.NODE) {
                val candidates = EcoreUtil2.getAllContentsOfType(context.eContainer, Node);
                return Scopes.scopeFor(candidates)
            }
        }
        return super.getScope(context, reference);
    }
}
