package de.fraunhofer.ipa.rossystem.ide.diagram

import org.eclipse.sprotty.xtext.DefaultDiagramModule
import org.eclipse.sprotty.xtext.IDiagramGenerator

class RosSystemDiagramModule extends DefaultDiagramModule {

	def Class<? extends IDiagramGenerator> bindIDiagramGenerator() {
		RosSystemDiagramGenerator
	} 

	override bindIDiagramServerFactory() {
		RosSystemDiagramServerFactory
	}
	
	override bindILayoutEngine() {
		RosSystemLayoutEngine
	}
	
	override bindIDiagramServer() {
		RosSystemDiagramServer
	}	
}
