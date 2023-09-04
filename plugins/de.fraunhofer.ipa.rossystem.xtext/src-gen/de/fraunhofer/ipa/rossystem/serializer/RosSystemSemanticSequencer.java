/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.rossystem.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.serializer.BasicsSemanticSequencer;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
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
import ros.ArrayTopicSpecMsgRef;
import ros.GlobalNamespace;
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
import ros.RelativeNamespace;
import ros.RosPackage;
import ros.TopicSpecMsgRef;
import system.RosActionClientReference;
import system.RosActionConnection;
import system.RosActionServerReference;
import system.RosInterface;
import system.RosNode;
import system.RosParameter;
import system.RosPublisherReference;
import system.RosServiceClientReference;
import system.RosServiceConnection;
import system.RosServiceServerReference;
import system.RosSubscriberReference;
import system.RosSystemConnection;
import system.RosTopicConnection;
import system.RossystemPackage;

@SuppressWarnings("all")
public class RosSystemSemanticSequencer extends BasicsSemanticSequencer {

	@Inject
	private RosSystemGrammarAccess grammarAccess;
	
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
			case RosPackage.ARRAY_TOPIC_SPEC_MSG_REF:
				sequence_ArraySpecRef(context, (ArrayTopicSpecMsgRef) semanticObject); 
				return; 
			case RosPackage.GLOBAL_NAMESPACE:
				sequence_GlobalNamespace(context, (GlobalNamespace) semanticObject); 
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
			case RosPackage.RELATIVE_NAMESPACE:
				sequence_RelativeNamespace_Impl(context, (RelativeNamespace) semanticObject); 
				return; 
			case RosPackage.TOPIC_SPEC_MSG_REF:
				sequence_SpecBaseRef(context, (TopicSpecMsgRef) semanticObject); 
				return; 
			}
		else if (epackage == RossystemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RossystemPackage.PROCESS:
				sequence_Process(context, (system.Process) semanticObject); 
				return; 
			case RossystemPackage.ROS_ACTION_CLIENT_REFERENCE:
				sequence_RosActionClientReference(context, (RosActionClientReference) semanticObject); 
				return; 
			case RossystemPackage.ROS_ACTION_CONNECTION:
				sequence_RosActionConnection(context, (RosActionConnection) semanticObject); 
				return; 
			case RossystemPackage.ROS_ACTION_SERVER_REFERENCE:
				sequence_RosActionServerReference(context, (RosActionServerReference) semanticObject); 
				return; 
			case RossystemPackage.ROS_INTERFACE:
				sequence_RosInterface(context, (RosInterface) semanticObject); 
				return; 
			case RossystemPackage.ROS_NODE:
				sequence_RosNode(context, (RosNode) semanticObject); 
				return; 
			case RossystemPackage.ROS_PARAMETER:
				sequence_RosParameter(context, (RosParameter) semanticObject); 
				return; 
			case RossystemPackage.ROS_PUBLISHER_REFERENCE:
				sequence_RosPublisherReference(context, (RosPublisherReference) semanticObject); 
				return; 
			case RossystemPackage.ROS_SERVICE_CLIENT_REFERENCE:
				sequence_RosServerClientReference(context, (RosServiceClientReference) semanticObject); 
				return; 
			case RossystemPackage.ROS_SERVICE_CONNECTION:
				sequence_RosServiceConnection(context, (RosServiceConnection) semanticObject); 
				return; 
			case RossystemPackage.ROS_SERVICE_SERVER_REFERENCE:
				sequence_RosServiceServerReference(context, (RosServiceServerReference) semanticObject); 
				return; 
			case RossystemPackage.ROS_SUBSCRIBER_REFERENCE:
				sequence_RosSubscriberReference(context, (RosSubscriberReference) semanticObject); 
				return; 
			case RossystemPackage.ROS_SYSTEM_CONNECTION:
				sequence_RosSystemConnection(context, (RosSystemConnection) semanticObject); 
				return; 
			case RossystemPackage.ROS_TOPIC_CONNECTION:
				sequence_RosTopicConnection(context, (RosTopicConnection) semanticObject); 
				return; 
			case RossystemPackage.SYSTEM:
				sequence_RosSystem(context, (system.System) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (name=EString (components+=[RosNode|EString] components+=[RosNode|EString]*)? threads=Integer0?)
	 * </pre>
	 */
	protected void sequence_Process(ISerializationContext context, system.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InterfaceReference returns RosActionClientReference
	 *     RosActionClientReference returns RosActionClientReference
	 *
	 * Constraint:
	 *     from=[ActionClient|EString]
	 * </pre>
	 */
	protected void sequence_RosActionClientReference(ISerializationContext context, RosActionClientReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_ACTION_CLIENT_REFERENCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_ACTION_CLIENT_REFERENCE__FROM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientEStringParserRuleCall_2_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_ACTION_CLIENT_REFERENCE__FROM, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Connection returns RosActionConnection
	 *     RosConnection returns RosActionConnection
	 *     RosActionConnection returns RosActionConnection
	 *
	 * Constraint:
	 *     (from=[ActionServer|EString] to=[ActionClient|EString])
	 * </pre>
	 */
	protected void sequence_RosActionConnection(ISerializationContext context, RosActionConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_ACTION_CONNECTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_ACTION_CONNECTION__FROM));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_ACTION_CONNECTION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_ACTION_CONNECTION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosActionConnectionAccess().getFromActionServerEStringParserRuleCall_1_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_ACTION_CONNECTION__FROM, false));
		feeder.accept(grammarAccess.getRosActionConnectionAccess().getToActionClientEStringParserRuleCall_3_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_ACTION_CONNECTION__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InterfaceReference returns RosActionServerReference
	 *     RosActionServerReference returns RosActionServerReference
	 *
	 * Constraint:
	 *     from=[ActionServer|EString]
	 * </pre>
	 */
	protected void sequence_RosActionServerReference(ISerializationContext context, RosActionServerReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_ACTION_SERVER_REFERENCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_ACTION_SERVER_REFERENCE__FROM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerEStringParserRuleCall_2_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_ACTION_SERVER_REFERENCE__FROM, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RosInterface returns RosInterface
	 *
	 * Constraint:
	 *     (name=EString reference=InterfaceReference)
	 * </pre>
	 */
	protected void sequence_RosInterface(ISerializationContext context, RosInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_INTERFACE__NAME));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_INTERFACE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_INTERFACE__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RosNode returns RosNode
	 *
	 * Constraint:
	 *     (name=EString from=[Node|EString] rosinterfaces+=RosInterface* rosparameters+=RosParameter*)
	 * </pre>
	 */
	protected void sequence_RosNode(ISerializationContext context, RosNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RosParameter returns RosParameter
	 *
	 * Constraint:
	 *     (name=EString from=[Parameter|EString] value=ParameterValue)
	 * </pre>
	 */
	protected void sequence_RosParameter(ISerializationContext context, RosParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_PARAMETER__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_PARAMETER__FROM));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_PARAMETER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRosParameterAccess().getFromParameterEStringParserRuleCall_3_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_PARAMETER__FROM, false));
		feeder.accept(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_6_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InterfaceReference returns RosPublisherReference
	 *     RosPublisherReference returns RosPublisherReference
	 *
	 * Constraint:
	 *     from=[Publisher|EString]
	 * </pre>
	 */
	protected void sequence_RosPublisherReference(ISerializationContext context, RosPublisherReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_PUBLISHER_REFERENCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_PUBLISHER_REFERENCE__FROM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherEStringParserRuleCall_2_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_PUBLISHER_REFERENCE__FROM, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InterfaceReference returns RosServiceClientReference
	 *     RosServerClientReference returns RosServiceClientReference
	 *
	 * Constraint:
	 *     from=[ServiceClient|EString]
	 * </pre>
	 */
	protected void sequence_RosServerClientReference(ISerializationContext context, RosServiceClientReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_SERVICE_CLIENT_REFERENCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_SERVICE_CLIENT_REFERENCE__FROM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientEStringParserRuleCall_2_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_SERVICE_CLIENT_REFERENCE__FROM, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Connection returns RosServiceConnection
	 *     RosConnection returns RosServiceConnection
	 *     RosServiceConnection returns RosServiceConnection
	 *
	 * Constraint:
	 *     (from=[ServiceServer|EString] to=[ServiceClient|EString])
	 * </pre>
	 */
	protected void sequence_RosServiceConnection(ISerializationContext context, RosServiceConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_SERVICE_CONNECTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_SERVICE_CONNECTION__FROM));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_SERVICE_CONNECTION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_SERVICE_CONNECTION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosServiceConnectionAccess().getFromServiceServerEStringParserRuleCall_1_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_SERVICE_CONNECTION__FROM, false));
		feeder.accept(grammarAccess.getRosServiceConnectionAccess().getToServiceClientEStringParserRuleCall_3_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_SERVICE_CONNECTION__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InterfaceReference returns RosServiceServerReference
	 *     RosServiceServerReference returns RosServiceServerReference
	 *
	 * Constraint:
	 *     from=[ServiceServer|EString]
	 * </pre>
	 */
	protected void sequence_RosServiceServerReference(ISerializationContext context, RosServiceServerReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_SERVICE_SERVER_REFERENCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_SERVICE_SERVER_REFERENCE__FROM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerEStringParserRuleCall_2_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_SERVICE_SERVER_REFERENCE__FROM, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InterfaceReference returns RosSubscriberReference
	 *     RosSubscriberReference returns RosSubscriberReference
	 *
	 * Constraint:
	 *     from=[Subscriber|EString]
	 * </pre>
	 */
	protected void sequence_RosSubscriberReference(ISerializationContext context, RosSubscriberReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_SUBSCRIBER_REFERENCE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_SUBSCRIBER_REFERENCE__FROM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberEStringParserRuleCall_2_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_SUBSCRIBER_REFERENCE__FROM, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Connection returns RosSystemConnection
	 *     RosSystemConnection returns RosSystemConnection
	 *
	 * Constraint:
	 *     (from=[RosInterface|EString] to=[RosInterface|EString])
	 * </pre>
	 */
	protected void sequence_RosSystemConnection(ISerializationContext context, RosSystemConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_SYSTEM_CONNECTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_SYSTEM_CONNECTION__FROM));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_SYSTEM_CONNECTION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_SYSTEM_CONNECTION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosSystemConnectionAccess().getFromRosInterfaceEStringParserRuleCall_1_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_SYSTEM_CONNECTION__FROM, false));
		feeder.accept(grammarAccess.getRosSystemConnectionAccess().getToRosInterfaceEStringParserRuleCall_3_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_SYSTEM_CONNECTION__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     System returns System
	 *     RosSystem returns System
	 *
	 * Constraint:
	 *     (name=EString (processes+=Process | components+=RosNode | parameter+=RosParameter | connections+=Connection)*)
	 * </pre>
	 */
	protected void sequence_RosSystem(ISerializationContext context, system.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Connection returns RosTopicConnection
	 *     RosConnection returns RosTopicConnection
	 *     RosTopicConnection returns RosTopicConnection
	 *
	 * Constraint:
	 *     (from=[Publisher|EString] to=[Subscriber|EString])
	 * </pre>
	 */
	protected void sequence_RosTopicConnection(ISerializationContext context, RosTopicConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_TOPIC_CONNECTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_TOPIC_CONNECTION__FROM));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ROS_TOPIC_CONNECTION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ROS_TOPIC_CONNECTION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRosTopicConnectionAccess().getFromPublisherEStringParserRuleCall_1_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_TOPIC_CONNECTION__FROM, false));
		feeder.accept(grammarAccess.getRosTopicConnectionAccess().getToSubscriberEStringParserRuleCall_3_0_1(), semanticObject.eGet(RossystemPackage.Literals.ROS_TOPIC_CONNECTION__TO, false));
		feeder.finish();
	}
	
	
}
