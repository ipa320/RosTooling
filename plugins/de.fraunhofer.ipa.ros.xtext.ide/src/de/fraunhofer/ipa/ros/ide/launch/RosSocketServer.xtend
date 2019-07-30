package de.fraunhofer.ipa.ros.ide.launch

import org.eclipse.sprotty.xtext.launch.DiagramServerSocketLauncher
import org.apache.log4j.Logger

class RosSocketServer extends DiagramServerSocketLauncher {
	
	static val LOG = Logger.getLogger(RosSocketServer)
	
	override createSetup() {
		new RosLanguageServerSetup
	}

	def static void main(String... args) {
		val rosSocketServer = new RosSocketServer()
		LOG.info("Starting language server on port " + rosSocketServer.getPort(args))
		new RosSocketServer().run(args)	
	}
	
}