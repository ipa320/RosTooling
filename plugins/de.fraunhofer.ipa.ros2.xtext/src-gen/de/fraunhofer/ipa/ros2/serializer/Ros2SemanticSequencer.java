/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros2.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.serializer.RosSemanticSequencer;
import de.fraunhofer.ipa.ros2.services.Ros2GrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import primitives.ByteArray;
import primitives.Header;
import primitives.MessagePart;
import primitives.PrimitivesPackage;
import primitives.bool;
import primitives.boolArray;
import primitives.char0;
import primitives.charArray;
import primitives.duration;
import primitives.float32;
import primitives.float32Array;
import primitives.float64;
import primitives.float64Array;
import primitives.int16;
import primitives.int16Array;
import primitives.int32;
import primitives.int32Array;
import primitives.int64;
import primitives.int64Array;
import primitives.int8;
import primitives.int8Array;
import primitives.string;
import primitives.stringArray;
import primitives.time;
import primitives.uint16;
import primitives.uint16Array;
import primitives.uint32;
import primitives.uint32Array;
import primitives.uint64;
import primitives.uint64Array;
import primitives.uint8;
import primitives.uint8Array;
import ros.ActionClient;
import ros.ActionServer;
import ros.ActionSpec;
import ros.AmentPackage;
import ros.ArrayTopicSpecMsgRef;
import ros.Artifact;
import ros.ExternalDependency;
import ros.GlobalNamespace;
import ros.MessageDefinition;
import ros.Node;
import ros.PackageDependency;
import ros.PackageSet;
import ros.ParameterAny;
import ros.ParameterAnyType;
import ros.ParameterArrayType;
import ros.ParameterBase64;
import ros.ParameterBase64Type;
import ros.ParameterBoolean;
import ros.ParameterBooleanType;
import ros.ParameterDate;
import ros.ParameterDateType;
import ros.ParameterDouble;
import ros.ParameterDoubleType;
import ros.ParameterInteger;
import ros.ParameterIntegerType;
import ros.ParameterListType;
import ros.ParameterSequence;
import ros.ParameterString;
import ros.ParameterStringType;
import ros.ParameterStruct;
import ros.ParameterStructMember;
import ros.ParameterStructType;
import ros.ParameterStructTypeMember;
import ros.PrivateNamespace;
import ros.Publisher;
import ros.QualityOfService;
import ros.RelativeNamespace;
import ros.RosPackage;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.ServiceSpec;
import ros.Subscriber;
import ros.TopicSpec;
import ros.TopicSpecMsgRef;

@SuppressWarnings("all")
public class Ros2SemanticSequencer extends RosSemanticSequencer {

