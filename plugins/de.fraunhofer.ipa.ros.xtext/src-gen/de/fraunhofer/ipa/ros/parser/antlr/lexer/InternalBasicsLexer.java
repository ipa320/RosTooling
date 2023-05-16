package de.fraunhofer.ipa.ros.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBasicsLexer extends Lexer {
    public static final int RULE_DAY=72;
    public static final int RULE_BEGIN=82;
    public static final int Float32_1=9;
    public static final int Node=57;
    public static final int RULE_DATE_TIME=77;
    public static final int Uint64_1=17;
    public static final int RULE_BOOLEAN=69;
    public static final int RelativeNamespace=4;
    public static final int String=32;
    public static final int RULE_YEAR=74;
    public static final int Int16=44;
    public static final int Result=38;
    public static final int Name=56;
    public static final int RULE_MIN_SEC=76;
    public static final int Float32=20;
    public static final int Goal=54;
    public static final int Bool=52;
    public static final int Uint16=40;
    public static final int ParameterAny=7;
    public static final int List=51;
    public static final int Boolean=18;
    public static final int RightSquareBracket=66;
    public static final int PrivateNamespace=5;
    public static final int Uint8=48;
    public static final int GraphName=8;
    public static final int RULE_ID=78;
    public static final int Byte_1=36;
    public static final int Float64_1=10;
    public static final int RULE_DIGIT=67;
    public static final int Duration=12;
    public static final int Uint32_1=16;
    public static final int GlobalNamespace=6;
    public static final int Double=30;
    public static final int Int16_1=22;
    public static final int Header=31;
    public static final int RULE_INT=80;
    public static final int Byte=53;
    public static final int Type_1=47;
    public static final int Value=49;
    public static final int RULE_ML_COMMENT=87;
    public static final int LeftSquareBracket=65;
    public static final int Uint64=42;
    public static final int Action=34;
    public static final int RULE_END=83;
    public static final int Base64=29;
    public static final int Message=25;
    public static final int Value_1=43;
    public static final int Time=58;
    public static final int RULE_STRING=79;
    public static final int Bool_1=35;
    public static final int Any=60;
    public static final int Struct=33;
    public static final int RULE_SL_COMMENT=84;
    public static final int Comma=63;
    public static final int Uint8_1=27;
    public static final int RULE_MESSAGE_ASIGMENT=81;
    public static final int LeftSquareBracketRightSquareBracket=62;
    public static final int RULE_DOUBLE=71;
    public static final int Feedback=13;
    public static final int Int32=45;
    public static final int RULE_ROS_CONVENTION_A=85;
    public static final int RULE_ROS_CONVENTION_PARAM=86;
    public static final int Colon=64;
    public static final int RULE_DECINT=70;
    public static final int EOF=-1;
    public static final int Uint32=41;
    public static final int RULE_HOUR=75;
    public static final int Ns=61;
    public static final int RULE_WS=88;
    public static final int Int64_1=24;
    public static final int Service=26;
    public static final int Int8=55;
    public static final int RULE_ANY_OTHER=89;
    public static final int Default=11;
    public static final int Int8_1=37;
    public static final int Date=50;
    public static final int Uint16_1=15;
    public static final int Integer=19;
    public static final int Array=28;
    public static final int Type=59;
    public static final int Float64=21;
    public static final int Int64=46;
    public static final int Int32_1=23;
    public static final int RULE_MONTH=73;
    public static final int RULE_BINARY=68;
    public static final int String_1=39;
    public static final int String_2=14;

    // delegates
    // delegators

    public InternalBasicsLexer() {;}
    public InternalBasicsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBasicsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBasicsLexer.g"; }

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:14:19: ( 'RelativeNamespace' )
            // InternalBasicsLexer.g:14:21: 'RelativeNamespace'
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
            // InternalBasicsLexer.g:16:18: ( 'PrivateNamespace' )
            // InternalBasicsLexer.g:16:20: 'PrivateNamespace'
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
            // InternalBasicsLexer.g:18:17: ( 'GlobalNamespace' )
            // InternalBasicsLexer.g:18:19: 'GlobalNamespace'
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
            // InternalBasicsLexer.g:20:14: ( 'ParameterAny' )
            // InternalBasicsLexer.g:20:16: 'ParameterAny'
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

    // $ANTLR start "GraphName"
    public final void mGraphName() throws RecognitionException {
        try {
            int _type = GraphName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:22:11: ( 'GraphName' )
            // InternalBasicsLexer.g:22:13: 'GraphName'
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
            // InternalBasicsLexer.g:24:11: ( 'float32[]' )
            // InternalBasicsLexer.g:24:13: 'float32[]'
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
            // InternalBasicsLexer.g:26:11: ( 'float64[]' )
            // InternalBasicsLexer.g:26:13: 'float64[]'
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
            // InternalBasicsLexer.g:28:9: ( 'default:' )
            // InternalBasicsLexer.g:28:11: 'default:'
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
            // InternalBasicsLexer.g:30:10: ( 'duration' )
            // InternalBasicsLexer.g:30:12: 'duration'
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
            // InternalBasicsLexer.g:32:10: ( 'feedback' )
            // InternalBasicsLexer.g:32:12: 'feedback'
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
            // InternalBasicsLexer.g:34:10: ( 'string[]' )
            // InternalBasicsLexer.g:34:12: 'string[]'
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
            // InternalBasicsLexer.g:36:10: ( 'uint16[]' )
            // InternalBasicsLexer.g:36:12: 'uint16[]'
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
            // InternalBasicsLexer.g:38:10: ( 'uint32[]' )
            // InternalBasicsLexer.g:38:12: 'uint32[]'
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
            // InternalBasicsLexer.g:40:10: ( 'uint64[]' )
            // InternalBasicsLexer.g:40:12: 'uint64[]'
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
            // InternalBasicsLexer.g:42:9: ( 'Boolean' )
            // InternalBasicsLexer.g:42:11: 'Boolean'
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
            // InternalBasicsLexer.g:44:9: ( 'Integer' )
            // InternalBasicsLexer.g:44:11: 'Integer'
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
            // InternalBasicsLexer.g:46:9: ( 'float32' )
            // InternalBasicsLexer.g:46:11: 'float32'
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
            // InternalBasicsLexer.g:48:9: ( 'float64' )
            // InternalBasicsLexer.g:48:11: 'float64'
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
            // InternalBasicsLexer.g:50:9: ( 'int16[]' )
            // InternalBasicsLexer.g:50:11: 'int16[]'
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
            // InternalBasicsLexer.g:52:9: ( 'int32[]' )
            // InternalBasicsLexer.g:52:11: 'int32[]'
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
            // InternalBasicsLexer.g:54:9: ( 'int64[]' )
            // InternalBasicsLexer.g:54:11: 'int64[]'
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
            // InternalBasicsLexer.g:56:9: ( 'message' )
            // InternalBasicsLexer.g:56:11: 'message'
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
            // InternalBasicsLexer.g:58:9: ( 'service' )
            // InternalBasicsLexer.g:58:11: 'service'
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
            // InternalBasicsLexer.g:60:9: ( 'uint8[]' )
            // InternalBasicsLexer.g:60:11: 'uint8[]'
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
            // InternalBasicsLexer.g:62:7: ( 'Array:' )
            // InternalBasicsLexer.g:62:9: 'Array:'
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
            // InternalBasicsLexer.g:64:8: ( 'Base64' )
            // InternalBasicsLexer.g:64:10: 'Base64'
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
            // InternalBasicsLexer.g:66:8: ( 'Double' )
            // InternalBasicsLexer.g:66:10: 'Double'
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
            // InternalBasicsLexer.g:68:8: ( 'Header' )
            // InternalBasicsLexer.g:68:10: 'Header'
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
            // InternalBasicsLexer.g:70:8: ( 'String' )
            // InternalBasicsLexer.g:70:10: 'String'
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
            // InternalBasicsLexer.g:72:8: ( 'Struct' )
            // InternalBasicsLexer.g:72:10: 'Struct'
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
            // InternalBasicsLexer.g:74:8: ( 'action' )
            // InternalBasicsLexer.g:74:10: 'action'
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
            // InternalBasicsLexer.g:76:8: ( 'bool[]' )
            // InternalBasicsLexer.g:76:10: 'bool[]'
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
            // InternalBasicsLexer.g:78:8: ( 'byte[]' )
            // InternalBasicsLexer.g:78:10: 'byte[]'
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
            // InternalBasicsLexer.g:80:8: ( 'int8[]' )
            // InternalBasicsLexer.g:80:10: 'int8[]'
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
            // InternalBasicsLexer.g:82:8: ( 'result' )
            // InternalBasicsLexer.g:82:10: 'result'
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
            // InternalBasicsLexer.g:84:10: ( 'string' )
            // InternalBasicsLexer.g:84:12: 'string'
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
            // InternalBasicsLexer.g:86:8: ( 'uint16' )
            // InternalBasicsLexer.g:86:10: 'uint16'
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
            // InternalBasicsLexer.g:88:8: ( 'uint32' )
            // InternalBasicsLexer.g:88:10: 'uint32'
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
            // InternalBasicsLexer.g:90:8: ( 'uint64' )
            // InternalBasicsLexer.g:90:10: 'uint64'
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
            // InternalBasicsLexer.g:92:9: ( 'value:' )
            // InternalBasicsLexer.g:92:11: 'value:'
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
            // InternalBasicsLexer.g:94:7: ( 'int16' )
            // InternalBasicsLexer.g:94:9: 'int16'
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
            // InternalBasicsLexer.g:96:7: ( 'int32' )
            // InternalBasicsLexer.g:96:9: 'int32'
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
            // InternalBasicsLexer.g:98:7: ( 'int64' )
            // InternalBasicsLexer.g:98:9: 'int64'
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

    // $ANTLR start "Type_1"
    public final void mType_1() throws RecognitionException {
        try {
            int _type = Type_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBasicsLexer.g:100:8: ( 'type:' )
            // InternalBasicsLexer.g:100:10: 'type:'
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
            // InternalBasicsLexer.g:102:7: ( 'uint8' )
            // InternalBasicsLexer.g:102:9: 'uint8'
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
            // InternalBasicsLexer.g:104:7: ( 'value' )
            // InternalBasicsLexer.g:104:9: 'value'
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
            // InternalBasicsLexer.g:106:6: ( 'Date' )
            // InternalBasicsLexer.g:106:8: 'Date'
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
            // InternalBasicsLexer.g:108:6: ( 'List' )
            // InternalBasicsLexer.g:108:8: 'List'
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
            // InternalBasicsLexer.g:110:6: ( 'bool' )
            // InternalBasicsLexer.g:110:8: 'bool'
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
            // InternalBasicsLexer.g:112:6: ( 'byte' )
            // InternalBasicsLexer.g:112:8: 'byte'
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
            // InternalBasicsLexer.g:114:6: ( 'goal' )
            // InternalBasicsLexer.g:114:8: 'goal'
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
            // InternalBasicsLexer.g:116:6: ( 'int8' )
            // InternalBasicsLexer.g:116:8: 'int8'
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
            // InternalBasicsLexer.g:118:6: ( 'name' )
            // InternalBasicsLexer.g:118:8: 'name'
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
            // InternalBasicsLexer.g:120:6: ( 'node' )
            // InternalBasicsLexer.g:120:8: 'node'
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
            // InternalBasicsLexer.g:122:6: ( 'time' )
            // InternalBasicsLexer.g:122:8: 'time'
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
            // InternalBasicsLexer.g:124:6: ( 'type' )
            // InternalBasicsLexer.g:124:8: 'type'
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
            // InternalBasicsLexer.g:126:5: ( 'Any' )
            // InternalBasicsLexer.g:126:7: 'Any'
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
            // InternalBasicsLexer.g:128:4: ( 'ns:' )
            // InternalBasicsLexer.g:128:6: 'ns:'
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
            // InternalBasicsLexer.g:130:37: ( '[]' )
            // InternalBasicsLexer.g:130:39: '[]'
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
            // InternalBasicsLexer.g:132:7: ( ',' )
            // InternalBasicsLexer.g:132:9: ','
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
            // InternalBasicsLexer.g:134:7: ( ':' )
            // InternalBasicsLexer.g:134:9: ':'
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
            // InternalBasicsLexer.g:136:19: ( '[' )
            // InternalBasicsLexer.g:136:21: '['
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
            // InternalBasicsLexer.g:138:20: ( ']' )
            // InternalBasicsLexer.g:138:22: ']'
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
            // InternalBasicsLexer.g:140:21: ( '0' .. '9' )
            // InternalBasicsLexer.g:140:23: '0' .. '9'
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
            // InternalBasicsLexer.g:142:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalBasicsLexer.g:142:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalBasicsLexer.g:142:15: ( '0b' | '0B' )
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
                    // InternalBasicsLexer.g:142:16: '0b'
                    {
                    match("0b");


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:142:21: '0B'
                    {
                    match("0B");


                    }
                    break;

            }

            // InternalBasicsLexer.g:142:27: ( '0' | '1' )+
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
                    // InternalBasicsLexer.g:
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
            // InternalBasicsLexer.g:144:14: ( ( 'true' | 'false' ) )
            // InternalBasicsLexer.g:144:16: ( 'true' | 'false' )
            {
            // InternalBasicsLexer.g:144:16: ( 'true' | 'false' )
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
                    // InternalBasicsLexer.g:144:17: 'true'
                    {
                    match("true");


                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:144:24: 'false'
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
            // InternalBasicsLexer.g:146:13: ( ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalBasicsLexer.g:146:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            // InternalBasicsLexer.g:146:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* )
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
                    // InternalBasicsLexer.g:146:16: RULE_DIGIT
                    {
                    mRULE_DIGIT();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:146:27: '-' ( RULE_DIGIT )*
                    {
                    match('-');
                    // InternalBasicsLexer.g:146:31: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // InternalBasicsLexer.g:146:31: RULE_DIGIT
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

            // InternalBasicsLexer.g:146:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalBasicsLexer.g:146:45: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalBasicsLexer.g:146:49: ( RULE_DECINT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // InternalBasicsLexer.g:146:49: RULE_DECINT
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
                    // InternalBasicsLexer.g:146:62: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalBasicsLexer.g:146:62: ( '.' ( RULE_DIGIT )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalBasicsLexer.g:146:63: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalBasicsLexer.g:146:67: ( RULE_DIGIT )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                                case 1 :
                                    // InternalBasicsLexer.g:146:67: RULE_DIGIT
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

                    // InternalBasicsLexer.g:146:91: ( '-' | '+' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalBasicsLexer.g:
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
            // InternalBasicsLexer.g:148:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalBasicsLexer.g:148:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalBasicsLexer.g:148:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalBasicsLexer.g:148:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:148:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalBasicsLexer.g:148:29: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                        case 1 :
                            // InternalBasicsLexer.g:148:29: RULE_DIGIT
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
                    // InternalBasicsLexer.g:148:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalBasicsLexer.g:148:54: ( RULE_DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                        case 1 :
                            // InternalBasicsLexer.g:148:54: RULE_DIGIT
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
            // InternalBasicsLexer.g:150:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalBasicsLexer.g:150:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalBasicsLexer.g:150:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalBasicsLexer.g:150:22: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:150:31: '1' .. '3' '0' .. '9'
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
            // InternalBasicsLexer.g:152:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalBasicsLexer.g:152:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalBasicsLexer.g:152:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalBasicsLexer.g:152:24: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:152:33: '1' '0' .. '2'
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
            // InternalBasicsLexer.g:154:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalBasicsLexer.g:154:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalBasicsLexer.g:156:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalBasicsLexer.g:156:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalBasicsLexer.g:156:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalBasicsLexer.g:156:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1');
                    matchRange('0','9');

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:156:41: '2' '0' .. '3'
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
            // InternalBasicsLexer.g:158:23: ( '0' .. '5' '0' .. '9' )
            // InternalBasicsLexer.g:158:25: '0' .. '5' '0' .. '9'
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
            // InternalBasicsLexer.g:160:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalBasicsLexer.g:160:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalBasicsLexer.g:162:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalBasicsLexer.g:162:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalBasicsLexer.g:162:25: ( RULE_ID | RULE_STRING )
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
                    // InternalBasicsLexer.g:162:26: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:162:34: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;

            }

            match('=');
            // InternalBasicsLexer.g:162:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalBasicsLexer.g:162:52: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:162:60: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;
                case 3 :
                    // InternalBasicsLexer.g:162:72: RULE_INT
                    {
                    mRULE_INT();

                    }
                    break;
                case 4 :
                    // InternalBasicsLexer.g:162:81: '-' RULE_INT
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
            // InternalBasicsLexer.g:164:21: ()
            // InternalBasicsLexer.g:164:23:
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
            // InternalBasicsLexer.g:166:19: ()
            // InternalBasicsLexer.g:166:21:
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
            // InternalBasicsLexer.g:168:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalBasicsLexer.g:168:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalBasicsLexer.g:168:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
                case 1 :
                    // InternalBasicsLexer.g:168:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalBasicsLexer.g:170:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalBasicsLexer.g:170:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalBasicsLexer.g:170:25: ( '/' RULE_ID | RULE_ID '/' )*
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
                    // InternalBasicsLexer.g:170:26: '/' RULE_ID
                    {
                    match('/');
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:170:38: RULE_ID '/'
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
            // InternalBasicsLexer.g:172:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalBasicsLexer.g:172:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalBasicsLexer.g:172:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
                    // InternalBasicsLexer.g:172:30: '/' RULE_STRING
                    {
                    match('/');
                    mRULE_STRING();

                    }
                    break;
                case 2 :
                    // InternalBasicsLexer.g:172:46: RULE_STRING '/'
                    {
                    mRULE_STRING();
                    match('/');

                    }
                    break;
                case 3 :
                    // InternalBasicsLexer.g:172:62: '~' RULE_STRING
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
            // InternalBasicsLexer.g:174:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBasicsLexer.g:174:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBasicsLexer.g:174:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBasicsLexer.g:174:11: '^'
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

            // InternalBasicsLexer.g:174:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
                case 1 :
                    // InternalBasicsLexer.g:
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
            // InternalBasicsLexer.g:176:19: ( ( '0' .. '9' )+ )
            // InternalBasicsLexer.g:176:21: ( '0' .. '9' )+
            {
            // InternalBasicsLexer.g:176:21: ( '0' .. '9' )+
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
                    // InternalBasicsLexer.g:176:22: '0' .. '9'
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
            // InternalBasicsLexer.g:178:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBasicsLexer.g:178:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBasicsLexer.g:178:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalBasicsLexer.g:178:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalBasicsLexer.g:178:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // InternalBasicsLexer.g:178:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalBasicsLexer.g:178:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalBasicsLexer.g:178:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalBasicsLexer.g:178:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // InternalBasicsLexer.g:178:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalBasicsLexer.g:178:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalBasicsLexer.g:180:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBasicsLexer.g:180:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalBasicsLexer.g:180:24: ( options {greedy=false; } : . )*
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
                    // InternalBasicsLexer.g:180:52: .
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
            // InternalBasicsLexer.g:182:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBasicsLexer.g:182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBasicsLexer.g:182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
                    // InternalBasicsLexer.g:
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
            // InternalBasicsLexer.g:184:16: ( . )
            // InternalBasicsLexer.g:184:18: .
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
        // InternalBasicsLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=77;
        alt30 = dfa30.predict(input);
        switch (alt30) {
            case 1 :
                // InternalBasicsLexer.g:1:10: RelativeNamespace
                {
                mRelativeNamespace();

                }
                break;
            case 2 :
                // InternalBasicsLexer.g:1:28: PrivateNamespace
                {
                mPrivateNamespace();

                }
                break;
            case 3 :
                // InternalBasicsLexer.g:1:45: GlobalNamespace
                {
                mGlobalNamespace();

                }
                break;
            case 4 :
                // InternalBasicsLexer.g:1:61: ParameterAny
                {
                mParameterAny();

                }
                break;
            case 5 :
                // InternalBasicsLexer.g:1:74: GraphName
                {
                mGraphName();

                }
                break;
            case 6 :
                // InternalBasicsLexer.g:1:84: Float32_1
                {
                mFloat32_1();

                }
                break;
            case 7 :
                // InternalBasicsLexer.g:1:94: Float64_1
                {
                mFloat64_1();

                }
                break;
            case 8 :
                // InternalBasicsLexer.g:1:104: Default
                {
                mDefault();

                }
                break;
            case 9 :
                // InternalBasicsLexer.g:1:112: Duration
                {
                mDuration();

                }
                break;
            case 10 :
                // InternalBasicsLexer.g:1:121: Feedback
                {
                mFeedback();

                }
                break;
            case 11 :
                // InternalBasicsLexer.g:1:130: String_2
                {
                mString_2();

                }
                break;
            case 12 :
                // InternalBasicsLexer.g:1:139: Uint16_1
                {
                mUint16_1();

                }
                break;
            case 13 :
                // InternalBasicsLexer.g:1:148: Uint32_1
                {
                mUint32_1();

                }
                break;
            case 14 :
                // InternalBasicsLexer.g:1:157: Uint64_1
                {
                mUint64_1();

                }
                break;
            case 15 :
                // InternalBasicsLexer.g:1:166: Boolean
                {
                mBoolean();

                }
                break;
            case 16 :
                // InternalBasicsLexer.g:1:174: Integer
                {
                mInteger();

                }
                break;
            case 17 :
                // InternalBasicsLexer.g:1:182: Float32
                {
                mFloat32();

                }
                break;
            case 18 :
                // InternalBasicsLexer.g:1:190: Float64
                {
                mFloat64();

                }
                break;
            case 19 :
                // InternalBasicsLexer.g:1:198: Int16_1
                {
                mInt16_1();

                }
                break;
            case 20 :
                // InternalBasicsLexer.g:1:206: Int32_1
                {
                mInt32_1();

                }
                break;
            case 21 :
                // InternalBasicsLexer.g:1:214: Int64_1
                {
                mInt64_1();

                }
                break;
            case 22 :
                // InternalBasicsLexer.g:1:222: Message
                {
                mMessage();

                }
                break;
            case 23 :
                // InternalBasicsLexer.g:1:230: Service
                {
                mService();

                }
                break;
            case 24 :
                // InternalBasicsLexer.g:1:238: Uint8_1
                {
                mUint8_1();

                }
                break;
            case 25 :
                // InternalBasicsLexer.g:1:246: Array
                {
                mArray();

                }
                break;
            case 26 :
                // InternalBasicsLexer.g:1:252: Base64
                {
                mBase64();

                }
                break;
            case 27 :
                // InternalBasicsLexer.g:1:259: Double
                {
                mDouble();

                }
                break;
            case 28 :
                // InternalBasicsLexer.g:1:266: Header
                {
                mHeader();

                }
                break;
            case 29 :
                // InternalBasicsLexer.g:1:273: String
                {
                mString();

                }
                break;
            case 30 :
                // InternalBasicsLexer.g:1:280: Struct
                {
                mStruct();

                }
                break;
            case 31 :
                // InternalBasicsLexer.g:1:287: Action
                {
                mAction();

                }
                break;
            case 32 :
                // InternalBasicsLexer.g:1:294: Bool_1
                {
                mBool_1();

                }
                break;
            case 33 :
                // InternalBasicsLexer.g:1:301: Byte_1
                {
                mByte_1();

                }
                break;
            case 34 :
                // InternalBasicsLexer.g:1:308: Int8_1
                {
                mInt8_1();

                }
                break;
            case 35 :
                // InternalBasicsLexer.g:1:315: Result
                {
                mResult();

                }
                break;
            case 36 :
                // InternalBasicsLexer.g:1:322: String_1
                {
                mString_1();

                }
                break;
            case 37 :
                // InternalBasicsLexer.g:1:331: Uint16
                {
                mUint16();

                }
                break;
            case 38 :
                // InternalBasicsLexer.g:1:338: Uint32
                {
                mUint32();

                }
                break;
            case 39 :
                // InternalBasicsLexer.g:1:345: Uint64
                {
                mUint64();

                }
                break;
            case 40 :
                // InternalBasicsLexer.g:1:352: Value_1
                {
                mValue_1();

                }
                break;
            case 41 :
                // InternalBasicsLexer.g:1:360: Int16
                {
                mInt16();

                }
                break;
            case 42 :
                // InternalBasicsLexer.g:1:366: Int32
                {
                mInt32();

                }
                break;
            case 43 :
                // InternalBasicsLexer.g:1:372: Int64
                {
                mInt64();

                }
                break;
            case 44 :
                // InternalBasicsLexer.g:1:378: Type_1
                {
                mType_1();

                }
                break;
            case 45 :
                // InternalBasicsLexer.g:1:385: Uint8
                {
                mUint8();

                }
                break;
            case 46 :
                // InternalBasicsLexer.g:1:391: Value
                {
                mValue();

                }
                break;
            case 47 :
                // InternalBasicsLexer.g:1:397: Date
                {
                mDate();

                }
                break;
            case 48 :
                // InternalBasicsLexer.g:1:402: List
                {
                mList();

                }
                break;
            case 49 :
                // InternalBasicsLexer.g:1:407: Bool
                {
                mBool();

                }
                break;
            case 50 :
                // InternalBasicsLexer.g:1:412: Byte
                {
                mByte();

                }
                break;
            case 51 :
                // InternalBasicsLexer.g:1:417: Goal
                {
                mGoal();

                }
                break;
            case 52 :
                // InternalBasicsLexer.g:1:422: Int8
                {
                mInt8();

                }
                break;
            case 53 :
                // InternalBasicsLexer.g:1:427: Name
                {
                mName();

                }
                break;
            case 54 :
                // InternalBasicsLexer.g:1:432: Node
                {
                mNode();

                }
                break;
            case 55 :
                // InternalBasicsLexer.g:1:437: Time
                {
                mTime();

                }
                break;
            case 56 :
                // InternalBasicsLexer.g:1:442: Type
                {
                mType();

                }
                break;
            case 57 :
                // InternalBasicsLexer.g:1:447: Any
                {
                mAny();

                }
                break;
            case 58 :
                // InternalBasicsLexer.g:1:451: Ns
                {
                mNs();

                }
                break;
            case 59 :
                // InternalBasicsLexer.g:1:454: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket();

                }
                break;
            case 60 :
                // InternalBasicsLexer.g:1:490: Comma
                {
                mComma();

                }
                break;
            case 61 :
                // InternalBasicsLexer.g:1:496: Colon
                {
                mColon();

                }
                break;
            case 62 :
                // InternalBasicsLexer.g:1:502: LeftSquareBracket
                {
                mLeftSquareBracket();

                }
                break;
            case 63 :
                // InternalBasicsLexer.g:1:520: RightSquareBracket
                {
                mRightSquareBracket();

                }
                break;
            case 64 :
                // InternalBasicsLexer.g:1:539: RULE_BINARY
                {
                mRULE_BINARY();

                }
                break;
            case 65 :
                // InternalBasicsLexer.g:1:551: RULE_BOOLEAN
                {
                mRULE_BOOLEAN();

                }
                break;
            case 66 :
                // InternalBasicsLexer.g:1:564: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 67 :
                // InternalBasicsLexer.g:1:576: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 68 :
                // InternalBasicsLexer.g:1:588: RULE_DATE_TIME
                {
                mRULE_DATE_TIME();

                }
                break;
            case 69 :
                // InternalBasicsLexer.g:1:603: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT();

                }
                break;
            case 70 :
                // InternalBasicsLexer.g:1:625: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 71 :
                // InternalBasicsLexer.g:1:641: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A();

                }
                break;
            case 72 :
                // InternalBasicsLexer.g:1:663: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM();

                }
                break;
            case 73 :
                // InternalBasicsLexer.g:1:689: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 74 :
                // InternalBasicsLexer.g:1:697: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 75 :
                // InternalBasicsLexer.g:1:709: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 76 :
                // InternalBasicsLexer.g:1:725: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 77 :
                // InternalBasicsLexer.g:1:733: RULE_ANY_OTHER
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
            return "146:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA30_eotS =
        "\1\46\27\54\1\123\3\uffff\2\131\1\51\1\131\1\51\1\54\2\51\1\uffff\1\51\1\uffff\1\51\2\uffff\2\54\2\uffff\44\54\11\uffff\2\131\1\54\2\uffff\1\u0090\2\uffff\1\u0090\4\uffff\23\54\1\u00a8\20\54\1\uffff\2\131\3\uffff\23\54\1\u00d2\2\54\1\uffff\1\54\1\u00d6\4\54\1\u00dc\1\u00de\2\54\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\131\7\54\1\u00e4\7\54\1\u00f9\3\54\1\u00fe\1\u0100\1\u0102\2\uffff\3\54\1\uffff\4\54\4\uffff\1\54\1\u010c\10\uffff\12\54\1\u0118\1\54\1\u011b\1\u011d\1\u011f\2\uffff\1\54\1\u0121\1\54\6\uffff\1\54\1\uffff\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128\1\u0129\2\uffff\5\54\1\u0130\1\u0132\3\54\2\uffff\1\u0136\6\uffff\1\u0137\1\uffff\1\u0138\1\u0139\6\uffff\5\54\4\uffff\1\u013f\1\uffff\1\u0140\4\uffff\4\54\1\u0145\2\uffff\4\54\1\uffff\6\54\1\u0150\3\54\1\uffff\6\54\1\u015a\1\54\1\u015c\1\uffff\1\u015d\2\uffff";
    static final String DFA30_eofS =
        "\u015e\uffff";
    static final String DFA30_minS =
        "\1\0\27\57\1\135\3\uffff\4\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\2\57\2\uffff\44\57\11\uffff\1\60\1\56\1\57\2\0\1\57\2\0\1\57\4\uffff\44\57\1\uffff\1\60\1\56\1\0\1\uffff\1\0\26\57\1\uffff\21\57\1\55\26\57\2\uffff\3\57\1\uffff\4\57\4\uffff\2\57\10\uffff\17\57\2\uffff\3\57\6\uffff\1\57\1\uffff\6\57\2\uffff\12\57\2\uffff\1\57\6\uffff\1\57\1\uffff\2\57\6\uffff\5\57\4\uffff\1\57\1\uffff\1\57\4\uffff\5\57\2\uffff\4\57\1\uffff\12\57\1\uffff\11\57\1\uffff\1\57\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\27\172\1\135\3\uffff\4\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\2\172\2\uffff\44\172\11\uffff\1\71\1\145\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\44\172\1\uffff\1\71\1\145\1\uffff\1\uffff\1\uffff\26\172\1\uffff\21\172\1\55\26\172\2\uffff\3\172\1\uffff\4\172\4\uffff\2\172\10\uffff\17\172\2\uffff\3\172\6\uffff\1\172\1\uffff\6\172\2\uffff\12\172\2\uffff\1\172\6\uffff\1\172\1\uffff\2\172\6\uffff\5\172\4\uffff\1\172\1\uffff\1\172\4\uffff\5\172\2\uffff\4\172\1\uffff\12\172\1\uffff\11\172\1\uffff\1\172\2\uffff";
    static final String DFA30_acceptS =
        "\31\uffff\1\74\1\75\1\77\10\uffff\1\106\1\uffff\1\107\1\uffff\1\114\1\115\2\uffff\1\111\1\105\44\uffff\1\73\1\76\1\74\1\75\1\77\1\100\1\104\1\103\1\102\11\uffff\1\106\1\113\1\110\1\114\44\uffff\1\72\3\uffff\1\112\27\uffff\1\71\50\uffff\1\42\1\64\3\uffff\1\57\4\uffff\1\40\1\61\1\41\1\62\2\uffff\1\54\1\70\1\67\1\101\1\60\1\63\1\65\1\66\17\uffff\1\30\1\55\3\uffff\1\23\1\51\1\24\1\52\1\25\1\53\1\uffff\1\31\6\uffff\1\50\1\56\12\uffff\1\13\1\44\1\uffff\1\14\1\45\1\15\1\46\1\16\1\47\1\uffff\1\32\2\uffff\1\33\1\34\1\35\1\36\1\37\1\43\5\uffff\1\6\1\21\1\7\1\22\1\uffff\1\10\1\uffff\1\27\1\17\1\20\1\26\5\uffff\1\12\1\11\4\uffff\1\5\12\uffff\1\4\11\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA30_specialS =
        "\1\3\41\uffff\1\0\1\10\72\uffff\1\1\1\7\1\uffff\1\2\1\5\54\uffff\1\6\1\uffff\1\4\u00cc\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\42\1\44\3\51\1\43\4\51\1\31\1\36\1\51\1\45\1\34\2\35\7\37\1\32\6\51\1\14\1\10\1\41\1\15\2\41\1\3\1\16\1\11\2\41\1\25\3\41\1\2\1\41\1\1\1\17\7\41\1\30\1\51\1\33\1\40\1\41\1\51\1\20\1\21\1\41\1\5\1\41\1\4\1\26\1\41\1\12\3\41\1\13\1\27\3\41\1\22\1\6\1\24\1\7\1\23\4\41\3\51\1\47\uff81\51",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\52\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\57\20\53\1\56\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\60\5\53\1\61\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\64\3\53\1\63\6\53\1\62\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\65\17\53\1\66\5\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\70\16\53\1\67\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\71\21\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\73\15\53\1\72\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\74\14\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\75\14\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\76\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\100\3\53\1\77\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\102\15\53\1\101\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\103\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\104\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\105\27\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\106\11\53\1\107\1\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\110\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\111\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\113\10\53\1\114\6\53\1\112\1\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\115\21\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\116\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\117\15\53\1\120\3\53\1\121\7\53",
            "\1\122",
            "",
            "",
            "",
            "\1\132\1\uffff\12\130\10\uffff\1\127\2\uffff\1\132\34\uffff\1\127\2\uffff\1\132",
            "\1\132\1\uffff\12\133\13\uffff\1\132\37\uffff\1\132",
            "\1\132\1\uffff\12\134\13\uffff\1\132\37\uffff\1\132",
            "\1\132\26\uffff\1\132\37\uffff\1\132",
            "\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\42\137\1\140\71\137\1\136\uffa3\137",
            "\47\142\1\143\64\142\1\141\uffa3\142",
            "",
            "\1\146\4\uffff\1\146\2\uffff\1\145\26\uffff\32\46\3\uffff\2\46\1\uffff\32\46",
            "",
            "\1\146\4\uffff\1\146",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\150\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\151\21\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\152\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\153\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\154\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\155\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\156\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\157\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\5\53\1\160\24\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\161\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\162\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\163\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\164\14\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\165\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\166\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\167\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\170\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\171\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\172\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\173\1\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\174\5\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\175\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\176\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\177\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0080\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u0081\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0082\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0083\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0084\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u0085\12\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u0086\15\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u0087\5\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0088\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0089\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u008a\15\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u008b\26\53",
            "\1\46\12\53\1\u008c\2\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u008d",
            "\1\132\1\uffff\12\u008e\13\uffff\1\132\37\uffff\1\132",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\0\u008f",
            "\42\137\1\140\71\137\1\136\uffa3\137",
            "\1\146\15\uffff\1\55",
            "\0\u0091",
            "\47\142\1\143\64\142\1\141\uffa3\142",
            "\1\146\15\uffff\1\55",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0092\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u0093\4\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0094\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\53\1\u0095\30\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u0096\12\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0097\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u0098\26\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0099\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u009a\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u009b\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u009c\21\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u009d\4\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u009e\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u009f\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00a0\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00a1\25\53",
            "\1\46\1\53\1\u00a2\1\53\1\u00a3\2\53\1\u00a4\1\53\1\u00a5\1\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00a6\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u00a7\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\53\1\u00a9\30\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00aa\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u00ab\26\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00ac\13\53\1\u00ad\5\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00ae\21\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00af\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b0\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u00b1\5\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u00b2\5\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b3\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b4\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b5\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00b6\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00b7\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b8\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b9\25\53",
            "",
            "\12\u00ba",
            "\1\132\1\uffff\12\u008e\13\uffff\1\132\37\uffff\1\132",
            "\42\137\1\140\71\137\1\136\uffa3\137",
            "",
            "\47\142\1\143\64\142\1\141\uffa3\142",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00bb\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u00bc\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u00bd\15\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u00be\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u00bf\22\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00c0\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\53\1\u00c1\30\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00c2\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u00c3\5\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00c4\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00c5\14\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00c6\21\53",
            "\1\46\1\53\1\u00c7\1\53\1\u00c8\2\53\1\u00c9\1\53\1\u00ca\1\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00cb\25\53",
            "\1\46\6\53\1\u00cc\3\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u00cd\23\53",
            "\1\46\6\53\1\u00ce\3\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\2\53\1\u00cf\7\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\4\53\1\u00d0\5\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u00d1\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u00d3\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\u00d4\1\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00d5\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00d7\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00d8\14\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00d9\27\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u00da\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u00db\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u00dd\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00df\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00e0\25\53",
            "\1\46\12\53\1\u00e1\2\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\130",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00e9\21\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00ea\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00eb\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00ec\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\15\53\1\u00ed\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\3\53\1\u00ee\2\53\1\u00ef\3\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u00f0\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00f1\16\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00f2\21\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u00f3\23\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00f4\27\53",
            "\1\46\6\53\1\u00f5\3\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\2\53\1\u00f6\7\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\4\53\1\u00f7\5\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u00f8\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u00fa\31\53",
            "\1\46\4\53\1\u00fb\5\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00fc\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u00fd\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u00ff\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u0101\3\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u0103\23\53",
            "\1\46\12\53\1\u0104\2\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0105\25\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0106\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u0107\23\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0108\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0109\14\53",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u010a\6\53",
            "\1\46\12\53\1\u010b\2\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u010d\4\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u010e\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u010f\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\15\53\1\u0110\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0111\31\53",
            "\1\46\2\53\1\u0112\7\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\4\53\1\u0113\5\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u0114\27\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0115\6\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u0116\13\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u0117\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0119\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u011a\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u011c\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u011e\3\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0120\14\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0122\10\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0123\25\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u012a\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\15\53\1\u012b\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u012c\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u012d\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u012e\15\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u012f\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\1\u0131\3\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\12\53\1\u0133\17\53",
            "\1\46\12\53\1\u0134\2\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0135\14\53",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\15\53\1\u013a\14\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u013b\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u013c\10\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u013d\15\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u013e\25\53",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0141\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u0142\15\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\1\u0143\31\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0144\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u0146\15\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0147\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0148\14\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0149\7\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u014a\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u014b\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\u014c\1\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u014d\12\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u014e\7\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u014f\12\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0151\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u0152\12\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0153\31\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u0154\27\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\1\u0155\31\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u0156\27\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0157\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u0158\27\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0159\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u015b\25\53",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\46\12\53\3\uffff\1\55\3\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
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
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | GraphName | Float32_1 | Float64_1 | Default | Duration | Feedback | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Float32 | Float64 | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA30_34 = input.LA(1);

                        s = -1;
                        if ( (LA30_34=='\\') ) {s = 94;}

                        else if ( ((LA30_34>='\u0000' && LA30_34<='!')||(LA30_34>='#' && LA30_34<='[')||(LA30_34>=']' && LA30_34<='\uFFFF')) ) {s = 95;}

                        else if ( (LA30_34=='\"') ) {s = 96;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA30_94 = input.LA(1);

                        s = -1;
                        if ( ((LA30_94>='\u0000' && LA30_94<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 :
                        int LA30_97 = input.LA(1);

                        s = -1;
                        if ( ((LA30_97>='\u0000' && LA30_97<='\uFFFF')) ) {s = 145;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='R') ) {s = 1;}

                        else if ( (LA30_0=='P') ) {s = 2;}

                        else if ( (LA30_0=='G') ) {s = 3;}

                        else if ( (LA30_0=='f') ) {s = 4;}

                        else if ( (LA30_0=='d') ) {s = 5;}

                        else if ( (LA30_0=='s') ) {s = 6;}

                        else if ( (LA30_0=='u') ) {s = 7;}

                        else if ( (LA30_0=='B') ) {s = 8;}

                        else if ( (LA30_0=='I') ) {s = 9;}

                        else if ( (LA30_0=='i') ) {s = 10;}

                        else if ( (LA30_0=='m') ) {s = 11;}

                        else if ( (LA30_0=='A') ) {s = 12;}

                        else if ( (LA30_0=='D') ) {s = 13;}

                        else if ( (LA30_0=='H') ) {s = 14;}

                        else if ( (LA30_0=='S') ) {s = 15;}

                        else if ( (LA30_0=='a') ) {s = 16;}

                        else if ( (LA30_0=='b') ) {s = 17;}

                        else if ( (LA30_0=='r') ) {s = 18;}

                        else if ( (LA30_0=='v') ) {s = 19;}

                        else if ( (LA30_0=='t') ) {s = 20;}

                        else if ( (LA30_0=='L') ) {s = 21;}

                        else if ( (LA30_0=='g') ) {s = 22;}

                        else if ( (LA30_0=='n') ) {s = 23;}

                        else if ( (LA30_0=='[') ) {s = 24;}

                        else if ( (LA30_0==',') ) {s = 25;}

                        else if ( (LA30_0==':') ) {s = 26;}

                        else if ( (LA30_0==']') ) {s = 27;}

                        else if ( (LA30_0=='0') ) {s = 28;}

                        else if ( ((LA30_0>='1' && LA30_0<='2')) ) {s = 29;}

                        else if ( (LA30_0=='-') ) {s = 30;}

                        else if ( ((LA30_0>='3' && LA30_0<='9')) ) {s = 31;}

                        else if ( (LA30_0=='^') ) {s = 32;}

                        else if ( (LA30_0=='C'||(LA30_0>='E' && LA30_0<='F')||(LA30_0>='J' && LA30_0<='K')||(LA30_0>='M' && LA30_0<='O')||LA30_0=='Q'||(LA30_0>='T' && LA30_0<='Z')||LA30_0=='_'||LA30_0=='c'||LA30_0=='e'||LA30_0=='h'||(LA30_0>='j' && LA30_0<='l')||(LA30_0>='o' && LA30_0<='q')||(LA30_0>='w' && LA30_0<='z')) ) {s = 33;}

                        else if ( (LA30_0=='\"') ) {s = 34;}

                        else if ( (LA30_0=='\'') ) {s = 35;}

                        else if ( (LA30_0=='#') ) {s = 36;}

                        else if ( (LA30_0=='/') ) {s = 37;}

                        else if ( (LA30_0=='~') ) {s = 39;}

                        else if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {s = 40;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\u001F')||LA30_0=='!'||(LA30_0>='$' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='+')||LA30_0=='.'||(LA30_0>=';' && LA30_0<='@')||LA30_0=='\\'||LA30_0=='`'||(LA30_0>='{' && LA30_0<='}')||(LA30_0>='\u007F' && LA30_0<='\uFFFF')) ) {s = 41;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA30_145 = input.LA(1);

                        s = -1;
                        if ( (LA30_145=='\'') ) {s = 99;}

                        else if ( (LA30_145=='\\') ) {s = 97;}

                        else if ( ((LA30_145>='\u0000' && LA30_145<='&')||(LA30_145>='(' && LA30_145<='[')||(LA30_145>=']' && LA30_145<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA30_98 = input.LA(1);

                        s = -1;
                        if ( (LA30_98=='\'') ) {s = 99;}

                        else if ( (LA30_98=='\\') ) {s = 97;}

                        else if ( ((LA30_98>='\u0000' && LA30_98<='&')||(LA30_98>='(' && LA30_98<='[')||(LA30_98>=']' && LA30_98<='\uFFFF')) ) {s = 98;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 :
                        int LA30_143 = input.LA(1);

                        s = -1;
                        if ( (LA30_143=='\"') ) {s = 96;}

                        else if ( (LA30_143=='\\') ) {s = 94;}

                        else if ( ((LA30_143>='\u0000' && LA30_143<='!')||(LA30_143>='#' && LA30_143<='[')||(LA30_143>=']' && LA30_143<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 :
                        int LA30_95 = input.LA(1);

                        s = -1;
                        if ( (LA30_95=='\"') ) {s = 96;}

                        else if ( (LA30_95=='\\') ) {s = 94;}

                        else if ( ((LA30_95>='\u0000' && LA30_95<='!')||(LA30_95>='#' && LA30_95<='[')||(LA30_95>=']' && LA30_95<='\uFFFF')) ) {s = 95;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 :
                        int LA30_35 = input.LA(1);

                        s = -1;
                        if ( (LA30_35=='\\') ) {s = 97;}

                        else if ( ((LA30_35>='\u0000' && LA30_35<='&')||(LA30_35>='(' && LA30_35<='[')||(LA30_35>=']' && LA30_35<='\uFFFF')) ) {s = 98;}

                        else if ( (LA30_35=='\'') ) {s = 99;}

                        else s = 41;

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
