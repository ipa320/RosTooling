package de.fraunhofer.ipa.ros.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosLexer extends Lexer {
    public static final int Float32_1=21;
    public static final int Node=78;
    public static final int RULE_DATE_TIME=99;
    public static final int Uint64_1=31;
    public static final int String=49;
    public static final int Int16=63;
    public static final int Float32=36;
    public static final int Goal=74;
    public static final int Bool=72;
    public static final int Uint16=58;
    public static final int Boolean=32;
    public static final int ExternalDependency=5;
    public static final int Uint8=68;
    public static final int Parameters=17;
    public static final int RULE_ID=100;
    public static final int Actionclient=11;
    public static final int RULE_DIGIT=89;
    public static final int GlobalNamespace=8;
    public static final int Node_1=66;
    public static final int Int16_1=38;
    public static final int Header=48;
    public static final int RULE_INT=102;
    public static final int Byte=73;
    public static final int RULE_ML_COMMENT=109;
    public static final int LeftSquareBracket=87;
    public static final int Specs=56;
    public static final int Base64=46;
    public static final int Message_1=26;
    public static final int Comma=85;
    public static final int RULE_MESSAGE_ASIGMENT=103;
    public static final int Goal_1=62;
    public static final int LeftSquareBracketRightSquareBracket=84;
    public static final int Int32=64;
    public static final int Publishers=18;
    public static final int Serviceserver=10;
    public static final int RULE_DECINT=92;
    public static final int Uint32=59;
    public static final int FromGitRepo=15;
    public static final int Msg=76;
    public static final int RULE_HOUR=97;
    public static final int Int8=75;
    public static final int Default=35;
    public static final int Actionserver=12;
    public static final int Int8_1=54;
    public static final int Uint16_1=29;
    public static final int Type=81;
    public static final int Float64=37;
    public static final int Int32_1=39;
    public static final int Result_1=42;
    public static final int RULE_BINARY=90;
    public static final int String_1=57;
    public static final int Subscribers=16;
    public static final int String_2=28;
    public static final int RULE_DAY=94;
    public static final int RULE_BEGIN=104;
    public static final int RULE_BOOLEAN=91;
    public static final int RelativeNamespace=6;
    public static final int RULE_YEAR=96;
    public static final int Feedback_1=20;
    public static final int Result=55;
    public static final int Name=77;
    public static final int RULE_MIN_SEC=98;
    public static final int ParameterAny=14;
    public static final int List=71;
    public static final int Dependencies=13;
    public static final int RightSquareBracket=88;
    public static final int PrivateNamespace=7;
    public static final int GraphName=19;
    public static final int Byte_1=53;
    public static final int Float64_1=22;
    public static final int Duration=24;
    public static final int Uint32_1=30;
    public static final int Action_1=34;
    public static final int Double=47;
    public static final int Type_1=67;
    public static final int Value=69;
    public static final int Uint64=60;
    public static final int Action=51;
    public static final int RULE_END=105;
    public static final int Message=41;
    public static final int Value_1=61;
    public static final int Time=80;
    public static final int RULE_STRING=101;
    public static final int Bool_1=52;
    public static final int Any=82;
    public static final int Struct=50;
    public static final int RULE_SL_COMMENT=106;
    public static final int Uint8_1=44;
    public static final int RULE_DOUBLE=93;
    public static final int Feedback=25;
    public static final int ParameterStructMember=4;
    public static final int Srv=79;
    public static final int RULE_ROS_CONVENTION_A=107;
    public static final int RULE_ROS_CONVENTION_PARAM=108;
    public static final int Colon=86;
    public static final int EOF=-1;
    public static final int Ns=83;
    public static final int RULE_WS=110;
    public static final int Request=27;
    public static final int Int64_1=40;
    public static final int Service=43;
    public static final int RULE_ANY_OTHER=111;
    public static final int Date=70;
    public static final int Response=23;
    public static final int Integer=33;
    public static final int Array=45;
    public static final int Serviceclient=9;
    public static final int Int64=65;
    public static final int RULE_MONTH=95;

    // delegates
    // delegators

    public InternalRosLexer() {;} 
    public InternalRosLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRosLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRosLexer.g"; }

    // $ANTLR start "ParameterStructMember"
    public final void mParameterStructMember() throws RecognitionException {
        try {
            int _type = ParameterStructMember;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosLexer.g:14:23: ( 'ParameterStructMember' )
            // InternalRosLexer.g:14:25: 'ParameterStructMember'
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
            // InternalRosLexer.g:16:20: ( 'ExternalDependency' )
            // InternalRosLexer.g:16:22: 'ExternalDependency'
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
            // InternalRosLexer.g:18:19: ( 'RelativeNamespace' )
            // InternalRosLexer.g:18:21: 'RelativeNamespace'
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
            // InternalRosLexer.g:20:18: ( 'PrivateNamespace' )
            // InternalRosLexer.g:20:20: 'PrivateNamespace'
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
            // InternalRosLexer.g:22:17: ( 'GlobalNamespace' )
            // InternalRosLexer.g:22:19: 'GlobalNamespace'
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
            // InternalRosLexer.g:24:15: ( 'serviceclient:' )
            // InternalRosLexer.g:24:17: 'serviceclient:'
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
            // InternalRosLexer.g:26:15: ( 'serviceserver:' )
            // InternalRosLexer.g:26:17: 'serviceserver:'
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
            // InternalRosLexer.g:28:14: ( 'actionclient:' )
            // InternalRosLexer.g:28:16: 'actionclient:'
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
            // InternalRosLexer.g:30:14: ( 'actionserver:' )
            // InternalRosLexer.g:30:16: 'actionserver:'
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
            // InternalRosLexer.g:32:14: ( 'dependencies:' )
            // InternalRosLexer.g:32:16: 'dependencies:'
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
            // InternalRosLexer.g:34:14: ( 'ParameterAny' )
            // InternalRosLexer.g:34:16: 'ParameterAny'
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
            // InternalRosLexer.g:36:13: ( 'fromGitRepo:' )
            // InternalRosLexer.g:36:15: 'fromGitRepo:'
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
            // InternalRosLexer.g:38:13: ( 'subscribers:' )
            // InternalRosLexer.g:38:15: 'subscribers:'
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
            // InternalRosLexer.g:40:12: ( 'parameters:' )
            // InternalRosLexer.g:40:14: 'parameters:'
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
            // InternalRosLexer.g:42:12: ( 'publishers:' )
            // InternalRosLexer.g:42:14: 'publishers:'
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

    // $ANTLR start "GraphName"
    public final void mGraphName() throws RecognitionException {
        try {
            int _type = GraphName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosLexer.g:44:11: ( 'GraphName' )
            // InternalRosLexer.g:44:13: 'GraphName'
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
            // InternalRosLexer.g:46:12: ( 'feedback:' )
            // InternalRosLexer.g:46:14: 'feedback:'
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
            // InternalRosLexer.g:48:11: ( 'float32[]' )
            // InternalRosLexer.g:48:13: 'float32[]'
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
            // InternalRosLexer.g:50:11: ( 'float64[]' )
            // InternalRosLexer.g:50:13: 'float64[]'
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
            // InternalRosLexer.g:52:10: ( 'response:' )
            // InternalRosLexer.g:52:12: 'response:'
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
            // InternalRosLexer.g:54:10: ( 'duration' )
            // InternalRosLexer.g:54:12: 'duration'
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
            // InternalRosLexer.g:56:10: ( 'feedback' )
            // InternalRosLexer.g:56:12: 'feedback'
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
            // InternalRosLexer.g:58:11: ( 'message:' )
            // InternalRosLexer.g:58:13: 'message:'
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
            // InternalRosLexer.g:60:9: ( 'request:' )
            // InternalRosLexer.g:60:11: 'request:'
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
            // InternalRosLexer.g:62:10: ( 'string[]' )
            // InternalRosLexer.g:62:12: 'string[]'
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
            // InternalRosLexer.g:64:10: ( 'uint16[]' )
            // InternalRosLexer.g:64:12: 'uint16[]'
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
            // InternalRosLexer.g:66:10: ( 'uint32[]' )
            // InternalRosLexer.g:66:12: 'uint32[]'
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
            // InternalRosLexer.g:68:10: ( 'uint64[]' )
            // InternalRosLexer.g:68:12: 'uint64[]'
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
            // InternalRosLexer.g:70:9: ( 'Boolean' )
            // InternalRosLexer.g:70:11: 'Boolean'
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
            // InternalRosLexer.g:72:9: ( 'Integer' )
            // InternalRosLexer.g:72:11: 'Integer'
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
            // InternalRosLexer.g:74:10: ( 'action:' )
            // InternalRosLexer.g:74:12: 'action:'
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
            // InternalRosLexer.g:76:9: ( 'default' )
            // InternalRosLexer.g:76:11: 'default'
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
            // InternalRosLexer.g:78:9: ( 'float32' )
            // InternalRosLexer.g:78:11: 'float32'
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
            // InternalRosLexer.g:80:9: ( 'float64' )
            // InternalRosLexer.g:80:11: 'float64'
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
            // InternalRosLexer.g:82:9: ( 'int16[]' )
            // InternalRosLexer.g:82:11: 'int16[]'
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
            // InternalRosLexer.g:84:9: ( 'int32[]' )
            // InternalRosLexer.g:84:11: 'int32[]'
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
            // InternalRosLexer.g:86:9: ( 'int64[]' )
            // InternalRosLexer.g:86:11: 'int64[]'
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
            // InternalRosLexer.g:88:9: ( 'message' )
            // InternalRosLexer.g:88:11: 'message'
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
            // InternalRosLexer.g:90:10: ( 'result:' )
            // InternalRosLexer.g:90:12: 'result:'
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
            // InternalRosLexer.g:92:9: ( 'service' )
            // InternalRosLexer.g:92:11: 'service'
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
            // InternalRosLexer.g:94:9: ( 'uint8[]' )
            // InternalRosLexer.g:94:11: 'uint8[]'
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
            // InternalRosLexer.g:96:7: ( 'Array:' )
            // InternalRosLexer.g:96:9: 'Array:'
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
            // InternalRosLexer.g:98:8: ( 'Base64' )
            // InternalRosLexer.g:98:10: 'Base64'
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
            // InternalRosLexer.g:100:8: ( 'Double' )
            // InternalRosLexer.g:100:10: 'Double'
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
            // InternalRosLexer.g:102:8: ( 'Header' )
            // InternalRosLexer.g:102:10: 'Header'
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
            // InternalRosLexer.g:104:8: ( 'String' )
            // InternalRosLexer.g:104:10: 'String'
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
            // InternalRosLexer.g:106:8: ( 'Struct' )
            // InternalRosLexer.g:106:10: 'Struct'
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
            // InternalRosLexer.g:108:8: ( 'action' )
            // InternalRosLexer.g:108:10: 'action'
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
            // InternalRosLexer.g:110:8: ( 'bool[]' )
            // InternalRosLexer.g:110:10: 'bool[]'
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
            // InternalRosLexer.g:112:8: ( 'byte[]' )
            // InternalRosLexer.g:112:10: 'byte[]'
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
            // InternalRosLexer.g:114:8: ( 'int8[]' )
            // InternalRosLexer.g:114:10: 'int8[]'
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
            // InternalRosLexer.g:116:8: ( 'result' )
            // InternalRosLexer.g:116:10: 'result'
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
            // InternalRosLexer.g:118:7: ( 'specs:' )
            // InternalRosLexer.g:118:9: 'specs:'
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
            // InternalRosLexer.g:120:10: ( 'string' )
            // InternalRosLexer.g:120:12: 'string'
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
            // InternalRosLexer.g:122:8: ( 'uint16' )
            // InternalRosLexer.g:122:10: 'uint16'
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
            // InternalRosLexer.g:124:8: ( 'uint32' )
            // InternalRosLexer.g:124:10: 'uint32'
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
            // InternalRosLexer.g:126:8: ( 'uint64' )
            // InternalRosLexer.g:126:10: 'uint64'
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
            // InternalRosLexer.g:128:9: ( 'value:' )
            // InternalRosLexer.g:128:11: 'value:'
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
            // InternalRosLexer.g:130:8: ( 'goal:' )
            // InternalRosLexer.g:130:10: 'goal:'
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
            // InternalRosLexer.g:132:7: ( 'int16' )
            // InternalRosLexer.g:132:9: 'int16'
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
            // InternalRosLexer.g:134:7: ( 'int32' )
            // InternalRosLexer.g:134:9: 'int32'
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
            // InternalRosLexer.g:136:7: ( 'int64' )
            // InternalRosLexer.g:136:9: 'int64'
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
            // InternalRosLexer.g:138:8: ( 'node:' )
            // InternalRosLexer.g:138:10: 'node:'
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
            // InternalRosLexer.g:140:8: ( 'type:' )
            // InternalRosLexer.g:140:10: 'type:'
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
            // InternalRosLexer.g:142:7: ( 'uint8' )
            // InternalRosLexer.g:142:9: 'uint8'
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
            // InternalRosLexer.g:144:7: ( 'value' )
            // InternalRosLexer.g:144:9: 'value'
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
            // InternalRosLexer.g:146:6: ( 'Date' )
            // InternalRosLexer.g:146:8: 'Date'
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
            // InternalRosLexer.g:148:6: ( 'List' )
            // InternalRosLexer.g:148:8: 'List'
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
            // InternalRosLexer.g:150:6: ( 'bool' )
            // InternalRosLexer.g:150:8: 'bool'
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
            // InternalRosLexer.g:152:6: ( 'byte' )
            // InternalRosLexer.g:152:8: 'byte'
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
            // InternalRosLexer.g:154:6: ( 'goal' )
            // InternalRosLexer.g:154:8: 'goal'
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
            // InternalRosLexer.g:156:6: ( 'int8' )
            // InternalRosLexer.g:156:8: 'int8'
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
            // InternalRosLexer.g:158:5: ( 'msg:' )
            // InternalRosLexer.g:158:7: 'msg:'
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
            // InternalRosLexer.g:160:6: ( 'name' )
            // InternalRosLexer.g:160:8: 'name'
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
            // InternalRosLexer.g:162:6: ( 'node' )
            // InternalRosLexer.g:162:8: 'node'
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
            // InternalRosLexer.g:164:5: ( 'srv:' )
            // InternalRosLexer.g:164:7: 'srv:'
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
            // InternalRosLexer.g:166:6: ( 'time' )
            // InternalRosLexer.g:166:8: 'time'
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
            // InternalRosLexer.g:168:6: ( 'type' )
            // InternalRosLexer.g:168:8: 'type'
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
            // InternalRosLexer.g:170:5: ( 'Any' )
            // InternalRosLexer.g:170:7: 'Any'
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
            // InternalRosLexer.g:172:4: ( 'ns:' )
            // InternalRosLexer.g:172:6: 'ns:'
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
            // InternalRosLexer.g:174:37: ( '[]' )
            // InternalRosLexer.g:174:39: '[]'
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
            // InternalRosLexer.g:176:7: ( ',' )
            // InternalRosLexer.g:176:9: ','
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
            // InternalRosLexer.g:178:7: ( ':' )
            // InternalRosLexer.g:178:9: ':'
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
            // InternalRosLexer.g:180:19: ( '[' )
            // InternalRosLexer.g:180:21: '['
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
            // InternalRosLexer.g:182:20: ( ']' )
            // InternalRosLexer.g:182:22: ']'
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
            // InternalRosLexer.g:184:21: ( '0' .. '9' )
            // InternalRosLexer.g:184:23: '0' .. '9'
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
            // InternalRosLexer.g:186:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosLexer.g:186:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosLexer.g:186:15: ( '0b' | '0B' )
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
                    // InternalRosLexer.g:186:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:186:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosLexer.g:186:27: ( '0' | '1' )+
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
            	    // InternalRosLexer.g:
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
            // InternalRosLexer.g:188:14: ( ( 'true' | 'false' ) )
            // InternalRosLexer.g:188:16: ( 'true' | 'false' )
            {
            // InternalRosLexer.g:188:16: ( 'true' | 'false' )
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
                    // InternalRosLexer.g:188:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:188:24: 'false'
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
            // InternalRosLexer.g:190:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRosLexer.g:190:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT(); 
            // InternalRosLexer.g:190:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRosLexer.g:190:27: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRosLexer.g:190:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosLexer.g:190:31: RULE_DECINT
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
                    // InternalRosLexer.g:190:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRosLexer.g:190:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRosLexer.g:190:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosLexer.g:190:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalRosLexer.g:190:49: RULE_DIGIT
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

                    // InternalRosLexer.g:190:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRosLexer.g:
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
            // InternalRosLexer.g:192:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosLexer.g:192:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosLexer.g:192:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosLexer.g:192:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:192:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosLexer.g:192:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRosLexer.g:192:29: RULE_DIGIT
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
                    // InternalRosLexer.g:192:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosLexer.g:192:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRosLexer.g:192:54: RULE_DIGIT
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
            // InternalRosLexer.g:194:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosLexer.g:194:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosLexer.g:194:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosLexer.g:194:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:194:31: '1' .. '3' '0' .. '9'
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
            // InternalRosLexer.g:196:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosLexer.g:196:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosLexer.g:196:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosLexer.g:196:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:196:33: '1' '0' .. '2'
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
            // InternalRosLexer.g:198:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosLexer.g:198:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosLexer.g:200:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosLexer.g:200:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosLexer.g:200:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosLexer.g:200:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:200:41: '2' '0' .. '3'
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
            // InternalRosLexer.g:202:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosLexer.g:202:25: '0' .. '5' '0' .. '9'
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
            // InternalRosLexer.g:204:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosLexer.g:204:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosLexer.g:206:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosLexer.g:206:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosLexer.g:206:25: ( RULE_ID | RULE_STRING )
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
                    // InternalRosLexer.g:206:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:206:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRosLexer.g:206:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalRosLexer.g:206:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:206:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRosLexer.g:206:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRosLexer.g:206:81: '-' RULE_INT
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
            // InternalRosLexer.g:208:21: ()
            // InternalRosLexer.g:208:23: 
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
            // InternalRosLexer.g:210:19: ()
            // InternalRosLexer.g:210:21: 
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
            // InternalRosLexer.g:212:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosLexer.g:212:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRosLexer.g:212:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRosLexer.g:212:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalRosLexer.g:214:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosLexer.g:214:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosLexer.g:214:25: ( '/' RULE_ID | RULE_ID '/' )*
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
            	    // InternalRosLexer.g:214:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosLexer.g:214:38: RULE_ID '/'
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
            // InternalRosLexer.g:216:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosLexer.g:216:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosLexer.g:216:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
            	    // InternalRosLexer.g:216:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosLexer.g:216:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRosLexer.g:216:62: '~' RULE_STRING
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
            // InternalRosLexer.g:218:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosLexer.g:218:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosLexer.g:218:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosLexer.g:218:11: '^'
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

            // InternalRosLexer.g:218:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosLexer.g:
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
            // InternalRosLexer.g:220:19: ( ( '0' .. '9' )+ )
            // InternalRosLexer.g:220:21: ( '0' .. '9' )+
            {
            // InternalRosLexer.g:220:21: ( '0' .. '9' )+
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
            	    // InternalRosLexer.g:220:22: '0' .. '9'
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
            // InternalRosLexer.g:222:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosLexer.g:222:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosLexer.g:222:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRosLexer.g:222:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosLexer.g:222:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRosLexer.g:222:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosLexer.g:222:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRosLexer.g:222:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosLexer.g:222:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRosLexer.g:222:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosLexer.g:222:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRosLexer.g:224:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosLexer.g:224:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosLexer.g:224:24: ( options {greedy=false; } : . )*
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
            	    // InternalRosLexer.g:224:52: .
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
            // InternalRosLexer.g:226:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosLexer.g:226:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosLexer.g:226:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalRosLexer.g:
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
            // InternalRosLexer.g:228:16: ( . )
            // InternalRosLexer.g:228:18: .
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
        // InternalRosLexer.g:1:8: ( ParameterStructMember | ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclient | Serviceserver | Actionclient | Actionserver | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=99;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalRosLexer.g:1:10: ParameterStructMember
                {
                mParameterStructMember(); 

                }
                break;
            case 2 :
                // InternalRosLexer.g:1:32: ExternalDependency
                {
                mExternalDependency(); 

                }
                break;
            case 3 :
                // InternalRosLexer.g:1:51: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 4 :
                // InternalRosLexer.g:1:69: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 5 :
                // InternalRosLexer.g:1:86: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 6 :
                // InternalRosLexer.g:1:102: Serviceclient
                {
                mServiceclient(); 

                }
                break;
            case 7 :
                // InternalRosLexer.g:1:116: Serviceserver
                {
                mServiceserver(); 

                }
                break;
            case 8 :
                // InternalRosLexer.g:1:130: Actionclient
                {
                mActionclient(); 

                }
                break;
            case 9 :
                // InternalRosLexer.g:1:143: Actionserver
                {
                mActionserver(); 

                }
                break;
            case 10 :
                // InternalRosLexer.g:1:156: Dependencies
                {
                mDependencies(); 

                }
                break;
            case 11 :
                // InternalRosLexer.g:1:169: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 12 :
                // InternalRosLexer.g:1:182: FromGitRepo
                {
                mFromGitRepo(); 

                }
                break;
            case 13 :
                // InternalRosLexer.g:1:194: Subscribers
                {
                mSubscribers(); 

                }
                break;
            case 14 :
                // InternalRosLexer.g:1:206: Parameters
                {
                mParameters(); 

                }
                break;
            case 15 :
                // InternalRosLexer.g:1:217: Publishers
                {
                mPublishers(); 

                }
                break;
            case 16 :
                // InternalRosLexer.g:1:228: GraphName
                {
                mGraphName(); 

                }
                break;
            case 17 :
                // InternalRosLexer.g:1:238: Feedback_1
                {
                mFeedback_1(); 

                }
                break;
            case 18 :
                // InternalRosLexer.g:1:249: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 19 :
                // InternalRosLexer.g:1:259: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 20 :
                // InternalRosLexer.g:1:269: Response
                {
                mResponse(); 

                }
                break;
            case 21 :
                // InternalRosLexer.g:1:278: Duration
                {
                mDuration(); 

                }
                break;
            case 22 :
                // InternalRosLexer.g:1:287: Feedback
                {
                mFeedback(); 

                }
                break;
            case 23 :
                // InternalRosLexer.g:1:296: Message_1
                {
                mMessage_1(); 

                }
                break;
            case 24 :
                // InternalRosLexer.g:1:306: Request
                {
                mRequest(); 

                }
                break;
            case 25 :
                // InternalRosLexer.g:1:314: String_2
                {
                mString_2(); 

                }
                break;
            case 26 :
                // InternalRosLexer.g:1:323: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 27 :
                // InternalRosLexer.g:1:332: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 28 :
                // InternalRosLexer.g:1:341: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 29 :
                // InternalRosLexer.g:1:350: Boolean
                {
                mBoolean(); 

                }
                break;
            case 30 :
                // InternalRosLexer.g:1:358: Integer
                {
                mInteger(); 

                }
                break;
            case 31 :
                // InternalRosLexer.g:1:366: Action_1
                {
                mAction_1(); 

                }
                break;
            case 32 :
                // InternalRosLexer.g:1:375: Default
                {
                mDefault(); 

                }
                break;
            case 33 :
                // InternalRosLexer.g:1:383: Float32
                {
                mFloat32(); 

                }
                break;
            case 34 :
                // InternalRosLexer.g:1:391: Float64
                {
                mFloat64(); 

                }
                break;
            case 35 :
                // InternalRosLexer.g:1:399: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 36 :
                // InternalRosLexer.g:1:407: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 37 :
                // InternalRosLexer.g:1:415: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 38 :
                // InternalRosLexer.g:1:423: Message
                {
                mMessage(); 

                }
                break;
            case 39 :
                // InternalRosLexer.g:1:431: Result_1
                {
                mResult_1(); 

                }
                break;
            case 40 :
                // InternalRosLexer.g:1:440: Service
                {
                mService(); 

                }
                break;
            case 41 :
                // InternalRosLexer.g:1:448: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 42 :
                // InternalRosLexer.g:1:456: Array
                {
                mArray(); 

                }
                break;
            case 43 :
                // InternalRosLexer.g:1:462: Base64
                {
                mBase64(); 

                }
                break;
            case 44 :
                // InternalRosLexer.g:1:469: Double
                {
                mDouble(); 

                }
                break;
            case 45 :
                // InternalRosLexer.g:1:476: Header
                {
                mHeader(); 

                }
                break;
            case 46 :
                // InternalRosLexer.g:1:483: String
                {
                mString(); 

                }
                break;
            case 47 :
                // InternalRosLexer.g:1:490: Struct
                {
                mStruct(); 

                }
                break;
            case 48 :
                // InternalRosLexer.g:1:497: Action
                {
                mAction(); 

                }
                break;
            case 49 :
                // InternalRosLexer.g:1:504: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 50 :
                // InternalRosLexer.g:1:511: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 51 :
                // InternalRosLexer.g:1:518: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 52 :
                // InternalRosLexer.g:1:525: Result
                {
                mResult(); 

                }
                break;
            case 53 :
                // InternalRosLexer.g:1:532: Specs
                {
                mSpecs(); 

                }
                break;
            case 54 :
                // InternalRosLexer.g:1:538: String_1
                {
                mString_1(); 

                }
                break;
            case 55 :
                // InternalRosLexer.g:1:547: Uint16
                {
                mUint16(); 

                }
                break;
            case 56 :
                // InternalRosLexer.g:1:554: Uint32
                {
                mUint32(); 

                }
                break;
            case 57 :
                // InternalRosLexer.g:1:561: Uint64
                {
                mUint64(); 

                }
                break;
            case 58 :
                // InternalRosLexer.g:1:568: Value_1
                {
                mValue_1(); 

                }
                break;
            case 59 :
                // InternalRosLexer.g:1:576: Goal_1
                {
                mGoal_1(); 

                }
                break;
            case 60 :
                // InternalRosLexer.g:1:583: Int16
                {
                mInt16(); 

                }
                break;
            case 61 :
                // InternalRosLexer.g:1:589: Int32
                {
                mInt32(); 

                }
                break;
            case 62 :
                // InternalRosLexer.g:1:595: Int64
                {
                mInt64(); 

                }
                break;
            case 63 :
                // InternalRosLexer.g:1:601: Node_1
                {
                mNode_1(); 

                }
                break;
            case 64 :
                // InternalRosLexer.g:1:608: Type_1
                {
                mType_1(); 

                }
                break;
            case 65 :
                // InternalRosLexer.g:1:615: Uint8
                {
                mUint8(); 

                }
                break;
            case 66 :
                // InternalRosLexer.g:1:621: Value
                {
                mValue(); 

                }
                break;
            case 67 :
                // InternalRosLexer.g:1:627: Date
                {
                mDate(); 

                }
                break;
            case 68 :
                // InternalRosLexer.g:1:632: List
                {
                mList(); 

                }
                break;
            case 69 :
                // InternalRosLexer.g:1:637: Bool
                {
                mBool(); 

                }
                break;
            case 70 :
                // InternalRosLexer.g:1:642: Byte
                {
                mByte(); 

                }
                break;
            case 71 :
                // InternalRosLexer.g:1:647: Goal
                {
                mGoal(); 

                }
                break;
            case 72 :
                // InternalRosLexer.g:1:652: Int8
                {
                mInt8(); 

                }
                break;
            case 73 :
                // InternalRosLexer.g:1:657: Msg
                {
                mMsg(); 

                }
                break;
            case 74 :
                // InternalRosLexer.g:1:661: Name
                {
                mName(); 

                }
                break;
            case 75 :
                // InternalRosLexer.g:1:666: Node
                {
                mNode(); 

                }
                break;
            case 76 :
                // InternalRosLexer.g:1:671: Srv
                {
                mSrv(); 

                }
                break;
            case 77 :
                // InternalRosLexer.g:1:675: Time
                {
                mTime(); 

                }
                break;
            case 78 :
                // InternalRosLexer.g:1:680: Type
                {
                mType(); 

                }
                break;
            case 79 :
                // InternalRosLexer.g:1:685: Any
                {
                mAny(); 

                }
                break;
            case 80 :
                // InternalRosLexer.g:1:689: Ns
                {
                mNs(); 

                }
                break;
            case 81 :
                // InternalRosLexer.g:1:692: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 82 :
                // InternalRosLexer.g:1:728: Comma
                {
                mComma(); 

                }
                break;
            case 83 :
                // InternalRosLexer.g:1:734: Colon
                {
                mColon(); 

                }
                break;
            case 84 :
                // InternalRosLexer.g:1:740: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 85 :
                // InternalRosLexer.g:1:758: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 86 :
                // InternalRosLexer.g:1:777: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 87 :
                // InternalRosLexer.g:1:789: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 88 :
                // InternalRosLexer.g:1:802: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 89 :
                // InternalRosLexer.g:1:814: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 90 :
                // InternalRosLexer.g:1:826: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 91 :
                // InternalRosLexer.g:1:841: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 92 :
                // InternalRosLexer.g:1:863: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 93 :
                // InternalRosLexer.g:1:879: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 94 :
                // InternalRosLexer.g:1:901: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 95 :
                // InternalRosLexer.g:1:927: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 96 :
                // InternalRosLexer.g:1:935: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 97 :
                // InternalRosLexer.g:1:947: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 98 :
                // InternalRosLexer.g:1:963: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 99 :
                // InternalRosLexer.g:1:971: RULE_ANY_OTHER
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
            return "190:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA28_eotS =
        "\1\50\31\57\1\135\3\uffff\2\143\1\53\1\143\1\53\1\57\2\53\1\uffff\1\53\1\uffff\1\53\2\uffff\3\57\2\uffff\53\57\11\uffff\1\143\1\57\2\uffff\1\u00a2\2\uffff\1\u00a2\4\uffff\37\57\1\u00c7\12\57\1\uffff\4\57\1\143\3\uffff\12\57\1\uffff\16\57\1\uffff\7\57\1\u00fb\1\57\1\uffff\1\57\1\u00fe\3\57\1\u0103\1\u0105\1\57\1\u0108\1\u010a\1\u010b\1\u010d\1\u010e\1\u010f\1\u0110\1\143\21\57\1\u010f\11\57\1\u012d\3\57\1\u0132\1\u0134\1\u0136\2\uffff\2\57\1\uffff\3\57\4\uffff\1\u013d\12\uffff\10\57\1\u0147\1\uffff\1\u014b\12\57\1\u0157\2\57\1\u015b\1\u015d\1\u015f\2\uffff\1\57\1\u0161\1\57\7\uffff\1\u0163\1\u0164\1\u0165\1\u0166\2\uffff\6\57\1\u016f\1\57\2\uffff\2\57\2\uffff\1\57\1\u0174\3\57\1\u0179\1\u017b\3\57\2\uffff\1\57\1\u0181\6\uffff\1\u0182\1\uffff\1\u0183\4\uffff\10\57\1\uffff\4\57\1\uffff\1\u0190\1\57\1\u0193\4\uffff\3\57\5\uffff\5\57\1\u019d\6\57\1\uffff\1\57\2\uffff\2\57\1\uffff\6\57\1\uffff\26\57\2\uffff\1\57\1\u01c4\6\57\1\uffff\3\57\1\uffff\1\57\1\uffff\6\57\3\uffff\5\57\2\uffff\4\57\1\u01de\1\57\1\u01e0\2\57\1\uffff\1\57\1\uffff\1\57\1\u01e5\1\57\1\u01e7\1\uffff\1\57\1\uffff\1\57\1\u01ea\1\uffff";
    static final String DFA28_eofS =
        "\u01eb\uffff";
    static final String DFA28_minS =
        "\1\0\31\57\1\135\3\uffff\2\56\1\60\1\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\3\57\2\uffff\53\57\11\uffff\1\60\1\57\2\0\1\57\2\0\1\57\4\uffff\52\57\1\uffff\4\57\1\60\1\0\1\uffff\1\0\12\57\1\uffff\16\57\1\uffff\11\57\1\uffff\17\57\1\55\42\57\2\uffff\2\57\1\uffff\3\57\4\uffff\1\57\12\uffff\11\57\1\uffff\21\57\2\uffff\3\57\7\uffff\4\57\2\uffff\10\57\2\uffff\2\57\2\uffff\12\57\2\uffff\2\57\6\uffff\1\57\1\uffff\1\57\4\uffff\10\57\1\uffff\4\57\1\uffff\3\57\4\uffff\3\57\5\uffff\14\57\1\uffff\1\57\2\uffff\2\57\1\uffff\6\57\1\uffff\26\57\2\uffff\10\57\1\uffff\3\57\1\uffff\1\57\1\uffff\6\57\3\uffff\5\57\2\uffff\11\57\1\uffff\1\57\1\uffff\4\57\1\uffff\1\57\1\uffff\2\57\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\31\172\1\135\3\uffff\2\145\1\71\1\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\3\172\2\uffff\53\172\11\uffff\1\71\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\52\172\1\uffff\4\172\1\71\1\uffff\1\uffff\1\uffff\12\172\1\uffff\16\172\1\uffff\11\172\1\uffff\17\172\1\55\42\172\2\uffff\2\172\1\uffff\3\172\4\uffff\1\172\12\uffff\11\172\1\uffff\21\172\2\uffff\3\172\7\uffff\4\172\2\uffff\10\172\2\uffff\2\172\2\uffff\12\172\2\uffff\2\172\6\uffff\1\172\1\uffff\1\172\4\uffff\10\172\1\uffff\4\172\1\uffff\3\172\4\uffff\3\172\5\uffff\14\172\1\uffff\1\172\2\uffff\2\172\1\uffff\6\172\1\uffff\26\172\2\uffff\10\172\1\uffff\3\172\1\uffff\1\172\1\uffff\6\172\3\uffff\5\172\2\uffff\11\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA28_acceptS =
        "\33\uffff\1\122\1\123\1\125\10\uffff\1\134\1\uffff\1\135\1\uffff\1\142\1\143\3\uffff\1\137\1\133\53\uffff\1\121\1\124\1\122\1\123\1\125\1\126\1\132\1\131\1\130\10\uffff\1\134\1\141\1\136\1\142\52\uffff\1\120\6\uffff\1\140\13\uffff\1\114\16\uffff\1\111\11\uffff\1\117\62\uffff\1\63\1\110\2\uffff\1\103\3\uffff\1\61\1\105\1\62\1\106\1\uffff\1\73\1\107\1\77\1\113\1\112\1\100\1\116\1\115\1\127\1\104\11\uffff\1\65\21\uffff\1\51\1\101\3\uffff\1\43\1\74\1\44\1\75\1\45\1\76\1\52\4\uffff\1\72\1\102\10\uffff\1\31\1\66\2\uffff\1\37\1\60\12\uffff\1\47\1\64\2\uffff\1\32\1\67\1\33\1\70\1\34\1\71\1\uffff\1\53\1\uffff\1\54\1\55\1\56\1\57\10\uffff\1\50\4\uffff\1\40\3\uffff\1\22\1\41\1\23\1\42\3\uffff\1\30\1\27\1\46\1\35\1\36\14\uffff\1\25\1\uffff\1\21\1\26\2\uffff\1\24\6\uffff\1\20\26\uffff\1\16\1\17\10\uffff\1\15\3\uffff\1\14\1\uffff\1\13\6\uffff\1\10\1\11\1\12\5\uffff\1\6\1\7\11\uffff\1\5\1\uffff\1\4\4\uffff\1\3\1\uffff\1\2\2\uffff\1\1";
    static final String DFA28_specialS =
        "\1\6\43\uffff\1\3\1\7\101\uffff\1\10\1\1\1\uffff\1\2\1\5\65\uffff\1\0\1\uffff\1\4\u0147\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\44\1\46\3\53\1\45\4\53\1\33\1\40\1\53\1\47\1\36\2\37\7\41\1\34\6\53\1\20\1\15\1\43\1\21\1\2\1\43\1\4\1\22\1\16\2\43\1\31\3\43\1\1\1\43\1\3\1\23\7\43\1\32\1\53\1\35\1\42\1\43\1\53\1\6\1\24\1\43\1\7\1\43\1\10\1\26\1\43\1\17\3\43\1\13\1\27\1\43\1\11\1\43\1\12\1\5\1\30\1\14\1\25\4\43\3\53\1\51\uff81\53",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\54\20\56\1\55\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\27\56\1\61\2\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\62\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\63\5\56\1\64\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\65\12\56\1\70\1\56\1\71\1\56\1\67\1\66\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\72\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\73\17\56\1\74\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\100\3\56\1\76\6\56\1\77\5\56\1\75\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\101\23\56\1\102\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\103\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\104\15\56\1\105\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\106\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\110\15\56\1\107\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\111\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\112\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\114\3\56\1\113\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\116\15\56\1\115\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\117\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\120\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\121\11\56\1\122\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\123\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\124\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\126\15\56\1\125\3\56\1\127\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\131\10\56\1\132\6\56\1\130\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\133\21\56",
            "\1\134",
            "",
            "",
            "",
            "\1\144\1\uffff\12\142\10\uffff\1\141\2\uffff\1\144\34\uffff\1\141\2\uffff\1\144",
            "\1\144\1\uffff\12\145\13\uffff\1\144\37\uffff\1\144",
            "\12\143",
            "\1\144\26\uffff\1\144\37\uffff\1\144",
            "\32\146\4\uffff\1\146\1\uffff\32\146",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\42\150\1\151\71\150\1\147\uffa3\150",
            "\47\153\1\154\64\153\1\152\uffa3\153",
            "",
            "\1\157\4\uffff\1\157\2\uffff\1\156\26\uffff\32\50\3\uffff\2\50\1\uffff\32\50",
            "",
            "\1\157\4\uffff\1\157",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\161\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\162\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\163\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\164\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\165\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\166\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\167\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\170\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\171\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\172\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\173\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\174\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\176\11\56\1\175\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\177\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0080\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0081\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0082\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0083\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0084\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u0085\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\20\56\1\u0087\1\56\1\u0086\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0088\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0089\23\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u008a\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u008b\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u008c\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u008d\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u008e\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u008f\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u0090\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0091\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0092\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0093\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0094\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0095\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0096\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0097\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0098\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u0099\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u009a\15\56",
            "\1\50\12\56\1\u009b\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u009c\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u009d\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u009e\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u009f\7\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a0",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\0\u00a1",
            "\42\150\1\151\71\150\1\147\uffa3\150",
            "\1\157\15\uffff\1\60",
            "\0\u00a3",
            "\47\153\1\154\64\153\1\152\uffa3\153",
            "\1\157\15\uffff\1\60",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a4\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00a5\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a6\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a7\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00a8\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00a9\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00aa\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00ab\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00ac\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00ad\27\56",
            "\1\50\12\56\1\u00ae\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00af\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b0\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b1\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b2\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00b3\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00b4\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b5\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00b6\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b7\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00b8\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00b9\4\56\1\u00ba\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00bb\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00bc\7\56",
            "\1\50\12\56\1\u00bd\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00be\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00bf\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c0\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c1\25\56",
            "\1\50\1\56\1\u00c2\1\56\1\u00c3\2\56\1\u00c4\1\56\1\u00c5\1\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00c6\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00c8\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c9\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00ca\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00cb\13\56\1\u00cc\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00cd\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00ce\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00cf\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00d0\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d1\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d2\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d3\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d4\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d5\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00d6\6\56",
            "\12\u00d7",
            "\42\150\1\151\71\150\1\147\uffa3\150",
            "",
            "\47\153\1\154\64\153\1\152\uffa3\153",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00d8\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00d9\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00da\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00db\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00dc\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00dd\22\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00de\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00df\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00e0\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00e1\7\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00e2\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00e3\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00e4\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00e5\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\6\56\1\u00e6\23\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00e7\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00e8\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00e9\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00ea\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00eb\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00ec\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00ed\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00ee\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00ef\31\56",
            "",
            "\1\50\1\56\1\u00f0\1\56\1\u00f1\2\56\1\u00f2\1\56\1\u00f3\1\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f4\25\56",
            "\1\50\6\56\1\u00f5\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00f6\23\56",
            "\1\50\6\56\1\u00f7\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u00f8\7\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u00f9\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u00fa\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u00fc\1\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00fd\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00ff\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0100\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0101\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0102\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0104\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0106\25\56",
            "\1\50\12\56\1\u0107\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0109\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u010c\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\142",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0111\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0112\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0113\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0114\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0115\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u0116\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0117\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0118\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0119\23\56",
            "\1\50\12\56\1\u011a\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u011b\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u011c\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u011d\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u011e\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u011f\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0120\31\56",
            "\1\50\3\56\1\u0121\2\56\1\u0122\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0123\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0124\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0125\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0126\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0127\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0128\23\56",
            "\1\50\6\56\1\u0129\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u012a\7\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u012b\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u012c\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u012e\31\56",
            "\1\50\4\56\1\u012f\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0130\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0131\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0133\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0135\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\1\u0137\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0138\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0139\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u013a\23\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u013b\6\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\1\u013c\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u013e\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u013f\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0140\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u0141\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u0142\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0143\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0144\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0145\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0146\3\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\1\u014a\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0148\17\56\1\u0149\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u014c\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u014d\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u014e\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u014f\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0150\27\56",
            "\1\50\2\56\1\u0151\7\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u0152\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0153\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u0154\22\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0155\7\56",
            "\1\50\12\56\1\u0156\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0158\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0159\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u015a\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u015c\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u015e\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0160\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0162\10\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0167\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u0168\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0169\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u016a\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u016b\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u016c\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u016d\17\56\1\u016e\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u0170\30\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0171\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0172\25\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0173\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0175\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\21\56\1\u0176\10\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u0177\17\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0178\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u017a\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u017c\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u017d\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u017e\25\56",
            "",
            "",
            "\1\50\12\56\1\u017f\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0180\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0184\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0185\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\3\56\1\u0186\26\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u0187\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0188\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0189\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u018a\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018b\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018c\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u018d\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u018e\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u018f\27\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0191\25\56",
            "\1\50\12\56\1\u0192\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0194\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0195\10\56",
            "\1\50\12\56\1\u0196\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\1\u0198\21\56\1\u0197\7\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0199\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u019a\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u019b\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u019c\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u019e\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u019f\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01a0\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01a1\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u01a2\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01a3\21\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01a4\12\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01a5\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01a6\7\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01a7\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01a8\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01a9\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01aa\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01ab\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01ac\7\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01ad\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u01ae\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01af\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01b0\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b1\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b2\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u01b3\13\56",
            "\1\50\12\56\1\u01b4\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u01b5\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01b6\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u01b7\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01b8\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b9\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01ba\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01bb\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01bc\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01bd\25\56",
            "\1\50\12\56\1\u01be\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01bf\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01c0\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01c1\7\56",
            "\1\50\12\56\1\u01c2\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u01c3\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01c5\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01c6\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01c7\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01c8\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01c9\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01ca\10\56",
            "",
            "\1\50\12\56\1\u01cb\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u01cc\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u01cd\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01ce\27\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01cf\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u01d0\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01d1\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01d2\27\56",
            "\1\50\12\56\1\u01d3\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u01d4\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01d5\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01d6\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01d7\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01d8\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01d9\25\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\14\56\1\u01da\15\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01db\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01dc\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01dd\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01df\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01e1\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01e2\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01e3\15\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u01e4\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u01e6\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01e8\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01e9\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( ParameterStructMember | ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclient | Serviceserver | Actionclient | Actionserver | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Default | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_161 = input.LA(1);

                        s = -1;
                        if ( (LA28_161=='\"') ) {s = 105;}

                        else if ( (LA28_161=='\\') ) {s = 103;}

                        else if ( ((LA28_161>='\u0000' && LA28_161<='!')||(LA28_161>='#' && LA28_161<='[')||(LA28_161>=']' && LA28_161<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_104 = input.LA(1);

                        s = -1;
                        if ( (LA28_104=='\"') ) {s = 105;}

                        else if ( (LA28_104=='\\') ) {s = 103;}

                        else if ( ((LA28_104>='\u0000' && LA28_104<='!')||(LA28_104>='#' && LA28_104<='[')||(LA28_104>=']' && LA28_104<='\uFFFF')) ) {s = 104;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_106 = input.LA(1);

                        s = -1;
                        if ( ((LA28_106>='\u0000' && LA28_106<='\uFFFF')) ) {s = 163;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( (LA28_36=='\\') ) {s = 103;}

                        else if ( ((LA28_36>='\u0000' && LA28_36<='!')||(LA28_36>='#' && LA28_36<='[')||(LA28_36>=']' && LA28_36<='\uFFFF')) ) {s = 104;}

                        else if ( (LA28_36=='\"') ) {s = 105;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_163 = input.LA(1);

                        s = -1;
                        if ( (LA28_163=='\'') ) {s = 108;}

                        else if ( (LA28_163=='\\') ) {s = 106;}

                        else if ( ((LA28_163>='\u0000' && LA28_163<='&')||(LA28_163>='(' && LA28_163<='[')||(LA28_163>=']' && LA28_163<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_107 = input.LA(1);

                        s = -1;
                        if ( (LA28_107=='\'') ) {s = 108;}

                        else if ( (LA28_107=='\\') ) {s = 106;}

                        else if ( ((LA28_107>='\u0000' && LA28_107<='&')||(LA28_107>='(' && LA28_107<='[')||(LA28_107>=']' && LA28_107<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
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
                    case 7 : 
                        int LA28_37 = input.LA(1);

                        s = -1;
                        if ( (LA28_37=='\\') ) {s = 106;}

                        else if ( ((LA28_37>='\u0000' && LA28_37<='&')||(LA28_37>='(' && LA28_37<='[')||(LA28_37>=']' && LA28_37<='\uFFFF')) ) {s = 107;}

                        else if ( (LA28_37=='\'') ) {s = 108;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_103 = input.LA(1);

                        s = -1;
                        if ( ((LA28_103>='\u0000' && LA28_103<='\uFFFF')) ) {s = 161;}

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