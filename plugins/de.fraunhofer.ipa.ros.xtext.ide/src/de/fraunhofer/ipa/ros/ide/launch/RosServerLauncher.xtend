package de.fraunhofer.ipa.ros.ide.launch

import org.eclipse.sprotty.xtext.launch.DiagramServerLauncher

class RosServerLauncher extends DiagramServerLauncher {

	override createSetup() {
		new RosLanguageServerSetup
	}

	def static void main(String[] args) {
		new RosServerLauncher().run(args)
	}
}