
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


class RosDiagramGenerator implements IDiagramGenerator {

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
			children = nodes.map[toSNode(context)]
		]
	}

	def SNode toSNode(Node node, extension Context context) {
		val theId = idCache.uniqueId(node, node.name)
				
		new SNode [
			id = theId
			// #[] creates an immutable list
			children = (node.publisher.map[toSPublisher(context) as SModelElement] 
				+ node.subscriber.map[toSSubscriber(context) as SModelElement] 
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
		]
	}
	
	def SPublisher toSPublisher(Publisher publisher, extension Context context) {
		new SPublisher [
			id = idCache.uniqueId(publisher, publisher.name + '.publisher')
			text = publisher.name
		]
	}
	
	def SSubscriber toSSubscriber(Subscriber subscriber, extension Context context) {
		new SSubscriber [
			id = idCache.uniqueId(subscriber, subscriber.name + '.subscriber')
			text = subscriber.name
		]
	}

} 