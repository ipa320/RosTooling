package de.fraunhofer.ipa.ros.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosLexer extends Lexer {
    public static final int Float32_1=20;
    public static final int Node=77;
    public static final int RULE_DATE_TIME=98;
    public static final int Uint64_1=31;
    public static final int Serviceclients=8;
    public static final int String=48;
    public static final int Int16=62;
    public static final int Float32=35;
    public static final int Goal=73;
    public static final int Actionservers=11;
    public static final int Bool=71;
    public static final int Uint16=57;
    public static final int Boolean=32;
    public static final int ExternalDependency=4;
    public static final int Uint8=67;
    public static final int Parameters=16;
    public static final int RULE_ID=99;
    public static final int RULE_DIGIT=88;
    public static final int GlobalNamespace=7;
    public static final int Node_1=65;
    public static final int Int16_1=37;
    public static final int Header=47;
    public static final int RULE_INT=101;
    public static final int Byte=72;
    public static final int RULE_ML_COMMENT=108;
    public static final int LeftSquareBracket=86;
    public static final int Specs=55;
    public static final int Base64=45;
    public static final int Message_1=26;
    public static final int Comma=84;
    public static final int RULE_MESSAGE_ASIGMENT=102;
    public static final int Goal_1=61;
    public static final int LeftSquareBracketRightSquareBracket=83;
    public static final int Int32=63;
    public static final int Publishers=17;
    public static final int RULE_DECINT=91;
    public static final int Uint32=58;
    public static final int FromGitRepo=14;
    public static final int Msg=75;
    public static final int RULE_HOUR=96;
    public static final int Int8=74;
    public static final int Default=23;
    public static final int Int8_1=53;
    public static final int Uint16_1=29;
    public static final int Type=80;
    public static final int Float64=36;
    public static final int Int32_1=38;
    public static final int Result_1=41;
    public static final int RULE_BINARY=89;
    public static final int String_1=56;
    public static final int Subscribers=15;
    public static final int String_2=28;
    public static final int Actionclients=10;
    public static final int RULE_DAY=93;
    public static final int RULE_BEGIN=103;
    public static final int RULE_BOOLEAN=90;
    public static final int RelativeNamespace=5;
    public static final int Serviceservers=9;
    public static final int RULE_YEAR=95;
    public static final int Feedback_1=19;
    public static final int Result=54;
    public static final int Name=76;
    public static final int RULE_MIN_SEC=97;
    public static final int ParameterAny=13;
    public static final int List=70;
    public static final int Dependencies=12;
    public static final int RightSquareBracket=87;
    public static final int PrivateNamespace=6;
    public static final int GraphName=18;
    public static final int Byte_1=52;
    public static final int Float64_1=21;
    public static final int Duration=24;
    public static final int Uint32_1=30;
    public static final int Action_1=34;
    public static final int Double=46;
    public static final int Type_1=66;
    public static final int Value=68;
    public static final int Uint64=59;
    public static final int Action=50;
    public static final int RULE_END=104;
    public static final int Message=40;
    public static final int Value_1=60;
    public static final int Time=79;
    public static final int RULE_STRING=100;
    public static final int Bool_1=51;
    public static final int Any=81;
    public static final int Struct=49;
    public static final int RULE_SL_COMMENT=105;
    public static final int Uint8_1=43;
    public static final int RULE_DOUBLE=92;
    public static final int Feedback=25;
    public static final int Srv=78;
    public static final int RULE_ROS_CONVENTION_A=106;
    public static final int RULE_ROS_CONVENTION_PARAM=107;
    public static final int Colon=85;
    public static final int EOF=-1;
    public static final int Ns=82;
    public static final int RULE_WS=109;
    public static final int Request=27;
    public static final int Int64_1=39;
    public static final int Service=42;
    public static final int RULE_ANY_OTHER=110;
    public static final int Date=69;
    public static final int Response=22;
    public static final int Integer=33;
    public static final int Array=44;
    public static final int Int64=64;
    public static final int RULE_MONTH=94;

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

    // $ANTLR start "Feedback_1"
    public final void mFeedback_1() throws RecognitionException {
        try {
            int _type = Feedback_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosLexer.g:44:12: ( 'feedback:' )
            // InternalRosLexer.g:44:14: 'feedback:'
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
            // InternalRosLexer.g:46:11: ( 'float32[]' )
            // InternalRosLexer.g:46:13: 'float32[]'
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
            // InternalRosLexer.g:48:11: ( 'float64[]' )
            // InternalRosLexer.g:48:13: 'float64[]'
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
            // InternalRosLexer.g:50:10: ( 'response:' )
            // InternalRosLexer.g:50:12: 'response:'
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
            // InternalRosLexer.g:52:9: ( 'default:' )
            // InternalRosLexer.g:52:11: 'default:'
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

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosLexer.g:76:9: ( 'float32' )
            // InternalRosLexer.g:76:11: 'float32'
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
            // InternalRosLexer.g:78:9: ( 'float64' )
            // InternalRosLexer.g:78:11: 'float64'
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
            // InternalRosLexer.g:80:9: ( 'int16[]' )
            // InternalRosLexer.g:80:11: 'int16[]'
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
            // InternalRosLexer.g:82:9: ( 'int32[]' )
            // InternalRosLexer.g:82:11: 'int32[]'
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
            // InternalRosLexer.g:84:9: ( 'int64[]' )
            // InternalRosLexer.g:84:11: 'int64[]'
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
            // InternalRosLexer.g:86:9: ( 'message' )
            // InternalRosLexer.g:86:11: 'message'
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
            // InternalRosLexer.g:88:10: ( 'result:' )
            // InternalRosLexer.g:88:12: 'result:'
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
            // InternalRosLexer.g:90:9: ( 'service' )
            // InternalRosLexer.g:90:11: 'service'
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
            // InternalRosLexer.g:92:9: ( 'uint8[]' )
            // InternalRosLexer.g:92:11: 'uint8[]'
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
            // InternalRosLexer.g:94:7: ( 'Array:' )
            // InternalRosLexer.g:94:9: 'Array:'
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
            // InternalRosLexer.g:96:8: ( 'Base64' )
            // InternalRosLexer.g:96:10: 'Base64'
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
            // InternalRosLexer.g:98:8: ( 'Double' )
            // InternalRosLexer.g:98:10: 'Double'
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
            // InternalRosLexer.g:100:8: ( 'Header' )
            // InternalRosLexer.g:100:10: 'Header'
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
            // InternalRosLexer.g:102:8: ( 'String' )
            // InternalRosLexer.g:102:10: 'String'
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
            // InternalRosLexer.g:104:8: ( 'Struct' )
            // InternalRosLexer.g:104:10: 'Struct'
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
            // InternalRosLexer.g:106:8: ( 'action' )
            // InternalRosLexer.g:106:10: 'action'
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
            // InternalRosLexer.g:108:8: ( 'bool[]' )
            // InternalRosLexer.g:108:10: 'bool[]'
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
            // InternalRosLexer.g:110:8: ( 'byte[]' )
            // InternalRosLexer.g:110:10: 'byte[]'
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
            // InternalRosLexer.g:112:8: ( 'int8[]' )
            // InternalRosLexer.g:112:10: 'int8[]'
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
            // InternalRosLexer.g:114:8: ( 'result' )
            // InternalRosLexer.g:114:10: 'result'
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
            // InternalRosLexer.g:116:7: ( 'specs:' )
            // InternalRosLexer.g:116:9: 'specs:'
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
            // InternalRosLexer.g:118:10: ( 'string' )
            // InternalRosLexer.g:118:12: 'string'
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
            // InternalRosLexer.g:120:8: ( 'uint16' )
            // InternalRosLexer.g:120:10: 'uint16'
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
            // InternalRosLexer.g:122:8: ( 'uint32' )
            // InternalRosLexer.g:122:10: 'uint32'
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
            // InternalRosLexer.g:124:8: ( 'uint64' )
            // InternalRosLexer.g:124:10: 'uint64'
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
            // InternalRosLexer.g:126:9: ( 'value:' )
            // InternalRosLexer.g:126:11: 'value:'
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
            // InternalRosLexer.g:128:8: ( 'goal:' )
            // InternalRosLexer.g:128:10: 'goal:'
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
            // InternalRosLexer.g:130:7: ( 'int16' )
            // InternalRosLexer.g:130:9: 'int16'
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
            // InternalRosLexer.g:132:7: ( 'int32' )
            // InternalRosLexer.g:132:9: 'int32'
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
            // InternalRosLexer.g:134:7: ( 'int64' )
            // InternalRosLexer.g:134:9: 'int64'
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
            // InternalRosLexer.g:136:8: ( 'node:' )
            // InternalRosLexer.g:136:10: 'node:'
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
            // InternalRosLexer.g:138:8: ( 'type:' )
            // InternalRosLexer.g:138:10: 'type:'
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
            // InternalRosLexer.g:140:7: ( 'uint8' )
            // InternalRosLexer.g:140:9: 'uint8'
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
            // InternalRosLexer.g:142:7: ( 'value' )
            // InternalRosLexer.g:142:9: 'value'
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
            // InternalRosLexer.g:144:6: ( 'Date' )
            // InternalRosLexer.g:144:8: 'Date'
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
            // InternalRosLexer.g:146:6: ( 'List' )
            // InternalRosLexer.g:146:8: 'List'
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
            // InternalRosLexer.g:148:6: ( 'bool' )
            // InternalRosLexer.g:148:8: 'bool'
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
            // InternalRosLexer.g:150:6: ( 'byte' )
            // InternalRosLexer.g:150:8: 'byte'
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
            // InternalRosLexer.g:152:6: ( 'goal' )
            // InternalRosLexer.g:152:8: 'goal'
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
            // InternalRosLexer.g:154:6: ( 'int8' )
            // InternalRosLexer.g:154:8: 'int8'
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
            // InternalRosLexer.g:156:5: ( 'msg:' )
            // InternalRosLexer.g:156:7: 'msg:'
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
            // InternalRosLexer.g:158:6: ( 'name' )
            // InternalRosLexer.g:158:8: 'name'
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
            // InternalRosLexer.g:160:6: ( 'node' )
            // InternalRosLexer.g:160:8: 'node'
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
            // InternalRosLexer.g:162:5: ( 'srv:' )
            // InternalRosLexer.g:162:7: 'srv:'
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
            // InternalRosLexer.g:164:6: ( 'time' )
            // InternalRosLexer.g:164:8: 'time'
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
            // InternalRosLexer.g:166:6: ( 'type' )
            // InternalRosLexer.g:166:8: 'type'
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
            // InternalRosLexer.g:168:5: ( 'Any' )
            // InternalRosLexer.g:168:7: 'Any'
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
            // InternalRosLexer.g:170:4: ( 'ns:' )
            // InternalRosLexer.g:170:6: 'ns:'
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
            // InternalRosLexer.g:172:37: ( '[]' )
            // InternalRosLexer.g:172:39: '[]'
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
            // InternalRosLexer.g:174:7: ( ',' )
            // InternalRosLexer.g:174:9: ','
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
            // InternalRosLexer.g:176:7: ( ':' )
            // InternalRosLexer.g:176:9: ':'
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
            // InternalRosLexer.g:178:19: ( '[' )
            // InternalRosLexer.g:178:21: '['
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
            // InternalRosLexer.g:180:20: ( ']' )
            // InternalRosLexer.g:180:22: ']'
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
            // InternalRosLexer.g:182:21: ( '0' .. '9' )
            // InternalRosLexer.g:182:23: '0' .. '9'
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
            // InternalRosLexer.g:184:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosLexer.g:184:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosLexer.g:184:15: ( '0b' | '0B' )
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
                    // InternalRosLexer.g:184:16: '0b'
                    {
                    match("0b");


                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:184:21: '0B'
                    {
                    match("0B");


                    }
                    break;

            }

            // InternalRosLexer.g:184:27: ( '0' | '1' )+
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
            // InternalRosLexer.g:186:14: ( ( 'true' | 'false' ) )
            // InternalRosLexer.g:186:16: ( 'true' | 'false' )
            {
            // InternalRosLexer.g:186:16: ( 'true' | 'false' )
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
                    // InternalRosLexer.g:186:17: 'true'
                    {
                    match("true");


                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:186:24: 'false'
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
            // InternalRosLexer.g:188:13: ( ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRosLexer.g:188:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            // InternalRosLexer.g:188:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* )
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
                    // InternalRosLexer.g:188:16: RULE_DIGIT
                    {
                    mRULE_DIGIT();

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:188:27: '-' ( RULE_DIGIT )*
                    {
                    match('-');
                    // InternalRosLexer.g:188:31: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // InternalRosLexer.g:188:31: RULE_DIGIT
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

            // InternalRosLexer.g:188:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalRosLexer.g:188:45: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalRosLexer.g:188:49: ( RULE_DECINT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // InternalRosLexer.g:188:49: RULE_DECINT
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
                    // InternalRosLexer.g:188:62: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRosLexer.g:188:62: ( '.' ( RULE_DIGIT )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRosLexer.g:188:63: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalRosLexer.g:188:67: ( RULE_DIGIT )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                                case 1 :
                                    // InternalRosLexer.g:188:67: RULE_DIGIT
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

                    // InternalRosLexer.g:188:91: ( '-' | '+' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
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
            // InternalRosLexer.g:190:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosLexer.g:190:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosLexer.g:190:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosLexer.g:190:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:190:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalRosLexer.g:190:29: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                        case 1 :
                            // InternalRosLexer.g:190:29: RULE_DIGIT
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
                    // InternalRosLexer.g:190:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalRosLexer.g:190:54: ( RULE_DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                        case 1 :
                            // InternalRosLexer.g:190:54: RULE_DIGIT
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
            // InternalRosLexer.g:192:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosLexer.g:192:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosLexer.g:192:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosLexer.g:192:22: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:192:31: '1' .. '3' '0' .. '9'
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
            // InternalRosLexer.g:194:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosLexer.g:194:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosLexer.g:194:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosLexer.g:194:24: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:194:33: '1' '0' .. '2'
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
            // InternalRosLexer.g:196:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosLexer.g:196:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosLexer.g:198:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosLexer.g:198:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosLexer.g:198:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosLexer.g:198:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1');
                    matchRange('0','9');

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:198:41: '2' '0' .. '3'
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
            // InternalRosLexer.g:200:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosLexer.g:200:25: '0' .. '5' '0' .. '9'
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
            // InternalRosLexer.g:202:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosLexer.g:202:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosLexer.g:204:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosLexer.g:204:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosLexer.g:204:25: ( RULE_ID | RULE_STRING )
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
                    // InternalRosLexer.g:204:26: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:204:34: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;

            }

            match('=');
            // InternalRosLexer.g:204:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalRosLexer.g:204:52: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:204:60: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;
                case 3 :
                    // InternalRosLexer.g:204:72: RULE_INT
                    {
                    mRULE_INT();

                    }
                    break;
                case 4 :
                    // InternalRosLexer.g:204:81: '-' RULE_INT
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
            // InternalRosLexer.g:206:21: ()
            // InternalRosLexer.g:206:23:
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
            // InternalRosLexer.g:208:19: ()
            // InternalRosLexer.g:208:21:
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
            // InternalRosLexer.g:210:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosLexer.g:210:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalRosLexer.g:210:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
                case 1 :
                    // InternalRosLexer.g:210:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalRosLexer.g:212:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosLexer.g:212:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosLexer.g:212:25: ( '/' RULE_ID | RULE_ID '/' )*
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
                    // InternalRosLexer.g:212:26: '/' RULE_ID
                    {
                    match('/');
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:212:38: RULE_ID '/'
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
            // InternalRosLexer.g:214:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosLexer.g:214:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosLexer.g:214:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
                    // InternalRosLexer.g:214:30: '/' RULE_STRING
                    {
                    match('/');
                    mRULE_STRING();

                    }
                    break;
                case 2 :
                    // InternalRosLexer.g:214:46: RULE_STRING '/'
                    {
                    mRULE_STRING();
                    match('/');

                    }
                    break;
                case 3 :
                    // InternalRosLexer.g:214:62: '~' RULE_STRING
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
            // InternalRosLexer.g:216:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosLexer.g:216:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosLexer.g:216:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosLexer.g:216:11: '^'
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

            // InternalRosLexer.g:216:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
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
            // InternalRosLexer.g:218:19: ( ( '0' .. '9' )+ )
            // InternalRosLexer.g:218:21: ( '0' .. '9' )+
            {
            // InternalRosLexer.g:218:21: ( '0' .. '9' )+
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
                    // InternalRosLexer.g:218:22: '0' .. '9'
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
            // InternalRosLexer.g:220:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosLexer.g:220:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosLexer.g:220:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRosLexer.g:220:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalRosLexer.g:220:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // InternalRosLexer.g:220:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalRosLexer.g:220:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRosLexer.g:220:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalRosLexer.g:220:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // InternalRosLexer.g:220:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalRosLexer.g:220:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRosLexer.g:222:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosLexer.g:222:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalRosLexer.g:222:24: ( options {greedy=false; } : . )*
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
                    // InternalRosLexer.g:222:52: .
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
            // InternalRosLexer.g:224:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosLexer.g:224:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosLexer.g:224:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalRosLexer.g:226:16: ( . )
            // InternalRosLexer.g:226:18: .
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
        // InternalRosLexer.g:1:8: ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Default | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=98;
        alt30 = dfa30.predict(input);
        switch (alt30) {
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
                // InternalRosLexer.g:1:220: Feedback_1
                {
                mFeedback_1();

                }
                break;
            case 17 :
                // InternalRosLexer.g:1:231: Float32_1
                {
                mFloat32_1();

                }
                break;
            case 18 :
                // InternalRosLexer.g:1:241: Float64_1
                {
                mFloat64_1();

                }
                break;
            case 19 :
                // InternalRosLexer.g:1:251: Response
                {
                mResponse();

                }
                break;
            case 20 :
                // InternalRosLexer.g:1:260: Default
                {
                mDefault();

                }
                break;
            case 21 :
                // InternalRosLexer.g:1:268: Duration
                {
                mDuration();

                }
                break;
            case 22 :
                // InternalRosLexer.g:1:277: Feedback
                {
                mFeedback();

                }
                break;
            case 23 :
                // InternalRosLexer.g:1:286: Message_1
                {
                mMessage_1();

                }
                break;
            case 24 :
                // InternalRosLexer.g:1:296: Request
                {
                mRequest();

                }
                break;
            case 25 :
                // InternalRosLexer.g:1:304: String_2
                {
                mString_2();

                }
                break;
            case 26 :
                // InternalRosLexer.g:1:313: Uint16_1
                {
                mUint16_1();

                }
                break;
            case 27 :
                // InternalRosLexer.g:1:322: Uint32_1
                {
                mUint32_1();

                }
                break;
            case 28 :
                // InternalRosLexer.g:1:331: Uint64_1
                {
                mUint64_1();

                }
                break;
            case 29 :
                // InternalRosLexer.g:1:340: Boolean
                {
                mBoolean();

                }
                break;
            case 30 :
                // InternalRosLexer.g:1:348: Integer
                {
                mInteger();

                }
                break;
            case 31 :
                // InternalRosLexer.g:1:356: Action_1
                {
                mAction_1();

                }
                break;
            case 32 :
                // InternalRosLexer.g:1:365: Float32
                {
                mFloat32();

                }
                break;
            case 33 :
                // InternalRosLexer.g:1:373: Float64
                {
                mFloat64();

                }
                break;
            case 34 :
                // InternalRosLexer.g:1:381: Int16_1
                {
                mInt16_1();

                }
                break;
            case 35 :
                // InternalRosLexer.g:1:389: Int32_1
                {
                mInt32_1();

                }
                break;
            case 36 :
                // InternalRosLexer.g:1:397: Int64_1
                {
                mInt64_1();

                }
                break;
            case 37 :
                // InternalRosLexer.g:1:405: Message
                {
                mMessage();

                }
                break;
            case 38 :
                // InternalRosLexer.g:1:413: Result_1
                {
                mResult_1();

                }
                break;
            case 39 :
                // InternalRosLexer.g:1:422: Service
                {
                mService();

                }
                break;
            case 40 :
                // InternalRosLexer.g:1:430: Uint8_1
                {
                mUint8_1();

                }
                break;
            case 41 :
                // InternalRosLexer.g:1:438: Array
                {
                mArray();

                }
                break;
            case 42 :
                // InternalRosLexer.g:1:444: Base64
                {
                mBase64();

                }
                break;
            case 43 :
                // InternalRosLexer.g:1:451: Double
                {
                mDouble();

                }
                break;
            case 44 :
                // InternalRosLexer.g:1:458: Header
                {
                mHeader();

                }
                break;
            case 45 :
                // InternalRosLexer.g:1:465: String
                {
                mString();

                }
                break;
            case 46 :
                // InternalRosLexer.g:1:472: Struct
                {
                mStruct();

                }
                break;
            case 47 :
                // InternalRosLexer.g:1:479: Action
                {
                mAction();

                }
                break;
            case 48 :
                // InternalRosLexer.g:1:486: Bool_1
                {
                mBool_1();

                }
                break;
            case 49 :
                // InternalRosLexer.g:1:493: Byte_1
                {
                mByte_1();

                }
                break;
            case 50 :
                // InternalRosLexer.g:1:500: Int8_1
                {
                mInt8_1();

                }
                break;
            case 51 :
                // InternalRosLexer.g:1:507: Result
                {
                mResult();

                }
                break;
            case 52 :
                // InternalRosLexer.g:1:514: Specs
                {
                mSpecs();

                }
                break;
            case 53 :
                // InternalRosLexer.g:1:520: String_1
                {
                mString_1();

                }
                break;
            case 54 :
                // InternalRosLexer.g:1:529: Uint16
                {
                mUint16();

                }
                break;
            case 55 :
                // InternalRosLexer.g:1:536: Uint32
                {
                mUint32();

                }
                break;
            case 56 :
                // InternalRosLexer.g:1:543: Uint64
                {
                mUint64();

                }
                break;
            case 57 :
                // InternalRosLexer.g:1:550: Value_1
                {
                mValue_1();

                }
                break;
            case 58 :
                // InternalRosLexer.g:1:558: Goal_1
                {
                mGoal_1();

                }
                break;
            case 59 :
                // InternalRosLexer.g:1:565: Int16
                {
                mInt16();

                }
                break;
            case 60 :
                // InternalRosLexer.g:1:571: Int32
                {
                mInt32();

                }
                break;
            case 61 :
                // InternalRosLexer.g:1:577: Int64
                {
                mInt64();

                }
                break;
            case 62 :
                // InternalRosLexer.g:1:583: Node_1
                {
                mNode_1();

                }
                break;
            case 63 :
                // InternalRosLexer.g:1:590: Type_1
                {
                mType_1();

                }
                break;
            case 64 :
                // InternalRosLexer.g:1:597: Uint8
                {
                mUint8();

                }
                break;
            case 65 :
                // InternalRosLexer.g:1:603: Value
                {
                mValue();

                }
                break;
            case 66 :
                // InternalRosLexer.g:1:609: Date
                {
                mDate();

                }
                break;
            case 67 :
                // InternalRosLexer.g:1:614: List
                {
                mList();

                }
                break;
            case 68 :
                // InternalRosLexer.g:1:619: Bool
                {
                mBool();

                }
                break;
            case 69 :
                // InternalRosLexer.g:1:624: Byte
                {
                mByte();

                }
                break;
            case 70 :
                // InternalRosLexer.g:1:629: Goal
                {
                mGoal();

                }
                break;
            case 71 :
                // InternalRosLexer.g:1:634: Int8
                {
                mInt8();

                }
                break;
            case 72 :
                // InternalRosLexer.g:1:639: Msg
                {
                mMsg();

                }
                break;
            case 73 :
                // InternalRosLexer.g:1:643: Name
                {
                mName();

                }
                break;
            case 74 :
                // InternalRosLexer.g:1:648: Node
                {
                mNode();

                }
                break;
            case 75 :
                // InternalRosLexer.g:1:653: Srv
                {
                mSrv();

                }
                break;
            case 76 :
                // InternalRosLexer.g:1:657: Time
                {
                mTime();

                }
                break;
            case 77 :
                // InternalRosLexer.g:1:662: Type
                {
                mType();

                }
                break;
            case 78 :
                // InternalRosLexer.g:1:667: Any
                {
                mAny();

                }
                break;
            case 79 :
                // InternalRosLexer.g:1:671: Ns
                {
                mNs();

                }
                break;
            case 80 :
                // InternalRosLexer.g:1:674: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket();

                }
                break;
            case 81 :
                // InternalRosLexer.g:1:710: Comma
                {
                mComma();

                }
                break;
            case 82 :
                // InternalRosLexer.g:1:716: Colon
                {
                mColon();

                }
                break;
            case 83 :
                // InternalRosLexer.g:1:722: LeftSquareBracket
                {
                mLeftSquareBracket();

                }
                break;
            case 84 :
                // InternalRosLexer.g:1:740: RightSquareBracket
                {
                mRightSquareBracket();

                }
                break;
            case 85 :
                // InternalRosLexer.g:1:759: RULE_BINARY
                {
                mRULE_BINARY();

                }
                break;
            case 86 :
                // InternalRosLexer.g:1:771: RULE_BOOLEAN
                {
                mRULE_BOOLEAN();

                }
                break;
            case 87 :
                // InternalRosLexer.g:1:784: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 88 :
                // InternalRosLexer.g:1:796: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 89 :
                // InternalRosLexer.g:1:808: RULE_DATE_TIME
                {
                mRULE_DATE_TIME();

                }
                break;
            case 90 :
                // InternalRosLexer.g:1:823: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT();

                }
                break;
            case 91 :
                // InternalRosLexer.g:1:845: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 92 :
                // InternalRosLexer.g:1:861: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A();

                }
                break;
            case 93 :
                // InternalRosLexer.g:1:883: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM();

                }
                break;
            case 94 :
                // InternalRosLexer.g:1:909: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 95 :
                // InternalRosLexer.g:1:917: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 96 :
                // InternalRosLexer.g:1:929: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 97 :
                // InternalRosLexer.g:1:945: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 98 :
                // InternalRosLexer.g:1:953: RULE_ANY_OTHER
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
            return "188:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA30_eotS =
        "\1\50\31\55\1\135\3\uffff\2\143\1\53\1\143\1\53\1\55\2\53\1\uffff\1\53\1\uffff\1\53\2\uffff\1\55\1\uffff\1\55\1\uffff\54\55\11\uffff\2\143\1\55\2\uffff\1\u00a4\2\uffff\1\u00a4\4\uffff\37\55\1\u00c9\12\55\1\uffff\4\55\2\143\3\uffff\12\55\1\uffff\16\55\1\uffff\7\55\1\u00fd\1\55\1\uffff\1\55\1\u0100\3\55\1\u0105\1\u0107\1\55\1\u010a\1\u010c\1\u010d\1\u010f\1\u0110\1\u0111\1\u0112\1\143\21\55\1\u0111\11\55\1\u012f\3\55\1\u0134\1\u0136\1\u0138\2\uffff\2\55\1\uffff\3\55\4\uffff\1\u013f\12\uffff\10\55\1\u0149\1\uffff\1\u014d\12\55\1\u0159\2\55\1\u015d\1\u015f\1\u0161\2\uffff\1\55\1\u0163\1\55\7\uffff\1\u0165\1\u0166\1\u0167\1\u0168\2\uffff\6\55\1\u0171\1\55\2\uffff\2\55\2\uffff\5\55\1\u017b\1\u017d\3\55\2\uffff\1\55\1\u0183\6\uffff\1\u0184\1\uffff\1\u0185\4\uffff\10\55\1\uffff\4\55\1\uffff\1\u0192\1\55\1\u0195\4\uffff\3\55\5\uffff\5\55\1\u019e\6\55\1\uffff\1\55\2\uffff\2\55\1\uffff\5\55\1\uffff\25\55\2\uffff\3\55\1\u01c5\3\55\1\uffff\3\55\1\uffff\3\55\1\uffff\5\55\1\uffff\6\55\2\uffff\3\55\1\u01dd\2\uffff\2\55\1\u01e0\1\uffff\1\55\1\u01e2\1\uffff\1\u01e3\2\uffff";
    static final String DFA30_eofS =
        "\u01e4\uffff";
    static final String DFA30_minS =
        "\1\0\31\57\1\135\3\uffff\4\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\1\57\1\uffff\1\57\1\uffff\54\57\11\uffff\1\60\1\56\1\57\2\0\1\57\2\0\1\57\4\uffff\52\57\1\uffff\4\57\1\60\1\56\1\0\1\uffff\1\0\12\57\1\uffff\16\57\1\uffff\11\57\1\uffff\17\57\1\55\42\57\2\uffff\2\57\1\uffff\3\57\4\uffff\1\57\12\uffff\11\57\1\uffff\21\57\2\uffff\3\57\7\uffff\4\57\2\uffff\10\57\2\uffff\2\57\2\uffff\12\57\2\uffff\2\57\6\uffff\1\57\1\uffff\1\57\4\uffff\10\57\1\uffff\4\57\1\uffff\3\57\4\uffff\3\57\5\uffff\14\57\1\uffff\1\57\2\uffff\2\57\1\uffff\5\57\1\uffff\25\57\2\uffff\7\57\1\uffff\3\57\1\uffff\3\57\1\uffff\5\57\1\uffff\6\57\2\uffff\4\57\2\uffff\3\57\1\uffff\2\57\1\uffff\1\57\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\31\172\1\135\3\uffff\4\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\1\172\1\uffff\1\172\1\uffff\54\172\11\uffff\1\71\1\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\52\172\1\uffff\4\172\1\71\1\145\1\uffff\1\uffff\1\uffff\12\172\1\uffff\16\172\1\uffff\11\172\1\uffff\17\172\1\55\42\172\2\uffff\2\172\1\uffff\3\172\4\uffff\1\172\12\uffff\11\172\1\uffff\21\172\2\uffff\3\172\7\uffff\4\172\2\uffff\10\172\2\uffff\2\172\2\uffff\12\172\2\uffff\2\172\6\uffff\1\172\1\uffff\1\172\4\uffff\10\172\1\uffff\4\172\1\uffff\3\172\4\uffff\3\172\5\uffff\14\172\1\uffff\1\172\2\uffff\2\172\1\uffff\5\172\1\uffff\25\172\2\uffff\7\172\1\uffff\3\172\1\uffff\3\172\1\uffff\5\172\1\uffff\6\172\2\uffff\4\172\2\uffff\3\172\1\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA30_acceptS =
        "\33\uffff\1\121\1\122\1\124\10\uffff\1\133\1\uffff\1\134\1\uffff\1\141\1\142\1\uffff\1\136\1\uffff\1\132\54\uffff\1\120\1\123\1\121\1\122\1\124\1\125\1\131\1\130\1\127\11\uffff\1\133\1\140\1\135\1\141\52\uffff\1\117\7\uffff\1\137\13\uffff\1\113\16\uffff\1\110\11\uffff\1\116\62\uffff\1\62\1\107\2\uffff\1\102\3\uffff\1\60\1\104\1\61\1\105\1\uffff\1\72\1\106\1\76\1\112\1\111\1\77\1\115\1\114\1\126\1\103\11\uffff\1\64\21\uffff\1\50\1\100\3\uffff\1\42\1\73\1\43\1\74\1\44\1\75\1\51\4\uffff\1\71\1\101\10\uffff\1\31\1\65\2\uffff\1\37\1\57\12\uffff\1\46\1\63\2\uffff\1\32\1\66\1\33\1\67\1\34\1\70\1\uffff\1\52\1\uffff\1\53\1\54\1\55\1\56\10\uffff\1\47\4\uffff\1\24\3\uffff\1\21\1\40\1\22\1\41\3\uffff\1\30\1\27\1\45\1\35\1\36\14\uffff\1\25\1\uffff\1\20\1\26\2\uffff\1\23\5\uffff\1\17\25\uffff\1\15\1\16\7\uffff\1\14\3\uffff\1\13\3\uffff\1\12\5\uffff\1\11\6\uffff\1\7\1\10\4\uffff\1\5\1\6\3\uffff\1\4\2\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA30_specialS =
        "\1\1\43\uffff\1\7\1\4\102\uffff\1\10\1\6\1\uffff\1\0\1\3\66\uffff\1\5\1\uffff\1\2\u013e\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\44\1\46\3\53\1\45\4\53\1\33\1\40\1\53\1\47\1\36\2\37\7\41\1\34\6\53\1\20\1\15\1\43\1\21\1\1\1\43\1\4\1\22\1\16\2\43\1\31\3\43\1\3\1\43\1\2\1\23\7\43\1\32\1\53\1\35\1\42\1\43\1\53\1\6\1\24\1\43\1\7\1\43\1\10\1\26\1\43\1\17\3\43\1\13\1\27\1\43\1\11\1\43\1\12\1\5\1\30\1\14\1\25\4\43\3\53\1\51\uff81\53",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\27\56\1\54\2\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\60\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\62\20\56\1\61\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\63\5\56\1\64\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\65\12\56\1\70\1\56\1\71\1\56\1\67\1\66\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\72\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\73\17\56\1\74\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\100\3\56\1\76\6\56\1\77\5\56\1\75\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\101\23\56\1\102\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\103\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\104\15\56\1\105\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\106\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\110\15\56\1\107\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\111\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\112\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\114\3\56\1\113\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\116\15\56\1\115\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\117\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\120\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\121\11\56\1\122\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\123\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\124\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\126\15\56\1\125\3\56\1\127\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\131\10\56\1\132\6\56\1\130\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\133\21\56",
            "\1\134",
            "",
            "",
            "",
            "\1\144\1\uffff\12\142\10\uffff\1\141\2\uffff\1\144\34\uffff\1\141\2\uffff\1\144",
            "\1\144\1\uffff\12\145\13\uffff\1\144\37\uffff\1\144",
            "\1\144\1\uffff\12\146\13\uffff\1\144\37\uffff\1\144",
            "\1\144\26\uffff\1\144\37\uffff\1\144",
            "\32\147\4\uffff\1\147\1\uffff\32\147",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "",
            "\1\160\4\uffff\1\160\2\uffff\1\157\26\uffff\32\50\3\uffff\2\50\1\uffff\32\50",
            "",
            "\1\160\4\uffff\1\160",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\162\6\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\163\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\164\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\165\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\166\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\167\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\170\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\171\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\172\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\173\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\174\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\175\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\177\11\56\1\176\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0080\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0081\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0082\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0083\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0084\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0085\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u0086\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\20\56\1\u0088\1\56\1\u0087\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0089\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u008a\23\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u008b\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u008c\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u008d\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u008e\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u008f\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0090\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u0091\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0092\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0093\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0094\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0095\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0096\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0097\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0098\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0099\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u009a\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u009b\15\56",
            "\1\50\12\56\1\u009c\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u009d\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u009e\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u009f\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00a0\7\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a1",
            "\1\144\1\uffff\12\u00a2\13\uffff\1\144\37\uffff\1\144",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\0\u00a3",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "\1\160\15\uffff\1\57",
            "\0\u00a5",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "\1\160\15\uffff\1\57",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a6\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a7\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00a8\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a9\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00aa\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00ab\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00ac\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00ad\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00ae\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00af\27\56",
            "\1\50\12\56\1\u00b0\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00b1\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b2\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b3\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b4\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00b5\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00b6\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b7\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00b8\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b9\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00ba\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00bb\4\56\1\u00bc\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00bd\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00be\7\56",
            "\1\50\12\56\1\u00bf\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00c0\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00c1\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c2\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c3\25\56",
            "\1\50\1\56\1\u00c4\1\56\1\u00c5\2\56\1\u00c6\1\56\1\u00c7\1\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00c8\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00ca\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00cb\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00cc\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00cd\13\56\1\u00ce\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00cf\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d0\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00d1\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00d2\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d3\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d4\25\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d5\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d6\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d7\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00d8\6\56",
            "\12\u00d9",
            "\1\144\1\uffff\12\u00a2\13\uffff\1\144\37\uffff\1\144",
            "\42\151\1\152\71\151\1\150\uffa3\151",
            "",
            "\47\154\1\155\64\154\1\153\uffa3\154",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00da\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00db\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00dc\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00dd\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00de\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00df\22\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00e0\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00e1\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00e2\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00e3\7\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00e4\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00e5\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00e6\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00e7\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\6\56\1\u00e8\23\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00e9\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ea\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00eb\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00ec\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00ed\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00ee\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00ef\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f0\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00f1\31\56",
            "",
            "\1\50\1\56\1\u00f2\1\56\1\u00f3\2\56\1\u00f4\1\56\1\u00f5\1\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f6\25\56",
            "\1\50\6\56\1\u00f7\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00f8\23\56",
            "\1\50\6\56\1\u00f9\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u00fa\7\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u00fb\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u00fc\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u00fe\1\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00ff\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0101\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0102\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0103\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0104\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0106\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0108\25\56",
            "\1\50\12\56\1\u0109\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u010b\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u010e\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\142",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0113\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0114\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0115\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0116\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0117\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u0118\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0119\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u011a\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u011b\23\56",
            "\1\50\12\56\1\u011c\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u011d\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u011e\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u011f\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0120\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0121\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0122\31\56",
            "\1\50\3\56\1\u0123\2\56\1\u0124\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0125\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0126\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0127\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0128\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0129\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u012a\23\56",
            "\1\50\6\56\1\u012b\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u012c\7\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u012d\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u012e\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0130\31\56",
            "\1\50\4\56\1\u0131\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0132\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0133\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0135\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0137\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\1\u0139\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u013a\25\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u013b\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u013c\23\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u013d\6\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\1\u013e\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0140\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u0141\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0142\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0143\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u0144\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0145\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0146\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0147\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0148\3\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\1\u014c\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u014a\17\56\1\u014b\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u014e\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u014f\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0150\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0151\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0152\27\56",
            "\1\50\2\56\1\u0153\7\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u0154\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0155\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u0156\22\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0157\7\56",
            "\1\50\12\56\1\u0158\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u015a\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u015b\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u015c\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u015e\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0160\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0162\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0164\10\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0169\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u016a\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u016b\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u016c\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u016d\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u016e\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u016f\17\56\1\u0170\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u0172\30\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0173\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0174\25\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0175\14\56",
            "\1\50\12\56\1\u0176\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0177\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\21\56\1\u0178\10\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u0179\17\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u017a\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u017c\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u017e\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u017f\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0180\25\56",
            "",
            "",
            "\1\50\12\56\1\u0181\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0182\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\3\56\1\u0186\26\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u0187\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0188\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0189\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u018a\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018b\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u018c\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018d\25\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018e\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u018f\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0190\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0191\27\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0193\25\56",
            "\1\50\12\56\1\u0194\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0196\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0197\10\56",
            "\1\50\12\56\1\u0198\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0199\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u019a\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u019b\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\1\u019c\31\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u019d\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u019f\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01a0\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01a1\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01a2\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u01a3\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u01a4\21\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01a5\12\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01a6\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01a7\7\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01a8\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01a9\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01aa\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01ab\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01ac\7\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01ad\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u01ae\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01af\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01b0\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b1\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b2\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u01b3\13\56",
            "\1\50\12\56\1\u01b4\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u01b5\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b6\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b7\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01b8\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u01b9\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01ba\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01bb\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01bc\25\56",
            "\1\50\12\56\1\u01bd\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01be\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01bf\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01c0\7\56",
            "\1\50\12\56\1\u01c1\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01c2\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01c3\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01c4\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01c6\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01c7\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01c8\10\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01c9\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01ca\7\56",
            "\1\50\12\56\1\u01cb\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u01cc\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01cd\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01ce\31\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01cf\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01d0\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u01d1\7\56",
            "\1\50\12\56\1\u01d2\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u01d3\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01d4\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01d5\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01d6\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01d7\25\56",
            "\1\50\12\56\1\u01d8\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u01d9\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u01da\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01db\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01dc\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01de\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01df\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u01e1\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( ExternalDependency | RelativeNamespace | PrivateNamespace | GlobalNamespace | Serviceclients | Serviceservers | Actionclients | Actionservers | Dependencies | ParameterAny | FromGitRepo | Subscribers | Parameters | Publishers | GraphName | Feedback_1 | Float32_1 | Float64_1 | Response | Default | Duration | Feedback | Message_1 | Request | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Action_1 | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Result_1 | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | Specs | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Goal_1 | Int16 | Int32 | Int64 | Node_1 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Msg | Name | Node | Srv | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA30_107 = input.LA(1);

                        s = -1;
                        if ( ((LA30_107>='\u0000' && LA30_107<='\uFFFF')) ) {s = 165;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
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
                    case 2 :
                        int LA30_165 = input.LA(1);

                        s = -1;
                        if ( (LA30_165=='\'') ) {s = 109;}

                        else if ( (LA30_165=='\\') ) {s = 107;}

                        else if ( ((LA30_165>='\u0000' && LA30_165<='&')||(LA30_165>='(' && LA30_165<='[')||(LA30_165>=']' && LA30_165<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA30_108 = input.LA(1);

                        s = -1;
                        if ( (LA30_108=='\'') ) {s = 109;}

                        else if ( (LA30_108=='\\') ) {s = 107;}

                        else if ( ((LA30_108>='\u0000' && LA30_108<='&')||(LA30_108>='(' && LA30_108<='[')||(LA30_108>=']' && LA30_108<='\uFFFF')) ) {s = 108;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA30_37 = input.LA(1);

                        s = -1;
                        if ( (LA30_37=='\\') ) {s = 107;}

                        else if ( ((LA30_37>='\u0000' && LA30_37<='&')||(LA30_37>='(' && LA30_37<='[')||(LA30_37>=']' && LA30_37<='\uFFFF')) ) {s = 108;}

                        else if ( (LA30_37=='\'') ) {s = 109;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA30_163 = input.LA(1);

                        s = -1;
                        if ( (LA30_163=='\"') ) {s = 106;}

                        else if ( (LA30_163=='\\') ) {s = 104;}

                        else if ( ((LA30_163>='\u0000' && LA30_163<='!')||(LA30_163>='#' && LA30_163<='[')||(LA30_163>=']' && LA30_163<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 :
                        int LA30_105 = input.LA(1);

                        s = -1;
                        if ( (LA30_105=='\"') ) {s = 106;}

                        else if ( (LA30_105=='\\') ) {s = 104;}

                        else if ( ((LA30_105>='\u0000' && LA30_105<='!')||(LA30_105>='#' && LA30_105<='[')||(LA30_105>=']' && LA30_105<='\uFFFF')) ) {s = 105;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 :
                        int LA30_36 = input.LA(1);

                        s = -1;
                        if ( (LA30_36=='\\') ) {s = 104;}

                        else if ( ((LA30_36>='\u0000' && LA30_36<='!')||(LA30_36>='#' && LA30_36<='[')||(LA30_36>=']' && LA30_36<='\uFFFF')) ) {s = 105;}

                        else if ( (LA30_36=='\"') ) {s = 106;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 8 :
                        int LA30_104 = input.LA(1);

                        s = -1;
                        if ( ((LA30_104>='\u0000' && LA30_104<='\uFFFF')) ) {s = 163;}

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
