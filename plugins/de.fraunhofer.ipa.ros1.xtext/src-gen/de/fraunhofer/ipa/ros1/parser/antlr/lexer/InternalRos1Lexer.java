package de.fraunhofer.ipa.ros1.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRos1Lexer extends Lexer {
    public static final int Float32_1=20;
    public static final int Node=76;
    public static final int RULE_DATE_TIME=96;
    public static final int Uint64_1=30;
    public static final int Serviceclients=8;
    public static final int String=46;
    public static final int Int16=59;
    public static final int Float32=33;
    public static final int Goal=73;
    public static final int Actionservers=11;
    public static final int Bool=70;
    public static final int Msgs=62;
    public static final int Uint16=55;
    public static final int Boolean=31;
    public static final int ExternalDependency=4;
    public static final int Uint8=66;
    public static final int Parameters=16;
    public static final int RULE_ID=97;
    public static final int Actions=22;
    public static final int RULE_DIGIT=86;
    public static final int GlobalNamespace=7;
    public static final int Artifacts=18;
    public static final int Node_1=63;
    public static final int Int16_1=35;
    public static final int Header=45;
    public static final int RULE_INT=99;
    public static final int Byte=71;
    public static final int RULE_ML_COMMENT=106;
    public static final int LeftSquareBracket=84;
    public static final int Base64=43;
    public static final int Comma=82;
    public static final int RULE_MESSAGE_ASIGMENT=100;
    public static final int LeftSquareBracketRightSquareBracket=81;
    public static final int Int32=60;
    public static final int Char=72;
    public static final int Publishers=17;
    public static final int Srvs=64;
    public static final int RULE_DECINT=89;
    public static final int Uint32=56;
    public static final int FromGitRepo=14;
    public static final int RULE_HOUR=94;
    public static final int Int8=74;
    public static final int Default=23;
    public static final int Int8_1=52;
    public static final int Uint16_1=28;
    public static final int Type=78;
    public static final int Float64=34;
    public static final int Int32_1=36;
    public static final int RULE_BINARY=87;
    public static final int String_1=54;
    public static final int Subscribers=15;
    public static final int String_2=27;
    public static final int Actionclients=10;
    public static final int RULE_DAY=91;
    public static final int RULE_BEGIN=101;
    public static final int RULE_BOOLEAN=88;
    public static final int RelativeNamespace=5;
    public static final int Serviceservers=9;
    public static final int RULE_YEAR=93;
    public static final int Result=53;
    public static final int Name=75;
    public static final int RULE_MIN_SEC=95;
    public static final int Char_1=51;
    public static final int ParameterAny=13;
    public static final int List=69;
    public static final int Dependencies=12;
    public static final int RightSquareBracket=85;
    public static final int PrivateNamespace=6;
    public static final int GraphName=19;
    public static final int Byte_1=50;
    public static final int Float64_1=21;
    public static final int Duration=24;
    public static final int Uint32_1=29;
    public static final int Double=44;
    public static final int Type_1=65;
    public static final int Value=67;
    public static final int Uint64=57;
    public static final int Action=48;
    public static final int RULE_END=102;
    public static final int Message=38;
    public static final int Value_1=58;
    public static final int Time=77;
    public static final int RULE_STRING=98;
    public static final int Bool_1=49;
    public static final int Any=79;
    public static final int Struct=47;
    public static final int RULE_SL_COMMENT=103;
    public static final int Uint8_1=41;
    public static final int RULE_DOUBLE=90;
    public static final int Feedback=25;
    public static final int RULE_ROS_CONVENTION_A=104;
    public static final int RULE_ROS_CONVENTION_PARAM=105;
    public static final int Colon=83;
    public static final int EOF=-1;
    public static final int Ns=80;
    public static final int RULE_WS=107;
    public static final int Int64_1=37;
    public static final int Request=39;
    public static final int Service=40;
    public static final int RULE_ANY_OTHER=108;
    public static final int Date=68;
    public static final int Response=26;
    public static final int Integer=32;
    public static final int Array=42;
    public static final int Int64=61;
    public static final int RULE_MONTH=92;

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

    // $ANTLR start "Float32_1"
    public final void mFloat32_1() throws RecognitionException {
        try {
            int _type = Float32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:46:11: ( 'float32[]' )
            // InternalRos1Lexer.g:46:13: 'float32[]'
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
            // InternalRos1Lexer.g:48:11: ( 'float64[]' )
            // InternalRos1Lexer.g:48:13: 'float64[]'
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

    // $ANTLR start "Actions"
    public final void mActions() throws RecognitionException {
        try {
            int _type = Actions;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:50:9: ( 'actions:' )
            // InternalRos1Lexer.g:50:11: 'actions:'
            {
            match("actions:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Actions"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:52:9: ( 'default:' )
            // InternalRos1Lexer.g:52:11: 'default:'
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
            // InternalRos1Lexer.g:54:10: ( 'duration' )
            // InternalRos1Lexer.g:54:12: 'duration'
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
            // InternalRos1Lexer.g:56:10: ( 'feedback' )
            // InternalRos1Lexer.g:56:12: 'feedback'
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

    // $ANTLR start "Response"
    public final void mResponse() throws RecognitionException {
        try {
            int _type = Response;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:58:10: ( 'response' )
            // InternalRos1Lexer.g:58:12: 'response'
            {
            match("response"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Response"

    // $ANTLR start "String_2"
    public final void mString_2() throws RecognitionException {
        try {
            int _type = String_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:60:10: ( 'string[]' )
            // InternalRos1Lexer.g:60:12: 'string[]'
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
            // InternalRos1Lexer.g:62:10: ( 'uint16[]' )
            // InternalRos1Lexer.g:62:12: 'uint16[]'
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
            // InternalRos1Lexer.g:64:10: ( 'uint32[]' )
            // InternalRos1Lexer.g:64:12: 'uint32[]'
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
            // InternalRos1Lexer.g:66:10: ( 'uint64[]' )
            // InternalRos1Lexer.g:66:12: 'uint64[]'
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
            // InternalRos1Lexer.g:68:9: ( 'Boolean' )
            // InternalRos1Lexer.g:68:11: 'Boolean'
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
            // InternalRos1Lexer.g:70:9: ( 'Integer' )
            // InternalRos1Lexer.g:70:11: 'Integer'
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

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:72:9: ( 'float32' )
            // InternalRos1Lexer.g:72:11: 'float32'
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
            // InternalRos1Lexer.g:74:9: ( 'float64' )
            // InternalRos1Lexer.g:74:11: 'float64'
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
            // InternalRos1Lexer.g:76:9: ( 'int16[]' )
            // InternalRos1Lexer.g:76:11: 'int16[]'
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
            // InternalRos1Lexer.g:78:9: ( 'int32[]' )
            // InternalRos1Lexer.g:78:11: 'int32[]'
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
            // InternalRos1Lexer.g:80:9: ( 'int64[]' )
            // InternalRos1Lexer.g:80:11: 'int64[]'
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
            // InternalRos1Lexer.g:82:9: ( 'message' )
            // InternalRos1Lexer.g:82:11: 'message'
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

    // $ANTLR start "Request"
    public final void mRequest() throws RecognitionException {
        try {
            int _type = Request;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:84:9: ( 'request' )
            // InternalRos1Lexer.g:84:11: 'request'
            {
            match("request"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Request"

    // $ANTLR start "Service"
    public final void mService() throws RecognitionException {
        try {
            int _type = Service;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:86:9: ( 'service' )
            // InternalRos1Lexer.g:86:11: 'service'
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
            // InternalRos1Lexer.g:88:9: ( 'uint8[]' )
            // InternalRos1Lexer.g:88:11: 'uint8[]'
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
            // InternalRos1Lexer.g:90:7: ( 'Array:' )
            // InternalRos1Lexer.g:90:9: 'Array:'
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
            // InternalRos1Lexer.g:92:8: ( 'Base64' )
            // InternalRos1Lexer.g:92:10: 'Base64'
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
            // InternalRos1Lexer.g:94:8: ( 'Double' )
            // InternalRos1Lexer.g:94:10: 'Double'
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
            // InternalRos1Lexer.g:96:8: ( 'Header' )
            // InternalRos1Lexer.g:96:10: 'Header'
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
            // InternalRos1Lexer.g:98:8: ( 'String' )
            // InternalRos1Lexer.g:98:10: 'String'
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
            // InternalRos1Lexer.g:100:8: ( 'Struct' )
            // InternalRos1Lexer.g:100:10: 'Struct'
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
            // InternalRos1Lexer.g:102:8: ( 'action' )
            // InternalRos1Lexer.g:102:10: 'action'
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
            // InternalRos1Lexer.g:104:8: ( 'bool[]' )
            // InternalRos1Lexer.g:104:10: 'bool[]'
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
            // InternalRos1Lexer.g:106:8: ( 'byte[]' )
            // InternalRos1Lexer.g:106:10: 'byte[]'
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

    // $ANTLR start "Char_1"
    public final void mChar_1() throws RecognitionException {
        try {
            int _type = Char_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:108:8: ( 'char[]' )
            // InternalRos1Lexer.g:108:10: 'char[]'
            {
            match("char[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char_1"

    // $ANTLR start "Int8_1"
    public final void mInt8_1() throws RecognitionException {
        try {
            int _type = Int8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:110:8: ( 'int8[]' )
            // InternalRos1Lexer.g:110:10: 'int8[]'
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
            // InternalRos1Lexer.g:112:8: ( 'result' )
            // InternalRos1Lexer.g:112:10: 'result'
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

    // $ANTLR start "String_1"
    public final void mString_1() throws RecognitionException {
        try {
            int _type = String_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:114:10: ( 'string' )
            // InternalRos1Lexer.g:114:12: 'string'
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
            // InternalRos1Lexer.g:116:8: ( 'uint16' )
            // InternalRos1Lexer.g:116:10: 'uint16'
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
            // InternalRos1Lexer.g:118:8: ( 'uint32' )
            // InternalRos1Lexer.g:118:10: 'uint32'
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
            // InternalRos1Lexer.g:120:8: ( 'uint64' )
            // InternalRos1Lexer.g:120:10: 'uint64'
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
            // InternalRos1Lexer.g:122:9: ( 'value:' )
            // InternalRos1Lexer.g:122:11: 'value:'
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

    // $ANTLR start "Int16"
    public final void mInt16() throws RecognitionException {
        try {
            int _type = Int16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:124:7: ( 'int16' )
            // InternalRos1Lexer.g:124:9: 'int16'
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
            // InternalRos1Lexer.g:126:7: ( 'int32' )
            // InternalRos1Lexer.g:126:9: 'int32'
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
            // InternalRos1Lexer.g:128:7: ( 'int64' )
            // InternalRos1Lexer.g:128:9: 'int64'
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

    // $ANTLR start "Msgs"
    public final void mMsgs() throws RecognitionException {
        try {
            int _type = Msgs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:130:6: ( 'msgs:' )
            // InternalRos1Lexer.g:130:8: 'msgs:'
            {
            match("msgs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Msgs"

    // $ANTLR start "Node_1"
    public final void mNode_1() throws RecognitionException {
        try {
            int _type = Node_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:132:8: ( 'node:' )
            // InternalRos1Lexer.g:132:10: 'node:'
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

    // $ANTLR start "Srvs"
    public final void mSrvs() throws RecognitionException {
        try {
            int _type = Srvs;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:134:6: ( 'srvs:' )
            // InternalRos1Lexer.g:134:8: 'srvs:'
            {
            match("srvs:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Srvs"

    // $ANTLR start "Type_1"
    public final void mType_1() throws RecognitionException {
        try {
            int _type = Type_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:136:8: ( 'type:' )
            // InternalRos1Lexer.g:136:10: 'type:'
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
            // InternalRos1Lexer.g:138:7: ( 'uint8' )
            // InternalRos1Lexer.g:138:9: 'uint8'
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
            // InternalRos1Lexer.g:140:7: ( 'value' )
            // InternalRos1Lexer.g:140:9: 'value'
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
            // InternalRos1Lexer.g:142:6: ( 'Date' )
            // InternalRos1Lexer.g:142:8: 'Date'
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
            // InternalRos1Lexer.g:144:6: ( 'List' )
            // InternalRos1Lexer.g:144:8: 'List'
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
            // InternalRos1Lexer.g:146:6: ( 'bool' )
            // InternalRos1Lexer.g:146:8: 'bool'
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
            // InternalRos1Lexer.g:148:6: ( 'byte' )
            // InternalRos1Lexer.g:148:8: 'byte'
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

    // $ANTLR start "Char"
    public final void mChar() throws RecognitionException {
        try {
            int _type = Char;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:150:6: ( 'char' )
            // InternalRos1Lexer.g:150:8: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Char"

    // $ANTLR start "Goal"
    public final void mGoal() throws RecognitionException {
        try {
            int _type = Goal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:152:6: ( 'goal' )
            // InternalRos1Lexer.g:152:8: 'goal'
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
            // InternalRos1Lexer.g:154:6: ( 'int8' )
            // InternalRos1Lexer.g:154:8: 'int8'
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

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:156:6: ( 'name' )
            // InternalRos1Lexer.g:156:8: 'name'
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
            // InternalRos1Lexer.g:158:6: ( 'node' )
            // InternalRos1Lexer.g:158:8: 'node'
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

    // $ANTLR start "Time"
    public final void mTime() throws RecognitionException {
        try {
            int _type = Time;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:160:6: ( 'time' )
            // InternalRos1Lexer.g:160:8: 'time'
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
            // InternalRos1Lexer.g:162:6: ( 'type' )
            // InternalRos1Lexer.g:162:8: 'type'
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
            // InternalRos1Lexer.g:164:5: ( 'Any' )
            // InternalRos1Lexer.g:164:7: 'Any'
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
            // InternalRos1Lexer.g:166:4: ( 'ns:' )
            // InternalRos1Lexer.g:166:6: 'ns:'
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
            // InternalRos1Lexer.g:168:37: ( '[]' )
            // InternalRos1Lexer.g:168:39: '[]'
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
            // InternalRos1Lexer.g:170:7: ( ',' )
            // InternalRos1Lexer.g:170:9: ','
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
            // InternalRos1Lexer.g:172:7: ( ':' )
            // InternalRos1Lexer.g:172:9: ':'
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
            // InternalRos1Lexer.g:174:19: ( '[' )
            // InternalRos1Lexer.g:174:21: '['
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
            // InternalRos1Lexer.g:176:20: ( ']' )
            // InternalRos1Lexer.g:176:22: ']'
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
            // InternalRos1Lexer.g:178:21: ( '0' .. '9' )
            // InternalRos1Lexer.g:178:23: '0' .. '9'
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
            // InternalRos1Lexer.g:180:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRos1Lexer.g:180:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRos1Lexer.g:180:15: ( '0b' | '0B' )
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
                    // InternalRos1Lexer.g:180:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:180:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRos1Lexer.g:180:27: ( '0' | '1' )+
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
            // InternalRos1Lexer.g:182:14: ( ( 'true' | 'false' ) )
            // InternalRos1Lexer.g:182:16: ( 'true' | 'false' )
            {
            // InternalRos1Lexer.g:182:16: ( 'true' | 'false' )
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
                    // InternalRos1Lexer.g:182:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:182:24: 'false'
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
            // InternalRos1Lexer.g:184:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalRos1Lexer.g:184:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalRos1Lexer.g:184:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.'||(LA6_0>='0' && LA6_0<='9')||LA6_0=='E'||LA6_0=='e') ) {
                alt6=1;
            }
            else if ( (LA6_0=='-') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRos1Lexer.g:184:16: ( RULE_DIGIT )*
                    {
                    // InternalRos1Lexer.g:184:16: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:184:16: RULE_DIGIT
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
                case 2 :
                    // InternalRos1Lexer.g:184:28: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalRos1Lexer.g:184:32: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:184:32: RULE_DIGIT
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

            // InternalRos1Lexer.g:184:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalRos1Lexer.g:184:46: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRos1Lexer.g:184:50: ( RULE_DECINT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:184:50: RULE_DECINT
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
                    // InternalRos1Lexer.g:184:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalRos1Lexer.g:184:63: ( '.' ( RULE_DIGIT )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRos1Lexer.g:184:64: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRos1Lexer.g:184:68: ( RULE_DIGIT )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalRos1Lexer.g:184:68: RULE_DIGIT
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

                    // InternalRos1Lexer.g:184:92: ( '-' | '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
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

                    // InternalRos1Lexer.g:184:103: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:184:103: RULE_DIGIT
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
            // InternalRos1Lexer.g:186:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRos1Lexer.g:186:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRos1Lexer.g:186:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt15=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt15=1;
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
                alt15=2;
                }
                break;
            case '-':
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRos1Lexer.g:186:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:186:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRos1Lexer.g:186:29: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:186:29: RULE_DIGIT
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
                case 3 :
                    // InternalRos1Lexer.g:186:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRos1Lexer.g:186:54: ( RULE_DIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:186:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
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
            // InternalRos1Lexer.g:188:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRos1Lexer.g:188:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRos1Lexer.g:188:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='1' && LA16_0<='3')) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>='0' && LA16_1<='9')) ) {
                    alt16=2;
                }
                else {
                    alt16=1;}
            }
            else if ( ((LA16_0>='4' && LA16_0<='9')) ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos1Lexer.g:188:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:188:31: '1' .. '3' '0' .. '9'
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
            // InternalRos1Lexer.g:190:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRos1Lexer.g:190:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRos1Lexer.g:190:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='1') ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>='0' && LA17_1<='2')) ) {
                    alt17=2;
                }
                else {
                    alt17=1;}
            }
            else if ( ((LA17_0>='2' && LA17_0<='9')) ) {
                alt17=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRos1Lexer.g:190:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:190:33: '1' '0' .. '2'
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
            // InternalRos1Lexer.g:192:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRos1Lexer.g:192:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRos1Lexer.g:194:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRos1Lexer.g:194:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRos1Lexer.g:194:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='0' && LA18_0<='1')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='2') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRos1Lexer.g:194:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:194:41: '2' '0' .. '3'
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
            // InternalRos1Lexer.g:196:23: ( '0' .. '5' '0' .. '9' )
            // InternalRos1Lexer.g:196:25: '0' .. '5' '0' .. '9'
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
            // InternalRos1Lexer.g:198:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRos1Lexer.g:198:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRos1Lexer.g:200:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRos1Lexer.g:200:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRos1Lexer.g:200:25: ( RULE_ID | RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='^' && LA19_0<='_')||(LA19_0>='a' && LA19_0<='z')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='\"'||LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRos1Lexer.g:200:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:200:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRos1Lexer.g:200:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt20=4;
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
                alt20=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt20=2;
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
                alt20=3;
                }
                break;
            case '-':
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalRos1Lexer.g:200:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:200:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRos1Lexer.g:200:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRos1Lexer.g:200:81: '-' RULE_INT
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
            // InternalRos1Lexer.g:202:21: ()
            // InternalRos1Lexer.g:202:23: 
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
            // InternalRos1Lexer.g:204:19: ()
            // InternalRos1Lexer.g:204:21: 
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
            // InternalRos1Lexer.g:206:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRos1Lexer.g:206:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRos1Lexer.g:206:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRos1Lexer.g:206:23: ~ ( ( '\\n' | '\\r' ) )
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ROS_CONVENTION_A"
    public final void mRULE_ROS_CONVENTION_A() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:208:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRos1Lexer.g:208:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRos1Lexer.g:208:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='/') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='A' && LA22_0<='Z')||(LA22_0>='^' && LA22_0<='_')||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRos1Lexer.g:208:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos1Lexer.g:208:38: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // InternalRos1Lexer.g:210:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRos1Lexer.g:210:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRos1Lexer.g:210:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop23:
            do {
                int alt23=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt23=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt23=2;
                    }
                    break;
                case '~':
                    {
                    alt23=3;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalRos1Lexer.g:210:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRos1Lexer.g:210:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRos1Lexer.g:210:62: '~' RULE_STRING
            	    {
            	    match('~'); 
            	    mRULE_STRING(); 

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
    // $ANTLR end "RULE_ROS_CONVENTION_PARAM"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRos1Lexer.g:212:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRos1Lexer.g:212:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRos1Lexer.g:212:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRos1Lexer.g:212:11: '^'
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

            // InternalRos1Lexer.g:212:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
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
            	    break loop25;
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
            // InternalRos1Lexer.g:214:19: ( ( '0' .. '9' )+ )
            // InternalRos1Lexer.g:214:21: ( '0' .. '9' )+
            {
            // InternalRos1Lexer.g:214:21: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRos1Lexer.g:214:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
            // InternalRos1Lexer.g:216:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRos1Lexer.g:216:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRos1Lexer.g:216:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\"') ) {
                alt29=1;
            }
            else if ( (LA29_0=='\'') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRos1Lexer.g:216:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRos1Lexer.g:216:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:216:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos1Lexer.g:216:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop27;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRos1Lexer.g:216:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRos1Lexer.g:216:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRos1Lexer.g:216:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRos1Lexer.g:216:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop28;
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
            // InternalRos1Lexer.g:218:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRos1Lexer.g:218:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRos1Lexer.g:218:24: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFF')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRos1Lexer.g:218:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
            // InternalRos1Lexer.g:220:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRos1Lexer.g:220:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRos1Lexer.g:220:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\t' && LA31_0<='\n')||LA31_0=='\r'||LA31_0==' ') ) {
                    alt31=1;
                }


                switch (alt31) {
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
            // InternalRos1Lexer.g:222:16: ( . )
            // InternalRos1Lexer.g:222:18: .
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
        // InternalRos1Lexer.g:1:8: ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Float32_1 | Float64_1 | Actions | Default | Duration | Feedback | Response | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Request | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Msgs | Node_1 | Srvs | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=96;
        alt32 = dfa32.predict(input);
        switch (alt32) {
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
                // InternalRos1Lexer.g:1:230: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 18 :
                // InternalRos1Lexer.g:1:240: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 19 :
                // InternalRos1Lexer.g:1:250: Actions
                {
                mActions(); 

                }
                break;
            case 20 :
                // InternalRos1Lexer.g:1:258: Default
                {
                mDefault(); 

                }
                break;
            case 21 :
                // InternalRos1Lexer.g:1:266: Duration
                {
                mDuration(); 

                }
                break;
            case 22 :
                // InternalRos1Lexer.g:1:275: Feedback
                {
                mFeedback(); 

                }
                break;
            case 23 :
                // InternalRos1Lexer.g:1:284: Response
                {
                mResponse(); 

                }
                break;
            case 24 :
                // InternalRos1Lexer.g:1:293: String_2
                {
                mString_2(); 

                }
                break;
            case 25 :
                // InternalRos1Lexer.g:1:302: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 26 :
                // InternalRos1Lexer.g:1:311: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 27 :
                // InternalRos1Lexer.g:1:320: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 28 :
                // InternalRos1Lexer.g:1:329: Boolean
                {
                mBoolean(); 

                }
                break;
            case 29 :
                // InternalRos1Lexer.g:1:337: Integer
                {
                mInteger(); 

                }
                break;
            case 30 :
                // InternalRos1Lexer.g:1:345: Float32
                {
                mFloat32(); 

                }
                break;
            case 31 :
                // InternalRos1Lexer.g:1:353: Float64
                {
                mFloat64(); 

                }
                break;
            case 32 :
                // InternalRos1Lexer.g:1:361: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 33 :
                // InternalRos1Lexer.g:1:369: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 34 :
                // InternalRos1Lexer.g:1:377: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 35 :
                // InternalRos1Lexer.g:1:385: Message
                {
                mMessage(); 

                }
                break;
            case 36 :
                // InternalRos1Lexer.g:1:393: Request
                {
                mRequest(); 

                }
                break;
            case 37 :
                // InternalRos1Lexer.g:1:401: Service
                {
                mService(); 

                }
                break;
            case 38 :
                // InternalRos1Lexer.g:1:409: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 39 :
                // InternalRos1Lexer.g:1:417: Array
                {
                mArray(); 

                }
                break;
            case 40 :
                // InternalRos1Lexer.g:1:423: Base64
                {
                mBase64(); 

                }
                break;
            case 41 :
                // InternalRos1Lexer.g:1:430: Double
                {
                mDouble(); 

                }
                break;
            case 42 :
                // InternalRos1Lexer.g:1:437: Header
                {
                mHeader(); 

                }
                break;
            case 43 :
                // InternalRos1Lexer.g:1:444: String
                {
                mString(); 

                }
                break;
            case 44 :
                // InternalRos1Lexer.g:1:451: Struct
                {
                mStruct(); 

                }
                break;
            case 45 :
                // InternalRos1Lexer.g:1:458: Action
                {
                mAction(); 

                }
                break;
            case 46 :
                // InternalRos1Lexer.g:1:465: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 47 :
                // InternalRos1Lexer.g:1:472: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 48 :
                // InternalRos1Lexer.g:1:479: Char_1
                {
                mChar_1(); 

                }
                break;
            case 49 :
                // InternalRos1Lexer.g:1:486: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 50 :
                // InternalRos1Lexer.g:1:493: Result
                {
                mResult(); 

                }
                break;
            case 51 :
                // InternalRos1Lexer.g:1:500: String_1
                {
                mString_1(); 

                }
                break;
            case 52 :
                // InternalRos1Lexer.g:1:509: Uint16
                {
                mUint16(); 

                }
                break;
            case 53 :
                // InternalRos1Lexer.g:1:516: Uint32
                {
                mUint32(); 

                }
                break;
            case 54 :
                // InternalRos1Lexer.g:1:523: Uint64
                {
                mUint64(); 

                }
                break;
            case 55 :
                // InternalRos1Lexer.g:1:530: Value_1
                {
                mValue_1(); 

                }
                break;
            case 56 :
                // InternalRos1Lexer.g:1:538: Int16
                {
                mInt16(); 

                }
                break;
            case 57 :
                // InternalRos1Lexer.g:1:544: Int32
                {
                mInt32(); 

                }
                break;
            case 58 :
                // InternalRos1Lexer.g:1:550: Int64
                {
                mInt64(); 

                }
                break;
            case 59 :
                // InternalRos1Lexer.g:1:556: Msgs
                {
                mMsgs(); 

                }
                break;
            case 60 :
                // InternalRos1Lexer.g:1:561: Node_1
                {
                mNode_1(); 

                }
                break;
            case 61 :
                // InternalRos1Lexer.g:1:568: Srvs
                {
                mSrvs(); 

                }
                break;
            case 62 :
                // InternalRos1Lexer.g:1:573: Type_1
                {
                mType_1(); 

                }
                break;
            case 63 :
                // InternalRos1Lexer.g:1:580: Uint8
                {
                mUint8(); 

                }
                break;
            case 64 :
                // InternalRos1Lexer.g:1:586: Value
                {
                mValue(); 

                }
                break;
            case 65 :
                // InternalRos1Lexer.g:1:592: Date
                {
                mDate(); 

                }
                break;
            case 66 :
                // InternalRos1Lexer.g:1:597: List
                {
                mList(); 

                }
                break;
            case 67 :
                // InternalRos1Lexer.g:1:602: Bool
                {
                mBool(); 

                }
                break;
            case 68 :
                // InternalRos1Lexer.g:1:607: Byte
                {
                mByte(); 

                }
                break;
            case 69 :
                // InternalRos1Lexer.g:1:612: Char
                {
                mChar(); 

                }
                break;
            case 70 :
                // InternalRos1Lexer.g:1:617: Goal
                {
                mGoal(); 

                }
                break;
            case 71 :
                // InternalRos1Lexer.g:1:622: Int8
                {
                mInt8(); 

                }
                break;
            case 72 :
                // InternalRos1Lexer.g:1:627: Name
                {
                mName(); 

                }
                break;
            case 73 :
                // InternalRos1Lexer.g:1:632: Node
                {
                mNode(); 

                }
                break;
            case 74 :
                // InternalRos1Lexer.g:1:637: Time
                {
                mTime(); 

                }
                break;
            case 75 :
                // InternalRos1Lexer.g:1:642: Type
                {
                mType(); 

                }
                break;
            case 76 :
                // InternalRos1Lexer.g:1:647: Any
                {
                mAny(); 

                }
                break;
            case 77 :
                // InternalRos1Lexer.g:1:651: Ns
                {
                mNs(); 

                }
                break;
            case 78 :
                // InternalRos1Lexer.g:1:654: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 79 :
                // InternalRos1Lexer.g:1:690: Comma
                {
                mComma(); 

                }
                break;
            case 80 :
                // InternalRos1Lexer.g:1:696: Colon
                {
                mColon(); 

                }
                break;
            case 81 :
                // InternalRos1Lexer.g:1:702: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 82 :
                // InternalRos1Lexer.g:1:720: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 83 :
                // InternalRos1Lexer.g:1:739: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 84 :
                // InternalRos1Lexer.g:1:751: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 85 :
                // InternalRos1Lexer.g:1:764: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 86 :
                // InternalRos1Lexer.g:1:776: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 87 :
                // InternalRos1Lexer.g:1:788: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 88 :
                // InternalRos1Lexer.g:1:803: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 89 :
                // InternalRos1Lexer.g:1:825: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // InternalRos1Lexer.g:1:841: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 91 :
                // InternalRos1Lexer.g:1:863: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 92 :
                // InternalRos1Lexer.g:1:889: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 93 :
                // InternalRos1Lexer.g:1:897: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 94 :
                // InternalRos1Lexer.g:1:909: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 95 :
                // InternalRos1Lexer.g:1:925: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 96 :
                // InternalRos1Lexer.g:1:933: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA12_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA12_eofS =
        "\10\uffff";
    static final String DFA12_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA12_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA12_specialS =
        "\10\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "184:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA32_eotS =
        "\1\53\1\61\31\65\1\143\3\uffff\2\151\1\uffff\1\61\1\56\1\151\1\56\1\65\2\56\1\uffff\1\56\1\uffff\1\56\2\uffff\1\65\1\61\1\uffff\1\65\1\uffff\1\65\1\uffff\54\65\10\uffff\3\151\1\65\2\uffff\1\u00ac\2\uffff\1\u00ac\4\uffff\37\65\1\u00d1\12\65\1\uffff\5\65\1\uffff\2\151\3\uffff\37\65\1\u0107\3\65\1\uffff\1\65\1\u010c\3\65\1\u0111\1\u0113\1\u0115\1\65\1\u0118\1\u0119\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1\uffff\1\151\11\65\1\uffff\10\65\1\u011d\10\65\1\u013c\3\65\1\u0141\1\u0143\1\u0145\2\uffff\1\65\1\uffff\2\65\1\uffff\3\65\6\uffff\1\u014d\12\uffff\10\65\1\u0157\1\u015a\13\65\1\u0166\1\65\1\u0169\1\u016b\1\u016d\2\uffff\1\65\1\u016f\1\65\6\uffff\1\65\1\uffff\1\u0172\1\u0173\1\u0174\1\u0175\2\uffff\6\65\1\u017e\1\65\2\uffff\2\65\1\uffff\5\65\1\u0189\1\u018b\4\65\1\uffff\1\u0190\6\uffff\1\u0191\1\uffff\1\u0192\1\u0193\4\uffff\10\65\1\uffff\3\65\1\uffff\2\65\1\uffff\1\u01a1\1\65\4\uffff\1\u01a3\2\65\1\u01a6\4\uffff\5\65\1\u01ac\7\65\1\uffff\1\65\1\uffff\2\65\1\uffff\5\65\1\uffff\5\65\1\uffff\20\65\2\uffff\3\65\1\u01d4\3\65\1\uffff\3\65\1\uffff\3\65\1\uffff\5\65\1\uffff\6\65\2\uffff\3\65\1\u01ec\2\uffff\2\65\1\u01ef\1\uffff\1\65\1\u01f1\1\uffff\1\u01f2\2\uffff";
    static final String DFA32_eofS =
        "\u01f3\uffff";
    static final String DFA32_minS =
        "\1\0\32\57\1\135\3\uffff\2\56\1\uffff\1\57\2\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\2\57\1\uffff\1\57\1\uffff\1\57\1\uffff\54\57\6\uffff\1\56\1\uffff\3\56\1\57\2\0\1\57\2\0\1\57\4\uffff\52\57\1\uffff\5\57\3\56\1\0\1\uffff\1\0\43\57\1\uffff\20\57\2\55\11\57\1\uffff\30\57\2\uffff\1\57\1\uffff\2\57\1\uffff\3\57\6\uffff\1\57\12\uffff\32\57\2\uffff\3\57\6\uffff\1\57\1\uffff\4\57\2\uffff\10\57\2\uffff\2\57\1\uffff\13\57\1\uffff\1\57\6\uffff\1\57\1\uffff\2\57\4\uffff\10\57\1\uffff\3\57\1\uffff\2\57\1\uffff\2\57\4\uffff\4\57\4\uffff\15\57\1\uffff\1\57\1\uffff\2\57\1\uffff\5\57\1\uffff\5\57\1\uffff\20\57\2\uffff\7\57\1\uffff\3\57\1\uffff\3\57\1\uffff\5\57\1\uffff\6\57\2\uffff\4\57\2\uffff\3\57\1\uffff\2\57\1\uffff\1\57\2\uffff";
    static final String DFA32_maxS =
        "\1\uffff\32\172\1\135\3\uffff\2\145\1\uffff\1\172\2\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\54\172\6\uffff\1\145\1\uffff\3\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\52\172\1\uffff\5\172\3\145\1\uffff\1\uffff\1\uffff\43\172\1\uffff\20\172\2\145\11\172\1\uffff\30\172\2\uffff\1\172\1\uffff\2\172\1\uffff\3\172\6\uffff\1\172\12\uffff\32\172\2\uffff\3\172\6\uffff\1\172\1\uffff\4\172\2\uffff\10\172\2\uffff\2\172\1\uffff\13\172\1\uffff\1\172\6\uffff\1\172\1\uffff\2\172\4\uffff\10\172\1\uffff\3\172\1\uffff\2\172\1\uffff\2\172\4\uffff\4\172\4\uffff\15\172\1\uffff\1\172\1\uffff\2\172\1\uffff\5\172\1\uffff\5\172\1\uffff\20\172\2\uffff\7\172\1\uffff\3\172\1\uffff\3\172\1\uffff\5\172\1\uffff\6\172\2\uffff\4\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA32_acceptS =
        "\34\uffff\1\117\1\120\1\122\2\uffff\1\125\7\uffff\1\131\1\uffff\1\132\1\uffff\1\137\1\140\2\uffff\1\125\1\uffff\1\130\1\uffff\1\134\54\uffff\1\116\1\121\1\117\1\120\1\122\1\123\1\uffff\1\126\12\uffff\1\131\1\136\1\133\1\137\52\uffff\1\115\11\uffff\1\135\44\uffff\1\114\33\uffff\1\75\30\uffff\1\61\1\107\1\uffff\1\73\2\uffff\1\101\3\uffff\1\56\1\103\1\57\1\104\1\60\1\105\1\uffff\1\74\1\111\1\110\1\76\1\113\1\112\1\124\1\102\1\106\1\127\32\uffff\1\46\1\77\3\uffff\1\40\1\70\1\41\1\71\1\42\1\72\1\uffff\1\47\4\uffff\1\67\1\100\10\uffff\1\30\1\63\2\uffff\1\55\13\uffff\1\62\1\uffff\1\31\1\64\1\32\1\65\1\33\1\66\1\uffff\1\50\2\uffff\1\51\1\52\1\53\1\54\10\uffff\1\45\3\uffff\1\23\2\uffff\1\24\2\uffff\1\21\1\36\1\22\1\37\4\uffff\1\44\1\34\1\35\1\43\15\uffff\1\25\1\uffff\1\26\2\uffff\1\27\5\uffff\1\20\5\uffff\1\17\20\uffff\1\15\1\16\7\uffff\1\14\3\uffff\1\13\3\uffff\1\12\5\uffff\1\11\6\uffff\1\7\1\10\4\uffff\1\5\1\6\3\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\1\0\46\uffff\1\2\1\10\105\uffff\1\5\1\3\1\uffff\1\7\1\6\70\uffff\1\1\1\uffff\1\4\u0145\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\56\1\47\1\51\3\56\1\50\4\56\1\34\1\43\1\41\1\52\1\37\2\40\7\44\1\35\6\56\1\20\1\14\1\46\1\21\1\1\1\46\1\4\1\22\1\15\2\46\1\31\3\46\1\3\1\46\1\2\1\23\7\46\1\33\1\56\1\36\1\45\1\46\1\56\1\6\1\24\1\25\1\7\1\42\1\10\1\32\1\46\1\16\3\46\1\17\1\27\1\46\1\11\1\46\1\12\1\5\1\30\1\13\1\26\4\46\3\56\1\54\uff81\56",
            "\1\53\12\60\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\27\62\1\57\2\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\64\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\67\20\62\1\66\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\70\5\62\1\71\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\72\14\62\1\75\1\62\1\74\1\73\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\76\16\62\1\77\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\100\17\62\1\101\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\105\3\62\1\104\6\62\1\103\5\62\1\102\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\106\23\62\1\107\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\110\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\111\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\113\15\62\1\112\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\114\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\115\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\116\15\62\1\117\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\121\3\62\1\120\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\123\15\62\1\122\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\124\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\125\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\126\11\62\1\127\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\130\22\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\131\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\133\15\62\1\132\3\62\1\134\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\136\10\62\1\137\6\62\1\135\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\140\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\141\13\62",
            "\1\142",
            "",
            "",
            "",
            "\1\61\1\uffff\12\150\10\uffff\1\147\2\uffff\1\61\34\uffff\1\147\2\uffff\1\61",
            "\1\61\1\uffff\12\152\13\uffff\1\61\37\uffff\1\61",
            "",
            "\1\53\12\60\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\61\1\uffff\12\153\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\154\13\uffff\1\61\37\uffff\1\61",
            "\32\155\4\uffff\1\155\1\uffff\32\155",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\42\157\1\160\71\157\1\156\uffa3\157",
            "\47\162\1\163\64\162\1\161\uffa3\162",
            "",
            "\1\166\4\uffff\1\166\2\uffff\1\165\26\uffff\32\53\3\uffff\2\53\1\uffff\32\53",
            "",
            "\1\166\4\uffff\1\166",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\170\6\62",
            "\1\53\12\60\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\171\16\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\172\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\173\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\174\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\175\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\176\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\177\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0080\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u0081\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0082\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0083\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0085\11\62\1\u0084\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0086\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0087\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0088\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0089\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u008a\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u008b\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u008c\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\20\62\1\u008e\1\62\1\u008d\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u008f\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0090\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0091\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0092\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0093\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0094\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0095\23\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0096\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u0097\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0098\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0099\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u009a\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u009b\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u009c\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u009d\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u009e\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u009f\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00a0\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00a1\15\62",
            "\1\53\12\62\1\u00a2\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00a3\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00a4\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00a5\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00a6\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00a7\31\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61\1\uffff\12\u00a8\13\uffff\1\61\37\uffff\1\61",
            "",
            "\1\61\1\uffff\12\u00a9\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\u00aa\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\154\13\uffff\1\61\37\uffff\1\61",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\0\u00ab",
            "\42\157\1\160\71\157\1\156\uffa3\157",
            "\1\166\15\uffff\1\63",
            "\0\u00ad",
            "\47\162\1\163\64\162\1\161\uffa3\162",
            "\1\166\15\uffff\1\63",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00ae\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00af\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u00b0\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00b1\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00b2\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00b3\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u00b4\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00b5\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00b6\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00b7\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00b8\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00b9\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00ba\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00bb\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00bc\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00bd\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00be\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00bf\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00c0\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00c1\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00c2\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00c3\4\62\1\u00c4\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00c5\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00c6\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00c7\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c8\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c9\25\62",
            "\1\53\1\62\1\u00ca\1\62\1\u00cb\2\62\1\u00cc\1\62\1\u00cd\1\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00ce\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00cf\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00d0\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00d2\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d3\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00d4\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00d5\13\62\1\u00d6\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00d7\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d8\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00d9\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00da\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00db\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00dc\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00dd\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00de\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00df\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00e0\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00e1\16\62",
            "\1\61\1\uffff\12\u00e2\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\u00e3\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\u00aa\13\uffff\1\61\37\uffff\1\61",
            "\42\157\1\160\71\157\1\156\uffa3\157",
            "",
            "\47\162\1\163\64\162\1\161\uffa3\162",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00e4\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00e5\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00e6\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00e7\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00e8\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u00e9\22\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00ea\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00eb\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00ec\14\62",
            "\1\53\12\62\1\u00ed\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00ee\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00ef\24\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00f0\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00f1\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00f2\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\6\62\1\u00f3\23\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00f4\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00f5\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00f6\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00f7\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00f8\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00f9\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00fa\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00fb\25\62",
            "\1\53\1\62\1\u00fc\1\62\1\u00fd\2\62\1\u00fe\1\62\1\u00ff\1\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0100\25\62",
            "\1\53\6\62\1\u0101\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0102\23\62",
            "\1\53\6\62\1\u0103\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\2\62\1\u0104\7\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\4\62\1\u0105\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0106\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0108\31\62",
            "\1\53\12\62\1\u0109\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u010a\1\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u010b\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u010d\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u010e\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u010f\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0110\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0112\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0114\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0116\25\62",
            "\1\53\12\62\1\u0117\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u011a\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0120\1\61\1\uffff\12\61\13\uffff\1\61\37\uffff\1\61",
            "\1\u0120\1\61\1\uffff\12\154\13\uffff\1\61\37\uffff\1\61",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0121\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0122\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0123\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0124\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0125\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u0126\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0127\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0128\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0129\23\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u012a\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u012b\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u012c\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u012d\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u012e\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u012f\21\62",
            "\1\53\3\62\1\u0130\2\62\1\u0131\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0132\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0133\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0134\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0135\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0136\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0137\7\62",
            "\1\53\6\62\1\u0138\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\2\62\1\u0139\7\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\4\62\1\u013a\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u013b\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u013d\31\62",
            "\1\53\4\62\1\u013e\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u013f\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0140\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0142\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0144\3\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0146\23\62",
            "",
            "\1\53\12\62\1\u0147\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0148\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0149\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u014a\23\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u014b\6\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\62\1\u014c\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
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
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u014e\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u014f\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0150\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0151\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u0152\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0153\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0154\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0155\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0156\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0158\17\62\1\u0159\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u015b\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u015c\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u015d\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u015e\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u015f\6\62",
            "\1\53\2\62\1\u0160\7\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\4\62\1\u0161\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0162\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0163\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u0164\22\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0165\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0167\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0168\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u016a\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u016c\3\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u016e\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0170\10\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0171\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0176\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0177\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u0178\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0179\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u017a\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u017b\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u017c\17\62\1\u017d\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u017f\30\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0180\16\62",
            "\1\53\12\62\1\u0182\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0181\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0183\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0184\14\62",
            "\1\53\12\62\1\u0185\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0186\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\21\62\1\u0187\10\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0188\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u018a\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\12\62\1\u018c\17\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u018d\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u018e\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u018f\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\3\62\1\u0194\26\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u0195\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0196\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0197\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0198\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0199\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u019a\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u019b\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u019c\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u019d\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u019e\10\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u019f\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01a0\27\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01a2\25\62",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a4\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a5\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01a7\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01a8\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01a9\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\1\u01aa\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01ab\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01ad\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01ae\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01af\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b0\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u01b1\4\62",
            "\1\53\12\62\1\u01b2\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01b3\21\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01b4\12\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01b5\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01b6\7\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01b7\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01b8\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b9\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01ba\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01bb\7\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01bc\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u01bd\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01be\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01bf\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01c0\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01c1\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01c2\13\62",
            "\1\53\12\62\1\u01c3\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u01c4\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01c5\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01c6\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01c7\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u01c8\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01c9\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01ca\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01cb\25\62",
            "\1\53\12\62\1\u01cc\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01cd\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01ce\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01cf\7\62",
            "\1\53\12\62\1\u01d0\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01d1\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01d2\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01d3\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01d5\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01d6\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01d7\10\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01d8\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01d9\7\62",
            "\1\53\12\62\1\u01da\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u01db\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01dc\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01dd\31\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01de\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01df\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01e0\7\62",
            "\1\53\12\62\1\u01e1\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u01e2\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01e3\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01e4\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01e5\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01e6\25\62",
            "\1\53\12\62\1\u01e7\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u01e8\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01e9\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01ea\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01eb\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01ed\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01ee\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u01f0\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | Artifacts | GraphName | Float32_1 | Float64_1 | Actions | Default | Duration | Feedback | Response | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Request | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Msgs | Node_1 | Srvs | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='E') ) {s = 1;}

                        else if ( (LA32_0=='R') ) {s = 2;}

                        else if ( (LA32_0=='P') ) {s = 3;}

                        else if ( (LA32_0=='G') ) {s = 4;}

                        else if ( (LA32_0=='s') ) {s = 5;}

                        else if ( (LA32_0=='a') ) {s = 6;}

                        else if ( (LA32_0=='d') ) {s = 7;}

                        else if ( (LA32_0=='f') ) {s = 8;}

                        else if ( (LA32_0=='p') ) {s = 9;}

                        else if ( (LA32_0=='r') ) {s = 10;}

                        else if ( (LA32_0=='u') ) {s = 11;}

                        else if ( (LA32_0=='B') ) {s = 12;}

                        else if ( (LA32_0=='I') ) {s = 13;}

                        else if ( (LA32_0=='i') ) {s = 14;}

                        else if ( (LA32_0=='m') ) {s = 15;}

                        else if ( (LA32_0=='A') ) {s = 16;}

                        else if ( (LA32_0=='D') ) {s = 17;}

                        else if ( (LA32_0=='H') ) {s = 18;}

                        else if ( (LA32_0=='S') ) {s = 19;}

                        else if ( (LA32_0=='b') ) {s = 20;}

                        else if ( (LA32_0=='c') ) {s = 21;}

                        else if ( (LA32_0=='v') ) {s = 22;}

                        else if ( (LA32_0=='n') ) {s = 23;}

                        else if ( (LA32_0=='t') ) {s = 24;}

                        else if ( (LA32_0=='L') ) {s = 25;}

                        else if ( (LA32_0=='g') ) {s = 26;}

                        else if ( (LA32_0=='[') ) {s = 27;}

                        else if ( (LA32_0==',') ) {s = 28;}

                        else if ( (LA32_0==':') ) {s = 29;}

                        else if ( (LA32_0==']') ) {s = 30;}

                        else if ( (LA32_0=='0') ) {s = 31;}

                        else if ( ((LA32_0>='1' && LA32_0<='2')) ) {s = 32;}

                        else if ( (LA32_0=='.') ) {s = 33;}

                        else if ( (LA32_0=='e') ) {s = 34;}

                        else if ( (LA32_0=='-') ) {s = 35;}

                        else if ( ((LA32_0>='3' && LA32_0<='9')) ) {s = 36;}

                        else if ( (LA32_0=='^') ) {s = 37;}

                        else if ( (LA32_0=='C'||LA32_0=='F'||(LA32_0>='J' && LA32_0<='K')||(LA32_0>='M' && LA32_0<='O')||LA32_0=='Q'||(LA32_0>='T' && LA32_0<='Z')||LA32_0=='_'||LA32_0=='h'||(LA32_0>='j' && LA32_0<='l')||LA32_0=='o'||LA32_0=='q'||(LA32_0>='w' && LA32_0<='z')) ) {s = 38;}

                        else if ( (LA32_0=='\"') ) {s = 39;}

                        else if ( (LA32_0=='\'') ) {s = 40;}

                        else if ( (LA32_0=='#') ) {s = 41;}

                        else if ( (LA32_0=='/') ) {s = 42;}

                        else if ( (LA32_0=='~') ) {s = 44;}

                        else if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {s = 45;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\b')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='!'||(LA32_0>='$' && LA32_0<='&')||(LA32_0>='(' && LA32_0<='+')||(LA32_0>=';' && LA32_0<='@')||LA32_0=='\\'||LA32_0=='`'||(LA32_0>='{' && LA32_0<='}')||(LA32_0>='\u007F' && LA32_0<='\uFFFF')) ) {s = 46;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_171 = input.LA(1);

                        s = -1;
                        if ( (LA32_171=='\"') ) {s = 112;}

                        else if ( (LA32_171=='\\') ) {s = 110;}

                        else if ( ((LA32_171>='\u0000' && LA32_171<='!')||(LA32_171>='#' && LA32_171<='[')||(LA32_171>=']' && LA32_171<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_39 = input.LA(1);

                        s = -1;
                        if ( (LA32_39=='\\') ) {s = 110;}

                        else if ( ((LA32_39>='\u0000' && LA32_39<='!')||(LA32_39>='#' && LA32_39<='[')||(LA32_39>=']' && LA32_39<='\uFFFF')) ) {s = 111;}

                        else if ( (LA32_39=='\"') ) {s = 112;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_111 = input.LA(1);

                        s = -1;
                        if ( (LA32_111=='\"') ) {s = 112;}

                        else if ( (LA32_111=='\\') ) {s = 110;}

                        else if ( ((LA32_111>='\u0000' && LA32_111<='!')||(LA32_111>='#' && LA32_111<='[')||(LA32_111>=']' && LA32_111<='\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_173 = input.LA(1);

                        s = -1;
                        if ( (LA32_173=='\'') ) {s = 115;}

                        else if ( (LA32_173=='\\') ) {s = 113;}

                        else if ( ((LA32_173>='\u0000' && LA32_173<='&')||(LA32_173>='(' && LA32_173<='[')||(LA32_173>=']' && LA32_173<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_110 = input.LA(1);

                        s = -1;
                        if ( ((LA32_110>='\u0000' && LA32_110<='\uFFFF')) ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_114 = input.LA(1);

                        s = -1;
                        if ( (LA32_114=='\'') ) {s = 115;}

                        else if ( (LA32_114=='\\') ) {s = 113;}

                        else if ( ((LA32_114>='\u0000' && LA32_114<='&')||(LA32_114>='(' && LA32_114<='[')||(LA32_114>=']' && LA32_114<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_113 = input.LA(1);

                        s = -1;
                        if ( ((LA32_113>='\u0000' && LA32_113<='\uFFFF')) ) {s = 173;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_40 = input.LA(1);

                        s = -1;
                        if ( (LA32_40=='\\') ) {s = 113;}

                        else if ( ((LA32_40>='\u0000' && LA32_40<='&')||(LA32_40>='(' && LA32_40<='[')||(LA32_40>=']' && LA32_40<='\uFFFF')) ) {s = 114;}

                        else if ( (LA32_40=='\'') ) {s = 115;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}