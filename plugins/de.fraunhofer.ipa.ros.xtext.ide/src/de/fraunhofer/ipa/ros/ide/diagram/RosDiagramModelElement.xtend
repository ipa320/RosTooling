package de.fraunhofer.ipa.ros.ide.diagram

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString
import org.eclipse.sprotty.SShapeElement

//import io.typefox.sprotty.api.SEdge
//import io.typefox.sprotty.api.SGraph
//import io.typefox.sprotty.api.SNode

import java.util.function.Consumer
import org.eclipse.sprotty.SPort

@Accessors
@ToString(skipNulls = true)
class SPublisher extends SPort {
	String text
	
	new() {
		type = 'publisher'
	}
	new(Consumer<SPublisher> initializer) {
		this()
		initializer.accept(this)
	}
}

@Accessors
@ToString(skipNulls = true)
class SSubscriber extends SPort {
	String text
	
	new() {
		type = 'subscriber'
	}
	new(Consumer<SSubscriber> initializer) {
		this()
		initializer.accept(this)
	}
}

@Accessors
@ToString(skipNulls = true)
class SServiceServer extends SPort {
	String text
	
	new() {
		type = 'serviceserver'
	}
	new(Consumer<SServiceServer> initializer) {
		this()
		initializer.accept(this)
	}
}

@Accessors
@ToString(skipNulls = true)
class SServiceClient extends SPort {
	String text
	
	new() {
		type = 'serviceclient'
	}
	new(Consumer<SServiceClient> initializer) {
		this()
		initializer.accept(this)
	}
}

@Accessors
@ToString(skipNulls = true)
class SActionServer extends SPort {
	String text
	
	new() {
		type = 'actionserver'
	}
	new(Consumer<SActionServer> initializer) {
		this()
		initializer.accept(this)
	}
}

@Accessors
@ToString(skipNulls = true)
class SActionClient extends SPort {
	String text
	
	new() {
		type = 'actionclient'
	}
	new(Consumer<SActionClient> initializer) {
		this()
		initializer.accept(this)
	}
}
