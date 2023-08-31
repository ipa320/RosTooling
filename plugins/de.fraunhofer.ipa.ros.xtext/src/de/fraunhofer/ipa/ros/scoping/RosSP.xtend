package de.fraunhofer.ipa.ros.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import ros.RosPackage
import ros.SpecBase
import ros.Node

class RosSP extends AbstractDeclarativeScopeProvider {

    override getScope(EObject context, EReference reference) {
        if (context instanceof SpecBase) {
            if (reference == RosPackage.Literals.SPEC_BASE) {
                val candidates = EcoreUtil2.getAllContentsOfType(context.package, SpecBase);
                return Scopes.scopeFor(candidates)
            }
        }
//        if (context instanceof Node) {
//            if (reference == RosPackage.Literals.NODE) {
//                val candidates = EcoreUtil2.getAllContentsOfType(context, Node);
//                return Scopes.scopeFor(candidates)
//            }
//        }
        return super.getScope(context, reference);
    }

}
