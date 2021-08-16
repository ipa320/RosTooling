/*
 * generated by Xtext 2.24.0
 */
package de.fraunhofer.ipa.ros.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.ros.services.RosGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import ros.PackageSet

class RosFormatter extends AbstractFormatter2 {
	
	@Inject extension RosGrammarAccess

	def dispatch void format(PackageSet packageSet, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (_package : packageSet.package) {
			_package.format
		}
	}

	def dispatch void format(ros.Package _package, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (specBase : _package.spec) {
			specBase.format
		}
		for (artifact : _package.artifact) {
			artifact.format
		}
	}
	
	// TODO: implement for Artifact, CatkinPackage, ServiceSpec, TopicSpec, ActionSpec, MessageDefinition, Node, ServiceServer, Publisher, Subscriber, ServiceClient, ActionServer, ActionClient, Parameter, ParameterListType, ParameterStructType, ParameterIntegerType, ParameterStringType, ParameterDoubleType, ParameterDateType, ParameterBooleanType, ParameterBase64Type, ParameterAnyType, ParameterArrayType, ParameterSequence, ParameterStruct, ParameterStructMember, ParameterStructTypeMember, MessagePart
}
