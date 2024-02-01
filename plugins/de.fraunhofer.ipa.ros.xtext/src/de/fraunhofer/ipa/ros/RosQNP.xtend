package de.fraunhofer.ipa.ros;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.emf.ecore.EObject
import ros.TopicSpec
import ros.ServiceSpec
import ros.ActionSpec
import ros.Node
import ros.Package
import ros.Publisher
import ros.Artifact
import ros.Subscriber
import ros.ServiceServer
import ros.ServiceClient
import ros.ActionServer
import ros.ActionClient
import ros.NamespacedElement
import ros.Parameter

class RosQNP extends DefaultDeclarativeQualifiedNameProvider{

  override getFullyQualifiedName(EObject obj) {

    if (obj instanceof Node) {
      val node_name = obj.name
      val pkg = obj.eContainer.eContainer as Package
      return getConverter().toQualifiedName(pkg.name + "." + node_name);
    }
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
    if (obj instanceof Publisher) {
      val interface = obj as Publisher
      val art = obj.eContainer.eContainer as Artifact
      return getConverter().toQualifiedName(art.name + "::" + interface.name);
    }

    if (obj instanceof Subscriber) {
      val interface = obj as Subscriber
      val art = obj.eContainer.eContainer as Artifact
      return getConverter().toQualifiedName(art.name + "::" + interface.name);
    }

    if (obj instanceof ServiceServer) {
      val interface = obj as ServiceServer
      val art = obj.eContainer.eContainer as Artifact
      return getConverter().toQualifiedName(art.name + "::" + interface.name);
    }

    if (obj instanceof ServiceClient) {
      val interface = obj as ServiceClient
      val art = obj.eContainer.eContainer as Artifact
      return getConverter().toQualifiedName(art.name + "::" + interface.name);
    }

    if (obj instanceof ActionServer) {
      val interface = obj as ActionServer
      val art = obj.eContainer.eContainer as Artifact
      return getConverter().toQualifiedName(art.name + "::" + interface.name);
    }

    if (obj instanceof ActionClient) {
      val interface = obj as ActionClient
      val art = obj.eContainer.eContainer as Artifact
      return getConverter().toQualifiedName(art.name + "::" + interface.name);
    }

    if (obj instanceof Parameter) {
      val interface = obj as Parameter
      val art = obj.eContainer.eContainer as Artifact
      return getConverter().toQualifiedName(art.name + "::" + interface.name);
    }

    return super.qualifiedName(obj);
    }
}
