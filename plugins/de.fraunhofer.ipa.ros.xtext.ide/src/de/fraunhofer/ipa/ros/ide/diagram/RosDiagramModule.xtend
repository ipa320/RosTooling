package de.fraunhofer.ipa.ros.ide.diagram

import org.eclipse.sprotty.xtext.DefaultDiagramModule
import org.eclipse.sprotty.xtext.IDiagramGenerator
import org.eclipse.sprotty.layout.ElkLayoutEngine

class RosDiagramModule extends DefaultDiagramModule {

	def Class<? extends IDiagramGenerator> bindIDiagramGenerator() {
		RosDiagramGenerator
	} 

	override bindIDiagramServerFactory() {
		RosDiagramServerFactory
	}
	
	override bindILayoutEngine() {
		ElkLayoutEngine
	}
}