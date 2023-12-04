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
    public static final int Float32_1=14;
    public static final int Node=72;
    public static final int RULE_DATE_TIME=96;
    public static final int Uint64_1=24;
    public static final int String=39;
    public static final int Processes=12;
    public static final int Int16=54;
    public static final int SubSystems=11;
    public static final int Float32=27;
    public static final int Goal=69;
    public static final int Bool=66;
    public static final int Uint16=49;
    public static final int Boolean=25;
    public static final int Sub=58;
    public static final int Uint8=60;
    public static final int Parameters=10;
    public static final int RULE_ID=97;
    public static final int RULE_DIGIT=86;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=29;
    public static final int Header=38;
    public static final int RULE_INT=99;
    public static final int Byte=67;
    public static final int RULE_ML_COMMENT=106;
    public static final int LeftSquareBracket=84;
    public static final int Ac=64;
    public static final int Base64=36;
    public static final int Comma=81;
    public static final int As=65;
    public static final int HyphenMinus=82;
    public static final int RULE_MESSAGE_ASIGMENT=100;
    public static final int LeftSquareBracketRightSquareBracket=80;
    public static final int Int32=55;
    public static final int Char=68;
    public static final int RULE_DECINT=89;
    public static final int Uint32=50;
    public static final int RULE_HOUR=94;
    public static final int Int8=70;
    public static final int Default=17;
    public static final int Int8_1=45;
    public static final int Uint16_1=22;
    public static final int Sc=73;
    public static final int Type=76;
    public static final int Float64=28;
    public static final int Int32_1=30;
    public static final int RULE_BINARY=87;
    public static final int String_1=48;
    public static final int String_2=20;
    public static final int Ss=74;
    public static final int RULE_DAY=91;
    public static final int RULE_BEGIN=101;
    public static final int RULE_BOOLEAN=88;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=93;
    public static final int Result=47;
    public static final int Name=71;
    public static final int RULE_MIN_SEC=95;
    public static final int Char_1=44;
    public static final int ParameterAny=7;
    public static final int List=63;
    public static final int RightSquareBracket=85;
    public static final int PrivateNamespace=5;
    public static final int GraphName=13;
    public static final int Byte_1=43;
    public static final int Float64_1=15;
    public static final int Duration=18;
    public static final int Uint32_1=23;
    public static final int Double=37;
    public static final int Type_1=59;
    public static final int Value=61;
    public static final int Uint64=51;
    public static final int FromFile=16;
    public static final int Action=41;
    public static final int RULE_END=102;
    public static final int Message=32;
    public static final int Value_1=52;
    public static final int Time=75;
    public static final int RULE_STRING=98;
    public static final int Bool_1=42;
    public static final int Any=77;
    public static final int Struct=40;
    public static final int RULE_SL_COMMENT=103;
    public static final int Uint8_1=34;
    public static final int RULE_DOUBLE=90;
    public static final int Feedback=19;
    public static final int RULE_ROS_CONVENTION_A=104;
    public static final int RULE_ROS_CONVENTION_PARAM=105;
    public static final int Colon=83;
    public static final int Pub=57;
    public static final int EOF=-1;
    public static final int Ns=78;
    public static final int RULE_WS=107;
    public static final int HyphenMinusLeftSquareBracket=79;
    public static final int Int64_1=31;
    public static final int Service=33;
    public static final int From=53;
    public static final int RULE_ANY_OTHER=108;
    public static final int Nodes=46;
    public static final int Date=62;
    public static final int Interfaces=9;
    public static final int Threads=21;
    public static final int Integer=26;
    public static final int Array=35;
    public static final int Int64=56;
    public static final int RULE_MONTH=92;

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

    // $ANTLR start "SubSystems"
    public final void mSubSystems() throws RecognitionException {
        try {
            int _type = SubSystems;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:28:12: ( 'subSystems:' )
            // InternalRosSystemLexer.g:28:14: 'subSystems:'
            {
            match("subSystems:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SubSystems"

    // $ANTLR start "Processes"
    public final void mProcesses() throws RecognitionException {
        try {
            int _type = Processes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:30:11: ( 'processes:' )
            // InternalRosSystemLexer.g:30:13: 'processes:'
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
            // InternalRosSystemLexer.g:32:11: ( 'GraphName' )
            // InternalRosSystemLexer.g:32:13: 'GraphName'
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
            // InternalRosSystemLexer.g:34:11: ( 'float32[]' )
            // InternalRosSystemLexer.g:34:13: 'float32[]'
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
            // InternalRosSystemLexer.g:36:11: ( 'float64[]' )
            // InternalRosSystemLexer.g:36:13: 'float64[]'
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

    // $ANTLR start "FromFile"
    public final void mFromFile() throws RecognitionException {
        try {
            int _type = FromFile;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:38:10: ( 'fromFile:' )
            // InternalRosSystemLexer.g:38:12: 'fromFile:'
            {
            match("fromFile:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromFile"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:40:9: ( 'default:' )
            // InternalRosSystemLexer.g:40:11: 'default:'
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
            // InternalRosSystemLexer.g:42:10: ( 'duration' )
            // InternalRosSystemLexer.g:42:12: 'duration'
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
            // InternalRosSystemLexer.g:44:10: ( 'feedback' )
            // InternalRosSystemLexer.g:44:12: 'feedback'
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
            // InternalRosSystemLexer.g:46:10: ( 'string[]' )
            // InternalRosSystemLexer.g:46:12: 'string[]'
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
            // InternalRosSystemLexer.g:48:9: ( 'threads:' )
            // InternalRosSystemLexer.g:48:11: 'threads:'
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
            // InternalRosSystemLexer.g:50:10: ( 'uint16[]' )
            // InternalRosSystemLexer.g:50:12: 'uint16[]'
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
            // InternalRosSystemLexer.g:52:10: ( 'uint32[]' )
            // InternalRosSystemLexer.g:52:12: 'uint32[]'
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
            // InternalRosSystemLexer.g:54:10: ( 'uint64[]' )
            // InternalRosSystemLexer.g:54:12: 'uint64[]'
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
            // InternalRosSystemLexer.g:56:9: ( 'Boolean' )
            // InternalRosSystemLexer.g:56:11: 'Boolean'
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
            // InternalRosSystemLexer.g:58:9: ( 'Integer' )
            // InternalRosSystemLexer.g:58:11: 'Integer'
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
            // InternalRosSystemLexer.g:60:9: ( 'float32' )
            // InternalRosSystemLexer.g:60:11: 'float32'
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
            // InternalRosSystemLexer.g:62:9: ( 'float64' )
            // InternalRosSystemLexer.g:62:11: 'float64'
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
            // InternalRosSystemLexer.g:64:9: ( 'int16[]' )
            // InternalRosSystemLexer.g:64:11: 'int16[]'
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
            // InternalRosSystemLexer.g:66:9: ( 'int32[]' )
            // InternalRosSystemLexer.g:66:11: 'int32[]'
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
            // InternalRosSystemLexer.g:68:9: ( 'int64[]' )
            // InternalRosSystemLexer.g:68:11: 'int64[]'
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
            // InternalRosSystemLexer.g:70:9: ( 'message' )
            // InternalRosSystemLexer.g:70:11: 'message'
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
            // InternalRosSystemLexer.g:72:9: ( 'service' )
            // InternalRosSystemLexer.g:72:11: 'service'
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
            // InternalRosSystemLexer.g:74:9: ( 'uint8[]' )
            // InternalRosSystemLexer.g:74:11: 'uint8[]'
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
            // InternalRosSystemLexer.g:76:7: ( 'Array:' )
            // InternalRosSystemLexer.g:76:9: 'Array:'
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
            // InternalRosSystemLexer.g:78:8: ( 'Base64' )
            // InternalRosSystemLexer.g:78:10: 'Base64'
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
            // InternalRosSystemLexer.g:80:8: ( 'Double' )
            // InternalRosSystemLexer.g:80:10: 'Double'
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
            // InternalRosSystemLexer.g:82:8: ( 'Header' )
            // InternalRosSystemLexer.g:82:10: 'Header'
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
            // InternalRosSystemLexer.g:84:8: ( 'String' )
            // InternalRosSystemLexer.g:84:10: 'String'
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
            // InternalRosSystemLexer.g:86:8: ( 'Struct' )
            // InternalRosSystemLexer.g:86:10: 'Struct'
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
            // InternalRosSystemLexer.g:88:8: ( 'action' )
            // InternalRosSystemLexer.g:88:10: 'action'
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
            // InternalRosSystemLexer.g:90:8: ( 'bool[]' )
            // InternalRosSystemLexer.g:90:10: 'bool[]'
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
            // InternalRosSystemLexer.g:92:8: ( 'byte[]' )
            // InternalRosSystemLexer.g:92:10: 'byte[]'
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
            // InternalRosSystemLexer.g:94:8: ( 'char[]' )
            // InternalRosSystemLexer.g:94:10: 'char[]'
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
            // InternalRosSystemLexer.g:96:8: ( 'int8[]' )
            // InternalRosSystemLexer.g:96:10: 'int8[]'
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
            // InternalRosSystemLexer.g:98:7: ( 'nodes:' )
            // InternalRosSystemLexer.g:98:9: 'nodes:'
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
            // InternalRosSystemLexer.g:100:8: ( 'result' )
            // InternalRosSystemLexer.g:100:10: 'result'
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
            // InternalRosSystemLexer.g:102:10: ( 'string' )
            // InternalRosSystemLexer.g:102:12: 'string'
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
            // InternalRosSystemLexer.g:104:8: ( 'uint16' )
            // InternalRosSystemLexer.g:104:10: 'uint16'
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
            // InternalRosSystemLexer.g:106:8: ( 'uint32' )
            // InternalRosSystemLexer.g:106:10: 'uint32'
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
            // InternalRosSystemLexer.g:108:8: ( 'uint64' )
            // InternalRosSystemLexer.g:108:10: 'uint64'
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
            // InternalRosSystemLexer.g:110:9: ( 'value:' )
            // InternalRosSystemLexer.g:110:11: 'value:'
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
            // InternalRosSystemLexer.g:112:6: ( 'from:' )
            // InternalRosSystemLexer.g:112:8: 'from:'
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
            // InternalRosSystemLexer.g:114:7: ( 'int16' )
            // InternalRosSystemLexer.g:114:9: 'int16'
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
            // InternalRosSystemLexer.g:116:7: ( 'int32' )
            // InternalRosSystemLexer.g:116:9: 'int32'
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
            // InternalRosSystemLexer.g:118:7: ( 'int64' )
            // InternalRosSystemLexer.g:118:9: 'int64'
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
            // InternalRosSystemLexer.g:120:5: ( 'pub->' )
            // InternalRosSystemLexer.g:120:7: 'pub->'
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
            // InternalRosSystemLexer.g:122:5: ( 'sub->' )
            // InternalRosSystemLexer.g:122:7: 'sub->'
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
            // InternalRosSystemLexer.g:124:8: ( 'type:' )
            // InternalRosSystemLexer.g:124:10: 'type:'
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
            // InternalRosSystemLexer.g:126:7: ( 'uint8' )
            // InternalRosSystemLexer.g:126:9: 'uint8'
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
            // InternalRosSystemLexer.g:128:7: ( 'value' )
            // InternalRosSystemLexer.g:128:9: 'value'
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
            // InternalRosSystemLexer.g:130:6: ( 'Date' )
            // InternalRosSystemLexer.g:130:8: 'Date'
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
            // InternalRosSystemLexer.g:132:6: ( 'List' )
            // InternalRosSystemLexer.g:132:8: 'List'
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
            // InternalRosSystemLexer.g:134:4: ( 'ac->' )
            // InternalRosSystemLexer.g:134:6: 'ac->'
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
            // InternalRosSystemLexer.g:136:4: ( 'as->' )
            // InternalRosSystemLexer.g:136:6: 'as->'
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
            // InternalRosSystemLexer.g:138:6: ( 'bool' )
            // InternalRosSystemLexer.g:138:8: 'bool'
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
            // InternalRosSystemLexer.g:140:6: ( 'byte' )
            // InternalRosSystemLexer.g:140:8: 'byte'
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
            // InternalRosSystemLexer.g:142:6: ( 'char' )
            // InternalRosSystemLexer.g:142:8: 'char'
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
            // InternalRosSystemLexer.g:144:6: ( 'goal' )
            // InternalRosSystemLexer.g:144:8: 'goal'
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
            // InternalRosSystemLexer.g:146:6: ( 'int8' )
            // InternalRosSystemLexer.g:146:8: 'int8'
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
            // InternalRosSystemLexer.g:148:6: ( 'name' )
            // InternalRosSystemLexer.g:148:8: 'name'
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
            // InternalRosSystemLexer.g:150:6: ( 'node' )
            // InternalRosSystemLexer.g:150:8: 'node'
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
            // InternalRosSystemLexer.g:152:4: ( 'sc->' )
            // InternalRosSystemLexer.g:152:6: 'sc->'
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
            // InternalRosSystemLexer.g:154:4: ( 'ss->' )
            // InternalRosSystemLexer.g:154:6: 'ss->'
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
            // InternalRosSystemLexer.g:156:6: ( 'time' )
            // InternalRosSystemLexer.g:156:8: 'time'
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
            // InternalRosSystemLexer.g:158:6: ( 'type' )
            // InternalRosSystemLexer.g:158:8: 'type'
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
            // InternalRosSystemLexer.g:160:5: ( 'Any' )
            // InternalRosSystemLexer.g:160:7: 'Any'
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
            // InternalRosSystemLexer.g:162:4: ( 'ns:' )
            // InternalRosSystemLexer.g:162:6: 'ns:'
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
            // InternalRosSystemLexer.g:164:30: ( '-[' )
            // InternalRosSystemLexer.g:164:32: '-['
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
            // InternalRosSystemLexer.g:166:37: ( '[]' )
            // InternalRosSystemLexer.g:166:39: '[]'
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
            // InternalRosSystemLexer.g:168:7: ( ',' )
            // InternalRosSystemLexer.g:168:9: ','
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
            // InternalRosSystemLexer.g:170:13: ( '-' )
            // InternalRosSystemLexer.g:170:15: '-'
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
            // InternalRosSystemLexer.g:172:7: ( ':' )
            // InternalRosSystemLexer.g:172:9: ':'
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
            // InternalRosSystemLexer.g:174:19: ( '[' )
            // InternalRosSystemLexer.g:174:21: '['
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
            // InternalRosSystemLexer.g:176:20: ( ']' )
            // InternalRosSystemLexer.g:176:22: ']'
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
            // InternalRosSystemLexer.g:178:21: ( '0' .. '9' )
            // InternalRosSystemLexer.g:178:23: '0' .. '9'
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
            // InternalRosSystemLexer.g:180:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosSystemLexer.g:180:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosSystemLexer.g:180:15: ( '0b' | '0B' )
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
                    // InternalRosSystemLexer.g:180:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:180:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosSystemLexer.g:180:27: ( '0' | '1' )+
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
            // InternalRosSystemLexer.g:182:14: ( ( 'true' | 'false' ) )
            // InternalRosSystemLexer.g:182:16: ( 'true' | 'false' )
            {
            // InternalRosSystemLexer.g:182:16: ( 'true' | 'false' )
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
                    // InternalRosSystemLexer.g:182:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:182:24: 'false'
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
            // InternalRosSystemLexer.g:184:13: ( ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:184:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:184:15: ( ( RULE_DIGIT )* | '-' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:184:16: ( RULE_DIGIT )*
                    {
                    // InternalRosSystemLexer.g:184:16: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:184:16: RULE_DIGIT
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
                    // InternalRosSystemLexer.g:184:28: '-' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    // InternalRosSystemLexer.g:184:32: ( RULE_DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:184:32: RULE_DIGIT
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

            // InternalRosSystemLexer.g:184:45: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalRosSystemLexer.g:184:46: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRosSystemLexer.g:184:50: ( RULE_DECINT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:184:50: RULE_DECINT
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
                    // InternalRosSystemLexer.g:184:63: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? ( RULE_DIGIT )*
                    {
                    // InternalRosSystemLexer.g:184:63: ( '.' ( RULE_DIGIT )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRosSystemLexer.g:184:64: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosSystemLexer.g:184:68: ( RULE_DIGIT )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // InternalRosSystemLexer.g:184:68: RULE_DIGIT
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

                    // InternalRosSystemLexer.g:184:92: ( '-' | '+' )?
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

                    // InternalRosSystemLexer.g:184:103: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:184:103: RULE_DIGIT
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
            // InternalRosSystemLexer.g:186:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:186:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:186:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:186:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:186:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosSystemLexer.g:186:29: ( RULE_DIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:186:29: RULE_DIGIT
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
                    // InternalRosSystemLexer.g:186:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosSystemLexer.g:186:54: ( RULE_DIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:186:54: RULE_DIGIT
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
            // InternalRosSystemLexer.g:188:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosSystemLexer.g:188:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosSystemLexer.g:188:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosSystemLexer.g:188:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:188:31: '1' .. '3' '0' .. '9'
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
            // InternalRosSystemLexer.g:190:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosSystemLexer.g:190:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosSystemLexer.g:190:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosSystemLexer.g:190:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:190:33: '1' '0' .. '2'
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
            // InternalRosSystemLexer.g:192:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosSystemLexer.g:192:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosSystemLexer.g:194:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosSystemLexer.g:194:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosSystemLexer.g:194:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosSystemLexer.g:194:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:194:41: '2' '0' .. '3'
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
            // InternalRosSystemLexer.g:196:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosSystemLexer.g:196:25: '0' .. '5' '0' .. '9'
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
            // InternalRosSystemLexer.g:198:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosSystemLexer.g:198:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosSystemLexer.g:200:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosSystemLexer.g:200:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosSystemLexer.g:200:25: ( RULE_ID | RULE_STRING )
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
                    // InternalRosSystemLexer.g:200:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:200:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRosSystemLexer.g:200:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalRosSystemLexer.g:200:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:200:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRosSystemLexer.g:200:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRosSystemLexer.g:200:81: '-' RULE_INT
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
            // InternalRosSystemLexer.g:202:21: ()
            // InternalRosSystemLexer.g:202:23: 
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
            // InternalRosSystemLexer.g:204:19: ()
            // InternalRosSystemLexer.g:204:21: 
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
            // InternalRosSystemLexer.g:206:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosSystemLexer.g:206:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRosSystemLexer.g:206:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosSystemLexer.g:206:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalRosSystemLexer.g:208:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosSystemLexer.g:208:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosSystemLexer.g:208:25: ( '/' RULE_ID | RULE_ID '/' )*
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
            	    // InternalRosSystemLexer.g:208:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:208:38: RULE_ID '/'
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
            // InternalRosSystemLexer.g:210:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosSystemLexer.g:210:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosSystemLexer.g:210:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
            	    // InternalRosSystemLexer.g:210:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:210:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystemLexer.g:210:62: '~' RULE_STRING
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
            // InternalRosSystemLexer.g:212:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystemLexer.g:212:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystemLexer.g:212:11: ( '^' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='^') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystemLexer.g:212:11: '^'
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

            // InternalRosSystemLexer.g:212:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalRosSystemLexer.g:214:19: ( ( '0' .. '9' )+ )
            // InternalRosSystemLexer.g:214:21: ( '0' .. '9' )+
            {
            // InternalRosSystemLexer.g:214:21: ( '0' .. '9' )+
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
            	    // InternalRosSystemLexer.g:214:22: '0' .. '9'
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
            // InternalRosSystemLexer.g:216:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystemLexer.g:216:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystemLexer.g:216:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRosSystemLexer.g:216:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosSystemLexer.g:216:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalRosSystemLexer.g:216:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:216:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRosSystemLexer.g:216:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosSystemLexer.g:216:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalRosSystemLexer.g:216:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:216:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRosSystemLexer.g:218:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystemLexer.g:218:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosSystemLexer.g:218:24: ( options {greedy=false; } : . )*
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
            	    // InternalRosSystemLexer.g:218:52: .
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
            // InternalRosSystemLexer.g:220:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystemLexer.g:220:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystemLexer.g:220:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalRosSystemLexer.g:222:16: ( . )
            // InternalRosSystemLexer.g:222:18: .
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
        // InternalRosSystemLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | SubSystems | Processes | GraphName | Float32_1 | Float64_1 | FromFile | Default | Duration | Feedback | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Pub | Sub | Type_1 | Uint8 | Value | Date | List | Ac | As | Bool | Byte | Char | Goal | Int8 | Name | Node | Sc | Ss | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt32=96;
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
                // InternalRosSystemLexer.g:1:108: SubSystems
                {
                mSubSystems(); 

                }
                break;
            case 9 :
                // InternalRosSystemLexer.g:1:119: Processes
                {
                mProcesses(); 

                }
                break;
            case 10 :
                // InternalRosSystemLexer.g:1:129: GraphName
                {
                mGraphName(); 

                }
                break;
            case 11 :
                // InternalRosSystemLexer.g:1:139: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 12 :
                // InternalRosSystemLexer.g:1:149: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 13 :
                // InternalRosSystemLexer.g:1:159: FromFile
                {
                mFromFile(); 

                }
                break;
            case 14 :
                // InternalRosSystemLexer.g:1:168: Default
                {
                mDefault(); 

                }
                break;
            case 15 :
                // InternalRosSystemLexer.g:1:176: Duration
                {
                mDuration(); 

                }
                break;
            case 16 :
                // InternalRosSystemLexer.g:1:185: Feedback
                {
                mFeedback(); 

                }
                break;
            case 17 :
                // InternalRosSystemLexer.g:1:194: String_2
                {
                mString_2(); 

                }
                break;
            case 18 :
                // InternalRosSystemLexer.g:1:203: Threads
                {
                mThreads(); 

                }
                break;
            case 19 :
                // InternalRosSystemLexer.g:1:211: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 20 :
                // InternalRosSystemLexer.g:1:220: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 21 :
                // InternalRosSystemLexer.g:1:229: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 22 :
                // InternalRosSystemLexer.g:1:238: Boolean
                {
                mBoolean(); 

                }
                break;
            case 23 :
                // InternalRosSystemLexer.g:1:246: Integer
                {
                mInteger(); 

                }
                break;
            case 24 :
                // InternalRosSystemLexer.g:1:254: Float32
                {
                mFloat32(); 

                }
                break;
            case 25 :
                // InternalRosSystemLexer.g:1:262: Float64
                {
                mFloat64(); 

                }
                break;
            case 26 :
                // InternalRosSystemLexer.g:1:270: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 27 :
                // InternalRosSystemLexer.g:1:278: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 28 :
                // InternalRosSystemLexer.g:1:286: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 29 :
                // InternalRosSystemLexer.g:1:294: Message
                {
                mMessage(); 

                }
                break;
            case 30 :
                // InternalRosSystemLexer.g:1:302: Service
                {
                mService(); 

                }
                break;
            case 31 :
                // InternalRosSystemLexer.g:1:310: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 32 :
                // InternalRosSystemLexer.g:1:318: Array
                {
                mArray(); 

                }
                break;
            case 33 :
                // InternalRosSystemLexer.g:1:324: Base64
                {
                mBase64(); 

                }
                break;
            case 34 :
                // InternalRosSystemLexer.g:1:331: Double
                {
                mDouble(); 

                }
                break;
            case 35 :
                // InternalRosSystemLexer.g:1:338: Header
                {
                mHeader(); 

                }
                break;
            case 36 :
                // InternalRosSystemLexer.g:1:345: String
                {
                mString(); 

                }
                break;
            case 37 :
                // InternalRosSystemLexer.g:1:352: Struct
                {
                mStruct(); 

                }
                break;
            case 38 :
                // InternalRosSystemLexer.g:1:359: Action
                {
                mAction(); 

                }
                break;
            case 39 :
                // InternalRosSystemLexer.g:1:366: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 40 :
                // InternalRosSystemLexer.g:1:373: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 41 :
                // InternalRosSystemLexer.g:1:380: Char_1
                {
                mChar_1(); 

                }
                break;
            case 42 :
                // InternalRosSystemLexer.g:1:387: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 43 :
                // InternalRosSystemLexer.g:1:394: Nodes
                {
                mNodes(); 

                }
                break;
            case 44 :
                // InternalRosSystemLexer.g:1:400: Result
                {
                mResult(); 

                }
                break;
            case 45 :
                // InternalRosSystemLexer.g:1:407: String_1
                {
                mString_1(); 

                }
                break;
            case 46 :
                // InternalRosSystemLexer.g:1:416: Uint16
                {
                mUint16(); 

                }
                break;
            case 47 :
                // InternalRosSystemLexer.g:1:423: Uint32
                {
                mUint32(); 

                }
                break;
            case 48 :
                // InternalRosSystemLexer.g:1:430: Uint64
                {
                mUint64(); 

                }
                break;
            case 49 :
                // InternalRosSystemLexer.g:1:437: Value_1
                {
                mValue_1(); 

                }
                break;
            case 50 :
                // InternalRosSystemLexer.g:1:445: From
                {
                mFrom(); 

                }
                break;
            case 51 :
                // InternalRosSystemLexer.g:1:450: Int16
                {
                mInt16(); 

                }
                break;
            case 52 :
                // InternalRosSystemLexer.g:1:456: Int32
                {
                mInt32(); 

                }
                break;
            case 53 :
                // InternalRosSystemLexer.g:1:462: Int64
                {
                mInt64(); 

                }
                break;
            case 54 :
                // InternalRosSystemLexer.g:1:468: Pub
                {
                mPub(); 

                }
                break;
            case 55 :
                // InternalRosSystemLexer.g:1:472: Sub
                {
                mSub(); 

                }
                break;
            case 56 :
                // InternalRosSystemLexer.g:1:476: Type_1
                {
                mType_1(); 

                }
                break;
            case 57 :
                // InternalRosSystemLexer.g:1:483: Uint8
                {
                mUint8(); 

                }
                break;
            case 58 :
                // InternalRosSystemLexer.g:1:489: Value
                {
                mValue(); 

                }
                break;
            case 59 :
                // InternalRosSystemLexer.g:1:495: Date
                {
                mDate(); 

                }
                break;
            case 60 :
                // InternalRosSystemLexer.g:1:500: List
                {
                mList(); 

                }
                break;
            case 61 :
                // InternalRosSystemLexer.g:1:505: Ac
                {
                mAc(); 

                }
                break;
            case 62 :
                // InternalRosSystemLexer.g:1:508: As
                {
                mAs(); 

                }
                break;
            case 63 :
                // InternalRosSystemLexer.g:1:511: Bool
                {
                mBool(); 

                }
                break;
            case 64 :
                // InternalRosSystemLexer.g:1:516: Byte
                {
                mByte(); 

                }
                break;
            case 65 :
                // InternalRosSystemLexer.g:1:521: Char
                {
                mChar(); 

                }
                break;
            case 66 :
                // InternalRosSystemLexer.g:1:526: Goal
                {
                mGoal(); 

                }
                break;
            case 67 :
                // InternalRosSystemLexer.g:1:531: Int8
                {
                mInt8(); 

                }
                break;
            case 68 :
                // InternalRosSystemLexer.g:1:536: Name
                {
                mName(); 

                }
                break;
            case 69 :
                // InternalRosSystemLexer.g:1:541: Node
                {
                mNode(); 

                }
                break;
            case 70 :
                // InternalRosSystemLexer.g:1:546: Sc
                {
                mSc(); 

                }
                break;
            case 71 :
                // InternalRosSystemLexer.g:1:549: Ss
                {
                mSs(); 

                }
                break;
            case 72 :
                // InternalRosSystemLexer.g:1:552: Time
                {
                mTime(); 

                }
                break;
            case 73 :
                // InternalRosSystemLexer.g:1:557: Type
                {
                mType(); 

                }
                break;
            case 74 :
                // InternalRosSystemLexer.g:1:562: Any
                {
                mAny(); 

                }
                break;
            case 75 :
                // InternalRosSystemLexer.g:1:566: Ns
                {
                mNs(); 

                }
                break;
            case 76 :
                // InternalRosSystemLexer.g:1:569: HyphenMinusLeftSquareBracket
                {
                mHyphenMinusLeftSquareBracket(); 

                }
                break;
            case 77 :
                // InternalRosSystemLexer.g:1:598: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 78 :
                // InternalRosSystemLexer.g:1:634: Comma
                {
                mComma(); 

                }
                break;
            case 79 :
                // InternalRosSystemLexer.g:1:640: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 80 :
                // InternalRosSystemLexer.g:1:652: Colon
                {
                mColon(); 

                }
                break;
            case 81 :
                // InternalRosSystemLexer.g:1:658: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 82 :
                // InternalRosSystemLexer.g:1:676: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 83 :
                // InternalRosSystemLexer.g:1:695: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 84 :
                // InternalRosSystemLexer.g:1:707: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 85 :
                // InternalRosSystemLexer.g:1:720: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 86 :
                // InternalRosSystemLexer.g:1:732: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 87 :
                // InternalRosSystemLexer.g:1:744: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 88 :
                // InternalRosSystemLexer.g:1:759: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 89 :
                // InternalRosSystemLexer.g:1:781: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 90 :
                // InternalRosSystemLexer.g:1:797: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 91 :
                // InternalRosSystemLexer.g:1:819: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 92 :
                // InternalRosSystemLexer.g:1:845: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 93 :
                // InternalRosSystemLexer.g:1:853: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 94 :
                // InternalRosSystemLexer.g:1:865: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 95 :
                // InternalRosSystemLexer.g:1:881: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 96 :
                // InternalRosSystemLexer.g:1:889: RULE_ANY_OTHER
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
        "\1\52\31\57\1\144\1\146\3\uffff\2\154\1\uffff\1\143\1\154\1\55\1\57\2\55\1\uffff\1\55\1\uffff\1\55\2\uffff\1\57\1\uffff\1\57\1\uffff\57\57\1\uffff\1\154\12\uffff\1\154\1\143\1\154\1\57\2\uffff\1\u00b0\2\uffff\1\u00b0\4\uffff\16\57\2\uffff\20\57\1\u00d5\5\57\2\uffff\4\57\1\uffff\4\57\1\154\1\uffff\1\154\3\uffff\6\57\1\u00ed\4\57\1\u00f3\2\57\1\uffff\1\57\1\uffff\11\57\1\u0102\1\u0103\1\u0104\6\57\1\uffff\1\57\1\u010f\4\57\1\u0115\1\u0117\1\u0119\1\u011a\2\57\1\u011d\1\u011e\1\uffff\1\154\6\57\2\uffff\1\57\1\u0128\1\u012a\1\u012c\2\uffff\7\57\1\uffff\1\57\1\u0104\3\57\4\uffff\3\57\1\u013d\6\57\1\uffff\4\57\4\uffff\1\57\2\uffff\1\57\1\u014b\3\uffff\7\57\6\uffff\3\57\1\u0157\10\57\1\u0161\1\u0163\1\u0165\2\uffff\1\57\1\u0167\2\57\1\uffff\1\u016a\1\u016b\1\u016c\1\u016d\1\u016e\1\uffff\1\u016f\2\uffff\12\57\2\uffff\1\u017a\1\u017c\1\u017e\5\57\6\uffff\1\u0184\1\uffff\1\u0185\1\u0186\6\uffff\12\57\5\uffff\1\57\1\u0192\1\uffff\1\u0193\4\uffff\4\57\1\u0198\5\57\3\uffff\4\57\1\uffff\3\57\1\uffff\6\57\3\uffff\2\57\1\u01ad\1\57\1\uffff\2\57\1\uffff\6\57\1\u01b7\1\57\1\u01b9\1\uffff\1\u01ba\2\uffff";
    static final String DFA32_eofS =
        "\u01bb\uffff";
    static final String DFA32_minS =
        "\1\0\31\57\1\56\1\135\3\uffff\2\56\1\uffff\1\57\1\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\1\57\1\uffff\1\57\1\uffff\15\57\2\55\25\57\2\55\11\57\1\uffff\1\56\10\uffff\1\56\1\uffff\1\56\1\57\1\56\1\57\2\0\1\57\2\0\1\57\4\uffff\12\57\2\55\2\57\2\uffff\26\57\2\uffff\4\57\1\uffff\4\57\3\56\1\0\1\uffff\1\0\16\57\1\uffff\1\57\1\uffff\22\57\1\uffff\16\57\2\55\6\57\2\uffff\4\57\2\uffff\7\57\1\uffff\5\57\4\uffff\12\57\1\uffff\4\57\4\uffff\1\57\2\uffff\2\57\3\uffff\7\57\6\uffff\17\57\2\uffff\4\57\1\uffff\5\57\1\uffff\1\57\2\uffff\12\57\2\uffff\10\57\6\uffff\1\57\1\uffff\2\57\6\uffff\12\57\5\uffff\2\57\1\uffff\1\57\4\uffff\12\57\3\uffff\4\57\1\uffff\3\57\1\uffff\6\57\3\uffff\4\57\1\uffff\2\57\1\uffff\11\57\1\uffff\1\57\2\uffff";
    static final String DFA32_maxS =
        "\1\uffff\31\172\1\145\1\135\3\uffff\2\145\1\uffff\1\172\1\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\1\172\1\uffff\1\172\1\uffff\57\172\1\uffff\1\145\10\uffff\1\145\1\uffff\1\145\1\172\1\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\16\172\2\uffff\26\172\2\uffff\4\172\1\uffff\4\172\3\145\1\uffff\1\uffff\1\uffff\16\172\1\uffff\1\172\1\uffff\22\172\1\uffff\16\172\2\145\6\172\2\uffff\4\172\2\uffff\7\172\1\uffff\5\172\4\uffff\12\172\1\uffff\4\172\4\uffff\1\172\2\uffff\2\172\3\uffff\7\172\6\uffff\17\172\2\uffff\4\172\1\uffff\5\172\1\uffff\1\172\2\uffff\12\172\2\uffff\10\172\6\uffff\1\172\1\uffff\2\172\6\uffff\12\172\5\uffff\2\172\1\uffff\1\172\4\uffff\12\172\3\uffff\4\172\1\uffff\3\172\1\uffff\6\172\3\uffff\4\172\1\uffff\2\172\1\uffff\11\172\1\uffff\1\172\2\uffff";
    static final String DFA32_acceptS =
        "\34\uffff\1\116\1\120\1\122\2\uffff\1\125\6\uffff\1\131\1\uffff\1\132\1\uffff\1\137\1\140\1\uffff\1\134\1\uffff\1\130\57\uffff\1\114\1\uffff\1\125\1\117\1\115\1\121\1\116\1\120\1\122\1\123\1\uffff\1\126\12\uffff\1\131\1\136\1\133\1\137\16\uffff\1\106\1\107\26\uffff\1\75\1\76\4\uffff\1\113\10\uffff\1\135\17\uffff\1\66\1\uffff\1\67\22\uffff\1\112\26\uffff\1\51\1\101\4\uffff\1\52\1\103\7\uffff\1\62\5\uffff\1\70\1\111\1\110\1\124\12\uffff\1\73\4\uffff\1\47\1\77\1\50\1\100\1\uffff\1\105\1\104\2\uffff\1\74\1\102\1\127\7\uffff\1\32\1\63\1\33\1\64\1\34\1\65\17\uffff\1\37\1\71\4\uffff\1\40\5\uffff\1\53\1\uffff\1\61\1\72\12\uffff\1\21\1\55\10\uffff\1\23\1\56\1\24\1\57\1\25\1\60\1\uffff\1\41\2\uffff\1\42\1\43\1\44\1\45\1\46\1\54\12\uffff\1\36\1\13\1\30\1\14\1\31\2\uffff\1\16\1\uffff\1\22\1\26\1\27\1\35\12\uffff\1\15\1\20\1\17\4\uffff\1\12\3\uffff\1\11\6\uffff\1\6\1\7\1\10\4\uffff\1\5\2\uffff\1\4\11\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\1\3\45\uffff\1\6\1\2\111\uffff\1\7\1\1\1\uffff\1\10\1\5\71\uffff\1\0\1\uffff\1\4\u0109\uffff}>";
    static final String[] DFA32_transitionS = {
            "\11\55\2\54\2\55\1\54\22\55\1\54\1\55\1\46\1\50\3\55\1\47\4\55\1\34\1\32\1\41\1\51\1\37\2\40\7\43\1\35\6\55\1\17\1\14\1\45\1\20\1\42\1\45\1\3\1\21\1\15\2\45\1\30\3\45\1\2\1\45\1\1\1\22\7\45\1\33\1\55\1\36\1\44\1\45\1\55\1\23\1\24\1\4\1\11\1\42\1\10\1\31\1\45\1\5\3\45\1\16\1\25\1\45\1\6\1\45\1\26\1\7\1\12\1\13\1\27\4\45\3\55\1\53\uff81\55",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\56\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\63\20\60\1\62\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\64\5\60\1\65\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\67\6\60\1\66\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\70\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\71\20\60\1\72\2\60\1\73\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\77\1\60\1\76\15\60\1\100\1\75\1\74\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\104\3\60\1\103\6\60\1\101\5\60\1\102\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\105\17\60\1\106\5\60",
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
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u0086\30\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0087\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0088\10\60",
            "\1\u0089\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008a\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u008b\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u008c\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u008d\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u008e\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u008f\24\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0090\10\60",
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
            "\1\u00c2\1\uffff\1\52\12\60\3\uffff\1\61\3\uffff\22\60\1\u00c1\7\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00c3\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\u00c4\4\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00c5\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00c6\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00c7\26\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00c8\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00c9\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00ca\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00cb\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00cc\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00cd\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00ce\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00cf\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00d0\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00d1\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00d2\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00d3\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00d4\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u00d6\30\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00d7\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u00d8\26\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00d9\13\60\1\u00da\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00db\21\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00dc\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00dd\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00de\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00df\25\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00e0\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00e1\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00e2\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u00e3\16\60",
            "\1\143\1\uffff\12\u00ac\13\uffff\1\143\37\uffff\1\143",
            "\1\143\1\uffff\12\u00e4\13\uffff\1\143\37\uffff\1\143",
            "\1\143\1\uffff\12\u00e5\13\uffff\1\143\37\uffff\1\143",
            "\42\162\1\163\71\162\1\161\uffa3\162",
            "",
            "\47\165\1\166\64\165\1\164\uffa3\165",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00e6\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00e7\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00e8\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u00e9\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\7\60\1\u00ea\22\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00eb\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u00ec\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00ee\10\60",
            "\1\52\6\60\1\u00ef\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\2\60\1\u00f0\7\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\4\60\1\u00f1\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u00f2\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u00f4\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00f5\25\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u00f6\1\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u00f7\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00f8\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00f9\6\60",
            "\1\52\12\60\1\u00fb\2\uffff\1\61\3\uffff\5\60\1\u00fa\24\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\60\1\u00fc\30\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00fd\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\24\60\1\u00fe\5\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00ff\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0100\31\60",
            "\1\52\12\60\1\u0101\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\1\60\1\u0105\1\60\1\u0106\2\60\1\u0107\1\60\1\u0108\1\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0109\25\60",
            "\1\52\6\60\1\u010a\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u010b\23\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u010c\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u010d\1\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u010e\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0110\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0111\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0112\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0113\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0114\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0116\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0118\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u011b\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u011c\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u011f\1\143\1\uffff\12\143\13\uffff\1\143\37\uffff\1\143",
            "\1\u011f\1\143\1\uffff\12\157\13\uffff\1\143\37\uffff\1\143",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0120\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0121\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0122\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0123\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u0124\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0125\27\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\5\60\1\u0126\24\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0127\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0129\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u012b\3\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u012d\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u012e\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u012f\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u0130\23\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0131\27\60",
            "\1\52\3\60\1\u0132\2\60\1\u0133\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0134\21\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0135\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u0136\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0137\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u0138\26\60",
            "",
            "",
            "",
            "",
            "\1\52\6\60\1\u0139\3\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\2\60\1\u013a\7\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\4\60\1\u013b\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u013c\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u013e\31\60",
            "\1\52\4\60\1\u013f\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0140\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u0141\23\60",
            "\1\52\12\60\1\u0142\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0143\25\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0144\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\6\60\1\u0145\23\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0146\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0147\14\60",
            "",
            "",
            "",
            "",
            "\1\52\12\60\1\u0148\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0149\6\60",
            "\1\52\12\60\1\u014a\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\25\60\1\u014c\4\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u014d\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u014e\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u014f\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0150\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0151\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0152\31\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0153\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u0154\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u0155\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0156\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0158\25\60",
            "\1\52\2\60\1\u0159\7\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\4\60\1\u015a\5\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\13\60\1\u015b\16\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u015c\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u015d\6\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u015e\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u015f\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0160\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0162\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u0164\3\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0166\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0168\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0169\25\60",
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
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0170\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u0171\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0172\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0173\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0174\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u0175\21\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u0176\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0177\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0178\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0179\25\60",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u017b\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\1\u017d\3\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u017f\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\12\60\1\u0180\17\60",
            "\1\52\12\60\1\u0181\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0182\14\60",
            "\1\52\12\60\1\u0183\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
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
            "\1\52\12\60\3\uffff\1\61\3\uffff\15\60\1\u0187\14\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0188\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u0189\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u018a\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u018b\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u018c\13\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u018d\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u018e\10\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u018f\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0190\15\60",
            "",
            "",
            "",
            "",
            "",
            "\1\52\12\60\1\u0191\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u0194\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0195\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\1\u0196\31\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u0197\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u0199\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u019a\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u019b\7\60",
            "\1\52\12\60\1\u019c\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u019d\7\60",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u019e\15\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u019f\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\15\60\1\u01a0\14\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u01a1\7\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u01a2\7\60",
            "\1\52\12\60\1\u01a3\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\1\u01a4\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\52\12\60\1\u01a5\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u01a6\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u01a7\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\30\60\1\u01a8\1\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u01a9\12\60",
            "\1\52\12\60\1\u01aa\2\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u01ab\7\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u01ac\12\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u01ae\31\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\17\60\1\u01af\12\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u01b0\31\60",
            "",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u01b1\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\1\u01b2\31\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u01b3\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u01b4\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\2\60\1\u01b5\27\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u01b6\25\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\52\12\60\3\uffff\1\61\3\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u01b8\25\60",
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
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | SubSystems | Processes | GraphName | Float32_1 | Float64_1 | FromFile | Default | Duration | Feedback | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Char_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Pub | Sub | Type_1 | Uint8 | Value | Date | List | Ac | As | Bool | Byte | Char | Goal | Int8 | Name | Node | Sc | Ss | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_175 = input.LA(1);

                        s = -1;
                        if ( (LA32_175=='\"') ) {s = 115;}

                        else if ( (LA32_175=='\\') ) {s = 113;}

                        else if ( ((LA32_175>='\u0000' && LA32_175<='!')||(LA32_175>='#' && LA32_175<='[')||(LA32_175>=']' && LA32_175<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_114 = input.LA(1);

                        s = -1;
                        if ( (LA32_114=='\"') ) {s = 115;}

                        else if ( (LA32_114=='\\') ) {s = 113;}

                        else if ( ((LA32_114>='\u0000' && LA32_114<='!')||(LA32_114>='#' && LA32_114<='[')||(LA32_114>=']' && LA32_114<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_39 = input.LA(1);

                        s = -1;
                        if ( (LA32_39=='\\') ) {s = 116;}

                        else if ( ((LA32_39>='\u0000' && LA32_39<='&')||(LA32_39>='(' && LA32_39<='[')||(LA32_39>=']' && LA32_39<='\uFFFF')) ) {s = 117;}

                        else if ( (LA32_39=='\'') ) {s = 118;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_0 = input.LA(1);

                        s = -1;
                        if ( (LA32_0=='R') ) {s = 1;}

                        else if ( (LA32_0=='P') ) {s = 2;}

                        else if ( (LA32_0=='G') ) {s = 3;}

                        else if ( (LA32_0=='c') ) {s = 4;}

                        else if ( (LA32_0=='i') ) {s = 5;}

                        else if ( (LA32_0=='p') ) {s = 6;}

                        else if ( (LA32_0=='s') ) {s = 7;}

                        else if ( (LA32_0=='f') ) {s = 8;}

                        else if ( (LA32_0=='d') ) {s = 9;}

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
                    case 4 : 
                        int LA32_177 = input.LA(1);

                        s = -1;
                        if ( (LA32_177=='\'') ) {s = 118;}

                        else if ( (LA32_177=='\\') ) {s = 116;}

                        else if ( ((LA32_177>='\u0000' && LA32_177<='&')||(LA32_177>='(' && LA32_177<='[')||(LA32_177>=']' && LA32_177<='\uFFFF')) ) {s = 117;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_117 = input.LA(1);

                        s = -1;
                        if ( (LA32_117=='\'') ) {s = 118;}

                        else if ( (LA32_117=='\\') ) {s = 116;}

                        else if ( ((LA32_117>='\u0000' && LA32_117<='&')||(LA32_117>='(' && LA32_117<='[')||(LA32_117>=']' && LA32_117<='\uFFFF')) ) {s = 117;}

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
                        int LA32_113 = input.LA(1);

                        s = -1;
                        if ( ((LA32_113>='\u0000' && LA32_113<='\uFFFF')) ) {s = 175;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_116 = input.LA(1);

                        s = -1;
                        if ( ((LA32_116>='\u0000' && LA32_116<='\uFFFF')) ) {s = 177;}

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