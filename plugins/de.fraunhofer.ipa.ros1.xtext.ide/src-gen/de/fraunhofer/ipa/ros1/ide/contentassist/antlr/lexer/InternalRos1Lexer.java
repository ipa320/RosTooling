package de.fraunhofer.ipa.ros1.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRos1Lexer extends Lexer {
    public static final int Float32_1=22;
    public static final int Node=79;
    public static final int RULE_DATE_TIME=100;
    public static final int Uint64_1=32;
    public static final int String=50;
    public static final int Int16=64;
    public static final int Float32=37;
    public static final int Goal=75;
    public static final int Bool=73;
    public static final int Uint16=59;
    public static final int Boolean=33;
    public static final int ExternalDependency=5;
    public static final int Uint8=69;
    public static final int Parameters=17;
    public static final int RULE_ID=101;
    public static final int Actionclient=11;
    public static final int RULE_DIGIT=90;
    public static final int GlobalNamespace=8;
    public static final int Artifacts=19;
    public static final int Node_1=67;
    public static final int Int16_1=39;
    public static final int Header=49;
    public static final int RULE_INT=103;
    public static final int Byte=74;
    public static final int RULE_ML_COMMENT=110;
    public static final int LeftSquareBracket=88;
    public static final int Specs=57;
    public static final int Base64=47;
    public static final int Message_1=27;
    public static final int Comma=86;
    public static final int RULE_MESSAGE_ASIGMENT=104;
    public static final int Goal_1=63;
    public static final int LeftSquareBracketRightSquareBracket=85;
    public static final int Int32=65;
    public static final int Publishers=18;
    public static final int Serviceserver=10;
    public static final int RULE_DECINT=93;
    public static final int Uint32=60;
    public static final int FromGitRepo=15;
    public static final int Msg=77;
    public static final int RULE_HOUR=98;
    public static final int Int8=76;
    public static final int Default=36;
    public static final int Actionserver=12;
    public static final int Int8_1=55;
    public static final int Uint16_1=30;
    public static final int Type=82;
    public static final int Float64=38;
    public static final int Int32_1=40;
    public static final int Result_1=43;
    public static final int RULE_BINARY=91;
    public static final int String_1=58;
    public static final int Subscribers=16;
    public static final int String_2=29;
    public static final int RULE_DAY=95;
    public static final int RULE_BEGIN=105;
    public static final int RULE_BOOLEAN=92;
    public static final int RelativeNamespace=6;
    public static final int RULE_YEAR=97;
    public static final int Feedback_1=21;
    public static final int Result=56;
    public static final int Name=78;
    public static final int RULE_MIN_SEC=99;
    public static final int ParameterAny=14;
    public static final int List=72;
    public static final int Dependencies=13;
    public static final int RightSquareBracket=89;
    public static final int PrivateNamespace=7;
    public static final int GraphName=20;
    public static final int Byte_1=54;
    public static final int Float64_1=23;
    public static final int Duration=25;
    public static final int Uint32_1=31;
    public static final int Action_1=35;
    public static final int Double=48;
    public static final int Type_1=68;
    public static final int Value=70;
    public static final int Uint64=61;
    public static final int Action=52;
    public static final int RULE_END=106;
    public static final int Message=42;
    public static final int Value_1=62;
    public static final int Time=81;
    public static final int RULE_STRING=102;
    public static final int Bool_1=53;
    public static final int Any=83;
    public static final int Struct=51;
    public static final int RULE_SL_COMMENT=107;
    public static final int Uint8_1=45;
    public static final int RULE_DOUBLE=94;
    public static final int Feedback=26;
    public static final int ParameterStructMember=4;
    public static final int Srv=80;
    public static final int RULE_ROS_CONVENTION_A=108;
    public static final int RULE_ROS_CONVENTION_PARAM=109;
    public static final int Colon=87;
    public static final int EOF=-1;
    public static final int Ns=84;
    public static final int RULE_WS=111;
    public static final int Request=28;
    public static final int Int64_1=41;
    public static final int Service=44;
    public static final int RULE_ANY_OTHER=112;
    public static final int Date=71;
    public static final int Response=24;
    public static final int Integer=34;
    public static final int Array=46;
    public static final int Serviceclient=9;
    public static final int Int64=66;
    public static final int RULE_MONTH=96;

    // delegates
    // delegators

    public InternalRos1Lexer() {;}
    public InternalRos1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRos1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRos1Lexer.g"; }

    // $ANTLR start "ParameterStructMember"
    public final void mParameterStructMember() throws RecognitionException {
        try {
            int _type = ParameterStructMember;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:14:23: ( 'ParameterStructMember' )
            // InternalRos1Lexer.g:14:25: 'ParameterStructMember'
            {
            match("ParameterStructMember");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParameterStructMember"

    // $ANTLR start "ExternalDependency"
    public final void mExternalDependency() throws RecognitionException {
        try {
            int _type = ExternalDependency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:16:20: ( 'ExternalDependency' )
            // InternalRos1Lexer.g:16:22: 'ExternalDependency'
            {
            match("ExternalDependency");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExternalDependency"

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:18:19: ( 'RelativeNamespace' )
            // InternalRos1Lexer.g:18:21: 'RelativeNamespace'
            {
            match("RelativeNamespace");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RelativeNamespace"

    // $ANTLR start "PrivateNamespace"
    public final void mPrivateNamespace() throws RecognitionException {
        try {
            int _type = PrivateNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:20:18: ( 'PrivateNamespace' )
            // InternalRos1Lexer.g:20:20: 'PrivateNamespace'
            {
            match("PrivateNamespace");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PrivateNamespace"

    // $ANTLR start "GlobalNamespace"
    public final void mGlobalNamespace() throws RecognitionException {
        try {
            int _type = GlobalNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:22:17: ( 'GlobalNamespace' )
            // InternalRos1Lexer.g:22:19: 'GlobalNamespace'
            {
            match("GlobalNamespace");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GlobalNamespace"

    // $ANTLR start "Serviceclient"
    public final void mServiceclient() throws RecognitionException {
        try {
            int _type = Serviceclient;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:24:15: ( 'serviceclient:' )
            // InternalRos1Lexer.g:24:17: 'serviceclient:'
            {
            match("serviceclient:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Serviceclient"

    // $ANTLR start "Serviceserver"
    public final void mServiceserver() throws RecognitionException {
        try {
            int _type = Serviceserver;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:26:15: ( 'serviceserver:' )
            // InternalRos1Lexer.g:26:17: 'serviceserver:'
            {
            match("serviceserver:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Serviceserver"

    // $ANTLR start "Actionclient"
    public final void mActionclient() throws RecognitionException {
        try {
            int _type = Actionclient;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:28:14: ( 'actionclient:' )
            // InternalRos1Lexer.g:28:16: 'actionclient:'
            {
            match("actionclient:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actionclient"

    // $ANTLR start "Actionserver"
    public final void mActionserver() throws RecognitionException {
        try {
            int _type = Actionserver;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:30:14: ( 'actionserver:' )
            // InternalRos1Lexer.g:30:16: 'actionserver:'
            {
            match("actionserver:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actionserver"

    // $ANTLR start "Dependencies"
    public final void mDependencies() throws RecognitionException {
        try {
            int _type = Dependencies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:32:14: ( 'dependencies:' )
            // InternalRos1Lexer.g:32:16: 'dependencies:'
            {
            match("dependencies:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dependencies"

    // $ANTLR start "ParameterAny"
    public final void mParameterAny() throws RecognitionException {
        try {
            int _type = ParameterAny;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:34:14: ( 'ParameterAny' )
            // InternalRos1Lexer.g:34:16: 'ParameterAny'
            {
            match("ParameterAny");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParameterAny"

    // $ANTLR start "FromGitRepo"
    public final void mFromGitRepo() throws RecognitionException {
        try {
            int _type = FromGitRepo;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:36:13: ( 'fromGitRepo:' )
            // InternalRos1Lexer.g:36:15: 'fromGitRepo:'
            {
            match("fromGitRepo:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromGitRepo"

    // $ANTLR start "Subscribers"
    public final void mSubscribers() throws RecognitionException {
        try {
            int _type = Subscribers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:38:13: ( 'subscribers:' )
            // InternalRos1Lexer.g:38:15: 'subscribers:'
            {
            match("subscribers:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subscribers"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:40:12: ( 'parameters:' )
            // InternalRos1Lexer.g:40:14: 'parameters:'
            {
            match("parameters:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Publishers"
    public final void mPublishers() throws RecognitionException {
        try {
            int _type = Publishers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:42:12: ( 'publishers:' )
            // InternalRos1Lexer.g:42:14: 'publishers:'
            {
            match("publishers:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Publishers"

    // $ANTLR start "Artifacts"
    public final void mArtifacts() throws RecognitionException {
        try {
            int _type = Artifacts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:44:11: ( 'artifacts:' )
            // InternalRos1Lexer.g:44:13: 'artifacts:'
            {
            match("artifacts:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Artifacts"

    // $ANTLR start "GraphName"
    public final void mGraphName() throws RecognitionException {
        try {
            int _type = GraphName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:46:11: ( 'GraphName' )
            // InternalRos1Lexer.g:46:13: 'GraphName'
            {
            match("GraphName");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GraphName"

    // $ANTLR start "Feedback_1"
    public final void mFeedback_1() throws RecognitionException {
        try {
            int _type = Feedback_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:48:12: ( 'feedback:' )
            // InternalRos1Lexer.g:48:14: 'feedback:'
            {
            match("feedback:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Feedback_1"

    // $ANTLR start "Float32_1"
    public final void mFloat32_1() throws RecognitionException {
        try {
            int _type = Float32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:50:11: ( 'float32[]' )
            // InternalRos1Lexer.g:50:13: 'float32[]'
            {
            match("float32[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32_1"

    // $ANTLR start "Float64_1"
    public final void mFloat64_1() throws RecognitionException {
        try {
            int _type = Float64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:52:11: ( 'float64[]' )
            // InternalRos1Lexer.g:52:13: 'float64[]'
            {
            match("float64[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64_1"

    // $ANTLR start "Response"
    public final void mResponse() throws RecognitionException {
        try {
            int _type = Response;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:54:10: ( 'response:' )
            // InternalRos1Lexer.g:54:12: 'response:'
            {
            match("response:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Response"

    // $ANTLR start "Duration"
    public final void mDuration() throws RecognitionException {
        try {
            int _type = Duration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:56:10: ( 'duration' )
            // InternalRos1Lexer.g:56:12: 'duration'
            {
            match("duration");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Duration"

    // $ANTLR start "Feedback"
    public final void mFeedback() throws RecognitionException {
        try {
            int _type = Feedback;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:58:10: ( 'feedback' )
            // InternalRos1Lexer.g:58:12: 'feedback'
            {
            match("feedback");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Feedback"

    // $ANTLR start "Message_1"
    public final void mMessage_1() throws RecognitionException {
        try {
            int _type = Message_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:60:11: ( 'message:' )
            // InternalRos1Lexer.g:60:13: 'message:'
            {
            match("message:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message_1"

    // $ANTLR start "Request"
    public final void mRequest() throws RecognitionException {
        try {
            int _type = Request;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:62:9: ( 'request:' )
            // InternalRos1Lexer.g:62:11: 'request:'
            {
            match("request:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Request"

    // $ANTLR start "String_2"
    public final void mString_2() throws RecognitionException {
        try {
            int _type = String_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:64:10: ( 'string[]' )
            // InternalRos1Lexer.g:64:12: 'string[]'
            {
            match("string[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_2"

    // $ANTLR start "Uint16_1"
    public final void mUint16_1() throws RecognitionException {
        try {
            int _type = Uint16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:66:10: ( 'uint16[]' )
            // InternalRos1Lexer.g:66:12: 'uint16[]'
            {
            match("uint16[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16_1"

    // $ANTLR start "Uint32_1"
    public final void mUint32_1() throws RecognitionException {
        try {
            int _type = Uint32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:68:10: ( 'uint32[]' )
            // InternalRos1Lexer.g:68:12: 'uint32[]'
            {
            match("uint32[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32_1"

    // $ANTLR start "Uint64_1"
    public final void mUint64_1() throws RecognitionException {
        try {
            int _type = Uint64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:70:10: ( 'uint64[]' )
            // InternalRos1Lexer.g:70:12: 'uint64[]'
            {
            match("uint64[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64_1"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:72:9: ( 'Boolean' )
            // InternalRos1Lexer.g:72:11: 'Boolean'
            {
            match("Boolean");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:74:9: ( 'Integer' )
            // InternalRos1Lexer.g:74:11: 'Integer'
            {
            match("Integer");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Action_1"
    public final void mAction_1() throws RecognitionException {
        try {
            int _type = Action_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:76:10: ( 'action:' )
            // InternalRos1Lexer.g:76:12: 'action:'
            {
            match("action:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Action_1"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:78:9: ( 'default' )
            // InternalRos1Lexer.g:78:11: 'default'
            {
            match("default");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:80:9: ( 'float32' )
            // InternalRos1Lexer.g:80:11: 'float32'
            {
            match("float32");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32"

    // $ANTLR start "Float64"
    public final void mFloat64() throws RecognitionException {
        try {
            int _type = Float64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:82:9: ( 'float64' )
            // InternalRos1Lexer.g:82:11: 'float64'
            {
            match("float64");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64"

    // $ANTLR start "Int16_1"
    public final void mInt16_1() throws RecognitionException {
        try {
            int _type = Int16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:84:9: ( 'int16[]' )
            // InternalRos1Lexer.g:84:11: 'int16[]'
            {
            match("int16[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16_1"

    // $ANTLR start "Int32_1"
    public final void mInt32_1() throws RecognitionException {
        try {
            int _type = Int32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:86:9: ( 'int32[]' )
            // InternalRos1Lexer.g:86:11: 'int32[]'
            {
            match("int32[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32_1"

    // $ANTLR start "Int64_1"
    public final void mInt64_1() throws RecognitionException {
        try {
            int _type = Int64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:88:9: ( 'int64[]' )
            // InternalRos1Lexer.g:88:11: 'int64[]'
            {
            match("int64[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64_1"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:90:9: ( 'message' )
            // InternalRos1Lexer.g:90:11: 'message'
            {
            match("message");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "Result_1"
    public final void mResult_1() throws RecognitionException {
        try {
            int _type = Result_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:92:10: ( 'result:' )
            // InternalRos1Lexer.g:92:12: 'result:'
            {
            match("result:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Result_1"

    // $ANTLR start "Service"
    public final void mService() throws RecognitionException {
        try {
            int _type = Service;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:94:9: ( 'service' )
            // InternalRos1Lexer.g:94:11: 'service'
            {
            match("service");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Service"

    // $ANTLR start "Uint8_1"
    public final void mUint8_1() throws RecognitionException {
        try {
            int _type = Uint8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:96:9: ( 'uint8[]' )
            // InternalRos1Lexer.g:96:11: 'uint8[]'
            {
            match("uint8[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8_1"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:98:7: ( 'Array:' )
            // InternalRos1Lexer.g:98:9: 'Array:'
            {
            match("Array:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "Base64"
    public final void mBase64() throws RecognitionException {
        try {
            int _type = Base64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:100:8: ( 'Base64' )
            // InternalRos1Lexer.g:100:10: 'Base64'
            {
            match("Base64");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Base64"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:102:8: ( 'Double' )
            // InternalRos1Lexer.g:102:10: 'Double'
            {
            match("Double");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Double"

    // $ANTLR start "Header"
    public final void mHeader() throws RecognitionException {
        try {
            int _type = Header;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:104:8: ( 'Header' )
            // InternalRos1Lexer.g:104:10: 'Header'
            {
            match("Header");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Header"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:106:8: ( 'String' )
            // InternalRos1Lexer.g:106:10: 'String'
            {
            match("String");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Struct"
    public final void mStruct() throws RecognitionException {
        try {
            int _type = Struct;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:108:8: ( 'Struct' )
            // InternalRos1Lexer.g:108:10: 'Struct'
            {
            match("Struct");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Struct"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:110:8: ( 'action' )
            // InternalRos1Lexer.g:110:10: 'action'
            {
            match("action");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Bool_1"
    public final void mBool_1() throws RecognitionException {
        try {
            int _type = Bool_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:112:8: ( 'bool[]' )
            // InternalRos1Lexer.g:112:10: 'bool[]'
            {
            match("bool[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool_1"

    // $ANTLR start "Byte_1"
    public final void mByte_1() throws RecognitionException {
        try {
            int _type = Byte_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:114:8: ( 'byte[]' )
            // InternalRos1Lexer.g:114:10: 'byte[]'
            {
            match("byte[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte_1"

    // $ANTLR start "Int8_1"
    public final void mInt8_1() throws RecognitionException {
        try {
            int _type = Int8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:116:8: ( 'int8[]' )
            // InternalRos1Lexer.g:116:10: 'int8[]'
            {
            match("int8[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8_1"

    // $ANTLR start "Result"
    public final void mResult() throws RecognitionException {
        try {
            int _type = Result;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:118:8: ( 'result' )
            // InternalRos1Lexer.g:118:10: 'result'
            {
            match("result");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Result"

    // $ANTLR start "Specs"
    public final void mSpecs() throws RecognitionException {
        try {
            int _type = Specs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:120:7: ( 'specs:' )
            // InternalRos1Lexer.g:120:9: 'specs:'
            {
            match("specs:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Specs"

    // $ANTLR start "String_1"
    public final void mString_1() throws RecognitionException {
        try {
            int _type = String_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:122:10: ( 'string' )
            // InternalRos1Lexer.g:122:12: 'string'
            {
            match("string");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_1"

    // $ANTLR start "Uint16"
    public final void mUint16() throws RecognitionException {
        try {
            int _type = Uint16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:124:8: ( 'uint16' )
            // InternalRos1Lexer.g:124:10: 'uint16'
            {
            match("uint16");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16"

    // $ANTLR start "Uint32"
    public final void mUint32() throws RecognitionException {
        try {
            int _type = Uint32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:126:8: ( 'uint32' )
            // InternalRos1Lexer.g:126:10: 'uint32'
            {
            match("uint32");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32"

    // $ANTLR start "Uint64"
    public final void mUint64() throws RecognitionException {
        try {
            int _type = Uint64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:128:8: ( 'uint64' )
            // InternalRos1Lexer.g:128:10: 'uint64'
            {
            match("uint64");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64"

    // $ANTLR start "Value_1"
    public final void mValue_1() throws RecognitionException {
        try {
            int _type = Value_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:130:9: ( 'value:' )
            // InternalRos1Lexer.g:130:11: 'value:'
            {
            match("value:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value_1"

    // $ANTLR start "Goal_1"
    public final void mGoal_1() throws RecognitionException {
        try {
            int _type = Goal_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:132:8: ( 'goal:' )
            // InternalRos1Lexer.g:132:10: 'goal:'
            {
            match("goal:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Goal_1"

    // $ANTLR start "Int16"
    public final void mInt16() throws RecognitionException {
        try {
            int _type = Int16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:134:7: ( 'int16' )
            // InternalRos1Lexer.g:134:9: 'int16'
            {
            match("int16");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16"

    // $ANTLR start "Int32"
    public final void mInt32() throws RecognitionException {
        try {
            int _type = Int32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:136:7: ( 'int32' )
            // InternalRos1Lexer.g:136:9: 'int32'
            {
            match("int32");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32"

    // $ANTLR start "Int64"
    public final void mInt64() throws RecognitionException {
        try {
            int _type = Int64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:138:7: ( 'int64' )
            // InternalRos1Lexer.g:138:9: 'int64'
            {
            match("int64");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64"

    // $ANTLR start "Node_1"
    public final void mNode_1() throws RecognitionException {
        try {
            int _type = Node_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:140:8: ( 'node:' )
            // InternalRos1Lexer.g:140:10: 'node:'
            {
            match("node:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Node_1"

    // $ANTLR start "Type_1"
    public final void mType_1() throws RecognitionException {
        try {
            int _type = Type_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:142:8: ( 'type:' )
            // InternalRos1Lexer.g:142:10: 'type:'
            {
            match("type:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type_1"

    // $ANTLR start "Uint8"
    public final void mUint8() throws RecognitionException {
        try {
            int _type = Uint8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:144:7: ( 'uint8' )
            // InternalRos1Lexer.g:144:9: 'uint8'
            {
            match("uint8");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:146:7: ( 'value' )
            // InternalRos1Lexer.g:146:9: 'value'
            {
            match("value");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:148:6: ( 'Date' )
            // InternalRos1Lexer.g:148:8: 'Date'
            {
            match("Date");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "List"
    public final void mList() throws RecognitionException {
        try {
            int _type = List;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:150:6: ( 'List' )
            // InternalRos1Lexer.g:150:8: 'List'
            {
            match("List");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "List"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:152:6: ( 'bool' )
            // InternalRos1Lexer.g:152:8: 'bool'
            {
            match("bool");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Byte"
    public final void mByte() throws RecognitionException {
        try {
            int _type = Byte;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:154:6: ( 'byte' )
            // InternalRos1Lexer.g:154:8: 'byte'
            {
            match("byte");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte"

    // $ANTLR start "Goal"
    public final void mGoal() throws RecognitionException {
        try {
            int _type = Goal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:156:6: ( 'goal' )
            // InternalRos1Lexer.g:156:8: 'goal'
            {
            match("goal");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Goal"

    // $ANTLR start "Int8"
    public final void mInt8() throws RecognitionException {
        try {
            int _type = Int8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:158:6: ( 'int8' )
            // InternalRos1Lexer.g:158:8: 'int8'
            {
            match("int8");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8"

    // $ANTLR start "Msg"
    public final void mMsg() throws RecognitionException {
        try {
            int _type = Msg;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:160:5: ( 'msg:' )
            // InternalRos1Lexer.g:160:7: 'msg:'
            {
            match("msg:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Msg"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:162:6: ( 'name' )
            // InternalRos1Lexer.g:162:8: 'name'
            {
            match("name");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Node"
    public final void mNode() throws RecognitionException {
        try {
            int _type = Node;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:164:6: ( 'node' )
            // InternalRos1Lexer.g:164:8: 'node'
            {
            match("node");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Node"

    // $ANTLR start "Srv"
    public final void mSrv() throws RecognitionException {
        try {
            int _type = Srv;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:166:5: ( 'srv:' )
            // InternalRos1Lexer.g:166:7: 'srv:'
            {
            match("srv:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Srv"

    // $ANTLR start "Time"
    public final void mTime() throws RecognitionException {
        try {
            int _type = Time;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:168:6: ( 'time' )
            // InternalRos1Lexer.g:168:8: 'time'
            {
            match("time");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Time"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:170:6: ( 'type' )
            // InternalRos1Lexer.g:170:8: 'type'
            {
            match("type");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Any"
    public final void mAny() throws RecognitionException {
        try {
            int _type = Any;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:172:5: ( 'Any' )
            // InternalRos1Lexer.g:172:7: 'Any'
            {
            match("Any");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Any"

    // $ANTLR start "Ns"
    public final void mNs() throws RecognitionException {
        try {
            int _type = Ns;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:174:4: ( 'ns:' )
            // InternalRos1Lexer.g:174:6: 'ns:'
            {
            match("ns:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ns"

    // $ANTLR start "LeftSquareBracketRightSquareBracket"
    public final void mLeftSquareBracketRightSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracketRightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:176:37: ( '[]' )
            // InternalRos1Lexer.g:176:39: '[]'
            {
            match("[]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracketRightSquareBracket"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:178:7: ( ',' )
            // InternalRos1Lexer.g:178:9: ','
            {
            match(',');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:180:7: ( ':' )
            // InternalRos1Lexer.g:180:9: ':'
            {
            match(':');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:182:19: ( '[' )
            // InternalRos1Lexer.g:182:21: '['
            {
            match('[');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:184:20: ( ']' )
            // InternalRos1Lexer.g:184:22: ']'
            {
            match(']');

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:186:21: ( '0' .. '9' )
            // InternalRos1Lexer.g:186:23: '0' .. '9'
            {
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:188:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRos1Lexer.g:188:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRos1Lexer.g:188:15: ( '0b' | '0B' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='b') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='B') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRos1Lexer.g:188:16: '0b'
                    {
                    match("0b");


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:188:21: '0B'
                    {
                    match("0B");


                    }
                    break;

            }

            // InternalRos1Lexer.g:188:27: ( '0' | '1' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='1')) ) {
                    alt2=1;
                }


                switch (alt2) {
                case 1 :
                    // InternalRos1Lexer.g:
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

                default :
                    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:190:14: ( ( 'true' | 'false' ) )
            // InternalRos1Lexer.g:190:16: ( 'true' | 'false' )
            {
            // InternalRos1Lexer.g:190:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos1Lexer.g:190:17: 'true'
                    {
                    match("true");


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:190:24: 'false'
                    {
                    match("false");


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:192:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRos1Lexer.g:192:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT();
            // InternalRos1Lexer.g:192:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRos1Lexer.g:192:27: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalRos1Lexer.g:192:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // InternalRos1Lexer.g:192:31: RULE_DECINT
                            {
                            mRULE_DECINT();

                            }
                            break;

                        default :
                            break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:192:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRos1Lexer.g:192:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRos1Lexer.g:192:45: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalRos1Lexer.g:192:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                                case 1 :
                                    // InternalRos1Lexer.g:192:49: RULE_DIGIT
                                    {
                                    mRULE_DIGIT();

                                    }
                                    break;

                                default :
                                    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalRos1Lexer.g:192:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRos1Lexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DIGIT();

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:194:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRos1Lexer.g:194:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRos1Lexer.g:194:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt11=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt11=2;
                }
                break;
            case '-':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRos1Lexer.g:194:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:194:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalRos1Lexer.g:194:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                        case 1 :
                            // InternalRos1Lexer.g:194:29: RULE_DIGIT
                            {
                            mRULE_DIGIT();

                            }
                            break;

                        default :
                            break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalRos1Lexer.g:194:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalRos1Lexer.g:194:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                        case 1 :
                            // InternalRos1Lexer.g:194:54: RULE_DIGIT
                            {
                            mRULE_DIGIT();

                            }
                            break;

                        default :
                            break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_DAY"
    public final void mRULE_DAY() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:196:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRos1Lexer.g:196:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRos1Lexer.g:196:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='1' && LA12_0<='3')) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='9')) ) {
                    alt12=2;
                }
                else {
                    alt12=1;}
            }
            else if ( ((LA12_0>='4' && LA12_0<='9')) ) {
                alt12=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRos1Lexer.g:196:22: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:196:31: '1' .. '3' '0' .. '9'
                    {
                    matchRange('1','3');
                    matchRange('0','9');

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAY"

    // $ANTLR start "RULE_MONTH"
    public final void mRULE_MONTH() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:198:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRos1Lexer.g:198:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRos1Lexer.g:198:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='1') ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='2')) ) {
                    alt13=2;
                }
                else {
                    alt13=1;}
            }
            else if ( ((LA13_0>='2' && LA13_0<='9')) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRos1Lexer.g:198:24: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:198:33: '1' '0' .. '2'
                    {
                    match('1');
                    matchRange('0','2');

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MONTH"

    // $ANTLR start "RULE_YEAR"
    public final void mRULE_YEAR() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:200:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRos1Lexer.g:200:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','2');
            matchRange('0','9');
            matchRange('0','9');
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_YEAR"

    // $ANTLR start "RULE_HOUR"
    public final void mRULE_HOUR() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:202:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRos1Lexer.g:202:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRos1Lexer.g:202:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='0' && LA14_0<='1')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='2') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRos1Lexer.g:202:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1');
                    matchRange('0','9');

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:202:41: '2' '0' .. '3'
                    {
                    match('2');
                    matchRange('0','3');

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOUR"

    // $ANTLR start "RULE_MIN_SEC"
    public final void mRULE_MIN_SEC() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:204:23: ( '0' .. '5' '0' .. '9' )
            // InternalRos1Lexer.g:204:25: '0' .. '5' '0' .. '9'
            {
            matchRange('0','5');
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN_SEC"

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:206:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRos1Lexer.g:206:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
            {
            mRULE_YEAR();
            match('-');
            mRULE_MONTH();
            match('-');
            mRULE_DAY();
            match('T');
            mRULE_HOUR();
            match(':');
            mRULE_MIN_SEC();
            match(':');
            mRULE_MIN_SEC();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_MESSAGE_ASIGMENT"
    public final void mRULE_MESSAGE_ASIGMENT() throws RecognitionException {
        try {
            int _type = RULE_MESSAGE_ASIGMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:208:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRos1Lexer.g:208:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRos1Lexer.g:208:25: ( RULE_ID | RULE_STRING )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='^' && LA15_0<='_')||(LA15_0>='a' && LA15_0<='z')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='\"'||LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos1Lexer.g:208:26: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:208:34: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;

            }

            match('=');
            // InternalRos1Lexer.g:208:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '^':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt16=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt16=2;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt16=3;
                }
                break;
            case '-':
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRos1Lexer.g:208:52: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:208:60: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;
                case 3 :
                    // InternalRos1Lexer.g:208:72: RULE_INT
                    {
                    mRULE_INT();

                    }
                    break;
                case 4 :
                    // InternalRos1Lexer.g:208:81: '-' RULE_INT
                    {
                    match('-');
                    mRULE_INT();

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MESSAGE_ASIGMENT"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:210:21: ()
            // InternalRos1Lexer.g:210:23:
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:212:19: ()
            // InternalRos1Lexer.g:212:21:
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:214:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRos1Lexer.g:214:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalRos1Lexer.g:214:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
                case 1 :
                    // InternalRos1Lexer.g:214:23: ~ ( ( '\\n' | '\\r' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

                default :
                    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ROS_CONVENTION_A"
    public final void mRULE_ROS_CONVENTION_A() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:216:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRos1Lexer.g:216:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRos1Lexer.g:216:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='/') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='A' && LA18_0<='Z')||(LA18_0>='^' && LA18_0<='_')||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=2;
                }


                switch (alt18) {
                case 1 :
                    // InternalRos1Lexer.g:216:26: '/' RULE_ID
                    {
                    match('/');
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:216:38: RULE_ID '/'
                    {
                    mRULE_ID();
                    match('/');

                    }
                    break;

                default :
                    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROS_CONVENTION_A"

    // $ANTLR start "RULE_ROS_CONVENTION_PARAM"
    public final void mRULE_ROS_CONVENTION_PARAM() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:218:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRos1Lexer.g:218:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRos1Lexer.g:218:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt19=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt19=2;
                    }
                    break;
                case '~':
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
                case 1 :
                    // InternalRos1Lexer.g:218:30: '/' RULE_STRING
                    {
                    match('/');
                    mRULE_STRING();

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:218:46: RULE_STRING '/'
                    {
                    mRULE_STRING();
                    match('/');

                    }
                    break;
                case 3 :
                    // InternalRos1Lexer.g:218:62: '~' RULE_STRING
                    {
                    match('~');
                    mRULE_STRING();

                    }
                    break;

                default :
                    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROS_CONVENTION_PARAM"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:220:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRos1Lexer.g:220:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRos1Lexer.g:220:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRos1Lexer.g:220:11: '^'
                    {
                    match('^');

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRos1Lexer.g:220:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
                case 1 :
                    // InternalRos1Lexer.g:
                    {
                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

                default :
                    break loop21;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalRos1Lexer.g:222:19: ( ( '0' .. '9' )+ )
            // InternalRos1Lexer.g:222:21: ( '0' .. '9' )+
            {
            // InternalRos1Lexer.g:222:21: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
                case 1 :
                    // InternalRos1Lexer.g:222:22: '0' .. '9'
                    {
                    matchRange('0','9');

                    }
                    break;

                default :
                    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:224:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRos1Lexer.g:224:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRos1Lexer.g:224:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\"') ) {
                alt25=1;
            }
            else if ( (LA25_0=='\'') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalRos1Lexer.g:224:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalRos1Lexer.g:224:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                        case 1 :
                            // InternalRos1Lexer.g:224:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalRos1Lexer.g:224:28: ~ ( ( '\\\\' | '\"' ) )
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                        default :
                            break loop23;
                        }
                    } while (true);

                    match('\"');

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:224:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalRos1Lexer.g:224:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                        case 1 :
                            // InternalRos1Lexer.g:224:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalRos1Lexer.g:224:61: ~ ( ( '\\\\' | '\\'' ) )
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                        default :
                            break loop24;
                        }
                    } while (true);

                    match('\'');

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:226:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRos1Lexer.g:226:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalRos1Lexer.g:226:24: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
                case 1 :
                    // InternalRos1Lexer.g:226:52: .
                    {
                    matchAny();

                    }
                    break;

                default :
                    break loop26;
                }
            } while (true);

            match("*/");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:228:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRos1Lexer.g:228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRos1Lexer.g:228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
                case 1 :
                    // InternalRos1Lexer.g:
                    {
                    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

                default :
                    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:230:16: ( . )
            // InternalRos1Lexer.g:230:18: .
            {
            matchAny();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRos1Lexer.g:1:8: ( ParameterStructMember | ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclient | Serviceserver | Actionclient | Actionserver | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=100;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalRos1Lexer.g:1:10: ParameterStructMember
                {
                mParameterStructMember();

                }
                break;
            case 2 :
                // InternalRos1Lexer.g:1:32: ExternalDependency
                {
                mExternalDependency();

                }
                break;
            case 3 :
                // InternalRos1Lexer.g:1:51: RelativeNamespace
                {
                mRelativeNamespace();

                }
                break;
            case 4 :
                // InternalRos1Lexer.g:1:69: PrivateNamespace
                {
                mPrivateNamespace();

                }
                break;
            case 5 :
                // InternalRos1Lexer.g:1:86: GlobalNamespace
                {
                mGlobalNamespace();

                }
                break;
            case 6 :
                // InternalRos1Lexer.g:1:102: Serviceclient
                {
                mServiceclient();

                }
                break;
            case 7 :
                // InternalRos1Lexer.g:1:116: Serviceserver
                {
                mServiceserver();

                }
                break;
            case 8 :
                // InternalRos1Lexer.g:1:130: Actionclient
                {
                mActionclient();

                }
                break;
            case 9 :
                // InternalRos1Lexer.g:1:143: Actionserver
                {
                mActionserver();

                }
                break;
            case 10 :
                // InternalRos1Lexer.g:1:156: Dependencies
                {
                mDependencies();

                }
                break;
            case 11 :
                // InternalRos1Lexer.g:1:169: ParameterAny
                {
                mParameterAny();

                }
                break;
            case 12 :
                // InternalRos1Lexer.g:1:182: FromGitRepo
                {
                mFromGitRepo();

                }
                break;
            case 13 :
                // InternalRos1Lexer.g:1:194: Subscribers
                {
                mSubscribers();

                }
                break;
            case 14 :
                // InternalRos1Lexer.g:1:206: Parameters
                {
                mParameters();

                }
                break;
            case 15 :
                // InternalRos1Lexer.g:1:217: Publishers
                {
                mPublishers();

                }
                break;
            case 16 :
                // InternalRos1Lexer.g:1:228: Artifacts
                {
                mArtifacts();

                }
                break;
            case 17 :
                // InternalRos1Lexer.g:1:238: GraphName
                {
                mGraphName();

                }
                break;
            case 18 :
                // InternalRos1Lexer.g:1:248: Feedback_1
                {
                mFeedback_1();

                }
                break;
            case 19 :
                // InternalRos1Lexer.g:1:259: Float32_1
                {
                mFloat32_1();

                }
                break;
            case 20 :
                // InternalRos1Lexer.g:1:269: Float64_1
                {
                mFloat64_1();

                }
                break;
            case 21 :
                // InternalRos1Lexer.g:1:279: Response
                {
                mResponse();

                }
                break;
            case 22 :
                // InternalRos1Lexer.g:1:288: Duration
                {
                mDuration();

                }
                break;
            case 23 :
                // InternalRos1Lexer.g:1:297: Feedback
                {
                mFeedback();

                }
                break;
            case 24 :
                // InternalRos1Lexer.g:1:306: Message_1
                {
                mMessage_1();

                }
                break;
            case 25 :
                // InternalRos1Lexer.g:1:316: Request
                {
                mRequest();

                }
                break;
            case 26 :
                // InternalRos1Lexer.g:1:324: String_2
                {
                mString_2();

                }
                break;
            case 27 :
                // InternalRos1Lexer.g:1:333: Uint16_1
                {
                mUint16_1();

                }
                break;
            case 28 :
                // InternalRos1Lexer.g:1:342: Uint32_1
                {
                mUint32_1();

                }
                break;
            case 29 :
                // InternalRos1Lexer.g:1:351: Uint64_1
                {
                mUint64_1();

                }
                break;
            case 30 :
                // InternalRos1Lexer.g:1:360: Boolean
                {
                mBoolean();

                }
                break;
            case 31 :
                // InternalRos1Lexer.g:1:368: Integer
                {
                mInteger();

                }
                break;
            case 32 :
                // InternalRos1Lexer.g:1:376: Action_1
                {
                mAction_1();

                }
                break;
            case 33 :
                // InternalRos1Lexer.g:1:385: Default
                {
                mDefault();

                }
                break;
            case 34 :
                // InternalRos1Lexer.g:1:393: Float32
                {
                mFloat32();

                }
                break;
            case 35 :
                // InternalRos1Lexer.g:1:401: Float64
                {
                mFloat64();

                }
                break;
            case 36 :
                // InternalRos1Lexer.g:1:409: Int16_1
                {
                mInt16_1();

                }
                break;
            case 37 :
                // InternalRos1Lexer.g:1:417: Int32_1
                {
                mInt32_1();

                }
                break;
            case 38 :
                // InternalRos1Lexer.g:1:425: Int64_1
                {
                mInt64_1();

                }
                break;
            case 39 :
                // InternalRos1Lexer.g:1:433: Message
                {
                mMessage();

                }
                break;
            case 40 :
                // InternalRos1Lexer.g:1:441: Result_1
                {
                mResult_1();

                }
                break;
            case 41 :
                // InternalRos1Lexer.g:1:450: Service
                {
                mService();

                }
                break;
            case 42 :
                // InternalRos1Lexer.g:1:458: Uint8_1
                {
                mUint8_1();

                }
                break;
            case 43 :
                // InternalRos1Lexer.g:1:466: Array
                {
                mArray();

                }
                break;
            case 44 :
                // InternalRos1Lexer.g:1:472: Base64
                {
                mBase64();

                }
                break;
            case 45 :
                // InternalRos1Lexer.g:1:479: Double
                {
                mDouble();

                }
                break;
            case 46 :
                // InternalRos1Lexer.g:1:486: Header
                {
                mHeader();

                }
                break;
            case 47 :
                // InternalRos1Lexer.g:1:493: String
                {
                mString();

                }
                break;
            case 48 :
                // InternalRos1Lexer.g:1:500: Struct
                {
                mStruct();

                }
                break;
            case 49 :
                // InternalRos1Lexer.g:1:507: Action
                {
                mAction();

                }
                break;
            case 50 :
                // InternalRos1Lexer.g:1:514: Bool_1
                {
                mBool_1();

                }
                break;
            case 51 :
                // InternalRos1Lexer.g:1:521: Byte_1
                {
                mByte_1();

                }
                break;
            case 52 :
                // InternalRos1Lexer.g:1:528: Int8_1
                {
                mInt8_1();

                }
                break;
            case 53 :
                // InternalRos1Lexer.g:1:535: Result
                {
                mResult();

                }
                break;
            case 54 :
                // InternalRos1Lexer.g:1:542: Specs
                {
                mSpecs();

                }
                break;
            case 55 :
                // InternalRos1Lexer.g:1:548: String_1
                {
                mString_1();

                }
                break;
            case 56 :
                // InternalRos1Lexer.g:1:557: Uint16
                {
                mUint16();

                }
                break;
            case 57 :
                // InternalRos1Lexer.g:1:564: Uint32
                {
                mUint32();

                }
                break;
            case 58 :
                // InternalRos1Lexer.g:1:571: Uint64
                {
                mUint64();

                }
                break;
            case 59 :
                // InternalRos1Lexer.g:1:578: Value_1
                {
                mValue_1();

                }
                break;
            case 60 :
                // InternalRos1Lexer.g:1:586: Goal_1
                {
                mGoal_1();

                }
                break;
            case 61 :
                // InternalRos1Lexer.g:1:593: Int16
                {
                mInt16();

                }
                break;
            case 62 :
                // InternalRos1Lexer.g:1:599: Int32
                {
                mInt32();

                }
                break;
            case 63 :
                // InternalRos1Lexer.g:1:605: Int64
                {
                mInt64();

                }
                break;
            case 64 :
                // InternalRos1Lexer.g:1:611: Node_1
                {
                mNode_1();

                }
                break;
            case 65 :
                // InternalRos1Lexer.g:1:618: Type_1
                {
                mType_1();

                }
                break;
            case 66 :
                // InternalRos1Lexer.g:1:625: Uint8
                {
                mUint8();

                }
                break;
            case 67 :
                // InternalRos1Lexer.g:1:631: Value
                {
                mValue();

                }
                break;
            case 68 :
                // InternalRos1Lexer.g:1:637: Date
                {
                mDate();

                }
                break;
            case 69 :
                // InternalRos1Lexer.g:1:642: List
                {
                mList();

                }
                break;
            case 70 :
                // InternalRos1Lexer.g:1:647: Bool
                {
                mBool();

                }
                break;
            case 71 :
                // InternalRos1Lexer.g:1:652: Byte
                {
                mByte();

                }
                break;
            case 72 :
                // InternalRos1Lexer.g:1:657: Goal
                {
                mGoal();

                }
                break;
            case 73 :
                // InternalRos1Lexer.g:1:662: Int8
                {
                mInt8();

                }
                break;
            case 74 :
                // InternalRos1Lexer.g:1:667: Msg
                {
                mMsg();

                }
                break;
            case 75 :
                // InternalRos1Lexer.g:1:671: Name
                {
                mName();

                }
                break;
            case 76 :
                // InternalRos1Lexer.g:1:676: Node
                {
                mNode();

                }
                break;
            case 77 :
                // InternalRos1Lexer.g:1:681: Srv
                {
                mSrv();

                }
                break;
            case 78 :
                // InternalRos1Lexer.g:1:685: Time
                {
                mTime();

                }
                break;
            case 79 :
                // InternalRos1Lexer.g:1:690: Type
                {
                mType();

                }
                break;
            case 80 :
                // InternalRos1Lexer.g:1:695: Any
                {
                mAny();

                }
                break;
            case 81 :
                // InternalRos1Lexer.g:1:699: Ns
                {
                mNs();

                }
                break;
            case 82 :
                // InternalRos1Lexer.g:1:702: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket();

                }
                break;
            case 83 :
                // InternalRos1Lexer.g:1:738: Comma
                {
                mComma();

                }
                break;
            case 84 :
                // InternalRos1Lexer.g:1:744: Colon
                {
                mColon();

                }
                break;
            case 85 :
                // InternalRos1Lexer.g:1:750: LeftSquareBracket
                {
                mLeftSquareBracket();

                }
                break;
            case 86 :
                // InternalRos1Lexer.g:1:768: RightSquareBracket
                {
                mRightSquareBracket();

                }
                break;
            case 87 :
                // InternalRos1Lexer.g:1:787: RULE_BINARY
                {
                mRULE_BINARY();

                }
                break;
            case 88 :
                // InternalRos1Lexer.g:1:799: RULE_BOOLEAN
                {
                mRULE_BOOLEAN();

                }
                break;
            case 89 :
                // InternalRos1Lexer.g:1:812: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 90 :
                // InternalRos1Lexer.g:1:824: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 91 :
                // InternalRos1Lexer.g:1:836: RULE_DATE_TIME
                {
                mRULE_DATE_TIME();

                }
                break;
            case 92 :
                // InternalRos1Lexer.g:1:851: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT();

                }
                break;
            case 93 :
                // InternalRos1Lexer.g:1:873: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 94 :
                // InternalRos1Lexer.g:1:889: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A();

                }
                break;
            case 95 :
                // InternalRos1Lexer.g:1:911: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM();

                }
                break;
            case 96 :
                // InternalRos1Lexer.g:1:937: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 97 :
                // InternalRos1Lexer.g:1:945: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 98 :
                // InternalRos1Lexer.g:1:957: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 99 :
                // InternalRos1Lexer.g:1:973: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 100 :
                // InternalRos1Lexer.g:1:981: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER();

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA8_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA8_eofS =
        "\10\uffff";
    static final String DFA8_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA8_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA8_specialS =
        "\10\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "192:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA28_eotS =
        "\1\50\31\56\1\136\3\uffff\2\144\1\53\1\144\1\53\1\56\2\53\1\uffff\1\53\1\uffff\1\53\2\uffff\2\56\1\uffff\1\56\1\uffff\54\56\11\uffff\1\144\1\56\2\uffff\1\u00a4\2\uffff\1\u00a4\4\uffff\40\56\1\u00ca\12\56\1\uffff\4\56\1\144\3\uffff\12\56\1\uffff\17\56\1\uffff\7\56\1\u00ff\1\56\1\uffff\1\56\1\u0102\3\56\1\u0107\1\u0109\1\56\1\u010c\1\u010e\1\u010f\1\u0111\1\u0112\1\u0113\1\u0114\1\144\22\56\1\u0113\11\56\1\u0132\3\56\1\u0137\1\u0139\1\u013b\2\uffff\2\56\1\uffff\3\56\4\uffff\1\u0142\12\uffff\10\56\1\u014c\1\uffff\1\u0150\13\56\1\u015d\2\56\1\u0161\1\u0163\1\u0165\2\uffff\1\56\1\u0167\1\56\7\uffff\1\u0169\1\u016a\1\u016b\1\u016c\2\uffff\6\56\1\u0175\1\56\2\uffff\2\56\2\uffff\2\56\1\u017b\3\56\1\u0180\1\u0182\3\56\2\uffff\1\56\1\u0188\6\uffff\1\u0189\1\uffff\1\u018a\4\uffff\10\56\1\uffff\5\56\1\uffff\1\u0198\1\56\1\u019b\4\uffff\3\56\5\uffff\5\56\1\u01a5\7\56\1\uffff\1\56\2\uffff\2\56\1\uffff\6\56\1\uffff\5\56\1\uffff\21\56\2\uffff\1\56\1\u01cd\6\56\1\uffff\3\56\1\uffff\1\56\1\uffff\6\56\3\uffff\5\56\2\uffff\4\56\1\u01e7\1\56\1\u01e9\2\56\1\uffff\1\56\1\uffff\1\56\1\u01ee\1\56\1\u01f0\1\uffff\1\56\1\uffff\1\56\1\u01f3\1\uffff";
    static final String DFA28_eofS =
        "\u01f4\uffff";
    static final String DFA28_minS =
        "\1\0\31\57\1\135\3\uffff\2\56\1\60\1\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\2\57\1\uffff\1\57\1\uffff\54\57\11\uffff\1\60\1\57\2\0\1\57\2\0\1\57\4\uffff\53\57\1\uffff\4\57\1\60\1\0\1\uffff\1\0\12\57\1\uffff\17\57\1\uffff\11\57\1\uffff\17\57\1\55\43\57\2\uffff\2\57\1\uffff\3\57\4\uffff\1\57\12\uffff\11\57\1\uffff\22\57\2\uffff\3\57\7\uffff\4\57\2\uffff\10\57\2\uffff\2\57\2\uffff\13\57\2\uffff\2\57\6\uffff\1\57\1\uffff\1\57\4\uffff\10\57\1\uffff\5\57\1\uffff\3\57\4\uffff\3\57\5\uffff\15\57\1\uffff\1\57\2\uffff\2\57\1\uffff\6\57\1\uffff\5\57\1\uffff\21\57\2\uffff\10\57\1\uffff\3\57\1\uffff\1\57\1\uffff\6\57\3\uffff\5\57\2\uffff\11\57\1\uffff\1\57\1\uffff\4\57\1\uffff\1\57\1\uffff\2\57\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\31\172\1\135\3\uffff\2\145\1\71\1\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\2\172\1\uffff\1\172\1\uffff\54\172\11\uffff\1\71\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\53\172\1\uffff\4\172\1\71\1\uffff\1\uffff\1\uffff\12\172\1\uffff\17\172\1\uffff\11\172\1\uffff\17\172\1\55\43\172\2\uffff\2\172\1\uffff\3\172\4\uffff\1\172\12\uffff\11\172\1\uffff\22\172\2\uffff\3\172\7\uffff\4\172\2\uffff\10\172\2\uffff\2\172\2\uffff\13\172\2\uffff\2\172\6\uffff\1\172\1\uffff\1\172\4\uffff\10\172\1\uffff\5\172\1\uffff\3\172\4\uffff\3\172\5\uffff\15\172\1\uffff\1\172\2\uffff\2\172\1\uffff\6\172\1\uffff\5\172\1\uffff\21\172\2\uffff\10\172\1\uffff\3\172\1\uffff\1\172\1\uffff\6\172\3\uffff\5\172\2\uffff\11\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA28_acceptS =
        "\33\uffff\1\123\1\124\1\126\10\uffff\1\135\1\uffff\1\136\1\uffff\1\143\1\144\2\uffff\1\140\1\uffff\1\134\54\uffff\1\122\1\125\1\123\1\124\1\126\1\127\1\133\1\132\1\131\10\uffff\1\135\1\142\1\137\1\143\53\uffff\1\121\6\uffff\1\141\13\uffff\1\115\17\uffff\1\112\11\uffff\1\120\63\uffff\1\64\1\111\2\uffff\1\104\3\uffff\1\62\1\106\1\63\1\107\1\uffff\1\74\1\110\1\100\1\114\1\113\1\101\1\117\1\116\1\130\1\105\11\uffff\1\66\22\uffff\1\52\1\102\3\uffff\1\44\1\75\1\45\1\76\1\46\1\77\1\53\4\uffff\1\73\1\103\10\uffff\1\32\1\67\2\uffff\1\40\1\61\13\uffff\1\50\1\65\2\uffff\1\33\1\70\1\34\1\71\1\35\1\72\1\uffff\1\54\1\uffff\1\55\1\56\1\57\1\60\10\uffff\1\51\5\uffff\1\41\3\uffff\1\23\1\42\1\24\1\43\3\uffff\1\31\1\30\1\47\1\36\1\37\15\uffff\1\26\1\uffff\1\22\1\27\2\uffff\1\25\6\uffff\1\21\5\uffff\1\20\21\uffff\1\16\1\17\10\uffff\1\15\3\uffff\1\14\1\uffff\1\13\6\uffff\1\10\1\11\1\12\5\uffff\1\6\1\7\11\uffff\1\5\1\uffff\1\4\4\uffff\1\3\1\uffff\1\2\2\uffff\1\1";
    static final String DFA28_specialS =
        "\1\5\43\uffff\1\6\1\2\102\uffff\1\0\1\4\1\uffff\1\1\1\10\66\uffff\1\3\1\uffff\1\7\u014e\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\44\1\46\3\53\1\45\4\53\1\33\1\40\1\53\1\47\1\36\2\37\7\41\1\34\6\53\1\20\1\15\1\43\1\21\1\2\1\43\1\4\1\22\1\16\2\43\1\31\3\43\1\1\1\43\1\3\1\23\7\43\1\32\1\53\1\35\1\42\1\43\1\53\1\6\1\24\1\43\1\7\1\43\1\10\1\26\1\43\1\17\3\43\1\13\1\27\1\43\1\11\1\43\1\12\1\5\1\30\1\14\1\25\4\43\3\53\1\51\uff81\53",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\54\20\57\1\55\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\27\57\1\61\2\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\62\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\63\5\57\1\64\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\65\12\57\1\70\1\57\1\71\1\57\1\67\1\66\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\72\16\57\1\73\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\74\17\57\1\75\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\101\3\57\1\77\6\57\1\100\5\57\1\76\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\102\23\57\1\103\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\104\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\105\15\57\1\106\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\107\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\111\15\57\1\110\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\112\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\113\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\115\3\57\1\114\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\117\15\57\1\116\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\120\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\121\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\122\11\57\1\123\1\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\124\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\125\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\127\15\57\1\126\3\57\1\130\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\132\10\57\1\133\6\57\1\131\1\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\134\21\57",
            "\1\135",
            "",
            "",
            "",
            "\1\145\1\uffff\12\143\10\uffff\1\142\2\uffff\1\145\34\uffff\1\142\2\uffff\1\145",
            "\1\145\1\uffff\12\146\13\uffff\1\145\37\uffff\1\145",
            "\12\144",
            "\1\145\26\uffff\1\145\37\uffff\1\145",
            "\32\147\4\uffff\1\147\1\uffff\32\147",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "",
            "\1\160\4\uffff\1\160\2\uffff\1\157\26\uffff\32\50\3\uffff\2\50\1\uffff\32\50",
            "",
            "\1\160\4\uffff\1\160",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\162\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\163\21\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\164\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\165\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\166\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\167\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\170\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\171\30\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\172\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\173\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\174\4\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\175\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\176\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\u0080\11\57\1\177\12\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0081\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0082\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0083\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0084\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0085\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0086\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u0087\30\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\20\57\1\u0089\1\57\1\u0088\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u008a\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u008b\23\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u008c\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u008d\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u008e\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u008f\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0090\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0091\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u0092\1\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u0093\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0094\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0095\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0096\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0097\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0098\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0099\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u009a\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u009b\26\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u009c\15\57",
            "\1\50\12\57\1\u009d\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u009e\12\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u009f\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00a0\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00a1\7\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a2",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\0\u00a3",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\1\160\15\uffff\1\60",
            "\0\u00a5",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "\1\160\15\uffff\1\60",
            "",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00a6\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u00a7\4\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a8\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00a9\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00aa\30\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u00ab\12\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u00ac\4\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00ad\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00ae\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00af\27\57",
            "\1\50\12\57\1\u00b0\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b1\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b2\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b3\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b4\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b5\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00b6\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00b7\26\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b8\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00b9\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00ba\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00bb\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u00bc\4\57\1\u00bd\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00be\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00bf\7\57",
            "\1\50\12\57\1\u00c0\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00c1\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00c2\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c3\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c4\25\57",
            "\1\50\1\57\1\u00c5\1\57\1\u00c6\2\57\1\u00c7\1\57\1\u00c8\1\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00c9\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00cb\30\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00cc\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00cd\26\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00ce\13\57\1\u00cf\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00d0\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d1\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00d2\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00d3\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d4\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d5\25\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d6\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d7\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d8\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00d9\6\57",
            "\12\u00da",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00db\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00dc\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00dd\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00de\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00df\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u00e0\22\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00e1\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00e2\27\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00e3\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00e4\7\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00e5\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\u00e6\24\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00e7\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00e8\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00e9\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\6\57\1\u00ea\23\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00eb\30\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00ec\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00ed\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00ee\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00ef\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00f0\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00f1\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00f2\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00f3\31\57",
            "",
            "\1\50\1\57\1\u00f4\1\57\1\u00f5\2\57\1\u00f6\1\57\1\u00f7\1\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00f8\25\57",
            "\1\50\6\57\1\u00f9\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00fa\23\57",
            "\1\50\6\57\1\u00fb\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\2\57\1\u00fc\7\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\4\57\1\u00fd\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u00fe\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u0100\1\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0101\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0103\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0104\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0105\27\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0106\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0108\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u010a\25\57",
            "\1\50\12\57\1\u010b\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\1\u010d\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\1\u0110\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\143",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0115\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0116\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0117\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0118\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0119\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\15\57\1\u011a\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u011b\27\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u011c\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u011d\23\57",
            "\1\50\12\57\1\u011e\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u011f\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0120\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u0121\26\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0122\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0123\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0124\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0125\31\57",
            "\1\50\3\57\1\u0126\2\57\1\u0127\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0128\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0129\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u012a\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u012b\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u012c\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u012d\23\57",
            "\1\50\6\57\1\u012e\3\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\2\57\1\u012f\7\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\4\57\1\u0130\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0131\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0133\31\57",
            "\1\50\4\57\1\u0134\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0135\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0136\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0138\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u013a\3\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\50\12\57\1\u013c\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u013d\25\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u013e\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u013f\23\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0140\6\57",
            "",
            "",
            "",
            "",
            "\1\50\12\57\1\u0141\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0143\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0144\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0145\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u0146\4\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\15\57\1\u0147\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0148\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0149\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u014a\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u014b\3\uffff\1\57\1\uffff\32\57",
            "",
            "\1\50\12\57\1\u014f\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u014d\17\57\1\u014e\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0151\27\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0152\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0153\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0154\13\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0155\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0156\27\57",
            "\1\50\2\57\1\u0157\7\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\4\57\1\u0158\5\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0159\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u015a\22\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u015b\7\57",
            "\1\50\12\57\1\u015c\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u015e\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u015f\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0160\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0162\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0164\3\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0166\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0168\10\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u016d\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\15\57\1\u016e\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u016f\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0170\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0171\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0172\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0173\17\57\1\u0174\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u0176\30\57",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0177\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0178\25\57",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0179\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u017a\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u017c\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\21\57\1\u017d\10\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\u017e\17\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u017f\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\1\u0181\3\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0183\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0184\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0185\25\57",
            "",
            "",
            "\1\50\12\57\1\u0186\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\1\u0187\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u018b\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u018c\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\3\57\1\u018d\26\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\15\57\1\u018e\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u018f\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0190\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0191\16\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0192\25\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0193\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0194\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0195\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0196\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0197\27\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0199\25\57",
            "\1\50\12\57\1\u019a\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u019c\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u019d\10\57",
            "\1\50\12\57\1\u019e\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\1\u01a0\21\57\1\u019f\7\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u01a1\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01a2\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01a3\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01a4\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u01a6\21\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01a7\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01a8\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01a9\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u01aa\4\57",
            "\1\50\12\57\1\u01ab\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u01ac\21\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01ad\12\57",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01ae\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01af\7\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01b0\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01b1\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01b2\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01b3\12\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u01b4\15\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01b5\7\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01b6\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u01b7\4\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01b8\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01b9\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01ba\25\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01bb\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u01bc\13\57",
            "\1\50\12\57\1\u01bd\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\1\u01be\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01bf\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u01c0\1\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01c1\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01c2\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01c3\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01c4\12\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01c5\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01c6\25\57",
            "\1\50\12\57\1\u01c7\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01c8\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01c9\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01ca\7\57",
            "\1\50\12\57\1\u01cb\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u01cc\5\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01ce\12\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01cf\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01d0\7\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01d1\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01d2\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01d3\10\57",
            "",
            "\1\50\12\57\1\u01d4\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\1\u01d5\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\1\u01d6\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01d7\27\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01d8\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u01d9\26\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01da\12\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01db\27\57",
            "\1\50\12\57\1\u01dc\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\1\u01dd\2\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01de\6\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01df\27\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e0\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01e1\31\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e2\25\57",
            "",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\14\57\1\u01e3\15\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e4\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01e5\14\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01e6\27\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e8\25\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01ea\27\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01eb\25\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u01ec\15\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u01ed\1\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u01ef\30\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01f1\25\57",
            "",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01f2\10\57",
            "\1\50\12\57\3\uffff\1\60\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ParameterStructMember | ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclient | Serviceserver | Actionclient | Actionserver | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA28_104 = input.LA(1);

                        s = -1;
                        if ( ((LA28_104>='\u0000' && LA28_104<='\uFFFF')) ) {s = 163;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA28_107 = input.LA(1);

                        s = -1;
                        if ( ((LA28_107>='\u0000' && LA28_107<='\uFFFF')) ) {s = 165;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA28_37 = input.LA(1);

                        s = -1;
                        if ( (LA28_37=='\\') ) {s = 107;}

                        else if ( ((LA28_37>='\u0000' && LA28_37<='&')||(LA28_37>='(' && LA28_37<='[')||(LA28_37>=']' && LA28_37<='\uFFFF')) ) {s = 108;}

                        else if ( (LA28_37=='\'') ) {s = 109;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA28_163 = input.LA(1);

                        s = -1;
                        if ( (LA28_163=='\"') ) {s = 106;}

                        else if ( (LA28_163=='\\') ) {s = 104;}

                        else if ( ((LA28_163>='\u0000' && LA28_163<='!')||(LA28_163>='#' && LA28_163<='[')||(LA28_163>=']' && LA28_163<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA28_105 = input.LA(1);

                        s = -1;
                        if ( (LA28_105=='\"') ) {s = 106;}

                        else if ( (LA28_105=='\\') ) {s = 104;}

                        else if ( ((LA28_105>='\u0000' && LA28_105<='!')||(LA28_105>='#' && LA28_105<='[')||(LA28_105>=']' && LA28_105<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='P') ) {s = 1;}

                        else if ( (LA28_0=='E') ) {s = 2;}

                        else if ( (LA28_0=='R') ) {s = 3;}

                        else if ( (LA28_0=='G') ) {s = 4;}

                        else if ( (LA28_0=='s') ) {s = 5;}

                        else if ( (LA28_0=='a') ) {s = 6;}

                        else if ( (LA28_0=='d') ) {s = 7;}

                        else if ( (LA28_0=='f') ) {s = 8;}

                        else if ( (LA28_0=='p') ) {s = 9;}

                        else if ( (LA28_0=='r') ) {s = 10;}

                        else if ( (LA28_0=='m') ) {s = 11;}

                        else if ( (LA28_0=='u') ) {s = 12;}

                        else if ( (LA28_0=='B') ) {s = 13;}

                        else if ( (LA28_0=='I') ) {s = 14;}

                        else if ( (LA28_0=='i') ) {s = 15;}

                        else if ( (LA28_0=='A') ) {s = 16;}

                        else if ( (LA28_0=='D') ) {s = 17;}

                        else if ( (LA28_0=='H') ) {s = 18;}

                        else if ( (LA28_0=='S') ) {s = 19;}

                        else if ( (LA28_0=='b') ) {s = 20;}

                        else if ( (LA28_0=='v') ) {s = 21;}

                        else if ( (LA28_0=='g') ) {s = 22;}

                        else if ( (LA28_0=='n') ) {s = 23;}

                        else if ( (LA28_0=='t') ) {s = 24;}

                        else if ( (LA28_0=='L') ) {s = 25;}

                        else if ( (LA28_0=='[') ) {s = 26;}

                        else if ( (LA28_0==',') ) {s = 27;}

                        else if ( (LA28_0==':') ) {s = 28;}

                        else if ( (LA28_0==']') ) {s = 29;}

                        else if ( (LA28_0=='0') ) {s = 30;}

                        else if ( ((LA28_0>='1' && LA28_0<='2')) ) {s = 31;}

                        else if ( (LA28_0=='-') ) {s = 32;}

                        else if ( ((LA28_0>='3' && LA28_0<='9')) ) {s = 33;}

                        else if ( (LA28_0=='^') ) {s = 34;}

                        else if ( (LA28_0=='C'||LA28_0=='F'||(LA28_0>='J' && LA28_0<='K')||(LA28_0>='M' && LA28_0<='O')||LA28_0=='Q'||(LA28_0>='T' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='c'||LA28_0=='e'||LA28_0=='h'||(LA28_0>='j' && LA28_0<='l')||LA28_0=='o'||LA28_0=='q'||(LA28_0>='w' && LA28_0<='z')) ) {s = 35;}

                        else if ( (LA28_0=='\"') ) {s = 36;}

                        else if ( (LA28_0=='\'') ) {s = 37;}

                        else if ( (LA28_0=='#') ) {s = 38;}

                        else if ( (LA28_0=='/') ) {s = 39;}

                        else if ( (LA28_0=='~') ) {s = 41;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 42;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='!'||(LA28_0>='$' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='+')||LA28_0=='.'||(LA28_0>=';' && LA28_0<='@')||LA28_0=='\\'||LA28_0=='`'||(LA28_0>='{' && LA28_0<='}')||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 43;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 6 :
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( (LA28_36=='\\') ) {s = 104;}

                        else if ( ((LA28_36>='\u0000' && LA28_36<='!')||(LA28_36>='#' && LA28_36<='[')||(LA28_36>=']' && LA28_36<='\uFFFF')) ) {s = 105;}

                        else if ( (LA28_36=='\"') ) {s = 106;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 7 :
                        int LA28_165 = input.LA(1);

                        s = -1;
                        if ( (LA28_165=='\'') ) {s = 109;}

                        else if ( (LA28_165=='\\') ) {s = 107;}

                        else if ( ((LA28_165>='\u0000' && LA28_165<='&')||(LA28_165>='(' && LA28_165<='[')||(LA28_165>=']' && LA28_165<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 :
                        int LA28_108 = input.LA(1);

                        s = -1;
                        if ( (LA28_108=='\'') ) {s = 109;}

                        else if ( (LA28_108=='\\') ) {s = 107;}

                        else if ( ((LA28_108>='\u0000' && LA28_108<='&')||(LA28_108>='(' && LA28_108<='[')||(LA28_108>=']' && LA28_108<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }


}
