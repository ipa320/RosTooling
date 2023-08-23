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
    public static final int Float32_1=19;
    public static final int Node=75;
    public static final int RULE_DATE_TIME=95;
    public static final int Uint64_1=29;
    public static final int Serviceclients=8;
    public static final int String=45;
    public static final int Int16=58;
    public static final int Float32=32;
    public static final int Goal=72;
    public static final int Actionservers=11;
    public static final int Bool=69;
    public static final int Msgs=61;
    public static final int Uint16=54;
    public static final int Boolean=30;
    public static final int ExternalDependency=4;
    public static final int Uint8=65;
    public static final int Parameters=16;
    public static final int RULE_ID=96;
    public static final int Actions=21;
    public static final int RULE_DIGIT=85;
    public static final int GlobalNamespace=7;
    public static final int Node_1=62;
    public static final int Int16_1=34;
    public static final int Header=44;
    public static final int RULE_INT=98;
    public static final int Byte=70;
    public static final int RULE_ML_COMMENT=105;
    public static final int LeftSquareBracket=83;
    public static final int Base64=42;
    public static final int Comma=81;
    public static final int RULE_MESSAGE_ASIGMENT=99;
    public static final int LeftSquareBracketRightSquareBracket=80;
    public static final int Int32=59;
    public static final int Char=71;
    public static final int Publishers=17;
    public static final int Srvs=63;
    public static final int RULE_DECINT=88;
    public static final int Uint32=55;
    public static final int FromGitRepo=14;
    public static final int RULE_HOUR=93;
    public static final int Int8=73;
    public static final int Default=22;
    public static final int Int8_1=51;
    public static final int Uint16_1=27;
    public static final int Type=77;
    public static final int Float64=33;
    public static final int Int32_1=35;
    public static final int RULE_BINARY=86;
    public static final int String_1=53;
    public static final int Subscribers=15;
    public static final int String_2=26;
    public static final int Actionclients=10;
    public static final int RULE_DAY=90;
    public static final int RULE_BEGIN=100;
    public static final int RULE_BOOLEAN=87;
    public static final int RelativeNamespace=5;
    public static final int Serviceservers=9;
    public static final int RULE_YEAR=92;
    public static final int Result=52;
    public static final int Name=74;
    public static final int RULE_MIN_SEC=94;
    public static final int Char_1=50;
    public static final int ParameterAny=13;
    public static final int List=68;
    public static final int Dependencies=12;
    public static final int RightSquareBracket=84;
    public static final int PrivateNamespace=6;
    public static final int GraphName=18;
    public static final int Byte_1=49;
    public static final int Float64_1=20;
    public static final int Duration=23;
    public static final int Uint32_1=28;
    public static final int Double=43;
    public static final int Type_1=64;
    public static final int Value=66;
    public static final int Uint64=56;
    public static final int Action=47;
    public static final int RULE_END=101;
    public static final int Message=37;
    public static final int Value_1=57;
    public static final int Time=76;
    public static final int RULE_STRING=97;
    public static final int Bool_1=48;
    public static final int Any=78;
    public static final int Struct=46;
    public static final int RULE_SL_COMMENT=102;
    public static final int Uint8_1=40;
    public static final int RULE_DOUBLE=89;
    public static final int Feedback=24;
    public static final int RULE_ROS_CONVENTION_A=103;
    public static final int RULE_ROS_CONVENTION_PARAM=104;
    public static final int Colon=82;
    public static final int EOF=-1;
    public static final int Ns=79;
    public static final int RULE_WS=106;
    public static final int Int64_1=36;
    public static final int Request=38;
    public static final int Service=39;
    public static final int RULE_ANY_OTHER=107;
    public static final int Date=67;
    public static final int Response=25;
    public static final int Integer=31;
    public static final int Array=41;
    public static final int Int64=60;
    public static final int RULE_MONTH=91;

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

    // $ANTLR start "ExternalDependency"
    public final void mExternalDependency() throws RecognitionException {
        try {
            int _type = ExternalDependency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosLexer.g:14:20: ( 'ExternalDependency' )
            // InternalRosLexer.g:14:22: 'ExternalDependency'
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
            // InternalRosLexer.g:16:19: ( 'RelativeNamespace' )
            // InternalRosLexer.g:16:21: 'RelativeNamespace'
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
            // InternalRosLexer.g:18:18: ( 'PrivateNamespace' )
            // InternalRosLexer.g:18:20: 'PrivateNamespace'
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
            // InternalRosLexer.g:20:17: ( 'GlobalNamespace' )
            // InternalRosLexer.g:20:19: 'GlobalNamespace'
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
            // InternalRosLexer.g:22:16: ( 'serviceclients:' )
            // InternalRosLexer.g:22:18: 'serviceclients:'
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
            // InternalRosLexer.g:24:16: ( 'serviceservers:' )
            // InternalRosLexer.g:24:18: 'serviceservers:'
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
            // InternalRosLexer.g:26:15: ( 'actionclients:' )
            // InternalRosLexer.g:26:17: 'actionclients:'
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
            // InternalRosLexer.g:28:15: ( 'actionservers:' )
            // InternalRosLexer.g:28:17: 'actionservers:'
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
            // InternalRosLexer.g:30:14: ( 'dependencies:' )
            // InternalRosLexer.g:30:16: 'dependencies:'
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
            // InternalRosLexer.g:32:14: ( 'ParameterAny' )
            // InternalRosLexer.g:32:16: 'ParameterAny'
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
            // InternalRosLexer.g:34:13: ( 'fromGitRepo:' )
            // InternalRosLexer.g:34:15: 'fromGitRepo:'
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
            // InternalRosLexer.g:36:13: ( 'subscribers:' )
            // InternalRosLexer.g:36:15: 'subscribers:'
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
            // InternalRosLexer.g:38:12: ( 'parameters:' )
            // InternalRosLexer.g:38:14: 'parameters:'
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
            // InternalRosLexer.g:40:12: ( 'publishers:' )
            // InternalRosLexer.g:40:14: 'publishers:'
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
            // InternalRosLexer.g:42:11: ( 'GraphName' )
            // InternalRosLexer.g:42:13: 'GraphName'
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
            // InternalRosLexer.g:44:11: ( 'float32[]' )
            // InternalRosLexer.g:44:13: 'float32[]'
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
            // InternalRosLexer.g:46:11: ( 'float64[]' )
            // InternalRosLexer.g:46:13: 'float64[]'
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
            // InternalRosLexer.g:48:9: ( 'actions:' )
            // InternalRosLexer.g:48:11: 'actions:'
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
            // InternalRosLexer.g:50:9: ( 'default:' )
            // InternalRosLexer.g:50:11: 'default:'
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
            // InternalRosLexer.g:52:10: ( 'duration' )
            // InternalRosLexer.g:52:12: 'duration'
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
            // InternalRosLexer.g:54:10: ( 'feedback' )
            // InternalRosLexer.g:54:12: 'feedback'
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
            // InternalRosLexer.g:56:10: ( 'response' )
            // InternalRosLexer.g:56:12: 'response'
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
            // InternalRosLexer.g:58:10: ( 'string[]' )
            // InternalRosLexer.g:58:12: 'string[]'
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
            // InternalRosLexer.g:60:10: ( 'uint16[]' )
            // InternalRosLexer.g:60:12: 'uint16[]'
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
            // InternalRosLexer.g:62:10: ( 'uint32[]' )
            // InternalRosLexer.g:62:12: 'uint32[]'
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
            // InternalRosLexer.g:64:10: ( 'uint64[]' )
            // InternalRosLexer.g:64:12: 'uint64[]'
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
            // InternalRosLexer.g:66:9: ( 'Boolean' )
            // InternalRosLexer.g:66:11: 'Boolean'
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
            // InternalRosLexer.g:68:9: ( 'Integer' )
            // InternalRosLexer.g:68:11: 'Integer'
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
            // InternalRosLexer.g:70:9: ( 'float32' )
            // InternalRosLexer.g:70:11: 'float32'
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
            // InternalRosLexer.g:72:9: ( 'float64' )
            // InternalRosLexer.g:72:11: 'float64'
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
            // InternalRosLexer.g:74:9: ( 'int16[]' )
            // InternalRosLexer.g:74:11: 'int16[]'
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
            // InternalRosLexer.g:76:9: ( 'int32[]' )
            // InternalRosLexer.g:76:11: 'int32[]'
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
            // InternalRosLexer.g:78:9: ( 'int64[]' )
            // InternalRosLexer.g:78:11: 'int64[]'
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
            // InternalRosLexer.g:80:9: ( 'message' )
            // InternalRosLexer.g:80:11: 'message'
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
            // InternalRosLexer.g:82:9: ( 'request' )
            // InternalRosLexer.g:82:11: 'request'
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
            // InternalRosLexer.g:84:9: ( 'service' )
            // InternalRosLexer.g:84:11: 'service'
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
            // InternalRosLexer.g:86:9: ( 'uint8[]' )
            // InternalRosLexer.g:86:11: 'uint8[]'
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
            // InternalRosLexer.g:88:7: ( 'Array:' )
            // InternalRosLexer.g:88:9: 'Array:'
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
            // InternalRosLexer.g:90:8: ( 'Base64' )
            // InternalRosLexer.g:90:10: 'Base64'
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
            // InternalRosLexer.g:92:8: ( 'Double' )
            // InternalRosLexer.g:92:10: 'Double'
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
            // InternalRosLexer.g:94:8: ( 'Header' )
            // InternalRosLexer.g:94:10: 'Header'
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
            // InternalRosLexer.g:96:8: ( 'String' )
            // InternalRosLexer.g:96:10: 'String'
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
            // InternalRosLexer.g:98:8: ( 'Struct' )
            // InternalRosLexer.g:98:10: 'Struct'
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
            // InternalRosLexer.g:100:8: ( 'action' )
            // InternalRosLexer.g:100:10: 'action'
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
            // InternalRosLexer.g:102:8: ( 'bool[]' )
            // InternalRosLexer.g:102:10: 'bool[]'
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
            // InternalRosLexer.g:104:8: ( 'byte[]' )
            // InternalRosLexer.g:104:10: 'byte[]'
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
            // InternalRosLexer.g:106:8: ( 'char[]' )
            // InternalRosLexer.g:106:10: 'char[]'
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
            // InternalRosLexer.g:108:8: ( 'int8[]' )
            // InternalRosLexer.g:108:10: 'int8[]'
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
            // InternalRosLexer.g:110:8: ( 'result' )
            // InternalRosLexer.g:110:10: 'result'
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
            // InternalRosLexer.g:112:10: ( 'string' )
            // InternalRosLexer.g:112:12: 'string'
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
            // InternalRosLexer.g:114:8: ( 'uint16' )
            // InternalRosLexer.g:114:10: 'uint16'
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
            // InternalRosLexer.g:116:8: ( 'uint32' )
            // InternalRosLexer.g:116:10: 'uint32'
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
            // InternalRosLexer.g:118:8: ( 'uint64' )
            // InternalRosLexer.g:118:10: 'uint64'
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
            // InternalRosLexer.g:120:9: ( 'value:' )
            // InternalRosLexer.g:120:11: 'value:'
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
            // InternalRosLexer.g:122:7: ( 'int16' )
            // InternalRosLexer.g:122:9: 'int16'
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
            // InternalRosLexer.g:124:7: ( 'int32' )
            // InternalRosLexer.g:124:9: 'int32'
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
            // InternalRosLexer.g:126:7: ( 'int64' )
            // InternalRosLexer.g:126:9: 'int64'
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
            // InternalRosLexer.g:128:6: ( 'msgs:' )
            // InternalRosLexer.g:128:8: 'msgs:'
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
            // InternalRosLexer.g:130:8: ( 'node:' )
            // InternalRosLexer.g:130:10: 'node:'
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
            // InternalRosLexer.g:132:6: ( 'srvs:' )
            // InternalRosLexer.g:132:8: 'srvs:'
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
            // InternalRosLexer.g:134:8: ( 'type:' )
            // InternalRosLexer.g:134:10: 'type:'
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
            // InternalRosLexer.g:136:7: ( 'uint8' )
            // InternalRosLexer.g:136:9: 'uint8'
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
            // InternalRosLexer.g:138:7: ( 'value' )
            // InternalRosLexer.g:138:9: 'value'
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
            // InternalRosLexer.g:140:6: ( 'Date' )
            // InternalRosLexer.g:140:8: 'Date'
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
            // InternalRosLexer.g:142:6: ( 'List' )
            // InternalRosLexer.g:142:8: 'List'
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
            // InternalRosLexer.g:144:6: ( 'bool' )
            // InternalRosLexer.g:144:8: 'bool'
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
            // InternalRosLexer.g:146:6: ( 'byte' )
            // InternalRosLexer.g:146:8: 'byte'
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
            // InternalRosLexer.g:148:6: ( 'char' )
            // InternalRosLexer.g:148:8: 'char'
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
            // InternalRosLexer.g:150:6: ( 'goal' )
            // InternalRosLexer.g:150:8: 'goal'
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
            // InternalRosLexer.g:152:6: ( 'int8' )
            // InternalRosLexer.g:152:8: 'int8'
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
            // InternalRosLexer.g:154:6: ( 'name' )
            // InternalRosLexer.g:154:8: 'name'
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
            // InternalRosLexer.g:156:6: ( 'node' )
            // InternalRosLexer.g:156:8: 'node'
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
            // InternalRosLexer.g:158:6: ( 'time' )
            // InternalRosLexer.g:158:8: 'time'
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
            // InternalRosLexer.g:160:6: ( 'type' )
            // InternalRosLexer.g:160:8: 'type'
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
            // InternalRosLexer.g:162:5: ( 'Any' )
            // InternalRosLexer.g:162:7: 'Any'
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
            // InternalRosLexer.g:164:4: ( 'ns:' )
            // InternalRosLexer.g:164:6: 'ns:'
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
            // InternalRosLexer.g:166:37: ( '[]' )
            // InternalRosLexer.g:166:39: '[]'
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
            // InternalRosLexer.g:168:7: ( ',' )
            // InternalRosLexer.g:168:9: ','
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
            // InternalRosLexer.g:170:7: ( ':' )
            // InternalRosLexer.g:170:9: ':'
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
            // InternalRosLexer.g:172:19: ( '[' )
            // InternalRosLexer.g:172:21: '['
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
            // InternalRosLexer.g:174:20: ( ']' )
            // InternalRosLexer.g:174:22: ']'
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
            // InternalRosLexer.g:176:21: ( '0' .. '9' )
            // InternalRosLexer.g:176:23: '0' .. '9'
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
            // InternalRosLexer.g:178:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosLexer.g:178:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosLexer.g:178:15: ( '0b' | '0B' )
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
                    // InternalRosLexer.g:178:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:178:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosLexer.g:178:27: ( '0' | '1' )+
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
            // InternalRosLexer.g:180:14: ( ( 'true' | 'false' ) )
            // InternalRosLexer.g:180:16: ( 'true' | 'false' )
            {
            // InternalRosLexer.g:180:16: ( 'true' | 'false' )
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
                    // InternalRosLexer.g:180:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:180:24: 'false'
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
            // InternalRosLexer.g:182:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalRosLexer.g:182:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalRosLexer.g:182:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
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
                    // InternalRosLexer.g:182:16: ( RULE_DIGIT )*
                    {
                    // InternalRosLexer.g:182:16: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosLexer.g:182:16: RULE_DIGIT
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
                    // InternalRosLexer.g:182:28: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalRosLexer.g:182:32: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRosLexer.g:182:32: RULE_DIGIT
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

            // InternalRosLexer.g:182:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalRosLexer.g:182:46: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRosLexer.g:182:50: ( RULE_DECINT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRosLexer.g:182:50: RULE_DECINT
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
                    // InternalRosLexer.g:182:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalRosLexer.g:182:63: ( '.' ( RULE_DIGIT )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRosLexer.g:182:64: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosLexer.g:182:68: ( RULE_DIGIT )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalRosLexer.g:182:68: RULE_DIGIT
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

                    // InternalRosLexer.g:182:92: ( '-' | '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
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

                    // InternalRosLexer.g:182:103: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRosLexer.g:182:103: RULE_DIGIT
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
            // InternalRosLexer.g:184:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosLexer.g:184:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosLexer.g:184:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosLexer.g:184:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:184:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosLexer.g:184:29: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRosLexer.g:184:29: RULE_DIGIT
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
                    // InternalRosLexer.g:184:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosLexer.g:184:54: ( RULE_DIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRosLexer.g:184:54: RULE_DIGIT
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
            // InternalRosLexer.g:186:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosLexer.g:186:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosLexer.g:186:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosLexer.g:186:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:186:31: '1' .. '3' '0' .. '9'
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
            // InternalRosLexer.g:188:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosLexer.g:188:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosLexer.g:188:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosLexer.g:188:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:188:33: '1' '0' .. '2'
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
            // InternalRosLexer.g:190:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosLexer.g:190:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosLexer.g:192:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosLexer.g:192:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosLexer.g:192:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosLexer.g:192:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:192:41: '2' '0' .. '3'
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
            // InternalRosLexer.g:194:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosLexer.g:194:25: '0' .. '5' '0' .. '9'
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
            // InternalRosLexer.g:196:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosLexer.g:196:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosLexer.g:198:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosLexer.g:198:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosLexer.g:198:25: ( RULE_ID | RULE_STRING )
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
                    // InternalRosLexer.g:198:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:198:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRosLexer.g:198:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalRosLexer.g:198:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:198:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRosLexer.g:198:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRosLexer.g:198:81: '-' RULE_INT
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
            // InternalRosLexer.g:200:21: ()
            // InternalRosLexer.g:200:23: 
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
            // InternalRosLexer.g:202:19: ()
            // InternalRosLexer.g:202:21: 
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
            // InternalRosLexer.g:204:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosLexer.g:204:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRosLexer.g:204:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosLexer.g:204:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalRosLexer.g:206:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosLexer.g:206:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosLexer.g:206:25: ( '/' RULE_ID | RULE_ID '/' )*
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
            	    // InternalRosLexer.g:206:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosLexer.g:206:38: RULE_ID '/'
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
            // InternalRosLexer.g:208:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosLexer.g:208:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosLexer.g:208:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
            	    // InternalRosLexer.g:208:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosLexer.g:208:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRosLexer.g:208:62: '~' RULE_STRING
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
            // InternalRosLexer.g:210:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosLexer.g:210:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosLexer.g:210:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosLexer.g:210:11: '^'
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

            // InternalRosLexer.g:210:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
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
            // InternalRosLexer.g:212:19: ( ( '0' .. '9' )+ )
            // InternalRosLexer.g:212:21: ( '0' .. '9' )+
            {
            // InternalRosLexer.g:212:21: ( '0' .. '9' )+
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
            	    // InternalRosLexer.g:212:22: '0' .. '9'
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
            // InternalRosLexer.g:214:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosLexer.g:214:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosLexer.g:214:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRosLexer.g:214:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosLexer.g:214:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRosLexer.g:214:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosLexer.g:214:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRosLexer.g:214:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosLexer.g:214:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRosLexer.g:214:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosLexer.g:214:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRosLexer.g:216:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosLexer.g:216:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosLexer.g:216:24: ( options {greedy=false; } : . )*
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
            	    // InternalRosLexer.g:216:52: .
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
            // InternalRosLexer.g:218:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosLexer.g:218:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosLexer.g:218:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalRosLexer.g:220:16: ( . )
            // InternalRosLexer.g:220:18: .
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
        // InternalRosLexer.g:1:8: ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | GraphName | Float32_1 | Float64_1 | Actions | Default | Duration | Feedback | Response | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Request | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Msgs | Node_1 | Srvs | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=95;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // InternalRosLexer.g:1:10: ExternalDependency
                {
                mExternalDependency(); 

                }
                break;
            case 2 :
                // InternalRosLexer.g:1:29: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 3 :
                // InternalRosLexer.g:1:47: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 4 :
                // InternalRosLexer.g:1:64: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 5 :
                // InternalRosLexer.g:1:80: Serviceclients
                {
                mServiceclients(); 

                }
                break;
            case 6 :
                // InternalRosLexer.g:1:95: Serviceservers
                {
                mServiceservers(); 

                }
                break;
            case 7 :
                // InternalRosLexer.g:1:110: Actionclients
                {
                mActionclients(); 

                }
                break;
            case 8 :
                // InternalRosLexer.g:1:124: Actionservers
                {
                mActionservers(); 

                }
                break;
            case 9 :
                // InternalRosLexer.g:1:138: Dependencies
                {
                mDependencies(); 

                }
                break;
            case 10 :
                // InternalRosLexer.g:1:151: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 11 :
                // InternalRosLexer.g:1:164: FromGitRepo
                {
                mFromGitRepo(); 

                }
                break;
            case 12 :
                // InternalRosLexer.g:1:176: Subscribers
                {
                mSubscribers(); 

                }
                break;
            case 13 :
                // InternalRosLexer.g:1:188: Parameters
                {
                mParameters(); 

                }
                break;
            case 14 :
                // InternalRosLexer.g:1:199: Publishers
                {
                mPublishers(); 

                }
                break;
            case 15 :
                // InternalRosLexer.g:1:210: GraphName
                {
                mGraphName(); 

                }
                break;
            case 16 :
                // InternalRosLexer.g:1:220: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 17 :
                // InternalRosLexer.g:1:230: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 18 :
                // InternalRosLexer.g:1:240: Actions
                {
                mActions(); 

                }
                break;
            case 19 :
                // InternalRosLexer.g:1:248: Default
                {
                mDefault(); 

                }
                break;
            case 20 :
                // InternalRosLexer.g:1:256: Duration
                {
                mDuration(); 

                }
                break;
            case 21 :
                // InternalRosLexer.g:1:265: Feedback
                {
                mFeedback(); 

                }
                break;
            case 22 :
                // InternalRosLexer.g:1:274: Response
                {
                mResponse(); 

                }
                break;
            case 23 :
                // InternalRosLexer.g:1:283: String_2
                {
                mString_2(); 

                }
                break;
            case 24 :
                // InternalRosLexer.g:1:292: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 25 :
                // InternalRosLexer.g:1:301: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 26 :
                // InternalRosLexer.g:1:310: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 27 :
                // InternalRosLexer.g:1:319: Boolean
                {
                mBoolean(); 

                }
                break;
            case 28 :
                // InternalRosLexer.g:1:327: Integer
                {
                mInteger(); 

                }
                break;
            case 29 :
                // InternalRosLexer.g:1:335: Float32
                {
                mFloat32(); 

                }
                break;
            case 30 :
                // InternalRosLexer.g:1:343: Float64
                {
                mFloat64(); 

                }
                break;
            case 31 :
                // InternalRosLexer.g:1:351: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 32 :
                // InternalRosLexer.g:1:359: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 33 :
                // InternalRosLexer.g:1:367: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 34 :
                // InternalRosLexer.g:1:375: Message
                {
                mMessage(); 

                }
                break;
            case 35 :
                // InternalRosLexer.g:1:383: Request
                {
                mRequest(); 

                }
                break;
            case 36 :
                // InternalRosLexer.g:1:391: Service
                {
                mService(); 

                }
                break;
            case 37 :
                // InternalRosLexer.g:1:399: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 38 :
                // InternalRosLexer.g:1:407: Array
                {
                mArray(); 

                }
                break;
            case 39 :
                // InternalRosLexer.g:1:413: Base64
                {
                mBase64(); 

                }
                break;
            case 40 :
                // InternalRosLexer.g:1:420: Double
                {
                mDouble(); 

                }
                break;
            case 41 :
                // InternalRosLexer.g:1:427: Header
                {
                mHeader(); 

                }
                break;
            case 42 :
                // InternalRosLexer.g:1:434: String
                {
                mString(); 

                }
                break;
            case 43 :
                // InternalRosLexer.g:1:441: Struct
                {
                mStruct(); 

                }
                break;
            case 44 :
                // InternalRosLexer.g:1:448: Action
                {
                mAction(); 

                }
                break;
            case 45 :
                // InternalRosLexer.g:1:455: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 46 :
                // InternalRosLexer.g:1:462: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 47 :
                // InternalRosLexer.g:1:469: Char_1
                {
                mChar_1(); 

                }
                break;
            case 48 :
                // InternalRosLexer.g:1:476: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 49 :
                // InternalRosLexer.g:1:483: Result
                {
                mResult(); 

                }
                break;
            case 50 :
                // InternalRosLexer.g:1:490: String_1
                {
                mString_1(); 

                }
                break;
            case 51 :
                // InternalRosLexer.g:1:499: Uint16
                {
                mUint16(); 

                }
                break;
            case 52 :
                // InternalRosLexer.g:1:506: Uint32
                {
                mUint32(); 

                }
                break;
            case 53 :
                // InternalRosLexer.g:1:513: Uint64
                {
                mUint64(); 

                }
                break;
            case 54 :
                // InternalRosLexer.g:1:520: Value_1
                {
                mValue_1(); 

                }
                break;
            case 55 :
                // InternalRosLexer.g:1:528: Int16
                {
                mInt16(); 

                }
                break;
            case 56 :
                // InternalRosLexer.g:1:534: Int32
                {
                mInt32(); 

                }
                break;
            case 57 :
                // InternalRosLexer.g:1:540: Int64
                {
                mInt64(); 

                }
                break;
            case 58 :
                // InternalRosLexer.g:1:546: Msgs
                {
                mMsgs(); 

                }
                break;
            case 59 :
                // InternalRosLexer.g:1:551: Node_1
                {
                mNode_1(); 

                }
                break;
            case 60 :
                // InternalRosLexer.g:1:558: Srvs
                {
                mSrvs(); 

                }
                break;
            case 61 :
                // InternalRosLexer.g:1:563: Type_1
                {
                mType_1(); 

                }
                break;
            case 62 :
                // InternalRosLexer.g:1:570: Uint8
                {
                mUint8(); 

                }
                break;
            case 63 :
                // InternalRosLexer.g:1:576: Value
                {
                mValue(); 

                }
                break;
            case 64 :
                // InternalRosLexer.g:1:582: Date
                {
                mDate(); 

                }
                break;
            case 65 :
                // InternalRosLexer.g:1:587: List
                {
                mList(); 

                }
                break;
            case 66 :
                // InternalRosLexer.g:1:592: Bool
                {
                mBool(); 

                }
                break;
            case 67 :
                // InternalRosLexer.g:1:597: Byte
                {
                mByte(); 

                }
                break;
            case 68 :
                // InternalRosLexer.g:1:602: Char
                {
                mChar(); 

                }
                break;
            case 69 :
                // InternalRosLexer.g:1:607: Goal
                {
                mGoal(); 

                }
                break;
            case 70 :
                // InternalRosLexer.g:1:612: Int8
                {
                mInt8(); 

                }
                break;
            case 71 :
                // InternalRosLexer.g:1:617: Name
                {
                mName(); 

                }
                break;
            case 72 :
                // InternalRosLexer.g:1:622: Node
                {
                mNode(); 

                }
                break;
            case 73 :
                // InternalRosLexer.g:1:627: Time
                {
                mTime(); 

                }
                break;
            case 74 :
                // InternalRosLexer.g:1:632: Type
                {
                mType(); 

                }
                break;
            case 75 :
                // InternalRosLexer.g:1:637: Any
                {
                mAny(); 

                }
                break;
            case 76 :
                // InternalRosLexer.g:1:641: Ns
                {
                mNs(); 

                }
                break;
            case 77 :
                // InternalRosLexer.g:1:644: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 78 :
                // InternalRosLexer.g:1:680: Comma
                {
                mComma(); 

                }
                break;
            case 79 :
                // InternalRosLexer.g:1:686: Colon
                {
                mColon(); 

                }
                break;
            case 80 :
                // InternalRosLexer.g:1:692: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 81 :
                // InternalRosLexer.g:1:710: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 82 :
                // InternalRosLexer.g:1:729: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 83 :
                // InternalRosLexer.g:1:741: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 84 :
                // InternalRosLexer.g:1:754: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 85 :
                // InternalRosLexer.g:1:766: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 86 :
                // InternalRosLexer.g:1:778: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 87 :
                // InternalRosLexer.g:1:793: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 88 :
                // InternalRosLexer.g:1:815: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 89 :
                // InternalRosLexer.g:1:831: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 90 :
                // InternalRosLexer.g:1:853: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 91 :
                // InternalRosLexer.g:1:879: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 92 :
                // InternalRosLexer.g:1:887: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 93 :
                // InternalRosLexer.g:1:899: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 94 :
                // InternalRosLexer.g:1:915: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 95 :
                // InternalRosLexer.g:1:923: RULE_ANY_OTHER
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
            return "182:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA32_eotS =
        "\1\53\1\61\31\65\1\142\3\uffff\2\150\1\uffff\1\61\1\56\1\150\1\56\1\65\2\56\1\uffff\1\56\1\uffff\1\56\2\uffff\1\65\1\61\1\uffff\1\65\1\uffff\1\65\1\uffff\53\65\10\uffff\3\150\1\65\2\uffff\1\u00aa\2\uffff\1\u00aa\4\uffff\36\65\1\u00ce\12\65\1\uffff\5\65\1\uffff\2\150\3\uffff\36\65\1\u0103\3\65\1\uffff\1\65\1\u0108\3\65\1\u010d\1\u010f\1\u0111\1\65\1\u0114\1\u0115\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b\1\uffff\1\150\11\65\1\uffff\7\65\1\u0119\10\65\1\u0137\3\65\1\u013c\1\u013e\1\u0140\2\uffff\1\65\1\uffff\2\65\1\uffff\3\65\6\uffff\1\u0148\12\uffff\10\65\1\u0152\1\u0155\12\65\1\u0160\1\65\1\u0163\1\u0165\1\u0167\2\uffff\1\65\1\u0169\1\65\6\uffff\1\65\1\uffff\1\u016c\1\u016d\1\u016e\1\u016f\2\uffff\6\65\1\u0178\1\65\2\uffff\2\65\1\uffff\4\65\1\u0182\1\u0184\4\65\1\uffff\1\u0189\6\uffff\1\u018a\1\uffff\1\u018b\1\u018c\4\uffff\10\65\1\uffff\3\65\1\uffff\1\65\1\uffff\1\u0199\1\65\4\uffff\1\u019b\2\65\1\u019e\4\uffff\5\65\1\u01a4\6\65\1\uffff\1\65\1\uffff\2\65\1\uffff\5\65\1\uffff\25\65\2\uffff\3\65\1\u01cb\3\65\1\uffff\3\65\1\uffff\3\65\1\uffff\5\65\1\uffff\6\65\2\uffff\3\65\1\u01e3\2\uffff\2\65\1\u01e6\1\uffff\1\65\1\u01e8\1\uffff\1\u01e9\2\uffff";
    static final String DFA32_eofS =
        "\u01ea\uffff";
    static final String DFA32_minS =
        "\1\0\32\57\1\135\3\uffff\2\56\1\uffff\1\57\2\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\2\57\1\uffff\1\57\1\uffff\1\57\1\uffff\53\57\6\uffff\1\56\1\uffff\3\56\1\57\2\0\1\57\2\0\1\57\4\uffff\51\57\1\uffff\5\57\3\56\1\0\1\uffff\1\0\42\57\1\uffff\20\57\2\55\11\57\1\uffff\27\57\2\uffff\1\57\1\uffff\2\57\1\uffff\3\57\6\uffff\1\57\12\uffff\31\57\2\uffff\3\57\6\uffff\1\57\1\uffff\4\57\2\uffff\10\57\2\uffff\2\57\1\uffff\12\57\1\uffff\1\57\6\uffff\1\57\1\uffff\2\57\4\uffff\10\57\1\uffff\3\57\1\uffff\1\57\1\uffff\2\57\4\uffff\4\57\4\uffff\14\57\1\uffff\1\57\1\uffff\2\57\1\uffff\5\57\1\uffff\25\57\2\uffff\7\57\1\uffff\3\57\1\uffff\3\57\1\uffff\5\57\1\uffff\6\57\2\uffff\4\57\2\uffff\3\57\1\uffff\2\57\1\uffff\1\57\2\uffff";
    static final String DFA32_maxS =
        "\1\uffff\32\172\1\135\3\uffff\2\145\1\uffff\1\172\2\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff\53\172\6\uffff\1\145\1\uffff\3\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\51\172\1\uffff\5\172\3\145\1\uffff\1\uffff\1\uffff\42\172\1\uffff\20\172\2\145\11\172\1\uffff\27\172\2\uffff\1\172\1\uffff\2\172\1\uffff\3\172\6\uffff\1\172\12\uffff\31\172\2\uffff\3\172\6\uffff\1\172\1\uffff\4\172\2\uffff\10\172\2\uffff\2\172\1\uffff\12\172\1\uffff\1\172\6\uffff\1\172\1\uffff\2\172\4\uffff\10\172\1\uffff\3\172\1\uffff\1\172\1\uffff\2\172\4\uffff\4\172\4\uffff\14\172\1\uffff\1\172\1\uffff\2\172\1\uffff\5\172\1\uffff\25\172\2\uffff\7\172\1\uffff\3\172\1\uffff\3\172\1\uffff\5\172\1\uffff\6\172\2\uffff\4\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA32_acceptS =
        "\34\uffff\1\116\1\117\1\121\2\uffff\1\124\7\uffff\1\130\1\uffff\1\131\1\uffff\1\136\1\137\2\uffff\1\124\1\uffff\1\127\1\uffff\1\133\53\uffff\1\115\1\120\1\116\1\117\1\121\1\122\1\uffff\1\125\12\uffff\1\130\1\135\1\132\1\136\51\uffff\1\114\11\uffff\1\134\43\uffff\1\113\33\uffff\1\74\27\uffff\1\60\1\106\1\uffff\1\72\2\uffff\1\100\3\uffff\1\55\1\102\1\56\1\103\1\57\1\104\1\uffff\1\73\1\110\1\107\1\75\1\112\1\111\1\123\1\101\1\105\1\126\31\uffff\1\45\1\76\3\uffff\1\37\1\67\1\40\1\70\1\41\1\71\1\uffff\1\46\4\uffff\1\66\1\77\10\uffff\1\27\1\62\2\uffff\1\54\12\uffff\1\61\1\uffff\1\30\1\63\1\31\1\64\1\32\1\65\1\uffff\1\47\2\uffff\1\50\1\51\1\52\1\53\10\uffff\1\44\3\uffff\1\22\1\uffff\1\23\2\uffff\1\20\1\35\1\21\1\36\4\uffff\1\43\1\33\1\34\1\42\14\uffff\1\24\1\uffff\1\25\2\uffff\1\26\5\uffff\1\17\25\uffff\1\15\1\16\7\uffff\1\14\3\uffff\1\13\3\uffff\1\12\5\uffff\1\11\6\uffff\1\7\1\10\4\uffff\1\5\1\6\3\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\1\3\46\uffff\1\0\1\4\104\uffff\1\7\1\2\1\uffff\1\10\1\6\67\uffff\1\1\1\uffff\1\5\u013e\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\56\1\47\1\51\3\56\1\50\4\56\1\34\1\43\1\41\1\52\1\37\2\40\7\44\1\35\6\56\1\20\1\14\1\46\1\21\1\1\1\46\1\4\1\22\1\15\2\46\1\31\3\46\1\3\1\46\1\2\1\23\7\46\1\33\1\56\1\36\1\45\1\46\1\56\1\6\1\24\1\25\1\7\1\42\1\10\1\32\1\46\1\16\3\46\1\17\1\27\1\46\1\11\1\46\1\12\1\5\1\30\1\13\1\26\4\46\3\56\1\54\uff81\56",
            "\1\53\12\60\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\27\62\1\57\2\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\64\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\67\20\62\1\66\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\70\5\62\1\71\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\72\14\62\1\75\1\62\1\74\1\73\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\76\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\77\17\62\1\100\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\104\3\62\1\103\6\62\1\102\5\62\1\101\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\105\23\62\1\106\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\107\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\110\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\112\15\62\1\111\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\113\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\114\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\115\15\62\1\116\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\120\3\62\1\117\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\122\15\62\1\121\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\123\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\124\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\125\11\62\1\126\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\127\22\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\130\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\132\15\62\1\131\3\62\1\133\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\135\10\62\1\136\6\62\1\134\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\137\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\140\13\62",
            "\1\141",
            "",
            "",
            "",
            "\1\61\1\uffff\12\147\10\uffff\1\146\2\uffff\1\61\34\uffff\1\146\2\uffff\1\61",
            "\1\61\1\uffff\12\151\13\uffff\1\61\37\uffff\1\61",
            "",
            "\1\53\12\60\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\61\1\uffff\12\152\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\153\13\uffff\1\61\37\uffff\1\61",
            "\32\154\4\uffff\1\154\1\uffff\32\154",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\42\156\1\157\71\156\1\155\uffa3\156",
            "\47\161\1\162\64\161\1\160\uffa3\161",
            "",
            "\1\165\4\uffff\1\165\2\uffff\1\164\26\uffff\32\53\3\uffff\2\53\1\uffff\32\53",
            "",
            "\1\165\4\uffff\1\165",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\167\6\62",
            "\1\53\12\60\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\170\16\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\171\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\172\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\173\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\174\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\175\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\176\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\177\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u0080\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0081\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0083\11\62\1\u0082\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0084\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0085\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0086\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0087\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0088\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0089\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u008a\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\20\62\1\u008c\1\62\1\u008b\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u008d\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u008e\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u008f\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0090\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0091\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0092\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0093\23\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0094\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u0095\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0096\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0097\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0098\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0099\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u009a\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u009b\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u009c\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u009d\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u009e\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u009f\15\62",
            "\1\53\12\62\1\u00a0\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00a1\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00a2\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00a3\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00a4\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00a5\31\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61\1\uffff\12\u00a6\13\uffff\1\61\37\uffff\1\61",
            "",
            "\1\61\1\uffff\12\u00a7\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\u00a8\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\153\13\uffff\1\61\37\uffff\1\61",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\0\u00a9",
            "\42\156\1\157\71\156\1\155\uffa3\156",
            "\1\165\15\uffff\1\63",
            "\0\u00ab",
            "\47\161\1\162\64\161\1\160\uffa3\161",
            "\1\165\15\uffff\1\63",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00ac\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00ad\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u00ae\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00af\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00b0\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00b1\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u00b2\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00b3\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00b4\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00b5\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00b6\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00b7\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00b8\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00b9\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00ba\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00bb\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00bc\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00bd\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00be\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00bf\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00c0\4\62\1\u00c1\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00c2\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00c3\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00c4\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c5\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00c6\25\62",
            "\1\53\1\62\1\u00c7\1\62\1\u00c8\2\62\1\u00c9\1\62\1\u00ca\1\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00cb\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00cc\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00cd\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00cf\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d0\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00d1\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00d2\13\62\1\u00d3\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00d4\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d5\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00d6\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00d7\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d8\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00d9\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00da\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00db\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00dc\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00dd\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00de\16\62",
            "\1\61\1\uffff\12\u00df\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\u00e0\13\uffff\1\61\37\uffff\1\61",
            "\1\61\1\uffff\12\u00a8\13\uffff\1\61\37\uffff\1\61",
            "\42\156\1\157\71\156\1\155\uffa3\156",
            "",
            "\47\161\1\162\64\161\1\160\uffa3\161",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00e1\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00e2\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00e3\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00e4\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u00e5\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u00e6\22\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00e7\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00e8\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00e9\14\62",
            "\1\53\12\62\1\u00ea\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00eb\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00ec\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u00ed\5\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00ee\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\6\62\1\u00ef\23\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00f0\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00f1\30\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00f2\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00f3\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00f4\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00f5\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00f6\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00f7\25\62",
            "\1\53\1\62\1\u00f8\1\62\1\u00f9\2\62\1\u00fa\1\62\1\u00fb\1\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00fc\25\62",
            "\1\53\6\62\1\u00fd\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00fe\23\62",
            "\1\53\6\62\1\u00ff\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\2\62\1\u0100\7\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\4\62\1\u0101\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0102\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0104\31\62",
            "\1\53\12\62\1\u0105\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u0106\1\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0107\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0109\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u010a\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u010b\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u010c\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u010e\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0110\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0112\25\62",
            "\1\53\12\62\1\u0113\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u0116\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u011c\1\61\1\uffff\12\61\13\uffff\1\61\37\uffff\1\61",
            "\1\u011c\1\61\1\uffff\12\153\13\uffff\1\61\37\uffff\1\61",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u011d\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u011e\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u011f\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0120\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0121\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u0122\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0123\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0124\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0125\23\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0126\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0127\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0128\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0129\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u012a\21\62",
            "\1\53\3\62\1\u012b\2\62\1\u012c\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u012d\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u012e\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u012f\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0130\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0131\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0132\7\62",
            "\1\53\6\62\1\u0133\3\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\2\62\1\u0134\7\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\4\62\1\u0135\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0136\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0138\31\62",
            "\1\53\4\62\1\u0139\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u013a\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u013b\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u013d\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u013f\3\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0141\23\62",
            "",
            "\1\53\12\62\1\u0142\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0143\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0144\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0145\23\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0146\6\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\62\1\u0147\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
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
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0149\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u014a\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u014b\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u014c\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u014d\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u014e\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u014f\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0150\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0151\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0153\17\62\1\u0154\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0156\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0157\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0158\13\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0159\6\62",
            "\1\53\2\62\1\u015a\7\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\4\62\1\u015b\5\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u015c\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u015d\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u015e\22\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u015f\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0161\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0162\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0164\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0166\3\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0168\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u016a\10\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u016b\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0170\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0171\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u0172\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0173\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u0174\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0175\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0176\17\62\1\u0177\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u0179\30\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u017a\16\62",
            "\1\53\12\62\1\u017c\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u017b\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u017d\14\62",
            "\1\53\12\62\1\u017e\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u017f\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\21\62\1\u0180\10\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0181\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\1\u0183\3\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\12\62\1\u0185\17\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0186\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0187\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0188\25\62",
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
            "\1\53\12\62\3\uffff\1\63\3\uffff\3\62\1\u018d\26\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\15\62\1\u018e\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u018f\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0190\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0191\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0192\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0193\16\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0194\25\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0195\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0196\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0197\10\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0198\27\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u019a\25\62",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u019c\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u019d\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u019f\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01a0\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01a1\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\1\u01a2\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01a3\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01a5\21\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a6\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a7\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01a8\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u01a9\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01aa\21\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01ab\12\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01ac\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01ad\7\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01ae\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01af\15\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b0\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01b1\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01b2\7\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b3\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\25\62\1\u01b4\4\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01b5\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01b6\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b7\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b8\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01b9\13\62",
            "\1\53\12\62\1\u01ba\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u01bb\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01bc\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01bd\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01be\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u01bf\1\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01c0\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01c1\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01c2\25\62",
            "\1\53\12\62\1\u01c3\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01c4\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01c5\10\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01c6\7\62",
            "\1\53\12\62\1\u01c7\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01c8\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01c9\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01ca\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01cc\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01cd\6\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01ce\10\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01cf\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01d0\7\62",
            "\1\53\12\62\1\u01d1\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u01d2\26\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01d3\12\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01d4\31\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01d5\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01d6\7\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01d7\7\62",
            "\1\53\12\62\1\u01d8\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u01d9\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01da\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\1\u01db\31\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01dc\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01dd\25\62",
            "\1\53\12\62\1\u01de\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\53\12\62\1\u01df\2\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01e0\14\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01e1\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01e2\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01e4\27\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01e5\25\62",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\53\12\62\3\uffff\1\63\3\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u01e7\1\62",
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
            return "1:1: Tokens : ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | GraphName | Float32_1 | Float64_1 | Actions | Default | Duration | Feedback | Response | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Request | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Msgs | Node_1 | Srvs | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Char | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_39 = input.LA(1);

                        s = -1;
                        if ( (LA32_39=='\\') ) {s = 109;}

                        else if ( ((LA32_39>='\u0000' && LA32_39<='!')||(LA32_39>='#' && LA32_39<='[')||(LA32_39>=']' && LA32_39<='\uFFFF')) ) {s = 110;}

                        else if ( (LA32_39=='\"') ) {s = 111;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_169 = input.LA(1);

                        s = -1;
                        if ( (LA32_169=='\"') ) {s = 111;}

                        else if ( (LA32_169=='\\') ) {s = 109;}

                        else if ( ((LA32_169>='\u0000' && LA32_169<='!')||(LA32_169>='#' && LA32_169<='[')||(LA32_169>=']' && LA32_169<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_110 = input.LA(1);

                        s = -1;
                        if ( (LA32_110=='\"') ) {s = 111;}

                        else if ( (LA32_110=='\\') ) {s = 109;}

                        else if ( ((LA32_110>='\u0000' && LA32_110<='!')||(LA32_110>='#' && LA32_110<='[')||(LA32_110>=']' && LA32_110<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
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
                    case 4 : 
                        int LA32_40 = input.LA(1);

                        s = -1;
                        if ( (LA32_40=='\\') ) {s = 112;}

                        else if ( ((LA32_40>='\u0000' && LA32_40<='&')||(LA32_40>='(' && LA32_40<='[')||(LA32_40>=']' && LA32_40<='\uFFFF')) ) {s = 113;}

                        else if ( (LA32_40=='\'') ) {s = 114;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_171 = input.LA(1);

                        s = -1;
                        if ( (LA32_171=='\'') ) {s = 114;}

                        else if ( (LA32_171=='\\') ) {s = 112;}

                        else if ( ((LA32_171>='\u0000' && LA32_171<='&')||(LA32_171>='(' && LA32_171<='[')||(LA32_171>=']' && LA32_171<='\uFFFF')) ) {s = 113;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_113 = input.LA(1);

                        s = -1;
                        if ( (LA32_113=='\'') ) {s = 114;}

                        else if ( (LA32_113=='\\') ) {s = 112;}

                        else if ( ((LA32_113>='\u0000' && LA32_113<='&')||(LA32_113>='(' && LA32_113<='[')||(LA32_113>=']' && LA32_113<='\uFFFF')) ) {s = 113;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_109 = input.LA(1);

                        s = -1;
                        if ( ((LA32_109>='\u0000' && LA32_109<='\uFFFF')) ) {s = 169;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_112 = input.LA(1);

                        s = -1;
                        if ( ((LA32_112>='\u0000' && LA32_112<='\uFFFF')) ) {s = 171;}

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