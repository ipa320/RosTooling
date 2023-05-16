/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.services.BasicsGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import primitives.ByteArray;
import primitives.Header;
import primitives.MessagePart;
import primitives.PrimitivesPackage;
import primitives.bool;
import primitives.boolArray;
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
import ros.ArrayTopicSpecRef;
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
import ros.TopicSpecRef;

@SuppressWarnings("all")
public class BasicsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

    @Inject
    private BasicsGrammarAccess grammarAccess;

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
            case RosPackage.ARRAY_TOPIC_SPEC_REF:
                sequence_ArrayTopicSpecRef(context, (ArrayTopicSpecRef) semanticObject);
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
            case RosPackage.TOPIC_SPEC_REF:
                sequence_TopicSpecRef(context, (TopicSpecRef) semanticObject);
                return;
            }
        if (errorAcceptor != null)
            errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
    }

    /**
     * <pre>
     * Contexts:
     *     AbstractType returns ArrayTopicSpecRef
     *     ArrayTopicSpecRef returns ArrayTopicSpecRef
     *
     * Constraint:
     *     TopicSpec=[TopicSpec|EString]
     * </pre>
     */
    protected void sequence_ArrayTopicSpecRef(ISerializationContext context, ArrayTopicSpecRef semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.ARRAY_TOPIC_SPEC_REF__TOPIC_SPEC) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.ARRAY_TOPIC_SPEC_REF__TOPIC_SPEC));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_0_1(), semanticObject.eGet(RosPackage.Literals.ARRAY_TOPIC_SPEC_REF__TOPIC_SPEC, false));
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     Namespace returns GlobalNamespace
     *     GlobalNamespace returns GlobalNamespace
     *
     * Constraint:
     *     (parts+=GraphName parts+=GraphName*)?
     * </pre>
     */
    protected void sequence_GlobalNamespace(ISerializationContext context, GlobalNamespace semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns Header
     *     Header returns Header
     *
     * Constraint:
     *     {Header}
     * </pre>
     */
    protected void sequence_Header(ISerializationContext context, Header semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     MessagePart returns MessagePart
     *
     * Constraint:
     *     (Type=AbstractType (Data=KEYWORD | Data=MESSAGE_ASIGMENT | Data=EString))
     * </pre>
     */
    protected void sequence_MessagePart(ISerializationContext context, MessagePart semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterAnyType returns ParameterAnyType
     *
     * Constraint:
     *     default=ParameterAny?
     * </pre>
     */
    protected void sequence_ParameterAnyType(ISerializationContext context, ParameterAnyType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterAny returns ParameterAny
     *
     * Constraint:
     *     value=EString?
     * </pre>
     */
    protected void sequence_ParameterAny(ISerializationContext context, ParameterAny semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterArrayType
     *     ParameterArrayType returns ParameterArrayType
     *
     * Constraint:
     *     (type=ParameterType default=ParameterList?)
     * </pre>
     */
    protected void sequence_ParameterArrayType(ISerializationContext context, ParameterArrayType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterBase64Type
     *     ParameterBase64Type returns ParameterBase64Type
     *
     * Constraint:
     *     default=ParameterBase64?
     * </pre>
     */
    protected void sequence_ParameterBase64Type(ISerializationContext context, ParameterBase64Type semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterValue returns ParameterBase64
     *     ParameterBase64 returns ParameterBase64
     *
     * Constraint:
     *     value=Base64Binary
     * </pre>
     */
    protected void sequence_ParameterBase64(ISerializationContext context, ParameterBase64 semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_BASE64__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_BASE64__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0(), semanticObject.getValue());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterBooleanType
     *     ParameterBooleanType returns ParameterBooleanType
     *
     * Constraint:
     *     default=ParameterBoolean?
     * </pre>
     */
    protected void sequence_ParameterBooleanType(ISerializationContext context, ParameterBooleanType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterValue returns ParameterBoolean
     *     ParameterBoolean returns ParameterBoolean
     *
     * Constraint:
     *     value=boolean0
     * </pre>
     */
    protected void sequence_ParameterBoolean(ISerializationContext context, ParameterBoolean semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_BOOLEAN__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_BOOLEAN__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0(), semanticObject.isValue());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterDateType returns ParameterDateType
     *
     * Constraint:
     *     default=ParameterDate?
     * </pre>
     */
    protected void sequence_ParameterDateType(ISerializationContext context, ParameterDateType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterDate returns ParameterDate
     *
     * Constraint:
     *     value=DateTime0
     * </pre>
     */
    protected void sequence_ParameterDate(ISerializationContext context, ParameterDate semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_DATE__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_DATE__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0(), semanticObject.getValue());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterDoubleType
     *     ParameterDoubleType returns ParameterDoubleType
     *
     * Constraint:
     *     default=ParameterDouble?
     * </pre>
     */
    protected void sequence_ParameterDoubleType(ISerializationContext context, ParameterDoubleType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterValue returns ParameterDouble
     *     ParameterDouble returns ParameterDouble
     *
     * Constraint:
     *     value=Double0
     * </pre>
     */
    protected void sequence_ParameterDouble(ISerializationContext context, ParameterDouble semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_DOUBLE__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_DOUBLE__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0(), semanticObject.getValue());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterIntegerType
     *     ParameterIntegerType returns ParameterIntegerType
     *
     * Constraint:
     *     default=ParameterInteger?
     * </pre>
     */
    protected void sequence_ParameterIntegerType(ISerializationContext context, ParameterIntegerType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterValue returns ParameterInteger
     *     ParameterInteger returns ParameterInteger
     *
     * Constraint:
     *     value=Integer0
     * </pre>
     */
    protected void sequence_ParameterInteger(ISerializationContext context, ParameterInteger semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_INTEGER__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_INTEGER__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0(), semanticObject.getValue());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterListType
     *     ParameterListType returns ParameterListType
     *
     * Constraint:
     *     (sequence+=ParameterType sequence+=ParameterType*)
     * </pre>
     */
    protected void sequence_ParameterListType(ISerializationContext context, ParameterListType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterValue returns ParameterSequence
     *     ParameterList returns ParameterSequence
     *
     * Constraint:
     *     (value+=ParameterValue value+=ParameterValue*)
     * </pre>
     */
    protected void sequence_ParameterList(ISerializationContext context, ParameterSequence semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterStringType
     *     ParameterStringType returns ParameterStringType
     *
     * Constraint:
     *     default=ParameterString?
     * </pre>
     */
    protected void sequence_ParameterStringType(ISerializationContext context, ParameterStringType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterValue returns ParameterString
     *     ParameterString returns ParameterString
     *
     * Constraint:
     *     value=EString
     * </pre>
     */
    protected void sequence_ParameterString(ISerializationContext context, ParameterString semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRING__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRING__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterStructMember returns ParameterStructMember
     *
     * Constraint:
     *     (name=EString value=ParameterValue)
     * </pre>
     */
    protected void sequence_ParameterStructMember(ISerializationContext context, ParameterStructMember semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__NAME) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__NAME));
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
        feeder.accept(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0(), semanticObject.getValue());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterStructTypeMember returns ParameterStructTypeMember
     *
     * Constraint:
     *     (name=EString type=ParameterType)
     * </pre>
     */
    protected void sequence_ParameterStructTypeMember(ISerializationContext context, ParameterStructTypeMember semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__NAME) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__NAME));
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__TYPE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_TYPE_MEMBER__TYPE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
        feeder.accept(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0(), semanticObject.getType());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterType returns ParameterStructType
     *     ParameterStructType returns ParameterStructType
     *
     * Constraint:
     *     (parameterstructypetmember+=ParameterStructTypeMember parameterstructypetmember+=ParameterStructTypeMember*)
     * </pre>
     */
    protected void sequence_ParameterStructType(ISerializationContext context, ParameterStructType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     ParameterValue returns ParameterStruct
     *     ParameterStruct returns ParameterStruct
     *
     * Constraint:
     *     (value+=ParameterStructMember value+=ParameterStructMember*)?
     * </pre>
     */
    protected void sequence_ParameterStruct(ISerializationContext context, ParameterStruct semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     Parameter returns Parameter
     *
     * Constraint:
     *     (name=EString namespace=Namespace? type=ParameterType value=ParameterValue?)
     * </pre>
     */
    protected void sequence_Parameter(ISerializationContext context, ros.Parameter semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     Namespace returns PrivateNamespace
     *     PrivateNamespace returns PrivateNamespace
     *
     * Constraint:
     *     (parts+=GraphName parts+=GraphName*)?
     * </pre>
     */
    protected void sequence_PrivateNamespace(ISerializationContext context, PrivateNamespace semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     Namespace returns RelativeNamespace
     *     RelativeNamespace_Impl returns RelativeNamespace
     *
     * Constraint:
     *     (parts+=GraphName parts+=GraphName*)?
     * </pre>
     */
    protected void sequence_RelativeNamespace_Impl(ISerializationContext context, RelativeNamespace semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns TopicSpecRef
     *     TopicSpecRef returns TopicSpecRef
     *
     * Constraint:
     *     TopicSpec=[TopicSpec|EString]
     * </pre>
     */
    protected void sequence_TopicSpecRef(ISerializationContext context, TopicSpecRef semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.TOPIC_SPEC_REF__TOPIC_SPEC) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.TOPIC_SPEC_REF__TOPIC_SPEC));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_1(), semanticObject.eGet(RosPackage.Literals.TOPIC_SPEC_REF__TOPIC_SPEC, false));
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns boolArray
     *     boolArray returns boolArray
     *
     * Constraint:
     *     {boolArray}
     * </pre>
     */
    protected void sequence_boolArray(ISerializationContext context, boolArray semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns bool
     *     bool returns bool
     *
     * Constraint:
     *     {bool}
     * </pre>
     */
    protected void sequence_bool(ISerializationContext context, bool semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns ByteArray
     *     byteArray returns ByteArray
     *
     * Constraint:
     *     {ByteArray}
     * </pre>
     */
    protected void sequence_byteArray(ISerializationContext context, ByteArray semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns Byte
     *     byte returns Byte
     *
     * Constraint:
     *     {Byte}
     * </pre>
     */
    protected void sequence_byte(ISerializationContext context, primitives.Byte semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns duration
     *     duration returns duration
     *
     * Constraint:
     *     {duration}
     * </pre>
     */
    protected void sequence_duration(ISerializationContext context, duration semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns float32Array
     *     float32Array returns float32Array
     *
     * Constraint:
     *     {float32Array}
     * </pre>
     */
    protected void sequence_float32Array(ISerializationContext context, float32Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns float32
     *     float32 returns float32
     *
     * Constraint:
     *     {float32}
     * </pre>
     */
    protected void sequence_float32(ISerializationContext context, float32 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns float64Array
     *     float64Array returns float64Array
     *
     * Constraint:
     *     {float64Array}
     * </pre>
     */
    protected void sequence_float64Array(ISerializationContext context, float64Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns float64
     *     float64 returns float64
     *
     * Constraint:
     *     {float64}
     * </pre>
     */
    protected void sequence_float64(ISerializationContext context, float64 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int16Array
     *     int16Array returns int16Array
     *
     * Constraint:
     *     {int16Array}
     * </pre>
     */
    protected void sequence_int16Array(ISerializationContext context, int16Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int16
     *     int16 returns int16
     *
     * Constraint:
     *     {int16}
     * </pre>
     */
    protected void sequence_int16(ISerializationContext context, int16 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int32Array
     *     int32Array returns int32Array
     *
     * Constraint:
     *     {int32Array}
     * </pre>
     */
    protected void sequence_int32Array(ISerializationContext context, int32Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int32
     *     int32 returns int32
     *
     * Constraint:
     *     {int32}
     * </pre>
     */
    protected void sequence_int32(ISerializationContext context, int32 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int64Array
     *     int64Array returns int64Array
     *
     * Constraint:
     *     {int64Array}
     * </pre>
     */
    protected void sequence_int64Array(ISerializationContext context, int64Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int64
     *     int64 returns int64
     *
     * Constraint:
     *     {int64}
     * </pre>
     */
    protected void sequence_int64(ISerializationContext context, int64 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int8Array
     *     int8Array returns int8Array
     *
     * Constraint:
     *     {int8Array}
     * </pre>
     */
    protected void sequence_int8Array(ISerializationContext context, int8Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns int8
     *     int8 returns int8
     *
     * Constraint:
     *     {int8}
     * </pre>
     */
    protected void sequence_int8(ISerializationContext context, int8 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns stringArray
     *     string0Array returns stringArray
     *
     * Constraint:
     *     {stringArray}
     * </pre>
     */
    protected void sequence_string0Array(ISerializationContext context, stringArray semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns string
     *     string0 returns string
     *
     * Constraint:
     *     {string}
     * </pre>
     */
    protected void sequence_string0(ISerializationContext context, string semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns time
     *     time returns time
     *
     * Constraint:
     *     {time}
     * </pre>
     */
    protected void sequence_time(ISerializationContext context, time semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint16Array
     *     uint16Array returns uint16Array
     *
     * Constraint:
     *     {uint16Array}
     * </pre>
     */
    protected void sequence_uint16Array(ISerializationContext context, uint16Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint16
     *     uint16 returns uint16
     *
     * Constraint:
     *     {uint16}
     * </pre>
     */
    protected void sequence_uint16(ISerializationContext context, uint16 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint32Array
     *     uint32Array returns uint32Array
     *
     * Constraint:
     *     {uint32Array}
     * </pre>
     */
    protected void sequence_uint32Array(ISerializationContext context, uint32Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint32
     *     uint32 returns uint32
     *
     * Constraint:
     *     {uint32}
     * </pre>
     */
    protected void sequence_uint32(ISerializationContext context, uint32 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint64Array
     *     uint64Array returns uint64Array
     *
     * Constraint:
     *     {uint64Array}
     * </pre>
     */
    protected void sequence_uint64Array(ISerializationContext context, uint64Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint64
     *     uint64 returns uint64
     *
     * Constraint:
     *     {uint64}
     * </pre>
     */
    protected void sequence_uint64(ISerializationContext context, uint64 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint8Array
     *     uint8Array returns uint8Array
     *
     * Constraint:
     *     {uint8Array}
     * </pre>
     */
    protected void sequence_uint8Array(ISerializationContext context, uint8Array semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractType returns uint8
     *     uint8 returns uint8
     *
     * Constraint:
     *     {uint8}
     * </pre>
     */
    protected void sequence_uint8(ISerializationContext context, uint8 semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


}
