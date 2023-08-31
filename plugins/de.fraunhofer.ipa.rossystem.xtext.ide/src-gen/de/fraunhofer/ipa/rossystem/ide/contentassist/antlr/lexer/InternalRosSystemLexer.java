package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemLexer extends Lexer {
    public static final int Connections=8;
    public static final int Float32_1=13;
    public static final int Node=70;
    public static final int RULE_DATE_TIME=94;
    public static final int Uint64_1=22;
    public static final int String=37;
    public static final int Processes=11;
    public static final int Int16=52;
    public static final int Float32=25;
    public static final int Goal=67;
    public static final int Bool=64;
    public static final int Uint16=47;
    public static final int Boolean=23;
    public static final int Sub=56;
    public static final int Uint8=58;
    public static final int Parameters=10;
    public static final int RULE_ID=95;
    public static final int RULE_DIGIT=84;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=27;
    public static final int Header=36;
    public static final int RULE_INT=97;
    public static final int Byte=65;
    public static final int RULE_ML_COMMENT=104;
    public static final int LeftSquareBracket=82;
    public static final int Ac=62;
    public static final int Base64=34;
    public static final int Comma=79;
    public static final int As=63;
    public static final int HyphenMinus=80;
    public static final int RULE_MESSAGE_ASIGMENT=98;
    public static final int LeftSquareBracketRightSquareBracket=78;
    public static final int Int32=53;
    public static final int Char=66;
    public static final int RULE_DECINT=87;
    public static final int Uint32=48;
    public static final int RULE_HOUR=92;
    public static final int Int8=68;
    public static final int Default=15;
    public static final int Int8_1=43;
    public static final int Uint16_1=20;
    public static final int Sc=71;
    public static final int Type=74;
    public static final int Float64=26;
    public static final int Int32_1=28;
    public static final int RULE_BINARY=85;
    public static final int String_1=46;
    public static final int String_2=18;
    public static final int Ss=72;
    public static final int RULE_DAY=89;
    public static final int RULE_BEGIN=99;
    public static final int RULE_BOOLEAN=86;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=91;
    public static final int Result=45;
    public static final int Name=69;
    public static final int RULE_MIN_SEC=93;
    public static final int Char_1=42;
    public static final int ParameterAny=7;
    public static final int List=61;
    public static final int RightSquareBracket=83;
    public static final int PrivateNamespace=5;
    public static final int GraphName=12;
    public static final int Byte_1=41;
    public static final int Float64_1=14;
    public static final int Duration=16;
    public static final int Uint32_1=21;
    public static final int Double=35;
    public static final int Type_1=57;
    public static final int Value=59;
    public static final int Uint64=49;
    public static final int Action=39;
    public static final int RULE_END=100;
    public static final int Message=30;
    public static final int Value_1=50;
    public static final int Time=73;
    public static final int RULE_STRING=96;
    public static final int Bool_1=40;
    public static final int Any=75;
    public static final int Struct=38;
    public static final int RULE_SL_COMMENT=101;
    public static final int Uint8_1=32;
    public static final int RULE_DOUBLE=88;
    public static final int Feedback=17;
    public static final int RULE_ROS_CONVENTION_A=102;
    public static final int RULE_ROS_CONVENTION_PARAM=103;
    public static final int Colon=81;
    public static final int Pub=55;
    public static final int EOF=-1;
    public static final int Ns=76;
    public static final int RULE_WS=105;
    public static final int HyphenMinusLeftSquareBracket=77;
    public static final int Int64_1=29;
    public static final int Service=31;
    public static final int From=51;
    public static final int RULE_ANY_OTHER=106;
    public static final int Nodes=44;
    public static final int Date=60;
    public static final int Interfaces=9;
    public static final int Threads=19;
    public static final int Integer=24;
    public static final int Array=33;
    public static final int Int64=54;
    public static final int RULE_MONTH=90;

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

    // $ANTLR start "Char_1"
    public final void mChar_1() throws RecognitionException {
        try {
            int _type = Char_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:90:8: ( 'char[]' )
            // InternalRosSystemLexer.g:90:10: 'char[]'
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
            // InternalRosSystemLexer.g:92:8: ( 'int8[]' )
            // InternalRosSystemLexer.g:92:10: 'int8[]'
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
            // InternalRosSystemLexer.g:94:7: ( 'nodes:' )
            // InternalRosSystemLexer.g:94:9: 'nodes:'
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
            // InternalRosSystemLexer.g:96:8: ( 'result' )
            // InternalRosSystemLexer.g:96:10: 'result'
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
            // InternalRosSystemLexer.g:98:10: ( 'string' )
            // InternalRosSystemLexer.g:98:12: 'string'
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
            // InternalRosSystemLexer.g:100:8: ( 'uint16' )
            // InternalRosSystemLexer.g:100:10: 'uint16'
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
            // InternalRosSystemLexer.g:102:8: ( 'uint32' )
            // InternalRosSystemLexer.g:102:10: 'uint32'
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
            // InternalRosSystemLexer.g:104:8: ( 'uint64' )
            // InternalRosSystemLexer.g:104:10: 'uint64'
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
            // InternalRosSystemLexer.g:106:9: ( 'value:' )
            // InternalRosSystemLexer.g:106:11: 'value:'
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
            // InternalRosSystemLexer.g:108:6: ( 'from:' )
            // InternalRosSystemLexer.g:108:8: 'from:'
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
            // InternalRosSystemLexer.g:110:7: ( 'int16' )
            // InternalRosSystemLexer.g:110:9: 'int16'
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
            // InternalRosSystemLexer.g:112:7: ( 'int32' )
            // InternalRosSystemLexer.g:112:9: 'int32'
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
            // InternalRosSystemLexer.g:114:7: ( 'int64' )
            // InternalRosSystemLexer.g:114:9: 'int64'
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
            // InternalRosSystemLexer.g:116:5: ( 'pub->' )
            // InternalRosSystemLexer.g:116:7: 'pub->'
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
            // InternalRosSystemLexer.g:118:5: ( 'sub->' )
            // InternalRosSystemLexer.g:118:7: 'sub->'
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
            // InternalRosSystemLexer.g:120:8: ( 'type:' )
            // InternalRosSystemLexer.g:120:10: 'type:'
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
            // InternalRosSystemLexer.g:122:7: ( 'uint8' )
            // InternalRosSystemLexer.g:122:9: 'uint8'
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
            // InternalRosSystemLexer.g:124:7: ( 'value' )
            // InternalRosSystemLexer.g:124:9: 'value'
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
            // InternalRosSystemLexer.g:126:6: ( 'Date' )
            // InternalRosSystemLexer.g:126:8: 'Date'
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
            // InternalRosSystemLexer.g:128:6: ( 'List' )
            // InternalRosSystemLexer.g:128:8: 'List'
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
            // InternalRosSystemLexer.g:130:4: ( 'ac->' )
            // InternalRosSystemLexer.g:130:6: 'ac->'
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
            // InternalRosSystemLexer.g:132:4: ( 'as->' )
            // InternalRosSystemLexer.g:132:6: 'as->'
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
            // InternalRosSystemLexer.g:134:6: ( 'bool' )
            // InternalRosSystemLexer.g:134:8: 'bool'
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
            // InternalRosSystemLexer.g:136:6: ( 'byte' )
            // InternalRosSystemLexer.g:136:8: 'byte'
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
            // InternalRosSystemLexer.g:138:6: ( 'char' )
            // InternalRosSystemLexer.g:138:8: 'char'
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
            // InternalRosSystemLexer.g:140:6: ( 'goal' )
            // InternalRosSystemLexer.g:140:8: 'goal'
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
            // InternalRosSystemLexer.g:142:6: ( 'int8' )
            // InternalRosSystemLexer.g:142:8: 'int8'
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
            // InternalRosSystemLexer.g:144:6: ( 'name' )
            // InternalRosSystemLexer.g:144:8: 'name'
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
            // InternalRosSystemLexer.g:146:6: ( 'node' )
            // InternalRosSystemLexer.g:146:8: 'node'
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
            // InternalRosSystemLexer.g:148:4: ( 'sc->' )
            // InternalRosSystemLexer.g:148:6: 'sc->'
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
            // InternalRosSystemLexer.g:150:4: ( 'ss->' )
            // InternalRosSystemLexer.g:150:6: 'ss->'
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
            // InternalRosSystemLexer.g:152:6: ( 'time' )
            // InternalRosSystemLexer.g:152:8: 'time'
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
            // InternalRosSystemLexer.g:154:6: ( 'type' )
            // InternalRosSystemLexer.g:154:8: 'type'
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
            // InternalRosSystemLexer.g:156:5: ( 'Any' )
            // InternalRosSystemLexer.g:156:7: 'Any'
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
            // InternalRosSystemLexer.g:158:4: ( 'ns:' )
            // InternalRosSystemLexer.g:158:6: 'ns:'
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
            // InternalRosSystemLexer.g:160:30: ( '-[' )
            // InternalRosSystemLexer.g:160:32: '-['
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
            // InternalRosSystemLexer.g:162:37: ( '[]' )
            // InternalRosSystemLexer.g:162:39: '[]'
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
            // InternalRosSystemLexer.g:164:7: ( ',' )
            // InternalRosSystemLexer.g:164:9: ','
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
            // InternalRosSystemLexer.g:166:13: ( '-' )
            // InternalRosSystemLexer.g:166:15: '-'
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
            // InternalRosSystemLexer.g:168:7: ( ':' )
            // InternalRosSystemLexer.g:168:9: ':'
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
            // InternalRosSystemLexer.g:170:19: ( '[' )
            // InternalRosSystemLexer.g:170:21: '['
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
            // InternalRosSystemLexer.g:172:20: ( ']' )
            // InternalRosSystemLexer.g:172:22: ']'
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
            // InternalRosSystemLexer.g:174:21: ( '0' .. '9' )
            // InternalRosSystemLexer.g:174:23: '0' .. '9'
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
            // InternalRosSystemLexer.g:176:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosSystemLexer.g:176:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosSystemLexer.g:176:15: ( '0b' | '0B' )
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
                    // InternalRosSystemLexer.g:176:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:176:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosSystemLexer.g:176:27: ( '0' | '1' )+
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
            // InternalRosSystemLexer.g:178:14: ( ( 'true' | 'false' ) )
            // InternalRosSystemLexer.g:178:16: ( 'true' | 'false' )
            {
            // InternalRosSystemLexer.g:178:16: ( 'true' | 'false' )
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
                    // InternalRosSystemLexer.g:178:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:178:24: 'false'
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
            // InternalRosSystemLexer.g:180:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:180:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:180:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:180:16: ( RULE_DIGIT )*
                    {
                    // InternalRosSystemLexer.g:180:16: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:180:16: RULE_DIGIT
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
                    // InternalRosSystemLexer.g:180:28: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalRosSystemLexer.g:180:32: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:180:32: RULE_DIGIT
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

            // InternalRosSystemLexer.g:180:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalRosSystemLexer.g:180:46: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRosSystemLexer.g:180:50: ( RULE_DECINT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:180:50: RULE_DECINT
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
                    // InternalRosSystemLexer.g:180:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalRosSystemLexer.g:180:63: ( '.' ( RULE_DIGIT )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRosSystemLexer.g:180:64: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosSystemLexer.g:180:68: ( RULE_DIGIT )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalRosSystemLexer.g:180:68: RULE_DIGIT
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

                    // InternalRosSystemLexer.g:180:92: ( '-' | '+' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
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

                    // InternalRosSystemLexer.g:180:103: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:180:103: RULE_DIGIT
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
            // InternalRosSystemLexer.g:182:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:182:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:182:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:182:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:182:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosSystemLexer.g:182:29: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:182:29: RULE_DIGIT
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
                    // InternalRosSystemLexer.g:182:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosSystemLexer.g:182:54: ( RULE_DIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:182:54: RULE_DIGIT
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
            // InternalRosSystemLexer.g:184:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosSystemLexer.g:184:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosSystemLexer.g:184:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosSystemLexer.g:184:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:184:31: '1' .. '3' '0' .. '9'
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
            // InternalRosSystemLexer.g:186:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosSystemLexer.g:186:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosSystemLexer.g:186:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosSystemLexer.g:186:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:186:33: '1' '0' .. '2'
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
            // InternalRosSystemLexer.g:188:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosSystemLexer.g:188:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosSystemLexer.g:190:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosSystemLexer.g:190:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosSystemLexer.g:190:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosSystemLexer.g:190:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:190:41: '2' '0' .. '3'
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
            // InternalRosSystemLexer.g:192:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosSystemLexer.g:192:25: '0' .. '5' '0' .. '9'
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
            // InternalRosSystemLexer.g:194:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosSystemLexer.g:194:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosSystemLexer.g:196:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosSystemLexer.g:196:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosSystemLexer.g:196:25: ( RULE_ID | RULE_STRING )
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
                    // InternalRosSystemLexer.g:196:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:196:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRosSystemLexer.g:196:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalRosSystemLexer.g:196:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:196:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRosSystemLexer.g:196:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRosSystemLexer.g:196:81: '-' RULE_INT
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
            // InternalRosSystemLexer.g:198:21: ()
            // InternalRosSystemLexer.g:198:23: 
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
            // InternalRosSystemLexer.g:200:19: ()
            // InternalRosSystemLexer.g:200:21: 
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
            // InternalRosSystemLexer.g:202:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosSystemLexer.g:202:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRosSystemLexer.g:202:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosSystemLexer.g:202:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalRosSystemLexer.g:204:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosSystemLexer.g:204:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosSystemLexer.g:204:25: ( '/' RULE_ID | RULE_ID '/' )*
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
            	    // InternalRosSystemLexer.g:204:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:204:38: RULE_ID '/'
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
            // InternalRosSystemLexer.g:206:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosSystemLexer.g:206:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosSystemLexer.g:206:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
            	    // InternalRosSystemLexer.g:206:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:206:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystemLexer.g:206:62: '~' RULE_STRING
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
            // InternalRosSystemLexer.g:208:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystemLexer.g:208:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystemLexer.g:208:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystemLexer.g:208:11: '^'
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

            // InternalRosSystemLexer.g:208:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='z')) ) {
                    alt25=1;
                }


                switch (alt25) {
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
            // InternalRosSystemLexer.g:210:19: ( ( '0' .. '9' )+ )
            // InternalRosSystemLexer.g:210:21: ( '0' .. '9' )+
            {
            // InternalRosSystemLexer.g:210:21: ( '0' .. '9' )+
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
            	    // InternalRosSystemLexer.g:210:22: '0' .. '9'
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
            // InternalRosSystemLexer.g:212:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystemLexer.g:212:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystemLexer.g:212:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRosSystemLexer.g:212:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosSystemLexer.g:212:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRosSystemLexer.g:212:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:212:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRosSystemLexer.g:212:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosSystemLexer.g:212:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRosSystemLexer.g:212:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:212:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRosSystemLexer.g:214:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystemLexer.g:214:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosSystemLexer.g:214:24: ( options {greedy=false; } : . )*
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
            	    // InternalRosSystemLexer.g:214:52: .
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
            // InternalRosSystemLexer.g:216:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystemLexer.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystemLexer.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalRosSystemLexer.g:218:16: ( . )
            // InternalRosSystemLexer.g:218:18: .
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
        // InternalRosSystemLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Pub | Sub | Type_1 | Uint8 | Value | Date | List | Ac | As | Bool | Byte | Char | Goal | Int8 | Name | Node | Sc | Ss | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=94;
        alt32 = dfa32.predict(input);
        switch (alt32) {
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
                // InternalRosSystemLexer.g:1:360: Char_1
                {
                mChar_1(); 

                }
                break;
            case 40 :
                // InternalRosSystemLexer.g:1:367: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 41 :
                // InternalRosSystemLexer.g:1:374: Nodes
                {
                mNodes(); 

                }
                break;
            case 42 :
                // InternalRosSystemLexer.g:1:380: Result
                {
                mResult(); 

                }
                break;
            case 43 :
                // InternalRosSystemLexer.g:1:387: String_1
                {
                mString_1(); 

                }
                break;
            case 44 :
                // InternalRosSystemLexer.g:1:396: Uint16
                {
                mUint16(); 

                }
                break;
            case 45 :
                // InternalRosSystemLexer.g:1:403: Uint32
                {
                mUint32(); 

                }
                break;
            case 46 :
                // InternalRosSystemLexer.g:1:410: Uint64
                {
                mUint64(); 

                }
                break;
            case 47 :
                // InternalRosSystemLexer.g:1:417: Value_1
                {
                mValue_1(); 

                }
                break;
            case 48 :
                // InternalRosSystemLexer.g:1:425: From
                {
                mFrom(); 

                }
                break;
            case 49 :
                // InternalRosSystemLexer.g:1:430: Int16
                {
                mInt16(); 

                }
                break;
            case 50 :
                // InternalRosSystemLexer.g:1:436: Int32
                {
                mInt32(); 

                }
                break;
            case 51 :
                // InternalRosSystemLexer.g:1:442: Int64
                {
                mInt64(); 

                }
                break;
            case 52 :
                // InternalRosSystemLexer.g:1:448: Pub
                {
                mPub(); 

                }
                break;
            case 53 :
                // InternalRosSystemLexer.g:1:452: Sub
                {
                mSub(); 

                }
                break;
            case 54 :
                // InternalRosSystemLexer.g:1:456: Type_1
                {
                mType_1(); 

                }
                break;
            case 55 :
                // InternalRosSystemLexer.g:1:463: Uint8
                {
                mUint8(); 

                }
                break;
            case 56 :
                // InternalRosSystemLexer.g:1:469: Value
                {
                mValue(); 

                }
                break;
            case 57 :
                // InternalRosSystemLexer.g:1:475: Date
                {
                mDate(); 

                }
                break;
            case 58 :
                // InternalRosSystemLexer.g:1:480: List
                {
                mList(); 

                }
                break;
            case 59 :
                // InternalRosSystemLexer.g:1:485: Ac
                {
                mAc(); 

                }
                break;
            case 60 :
                // InternalRosSystemLexer.g:1:488: As
                {
                mAs(); 

                }
                break;
            case 61 :
                // InternalRosSystemLexer.g:1:491: Bool
                {
                mBool(); 

                }
                break;
            case 62 :
                // InternalRosSystemLexer.g:1:496: Byte
                {
                mByte(); 

                }
                break;
            case 63 :
                // InternalRosSystemLexer.g:1:501: Char
                {
                mChar(); 

                }
                break;
            case 64 :
                // InternalRosSystemLexer.g:1:506: Goal
                {
                mGoal(); 

                }
                break;
            case 65 :
                // InternalRosSystemLexer.g:1:511: Int8
                {
                mInt8(); 

                }
                break;
            case 66 :
                // InternalRosSystemLexer.g:1:516: Name
                {
                mName(); 

                }
                break;
            case 67 :
                // InternalRosSystemLexer.g:1:521: Node
                {
                mNode(); 

                }
                break;
            case 68 :
                // InternalRosSystemLexer.g:1:526: Sc
                {
                mSc(); 

                }
                break;
            case 69 :
                // InternalRosSystemLexer.g:1:529: Ss
                {
                mSs(); 

                }
                break;
            case 70 :
                // InternalRosSystemLexer.g:1:532: Time
                {
                mTime(); 

                }
                break;
            case 71 :
                // InternalRosSystemLexer.g:1:537: Type
                {
                mType(); 

                }
                break;
            case 72 :
                // InternalRosSystemLexer.g:1:542: Any
                {
                mAny(); 

                }
                break;
            case 73 :
                // InternalRosSystemLexer.g:1:546: Ns
                {
                mNs(); 

                }
                break;
            case 74 :
                // InternalRosSystemLexer.g:1:549: HyphenMinusLeftSquareBracket
                {
                mHyphenMinusLeftSquareBracket(); 

                }
                break;
            case 75 :
                // InternalRosSystemLexer.g:1:578: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 76 :
                // InternalRosSystemLexer.g:1:614: Comma
                {
                mComma(); 

                }
                break;
            case 77 :
                // InternalRosSystemLexer.g:1:620: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 78 :
                // InternalRosSystemLexer.g:1:632: Colon
                {
                mColon(); 

                }
                break;
            case 79 :
                // InternalRosSystemLexer.g:1:638: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 80 :
                // InternalRosSystemLexer.g:1:656: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 81 :
                // InternalRosSystemLexer.g:1:675: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 82 :
                // InternalRosSystemLexer.g:1:687: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 83 :
                // InternalRosSystemLexer.g:1:700: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 84 :
                // InternalRosSystemLexer.g:1:712: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 85 :
                // InternalRosSystemLexer.g:1:724: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 86 :
                // InternalRosSystemLexer.g:1:739: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 87 :
                // InternalRosSystemLexer.g:1:761: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 88 :
                // InternalRosSystemLexer.g:1:777: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 89 :
                // InternalRosSystemLexer.g:1:799: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 90 :
                // InternalRosSystemLexer.g:1:825: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 91 :
                // InternalRosSystemLexer.g:1:833: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 92 :
                // InternalRosSystemLexer.g:1:845: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 93 :
                // InternalRosSystemLexer.g:1:861: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 94 :
                // InternalRosSystemLexer.g:1:869: RULE_ANY_OTHER
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
            return "180:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )";
        }
    }
    static final String DFA32_eotS =
        "\1\52\31\57\1\144\1\146\3\uffff\2\154\1\uffff\1\143\1\154\1\55\1\57\2\55\1\uffff\1\55\1\uffff\1\55\2\uffff\1\57\1\uffff\1\57\1\uffff\57\57\1\uffff\1\154\12\uffff\1\154\1\143\1\154\1\57\2\uffff\1\u00b0\2\uffff\1\u00b0\4\uffff\24\57\2\uffff\12\57\1\u00d4\5\57\2\uffff\4\57\1\uffff\4\57\1\154\1\uffff\1\154\3\uffff\6\57\1\u00ec\4\57\1\u00f2\2\57\1\uffff\10\57\1\uffff\1\57\1\u00ff\1\u0100\1\u0101\6\57\1\uffff\1\57\1\u010c\4\57\1\u0112\1\u0114\1\u0116\1\u0117\2\57\1\u011a\1\u011b\1\uffff\1\154\6\57\2\uffff\1\57\1\u0125\1\u0127\1\u0129\2\uffff\4\57\1\uffff\1\u0101\5\57\4\uffff\3\57\1\u0138\6\57\1\uffff\4\57\4\uffff\1\57\2\uffff\1\57\1\u0146\3\uffff\7\57\6\uffff\7\57\1\u0156\2\57\1\u015a\1\u015c\1\u015e\2\uffff\1\57\1\u0160\2\57\1\uffff\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167\1\uffff\1\u0168\2\uffff\11\57\1\u0173\1\u0175\3\57\2\uffff\1\u0179\1\57\6\uffff\1\u017b\1\uffff\1\u017c\1\u017d\6\uffff\11\57\4\uffff\1\u0187\1\uffff\1\u0188\5\uffff\4\57\1\u018d\4\57\2\uffff\4\57\1\uffff\3\57\1\uffff\5\57\2\uffff\2\57\1\u01a0\1\57\1\uffff\2\57\1\uffff\6\57\1\u01aa\1\57\1\u01ac\1\uffff\1\u01ad\2\uffff";
    static final String DFA32_eofS =
        "\u01ae\uffff";
    static final String DFA32_minS =
        "\1\0\31\57\1\56\1\135\3\uffff\2\56\1\uffff\1\57\1\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\1\57\1\uffff\1\57\1\uffff\23\57\2\55\17\57\2\55\11\57\1\uffff\1\56\10\uffff\1\56\1\uffff\1\56\1\57\1\56\1\57\2\0\1\57\2\0\1\57\4\uffff\12\57\1\55\10\57\1\55\2\uffff\20\57\2\uffff\4\57\1\uffff\4\57\3\56\1\0\1\uffff\1\0\16\57\1\uffff\10\57\1\uffff\12\57\1\uffff\16\57\2\55\6\57\2\uffff\4\57\2\uffff\4\57\1\uffff\6\57\4\uffff\12\57\1\uffff\4\57\4\uffff\1\57\2\uffff\2\57\3\uffff\7\57\6\uffff\15\57\2\uffff\4\57\1\uffff\5\57\1\uffff\1\57\2\uffff\16\57\2\uffff\2\57\6\uffff\1\57\1\uffff\2\57\6\uffff\11\57\4\uffff\1\57\1\uffff\1\57\5\uffff\11\57\2\uffff\4\57\1\uffff\3\57\1\uffff\5\57\2\uffff\4\57\1\uffff\2\57\1\uffff\11\57\1\uffff\1\57\2\uffff";
    static final String DFA32_maxS =
        "\1\uffff\31\172\1\145\1\135\3\uffff\2\145\1\uffff\1\172\1\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\1\172\1\uffff\1\172\1\uffff\57\172\1\uffff\1\145\10\uffff\1\145\1\uffff\1\145\1\172\1\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\24\172\2\uffff\20\172\2\uffff\4\172\1\uffff\4\172\3\145\1\uffff\1\uffff\1\uffff\16\172\1\uffff\10\172\1\uffff\12\172\1\uffff\16\172\2\145\6\172\2\uffff\4\172\2\uffff\4\172\1\uffff\6\172\4\uffff\12\172\1\uffff\4\172\4\uffff\1\172\2\uffff\2\172\3\uffff\7\172\6\uffff\15\172\2\uffff\4\172\1\uffff\5\172\1\uffff\1\172\2\uffff\16\172\2\uffff\2\172\6\uffff\1\172\1\uffff\2\172\6\uffff\11\172\4\uffff\1\172\1\uffff\1\172\5\uffff\11\172\2\uffff\4\172\1\uffff\3\172\1\uffff\5\172\2\uffff\4\172\1\uffff\2\172\1\uffff\11\172\1\uffff\1\172\2\uffff";
    static final String DFA32_acceptS =
        "\34\uffff\1\114\1\116\1\120\2\uffff\1\123\6\uffff\1\127\1\uffff\1\130\1\uffff\1\135\1\136\1\uffff\1\132\1\uffff\1\126\57\uffff\1\112\1\uffff\1\123\1\115\1\113\1\117\1\114\1\116\1\120\1\121\1\uffff\1\124\12\uffff\1\127\1\134\1\131\1\135\24\uffff\1\104\1\105\20\uffff\1\73\1\74\4\uffff\1\111\10\uffff\1\133\17\uffff\1\64\10\uffff\1\65\12\uffff\1\110\26\uffff\1\47\1\77\4\uffff\1\50\1\101\4\uffff\1\60\6\uffff\1\66\1\107\1\106\1\122\12\uffff\1\71\4\uffff\1\45\1\75\1\46\1\76\1\uffff\1\103\1\102\2\uffff\1\72\1\100\1\125\7\uffff\1\30\1\61\1\31\1\62\1\32\1\63\15\uffff\1\35\1\67\4\uffff\1\36\5\uffff\1\51\1\uffff\1\57\1\70\16\uffff\1\17\1\53\2\uffff\1\21\1\54\1\22\1\55\1\23\1\56\1\uffff\1\37\2\uffff\1\40\1\41\1\42\1\43\1\44\1\52\11\uffff\1\12\1\26\1\13\1\27\1\uffff\1\14\1\uffff\1\34\1\20\1\24\1\25\1\33\11\uffff\1\16\1\15\4\uffff\1\11\3\uffff\1\10\5\uffff\1\6\1\7\4\uffff\1\5\2\uffff\1\4\11\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\1\0\45\uffff\1\6\1\1\111\uffff\1\4\1\3\1\uffff\1\5\1\10\71\uffff\1\2\1\uffff\1\7\u00fc\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\55\1\46\1\50\3\55\1\47\4\55\1\34\1\32\1\41\1\51\1\37\2\40\7\43\1\35\6\55\1\17\1\14\1\45\1\20\1\42\1\45\1\3\1\21\1\15\2\45\1\30\3\45\1\2\1\45\1\1\1\22\7\45\1\33\1\55\1\36\1\44\1\45\1\55\1\23\1\24\1\4\1\10\1\42\1\7\1\31\1\45\1\5\3\45\1\16\1\25\1\45\1\6\1\45\1\26\1\11\1\12\1\13\1\27\4\45\3\55\1\53\uff81\55",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\56\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\63\20\60\1\62\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\64\5\60\1\65\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\67\6\60\1\66\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\70\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\71\20\60\1\72\2\60\1\73\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\77\3\60\1\75\6\60\1\74\5\60\1\76\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\100\17\60\1\101\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\105\1\60\1\103\15\60\1\106\1\102\1\104\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\107\1\111\10\60\1\112\6\60\1\110\1\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\113\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\115\15\60\1\114\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\116\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\117\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\121\3\60\1\120\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\123\15\60\1\122\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\124\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\125\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\126\17\60\1\127\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\130\11\60\1\131\1\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\133\15\60\1\132\3\60\1\134\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\135\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\136\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\137\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\140\13\60",
            "\1\143\1\uffff\12\142\13\uffff\1\143\25\uffff\1\141\11\uffff\1\143",
            "\1\145",
            "",
            "",
            "",
            "\1\143\1\uffff\12\153\10\uffff\1\152\2\uffff\1\143\34\uffff\1\152\2\uffff\1\143",
            "\1\143\1\uffff\12\155\13\uffff\1\143\37\uffff\1\143",
            "",
            "\1\52\12\156\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\143\1\uffff\12\157\13\uffff\1\143\37\uffff\1\143",
            "\32\160\4\uffff\1\160\1\uffff\32\160",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\42\162\1\163\71\162\1\161\uffa3\162",
            "\47\165\1\166\64\165\1\164\uffa3\165",
            "",
            "\1\171\4\uffff\1\171\2\uffff\1\170\26\uffff\32\52\3\uffff\2\52\1\uffff\32\52",
            "",
            "\1\171\4\uffff\1\171",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\173\16\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\174\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\175\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\176\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\177\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0080\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0081\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0082\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0083\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0084\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u0085\30\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0086\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0087\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0088\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0089\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u008a\24\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u008b\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u008c\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u008d\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u008e\30\60",
            "\1\u008f\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0090\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0091\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u0092\12\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0093\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u0094\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0095\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0096\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0097\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0098\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0099\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u009a\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u009b\1\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u009c\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u009d\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u009e\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u009f\10\60",
            "\1\u00a1\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00a0\6\60",
            "\1\u00a2\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u00a3\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00a4\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00a5\26\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00a6\15\60",
            "\1\52\12\60\1\u00a7\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00a8\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00a9\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00aa\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00ab\31\60",
            "",
            "\1\143\1\uffff\12\u00ac\13\uffff\1\143\37\uffff\1\143",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143\1\uffff\12\u00ad\13\uffff\1\143\37\uffff\1\143",
            "",
            "\1\143\1\uffff\12\u00ae\13\uffff\1\143\37\uffff\1\143",
            "\1\52\12\156\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\143\1\uffff\12\157\13\uffff\1\143\37\uffff\1\143",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\0\u00af",
            "\42\162\1\163\71\162\1\161\uffa3\162",
            "\1\171\15\uffff\1\61",
            "\0\u00b1",
            "\47\165\1\166\64\165\1\164\uffa3\165",
            "\1\171\15\uffff\1\61",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00b2\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\u00b3\4\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00b4\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u00b5\30\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u00b6\12\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00b7\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00b8\10\60",
            "\1\52\1\60\1\u00ba\1\60\1\u00bb\2\60\1\u00bc\1\60\1\u00bd\1\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00b9\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00be\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u00bf\27\60",
            "\1\u00c0\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00c1\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00c2\26\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00c3\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00c4\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00c5\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00c6\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00c7\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\u00c8\4\60",
            "\1\u00c9\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00ca\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00cb\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00cc\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00cd\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00ce\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00cf\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00d0\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00d1\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00d2\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00d3\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u00d5\30\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00d6\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00d7\26\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00d8\13\60\1\u00d9\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00da\21\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00db\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00dc\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00dd\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00de\25\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00df\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00e0\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00e1\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00e2\16\60",
            "\1\143\1\uffff\12\u00ac\13\uffff\1\143\37\uffff\1\143",
            "\1\143\1\uffff\12\u00e3\13\uffff\1\143\37\uffff\1\143",
            "\1\143\1\uffff\12\u00e4\13\uffff\1\143\37\uffff\1\143",
            "\42\162\1\163\71\162\1\161\uffa3\162",
            "",
            "\47\165\1\166\64\165\1\164\uffa3\165",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00e5\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00e6\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00e7\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00e8\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00e9\22\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00ea\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u00eb\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00ed\10\60",
            "\1\52\6\60\1\u00ee\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\2\60\1\u00ef\7\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\4\60\1\u00f0\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u00f1\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00f3\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00f4\25\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00f5\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u00f6\30\60",
            "\1\52\12\60\1\u00f7\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00f8\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00f9\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00fa\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00fb\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00fc\21\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00fd\31\60",
            "\1\52\12\60\1\u00fe\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\1\60\1\u0102\1\60\1\u0103\2\60\1\u0104\1\60\1\u0105\1\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0106\25\60",
            "\1\52\6\60\1\u0107\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u0108\23\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0109\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u010a\1\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u010b\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u010d\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u010e\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u010f\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0110\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0111\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0113\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0115\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0118\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0119\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011c\1\143\1\uffff\12\143\13\uffff\1\143\37\uffff\1\143",
            "\1\u011c\1\143\1\uffff\12\157\13\uffff\1\143\37\uffff\1\143",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u011d\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u011e\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u011f\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0120\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u0121\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0122\27\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u0123\24\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0124\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0126\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0128\3\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u012a\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u012b\7\60",
            "\1\52\3\60\1\u012c\2\60\1\u012d\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u012e\31\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u012f\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0130\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u0131\23\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0132\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u0133\26\60",
            "",
            "",
            "",
            "",
            "\1\52\6\60\1\u0134\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\2\60\1\u0135\7\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\4\60\1\u0136\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0137\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0139\31\60",
            "\1\52\4\60\1\u013a\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u013b\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u013c\23\60",
            "\1\52\12\60\1\u013d\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u013e\25\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u013f\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u0140\23\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0141\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0142\14\60",
            "",
            "",
            "",
            "",
            "\1\52\12\60\1\u0143\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0144\6\60",
            "\1\52\12\60\1\u0145\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\u0147\4\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0148\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0149\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u014a\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u014b\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u014c\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u014d\31\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u014e\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u014f\7\60",
            "\1\52\2\60\1\u0150\7\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\4\60\1\u0151\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0152\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0153\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0154\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0155\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0157\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0158\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0159\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u015b\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u015d\3\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u015f\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0161\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0162\25\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0169\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u016a\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u016b\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u016c\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u016d\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u016e\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u016f\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0170\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0171\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0172\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0174\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\12\60\1\u0176\17\60",
            "\1\52\12\60\1\u0177\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0178\14\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\1\u017a\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u017e\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u017f\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0180\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0181\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0182\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0183\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0184\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0185\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0186\7\60",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0189\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u018a\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\1\u018b\31\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u018c\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u018e\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u018f\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0190\7\60",
            "\1\52\12\60\1\u0191\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0192\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0193\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0194\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0195\7\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0196\7\60",
            "\1\52\12\60\1\u0197\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\1\u0198\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0199\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u019a\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u019b\1\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u019c\12\60",
            "\1\52\12\60\1\u019d\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u019e\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u019f\12\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u01a1\31\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u01a2\12\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u01a3\31\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u01a4\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u01a5\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u01a6\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u01a7\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u01a8\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u01a9\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u01ab\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
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
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Pub | Sub | Type_1 | Uint8 | Value | Date | List | Ac | As | Bool | Byte | Char | Goal | Int8 | Name | Node | Sc | Ss | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='R') ) {s = 1;}

                        else if ( (LA32_0=='P') ) {s = 2;}

                        else if ( (LA32_0=='G') ) {s = 3;}

                        else if ( (LA32_0=='c') ) {s = 4;}

                        else if ( (LA32_0=='i') ) {s = 5;}

                        else if ( (LA32_0=='p') ) {s = 6;}

                        else if ( (LA32_0=='f') ) {s = 7;}

                        else if ( (LA32_0=='d') ) {s = 8;}

                        else if ( (LA32_0=='s') ) {s = 9;}

                        else if ( (LA32_0=='t') ) {s = 10;}

                        else if ( (LA32_0=='u') ) {s = 11;}

                        else if ( (LA32_0=='B') ) {s = 12;}

                        else if ( (LA32_0=='I') ) {s = 13;}

                        else if ( (LA32_0=='m') ) {s = 14;}

                        else if ( (LA32_0=='A') ) {s = 15;}

                        else if ( (LA32_0=='D') ) {s = 16;}

                        else if ( (LA32_0=='H') ) {s = 17;}

                        else if ( (LA32_0=='S') ) {s = 18;}

                        else if ( (LA32_0=='a') ) {s = 19;}

                        else if ( (LA32_0=='b') ) {s = 20;}

                        else if ( (LA32_0=='n') ) {s = 21;}

                        else if ( (LA32_0=='r') ) {s = 22;}

                        else if ( (LA32_0=='v') ) {s = 23;}

                        else if ( (LA32_0=='L') ) {s = 24;}

                        else if ( (LA32_0=='g') ) {s = 25;}

                        else if ( (LA32_0=='-') ) {s = 26;}

                        else if ( (LA32_0=='[') ) {s = 27;}

                        else if ( (LA32_0==',') ) {s = 28;}

                        else if ( (LA32_0==':') ) {s = 29;}

                        else if ( (LA32_0==']') ) {s = 30;}

                        else if ( (LA32_0=='0') ) {s = 31;}

                        else if ( ((LA32_0>='1' && LA32_0<='2')) ) {s = 32;}

                        else if ( (LA32_0=='.') ) {s = 33;}

                        else if ( (LA32_0=='E'||LA32_0=='e') ) {s = 34;}

                        else if ( ((LA32_0>='3' && LA32_0<='9')) ) {s = 35;}

                        else if ( (LA32_0=='^') ) {s = 36;}

                        else if ( (LA32_0=='C'||LA32_0=='F'||(LA32_0>='J' && LA32_0<='K')||(LA32_0>='M' && LA32_0<='O')||LA32_0=='Q'||(LA32_0>='T' && LA32_0<='Z')||LA32_0=='_'||LA32_0=='h'||(LA32_0>='j' && LA32_0<='l')||LA32_0=='o'||LA32_0=='q'||(LA32_0>='w' && LA32_0<='z')) ) {s = 37;}

                        else if ( (LA32_0=='\"') ) {s = 38;}

                        else if ( (LA32_0=='\'') ) {s = 39;}

                        else if ( (LA32_0=='#') ) {s = 40;}

                        else if ( (LA32_0=='/') ) {s = 41;}

                        else if ( (LA32_0=='~') ) {s = 43;}

                        else if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {s = 44;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\b')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='!'||(LA32_0>='$' && LA32_0<='&')||(LA32_0>='(' && LA32_0<='+')||(LA32_0>=';' && LA32_0<='@')||LA32_0=='\\'||LA32_0=='`'||(LA32_0>='{' && LA32_0<='}')||(LA32_0>='\u007F' && LA32_0<='\uFFFF')) ) {s = 45;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_39 = input.LA(1);

                        s = -1;
                        if ( (LA32_39=='\\') ) {s = 116;}

                        else if ( ((LA32_39>='\u0000' && LA32_39<='&')||(LA32_39>='(' && LA32_39<='[')||(LA32_39>=']' && LA32_39<='\uFFFF')) ) {s = 117;}

                        else if ( (LA32_39=='\'') ) {s = 118;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_175 = input.LA(1);

                        s = -1;
                        if ( (LA32_175=='\"') ) {s = 115;}

                        else if ( (LA32_175=='\\') ) {s = 113;}

                        else if ( ((LA32_175>='\u0000' && LA32_175<='!')||(LA32_175>='#' && LA32_175<='[')||(LA32_175>=']' && LA32_175<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_114 = input.LA(1);

                        s = -1;
                        if ( (LA32_114=='\"') ) {s = 115;}

                        else if ( (LA32_114=='\\') ) {s = 113;}

                        else if ( ((LA32_114>='\u0000' && LA32_114<='!')||(LA32_114>='#' && LA32_114<='[')||(LA32_114>=']' && LA32_114<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_113 = input.LA(1);

                        s = -1;
                        if ( ((LA32_113>='\u0000' && LA32_113<='\uFFFF')) ) {s = 175;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_116 = input.LA(1);

                        s = -1;
                        if ( ((LA32_116>='\u0000' && LA32_116<='\uFFFF')) ) {s = 177;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_38 = input.LA(1);

                        s = -1;
                        if ( (LA32_38=='\\') ) {s = 113;}

                        else if ( ((LA32_38>='\u0000' && LA32_38<='!')||(LA32_38>='#' && LA32_38<='[')||(LA32_38>=']' && LA32_38<='\uFFFF')) ) {s = 114;}

                        else if ( (LA32_38=='\"') ) {s = 115;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_177 = input.LA(1);

                        s = -1;
                        if ( (LA32_177=='\'') ) {s = 118;}

                        else if ( (LA32_177=='\\') ) {s = 116;}

                        else if ( ((LA32_177>='\u0000' && LA32_177<='&')||(LA32_177>='(' && LA32_177<='[')||(LA32_177>=']' && LA32_177<='\uFFFF')) ) {s = 117;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_117 = input.LA(1);

                        s = -1;
                        if ( (LA32_117=='\'') ) {s = 118;}

                        else if ( (LA32_117=='\\') ) {s = 116;}

                        else if ( ((LA32_117>='\u0000' && LA32_117<='&')||(LA32_117>='(' && LA32_117<='[')||(LA32_117>=']' && LA32_117<='\uFFFF')) ) {s = 117;}

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