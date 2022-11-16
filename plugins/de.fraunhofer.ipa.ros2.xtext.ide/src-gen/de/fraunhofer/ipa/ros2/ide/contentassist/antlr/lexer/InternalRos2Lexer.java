package de.fraunhofer.ipa.ros2.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRos2Lexer extends Lexer {
    public static final int Float32_1=22;
    public static final int Node=78;
    public static final int RULE_DATE_TIME=107;
    public static final int Uint64_1=32;
    public static final int String=50;
    public static final int Int16=63;
    public static final int Float32=37;
    public static final int Goal=74;
    public static final int Bool=72;
    public static final int Uint16=59;
    public static final int Boolean=33;
    public static final int ExternalDependency=5;
    public static final int Uint8=68;
    public static final int Parameters=17;
    public static final int RULE_ID=93;
    public static final int Actionclient=11;
    public static final int RULE_DIGIT=97;
    public static final int GlobalNamespace=8;
    public static final int Artifacts=19;
    public static final int Node_1=66;
    public static final int Int16_1=39;
    public static final int Header=49;
    public static final int RULE_INT=108;
    public static final int Byte=73;
    public static final int RULE_ML_COMMENT=110;
    public static final int LeftSquareBracket=87;
    public static final int Specs=57;
    public static final int Base64=47;
    public static final int Message_1=27;
    public static final int Comma=85;
    public static final int RULE_MESSAGE_ASIGMENT=109;
    public static final int Goal_1=62;
    public static final int LeftSquareBracketRightSquareBracket=84;
    public static final int Int32=64;
    public static final int Publishers=18;
    public static final int Serviceserver=10;
    public static final int RightCurlyBracket=89;
    public static final int RULE_DECINT=100;
    public static final int Uint32=60;
    public static final int FromGitRepo=15;
    public static final int Msg=76;
    public static final int RULE_HOUR=105;
    public static final int Int8=75;
    public static final int Default=36;
    public static final int Actionserver=12;
    public static final int Int8_1=55;
    public static final int Uint16_1=30;
    public static final int Type=81;
    public static final int Float64=38;
    public static final int Int32_1=40;
    public static final int Result_1=43;
    public static final int RULE_BINARY=98;
    public static final int String_1=58;
    public static final int Subscribers=16;
    public static final int String_2=29;
    public static final int RULE_BEGIN=90;
    public static final int RULE_DAY=102;
    public static final int RULE_BOOLEAN=99;
    public static final int RelativeNamespace=6;
    public static final int RULE_YEAR=104;
    public static final int Feedback_1=21;
    public static final int Result=56;
    public static final int Name=77;
    public static final int RULE_MIN_SEC=106;
    public static final int ParameterAny=14;
    public static final int List=71;
    public static final int Dependencies=13;
    public static final int RightSquareBracket=88;
    public static final int PrivateNamespace=7;
    public static final int GraphName=20;
    public static final int Byte_1=54;
    public static final int Float64_1=23;
    public static final int Duration=25;
    public static final int Uint32_1=31;
    public static final int Action_1=35;
    public static final int Double=48;
    public static final int Type_1=67;
    public static final int Value=69;
    public static final int Uint64=61;
    public static final int Action=52;
    public static final int RULE_END=91;
    public static final int Message=42;
    public static final int Time=80;
    public static final int RULE_STRING=95;
    public static final int Bool_1=53;
    public static final int Any=82;
    public static final int Struct=51;
    public static final int RULE_SL_COMMENT=92;
    public static final int Uint8_1=45;
    public static final int RULE_DOUBLE=101;
    public static final int Feedback=26;
    public static final int ParameterStructMember=4;
    public static final int Srv=79;
    public static final int RULE_ROS_CONVENTION_A=94;
    public static final int RULE_ROS_CONVENTION_PARAM=96;
    public static final int Colon=86;
    public static final int EOF=-1;
    public static final int Ns=83;
    public static final int RULE_WS=111;
    public static final int Request=28;
    public static final int Int64_1=41;
    public static final int Service=44;
    public static final int RULE_ANY_OTHER=112;
    public static final int Date=70;
    public static final int Response=24;
    public static final int Integer=34;
    public static final int Array=46;
    public static final int Serviceclient=9;
    public static final int Int64=65;
    public static final int RULE_MONTH=103;

    // delegates
    // delegators

    public InternalRos2Lexer() {;} 
    public InternalRos2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRos2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRos2Lexer.g"; }

    // $ANTLR start "ParameterStructMember"
    public final void mParameterStructMember() throws RecognitionException {
        try {
            int _type = ParameterStructMember;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos2Lexer.g:14:23: ( 'ParameterStructMember' )
            // InternalRos2Lexer.g:14:25: 'ParameterStructMember'
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
            // InternalRos2Lexer.g:16:20: ( 'ExternalDependency' )
            // InternalRos2Lexer.g:16:22: 'ExternalDependency'
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
            // InternalRos2Lexer.g:18:19: ( 'RelativeNamespace' )
            // InternalRos2Lexer.g:18:21: 'RelativeNamespace'
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
            // InternalRos2Lexer.g:20:18: ( 'PrivateNamespace' )
            // InternalRos2Lexer.g:20:20: 'PrivateNamespace'
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
            // InternalRos2Lexer.g:22:17: ( 'GlobalNamespace' )
            // InternalRos2Lexer.g:22:19: 'GlobalNamespace'
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
            // InternalRos2Lexer.g:24:15: ( 'serviceclient:' )
            // InternalRos2Lexer.g:24:17: 'serviceclient:'
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
            // InternalRos2Lexer.g:26:15: ( 'serviceserver:' )
            // InternalRos2Lexer.g:26:17: 'serviceserver:'
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
            // InternalRos2Lexer.g:28:14: ( 'actionclient:' )
            // InternalRos2Lexer.g:28:16: 'actionclient:'
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
            // InternalRos2Lexer.g:30:14: ( 'actionserver:' )
            // InternalRos2Lexer.g:30:16: 'actionserver:'
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
            // InternalRos2Lexer.g:32:14: ( 'dependencies:' )
            // InternalRos2Lexer.g:32:16: 'dependencies:'
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
            // InternalRos2Lexer.g:34:14: ( 'ParameterAny' )
            // InternalRos2Lexer.g:34:16: 'ParameterAny'
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
            // InternalRos2Lexer.g:36:13: ( 'fromGitRepo:' )
            // InternalRos2Lexer.g:36:15: 'fromGitRepo:'
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
            // InternalRos2Lexer.g:38:13: ( 'subscribers:' )
            // InternalRos2Lexer.g:38:15: 'subscribers:'
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
            // InternalRos2Lexer.g:40:12: ( 'parameters:' )
            // InternalRos2Lexer.g:40:14: 'parameters:'
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
            // InternalRos2Lexer.g:42:12: ( 'publishers:' )
            // InternalRos2Lexer.g:42:14: 'publishers:'
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
            // InternalRos2Lexer.g:44:11: ( 'artifacts:' )
            // InternalRos2Lexer.g:44:13: 'artifacts:'
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
            // InternalRos2Lexer.g:46:11: ( 'GraphName' )
            // InternalRos2Lexer.g:46:13: 'GraphName'
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
            // InternalRos2Lexer.g:48:12: ( 'feedback:' )
            // InternalRos2Lexer.g:48:14: 'feedback:'
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
            // InternalRos2Lexer.g:50:11: ( 'float32[]' )
            // InternalRos2Lexer.g:50:13: 'float32[]'
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
            // InternalRos2Lexer.g:52:11: ( 'float64[]' )
            // InternalRos2Lexer.g:52:13: 'float64[]'
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
            // InternalRos2Lexer.g:54:10: ( 'response:' )
            // InternalRos2Lexer.g:54:12: 'response:'
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
            // InternalRos2Lexer.g:56:10: ( 'duration' )
            // InternalRos2Lexer.g:56:12: 'duration'
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
            // InternalRos2Lexer.g:58:10: ( 'feedback' )
            // InternalRos2Lexer.g:58:12: 'feedback'
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
            // InternalRos2Lexer.g:60:11: ( 'message:' )
            // InternalRos2Lexer.g:60:13: 'message:'
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
            // InternalRos2Lexer.g:62:9: ( 'request:' )
            // InternalRos2Lexer.g:62:11: 'request:'
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
            // InternalRos2Lexer.g:64:10: ( 'string[]' )
            // InternalRos2Lexer.g:64:12: 'string[]'
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
            // InternalRos2Lexer.g:66:10: ( 'uint16[]' )
            // InternalRos2Lexer.g:66:12: 'uint16[]'
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
            // InternalRos2Lexer.g:68:10: ( 'uint32[]' )
            // InternalRos2Lexer.g:68:12: 'uint32[]'
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
            // InternalRos2Lexer.g:70:10: ( 'uint64[]' )
            // InternalRos2Lexer.g:70:12: 'uint64[]'
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
            // InternalRos2Lexer.g:72:9: ( 'Boolean' )
            // InternalRos2Lexer.g:72:11: 'Boolean'
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
            // InternalRos2Lexer.g:74:9: ( 'Integer' )
            // InternalRos2Lexer.g:74:11: 'Integer'
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
            // InternalRos2Lexer.g:76:10: ( 'action:' )
            // InternalRos2Lexer.g:76:12: 'action:'
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
            // InternalRos2Lexer.g:78:9: ( 'default' )
            // InternalRos2Lexer.g:78:11: 'default'
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
            // InternalRos2Lexer.g:80:9: ( 'float32' )
            // InternalRos2Lexer.g:80:11: 'float32'
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
            // InternalRos2Lexer.g:82:9: ( 'float64' )
            // InternalRos2Lexer.g:82:11: 'float64'
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
            // InternalRos2Lexer.g:84:9: ( 'int16[]' )
            // InternalRos2Lexer.g:84:11: 'int16[]'
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
            // InternalRos2Lexer.g:86:9: ( 'int32[]' )
            // InternalRos2Lexer.g:86:11: 'int32[]'
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
            // InternalRos2Lexer.g:88:9: ( 'int64[]' )
            // InternalRos2Lexer.g:88:11: 'int64[]'
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
            // InternalRos2Lexer.g:90:9: ( 'message' )
            // InternalRos2Lexer.g:90:11: 'message'
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
            // InternalRos2Lexer.g:92:10: ( 'result:' )
            // InternalRos2Lexer.g:92:12: 'result:'
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
            // InternalRos2Lexer.g:94:9: ( 'service' )
            // InternalRos2Lexer.g:94:11: 'service'
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
            // InternalRos2Lexer.g:96:9: ( 'uint8[]' )
            // InternalRos2Lexer.g:96:11: 'uint8[]'
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
            // InternalRos2Lexer.g:98:7: ( 'Array:' )
            // InternalRos2Lexer.g:98:9: 'Array:'
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
            // InternalRos2Lexer.g:100:8: ( 'Base64' )
            // InternalRos2Lexer.g:100:10: 'Base64'
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
            // InternalRos2Lexer.g:102:8: ( 'Double' )
            // InternalRos2Lexer.g:102:10: 'Double'
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
            // InternalRos2Lexer.g:104:8: ( 'Header' )
            // InternalRos2Lexer.g:104:10: 'Header'
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
            // InternalRos2Lexer.g:106:8: ( 'String' )
            // InternalRos2Lexer.g:106:10: 'String'
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
            // InternalRos2Lexer.g:108:8: ( 'Struct' )
            // InternalRos2Lexer.g:108:10: 'Struct'
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
            // InternalRos2Lexer.g:110:8: ( 'action' )
            // InternalRos2Lexer.g:110:10: 'action'
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
            // InternalRos2Lexer.g:112:8: ( 'bool[]' )
            // InternalRos2Lexer.g:112:10: 'bool[]'
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
            // InternalRos2Lexer.g:114:8: ( 'byte[]' )
            // InternalRos2Lexer.g:114:10: 'byte[]'
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
            // InternalRos2Lexer.g:116:8: ( 'int8[]' )
            // InternalRos2Lexer.g:116:10: 'int8[]'
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
            // InternalRos2Lexer.g:118:8: ( 'result' )
            // InternalRos2Lexer.g:118:10: 'result'
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
            // InternalRos2Lexer.g:120:7: ( 'specs:' )
            // InternalRos2Lexer.g:120:9: 'specs:'
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
            // InternalRos2Lexer.g:122:10: ( 'string' )
            // InternalRos2Lexer.g:122:12: 'string'
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
            // InternalRos2Lexer.g:124:8: ( 'uint16' )
            // InternalRos2Lexer.g:124:10: 'uint16'
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
            // InternalRos2Lexer.g:126:8: ( 'uint32' )
            // InternalRos2Lexer.g:126:10: 'uint32'
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
            // InternalRos2Lexer.g:128:8: ( 'uint64' )
            // InternalRos2Lexer.g:128:10: 'uint64'
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

    // $ANTLR start "Goal_1"
    public final void mGoal_1() throws RecognitionException {
        try {
            int _type = Goal_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos2Lexer.g:130:8: ( 'goal:' )
            // InternalRos2Lexer.g:130:10: 'goal:'
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
            // InternalRos2Lexer.g:132:7: ( 'int16' )
            // InternalRos2Lexer.g:132:9: 'int16'
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
            // InternalRos2Lexer.g:134:7: ( 'int32' )
            // InternalRos2Lexer.g:134:9: 'int32'
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
            // InternalRos2Lexer.g:136:7: ( 'int64' )
            // InternalRos2Lexer.g:136:9: 'int64'
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
            // InternalRos2Lexer.g:138:8: ( 'node:' )
            // InternalRos2Lexer.g:138:10: 'node:'
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
            // InternalRos2Lexer.g:140:8: ( 'type:' )
            // InternalRos2Lexer.g:140:10: 'type:'
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
            // InternalRos2Lexer.g:142:7: ( 'uint8' )
            // InternalRos2Lexer.g:142:9: 'uint8'
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
            // InternalRos2Lexer.g:144:7: ( 'value' )
            // InternalRos2Lexer.g:144:9: 'value'
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
            // InternalRos2Lexer.g:146:6: ( 'Date' )
            // InternalRos2Lexer.g:146:8: 'Date'
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
            // InternalRos2Lexer.g:148:6: ( 'List' )
            // InternalRos2Lexer.g:148:8: 'List'
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
            // InternalRos2Lexer.g:150:6: ( 'bool' )
            // InternalRos2Lexer.g:150:8: 'bool'
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
            // InternalRos2Lexer.g:152:6: ( 'byte' )
            // InternalRos2Lexer.g:152:8: 'byte'
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
            // InternalRos2Lexer.g:154:6: ( 'goal' )
            // InternalRos2Lexer.g:154:8: 'goal'
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
            // InternalRos2Lexer.g:156:6: ( 'int8' )
            // InternalRos2Lexer.g:156:8: 'int8'
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
            // InternalRos2Lexer.g:158:5: ( 'msg:' )
            // InternalRos2Lexer.g:158:7: 'msg:'
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
            // InternalRos2Lexer.g:160:6: ( 'name' )
            // InternalRos2Lexer.g:160:8: 'name'
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
            // InternalRos2Lexer.g:162:6: ( 'node' )
            // InternalRos2Lexer.g:162:8: 'node'
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
            // InternalRos2Lexer.g:164:5: ( 'srv:' )
            // InternalRos2Lexer.g:164:7: 'srv:'
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
            // InternalRos2Lexer.g:166:6: ( 'time' )
            // InternalRos2Lexer.g:166:8: 'time'
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
            // InternalRos2Lexer.g:168:6: ( 'type' )
            // InternalRos2Lexer.g:168:8: 'type'
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
            // InternalRos2Lexer.g:170:5: ( 'Any' )
            // InternalRos2Lexer.g:170:7: 'Any'
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
            // InternalRos2Lexer.g:172:4: ( 'ns:' )
            // InternalRos2Lexer.g:172:6: 'ns:'
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
            // InternalRos2Lexer.g:174:37: ( '[]' )
            // InternalRos2Lexer.g:174:39: '[]'
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
            // InternalRos2Lexer.g:176:7: ( ',' )
            // InternalRos2Lexer.g:176:9: ','
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
            // InternalRos2Lexer.g:178:7: ( ':' )
            // InternalRos2Lexer.g:178:9: ':'
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
            // InternalRos2Lexer.g:180:19: ( '[' )
            // InternalRos2Lexer.g:180:21: '['
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
            // InternalRos2Lexer.g:182:20: ( ']' )
            // InternalRos2Lexer.g:182:22: ']'
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

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos2Lexer.g:184:19: ( '}' )
            // InternalRos2Lexer.g:184:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalRos2Lexer.g:186:21: ()
            // InternalRos2Lexer.g:186:23: 
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
            // InternalRos2Lexer.g:188:19: ()
            // InternalRos2Lexer.g:188:21: 
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
            // InternalRos2Lexer.g:190:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRos2Lexer.g:190:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRos2Lexer.g:190:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRos2Lexer.g:190:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
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
            // InternalRos2Lexer.g:192:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRos2Lexer.g:192:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRos2Lexer.g:192:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='/') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='^' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRos2Lexer.g:192:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos2Lexer.g:192:38: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
            // InternalRos2Lexer.g:194:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRos2Lexer.g:194:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRos2Lexer.g:194:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt3=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt3=2;
                    }
                    break;
                case '~':
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalRos2Lexer.g:194:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos2Lexer.g:194:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRos2Lexer.g:194:62: '~' RULE_STRING
            	    {
            	    match('~'); 
            	    mRULE_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop3;
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

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalRos2Lexer.g:196:21: ( '0' .. '9' )
            // InternalRos2Lexer.g:196:23: '0' .. '9'
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
            // InternalRos2Lexer.g:198:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRos2Lexer.g:198:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRos2Lexer.g:198:15: ( '0b' | '0B' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='b') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='B') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRos2Lexer.g:198:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:198:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRos2Lexer.g:198:27: ( '0' | '1' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='1')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRos2Lexer.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalRos2Lexer.g:200:14: ( ( 'true' | 'false' ) )
            // InternalRos2Lexer.g:200:16: ( 'true' | 'false' )
            {
            // InternalRos2Lexer.g:200:16: ( 'true' | 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='t') ) {
                alt6=1;
            }
            else if ( (LA6_0=='f') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRos2Lexer.g:200:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:200:24: 'false'
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
            // InternalRos2Lexer.g:202:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRos2Lexer.g:202:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT(); 
            // InternalRos2Lexer.g:202:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalRos2Lexer.g:202:27: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRos2Lexer.g:202:31: ( RULE_DECINT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRos2Lexer.g:202:31: RULE_DECINT
                    	    {
                    	    mRULE_DECINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:202:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRos2Lexer.g:202:44: ( '.' ( RULE_DIGIT )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRos2Lexer.g:202:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRos2Lexer.g:202:49: ( RULE_DIGIT )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalRos2Lexer.g:202:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop8;
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

                    // InternalRos2Lexer.g:202:73: ( '-' | '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRos2Lexer.g:
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
            // InternalRos2Lexer.g:204:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRos2Lexer.g:204:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRos2Lexer.g:204:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt14=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt14=1;
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
                alt14=2;
                }
                break;
            case '-':
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRos2Lexer.g:204:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:204:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRos2Lexer.g:204:29: ( RULE_DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRos2Lexer.g:204:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalRos2Lexer.g:204:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRos2Lexer.g:204:54: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRos2Lexer.g:204:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
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
            // InternalRos2Lexer.g:206:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRos2Lexer.g:206:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRos2Lexer.g:206:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>='1' && LA15_0<='3')) ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>='0' && LA15_1<='9')) ) {
                    alt15=2;
                }
                else {
                    alt15=1;}
            }
            else if ( ((LA15_0>='4' && LA15_0<='9')) ) {
                alt15=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos2Lexer.g:206:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:206:31: '1' .. '3' '0' .. '9'
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
            // InternalRos2Lexer.g:208:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRos2Lexer.g:208:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRos2Lexer.g:208:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='1') ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='0' && LA16_1<='2')) ) {
                    alt16=2;
                }
                else {
                    alt16=1;}
            }
            else if ( ((LA16_0>='2' && LA16_0<='9')) ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos2Lexer.g:208:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:208:33: '1' '0' .. '2'
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
            // InternalRos2Lexer.g:210:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRos2Lexer.g:210:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRos2Lexer.g:212:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRos2Lexer.g:212:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRos2Lexer.g:212:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='0' && LA17_0<='1')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='2') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRos2Lexer.g:212:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:212:41: '2' '0' .. '3'
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
            // InternalRos2Lexer.g:214:23: ( '0' .. '5' '0' .. '9' )
            // InternalRos2Lexer.g:214:25: '0' .. '5' '0' .. '9'
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
            // InternalRos2Lexer.g:216:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRos2Lexer.g:216:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRos2Lexer.g:218:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRos2Lexer.g:218:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRos2Lexer.g:218:25: ( RULE_ID | RULE_STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='A' && LA18_0<='Z')||(LA18_0>='^' && LA18_0<='_')||(LA18_0>='a' && LA18_0<='z')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='\"'||LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRos2Lexer.g:218:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:218:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRos2Lexer.g:218:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt19=4;
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
                alt19=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt19=2;
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
                alt19=3;
                }
                break;
            case '-':
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalRos2Lexer.g:218:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRos2Lexer.g:218:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRos2Lexer.g:218:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRos2Lexer.g:218:81: '-' RULE_INT
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos2Lexer.g:220:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRos2Lexer.g:220:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRos2Lexer.g:220:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRos2Lexer.g:220:11: '^'
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

            // InternalRos2Lexer.g:220:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRos2Lexer.g:
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
            // InternalRos2Lexer.g:222:19: ( ( '0' .. '9' )+ )
            // InternalRos2Lexer.g:222:21: ( '0' .. '9' )+
            {
            // InternalRos2Lexer.g:222:21: ( '0' .. '9' )+
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
            	    // InternalRos2Lexer.g:222:22: '0' .. '9'
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
            // InternalRos2Lexer.g:224:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRos2Lexer.g:224:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRos2Lexer.g:224:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRos2Lexer.g:224:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRos2Lexer.g:224:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRos2Lexer.g:224:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos2Lexer.g:224:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRos2Lexer.g:224:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRos2Lexer.g:224:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRos2Lexer.g:224:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos2Lexer.g:224:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRos2Lexer.g:226:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRos2Lexer.g:226:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRos2Lexer.g:226:24: ( options {greedy=false; } : . )*
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
            	    // InternalRos2Lexer.g:226:52: .
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
            // InternalRos2Lexer.g:228:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRos2Lexer.g:228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRos2Lexer.g:228:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalRos2Lexer.g:
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
            // InternalRos2Lexer.g:230:16: ( . )
            // InternalRos2Lexer.g:230:18: .
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
        // InternalRos2Lexer.g:1:8: ( ParameterStructMember | ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclient | Serviceserver | Actionclient | Actionserver | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=100;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalRos2Lexer.g:1:10: ParameterStructMember
                {
                mParameterStructMember(); 

                }
                break;
            case 2 :
                // InternalRos2Lexer.g:1:32: ExternalDependency
                {
                mExternalDependency(); 

                }
                break;
            case 3 :
                // InternalRos2Lexer.g:1:51: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 4 :
                // InternalRos2Lexer.g:1:69: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 5 :
                // InternalRos2Lexer.g:1:86: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 6 :
                // InternalRos2Lexer.g:1:102: Serviceclient
                {
                mServiceclient(); 

                }
                break;
            case 7 :
                // InternalRos2Lexer.g:1:116: Serviceserver
                {
                mServiceserver(); 

                }
                break;
            case 8 :
                // InternalRos2Lexer.g:1:130: Actionclient
                {
                mActionclient(); 

                }
                break;
            case 9 :
                // InternalRos2Lexer.g:1:143: Actionserver
                {
                mActionserver(); 

                }
                break;
            case 10 :
                // InternalRos2Lexer.g:1:156: Dependencies
                {
                mDependencies(); 

                }
                break;
            case 11 :
                // InternalRos2Lexer.g:1:169: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 12 :
                // InternalRos2Lexer.g:1:182: FromGitRepo
                {
                mFromGitRepo(); 

                }
                break;
            case 13 :
                // InternalRos2Lexer.g:1:194: Subscribers
                {
                mSubscribers(); 

                }
                break;
            case 14 :
                // InternalRos2Lexer.g:1:206: Parameters
                {
                mParameters(); 

                }
                break;
            case 15 :
                // InternalRos2Lexer.g:1:217: Publishers
                {
                mPublishers(); 

                }
                break;
            case 16 :
                // InternalRos2Lexer.g:1:228: Artifacts
                {
                mArtifacts(); 

                }
                break;
            case 17 :
                // InternalRos2Lexer.g:1:238: GraphName
                {
                mGraphName(); 

                }
                break;
            case 18 :
                // InternalRos2Lexer.g:1:248: Feedback_1
                {
                mFeedback_1(); 

                }
                break;
            case 19 :
                // InternalRos2Lexer.g:1:259: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 20 :
                // InternalRos2Lexer.g:1:269: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 21 :
                // InternalRos2Lexer.g:1:279: Response
                {
                mResponse(); 

                }
                break;
            case 22 :
                // InternalRos2Lexer.g:1:288: Duration
                {
                mDuration(); 

                }
                break;
            case 23 :
                // InternalRos2Lexer.g:1:297: Feedback
                {
                mFeedback(); 

                }
                break;
            case 24 :
                // InternalRos2Lexer.g:1:306: Message_1
                {
                mMessage_1(); 

                }
                break;
            case 25 :
                // InternalRos2Lexer.g:1:316: Request
                {
                mRequest(); 

                }
                break;
            case 26 :
                // InternalRos2Lexer.g:1:324: String_2
                {
                mString_2(); 

                }
                break;
            case 27 :
                // InternalRos2Lexer.g:1:333: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 28 :
                // InternalRos2Lexer.g:1:342: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 29 :
                // InternalRos2Lexer.g:1:351: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 30 :
                // InternalRos2Lexer.g:1:360: Boolean
                {
                mBoolean(); 

                }
                break;
            case 31 :
                // InternalRos2Lexer.g:1:368: Integer
                {
                mInteger(); 

                }
                break;
            case 32 :
                // InternalRos2Lexer.g:1:376: Action_1
                {
                mAction_1(); 

                }
                break;
            case 33 :
                // InternalRos2Lexer.g:1:385: Default
                {
                mDefault(); 

                }
                break;
            case 34 :
                // InternalRos2Lexer.g:1:393: Float32
                {
                mFloat32(); 

                }
                break;
            case 35 :
                // InternalRos2Lexer.g:1:401: Float64
                {
                mFloat64(); 

                }
                break;
            case 36 :
                // InternalRos2Lexer.g:1:409: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 37 :
                // InternalRos2Lexer.g:1:417: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 38 :
                // InternalRos2Lexer.g:1:425: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 39 :
                // InternalRos2Lexer.g:1:433: Message
                {
                mMessage(); 

                }
                break;
            case 40 :
                // InternalRos2Lexer.g:1:441: Result_1
                {
                mResult_1(); 

                }
                break;
            case 41 :
                // InternalRos2Lexer.g:1:450: Service
                {
                mService(); 

                }
                break;
            case 42 :
                // InternalRos2Lexer.g:1:458: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 43 :
                // InternalRos2Lexer.g:1:466: Array
                {
                mArray(); 

                }
                break;
            case 44 :
                // InternalRos2Lexer.g:1:472: Base64
                {
                mBase64(); 

                }
                break;
            case 45 :
                // InternalRos2Lexer.g:1:479: Double
                {
                mDouble(); 

                }
                break;
            case 46 :
                // InternalRos2Lexer.g:1:486: Header
                {
                mHeader(); 

                }
                break;
            case 47 :
                // InternalRos2Lexer.g:1:493: String
                {
                mString(); 

                }
                break;
            case 48 :
                // InternalRos2Lexer.g:1:500: Struct
                {
                mStruct(); 

                }
                break;
            case 49 :
                // InternalRos2Lexer.g:1:507: Action
                {
                mAction(); 

                }
                break;
            case 50 :
                // InternalRos2Lexer.g:1:514: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 51 :
                // InternalRos2Lexer.g:1:521: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 52 :
                // InternalRos2Lexer.g:1:528: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 53 :
                // InternalRos2Lexer.g:1:535: Result
                {
                mResult(); 

                }
                break;
            case 54 :
                // InternalRos2Lexer.g:1:542: Specs
                {
                mSpecs(); 

                }
                break;
            case 55 :
                // InternalRos2Lexer.g:1:548: String_1
                {
                mString_1(); 

                }
                break;
            case 56 :
                // InternalRos2Lexer.g:1:557: Uint16
                {
                mUint16(); 

                }
                break;
            case 57 :
                // InternalRos2Lexer.g:1:564: Uint32
                {
                mUint32(); 

                }
                break;
            case 58 :
                // InternalRos2Lexer.g:1:571: Uint64
                {
                mUint64(); 

                }
                break;
            case 59 :
                // InternalRos2Lexer.g:1:578: Goal_1
                {
                mGoal_1(); 

                }
                break;
            case 60 :
                // InternalRos2Lexer.g:1:585: Int16
                {
                mInt16(); 

                }
                break;
            case 61 :
                // InternalRos2Lexer.g:1:591: Int32
                {
                mInt32(); 

                }
                break;
            case 62 :
                // InternalRos2Lexer.g:1:597: Int64
                {
                mInt64(); 

                }
                break;
            case 63 :
                // InternalRos2Lexer.g:1:603: Node_1
                {
                mNode_1(); 

                }
                break;
            case 64 :
                // InternalRos2Lexer.g:1:610: Type_1
                {
                mType_1(); 

                }
                break;
            case 65 :
                // InternalRos2Lexer.g:1:617: Uint8
                {
                mUint8(); 

                }
                break;
            case 66 :
                // InternalRos2Lexer.g:1:623: Value
                {
                mValue(); 

                }
                break;
            case 67 :
                // InternalRos2Lexer.g:1:629: Date
                {
                mDate(); 

                }
                break;
            case 68 :
                // InternalRos2Lexer.g:1:634: List
                {
                mList(); 

                }
                break;
            case 69 :
                // InternalRos2Lexer.g:1:639: Bool
                {
                mBool(); 

                }
                break;
            case 70 :
                // InternalRos2Lexer.g:1:644: Byte
                {
                mByte(); 

                }
                break;
            case 71 :
                // InternalRos2Lexer.g:1:649: Goal
                {
                mGoal(); 

                }
                break;
            case 72 :
                // InternalRos2Lexer.g:1:654: Int8
                {
                mInt8(); 

                }
                break;
            case 73 :
                // InternalRos2Lexer.g:1:659: Msg
                {
                mMsg(); 

                }
                break;
            case 74 :
                // InternalRos2Lexer.g:1:663: Name
                {
                mName(); 

                }
                break;
            case 75 :
                // InternalRos2Lexer.g:1:668: Node
                {
                mNode(); 

                }
                break;
            case 76 :
                // InternalRos2Lexer.g:1:673: Srv
                {
                mSrv(); 

                }
                break;
            case 77 :
                // InternalRos2Lexer.g:1:677: Time
                {
                mTime(); 

                }
                break;
            case 78 :
                // InternalRos2Lexer.g:1:682: Type
                {
                mType(); 

                }
                break;
            case 79 :
                // InternalRos2Lexer.g:1:687: Any
                {
                mAny(); 

                }
                break;
            case 80 :
                // InternalRos2Lexer.g:1:691: Ns
                {
                mNs(); 

                }
                break;
            case 81 :
                // InternalRos2Lexer.g:1:694: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 82 :
                // InternalRos2Lexer.g:1:730: Comma
                {
                mComma(); 

                }
                break;
            case 83 :
                // InternalRos2Lexer.g:1:736: Colon
                {
                mColon(); 

                }
                break;
            case 84 :
                // InternalRos2Lexer.g:1:742: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 85 :
                // InternalRos2Lexer.g:1:760: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 86 :
                // InternalRos2Lexer.g:1:779: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 87 :
                // InternalRos2Lexer.g:1:797: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 88 :
                // InternalRos2Lexer.g:1:813: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 89 :
                // InternalRos2Lexer.g:1:835: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 90 :
                // InternalRos2Lexer.g:1:861: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 91 :
                // InternalRos2Lexer.g:1:873: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 92 :
                // InternalRos2Lexer.g:1:886: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 93 :
                // InternalRos2Lexer.g:1:898: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 94 :
                // InternalRos2Lexer.g:1:910: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 95 :
                // InternalRos2Lexer.g:1:925: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 96 :
                // InternalRos2Lexer.g:1:947: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 97 :
                // InternalRos2Lexer.g:1:955: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 98 :
                // InternalRos2Lexer.g:1:967: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 99 :
                // InternalRos2Lexer.g:1:983: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 100 :
                // InternalRos2Lexer.g:1:991: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA11_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA11_eofS =
        "\10\uffff";
    static final String DFA11_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA11_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA11_specialS =
        "\10\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "202:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA28_eotS =
        "\1\43\31\60\1\137\5\uffff\2\54\1\60\1\uffff\3\54\2\160\1\54\1\160\2\uffff\3\60\2\uffff\54\60\11\uffff\1\60\2\uffff\1\u00a5\2\uffff\1\u00a5\4\uffff\1\160\1\uffff\40\60\1\u00cc\11\60\1\uffff\5\60\3\uffff\1\160\12\60\1\uffff\17\60\1\uffff\7\60\1\u0101\1\60\1\uffff\1\60\1\u0104\3\60\1\u0109\1\u010b\1\u010d\1\u010f\1\u0110\1\u0112\1\u0113\1\u0114\1\60\1\u0116\1\160\22\60\1\u0114\11\60\1\u0134\3\60\1\u0139\1\u013b\1\u013d\2\uffff\2\60\1\uffff\3\60\15\uffff\1\u0143\1\uffff\10\60\1\u014d\1\uffff\1\u0151\13\60\1\u015e\2\60\1\u0162\1\u0164\1\u0166\2\uffff\1\60\1\u0168\1\60\7\uffff\1\u016a\1\u016b\1\u016c\1\u016d\1\uffff\6\60\1\u0176\1\60\2\uffff\2\60\2\uffff\2\60\1\u017c\3\60\1\u0181\1\u0183\3\60\2\uffff\1\60\1\u0189\6\uffff\1\u018a\1\uffff\1\u018b\4\uffff\10\60\1\uffff\5\60\1\uffff\1\u0199\1\60\1\u019c\4\uffff\3\60\5\uffff\5\60\1\u01a6\7\60\1\uffff\1\60\2\uffff\2\60\1\uffff\6\60\1\uffff\5\60\1\uffff\21\60\2\uffff\1\60\1\u01ce\6\60\1\uffff\3\60\1\uffff\1\60\1\uffff\6\60\3\uffff\5\60\2\uffff\4\60\1\u01e8\1\60\1\u01ea\2\60\1\uffff\1\60\1\uffff\1\60\1\u01ef\1\60\1\u01f1\1\uffff\1\60\1\uffff\1\60\1\u01f4\1\uffff";
    static final String DFA28_eofS =
        "\u01f5\uffff";
    static final String DFA28_minS =
        "\1\0\31\57\1\135\5\uffff\1\42\1\101\1\57\1\uffff\2\0\1\42\2\56\1\60\1\56\2\uffff\3\57\2\uffff\54\57\11\uffff\1\57\2\0\1\57\2\0\1\57\4\uffff\1\60\1\uffff\52\57\1\uffff\5\57\1\0\1\uffff\1\0\1\60\12\57\1\uffff\17\57\1\uffff\11\57\1\uffff\17\57\1\55\43\57\2\uffff\2\57\1\uffff\3\57\15\uffff\1\57\1\uffff\11\57\1\uffff\22\57\2\uffff\3\57\7\uffff\4\57\1\uffff\10\57\2\uffff\2\57\2\uffff\13\57\2\uffff\2\57\6\uffff\1\57\1\uffff\1\57\4\uffff\10\57\1\uffff\5\57\1\uffff\3\57\4\uffff\3\57\5\uffff\15\57\1\uffff\1\57\2\uffff\2\57\1\uffff\6\57\1\uffff\5\57\1\uffff\21\57\2\uffff\10\57\1\uffff\3\57\1\uffff\1\57\1\uffff\6\57\3\uffff\5\57\2\uffff\11\57\1\uffff\1\57\1\uffff\4\57\1\uffff\1\57\1\uffff\2\57\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\31\172\1\135\5\uffff\3\172\1\uffff\2\uffff\1\47\2\145\1\71\1\145\2\uffff\3\172\2\uffff\54\172\11\uffff\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\1\71\1\uffff\52\172\1\uffff\5\172\1\uffff\1\uffff\1\uffff\1\71\12\172\1\uffff\17\172\1\uffff\11\172\1\uffff\17\172\1\55\43\172\2\uffff\2\172\1\uffff\3\172\15\uffff\1\172\1\uffff\11\172\1\uffff\22\172\2\uffff\3\172\7\uffff\4\172\1\uffff\10\172\2\uffff\2\172\2\uffff\13\172\2\uffff\2\172\6\uffff\1\172\1\uffff\1\172\4\uffff\10\172\1\uffff\5\172\1\uffff\3\172\4\uffff\3\172\5\uffff\15\172\1\uffff\1\172\2\uffff\2\172\1\uffff\6\172\1\uffff\5\172\1\uffff\21\172\2\uffff\10\172\1\uffff\3\172\1\uffff\1\172\1\uffff\6\172\3\uffff\5\172\2\uffff\11\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA28_acceptS =
        "\33\uffff\1\122\1\123\1\125\1\126\1\127\3\uffff\1\130\7\uffff\1\143\1\144\3\uffff\1\140\1\137\54\uffff\1\121\1\124\1\122\1\123\1\125\1\126\1\127\1\142\1\131\7\uffff\1\132\1\136\1\135\1\134\1\uffff\1\143\52\uffff\1\120\6\uffff\1\141\14\uffff\1\114\17\uffff\1\111\11\uffff\1\117\63\uffff\1\64\1\110\2\uffff\1\103\3\uffff\1\62\1\105\1\63\1\106\1\73\1\107\1\77\1\113\1\112\1\100\1\116\1\115\1\133\1\uffff\1\104\11\uffff\1\66\22\uffff\1\52\1\101\3\uffff\1\44\1\74\1\45\1\75\1\46\1\76\1\53\4\uffff\1\102\10\uffff\1\32\1\67\2\uffff\1\40\1\61\13\uffff\1\50\1\65\2\uffff\1\33\1\70\1\34\1\71\1\35\1\72\1\uffff\1\54\1\uffff\1\55\1\56\1\57\1\60\10\uffff\1\51\5\uffff\1\41\3\uffff\1\23\1\42\1\24\1\43\3\uffff\1\31\1\30\1\47\1\36\1\37\15\uffff\1\26\1\uffff\1\22\1\27\2\uffff\1\25\6\uffff\1\21\5\uffff\1\20\21\uffff\1\16\1\17\10\uffff\1\15\3\uffff\1\14\1\uffff\1\13\6\uffff\1\10\1\11\1\12\5\uffff\1\6\1\7\11\uffff\1\5\1\uffff\1\4\4\uffff\1\3\1\uffff\1\2\2\uffff\1\1";
    static final String DFA28_specialS =
        "\1\2\43\uffff\1\5\1\10\102\uffff\1\0\1\4\1\uffff\1\1\1\7\67\uffff\1\3\1\uffff\1\6\u014e\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\44\1\37\3\54\1\45\4\54\1\33\1\51\1\54\1\40\1\47\2\50\7\52\1\34\6\54\1\20\1\15\1\42\1\21\1\2\1\42\1\4\1\22\1\16\2\42\1\31\3\42\1\1\1\42\1\3\1\23\7\42\1\32\1\54\1\35\1\41\1\42\1\54\1\6\1\24\1\42\1\7\1\42\1\10\1\25\1\42\1\17\3\42\1\13\1\26\1\42\1\11\1\42\1\12\1\5\1\27\1\14\1\30\4\42\2\54\1\36\1\46\uff81\54",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\55\20\57\1\56\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\27\57\1\62\2\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\63\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\64\5\57\1\65\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\66\12\57\1\71\1\57\1\72\1\57\1\70\1\67\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\73\16\57\1\74\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\75\17\57\1\76\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\102\3\57\1\100\6\57\1\101\5\57\1\77\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\103\23\57\1\104\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\105\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\106\15\57\1\107\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\110\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\112\15\57\1\111\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\113\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\114\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\116\3\57\1\115\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\120\15\57\1\117\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\121\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\122\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\123\11\57\1\124\1\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\125\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\127\15\57\1\126\3\57\1\130\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\132\10\57\1\133\6\57\1\131\1\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\134\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\135\21\57",
            "\1\136",
            "",
            "",
            "",
            "",
            "",
            "\1\146\4\uffff\1\146\2\uffff\1\145\26\uffff\32\43\3\uffff\2\43\1\uffff\32\43",
            "\32\147\4\uffff\1\147\1\uffff\32\147",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "\1\146\4\uffff\1\146",
            "\1\161\1\uffff\12\157\10\uffff\1\156\2\uffff\1\161\34\uffff\1\156\2\uffff\1\161",
            "\1\161\1\uffff\12\162\13\uffff\1\161\37\uffff\1\161",
            "\12\160",
            "\1\161\26\uffff\1\161\37\uffff\1\161",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\164\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\165\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\166\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\167\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\170\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\171\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\172\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\173\30\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\174\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\175\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\176\4\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\177\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0080\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\u0082\11\57\1\u0081\12\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0083\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0084\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0085\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0086\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0087\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0088\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u0089\30\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\20\57\1\u008b\1\57\1\u008a\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u008c\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u008d\23\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u008e\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u008f\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0090\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0091\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0092\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0093\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u0094\1\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u0095\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0096\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0097\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0098\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0099\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u009a\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u009b\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u009c\26\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u009d\15\57",
            "\1\43\12\57\1\u009e\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u009f\12\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00a0\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00a1\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00a2\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00a3\7\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\0\u00a4",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\1\146\15\uffff\1\61",
            "\0\u00a6",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "\1\146\15\uffff\1\61",
            "",
            "",
            "",
            "",
            "\12\u00a7",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00a8\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u00a9\4\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00aa\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00ab\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00ac\30\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u00ad\12\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u00ae\4\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00af\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b0\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00b1\27\57",
            "\1\43\12\57\1\u00b2\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b3\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00b4\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00b5\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b6\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00b7\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00b8\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00b9\26\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00ba\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00bb\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00bc\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00bd\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u00be\4\57\1\u00bf\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00c0\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00c1\7\57",
            "\1\43\12\57\1\u00c2\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00c3\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00c4\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c5\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00c6\25\57",
            "\1\43\1\57\1\u00c7\1\57\1\u00c8\2\57\1\u00c9\1\57\1\u00ca\1\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00cb\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00cd\30\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00ce\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u00cf\26\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00d0\13\57\1\u00d1\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00d2\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d3\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00d4\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d5\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d6\25\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d7\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d8\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00d9\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00da\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00db\6\57",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "\12\u00dc",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00dd\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00de\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00df\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00e0\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00e1\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u00e2\22\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00e3\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00e4\27\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00e5\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00e6\7\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00e7\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\u00e8\24\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00e9\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u00ea\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00eb\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\6\57\1\u00ec\23\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00ed\30\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00ee\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00ef\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u00f0\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u00f1\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00f2\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00f3\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00f4\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u00f5\31\57",
            "",
            "\1\43\1\57\1\u00f6\1\57\1\u00f7\2\57\1\u00f8\1\57\1\u00f9\1\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00fa\25\57",
            "\1\43\6\57\1\u00fb\3\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u00fc\23\57",
            "\1\43\6\57\1\u00fd\3\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\2\57\1\u00fe\7\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\4\57\1\u00ff\5\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0100\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u0102\1\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0103\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0105\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0106\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0107\27\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0108\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u010a\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u010c\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u010e\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u0111\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0115\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\157",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0117\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0118\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0119\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u011a\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u011b\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\15\57\1\u011c\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u011d\27\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u011e\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u011f\23\57",
            "\1\43\12\57\1\u0120\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0121\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0122\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u0123\26\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0124\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0125\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0126\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0127\31\57",
            "\1\43\3\57\1\u0128\2\57\1\u0129\3\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u012a\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u012b\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u012c\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u012d\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u012e\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u012f\23\57",
            "\1\43\6\57\1\u0130\3\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\2\57\1\u0131\7\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\4\57\1\u0132\5\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0133\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0135\31\57",
            "\1\43\4\57\1\u0136\5\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0137\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0138\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u013a\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u013c\3\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\43\12\57\1\u013e\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u013f\25\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0140\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\u0141\23\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0142\6\57",
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
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0144\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0145\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0146\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u0147\4\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\15\57\1\u0148\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0149\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u014a\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u014b\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u014c\3\uffff\1\57\1\uffff\32\57",
            "",
            "\1\43\12\57\1\u0150\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u014e\17\57\1\u014f\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0152\27\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0153\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0154\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0155\13\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0156\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0157\27\57",
            "\1\43\2\57\1\u0158\7\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\4\57\1\u0159\5\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u015a\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u015b\22\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u015c\7\57",
            "\1\43\12\57\1\u015d\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u015f\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0160\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0161\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0163\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0165\3\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u0167\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0169\10\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u016e\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\15\57\1\u016f\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0170\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0171\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u0172\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0173\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0174\17\57\1\u0175\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u0177\30\57",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0178\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0179\25\57",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u017a\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u017b\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u017d\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\21\57\1\u017e\10\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\u017f\17\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0180\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\1\u0182\3\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0184\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0185\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0186\25\57",
            "",
            "",
            "\1\43\12\57\1\u0187\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u0188\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u018c\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u018d\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\3\57\1\u018e\26\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\15\57\1\u018f\14\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0190\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0191\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0192\16\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0193\25\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0194\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0195\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0196\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0197\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u0198\27\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u019a\25\57",
            "\1\43\12\57\1\u019b\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u019d\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u019e\10\57",
            "\1\43\12\57\1\u019f\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\1\u01a1\21\57\1\u01a0\7\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u01a2\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01a3\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01a4\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01a5\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u01a7\21\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01a8\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01a9\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01aa\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u01ab\4\57",
            "\1\43\12\57\1\u01ac\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u01ad\21\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01ae\12\57",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01af\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01b0\7\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01b1\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01b2\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01b3\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01b4\12\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u01b5\15\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01b6\7\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01b7\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\25\57\1\u01b8\4\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01b9\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01ba\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01bb\25\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01bc\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u01bd\13\57",
            "\1\43\12\57\1\u01be\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u01bf\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01c0\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u01c1\1\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01c2\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01c3\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01c4\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01c5\12\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01c6\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01c7\25\57",
            "\1\43\12\57\1\u01c8\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01c9\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01ca\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01cb\7\57",
            "\1\43\12\57\1\u01cc\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u01cd\5\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01cf\12\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01d0\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u01d1\7\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01d2\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01d3\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01d4\10\57",
            "",
            "\1\43\12\57\1\u01d5\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u01d6\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u01d7\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01d8\27\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01d9\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\u01da\26\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\u01db\12\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01dc\27\57",
            "\1\43\12\57\1\u01dd\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\1\u01de\2\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u01df\6\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01e0\27\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e1\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\u01e2\31\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e3\25\57",
            "",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\14\57\1\u01e4\15\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e5\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u01e6\14\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01e7\27\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01e9\25\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u01eb\27\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01ec\25\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u01ed\15\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u01ee\1\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u01f0\30\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u01f2\25\57",
            "",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u01f3\10\57",
            "\1\43\12\57\3\uffff\1\61\3\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
            return "1:1: Tokens : ( ParameterStructMember | ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclient | Serviceserver | Actionclient | Actionserver | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RightCurlyBracket | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_104 = input.LA(1);

                        s = -1;
                        if ( ((LA28_104>='\u0000' && LA28_104<='\uFFFF')) ) {s = 164;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_107 = input.LA(1);

                        s = -1;
                        if ( ((LA28_107>='\u0000' && LA28_107<='\uFFFF')) ) {s = 166;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
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

                        else if ( (LA28_0=='g') ) {s = 21;}

                        else if ( (LA28_0=='n') ) {s = 22;}

                        else if ( (LA28_0=='t') ) {s = 23;}

                        else if ( (LA28_0=='v') ) {s = 24;}

                        else if ( (LA28_0=='L') ) {s = 25;}

                        else if ( (LA28_0=='[') ) {s = 26;}

                        else if ( (LA28_0==',') ) {s = 27;}

                        else if ( (LA28_0==':') ) {s = 28;}

                        else if ( (LA28_0==']') ) {s = 29;}

                        else if ( (LA28_0=='}') ) {s = 30;}

                        else if ( (LA28_0=='#') ) {s = 31;}

                        else if ( (LA28_0=='/') ) {s = 32;}

                        else if ( (LA28_0=='^') ) {s = 33;}

                        else if ( (LA28_0=='C'||LA28_0=='F'||(LA28_0>='J' && LA28_0<='K')||(LA28_0>='M' && LA28_0<='O')||LA28_0=='Q'||(LA28_0>='T' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='c'||LA28_0=='e'||LA28_0=='h'||(LA28_0>='j' && LA28_0<='l')||LA28_0=='o'||LA28_0=='q'||(LA28_0>='w' && LA28_0<='z')) ) {s = 34;}

                        else if ( (LA28_0=='\"') ) {s = 36;}

                        else if ( (LA28_0=='\'') ) {s = 37;}

                        else if ( (LA28_0=='~') ) {s = 38;}

                        else if ( (LA28_0=='0') ) {s = 39;}

                        else if ( ((LA28_0>='1' && LA28_0<='2')) ) {s = 40;}

                        else if ( (LA28_0=='-') ) {s = 41;}

                        else if ( ((LA28_0>='3' && LA28_0<='9')) ) {s = 42;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 43;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='!'||(LA28_0>='$' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='+')||LA28_0=='.'||(LA28_0>=';' && LA28_0<='@')||LA28_0=='\\'||LA28_0=='`'||(LA28_0>='{' && LA28_0<='|')||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 44;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_164 = input.LA(1);

                        s = -1;
                        if ( (LA28_164=='\"') ) {s = 106;}

                        else if ( (LA28_164=='\\') ) {s = 104;}

                        else if ( ((LA28_164>='\u0000' && LA28_164<='!')||(LA28_164>='#' && LA28_164<='[')||(LA28_164>=']' && LA28_164<='\uFFFF')) ) {s = 105;}

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
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( (LA28_36=='\\') ) {s = 104;}

                        else if ( ((LA28_36>='\u0000' && LA28_36<='!')||(LA28_36>='#' && LA28_36<='[')||(LA28_36>=']' && LA28_36<='\uFFFF')) ) {s = 105;}

                        else if ( (LA28_36=='\"') ) {s = 106;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_166 = input.LA(1);

                        s = -1;
                        if ( (LA28_166=='\'') ) {s = 109;}

                        else if ( (LA28_166=='\\') ) {s = 107;}

                        else if ( ((LA28_166>='\u0000' && LA28_166<='&')||(LA28_166>='(' && LA28_166<='[')||(LA28_166>=']' && LA28_166<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_108 = input.LA(1);

                        s = -1;
                        if ( (LA28_108=='\'') ) {s = 109;}

                        else if ( (LA28_108=='\\') ) {s = 107;}

                        else if ( ((LA28_108>='\u0000' && LA28_108<='&')||(LA28_108>='(' && LA28_108<='[')||(LA28_108>=']' && LA28_108<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_37 = input.LA(1);

                        s = -1;
                        if ( (LA28_37=='\\') ) {s = 107;}

                        else if ( ((LA28_37>='\u0000' && LA28_37<='&')||(LA28_37>='(' && LA28_37<='[')||(LA28_37>=']' && LA28_37<='\uFFFF')) ) {s = 108;}

                        else if ( (LA28_37=='\'') ) {s = 109;}

                        else s = 44;

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