package de.fraunhofer.ipa.rossystem;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import system.RosInterface;
import system.RosNode;
import org.eclipse.emf.ecore.EObject
import system.Rossystem
import system.System
import ros.Parameter
import system.RosParameter

class RosSystemQNP extends DefaultDeclarativeQualifiedNameProvider{


  override getFullyQualifiedName(EObject obj) {

    if (obj instanceof RosNode) {
      val node_name = obj.name
      return getConverter().toQualifiedName(node_name);
    }
    if (obj instanceof RosInterface) {
      val interface_name = obj.name
      return getConverter().toQualifiedName(interface_name);
    }
    if (obj instanceof Rossystem) {
      val sys_name = obj.name
      return getConverter().toQualifiedName(sys_name);
    }
    if (obj instanceof System) {
      val sys_name = obj.name
      return getConverter().toQualifiedName(sys_name);
    }
    if (obj instanceof Parameter) {
      val param_name = obj.name
      return getConverter().toQualifiedName(param_name);
    }
    if (obj instanceof RosParameter) {
      val param_name = obj.name
      return getConverter().toQualifiedName(param_name);
    }
    }

}
