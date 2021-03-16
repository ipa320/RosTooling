package de.fraunhofer.ipa.ros.ide.diagram

import org.eclipse.sprotty.xtext.DiagramServerFactory
import org.eclipse.sprotty.xtext.LanguageAwareDiagramServer

import org.eclipse.sprotty.ServerLayoutKind

class RosDiagramServerFactory extends DiagramServerFactory {

	override getDiagramTypes() {
		#['ros-diagram']
	}

	override createDiagramServer(String diagramType, String clientId) {
		val server = super.createDiagramServer(diagramType, clientId)
		if (server instanceof LanguageAwareDiagramServer)
			server.serverLayoutKind = ServerLayoutKind.AUTOMATIC
		server
	}
}