	@Inject
	private Ros2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PrimitivesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PrimitivesPackage.BYTE:
				sequence_byte(context, (primitives.Byte) semanticObject); 
				return; 
			case PrimitivesPackage.BYTE_ARRAY:
				sequence_byteArray(context, (ByteArray) semanticObject); 
				return; 
			case PrimitivesPackage.HEADER:
				sequence_Header(context, (Header) semanticObject); 
				return; 
			case PrimitivesPackage.MESSAGE_PART:
				sequence_MessagePart(context, (MessagePart) semanticObject); 
				return; 
			case PrimitivesPackage.BOOL:
				sequence_bool(context, (bool) semanticObject); 
				return; 
			case PrimitivesPackage.BOOL_ARRAY:
				sequence_boolArray(context, (boolArray) semanticObject); 
				return; 
			case PrimitivesPackage.CHAR0:
				sequence_char(context, (char0) semanticObject); 
				return; 
			case PrimitivesPackage.CHAR_ARRAY:
				sequence_charArray(context, (charArray) semanticObject); 
				return; 
			case PrimitivesPackage.DURATION:
				sequence_duration(context, (duration) semanticObject); 
				return; 
			case PrimitivesPackage.FLOAT32:
				sequence_float32(context, (float32) semanticObject); 
				return; 
			case PrimitivesPackage.FLOAT32_ARRAY:
				sequence_float32Array(context, (float32Array) semanticObject); 
				return; 
			case PrimitivesPackage.FLOAT64:
				sequence_float64(context, (float64) semanticObject); 
				return; 
			case PrimitivesPackage.FLOAT64_ARRAY:
				sequence_float64Array(context, (float64Array) semanticObject); 
				return; 
			case PrimitivesPackage.INT16:
				sequence_int16(context, (int16) semanticObject); 
				return; 
			case PrimitivesPackage.INT16_ARRAY:
				sequence_int16Array(context, (int16Array) semanticObject); 
				return; 
			case PrimitivesPackage.INT32:
				sequence_int32(context, (int32) semanticObject); 
				return; 
			case PrimitivesPackage.INT32_ARRAY:
				sequence_int32Array(context, (int32Array) semanticObject); 
				return; 
			case PrimitivesPackage.INT64:
				sequence_int64(context, (int64) semanticObject); 
				return; 
			case PrimitivesPackage.INT64_ARRAY:
				sequence_int64Array(context, (int64Array) semanticObject); 
				return; 
			case PrimitivesPackage.INT8:
				sequence_int8(context, (int8) semanticObject); 
				return; 
			case PrimitivesPackage.INT8_ARRAY:
				sequence_int8Array(context, (int8Array) semanticObject); 
				return; 
			case PrimitivesPackage.STRING:
				sequence_string0(context, (string) semanticObject); 
				return; 
			case PrimitivesPackage.STRING_ARRAY:
				sequence_string0Array(context, (stringArray) semanticObject); 
				return; 
			case PrimitivesPackage.TIME:
				sequence_time(context, (time) semanticObject); 
				return; 
			case PrimitivesPackage.UINT16:
				sequence_uint16(context, (uint16) semanticObject); 
				return; 
			case PrimitivesPackage.UINT16_ARRAY:
				sequence_uint16Array(context, (uint16Array) semanticObject); 
				return; 
			case PrimitivesPackage.UINT32:
				sequence_uint32(context, (uint32) semanticObject); 
				return; 
			case PrimitivesPackage.UINT32_ARRAY:
				sequence_uint32Array(context, (uint32Array) semanticObject); 
				return; 
			case PrimitivesPackage.UINT64:
				sequence_uint64(context, (uint64) semanticObject); 
				return; 
			case PrimitivesPackage.UINT64_ARRAY:
				sequence_uint64Array(context, (uint64Array) semanticObject); 
				return; 
			case PrimitivesPackage.UINT8:
				sequence_uint8(context, (uint8) semanticObject); 
				return; 
			case PrimitivesPackage.UINT8_ARRAY:
				sequence_uint8Array(context, (uint8Array) semanticObject); 
				return; 
			}
		else if (epackage == RosPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RosPackage.ACTION_CLIENT:
				sequence_ActionClient(context, (ActionClient) semanticObject); 
				return; 
			case RosPackage.ACTION_SERVER:
				sequence_ActionServer(context, (ActionServer) semanticObject); 
				return; 
			case RosPackage.ACTION_SPEC:
				sequence_ActionSpec(context, (ActionSpec) semanticObject); 
				return; 
			case RosPackage.AMENT_PACKAGE:
				sequence_AmentPackage(context, (AmentPackage) semanticObject); 
				return; 
			case RosPackage.ARRAY_TOPIC_SPEC_MSG_REF:
				sequence_ArraySpecRef(context, (ArrayTopicSpecMsgRef) semanticObject); 
				return; 
			case RosPackage.ARTIFACT:
				sequence_Artifact(context, (Artifact) semanticObject); 
				return; 
			case RosPackage.EXTERNAL_DEPENDENCY:
				sequence_ExternalDependency(context, (ExternalDependency) semanticObject); 
				return; 
			case RosPackage.GLOBAL_NAMESPACE:
				sequence_GlobalNamespace(context, (GlobalNamespace) semanticObject); 
				return; 
			case RosPackage.MESSAGE_DEFINITION:
				sequence_MessageDefinition(context, (MessageDefinition) semanticObject); 
				return; 
			case RosPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case RosPackage.PACKAGE:
				sequence_Package_Impl(context, (ros.Package) semanticObject); 
				return; 
			case RosPackage.PACKAGE_DEPENDENCY:
				sequence_PackageDependency(context, (PackageDependency) semanticObject); 
				return; 
			case RosPackage.PACKAGE_SET:
				sequence_PackageSet(context, (PackageSet) semanticObject); 
				return; 
			case RosPackage.PARAMETER:
				sequence_Parameter(context, (ros.Parameter) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ANY:
				sequence_ParameterAny(context, (ParameterAny) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ANY_TYPE:
				sequence_ParameterAnyType(context, (ParameterAnyType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ARRAY_TYPE:
				sequence_ParameterArrayType(context, (ParameterArrayType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BASE64:
				sequence_ParameterBase64(context, (ParameterBase64) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BASE64_TYPE:
				sequence_ParameterBase64Type(context, (ParameterBase64Type) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BOOLEAN:
				sequence_ParameterBoolean(context, (ParameterBoolean) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BOOLEAN_TYPE:
				sequence_ParameterBooleanType(context, (ParameterBooleanType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DATE:
				sequence_ParameterDate(context, (ParameterDate) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DATE_TYPE:
				sequence_ParameterDateType(context, (ParameterDateType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DOUBLE:
				sequence_ParameterDouble(context, (ParameterDouble) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DOUBLE_TYPE:
				sequence_ParameterDoubleType(context, (ParameterDoubleType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_INTEGER:
				sequence_ParameterInteger(context, (ParameterInteger) semanticObject); 
				return; 
			case RosPackage.PARAMETER_INTEGER_TYPE:
				sequence_ParameterIntegerType(context, (ParameterIntegerType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_LIST_TYPE:
				sequence_ParameterListType(context, (ParameterListType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_SEQUENCE:
				sequence_ParameterList(context, (ParameterSequence) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRING:
				sequence_ParameterString(context, (ParameterString) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRING_TYPE:
				sequence_ParameterStringType(context, (ParameterStringType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT:
				sequence_ParameterStruct(context, (ParameterStruct) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_MEMBER:
				sequence_ParameterStructMember(context, (ParameterStructMember) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_TYPE:
				sequence_ParameterStructType(context, (ParameterStructType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_TYPE_MEMBER:
				sequence_ParameterStructTypeMember(context, (ParameterStructTypeMember) semanticObject); 
				return; 
			case RosPackage.PRIVATE_NAMESPACE:
				sequence_PrivateNamespace(context, (PrivateNamespace) semanticObject); 
				return; 
			case RosPackage.PUBLISHER:
				sequence_Publisher(context, (Publisher) semanticObject); 
				return; 
			case RosPackage.QUALITY_OF_SERVICE:
				sequence_QualityOfService(context, (QualityOfService) semanticObject); 
				return; 
			case RosPackage.RELATIVE_NAMESPACE:
				sequence_RelativeNamespace_Impl(context, (RelativeNamespace) semanticObject); 
				return; 
			case RosPackage.SERVICE_CLIENT:
				sequence_ServiceClient(context, (ServiceClient) semanticObject); 
				return; 
			case RosPackage.SERVICE_SERVER:
				sequence_ServiceServer(context, (ServiceServer) semanticObject); 
				return; 
			case RosPackage.SERVICE_SPEC:
				sequence_ServiceSpec(context, (ServiceSpec) semanticObject); 
				return; 
			case RosPackage.SUBSCRIBER:
				sequence_Subscriber(context, (Subscriber) semanticObject); 
				return; 
			case RosPackage.TOPIC_SPEC:
				sequence_TopicSpec(context, (TopicSpec) semanticObject); 
				return; 
			case RosPackage.TOPIC_SPEC_MSG_REF:
				sequence_SpecBaseRef(context, (TopicSpecMsgRef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ActionClient returns ActionClient
	 *
	 * Constraint:
	 *     (name=EString action=[ActionSpec|EString] namespace=Namespace? qos=QualityOfService?)
	 * </pre>
	 */
	protected void sequence_ActionClient(ISerializationContext context, ActionClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ActionServer returns ActionServer
	 *
	 * Constraint:
	 *     (name=EString action=[ActionSpec|EString] namespace=Namespace? qos=QualityOfService?)
	 * </pre>
	 */
	protected void sequence_ActionServer(ISerializationContext context, ActionServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Package returns AmentPackage
	 *     AmentPackage returns AmentPackage
	 *
	 * Constraint:
	 *     (name=RosNames fromGitRepo=EString? artifact+=Artifact* (dependency+=Dependency dependency+=Dependency*)?)
	 * </pre>
	 */
	protected void sequence_AmentPackage(ISerializationContext context, AmentPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString type=ParameterType namespace=Namespace? value=ParameterValue? qos=QualityOfService?)
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, ros.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Publisher returns Publisher
	 *
	 * Constraint:
	 *     (name=EString message=[TopicSpec|EString] namespace=Namespace? qos=QualityOfService?)
	 * </pre>
	 */
	protected void sequence_Publisher(ISerializationContext context, Publisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     QualityOfService returns QualityOfService
	 *
	 * Constraint:
	 *     (
	 *         QoSProfile='default_qos' | 
	 *         QoSProfile='services_qos' | 
	 *         QoSProfile='sensor_qos' | 
	 *         QoSProfile='parameter_qos' | 
	 *         History='keep_last' | 
	 *         History='keep_all' | 
	 *         Depth=Integer0 | 
	 *         Reliability='best_effort' | 
	 *         Reliability='reliable' | 
	 *         Durability='transient_local' | 
	 *         Durability='volatile'
	 *     )*
	 * </pre>
	 */
	protected void sequence_QualityOfService(ISerializationContext context, QualityOfService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ServiceClient returns ServiceClient
	 *
	 * Constraint:
	 *     (name=EString service=[ServiceSpec|EString] namespace=Namespace? qos=QualityOfService?)
	 * </pre>
	 */
	protected void sequence_ServiceClient(ISerializationContext context, ServiceClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ServiceServer returns ServiceServer
	 *
	 * Constraint:
	 *     (name=EString service=[ServiceSpec|EString] namespace=Namespace? qos=QualityOfService?)
	 * </pre>
	 */
	protected void sequence_ServiceServer(ISerializationContext context, ServiceServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Subscriber returns Subscriber
	 *
	 * Constraint:
	 *     (name=EString message=[TopicSpec|EString] namespace=Namespace? qos=QualityOfService?)
	 * </pre>
	 */
	protected void sequence_Subscriber(ISerializationContext context, Subscriber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
