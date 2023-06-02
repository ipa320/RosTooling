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
    public static final int Float32_1=21;
    public static final int Node=78;
    public static final int RULE_DATE_TIME=99;
    public static final int Uint64_1=32;
    public static final int Serviceclients=8;
    public static final int String=49;
    public static final int Int16=63;
    public static final int Float32=36;
    public static final int Goal=74;
    public static final int Actionservers=11;
    public static final int Bool=72;
    public static final int Uint16=58;
    public static final int Boolean=33;
    public static final int ExternalDependency=4;
    public static final int Uint8=68;
    public static final int Parameters=16;
    public static final int RULE_ID=100;
    public static final int RULE_DIGIT=89;
    public static final int GlobalNamespace=7;
    public static final int Artifacts=18;
    public static final int Node_1=66;
    public static final int Int16_1=38;
    public static final int Header=48;
    public static final int RULE_INT=102;
    public static final int Byte=73;
    public static final int RULE_ML_COMMENT=109;
    public static final int LeftSquareBracket=87;
    public static final int Specs=56;
    public static final int Base64=46;
    public static final int Message_1=27;
    public static final int Comma=85;
    public static final int RULE_MESSAGE_ASIGMENT=103;
    public static final int Goal_1=62;
    public static final int LeftSquareBracketRightSquareBracket=84;
    public static final int Int32=64;
    public static final int Publishers=17;
    public static final int RULE_DECINT=92;
    public static final int Uint32=59;
    public static final int FromGitRepo=14;
    public static final int Msg=76;
    public static final int RULE_HOUR=97;
    public static final int Int8=75;
    public static final int Default=24;
    public static final int Int8_1=54;
    public static final int Uint16_1=30;
    public static final int Type=81;
    public static final int Float64=37;
    public static final int Int32_1=39;
    public static final int Result_1=42;
    public static final int RULE_BINARY=90;
    public static final int String_1=57;
    public static final int Subscribers=15;
    public static final int String_2=29;
    public static final int Actionclients=10;
    public static final int RULE_DAY=94;
    public static final int RULE_BEGIN=104;
    public static final int RULE_BOOLEAN=91;
    public static final int RelativeNamespace=5;
    public static final int Serviceservers=9;
    public static final int RULE_YEAR=96;
    public static final int Feedback_1=20;
    public static final int Result=55;
    public static final int Name=77;
    public static final int RULE_MIN_SEC=98;
    public static final int ParameterAny=13;
    public static final int List=71;
    public static final int Dependencies=12;
    public static final int RightSquareBracket=88;
    public static final int PrivateNamespace=6;
    public static final int GraphName=19;
    public static final int Byte_1=53;
    public static final int Float64_1=22;
    public static final int Duration=25;
    public static final int Uint32_1=31;
    public static final int Action_1=35;
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
    public static final int Feedback=26;
    public static final int Srv=79;
    public static final int RULE_ROS_CONVENTION_A=107;
    public static final int RULE_ROS_CONVENTION_PARAM=108;
    public static final int Colon=86;
    public static final int EOF=-1;
    public static final int Ns=83;
    public static final int RULE_WS=110;
    public static final int Request=28;
    public static final int Int64_1=40;
    public static final int Service=43;
    public static final int RULE_ANY_OTHER=111;
    public static final int Date=70;
    public static final int Response=23;
    public static final int Integer=34;
    public static final int Array=45;
    public static final int Int64=65;
    public static final int RULE_MONTH=95;

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

    // $ANTLR start "ExternalDependency"
    public final void mExternalDependency() throws RecognitionException {
        try {
            int _type = ExternalDependency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:14:20: ( 'ExternalDependency' )
            // InternalRos1Lexer.g:14:22: 'ExternalDependency'
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
            // InternalRos1Lexer.g:16:19: ( 'RelativeNamespace' )
            // InternalRos1Lexer.g:16:21: 'RelativeNamespace'
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
            // InternalRos1Lexer.g:18:18: ( 'PrivateNamespace' )
            // InternalRos1Lexer.g:18:20: 'PrivateNamespace'
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
            // InternalRos1Lexer.g:20:17: ( 'GlobalNamespace' )
            // InternalRos1Lexer.g:20:19: 'GlobalNamespace'
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

    // $ANTLR start "Serviceclients"
    public final void mServiceclients() throws RecognitionException {
        try {
            int _type = Serviceclients;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:22:16: ( 'serviceclients:' )
            // InternalRos1Lexer.g:22:18: 'serviceclients:'
            {
            match("serviceclients:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Serviceclients"

    // $ANTLR start "Serviceservers"
    public final void mServiceservers() throws RecognitionException {
        try {
            int _type = Serviceservers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:24:16: ( 'serviceservers:' )
            // InternalRos1Lexer.g:24:18: 'serviceservers:'
            {
            match("serviceservers:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Serviceservers"

    // $ANTLR start "Actionclients"
    public final void mActionclients() throws RecognitionException {
        try {
            int _type = Actionclients;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:26:15: ( 'actionclients:' )
            // InternalRos1Lexer.g:26:17: 'actionclients:'
            {
            match("actionclients:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actionclients"

    // $ANTLR start "Actionservers"
    public final void mActionservers() throws RecognitionException {
        try {
            int _type = Actionservers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:28:15: ( 'actionservers:' )
            // InternalRos1Lexer.g:28:17: 'actionservers:'
            {
            match("actionservers:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actionservers"

    // $ANTLR start "Dependencies"
    public final void mDependencies() throws RecognitionException {
        try {
            int _type = Dependencies;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:30:14: ( 'dependencies:' )
            // InternalRos1Lexer.g:30:16: 'dependencies:'
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
            // InternalRos1Lexer.g:32:14: ( 'ParameterAny' )
            // InternalRos1Lexer.g:32:16: 'ParameterAny'
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
            // InternalRos1Lexer.g:34:13: ( 'fromGitRepo:' )
            // InternalRos1Lexer.g:34:15: 'fromGitRepo:'
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
            // InternalRos1Lexer.g:36:13: ( 'subscribers:' )
            // InternalRos1Lexer.g:36:15: 'subscribers:'
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
            // InternalRos1Lexer.g:38:12: ( 'parameters:' )
            // InternalRos1Lexer.g:38:14: 'parameters:'
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
            // InternalRos1Lexer.g:40:12: ( 'publishers:' )
            // InternalRos1Lexer.g:40:14: 'publishers:'
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
            // InternalRos1Lexer.g:42:11: ( 'artifacts:' )
            // InternalRos1Lexer.g:42:13: 'artifacts:'
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
            // InternalRos1Lexer.g:44:11: ( 'GraphName' )
            // InternalRos1Lexer.g:44:13: 'GraphName'
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
            // InternalRos1Lexer.g:46:12: ( 'feedback:' )
            // InternalRos1Lexer.g:46:14: 'feedback:'
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
            // InternalRos1Lexer.g:48:11: ( 'float32[]' )
            // InternalRos1Lexer.g:48:13: 'float32[]'
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
            // InternalRos1Lexer.g:50:11: ( 'float64[]' )
            // InternalRos1Lexer.g:50:13: 'float64[]'
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
            // InternalRos1Lexer.g:52:10: ( 'response:' )
            // InternalRos1Lexer.g:52:12: 'response:'
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

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:54:9: ( 'default:' )
            // InternalRos1Lexer.g:54:11: 'default:'
            {
            match("default:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

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

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:78:9: ( 'float32' )
            // InternalRos1Lexer.g:78:11: 'float32'
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
            // InternalRos1Lexer.g:80:9: ( 'float64' )
            // InternalRos1Lexer.g:80:11: 'float64'
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
            // InternalRos1Lexer.g:82:9: ( 'int16[]' )
            // InternalRos1Lexer.g:82:11: 'int16[]'
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
            // InternalRos1Lexer.g:84:9: ( 'int32[]' )
            // InternalRos1Lexer.g:84:11: 'int32[]'
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
            // InternalRos1Lexer.g:86:9: ( 'int64[]' )
            // InternalRos1Lexer.g:86:11: 'int64[]'
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
            // InternalRos1Lexer.g:88:9: ( 'message' )
            // InternalRos1Lexer.g:88:11: 'message'
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
            // InternalRos1Lexer.g:90:10: ( 'result:' )
            // InternalRos1Lexer.g:90:12: 'result:'
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
            // InternalRos1Lexer.g:92:9: ( 'service' )
            // InternalRos1Lexer.g:92:11: 'service'
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
            // InternalRos1Lexer.g:94:9: ( 'uint8[]' )
            // InternalRos1Lexer.g:94:11: 'uint8[]'
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
            // InternalRos1Lexer.g:96:7: ( 'Array:' )
            // InternalRos1Lexer.g:96:9: 'Array:'
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
            // InternalRos1Lexer.g:98:8: ( 'Base64' )
            // InternalRos1Lexer.g:98:10: 'Base64'
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
            // InternalRos1Lexer.g:100:8: ( 'Double' )
            // InternalRos1Lexer.g:100:10: 'Double'
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
            // InternalRos1Lexer.g:102:8: ( 'Header' )
            // InternalRos1Lexer.g:102:10: 'Header'
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
            // InternalRos1Lexer.g:104:8: ( 'String' )
            // InternalRos1Lexer.g:104:10: 'String'
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
            // InternalRos1Lexer.g:106:8: ( 'Struct' )
            // InternalRos1Lexer.g:106:10: 'Struct'
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
            // InternalRos1Lexer.g:108:8: ( 'action' )
            // InternalRos1Lexer.g:108:10: 'action'
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
            // InternalRos1Lexer.g:110:8: ( 'bool[]' )
            // InternalRos1Lexer.g:110:10: 'bool[]'
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
            // InternalRos1Lexer.g:112:8: ( 'byte[]' )
            // InternalRos1Lexer.g:112:10: 'byte[]'
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
            // InternalRos1Lexer.g:114:8: ( 'int8[]' )
            // InternalRos1Lexer.g:114:10: 'int8[]'
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
            // InternalRos1Lexer.g:116:8: ( 'result' )
            // InternalRos1Lexer.g:116:10: 'result'
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
            // InternalRos1Lexer.g:118:7: ( 'specs:' )
            // InternalRos1Lexer.g:118:9: 'specs:'
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
            // InternalRos1Lexer.g:120:10: ( 'string' )
            // InternalRos1Lexer.g:120:12: 'string'
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
            // InternalRos1Lexer.g:122:8: ( 'uint16' )
            // InternalRos1Lexer.g:122:10: 'uint16'
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
            // InternalRos1Lexer.g:124:8: ( 'uint32' )
            // InternalRos1Lexer.g:124:10: 'uint32'
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
            // InternalRos1Lexer.g:126:8: ( 'uint64' )
            // InternalRos1Lexer.g:126:10: 'uint64'
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
            // InternalRos1Lexer.g:128:9: ( 'value:' )
            // InternalRos1Lexer.g:128:11: 'value:'
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
            // InternalRos1Lexer.g:130:8: ( 'goal:' )
            // InternalRos1Lexer.g:130:10: 'goal:'
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
            // InternalRos1Lexer.g:132:7: ( 'int16' )
            // InternalRos1Lexer.g:132:9: 'int16'
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
            // InternalRos1Lexer.g:134:7: ( 'int32' )
            // InternalRos1Lexer.g:134:9: 'int32'
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
            // InternalRos1Lexer.g:136:7: ( 'int64' )
            // InternalRos1Lexer.g:136:9: 'int64'
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
            // InternalRos1Lexer.g:138:8: ( 'node:' )
            // InternalRos1Lexer.g:138:10: 'node:'
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
            // InternalRos1Lexer.g:140:8: ( 'type:' )
            // InternalRos1Lexer.g:140:10: 'type:'
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
            // InternalRos1Lexer.g:142:7: ( 'uint8' )
            // InternalRos1Lexer.g:142:9: 'uint8'
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
            // InternalRos1Lexer.g:144:7: ( 'value' )
            // InternalRos1Lexer.g:144:9: 'value'
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
            // InternalRos1Lexer.g:146:6: ( 'Date' )
            // InternalRos1Lexer.g:146:8: 'Date'
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
            // InternalRos1Lexer.g:148:6: ( 'List' )
            // InternalRos1Lexer.g:148:8: 'List'
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
            // InternalRos1Lexer.g:150:6: ( 'bool' )
            // InternalRos1Lexer.g:150:8: 'bool'
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
            // InternalRos1Lexer.g:152:6: ( 'byte' )
            // InternalRos1Lexer.g:152:8: 'byte'
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
            // InternalRos1Lexer.g:154:6: ( 'goal' )
            // InternalRos1Lexer.g:154:8: 'goal'
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
            // InternalRos1Lexer.g:156:6: ( 'int8' )
            // InternalRos1Lexer.g:156:8: 'int8'
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
            // InternalRos1Lexer.g:158:5: ( 'msg:' )
            // InternalRos1Lexer.g:158:7: 'msg:'
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
            // InternalRos1Lexer.g:160:6: ( 'name' )
            // InternalRos1Lexer.g:160:8: 'name'
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
            // InternalRos1Lexer.g:162:6: ( 'node' )
            // InternalRos1Lexer.g:162:8: 'node'
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
            // InternalRos1Lexer.g:164:5: ( 'srv:' )
            // InternalRos1Lexer.g:164:7: 'srv:'
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
            // InternalRos1Lexer.g:166:6: ( 'time' )
            // InternalRos1Lexer.g:166:8: 'time'
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
            // InternalRos1Lexer.g:168:6: ( 'type' )
            // InternalRos1Lexer.g:168:8: 'type'
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
            // InternalRos1Lexer.g:170:5: ( 'Any' )
            // InternalRos1Lexer.g:170:7: 'Any'
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
            // InternalRos1Lexer.g:172:4: ( 'ns:' )
            // InternalRos1Lexer.g:172:6: 'ns:'
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
            // InternalRos1Lexer.g:174:37: ( '[]' )
            // InternalRos1Lexer.g:174:39: '[]'
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
            // InternalRos1Lexer.g:176:7: ( ',' )
            // InternalRos1Lexer.g:176:9: ','
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
            // InternalRos1Lexer.g:178:7: ( ':' )
            // InternalRos1Lexer.g:178:9: ':'
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
            // InternalRos1Lexer.g:180:19: ( '[' )
            // InternalRos1Lexer.g:180:21: '['
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
            // InternalRos1Lexer.g:182:20: ( ']' )
            // InternalRos1Lexer.g:182:22: ']'
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
            // InternalRos1Lexer.g:184:21: ( '0' .. '9' )
            // InternalRos1Lexer.g:184:23: '0' .. '9'
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
            // InternalRos1Lexer.g:186:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRos1Lexer.g:186:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRos1Lexer.g:186:15: ( '0b' | '0B' )
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
                    // InternalRos1Lexer.g:186:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:186:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRos1Lexer.g:186:27: ( '0' | '1' )+
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
            // InternalRos1Lexer.g:188:14: ( ( 'true' | 'false' ) )
            // InternalRos1Lexer.g:188:16: ( 'true' | 'false' )
            {
            // InternalRos1Lexer.g:188:16: ( 'true' | 'false' )
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
                    // InternalRos1Lexer.g:188:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:188:24: 'false'
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
            // InternalRos1Lexer.g:190:13: ( ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRos1Lexer.g:190:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            // InternalRos1Lexer.g:190:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='-') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRos1Lexer.g:190:16: RULE_DIGIT
                    {
                    mRULE_DIGIT(); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:190:27: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalRos1Lexer.g:190:31: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:190:31: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRos1Lexer.g:190:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalRos1Lexer.g:190:45: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRos1Lexer.g:190:49: ( RULE_DECINT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:190:49: RULE_DECINT
                    	    {
                    	    mRULE_DECINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:190:62: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRos1Lexer.g:190:62: ( '.' ( RULE_DIGIT )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRos1Lexer.g:190:63: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRos1Lexer.g:190:67: ( RULE_DIGIT )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalRos1Lexer.g:190:67: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
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

                    // InternalRos1Lexer.g:190:91: ( '-' | '+' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
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
            // InternalRos1Lexer.g:192:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRos1Lexer.g:192:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRos1Lexer.g:192:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt13=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt13=1;
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
                alt13=2;
                }
                break;
            case '-':
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRos1Lexer.g:192:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:192:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRos1Lexer.g:192:29: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:192:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalRos1Lexer.g:192:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRos1Lexer.g:192:54: ( RULE_DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:192:54: RULE_DIGIT
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
            // InternalRos1Lexer.g:194:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRos1Lexer.g:194:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRos1Lexer.g:194:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='1' && LA14_0<='3')) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>='0' && LA14_1<='9')) ) {
                    alt14=2;
                }
                else {
                    alt14=1;}
            }
            else if ( ((LA14_0>='4' && LA14_0<='9')) ) {
                alt14=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRos1Lexer.g:194:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:194:31: '1' .. '3' '0' .. '9'
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
            // InternalRos1Lexer.g:196:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRos1Lexer.g:196:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRos1Lexer.g:196:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='1') ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>='0' && LA15_1<='2')) ) {
                    alt15=2;
                }
                else {
                    alt15=1;}
            }
            else if ( ((LA15_0>='2' && LA15_0<='9')) ) {
                alt15=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos1Lexer.g:196:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:196:33: '1' '0' .. '2'
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
            // InternalRos1Lexer.g:198:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRos1Lexer.g:198:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRos1Lexer.g:200:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRos1Lexer.g:200:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRos1Lexer.g:200:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='0' && LA16_0<='1')) ) {
                alt16=1;
            }
            else if ( (LA16_0=='2') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos1Lexer.g:200:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:200:41: '2' '0' .. '3'
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
            // InternalRos1Lexer.g:202:23: ( '0' .. '5' '0' .. '9' )
            // InternalRos1Lexer.g:202:25: '0' .. '5' '0' .. '9'
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
            // InternalRos1Lexer.g:204:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRos1Lexer.g:204:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRos1Lexer.g:206:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRos1Lexer.g:206:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRos1Lexer.g:206:25: ( RULE_ID | RULE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='A' && LA17_0<='Z')||(LA17_0>='^' && LA17_0<='_')||(LA17_0>='a' && LA17_0<='z')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='\"'||LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRos1Lexer.g:206:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:206:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRos1Lexer.g:206:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt18=4;
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
                alt18=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt18=2;
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
                alt18=3;
                }
                break;
            case '-':
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalRos1Lexer.g:206:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:206:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRos1Lexer.g:206:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRos1Lexer.g:206:81: '-' RULE_INT
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
            // InternalRos1Lexer.g:208:21: ()
            // InternalRos1Lexer.g:208:23: 
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
            // InternalRos1Lexer.g:210:19: ()
            // InternalRos1Lexer.g:210:21: 
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
            // InternalRos1Lexer.g:212:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRos1Lexer.g:212:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRos1Lexer.g:212:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRos1Lexer.g:212:23: ~ ( ( '\\n' | '\\r' ) )
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ROS_CONVENTION_A"
    public final void mRULE_ROS_CONVENTION_A() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:214:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRos1Lexer.g:214:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRos1Lexer.g:214:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='/') ) {
                    alt20=1;
                }
                else if ( ((LA20_0>='A' && LA20_0<='Z')||(LA20_0>='^' && LA20_0<='_')||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRos1Lexer.g:214:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos1Lexer.g:214:38: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // InternalRos1Lexer.g:216:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRos1Lexer.g:216:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRos1Lexer.g:216:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop21:
            do {
                int alt21=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt21=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt21=2;
                    }
                    break;
                case '~':
                    {
                    alt21=3;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalRos1Lexer.g:216:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos1Lexer.g:216:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRos1Lexer.g:216:62: '~' RULE_STRING
            	    {
            	    match('~'); 
            	    mRULE_STRING(); 

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
    // $ANTLR end "RULE_ROS_CONVENTION_PARAM"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:218:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRos1Lexer.g:218:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRos1Lexer.g:218:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRos1Lexer.g:218:11: '^'
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

            // InternalRos1Lexer.g:218:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
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
            	    break loop23;
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
            // InternalRos1Lexer.g:220:19: ( ( '0' .. '9' )+ )
            // InternalRos1Lexer.g:220:21: ( '0' .. '9' )+
            {
            // InternalRos1Lexer.g:220:21: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRos1Lexer.g:220:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // InternalRos1Lexer.g:222:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRos1Lexer.g:222:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRos1Lexer.g:222:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\"') ) {
                alt27=1;
            }
            else if ( (LA27_0=='\'') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalRos1Lexer.g:222:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRos1Lexer.g:222:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:222:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos1Lexer.g:222:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop25;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:222:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRos1Lexer.g:222:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:222:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos1Lexer.g:222:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop26;
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
            // InternalRos1Lexer.g:224:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRos1Lexer.g:224:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRos1Lexer.g:224:24: ( options {greedy=false; } : . )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='*') ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1=='/') ) {
                        alt28=2;
                    }
                    else if ( ((LA28_1>='\u0000' && LA28_1<='.')||(LA28_1>='0' && LA28_1<='\uFFFF')) ) {
                        alt28=1;
                    }


                }
                else if ( ((LA28_0>='\u0000' && LA28_0<=')')||(LA28_0>='+' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRos1Lexer.g:224:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
            // InternalRos1Lexer.g:226:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRos1Lexer.g:226:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRos1Lexer.g:226:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\t' && LA29_0<='\n')||LA29_0=='\r'||LA29_0==' ') ) {
                    alt29=1;
                }


                switch (alt29) {
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            // InternalRos1Lexer.g:228:16: ( . )
            // InternalRos1Lexer.g:228:18: .
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
        // InternalRos1Lexer.g:1:8: ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Default | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=99;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalRos1Lexer.g:1:10: ExternalDependency
                {
                mExternalDependency(); 

                }
                break;
            case 2 :
                // InternalRos1Lexer.g:1:29: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 3 :
                // InternalRos1Lexer.g:1:47: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 4 :
                // InternalRos1Lexer.g:1:64: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 5 :
                // InternalRos1Lexer.g:1:80: Serviceclients
                {
                mServiceclients(); 

                }
                break;
            case 6 :
                // InternalRos1Lexer.g:1:95: Serviceservers
                {
                mServiceservers(); 

                }
                break;
            case 7 :
                // InternalRos1Lexer.g:1:110: Actionclients
                {
                mActionclients(); 

                }
                break;
            case 8 :
                // InternalRos1Lexer.g:1:124: Actionservers
                {
                mActionservers(); 

                }
                break;
            case 9 :
                // InternalRos1Lexer.g:1:138: Dependencies
                {
                mDependencies(); 

                }
                break;
            case 10 :
                // InternalRos1Lexer.g:1:151: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 11 :
                // InternalRos1Lexer.g:1:164: FromGitRepo
                {
                mFromGitRepo(); 

                }
                break;
            case 12 :
                // InternalRos1Lexer.g:1:176: Subscribers
                {
                mSubscribers(); 

                }
                break;
            case 13 :
                // InternalRos1Lexer.g:1:188: Parameters
                {
                mParameters(); 

                }
                break;
            case 14 :
                // InternalRos1Lexer.g:1:199: Publishers
                {
                mPublishers(); 

                }
                break;
            case 15 :
                // InternalRos1Lexer.g:1:210: Artifacts
                {
                mArtifacts(); 

                }
                break;
            case 16 :
                // InternalRos1Lexer.g:1:220: GraphName
                {
                mGraphName(); 

                }
                break;
            case 17 :
                // InternalRos1Lexer.g:1:230: Feedback_1
                {
                mFeedback_1(); 

                }
                break;
            case 18 :
                // InternalRos1Lexer.g:1:241: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 19 :
                // InternalRos1Lexer.g:1:251: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 20 :
                // InternalRos1Lexer.g:1:261: Response
                {
                mResponse(); 

                }
                break;
            case 21 :
                // InternalRos1Lexer.g:1:270: Default
                {
                mDefault(); 

                }
                break;
            case 22 :
                // InternalRos1Lexer.g:1:278: Duration
                {
                mDuration(); 

                }
                break;
            case 23 :
                // InternalRos1Lexer.g:1:287: Feedback
                {
                mFeedback(); 

                }
                break;
            case 24 :
                // InternalRos1Lexer.g:1:296: Message_1
                {
                mMessage_1(); 

                }
                break;
            case 25 :
                // InternalRos1Lexer.g:1:306: Request
                {
                mRequest(); 

                }
                break;
            case 26 :
                // InternalRos1Lexer.g:1:314: String_2
                {
                mString_2(); 

                }
                break;
            case 27 :
                // InternalRos1Lexer.g:1:323: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 28 :
                // InternalRos1Lexer.g:1:332: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 29 :
                // InternalRos1Lexer.g:1:341: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 30 :
                // InternalRos1Lexer.g:1:350: Boolean
                {
                mBoolean(); 

                }
                break;
            case 31 :
                // InternalRos1Lexer.g:1:358: Integer
                {
                mInteger(); 

                }
                break;
            case 32 :
                // InternalRos1Lexer.g:1:366: Action_1
                {
                mAction_1(); 

                }
                break;
            case 33 :
                // InternalRos1Lexer.g:1:375: Float32
                {
                mFloat32(); 

                }
                break;
            case 34 :
                // InternalRos1Lexer.g:1:383: Float64
                {
                mFloat64(); 

                }
                break;
            case 35 :
                // InternalRos1Lexer.g:1:391: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 36 :
                // InternalRos1Lexer.g:1:399: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 37 :
                // InternalRos1Lexer.g:1:407: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 38 :
                // InternalRos1Lexer.g:1:415: Message
                {
                mMessage(); 

                }
                break;
            case 39 :
                // InternalRos1Lexer.g:1:423: Result_1
                {
                mResult_1(); 

                }
                break;
            case 40 :
                // InternalRos1Lexer.g:1:432: Service
                {
                mService(); 

                }
                break;
            case 41 :
                // InternalRos1Lexer.g:1:440: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 42 :
                // InternalRos1Lexer.g:1:448: Array
                {
                mArray(); 

                }
                break;
            case 43 :
                // InternalRos1Lexer.g:1:454: Base64
                {
                mBase64(); 

                }
                break;
            case 44 :
                // InternalRos1Lexer.g:1:461: Double
                {
                mDouble(); 

                }
                break;
            case 45 :
                // InternalRos1Lexer.g:1:468: Header
                {
                mHeader(); 

                }
                break;
            case 46 :
                // InternalRos1Lexer.g:1:475: String
                {
                mString(); 

                }
                break;
            case 47 :
                // InternalRos1Lexer.g:1:482: Struct
                {
                mStruct(); 

                }
                break;
            case 48 :
                // InternalRos1Lexer.g:1:489: Action
                {
                mAction(); 

                }
                break;
            case 49 :
                // InternalRos1Lexer.g:1:496: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 50 :
                // InternalRos1Lexer.g:1:503: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 51 :
                // InternalRos1Lexer.g:1:510: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 52 :
                // InternalRos1Lexer.g:1:517: Result
                {
                mResult(); 

                }
                break;
            case 53 :
                // InternalRos1Lexer.g:1:524: Specs
                {
                mSpecs(); 

                }
                break;
            case 54 :
                // InternalRos1Lexer.g:1:530: String_1
                {
                mString_1(); 

                }
                break;
            case 55 :
                // InternalRos1Lexer.g:1:539: Uint16
                {
                mUint16(); 

                }
                break;
            case 56 :
                // InternalRos1Lexer.g:1:546: Uint32
                {
                mUint32(); 

                }
                break;
            case 57 :
                // InternalRos1Lexer.g:1:553: Uint64
                {
                mUint64(); 

                }
                break;
            case 58 :
                // InternalRos1Lexer.g:1:560: Value_1
                {
                mValue_1(); 

                }
                break;
            case 59 :
                // InternalRos1Lexer.g:1:568: Goal_1
                {
                mGoal_1(); 

                }
                break;
            case 60 :
                // InternalRos1Lexer.g:1:575: Int16
                {
                mInt16(); 

                }
                break;
            case 61 :
                // InternalRos1Lexer.g:1:581: Int32
                {
                mInt32(); 

                }
                break;
            case 62 :
                // InternalRos1Lexer.g:1:587: Int64
                {
                mInt64(); 

                }
                break;
            case 63 :
                // InternalRos1Lexer.g:1:593: Node_1
                {
                mNode_1(); 

                }
                break;
            case 64 :
                // InternalRos1Lexer.g:1:600: Type_1
                {
                mType_1(); 

                }
                break;
            case 65 :
                // InternalRos1Lexer.g:1:607: Uint8
                {
                mUint8(); 

                }
                break;
            case 66 :
                // InternalRos1Lexer.g:1:613: Value
                {
                mValue(); 

                }
                break;
            case 67 :
                // InternalRos1Lexer.g:1:619: Date
                {
                mDate(); 

                }
                break;
            case 68 :
                // InternalRos1Lexer.g:1:624: List
                {
                mList(); 

                }
                break;
            case 69 :
                // InternalRos1Lexer.g:1:629: Bool
                {
                mBool(); 

                }
                break;
            case 70 :
                // InternalRos1Lexer.g:1:634: Byte
                {
                mByte(); 

                }
                break;
            case 71 :
                // InternalRos1Lexer.g:1:639: Goal
                {
                mGoal(); 

                }
                break;
            case 72 :
                // InternalRos1Lexer.g:1:644: Int8
                {
                mInt8(); 

                }
                break;
            case 73 :
                // InternalRos1Lexer.g:1:649: Msg
                {
                mMsg(); 

                }
                break;
            case 74 :
                // InternalRos1Lexer.g:1:653: Name
                {
                mName(); 

                }
                break;
            case 75 :
                // InternalRos1Lexer.g:1:658: Node
                {
                mNode(); 

                }
                break;
            case 76 :
                // InternalRos1Lexer.g:1:663: Srv
                {
                mSrv(); 

                }
                break;
            case 77 :
                // InternalRos1Lexer.g:1:667: Time
                {
                mTime(); 

                }
                break;
            case 78 :
                // InternalRos1Lexer.g:1:672: Type
                {
                mType(); 

                }
                break;
            case 79 :
                // InternalRos1Lexer.g:1:677: Any
                {
                mAny(); 

                }
                break;
            case 80 :
                // InternalRos1Lexer.g:1:681: Ns
                {
                mNs(); 

                }
                break;
            case 81 :
                // InternalRos1Lexer.g:1:684: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 82 :
                // InternalRos1Lexer.g:1:720: Comma
                {
                mComma(); 

                }
                break;
            case 83 :
                // InternalRos1Lexer.g:1:726: Colon
                {
                mColon(); 

                }
                break;
            case 84 :
                // InternalRos1Lexer.g:1:732: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 85 :
                // InternalRos1Lexer.g:1:750: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 86 :
                // InternalRos1Lexer.g:1:769: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 87 :
                // InternalRos1Lexer.g:1:781: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 88 :
                // InternalRos1Lexer.g:1:794: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 89 :
                // InternalRos1Lexer.g:1:806: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 90 :
                // InternalRos1Lexer.g:1:818: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 91 :
                // InternalRos1Lexer.g:1:833: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 92 :
                // InternalRos1Lexer.g:1:855: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 93 :
                // InternalRos1Lexer.g:1:871: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 94 :
                // InternalRos1Lexer.g:1:893: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 95 :
                // InternalRos1Lexer.g:1:919: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 96 :
                // InternalRos1Lexer.g:1:927: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 97 :
                // InternalRos1Lexer.g:1:939: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 98 :
                // InternalRos1Lexer.g:1:955: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 99 :
                // InternalRos1Lexer.g:1:963: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA10_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA10_eofS =
        "\10\uffff";
    static final String DFA10_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA10_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA10_specialS =
        "\10\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "190:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA30_eotS =
        "\1\50\31\56\1\136\3\uffff\2\144\1\53\1\144\1\53\1\56\2\53\1\uffff\1\53\1\uffff\1\53\2\uffff\2\56\2\uffff\55\56\11\uffff\2\144\1\56\2\uffff\1\u00a6\2\uffff\1\u00a6\4\uffff\40\56\1\u00cc\12\56\1\uffff\4\56\2\144\3\uffff\12\56\1\uffff\17\56\1\uffff\7\56\1\u0101\1\56\1\uffff\1\56\1\u0104\3\56\1\u0109\1\u010b\1\56\1\u010e\1\u0110\1\u0111\1\u0113\1\u0114\1\u0115\1\u0116\1\144\22\56\1\u0115\11\56\1\u0134\3\56\1\u0139\1\u013b\1\u013d\2\uffff\2\56\1\uffff\3\56\4\uffff\1\u0144\12\uffff\10\56\1\u014e\1\uffff\1\u0152\13\56\1\u015f\2\56\1\u0163\1\u0165\1\u0167\2\uffff\1\56\1\u0169\1\56\7\uffff\1\u016b\1\u016c\1\u016d\1\u016e\2\uffff\6\56\1\u0177\1\56\2\uffff\2\56\2\uffff\6\56\1\u0182\1\u0184\3\56\2\uffff\1\56\1\u018a\6\uffff\1\u018b\1\uffff\1\u018c\4\uffff\10\56\1\uffff\5\56\1\uffff\1\u019a\1\56\1\u019d\4\uffff\3\56\5\uffff\5\56\1\u01a6\7\56\1\uffff\1\56\2\uffff\2\56\1\uffff\5\56\1\uffff\5\56\1\uffff\20\56\2\uffff\3\56\1\u01ce\3\56\1\uffff\3\56\1\uffff\3\56\1\uffff\5\56\1\uffff\6\56\2\uffff\3\56\1\u01e6\2\uffff\2\56\1\u01e9\1\uffff\1\56\1\u01eb\1\uffff\1\u01ec\2\uffff";
    static final String DFA30_eofS =
        "\u01ed\uffff";
    static final String DFA30_minS =
        "\1\0\31\57\1\135\3\uffff\4\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\2\57\2\uffff\55\57\11\uffff\1\60\1\56\1\57\2\0\1\57\2\0\1\57\4\uffff\53\57\1\uffff\4\57\1\60\1\56\1\0\1\uffff\1\0\12\57\1\uffff\17\57\1\uffff\11\57\1\uffff\17\57\1\55\43\57\2\uffff\2\57\1\uffff\3\57\4\uffff\1\57\12\uffff\11\57\1\uffff\22\57\2\uffff\3\57\7\uffff\4\57\2\uffff\10\57\2\uffff\2\57\2\uffff\13\57\2\uffff\2\57\6\uffff\1\57\1\uffff\1\57\4\uffff\10\57\1\uffff\5\57\1\uffff\3\57\4\uffff\3\57\5\uffff\15\57\1\uffff\1\57\2\uffff\2\57\1\uffff\5\57\1\uffff\5\57\1\uffff\20\57\2\uffff\7\57\1\uffff\3\57\1\uffff\3\57\1\uffff\5\57\1\uffff\6\57\2\uffff\4\57\2\uffff\3\57\1\uffff\2\57\1\uffff\1\57\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\31\172\1\135\3\uffff\4\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\2\172\2\uffff\55\172\11\uffff\1\71\1\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\53\172\1\uffff\4\172\1\71\1\145\1\uffff\1\uffff\1\uffff\12\172\1\uffff\17\172\1\uffff\11\172\1\uffff\17\172\1\55\43\172\2\uffff\2\172\1\uffff\3\172\4\uffff\1\172\12\uffff\11\172\1\uffff\22\172\2\uffff\3\172\7\uffff\4\172\2\uffff\10\172\2\uffff\2\172\2\uffff\13\172\2\uffff\2\172\6\uffff\1\172\1\uffff\1\172\4\uffff\10\172\1\uffff\5\172\1\uffff\3\172\4\uffff\3\172\5\uffff\15\172\1\uffff\1\172\2\uffff\2\172\1\uffff\5\172\1\uffff\5\172\1\uffff\20\172\2\uffff\7\172\1\uffff\3\172\1\uffff\3\172\1\uffff\5\172\1\uffff\6\172\2\uffff\4\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA30_acceptS =
        "\33\uffff\1\122\1\123\1\125\10\uffff\1\134\1\uffff\1\135\1\uffff\1\142\1\143\2\uffff\1\137\1\133\55\uffff\1\121\1\124\1\122\1\123\1\125\1\126\1\132\1\131\1\130\11\uffff\1\134\1\141\1\136\1\142\53\uffff\1\120\7\uffff\1\140\13\uffff\1\114\17\uffff\1\111\11\uffff\1\117\63\uffff\1\63\1\110\2\uffff\1\103\3\uffff\1\61\1\105\1\62\1\106\1\uffff\1\73\1\107\1\77\1\113\1\112\1\100\1\116\1\115\1\127\1\104\11\uffff\1\65\22\uffff\1\51\1\101\3\uffff\1\43\1\74\1\44\1\75\1\45\1\76\1\52\4\uffff\1\72\1\102\10\uffff\1\32\1\66\2\uffff\1\40\1\60\13\uffff\1\47\1\64\2\uffff\1\33\1\67\1\34\1\70\1\35\1\71\1\uffff\1\53\1\uffff\1\54\1\55\1\56\1\57\10\uffff\1\50\5\uffff\1\25\3\uffff\1\22\1\41\1\23\1\42\3\uffff\1\31\1\30\1\46\1\36\1\37\15\uffff\1\26\1\uffff\1\21\1\27\2\uffff\1\24\5\uffff\1\20\5\uffff\1\17\20\uffff\1\15\1\16\7\uffff\1\14\3\uffff\1\13\3\uffff\1\12\5\uffff\1\11\6\uffff\1\7\1\10\4\uffff\1\5\1\6\3\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA30_specialS =
        "\1\6\43\uffff\1\3\1\7\103\uffff\1\10\1\2\1\uffff\1\0\1\5\67\uffff\1\1\1\uffff\1\4\u0145\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\44\1\46\3\53\1\45\4\53\1\33\1\40\1\53\1\47\1\36\2\37\7\41\1\34\6\53\1\20\1\15\1\43\1\21\1\1\1\43\1\4\1\22\1\16\2\43\1\31\3\43\1\3\1\43\1\2\1\23\7\43\1\32\1\53\1\35\1\42\1\43\1\53\1\6\1\24\1\43\1\7\1\43\1\10\1\26\1\43\1\17\3\43\1\13\1\27\1\43\1\11\1\43\1\12\1\5\1\30\1\14\1\25\4\43\3\53\1\51\uff81\53",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\27\55\1\54\2\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\60\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\62\20\55\1\61\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\63\5\55\1\64\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\65\12\55\1\70\1\55\1\71\1\55\1\67\1\66\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\72\16\55\1\73\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\74\17\55\1\75\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\101\3\55\1\77\6\55\1\100\5\55\1\76\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\102\23\55\1\103\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\104\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\105\15\55\1\106\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\107\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\111\15\55\1\110\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\112\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\113\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\115\3\55\1\114\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\117\15\55\1\116\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\120\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\121\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\122\11\55\1\123\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\124\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\125\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\127\15\55\1\126\3\55\1\130\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\132\10\55\1\133\6\55\1\131\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\134\21\55",
            "\1\135",
            "",
            "",
            "",
            "\1\145\1\uffff\12\143\10\uffff\1\142\2\uffff\1\145\34\uffff\1\142\2\uffff\1\145",
            "\1\145\1\uffff\12\146\13\uffff\1\145\37\uffff\1\145",
            "\1\145\1\uffff\12\147\13\uffff\1\145\37\uffff\1\145",
            "\1\145\26\uffff\1\145\37\uffff\1\145",
            "\32\150\4\uffff\1\150\1\uffff\32\150",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\42\152\1\153\71\152\1\151\uffa3\152",
            "\47\155\1\156\64\155\1\154\uffa3\155",
            "",
            "\1\161\4\uffff\1\161\2\uffff\1\160\26\uffff\32\50\3\uffff\2\50\1\uffff\32\50",
            "",
            "\1\161\4\uffff\1\161",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\163\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\164\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\165\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\166\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\167\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\170\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\171\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\172\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\173\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\174\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\175\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\176\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\177\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\u0081\11\55\1\u0080\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0082\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0083\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0084\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0085\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0086\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0087\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u0088\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\20\55\1\u008a\1\55\1\u0089\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u008b\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u008c\23\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u008d\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u008e\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u008f\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0090\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0091\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0092\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\u0093\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u0094\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0095\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0096\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0097\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0098\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0099\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u009a\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u009b\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u009c\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u009d\15\55",
            "\1\50\12\55\1\u009e\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u009f\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u00a0\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00a1\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00a2\7\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a3",
            "\1\145\1\uffff\12\u00a4\13\uffff\1\145\37\uffff\1\145",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\0\u00a5",
            "\42\152\1\153\71\152\1\151\uffa3\152",
            "\1\161\15\uffff\1\57",
            "\0\u00a7",
            "\47\155\1\156\64\155\1\154\uffa3\155",
            "\1\161\15\uffff\1\57",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00a8\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00a9\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u00aa\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00ab\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u00ac\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u00ad\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u00ae\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00af\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00b0\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u00b1\27\55",
            "\1\50\12\55\1\u00b2\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00b3\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00b4\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00b5\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00b6\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00b7\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u00b8\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u00b9\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00ba\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00bb\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00bc\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00bd\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u00be\4\55\1\u00bf\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00c0\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00c1\7\55",
            "\1\50\12\55\1\u00c2\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00c3\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00c4\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00c5\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00c6\25\55",
            "\1\50\1\55\1\u00c7\1\55\1\u00c8\2\55\1\u00c9\1\55\1\u00ca\1\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00cb\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u00cd\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00ce\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u00cf\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00d0\13\55\1\u00d1\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00d2\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d3\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00d4\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00d5\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d6\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d7\25\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d8\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d9\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00da\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00db\6\55",
            "\12\u00dc",
            "\1\145\1\uffff\12\u00a4\13\uffff\1\145\37\uffff\1\145",
            "\42\152\1\153\71\152\1\151\uffa3\152",
            "",
            "\47\155\1\156\64\155\1\154\uffa3\155",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u00dd\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00de\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00df\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u00e0\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00e1\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\7\55\1\u00e2\22\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00e3\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u00e4\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u00e5\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00e6\7\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u00e7\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\u00e8\24\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u00e9\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00ea\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00eb\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\6\55\1\u00ec\23\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u00ed\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00ee\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00ef\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u00f0\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00f1\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u00f2\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00f3\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00f4\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00f5\31\55",
            "",
            "\1\50\1\55\1\u00f6\1\55\1\u00f7\2\55\1\u00f8\1\55\1\u00f9\1\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00fa\25\55",
            "\1\50\6\55\1\u00fb\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u00fc\23\55",
            "\1\50\6\55\1\u00fd\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\2\55\1\u00fe\7\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\4\55\1\u00ff\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0100\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\u0102\1\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0103\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0105\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0106\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0107\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0108\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u010a\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u010c\25\55",
            "\1\50\12\55\1\u010d\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u010f\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u0112\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\143",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0117\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0118\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0119\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u011a\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u011b\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u011c\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u011d\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u011e\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u011f\23\55",
            "\1\50\12\55\1\u0120\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0121\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0122\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u0123\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0124\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0125\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0126\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0127\31\55",
            "\1\50\3\55\1\u0128\2\55\1\u0129\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u012a\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u012b\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u012c\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u012d\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u012e\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u012f\23\55",
            "\1\50\6\55\1\u0130\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\2\55\1\u0131\7\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\4\55\1\u0132\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0133\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0135\31\55",
            "\1\50\4\55\1\u0136\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0137\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0138\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u013a\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u013c\3\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\1\u013e\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u013f\25\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0140\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u0141\23\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0142\6\55",
            "",
            "",
            "",
            "",
            "\1\50\12\55\1\u0143\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0145\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u0146\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0147\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0148\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u0149\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u014a\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u014b\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u014c\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u014d\3\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\1\u0151\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u014f\17\55\1\u0150\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0153\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0154\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0155\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0156\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0157\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0158\27\55",
            "\1\50\2\55\1\u0159\7\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\4\55\1\u015a\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u015b\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\7\55\1\u015c\22\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u015d\7\55",
            "\1\50\12\55\1\u015e\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0160\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0161\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0162\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0164\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0166\3\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0168\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u016a\10\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u016f\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0170\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u0171\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0172\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0173\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u0174\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0175\17\55\1\u0176\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u0178\30\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0179\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u017a\25\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u017b\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u017c\14\55",
            "\1\50\12\55\1\u017d\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u017e\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\21\55\1\u017f\10\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\12\55\1\u0180\17\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0181\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\1\u0183\3\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0185\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0186\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0187\25\55",
            "",
            "",
            "\1\50\12\55\1\u0188\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u0189\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\3\55\1\u018d\26\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u018e\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u018f\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0190\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u0191\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0192\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0193\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0194\25\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0195\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0196\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0197\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0198\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0199\27\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u019b\25\55",
            "\1\50\12\55\1\u019c\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u019e\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u019f\10\55",
            "\1\50\12\55\1\u01a0\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01a1\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u01a2\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u01a3\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\1\u01a4\31\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01a5\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u01a7\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u01a8\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u01a9\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01aa\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u01ab\4\55",
            "\1\50\12\55\1\u01ac\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u01ad\21\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u01ae\12\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01af\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01b0\7\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u01b1\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u01b2\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01b3\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u01b4\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01b5\7\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01b6\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u01b7\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01b8\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u01b9\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01ba\25\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01bb\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u01bc\13\55",
            "\1\50\12\55\1\u01bd\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u01be\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01bf\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01c0\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01c1\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\u01c2\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u01c3\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u01c4\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01c5\25\55",
            "\1\50\12\55\1\u01c6\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u01c7\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u01c8\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01c9\7\55",
            "\1\50\12\55\1\u01ca\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u01cb\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01cc\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u01cd\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u01cf\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u01d0\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u01d1\10\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01d2\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01d3\7\55",
            "\1\50\12\55\1\u01d4\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u01d5\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u01d6\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u01d7\31\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u01d8\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01d9\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01da\7\55",
            "\1\50\12\55\1\u01db\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u01dc\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01dd\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u01de\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u01df\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01e0\25\55",
            "\1\50\12\55\1\u01e1\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u01e2\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u01e3\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u01e4\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01e5\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u01e7\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01e8\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\u01ea\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Default | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_108 = input.LA(1);

                        s = -1;
                        if ( ((LA30_108>='\u0000' && LA30_108<='\uFFFF')) ) {s = 167;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_165 = input.LA(1);

                        s = -1;
                        if ( (LA30_165=='\"') ) {s = 107;}

                        else if ( (LA30_165=='\\') ) {s = 105;}

                        else if ( ((LA30_165>='\u0000' && LA30_165<='!')||(LA30_165>='#' && LA30_165<='[')||(LA30_165>=']' && LA30_165<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_106 = input.LA(1);

                        s = -1;
                        if ( (LA30_106=='\"') ) {s = 107;}

                        else if ( (LA30_106=='\\') ) {s = 105;}

                        else if ( ((LA30_106>='\u0000' && LA30_106<='!')||(LA30_106>='#' && LA30_106<='[')||(LA30_106>=']' && LA30_106<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_36 = input.LA(1);

                        s = -1;
                        if ( (LA30_36=='\\') ) {s = 105;}

                        else if ( ((LA30_36>='\u0000' && LA30_36<='!')||(LA30_36>='#' && LA30_36<='[')||(LA30_36>=']' && LA30_36<='\uFFFF')) ) {s = 106;}

                        else if ( (LA30_36=='\"') ) {s = 107;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_167 = input.LA(1);

                        s = -1;
                        if ( (LA30_167=='\'') ) {s = 110;}

                        else if ( (LA30_167=='\\') ) {s = 108;}

                        else if ( ((LA30_167>='\u0000' && LA30_167<='&')||(LA30_167>='(' && LA30_167<='[')||(LA30_167>=']' && LA30_167<='\uFFFF')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_109 = input.LA(1);

                        s = -1;
                        if ( (LA30_109=='\'') ) {s = 110;}

                        else if ( (LA30_109=='\\') ) {s = 108;}

                        else if ( ((LA30_109>='\u0000' && LA30_109<='&')||(LA30_109>='(' && LA30_109<='[')||(LA30_109>=']' && LA30_109<='\uFFFF')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='E') ) {s = 1;}

                        else if ( (LA30_0=='R') ) {s = 2;}

                        else if ( (LA30_0=='P') ) {s = 3;}

                        else if ( (LA30_0=='G') ) {s = 4;}

                        else if ( (LA30_0=='s') ) {s = 5;}

                        else if ( (LA30_0=='a') ) {s = 6;}

                        else if ( (LA30_0=='d') ) {s = 7;}

                        else if ( (LA30_0=='f') ) {s = 8;}

                        else if ( (LA30_0=='p') ) {s = 9;}

                        else if ( (LA30_0=='r') ) {s = 10;}

                        else if ( (LA30_0=='m') ) {s = 11;}

                        else if ( (LA30_0=='u') ) {s = 12;}

                        else if ( (LA30_0=='B') ) {s = 13;}

                        else if ( (LA30_0=='I') ) {s = 14;}

                        else if ( (LA30_0=='i') ) {s = 15;}

                        else if ( (LA30_0=='A') ) {s = 16;}

                        else if ( (LA30_0=='D') ) {s = 17;}

                        else if ( (LA30_0=='H') ) {s = 18;}

                        else if ( (LA30_0=='S') ) {s = 19;}

                        else if ( (LA30_0=='b') ) {s = 20;}

                        else if ( (LA30_0=='v') ) {s = 21;}

                        else if ( (LA30_0=='g') ) {s = 22;}

                        else if ( (LA30_0=='n') ) {s = 23;}

                        else if ( (LA30_0=='t') ) {s = 24;}

                        else if ( (LA30_0=='L') ) {s = 25;}

                        else if ( (LA30_0=='[') ) {s = 26;}

                        else if ( (LA30_0==',') ) {s = 27;}

                        else if ( (LA30_0==':') ) {s = 28;}

                        else if ( (LA30_0==']') ) {s = 29;}

                        else if ( (LA30_0=='0') ) {s = 30;}

                        else if ( ((LA30_0>='1' && LA30_0<='2')) ) {s = 31;}

                        else if ( (LA30_0=='-') ) {s = 32;}

                        else if ( ((LA30_0>='3' && LA30_0<='9')) ) {s = 33;}

                        else if ( (LA30_0=='^') ) {s = 34;}

                        else if ( (LA30_0=='C'||LA30_0=='F'||(LA30_0>='J' && LA30_0<='K')||(LA30_0>='M' && LA30_0<='O')||LA30_0=='Q'||(LA30_0>='T' && LA30_0<='Z')||LA30_0=='_'||LA30_0=='c'||LA30_0=='e'||LA30_0=='h'||(LA30_0>='j' && LA30_0<='l')||LA30_0=='o'||LA30_0=='q'||(LA30_0>='w' && LA30_0<='z')) ) {s = 35;}

                        else if ( (LA30_0=='\"') ) {s = 36;}

                        else if ( (LA30_0=='\'') ) {s = 37;}

                        else if ( (LA30_0=='#') ) {s = 38;}

                        else if ( (LA30_0=='/') ) {s = 39;}

                        else if ( (LA30_0=='~') ) {s = 41;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 42;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||LA30_0=='!'||(LA30_0>='$' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='+')||LA30_0=='.'||(LA30_0>=';' && LA30_0<='@')||LA30_0=='\\'||LA30_0=='`'||(LA30_0>='{' && LA30_0<='}')||(LA30_0>='\u007F' && LA30_0<='\uFFFF')) ) {s = 43;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_37 = input.LA(1);

                        s = -1;
                        if ( (LA30_37=='\\') ) {s = 108;}

                        else if ( ((LA30_37>='\u0000' && LA30_37<='&')||(LA30_37>='(' && LA30_37<='[')||(LA30_37>=']' && LA30_37<='\uFFFF')) ) {s = 109;}

                        else if ( (LA30_37=='\'') ) {s = 110;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_105 = input.LA(1);

                        s = -1;
                        if ( ((LA30_105>='\u0000' && LA30_105<='\uFFFF')) ) {s = 165;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}