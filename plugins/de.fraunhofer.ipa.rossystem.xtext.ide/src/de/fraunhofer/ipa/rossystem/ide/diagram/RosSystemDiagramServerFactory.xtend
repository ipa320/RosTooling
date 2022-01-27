package de.fraunhofer.ipa.rossystem.ide.diagram

import org.eclipse.sprotty.xtext.DiagramServerFactory
import org.eclipse.sprotty.xtext.LanguageAwareDiagramServer

import org.eclipse.sprotty.ServerLayoutKind

class RosSystemDiagramServerFactory extends DiagramServerFactory {

	override getDiagramTypes() {
		#['rossystem-diagram']
	}

	override createDiagramServer(String diagramType, String clientId) {
		val server = super.createDiagramServer(diagramType, clientId)
		if (server instanceof LanguageAwareDiagramServer)
			server.serverLayoutKind = ServerLayoutKind.AUTOMATIC
		server
	}
}
