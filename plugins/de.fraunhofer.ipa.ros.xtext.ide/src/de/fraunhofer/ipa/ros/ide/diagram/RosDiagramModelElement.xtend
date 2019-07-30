package de.fraunhofer.ipa.ros.ide.diagram

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.ToString
import org.eclipse.sprotty.SShapeElement
import java.util.function.Consumer

@Accessors
@ToString(skipNulls = true)
class SPublisher extends SShapeElement {
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
class SSubscriber extends SShapeElement {
	String text
	
	new() {
		type = 'subscriber'
	}
	new(Consumer<SSubscriber> initializer) {
		this()
		initializer.accept(this)
	}
}