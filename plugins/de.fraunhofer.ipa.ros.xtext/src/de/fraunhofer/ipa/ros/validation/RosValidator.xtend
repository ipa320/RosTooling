/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros.validation

import org.eclipse.xtext.validation.Check
import ros.ActionClient
import ros.ActionServer
import ros.Artifact
import ros.Node
import ros.Package
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import ros.Parameter
import ros.ParameterValue
import ros.ParameterBase64Type
import ros.ParameterDate

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RosValidator extends AbstractRosValidator {

  public static val INVALID_NAME = 'invalidName'
  public static val PARAMETER_HELP = 'paramInfo'
  
  /* CAPITAL LETTERS */
  @Check
  def void checkNameConventionsNode (Node node) {
  	for (char c : node.name.toCharArray){
  		if (Character.isUpperCase(c)){
  			warning("The name of a node should follow the ROS naming conventions: Capital letters are not recommended", null, INVALID_NAME);
  		}
  	}}
  @Check
  def void checkNameConventionsArtifact (Artifact artifact) {
  	for (char c : artifact.name.toCharArray){
  		if (Character.isUpperCase(c)){
  			warning("The name of a artifact should follow the ROS naming conventions: Capital letters are not recommended", null, INVALID_NAME);
  		}
  	}}
  @Check
  def void checkNameConventionsPackage (Package rospackage) {
	for (char c : rospackage.name.toCharArray){
		if (Character.isUpperCase(c)){
			error("The name of a package has to follow the ROS naming conventions: Capital letters are not allowed", null, INVALID_NAME);
		}
 	}
  }
   @Check
  def void checkNameConventionsParameters (Parameter parameter) {
	for (char c : parameter.name.toCharArray){
		if (Character.isUpperCase(c)){
			warning("The name of a parameter has to follow the ROS naming conventions: Capital letters are not recommended", null, INVALID_NAME);
		}
 	}
  }
  
  /* Customize Syntax Error Messages */
  
   public static val INVALID_SPEC = 'invalidSpecRef'
   public static String SpecWarning = "## Quick Fixes available ##-
    - Add the dependency to the specifications project
    - Generate the .ros model for the specifications
      ->https://github.com/ipa320/ros-model/blob/master/docu/NewCommunicationObjects.md"
  
  /* For Topics */
  @Check
  def void CheckMsgsRefPublisher(Publisher pub){
  	if(pub.message.eContainer === null){
  		warning( SpecWarning, null, INVALID_SPEC)
  	}
  }
  
  @Check
  def void CheckMsgsRefSubscriber(Subscriber sub){
  	if(sub.message.eContainer === null){
  		warning( SpecWarning, null, INVALID_SPEC)
  	}
  }
  
  /* For Actions */
  @Check
  def void CheckMsgsRefActionClient(ActionClient act){
  	if(act.action.eContainer === null){
  		warning( SpecWarning, null, INVALID_SPEC)
  	}
  }
  
   @Check
  def void CheckMsgsRefActionServer(ActionServer act){
  	if(act.action.eContainer === null){
  		warning( SpecWarning, null, INVALID_SPEC)
  	}
  }
  
  /* For Services */
  @Check
  def void CheckMsgsRefServiceServer (ServiceServer ser){
  	if(ser.service.eContainer === null){
  		warning( SpecWarning, null, INVALID_SPEC)
  	}
  }
  
  @Check
  def void CheckMsgsRefServiceClient (ServiceClient ser){
  	if(ser.service.eContainer === null){
  		warning( SpecWarning, null, INVALID_SPEC)
  	}
  }
 
 
 /*Parameters Helper*/
  @Check
  def void BinaryHelp (Parameter param){
  	if(param.type.toString.contains("Base64") && !(param.toString.contains('0b') ||param.toString.contains('0B'))){
  		info("HELP: A binary value must start with '0b'", null, PARAMETER_HELP)
  	}
  }
 
   @Check
  def void ArrayHelp (Parameter param){
  	if(param.type.toString.contains("Array")){
  		info("HELP: Array parameter format:\n { type TYPE default {VALUE, VALUE} \n example:\n type Boolean default true, true} ", null, PARAMETER_HELP)
  	}
  }
   
  @Check
  def void ListHelp (Parameter param){
  	if(param.type.toString.contains("List")){
  		info("HELP: List parameter format:\n { TYPE default VALUE,TYPE default VALUE }\n example:\n Integer default 5, Boolean default true ", null, PARAMETER_HELP)
  	}
  }
  
  @Check
  def void StructHelp (Parameter param){
  	if(param.type.toString.contains("Struct")){
  		info("HELP: Struct parameter format:\n { NAME TYPE default VALUE, NAME TYPE default VALUE }\n example:\n my_int Integer {default 5}, my_bool Boolean default true ", null, PARAMETER_HELP)
  	}
  }
  
   //The RULE_ID impose the rest of the ROS naming convention rules : bin/de/fraunhofer/ipa/ros/parser/antlr/internal/InternalRos.g
  // allow the use only of the symbol: "_"
  // allow the use of numbers
  
 }


