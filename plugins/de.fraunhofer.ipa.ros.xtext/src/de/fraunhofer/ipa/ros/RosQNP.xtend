package de.fraunhofer.ipa.ros;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.emf.ecore.EObject
import ros.TopicSpec
import ros.ServiceSpec
import ros.ActionSpec

class RosQNP extends DefaultDeclarativeQualifiedNameProvider{
    	 	 
  override getFullyQualifiedName(EObject obj) {
    if (obj instanceof TopicSpec) {
      val topic_spec_name = obj.name
      val pkg_name = obj.package.name
      return getConverter().toQualifiedName(pkg_name + "/msg/" + topic_spec_name);
    }
    if (obj instanceof ServiceSpec) {
      val service_spec_name = obj.name
      val pkg_name = obj.package.name
      return getConverter().toQualifiedName(pkg_name + "/srv/" + service_spec_name);
    }
    if (obj instanceof ActionSpec) {
      val action_spec_name = obj.name
      val pkg_name = obj.package.name
      return getConverter().toQualifiedName(pkg_name + "/action/" + action_spec_name);
    }
    return super.qualifiedName(obj);
    }
}
