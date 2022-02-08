
package de.fraunhofer.ipa.rossystem.ide.diagram

import com.google.inject.Inject
import componentInterface.ComponentInterface
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.sprotty.LayoutOptions
import org.eclipse.sprotty.SEdge
import org.eclipse.sprotty.SGraph
import org.eclipse.sprotty.SLabel
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.SNode
import org.eclipse.sprotty.SPort
import org.eclipse.sprotty.xtext.IDiagramGenerator
import org.eclipse.sprotty.xtext.SIssueMarkerDecorator
import org.eclipse.sprotty.xtext.tracing.ITraceProvider
import rossystem.RosSystem
import rossystem.RossystemPackage
import rossystem.TopicConnection

class RosSystemDiagramGenerator implements IDiagramGenerator {
	
	@Inject extension ITraceProvider
	@Inject extension SIssueMarkerDecorator
	
	val EStructuralFeature COMPONENT__NAME = null
	
	override generate(Context context) {
		(context.resource.contents.head as RosSystem).toSGraph(context)
	}
	
	def toSGraph(RosSystem system, extension Context context){
		(new SGraph [
			id = idCache.uniqueId(system, 'root')
			children = (system.rosComponent.map[toSNode(context)]
			  + system.topicConnections.map[toSEdge(context)]
			).toList 
		]).traceAndMark(system, context)
	}
	
	def SNode toSNode(ComponentInterface component, extension Context context) {
		val theId = idCache.uniqueId(component, component.name) 
		(new SNode [
			id = theId
			children = #[new SLabel[
					id = idCache.uniqueId(theId + '.label')
					text = component.name 
				].trace(component, COMPONENT__NAME, -1),
				new SPort [
					id = idCache.uniqueId(theId + '.newTransition')
				]	
				
				]
			layout = 'stack'
			layoutOptions = new LayoutOptions [
				paddingTop = 10.0
				paddingBottom = 10.0
				paddingLeft = 10.0
				paddingRight = 10.0
				
			]
			type = 'component'
		]).traceAndMark(component, context)	}
	
	def SEdge toSEdge(TopicConnection topicConnection, extension Context context)  {
		(new SEdge [
			sourceId = idCache.getId(topicConnection.eContainer) 
			targetId = idCache.getId(topicConnection)
			val theId = idCache.uniqueId(topicConnection, sourceId + ':' + topicConnection.topicName + ':' + targetId)
			id = theId 
			children = #[
				(new SLabel [
					id = idCache.uniqueId(theId + '.label')
					type = 'label:xref'
					text = topicConnection.topicName
				]).trace(topicConnection, RossystemPackage.Literals.TOPIC_CONNECTION__FROM, -1)
			]
		]).traceAndMark(topicConnection, context)
	}
	

	def <T extends SModelElement> T traceAndMark(T sElement, EObject element, Context context) {
		sElement.trace(element).addIssueMarkers(element, context) 
	}
	
}
