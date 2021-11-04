
package de.fraunhofer.ipa.ros.ide.diagram

import ros.Node
import ros.PackageSet
import ros.Publisher
import ros.Subscriber
import org.eclipse.sprotty.LayoutOptions
import org.eclipse.sprotty.SGraph
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.SNode
import org.eclipse.sprotty.xtext.IDiagramGenerator
import org.eclipse.sprotty.SModelElement
import ros.ServiceServer
import ros.ServiceClient
import ros.ActionServer
import ros.ActionClient
import org.eclipse.sprotty.SPort
import java.util.List
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import org.eclipse.sprotty.xtext.tracing.ITraceProvider
import org.eclipse.sprotty.xtext.SIssueMarkerDecorator
import com.google.inject.Inject
import ros.RosPackage


class RosDiagramGenerator implements IDiagramGenerator {

	@Inject extension ITraceProvider
	@Inject extension SIssueMarkerDecorator

	List<Publisher> publishers
	
	List<SModelElement> ListOfPorts
	
	override generate(Context context) {
		(context.resource.contents.head as PackageSet).toSGraph(context)
	}

	def toSGraph(PackageSet packageset, extension Context context) {
		val nodes = packageset.package
				.map[package | package.artifact
					.map[artifact | artifact.node]
				].flatten.toList
		
		new SGraph [
			id = idCache.uniqueId(packageset, 'root')
			children = (nodes.map[toSNode(context)])
			//children = publishers.map[toSPublisher(context)]
		]
	}

	/**public SGraph generateGraph() {
		return new SGraph(graph -> {
			graph.setId("graph");
			graph.setChildren(new ArrayList<>());
			graph.getChildren().add(new SNode(node -> {
				node.setChildren(new ArrayList<>(4));
				for (int p = 0; p < 4; p++)
					node.getChildren().add(generatePort(p, "test" + Strings.repeat("_test", p)));
			}));
		});
	}
	
	private SPort generatePort(int p, String pLabel) {
		return new SPort(port -> {
			port.setId("port" + p);
			port.setChildren(Collections.singletonList(new SLabel(label -> {
				label.setId("port" + p + "/label");
				label.setText(pLabel);
			})));
		});
	}*/


	def SNode toSNode(Node node, extension Context context) {
		val theId = idCache.uniqueId(node, node.name)
				
		(new SNode [
			id = theId
			
			children =  
			/** #[
				(new SLabel [
					id = idCache.uniqueId(theId + '.label')
					text = node.name 
				]).trace(node, RosPackage.Literals.NODE__NAME, -1),
				(node.publisher.map[publishers].flatten.map[toSPublisher(context)] as SModelElement)
			]*/
				(node.publisher.map[toSPublisher(context) as SModelElement]
				+ node.subscriber.map[toSSubscriber(context) as SModelElement] 
				+ node.serviceserver.map[toSServiceServer(context) as SModelElement]
				+ node.serviceclient.map[toSServiceClient(context) as SModelElement]
				+ node.actionserver.map[toSActionServer(context) as SModelElement]
				+ node.actionclient.map[toSActionClient(context) as SModelElement]
				+ #[new SLabel[
					id = idCache.uniqueId(theId + '.label')
					text = node.name 
				]]).toList
			layout = 'stack'
			layoutOptions = new LayoutOptions [
				paddingTop = 10.0
				paddingBottom = 30.0
				paddingLeft = 10.0
				paddingRight = 10.0
			]
			type = 'node'
		]).traceAndMark(node, context)
	}
	
	/**def List<SModelElement> toSPorts (Node node, extension Context context) {
		ListOfPorts = new ArrayList<SModelElement>;
		for (Publisher pub : node.publisher){
			ListOfPorts.add(new SPort [
			id = idCache.uniqueId(pub, pub.name + '.publisher')
			children = #[new SLabel[
					id = idCache.uniqueId(id + '.label')
					text = pub.name ]]
			type = 'publisher_port'
			])
		}
		return ListOfPorts;
	}*/
	
	def SModelElement toSPublisher(Publisher publisher, extension Context context) {
		(new SPort [
			id = idCache.uniqueId(publisher, publisher.name + '.publisher')
			children = #[new SLabel[
					id = idCache.uniqueId(id + '.label')
					text = publisher.name ]]
			type = 'publisher_port'
		])
	}
	
	def SModelElement toSSubscriber(Subscriber subscriber, extension Context context) {
		new SPort [
			id = idCache.uniqueId(subscriber, subscriber.name + '.subscriber')
			children = #[new SLabel[
					id = idCache.uniqueId(id + '.label')
					text = subscriber.name ]]
			type = 'subscriber_port'
		]
	}
	
	def SPort toSServiceServer(ServiceServer server, extension Context context) {
		new SPort [
			id = idCache.uniqueId(server, server.name + '.serviceserver')
			children = #[new SLabel[
					id = idCache.uniqueId(id + '.label')
					text = server.name ]]
			type = 'service_server_port'
		]
	}
	def SPort toSServiceClient(ServiceClient client, extension Context context) {
		new SPort [
			id = idCache.uniqueId(client, client.name + '.serviceclient')
			children = #[new SLabel[
					id = idCache.uniqueId(id + '.label')
					text = client.name ]]
			type = 'service_client_port'
		]
	}
	def SPort toSActionServer(ActionServer server, extension Context context) {
		new SPort [
			id = idCache.uniqueId(server, server.name + '.actionserver')
			children = #[new SLabel[
					id = idCache.uniqueId(id + '.label')
					text = server.name ]]
			type = 'action_server_port'
		]
	}
	def SPort toSActionClient(ActionClient client, extension Context context) {
		new SPort [
			id = idCache.uniqueId(client, client.name + '.actionclient')
			children = #[new SLabel[
					id = idCache.uniqueId(id + '.label')
					text = client.name ]]
			type = 'action_client_port'
		]
	}

	def <T extends SModelElement> T traceAndMark(T sElement, EObject element, Context context) {
		sElement.trace(element).addIssueMarkers(element, context) 
	}


} 
