package de.fraunhofer.ipa.rossystem.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemLexer extends Lexer {
    public static final int Connections=8;
    public static final int Float32_1=13;
    public static final int Node=68;
    public static final int RULE_DATE_TIME=92;
    public static final int Uint64_1=22;
    public static final int String=37;
    public static final int Processes=11;
    public static final int Int16=51;
    public static final int Float32=25;
    public static final int Goal=65;
    public static final int Bool=63;
    public static final int Uint16=46;
    public static final int Boolean=23;
    public static final int Sub=55;
    public static final int Uint8=57;
    public static final int Parameters=10;
    public static final int RULE_ID=93;
    public static final int RULE_DIGIT=82;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=27;
    public static final int Header=36;
    public static final int RULE_INT=95;
    public static final int Byte=64;
    public static final int RULE_ML_COMMENT=102;
    public static final int LeftSquareBracket=80;
    public static final int Ac=61;
    public static final int Base64=34;
    public static final int Comma=77;
    public static final int As=62;
    public static final int HyphenMinus=78;
    public static final int RULE_MESSAGE_ASIGMENT=96;
    public static final int LeftSquareBracketRightSquareBracket=76;
    public static final int Int32=52;
    public static final int RULE_DECINT=85;
    public static final int Uint32=47;
    public static final int RULE_HOUR=90;
    public static final int Int8=66;
    public static final int Default=15;
    public static final int Int8_1=42;
    public static final int Uint16_1=20;
    public static final int Sc=69;
    public static final int Type=72;
    public static final int Float64=26;
    public static final int Int32_1=28;
    public static final int RULE_BINARY=83;
    public static final int String_1=45;
    public static final int String_2=18;
    public static final int Ss=70;
    public static final int RULE_DAY=87;
    public static final int RULE_BEGIN=97;
    public static final int RULE_BOOLEAN=84;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=89;
    public static final int Result=44;
    public static final int Name=67;
    public static final int RULE_MIN_SEC=91;
    public static final int ParameterAny=7;
    public static final int List=60;
    public static final int RightSquareBracket=81;
    public static final int PrivateNamespace=5;
    public static final int GraphName=12;
    public static final int Byte_1=41;
    public static final int Float64_1=14;
    public static final int Duration=16;
    public static final int Uint32_1=21;
    public static final int Double=35;
    public static final int Type_1=56;
    public static final int Value=58;
    public static final int Uint64=48;
    public static final int Action=39;
    public static final int RULE_END=98;
    public static final int Message=30;
    public static final int Value_1=49;
    public static final int Time=71;
    public static final int RULE_STRING=94;
    public static final int Bool_1=40;
    public static final int Any=73;
    public static final int Struct=38;
    public static final int RULE_SL_COMMENT=99;
    public static final int Uint8_1=32;
    public static final int RULE_DOUBLE=86;
    public static final int Feedback=17;
    public static final int RULE_ROS_CONVENTION_A=100;
    public static final int RULE_ROS_CONVENTION_PARAM=101;
    public static final int Colon=79;
    public static final int Pub=54;
    public static final int EOF=-1;
    public static final int Ns=74;
    public static final int RULE_WS=103;
    public static final int HyphenMinusLeftSquareBracket=75;
    public static final int Int64_1=29;
    public static final int Service=31;
    public static final int From=50;
    public static final int RULE_ANY_OTHER=104;
    public static final int Nodes=43;
    public static final int Date=59;
    public static final int Interfaces=9;
    public static final int Threads=19;
    public static final int Integer=24;
    public static final int Array=33;
    public static final int Int64=53;
    public static final int RULE_MONTH=88;

    // delegates
    // delegators

    public InternalRosSystemLexer() {;} 
    public InternalRosSystemLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRosSystemLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRosSystemLexer.g"; }

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:14:19: ( 'RelativeNamespace' )
            // InternalRosSystemLexer.g:14:21: 'RelativeNamespace'
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
            // InternalRosSystemLexer.g:16:18: ( 'PrivateNamespace' )
            // InternalRosSystemLexer.g:16:20: 'PrivateNamespace'
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
            // InternalRosSystemLexer.g:18:17: ( 'GlobalNamespace' )
            // InternalRosSystemLexer.g:18:19: 'GlobalNamespace'
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

    // $ANTLR start "ParameterAny"
    public final void mParameterAny() throws RecognitionException {
        try {
            int _type = ParameterAny;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:20:14: ( 'ParameterAny' )
            // InternalRosSystemLexer.g:20:16: 'ParameterAny'
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

    // $ANTLR start "Connections"
    public final void mConnections() throws RecognitionException {
        try {
            int _type = Connections;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:22:13: ( 'connections:' )
            // InternalRosSystemLexer.g:22:15: 'connections:'
            {
            match("connections:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Connections"

    // $ANTLR start "Interfaces"
    public final void mInterfaces() throws RecognitionException {
        try {
            int _type = Interfaces;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:24:12: ( 'interfaces:' )
            // InternalRosSystemLexer.g:24:14: 'interfaces:'
            {
            match("interfaces:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interfaces"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:26:12: ( 'parameters:' )
            // InternalRosSystemLexer.g:26:14: 'parameters:'
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

    // $ANTLR start "Processes"
    public final void mProcesses() throws RecognitionException {
        try {
            int _type = Processes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:28:11: ( 'processes:' )
            // InternalRosSystemLexer.g:28:13: 'processes:'
            {
            match("processes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Processes"

    // $ANTLR start "GraphName"
    public final void mGraphName() throws RecognitionException {
        try {
            int _type = GraphName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:30:11: ( 'GraphName' )
            // InternalRosSystemLexer.g:30:13: 'GraphName'
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
            // InternalRosSystemLexer.g:32:11: ( 'float32[]' )
            // InternalRosSystemLexer.g:32:13: 'float32[]'
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
            // InternalRosSystemLexer.g:34:11: ( 'float64[]' )
            // InternalRosSystemLexer.g:34:13: 'float64[]'
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

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:36:9: ( 'default:' )
            // InternalRosSystemLexer.g:36:11: 'default:'
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
            // InternalRosSystemLexer.g:38:10: ( 'duration' )
            // InternalRosSystemLexer.g:38:12: 'duration'
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
            // InternalRosSystemLexer.g:40:10: ( 'feedback' )
            // InternalRosSystemLexer.g:40:12: 'feedback'
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

    // $ANTLR start "String_2"
    public final void mString_2() throws RecognitionException {
        try {
            int _type = String_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:42:10: ( 'string[]' )
            // InternalRosSystemLexer.g:42:12: 'string[]'
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

    // $ANTLR start "Threads"
    public final void mThreads() throws RecognitionException {
        try {
            int _type = Threads;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:44:9: ( 'threads:' )
            // InternalRosSystemLexer.g:44:11: 'threads:'
            {
            match("threads:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Threads"

    // $ANTLR start "Uint16_1"
    public final void mUint16_1() throws RecognitionException {
        try {
            int _type = Uint16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:46:10: ( 'uint16[]' )
            // InternalRosSystemLexer.g:46:12: 'uint16[]'
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
            // InternalRosSystemLexer.g:48:10: ( 'uint32[]' )
            // InternalRosSystemLexer.g:48:12: 'uint32[]'
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
            // InternalRosSystemLexer.g:50:10: ( 'uint64[]' )
            // InternalRosSystemLexer.g:50:12: 'uint64[]'
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
            // InternalRosSystemLexer.g:52:9: ( 'Boolean' )
            // InternalRosSystemLexer.g:52:11: 'Boolean'
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
            // InternalRosSystemLexer.g:54:9: ( 'Integer' )
            // InternalRosSystemLexer.g:54:11: 'Integer'
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
            // InternalRosSystemLexer.g:56:9: ( 'float32' )
            // InternalRosSystemLexer.g:56:11: 'float32'
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
            // InternalRosSystemLexer.g:58:9: ( 'float64' )
            // InternalRosSystemLexer.g:58:11: 'float64'
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
            // InternalRosSystemLexer.g:60:9: ( 'int16[]' )
            // InternalRosSystemLexer.g:60:11: 'int16[]'
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
            // InternalRosSystemLexer.g:62:9: ( 'int32[]' )
            // InternalRosSystemLexer.g:62:11: 'int32[]'
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
            // InternalRosSystemLexer.g:64:9: ( 'int64[]' )
            // InternalRosSystemLexer.g:64:11: 'int64[]'
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
            // InternalRosSystemLexer.g:66:9: ( 'message' )
            // InternalRosSystemLexer.g:66:11: 'message'
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

    // $ANTLR start "Service"
    public final void mService() throws RecognitionException {
        try {
            int _type = Service;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:68:9: ( 'service' )
            // InternalRosSystemLexer.g:68:11: 'service'
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
            // InternalRosSystemLexer.g:70:9: ( 'uint8[]' )
            // InternalRosSystemLexer.g:70:11: 'uint8[]'
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
            // InternalRosSystemLexer.g:72:7: ( 'Array:' )
            // InternalRosSystemLexer.g:72:9: 'Array:'
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
            // InternalRosSystemLexer.g:74:8: ( 'Base64' )
            // InternalRosSystemLexer.g:74:10: 'Base64'
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
            // InternalRosSystemLexer.g:76:8: ( 'Double' )
            // InternalRosSystemLexer.g:76:10: 'Double'
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
            // InternalRosSystemLexer.g:78:8: ( 'Header' )
            // InternalRosSystemLexer.g:78:10: 'Header'
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
            // InternalRosSystemLexer.g:80:8: ( 'String' )
            // InternalRosSystemLexer.g:80:10: 'String'
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
            // InternalRosSystemLexer.g:82:8: ( 'Struct' )
            // InternalRosSystemLexer.g:82:10: 'Struct'
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
            // InternalRosSystemLexer.g:84:8: ( 'action' )
            // InternalRosSystemLexer.g:84:10: 'action'
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
            // InternalRosSystemLexer.g:86:8: ( 'bool[]' )
            // InternalRosSystemLexer.g:86:10: 'bool[]'
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
            // InternalRosSystemLexer.g:88:8: ( 'byte[]' )
            // InternalRosSystemLexer.g:88:10: 'byte[]'
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
            // InternalRosSystemLexer.g:90:8: ( 'int8[]' )
            // InternalRosSystemLexer.g:90:10: 'int8[]'
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

    // $ANTLR start "Nodes"
    public final void mNodes() throws RecognitionException {
        try {
            int _type = Nodes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:92:7: ( 'nodes:' )
            // InternalRosSystemLexer.g:92:9: 'nodes:'
            {
            match("nodes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nodes"

    // $ANTLR start "Result"
    public final void mResult() throws RecognitionException {
        try {
            int _type = Result;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:94:8: ( 'result' )
            // InternalRosSystemLexer.g:94:10: 'result'
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
            // InternalRosSystemLexer.g:96:10: ( 'string' )
            // InternalRosSystemLexer.g:96:12: 'string'
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
            // InternalRosSystemLexer.g:98:8: ( 'uint16' )
            // InternalRosSystemLexer.g:98:10: 'uint16'
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
            // InternalRosSystemLexer.g:100:8: ( 'uint32' )
            // InternalRosSystemLexer.g:100:10: 'uint32'
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
            // InternalRosSystemLexer.g:102:8: ( 'uint64' )
            // InternalRosSystemLexer.g:102:10: 'uint64'
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
            // InternalRosSystemLexer.g:104:9: ( 'value:' )
            // InternalRosSystemLexer.g:104:11: 'value:'
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

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:106:6: ( 'from:' )
            // InternalRosSystemLexer.g:106:8: 'from:'
            {
            match("from:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Int16"
    public final void mInt16() throws RecognitionException {
        try {
            int _type = Int16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:108:7: ( 'int16' )
            // InternalRosSystemLexer.g:108:9: 'int16'
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
            // InternalRosSystemLexer.g:110:7: ( 'int32' )
            // InternalRosSystemLexer.g:110:9: 'int32'
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
            // InternalRosSystemLexer.g:112:7: ( 'int64' )
            // InternalRosSystemLexer.g:112:9: 'int64'
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

    // $ANTLR start "Pub"
    public final void mPub() throws RecognitionException {
        try {
            int _type = Pub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:114:5: ( 'pub->' )
            // InternalRosSystemLexer.g:114:7: 'pub->'
            {
            match("pub->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pub"

    // $ANTLR start "Sub"
    public final void mSub() throws RecognitionException {
        try {
            int _type = Sub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:116:5: ( 'sub->' )
            // InternalRosSystemLexer.g:116:7: 'sub->'
            {
            match("sub->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sub"

    // $ANTLR start "Type_1"
    public final void mType_1() throws RecognitionException {
        try {
            int _type = Type_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:118:8: ( 'type:' )
            // InternalRosSystemLexer.g:118:10: 'type:'
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
            // InternalRosSystemLexer.g:120:7: ( 'uint8' )
            // InternalRosSystemLexer.g:120:9: 'uint8'
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
            // InternalRosSystemLexer.g:122:7: ( 'value' )
            // InternalRosSystemLexer.g:122:9: 'value'
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
            // InternalRosSystemLexer.g:124:6: ( 'Date' )
            // InternalRosSystemLexer.g:124:8: 'Date'
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
            // InternalRosSystemLexer.g:126:6: ( 'List' )
            // InternalRosSystemLexer.g:126:8: 'List'
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

    // $ANTLR start "Ac"
    public final void mAc() throws RecognitionException {
        try {
            int _type = Ac;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:128:4: ( 'ac->' )
            // InternalRosSystemLexer.g:128:6: 'ac->'
            {
            match("ac->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ac"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:130:4: ( 'as->' )
            // InternalRosSystemLexer.g:130:6: 'as->'
            {
            match("as->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "As"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:132:6: ( 'bool' )
            // InternalRosSystemLexer.g:132:8: 'bool'
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
            // InternalRosSystemLexer.g:134:6: ( 'byte' )
            // InternalRosSystemLexer.g:134:8: 'byte'
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
            // InternalRosSystemLexer.g:136:6: ( 'goal' )
            // InternalRosSystemLexer.g:136:8: 'goal'
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
            // InternalRosSystemLexer.g:138:6: ( 'int8' )
            // InternalRosSystemLexer.g:138:8: 'int8'
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
            // InternalRosSystemLexer.g:140:6: ( 'name' )
            // InternalRosSystemLexer.g:140:8: 'name'
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
            // InternalRosSystemLexer.g:142:6: ( 'node' )
            // InternalRosSystemLexer.g:142:8: 'node'
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

    // $ANTLR start "Sc"
    public final void mSc() throws RecognitionException {
        try {
            int _type = Sc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:144:4: ( 'sc->' )
            // InternalRosSystemLexer.g:144:6: 'sc->'
            {
            match("sc->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Sc"

    // $ANTLR start "Ss"
    public final void mSs() throws RecognitionException {
        try {
            int _type = Ss;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:146:4: ( 'ss->' )
            // InternalRosSystemLexer.g:146:6: 'ss->'
            {
            match("ss->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ss"

    // $ANTLR start "Time"
    public final void mTime() throws RecognitionException {
        try {
            int _type = Time;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:148:6: ( 'time' )
            // InternalRosSystemLexer.g:148:8: 'time'
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
            // InternalRosSystemLexer.g:150:6: ( 'type' )
            // InternalRosSystemLexer.g:150:8: 'type'
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
            // InternalRosSystemLexer.g:152:5: ( 'Any' )
            // InternalRosSystemLexer.g:152:7: 'Any'
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
            // InternalRosSystemLexer.g:154:4: ( 'ns:' )
            // InternalRosSystemLexer.g:154:6: 'ns:'
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

    // $ANTLR start "HyphenMinusLeftSquareBracket"
    public final void mHyphenMinusLeftSquareBracket() throws RecognitionException {
        try {
            int _type = HyphenMinusLeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:156:30: ( '-[' )
            // InternalRosSystemLexer.g:156:32: '-['
            {
            match("-["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusLeftSquareBracket"

    // $ANTLR start "LeftSquareBracketRightSquareBracket"
    public final void mLeftSquareBracketRightSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracketRightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:158:37: ( '[]' )
            // InternalRosSystemLexer.g:158:39: '[]'
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
            // InternalRosSystemLexer.g:160:7: ( ',' )
            // InternalRosSystemLexer.g:160:9: ','
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

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:162:13: ( '-' )
            // InternalRosSystemLexer.g:162:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:164:7: ( ':' )
            // InternalRosSystemLexer.g:164:9: ':'
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
            // InternalRosSystemLexer.g:166:19: ( '[' )
            // InternalRosSystemLexer.g:166:21: '['
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
            // InternalRosSystemLexer.g:168:20: ( ']' )
            // InternalRosSystemLexer.g:168:22: ']'
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
            // InternalRosSystemLexer.g:170:21: ( '0' .. '9' )
            // InternalRosSystemLexer.g:170:23: '0' .. '9'
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
            // InternalRosSystemLexer.g:172:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosSystemLexer.g:172:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosSystemLexer.g:172:15: ( '0b' | '0B' )
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
                    // InternalRosSystemLexer.g:172:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:172:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosSystemLexer.g:172:27: ( '0' | '1' )+
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
            	    // InternalRosSystemLexer.g:
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
            // InternalRosSystemLexer.g:174:14: ( ( 'true' | 'false' ) )
            // InternalRosSystemLexer.g:174:16: ( 'true' | 'false' )
            {
            // InternalRosSystemLexer.g:174:16: ( 'true' | 'false' )
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
                    // InternalRosSystemLexer.g:174:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:174:24: 'false'
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
            // InternalRosSystemLexer.g:176:13: ( ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRosSystemLexer.g:176:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            // InternalRosSystemLexer.g:176:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:176:16: RULE_DIGIT
                    {
                    mRULE_DIGIT(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:176:27: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalRosSystemLexer.g:176:31: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:176:31: RULE_DIGIT
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

            // InternalRosSystemLexer.g:176:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalRosSystemLexer.g:176:45: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRosSystemLexer.g:176:49: ( RULE_DECINT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:176:49: RULE_DECINT
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
                    // InternalRosSystemLexer.g:176:62: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRosSystemLexer.g:176:62: ( '.' ( RULE_DIGIT )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRosSystemLexer.g:176:63: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosSystemLexer.g:176:67: ( RULE_DIGIT )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalRosSystemLexer.g:176:67: RULE_DIGIT
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

                    // InternalRosSystemLexer.g:176:91: ( '-' | '+' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRosSystemLexer.g:
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
            // InternalRosSystemLexer.g:178:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:178:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:178:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:178:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:178:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosSystemLexer.g:178:29: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:178:29: RULE_DIGIT
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
                    // InternalRosSystemLexer.g:178:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosSystemLexer.g:178:54: ( RULE_DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:178:54: RULE_DIGIT
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
            // InternalRosSystemLexer.g:180:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosSystemLexer.g:180:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosSystemLexer.g:180:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosSystemLexer.g:180:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:180:31: '1' .. '3' '0' .. '9'
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
            // InternalRosSystemLexer.g:182:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosSystemLexer.g:182:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosSystemLexer.g:182:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosSystemLexer.g:182:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:182:33: '1' '0' .. '2'
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
            // InternalRosSystemLexer.g:184:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosSystemLexer.g:184:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosSystemLexer.g:186:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosSystemLexer.g:186:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosSystemLexer.g:186:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosSystemLexer.g:186:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:186:41: '2' '0' .. '3'
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
            // InternalRosSystemLexer.g:188:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosSystemLexer.g:188:25: '0' .. '5' '0' .. '9'
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
            // InternalRosSystemLexer.g:190:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosSystemLexer.g:190:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosSystemLexer.g:192:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosSystemLexer.g:192:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosSystemLexer.g:192:25: ( RULE_ID | RULE_STRING )
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
                    // InternalRosSystemLexer.g:192:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:192:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRosSystemLexer.g:192:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalRosSystemLexer.g:192:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:192:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRosSystemLexer.g:192:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRosSystemLexer.g:192:81: '-' RULE_INT
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
            // InternalRosSystemLexer.g:194:21: ()
            // InternalRosSystemLexer.g:194:23: 
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
            // InternalRosSystemLexer.g:196:19: ()
            // InternalRosSystemLexer.g:196:21: 
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
            // InternalRosSystemLexer.g:198:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosSystemLexer.g:198:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRosSystemLexer.g:198:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRosSystemLexer.g:198:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalRosSystemLexer.g:200:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosSystemLexer.g:200:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosSystemLexer.g:200:25: ( '/' RULE_ID | RULE_ID '/' )*
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
            	    // InternalRosSystemLexer.g:200:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:200:38: RULE_ID '/'
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
            // InternalRosSystemLexer.g:202:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosSystemLexer.g:202:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosSystemLexer.g:202:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
            	    // InternalRosSystemLexer.g:202:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:202:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystemLexer.g:202:62: '~' RULE_STRING
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
            // InternalRosSystemLexer.g:204:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystemLexer.g:204:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystemLexer.g:204:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystemLexer.g:204:11: '^'
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

            // InternalRosSystemLexer.g:204:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRosSystemLexer.g:
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
            // InternalRosSystemLexer.g:206:19: ( ( '0' .. '9' )+ )
            // InternalRosSystemLexer.g:206:21: ( '0' .. '9' )+
            {
            // InternalRosSystemLexer.g:206:21: ( '0' .. '9' )+
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
            	    // InternalRosSystemLexer.g:206:22: '0' .. '9'
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
            // InternalRosSystemLexer.g:208:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystemLexer.g:208:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystemLexer.g:208:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRosSystemLexer.g:208:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosSystemLexer.g:208:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRosSystemLexer.g:208:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:208:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRosSystemLexer.g:208:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosSystemLexer.g:208:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRosSystemLexer.g:208:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:208:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRosSystemLexer.g:210:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystemLexer.g:210:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosSystemLexer.g:210:24: ( options {greedy=false; } : . )*
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
            	    // InternalRosSystemLexer.g:210:52: .
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
            // InternalRosSystemLexer.g:212:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystemLexer.g:212:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystemLexer.g:212:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalRosSystemLexer.g:
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
            // InternalRosSystemLexer.g:214:16: ( . )
            // InternalRosSystemLexer.g:214:18: .
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
        // InternalRosSystemLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Pub | Sub | Type_1 | Uint8 | Value | Date | List | Ac | As | Bool | Byte | Goal | Int8 | Name | Node | Sc | Ss | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=92;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalRosSystemLexer.g:1:10: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 2 :
                // InternalRosSystemLexer.g:1:28: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 3 :
                // InternalRosSystemLexer.g:1:45: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 4 :
                // InternalRosSystemLexer.g:1:61: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 5 :
                // InternalRosSystemLexer.g:1:74: Connections
                {
                mConnections(); 

                }
                break;
            case 6 :
                // InternalRosSystemLexer.g:1:86: Interfaces
                {
                mInterfaces(); 

                }
                break;
            case 7 :
                // InternalRosSystemLexer.g:1:97: Parameters
                {
                mParameters(); 

                }
                break;
            case 8 :
                // InternalRosSystemLexer.g:1:108: Processes
                {
                mProcesses(); 

                }
                break;
            case 9 :
                // InternalRosSystemLexer.g:1:118: GraphName
                {
                mGraphName(); 

                }
                break;
            case 10 :
                // InternalRosSystemLexer.g:1:128: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 11 :
                // InternalRosSystemLexer.g:1:138: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 12 :
                // InternalRosSystemLexer.g:1:148: Default
                {
                mDefault(); 

                }
                break;
            case 13 :
                // InternalRosSystemLexer.g:1:156: Duration
                {
                mDuration(); 

                }
                break;
            case 14 :
                // InternalRosSystemLexer.g:1:165: Feedback
                {
                mFeedback(); 

                }
                break;
            case 15 :
                // InternalRosSystemLexer.g:1:174: String_2
                {
                mString_2(); 

                }
                break;
            case 16 :
                // InternalRosSystemLexer.g:1:183: Threads
                {
                mThreads(); 

                }
                break;
            case 17 :
                // InternalRosSystemLexer.g:1:191: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 18 :
                // InternalRosSystemLexer.g:1:200: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 19 :
                // InternalRosSystemLexer.g:1:209: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 20 :
                // InternalRosSystemLexer.g:1:218: Boolean
                {
                mBoolean(); 

                }
                break;
            case 21 :
                // InternalRosSystemLexer.g:1:226: Integer
                {
                mInteger(); 

                }
                break;
            case 22 :
                // InternalRosSystemLexer.g:1:234: Float32
                {
                mFloat32(); 

                }
                break;
            case 23 :
                // InternalRosSystemLexer.g:1:242: Float64
                {
                mFloat64(); 

                }
                break;
            case 24 :
                // InternalRosSystemLexer.g:1:250: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 25 :
                // InternalRosSystemLexer.g:1:258: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 26 :
                // InternalRosSystemLexer.g:1:266: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 27 :
                // InternalRosSystemLexer.g:1:274: Message
                {
                mMessage(); 

                }
                break;
            case 28 :
                // InternalRosSystemLexer.g:1:282: Service
                {
                mService(); 

                }
                break;
            case 29 :
                // InternalRosSystemLexer.g:1:290: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 30 :
                // InternalRosSystemLexer.g:1:298: Array
                {
                mArray(); 

                }
                break;
            case 31 :
                // InternalRosSystemLexer.g:1:304: Base64
                {
                mBase64(); 

                }
                break;
            case 32 :
                // InternalRosSystemLexer.g:1:311: Double
                {
                mDouble(); 

                }
                break;
            case 33 :
                // InternalRosSystemLexer.g:1:318: Header
                {
                mHeader(); 

                }
                break;
            case 34 :
                // InternalRosSystemLexer.g:1:325: String
                {
                mString(); 

                }
                break;
            case 35 :
                // InternalRosSystemLexer.g:1:332: Struct
                {
                mStruct(); 

                }
                break;
            case 36 :
                // InternalRosSystemLexer.g:1:339: Action
                {
                mAction(); 

                }
                break;
            case 37 :
                // InternalRosSystemLexer.g:1:346: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 38 :
                // InternalRosSystemLexer.g:1:353: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 39 :
                // InternalRosSystemLexer.g:1:360: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 40 :
                // InternalRosSystemLexer.g:1:367: Nodes
                {
                mNodes(); 

                }
                break;
            case 41 :
                // InternalRosSystemLexer.g:1:373: Result
                {
                mResult(); 

                }
                break;
            case 42 :
                // InternalRosSystemLexer.g:1:380: String_1
                {
                mString_1(); 

                }
                break;
            case 43 :
                // InternalRosSystemLexer.g:1:389: Uint16
                {
                mUint16(); 

                }
                break;
            case 44 :
                // InternalRosSystemLexer.g:1:396: Uint32
                {
                mUint32(); 

                }
                break;
            case 45 :
                // InternalRosSystemLexer.g:1:403: Uint64
                {
                mUint64(); 

                }
                break;
            case 46 :
                // InternalRosSystemLexer.g:1:410: Value_1
                {
                mValue_1(); 

                }
                break;
            case 47 :
                // InternalRosSystemLexer.g:1:418: From
                {
                mFrom(); 

                }
                break;
            case 48 :
                // InternalRosSystemLexer.g:1:423: Int16
                {
                mInt16(); 

                }
                break;
            case 49 :
                // InternalRosSystemLexer.g:1:429: Int32
                {
                mInt32(); 

                }
                break;
            case 50 :
                // InternalRosSystemLexer.g:1:435: Int64
                {
                mInt64(); 

                }
                break;
            case 51 :
                // InternalRosSystemLexer.g:1:441: Pub
                {
                mPub(); 

                }
                break;
            case 52 :
                // InternalRosSystemLexer.g:1:445: Sub
                {
                mSub(); 

                }
                break;
            case 53 :
                // InternalRosSystemLexer.g:1:449: Type_1
                {
                mType_1(); 

                }
                break;
            case 54 :
                // InternalRosSystemLexer.g:1:456: Uint8
                {
                mUint8(); 

                }
                break;
            case 55 :
                // InternalRosSystemLexer.g:1:462: Value
                {
                mValue(); 

                }
                break;
            case 56 :
                // InternalRosSystemLexer.g:1:468: Date
                {
                mDate(); 

                }
                break;
            case 57 :
                // InternalRosSystemLexer.g:1:473: List
                {
                mList(); 

                }
                break;
            case 58 :
                // InternalRosSystemLexer.g:1:478: Ac
                {
                mAc(); 

                }
                break;
            case 59 :
                // InternalRosSystemLexer.g:1:481: As
                {
                mAs(); 

                }
                break;
            case 60 :
                // InternalRosSystemLexer.g:1:484: Bool
                {
                mBool(); 

                }
                break;
            case 61 :
                // InternalRosSystemLexer.g:1:489: Byte
                {
                mByte(); 

                }
                break;
            case 62 :
                // InternalRosSystemLexer.g:1:494: Goal
                {
                mGoal(); 

                }
                break;
            case 63 :
                // InternalRosSystemLexer.g:1:499: Int8
                {
                mInt8(); 

                }
                break;
            case 64 :
                // InternalRosSystemLexer.g:1:504: Name
                {
                mName(); 

                }
                break;
            case 65 :
                // InternalRosSystemLexer.g:1:509: Node
                {
                mNode(); 

                }
                break;
            case 66 :
                // InternalRosSystemLexer.g:1:514: Sc
                {
                mSc(); 

                }
                break;
            case 67 :
                // InternalRosSystemLexer.g:1:517: Ss
                {
                mSs(); 

                }
                break;
            case 68 :
                // InternalRosSystemLexer.g:1:520: Time
                {
                mTime(); 

                }
                break;
            case 69 :
                // InternalRosSystemLexer.g:1:525: Type
                {
                mType(); 

                }
                break;
            case 70 :
                // InternalRosSystemLexer.g:1:530: Any
                {
                mAny(); 

                }
                break;
            case 71 :
                // InternalRosSystemLexer.g:1:534: Ns
                {
                mNs(); 

                }
                break;
            case 72 :
                // InternalRosSystemLexer.g:1:537: HyphenMinusLeftSquareBracket
                {
                mHyphenMinusLeftSquareBracket(); 

                }
                break;
            case 73 :
                // InternalRosSystemLexer.g:1:566: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 74 :
                // InternalRosSystemLexer.g:1:602: Comma
                {
                mComma(); 

                }
                break;
            case 75 :
                // InternalRosSystemLexer.g:1:608: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 76 :
                // InternalRosSystemLexer.g:1:620: Colon
                {
                mColon(); 

                }
                break;
            case 77 :
                // InternalRosSystemLexer.g:1:626: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 78 :
                // InternalRosSystemLexer.g:1:644: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 79 :
                // InternalRosSystemLexer.g:1:663: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 80 :
                // InternalRosSystemLexer.g:1:675: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 81 :
                // InternalRosSystemLexer.g:1:688: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 82 :
                // InternalRosSystemLexer.g:1:700: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 83 :
                // InternalRosSystemLexer.g:1:712: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 84 :
                // InternalRosSystemLexer.g:1:727: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 85 :
                // InternalRosSystemLexer.g:1:749: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 86 :
                // InternalRosSystemLexer.g:1:765: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 87 :
                // InternalRosSystemLexer.g:1:787: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 88 :
                // InternalRosSystemLexer.g:1:813: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 89 :
                // InternalRosSystemLexer.g:1:821: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 90 :
                // InternalRosSystemLexer.g:1:833: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // InternalRosSystemLexer.g:1:849: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 92 :
                // InternalRosSystemLexer.g:1:857: RULE_ANY_OTHER
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
            return "176:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA30_eotS =
        "\1\50\31\55\1\140\1\143\3\uffff\3\151\1\53\1\55\2\53\1\uffff\1\53\1\uffff\1\53\2\uffff\1\55\1\uffff\1\55\1\uffff\56\55\1\uffff\1\151\12\uffff\1\151\1\55\2\uffff\1\u00a9\2\uffff\1\u00a9\4\uffff\23\55\2\uffff\12\55\1\u00cc\5\55\2\uffff\4\55\1\uffff\4\55\2\151\3\uffff\12\55\1\u00e7\2\55\1\uffff\10\55\1\uffff\1\55\1\u00f4\1\u00f5\1\u00f6\6\55\1\uffff\1\55\1\u0101\4\55\1\u0107\1\u0109\1\u010b\1\u010c\2\55\1\u010f\1\u0110\1\151\7\55\1\u0119\1\u011b\1\u011d\2\uffff\4\55\1\uffff\1\u00f6\5\55\4\uffff\3\55\1\u012c\6\55\1\uffff\4\55\4\uffff\1\55\2\uffff\1\55\1\u013a\2\uffff\7\55\6\uffff\7\55\1\u014a\2\55\1\u014e\1\u0150\1\u0152\2\uffff\1\55\1\u0154\2\55\1\uffff\1\u0157\1\u0158\1\u0159\1\u015a\1\u015b\1\uffff\1\u015c\2\uffff\11\55\1\u0167\1\u0169\3\55\2\uffff\1\u016d\1\55\6\uffff\1\u016f\1\uffff\1\u0170\1\u0171\6\uffff\11\55\4\uffff\1\u017b\1\uffff\1\u017c\5\uffff\4\55\1\u0181\4\55\2\uffff\4\55\1\uffff\3\55\1\uffff\5\55\2\uffff\2\55\1\u0194\1\55\1\uffff\2\55\1\uffff\6\55\1\u019e\1\55\1\u01a0\1\uffff\1\u01a1\2\uffff";
    static final String DFA30_eofS =
        "\u01a2\uffff";
    static final String DFA30_minS =
        "\1\0\31\57\1\56\1\135\3\uffff\3\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\1\57\1\uffff\1\57\1\uffff\22\57\2\55\17\57\2\55\11\57\1\uffff\1\56\12\uffff\1\60\1\57\2\0\1\57\2\0\1\57\4\uffff\11\57\1\55\10\57\1\55\2\uffff\20\57\2\uffff\4\57\1\uffff\4\57\1\56\1\60\1\0\1\uffff\1\0\15\57\1\uffff\10\57\1\uffff\12\57\1\uffff\16\57\1\55\12\57\2\uffff\4\57\1\uffff\6\57\4\uffff\12\57\1\uffff\4\57\4\uffff\1\57\2\uffff\2\57\2\uffff\7\57\6\uffff\15\57\2\uffff\4\57\1\uffff\5\57\1\uffff\1\57\2\uffff\16\57\2\uffff\2\57\6\uffff\1\57\1\uffff\2\57\6\uffff\11\57\4\uffff\1\57\1\uffff\1\57\5\uffff\11\57\2\uffff\4\57\1\uffff\3\57\1\uffff\5\57\2\uffff\4\57\1\uffff\2\57\1\uffff\11\57\1\uffff\1\57\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\31\172\1\145\1\135\3\uffff\3\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\1\172\1\uffff\1\172\1\uffff\56\172\1\uffff\1\145\12\uffff\1\71\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\23\172\2\uffff\20\172\2\uffff\4\172\1\uffff\4\172\1\145\1\71\1\uffff\1\uffff\1\uffff\15\172\1\uffff\10\172\1\uffff\12\172\1\uffff\16\172\1\55\12\172\2\uffff\4\172\1\uffff\6\172\4\uffff\12\172\1\uffff\4\172\4\uffff\1\172\2\uffff\2\172\2\uffff\7\172\6\uffff\15\172\2\uffff\4\172\1\uffff\5\172\1\uffff\1\172\2\uffff\16\172\2\uffff\2\172\6\uffff\1\172\1\uffff\2\172\6\uffff\11\172\4\uffff\1\172\1\uffff\1\172\5\uffff\11\172\2\uffff\4\172\1\uffff\3\172\1\uffff\5\172\2\uffff\4\172\1\uffff\2\172\1\uffff\11\172\1\uffff\1\172\2\uffff";
    static final String DFA30_acceptS =
        "\34\uffff\1\112\1\114\1\116\7\uffff\1\125\1\uffff\1\126\1\uffff\1\133\1\134\1\uffff\1\130\1\uffff\1\124\56\uffff\1\110\1\uffff\1\113\1\121\1\111\1\115\1\112\1\114\1\116\1\117\1\123\1\122\10\uffff\1\125\1\132\1\127\1\133\23\uffff\1\102\1\103\20\uffff\1\72\1\73\4\uffff\1\107\7\uffff\1\131\16\uffff\1\63\10\uffff\1\64\12\uffff\1\106\31\uffff\1\47\1\77\4\uffff\1\57\6\uffff\1\65\1\105\1\104\1\120\12\uffff\1\70\4\uffff\1\45\1\74\1\46\1\75\1\uffff\1\101\1\100\2\uffff\1\71\1\76\7\uffff\1\30\1\60\1\31\1\61\1\32\1\62\15\uffff\1\35\1\66\4\uffff\1\36\5\uffff\1\50\1\uffff\1\56\1\67\16\uffff\1\17\1\52\2\uffff\1\21\1\53\1\22\1\54\1\23\1\55\1\uffff\1\37\2\uffff\1\40\1\41\1\42\1\43\1\44\1\51\11\uffff\1\12\1\26\1\13\1\27\1\uffff\1\14\1\uffff\1\34\1\20\1\24\1\25\1\33\11\uffff\1\16\1\15\4\uffff\1\11\3\uffff\1\10\5\uffff\1\6\1\7\4\uffff\1\5\2\uffff\1\4\11\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA30_specialS =
        "\1\6\43\uffff\1\0\1\3\106\uffff\1\4\1\10\1\uffff\1\5\1\2\67\uffff\1\7\1\uffff\1\1\u00f7\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\44\1\46\3\53\1\45\4\53\1\34\1\32\1\53\1\47\1\37\2\40\7\41\1\35\6\53\1\17\1\14\1\43\1\20\2\43\1\3\1\21\1\15\2\43\1\30\3\43\1\2\1\43\1\1\1\22\7\43\1\33\1\53\1\36\1\42\1\43\1\53\1\23\1\24\1\4\1\10\1\43\1\7\1\31\1\43\1\5\3\43\1\16\1\25\1\43\1\6\1\43\1\26\1\11\1\12\1\13\1\27\4\43\3\53\1\51\uff81\53",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\54\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\61\20\56\1\60\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\62\5\56\1\63\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\64\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\65\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\66\20\56\1\67\2\56\1\70\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\74\3\56\1\72\6\56\1\71\5\56\1\73\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\75\17\56\1\76\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\102\1\56\1\100\15\56\1\103\1\77\1\101\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\104\1\106\10\56\1\107\6\56\1\105\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\110\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\112\15\56\1\111\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\113\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\114\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\116\3\56\1\115\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\120\15\56\1\117\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\121\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\122\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\123\17\56\1\124\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\125\11\56\1\126\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\130\15\56\1\127\3\56\1\131\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\132\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\133\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\134\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\135\13\56",
            "\1\141\1\uffff\12\137\13\uffff\1\141\25\uffff\1\136\11\uffff\1\141",
            "\1\142",
            "",
            "",
            "",
            "\1\141\1\uffff\12\150\10\uffff\1\147\2\uffff\1\141\34\uffff\1\147\2\uffff\1\141",
            "\1\141\1\uffff\12\152\13\uffff\1\141\37\uffff\1\141",
            "\1\141\26\uffff\1\141\37\uffff\1\141",
            "\32\153\4\uffff\1\153\1\uffff\32\153",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\42\155\1\156\71\155\1\154\uffa3\155",
            "\47\160\1\161\64\160\1\157\uffa3\160",
            "",
            "\1\164\4\uffff\1\164\2\uffff\1\163\26\uffff\32\50\3\uffff\2\50\1\uffff\32\50",
            "",
            "\1\164\4\uffff\1\164",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\166\16\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\167\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\170\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\171\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\172\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\173\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\174\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\175\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\176\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\177\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0080\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0081\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0082\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0083\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u0084\24\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0085\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0086\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0087\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u0088\30\56",
            "\1\u0089\1\uffff\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u008a\1\uffff\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u008b\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u008c\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u008d\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u008e\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u008f\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0090\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0091\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0092\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0093\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0094\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u0095\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0096\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0097\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0098\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0099\10\56",
            "\1\u009b\1\uffff\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u009a\6\56",
            "\1\u009c\1\uffff\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u009d\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u009e\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u009f\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00a0\15\56",
            "\1\50\12\56\1\u00a1\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00a2\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00a3\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00a4\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a5\31\56",
            "",
            "\1\141\1\uffff\12\u00a6\13\uffff\1\141\37\uffff\1\141",
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
            "\12\u00a7",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\0\u00a8",
            "\42\155\1\156\71\155\1\154\uffa3\155",
            "\1\164\15\uffff\1\57",
            "\0\u00aa",
            "\47\160\1\161\64\160\1\157\uffa3\160",
            "\1\164\15\uffff\1\57",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00ab\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00ac\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00ad\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00ae\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00af\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00b0\14\56",
            "\1\50\1\56\1\u00b2\1\56\1\u00b3\2\56\1\u00b4\1\56\1\u00b5\1\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b1\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b6\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00b7\27\56",
            "\1\u00b8\1\uffff\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b9\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00ba\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00bb\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00bc\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00bd\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00be\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00bf\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00c0\4\56",
            "\1\u00c1\1\uffff\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c2\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c3\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c4\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c5\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00c6\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00c7\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c8\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c9\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00ca\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00cb\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00cd\30\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00ce\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00cf\26\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00d0\13\56\1\u00d1\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00d2\21\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00d3\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d4\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d5\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d6\25\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00d7\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00d8\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00d9\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00da\16\56",
            "\1\141\1\uffff\12\u00a6\13\uffff\1\141\37\uffff\1\141",
            "\12\u00db",
            "\42\155\1\156\71\155\1\154\uffa3\155",
            "",
            "\47\160\1\161\64\160\1\157\uffa3\160",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00dc\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00dd\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00de\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00df\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00e0\22\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00e1\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00e2\10\56",
            "\1\50\6\56\1\u00e3\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u00e4\7\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u00e5\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u00e6\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00e8\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00e9\25\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ea\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00eb\30\56",
            "\1\50\12\56\1\u00ec\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00ed\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00ee\5\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00ef\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00f0\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00f1\21\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00f2\31\56",
            "\1\50\12\56\1\u00f3\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\1\56\1\u00f7\1\56\1\u00f8\2\56\1\u00f9\1\56\1\u00fa\1\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00fb\25\56",
            "\1\50\6\56\1\u00fc\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00fd\23\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00fe\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u00ff\1\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0100\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0102\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0103\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0104\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0105\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0106\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0108\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u010a\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u010d\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u010e\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\150",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0111\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0112\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0113\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0114\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u0115\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0116\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u0117\24\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0118\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u011a\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u011c\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u011e\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u011f\7\56",
            "\1\50\3\56\1\u0120\2\56\1\u0121\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0122\31\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0123\16\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0124\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0125\23\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0126\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u0127\26\56",
            "",
            "",
            "",
            "",
            "\1\50\6\56\1\u0128\3\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u0129\7\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u012a\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u012b\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u012d\31\56",
            "\1\50\4\56\1\u012e\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u012f\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0130\23\56",
            "\1\50\12\56\1\u0131\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0132\25\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0133\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0134\23\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0135\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0136\14\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\1\u0137\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0138\6\56",
            "\1\50\12\56\1\u0139\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u013b\4\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u013c\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u013d\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u013e\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u013f\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0140\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0141\31\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0142\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0143\7\56",
            "\1\50\2\56\1\u0144\7\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u0145\5\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0146\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0147\6\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0148\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0149\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u014b\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u014c\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u014d\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u014f\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0151\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0153\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0155\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0156\25\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u015d\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u015e\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u015f\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0160\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0161\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0162\21\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0163\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0164\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0165\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0166\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\1\u0168\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u016a\17\56",
            "\1\50\12\56\1\u016b\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u016c\14\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u016e\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\15\56\1\u0172\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0173\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0174\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0175\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0176\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0177\13\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0178\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0179\10\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u017a\7\56",
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
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u017d\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u017e\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\1\u017f\31\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0180\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0182\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0183\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0184\7\56",
            "\1\50\12\56\1\u0185\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0186\15\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0187\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0188\14\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0189\7\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u018a\7\56",
            "\1\50\12\56\1\u018b\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u018c\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018d\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u018e\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u018f\1\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0190\12\56",
            "\1\50\12\56\1\u0191\2\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0192\7\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0193\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0195\31\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0196\12\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0197\31\56",
            "",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0198\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0199\31\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u019a\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u019b\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u019c\27\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u019d\25\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\57\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u019f\25\56",
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
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Pub | Sub | Type_1 | Uint8 | Value | Date | List | Ac | As | Bool | Byte | Goal | Int8 | Name | Node | Sc | Ss | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_36 = input.LA(1);

                        s = -1;
                        if ( (LA30_36=='\\') ) {s = 108;}

                        else if ( ((LA30_36>='\u0000' && LA30_36<='!')||(LA30_36>='#' && LA30_36<='[')||(LA30_36>=']' && LA30_36<='\uFFFF')) ) {s = 109;}

                        else if ( (LA30_36=='\"') ) {s = 110;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_170 = input.LA(1);

                        s = -1;
                        if ( (LA30_170=='\'') ) {s = 113;}

                        else if ( (LA30_170=='\\') ) {s = 111;}

                        else if ( ((LA30_170>='\u0000' && LA30_170<='&')||(LA30_170>='(' && LA30_170<='[')||(LA30_170>=']' && LA30_170<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_112 = input.LA(1);

                        s = -1;
                        if ( (LA30_112=='\'') ) {s = 113;}

                        else if ( (LA30_112=='\\') ) {s = 111;}

                        else if ( ((LA30_112>='\u0000' && LA30_112<='&')||(LA30_112>='(' && LA30_112<='[')||(LA30_112>=']' && LA30_112<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_37 = input.LA(1);

                        s = -1;
                        if ( (LA30_37=='\\') ) {s = 111;}

                        else if ( ((LA30_37>='\u0000' && LA30_37<='&')||(LA30_37>='(' && LA30_37<='[')||(LA30_37>=']' && LA30_37<='\uFFFF')) ) {s = 112;}

                        else if ( (LA30_37=='\'') ) {s = 113;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_108 = input.LA(1);

                        s = -1;
                        if ( ((LA30_108>='\u0000' && LA30_108<='\uFFFF')) ) {s = 168;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_111 = input.LA(1);

                        s = -1;
                        if ( ((LA30_111>='\u0000' && LA30_111<='\uFFFF')) ) {s = 170;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='R') ) {s = 1;}

                        else if ( (LA30_0=='P') ) {s = 2;}

                        else if ( (LA30_0=='G') ) {s = 3;}

                        else if ( (LA30_0=='c') ) {s = 4;}

                        else if ( (LA30_0=='i') ) {s = 5;}

                        else if ( (LA30_0=='p') ) {s = 6;}

                        else if ( (LA30_0=='f') ) {s = 7;}

                        else if ( (LA30_0=='d') ) {s = 8;}

                        else if ( (LA30_0=='s') ) {s = 9;}

                        else if ( (LA30_0=='t') ) {s = 10;}

                        else if ( (LA30_0=='u') ) {s = 11;}

                        else if ( (LA30_0=='B') ) {s = 12;}

                        else if ( (LA30_0=='I') ) {s = 13;}

                        else if ( (LA30_0=='m') ) {s = 14;}

                        else if ( (LA30_0=='A') ) {s = 15;}

                        else if ( (LA30_0=='D') ) {s = 16;}

                        else if ( (LA30_0=='H') ) {s = 17;}

                        else if ( (LA30_0=='S') ) {s = 18;}

                        else if ( (LA30_0=='a') ) {s = 19;}

                        else if ( (LA30_0=='b') ) {s = 20;}

                        else if ( (LA30_0=='n') ) {s = 21;}

                        else if ( (LA30_0=='r') ) {s = 22;}

                        else if ( (LA30_0=='v') ) {s = 23;}

                        else if ( (LA30_0=='L') ) {s = 24;}

                        else if ( (LA30_0=='g') ) {s = 25;}

                        else if ( (LA30_0=='-') ) {s = 26;}

                        else if ( (LA30_0=='[') ) {s = 27;}

                        else if ( (LA30_0==',') ) {s = 28;}

                        else if ( (LA30_0==':') ) {s = 29;}

                        else if ( (LA30_0==']') ) {s = 30;}

                        else if ( (LA30_0=='0') ) {s = 31;}

                        else if ( ((LA30_0>='1' && LA30_0<='2')) ) {s = 32;}

                        else if ( ((LA30_0>='3' && LA30_0<='9')) ) {s = 33;}

                        else if ( (LA30_0=='^') ) {s = 34;}

                        else if ( (LA30_0=='C'||(LA30_0>='E' && LA30_0<='F')||(LA30_0>='J' && LA30_0<='K')||(LA30_0>='M' && LA30_0<='O')||LA30_0=='Q'||(LA30_0>='T' && LA30_0<='Z')||LA30_0=='_'||LA30_0=='e'||LA30_0=='h'||(LA30_0>='j' && LA30_0<='l')||LA30_0=='o'||LA30_0=='q'||(LA30_0>='w' && LA30_0<='z')) ) {s = 35;}

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
                        int LA30_168 = input.LA(1);

                        s = -1;
                        if ( (LA30_168=='\"') ) {s = 110;}

                        else if ( (LA30_168=='\\') ) {s = 108;}

                        else if ( ((LA30_168>='\u0000' && LA30_168<='!')||(LA30_168>='#' && LA30_168<='[')||(LA30_168>=']' && LA30_168<='\uFFFF')) ) {s = 109;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_109 = input.LA(1);

                        s = -1;
                        if ( (LA30_109=='\"') ) {s = 110;}

                        else if ( (LA30_109=='\\') ) {s = 108;}

                        else if ( ((LA30_109>='\u0000' && LA30_109<='!')||(LA30_109>='#' && LA30_109<='[')||(LA30_109>=']' && LA30_109<='\uFFFF')) ) {s = 109;}

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
