package de.fraunhofer.ipa.rossystem.ide.diagram

import com.google.inject.Inject
import componentInterface.ComponentInterface
import rossystem.RosSystem
import org.eclipse.lsp4j.Range
import org.eclipse.lsp4j.TextEdit
import org.eclipse.lsp4j.WorkspaceEdit
import org.eclipse.sprotty.SEdge
import org.eclipse.sprotty.SModelElement
import org.eclipse.sprotty.SModelIndex
import org.eclipse.sprotty.xtext.ILanguageAwareDiagramServer
import org.eclipse.sprotty.xtext.ReconnectAction
import org.eclipse.sprotty.xtext.WorkspaceEditAction
import org.eclipse.sprotty.xtext.tracing.PositionConverter
import org.eclipse.sprotty.xtext.tracing.XtextTrace
import org.eclipse.xtext.ide.server.ILanguageServerAccess
import org.eclipse.xtext.ide.server.UriExtensions
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import static extension org.eclipse.xtext.EcoreUtil2.*

class ConnectionsReconnectHandler {
	
	@Inject UriExtensions uriExtensions
	@Inject extension PositionConverter
	
	def handle(ReconnectAction action, ILanguageAwareDiagramServer server) {
		val root = server.diagramState.currentModel
		val extension index = new SModelIndex(root)
		val routable = action.routableId?.get
		val source = action.newSourceId?.get
		val target = action.newTargetId?.get
		server.diagramLanguageServer.languageServerAccess.doRead(server.sourceUri, [ context |
			val sourceElement = source?.resolveElement(context)
			val targetElement = target?.resolveElement(context)
			if (sourceElement instanceof ComponentInterface && targetElement instanceof ComponentInterface) {
				val textEdits = newArrayList
				val eventName = sourceElement.getContainerOfType(RosSystem)?.topicConnections?.head?.topicName?: 'undefined'
				val transitionText = '''«'\n\t'»«eventName» => «(targetElement as ComponentInterface).name»'''
				val oldRange = getOldRange(routable)
				val newRange = getNewRange(sourceElement as ComponentInterface)
				if (oldRange !== null) {
					if ((routable as SEdge).sourceId !== action.newSourceId) {
						textEdits += new TextEdit(oldRange, '')
						textEdits += new TextEdit(newRange, transitionText)
					} else {
						textEdits += new TextEdit(oldRange, transitionText)
					}
				} else {
					textEdits += new TextEdit(newRange, transitionText)
				}
				val workspaceEdit = new WorkspaceEdit() => [
					changes = #{ server.sourceUri -> textEdits }
				]
				server.dispatch(new WorkspaceEditAction => [
					it.workspaceEdit = workspaceEdit
				]);
				}
			return null
		])
	}
	
	private def getOldRange(SModelElement routable) {
		if (routable?.trace !== null) 
			new XtextTrace(routable.trace).range
		else 
			null
	}
	
	private def getNewRange(ComponentInterface sourceElement) {
		val position = NodeModelUtils.findActualNodeFor(sourceElement).endOffset.toPosition(sourceElement)
		return new Range(position, position)
	}
	
	
	private def resolveElement(SModelElement sElement, ILanguageServerAccess.Context context) {
		if (sElement.trace !== null) {
			val connectableURI = sElement.trace.toURI
			return context.resource.resourceSet.getEObject(connectableURI, true);
		} else {
			return null
		}
	}
	
	private def toURI(String path) {
		val parts = path.split('#')
		if(parts.size !== 2)
			throw new IllegalArgumentException('Invalid trace URI ' + path)
		return uriExtensions.toUri(parts.head).trimQuery.appendFragment(parts.last)
	}
}
