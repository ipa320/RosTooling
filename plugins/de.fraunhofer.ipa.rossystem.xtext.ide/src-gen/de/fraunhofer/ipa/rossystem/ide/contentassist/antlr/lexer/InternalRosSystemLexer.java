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
    public static final int RULE_DATE_TIME=90;
    public static final int Uint64_1=18;
    public static final int String=43;
    public static final int Processes=11;
    public static final int Int16=57;
    public static final int Float32=31;
    public static final int Goal=67;
    public static final int Bool=65;
    public static final int FromPub=22;
    public static final int Uint16=52;
    public static final int Boolean=25;
    public static final int Uint8=61;
    public static final int Parameters=10;
    public static final int RULE_ID=91;
    public static final int RULE_DIGIT=80;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=27;
    public static final int Header=42;
    public static final int RULE_INT=93;
    public static final int Byte=66;
    public static final int RULE_ML_COMMENT=100;
    public static final int LeftSquareBracket=78;
    public static final int Base64=40;
    public static final int FromSS=36;
    public static final int Comma=75;
    public static final int HyphenMinus=76;
    public static final int RULE_MESSAGE_ASIGMENT=94;
    public static final int Int32=58;
    public static final int RULE_DECINT=83;
    public static final int Uint32=53;
    public static final int RULE_HOUR=88;
    public static final int Int8=68;
    public static final int Default=19;
    public static final int Int8_1=47;
    public static final int Uint16_1=16;
    public static final int Type=72;
    public static final int Float64=32;
    public static final int Int32_1=28;
    public static final int FromSC=35;
    public static final int RULE_BINARY=81;
    public static final int String_1=51;
    public static final int String_2=15;
    public static final int FromAC=33;
    public static final int RULE_DAY=85;
    public static final int RULE_BEGIN=95;
    public static final int RULE_BOOLEAN=82;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=87;
    public static final int Result=50;
    public static final int Name=69;
    public static final int RULE_MIN_SEC=89;
    public static final int FromAS=34;
    public static final int ParameterAny=7;
    public static final int List=64;
    public static final int RightSquareBracket=79;
    public static final int PrivateNamespace=5;
    public static final int GraphName=12;
    public static final int Byte_1=46;
    public static final int Float64_1=14;
    public static final int Uint32_1=17;
    public static final int Duration=20;
    public static final int Double=41;
    public static final int Type_1=60;
    public static final int Value=62;
    public static final int Uint64=54;
    public static final int Action=48;
    public static final int RULE_END=96;
    public static final int Message=37;
    public static final int Value_1=55;
    public static final int Time=71;
    public static final int RULE_STRING=92;
    public static final int Bool_1=45;
    public static final int Any=73;
    public static final int Struct=44;
    public static final int RULE_SL_COMMENT=97;
    public static final int Uint8_1=30;
    public static final int RULE_DOUBLE=84;
    public static final int Feedback=21;
    public static final int RULE_ROS_CONVENTION_A=98;
    public static final int RULE_ROS_CONVENTION_PARAM=99;
    public static final int Colon=77;
    public static final int EOF=-1;
    public static final int FromSub=23;
    public static final int Ns=74;
    public static final int RULE_WS=101;
    public static final int Int64_1=29;
    public static final int Service=38;
    public static final int From=56;
    public static final int RULE_ANY_OTHER=102;
    public static final int Nodes=49;
    public static final int Date=63;
    public static final int Interfaces=9;
    public static final int Threads=24;
    public static final int Integer=26;
    public static final int Array=39;
    public static final int Int64=59;
    public static final int RULE_MONTH=86;

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
            // InternalRosSystemLexer.g:32:11: ( '[float32]' )
            // InternalRosSystemLexer.g:32:13: '[float32]'
            {
            match("[float32]");


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
            // InternalRosSystemLexer.g:34:11: ( '[float64]' )
            // InternalRosSystemLexer.g:34:13: '[float64]'
            {
            match("[float64]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64_1"

    // $ANTLR start "String_2"
    public final void mString_2() throws RecognitionException {
        try {
            int _type = String_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:36:10: ( '[string]' )
            // InternalRosSystemLexer.g:36:12: '[string]'
            {
            match("[string]");


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
            // InternalRosSystemLexer.g:38:10: ( '[uint16]' )
            // InternalRosSystemLexer.g:38:12: '[uint16]'
            {
            match("[uint16]");


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
            // InternalRosSystemLexer.g:40:10: ( '[uint32]' )
            // InternalRosSystemLexer.g:40:12: '[uint32]'
            {
            match("[uint32]");


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
            // InternalRosSystemLexer.g:42:10: ( '[uint64]' )
            // InternalRosSystemLexer.g:42:12: '[uint64]'
            {
            match("[uint64]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64_1"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:44:9: ( 'default:' )
            // InternalRosSystemLexer.g:44:11: 'default:'
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
            // InternalRosSystemLexer.g:46:10: ( 'duration' )
            // InternalRosSystemLexer.g:46:12: 'duration'
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
            // InternalRosSystemLexer.g:48:10: ( 'feedback' )
            // InternalRosSystemLexer.g:48:12: 'feedback'
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

    // $ANTLR start "FromPub"
    public final void mFromPub() throws RecognitionException {
        try {
            int _type = FromPub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:50:9: ( 'fromPub:' )
            // InternalRosSystemLexer.g:50:11: 'fromPub:'
            {
            match("fromPub:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromPub"

    // $ANTLR start "FromSub"
    public final void mFromSub() throws RecognitionException {
        try {
            int _type = FromSub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:52:9: ( 'fromSub:' )
            // InternalRosSystemLexer.g:52:11: 'fromSub:'
            {
            match("fromSub:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromSub"

    // $ANTLR start "Threads"
    public final void mThreads() throws RecognitionException {
        try {
            int _type = Threads;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:54:9: ( 'threads:' )
            // InternalRosSystemLexer.g:54:11: 'threads:'
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

    // $ANTLR start "Int16_1"
    public final void mInt16_1() throws RecognitionException {
        try {
            int _type = Int16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:60:9: ( '[int16]' )
            // InternalRosSystemLexer.g:60:11: '[int16]'
            {
            match("[int16]");


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
            // InternalRosSystemLexer.g:62:9: ( '[int32]' )
            // InternalRosSystemLexer.g:62:11: '[int32]'
            {
            match("[int32]");


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
            // InternalRosSystemLexer.g:64:9: ( '[int64]' )
            // InternalRosSystemLexer.g:64:11: '[int64]'
            {
            match("[int64]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64_1"

    // $ANTLR start "Uint8_1"
    public final void mUint8_1() throws RecognitionException {
        try {
            int _type = Uint8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:66:9: ( '[uint8]' )
            // InternalRosSystemLexer.g:66:11: '[uint8]'
            {
            match("[uint8]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8_1"

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:68:9: ( 'float32' )
            // InternalRosSystemLexer.g:68:11: 'float32'
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
            // InternalRosSystemLexer.g:70:9: ( 'float64' )
            // InternalRosSystemLexer.g:70:11: 'float64'
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

    // $ANTLR start "FromAC"
    public final void mFromAC() throws RecognitionException {
        try {
            int _type = FromAC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:72:8: ( 'fromAC:' )
            // InternalRosSystemLexer.g:72:10: 'fromAC:'
            {
            match("fromAC:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromAC"

    // $ANTLR start "FromAS"
    public final void mFromAS() throws RecognitionException {
        try {
            int _type = FromAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:74:8: ( 'fromAS:' )
            // InternalRosSystemLexer.g:74:10: 'fromAS:'
            {
            match("fromAS:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromAS"

    // $ANTLR start "FromSC"
    public final void mFromSC() throws RecognitionException {
        try {
            int _type = FromSC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:76:8: ( 'fromSC:' )
            // InternalRosSystemLexer.g:76:10: 'fromSC:'
            {
            match("fromSC:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromSC"

    // $ANTLR start "FromSS"
    public final void mFromSS() throws RecognitionException {
        try {
            int _type = FromSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:78:8: ( 'fromSS:' )
            // InternalRosSystemLexer.g:78:10: 'fromSS:'
            {
            match("fromSS:");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromSS"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:80:9: ( 'message' )
            // InternalRosSystemLexer.g:80:11: 'message'
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
            // InternalRosSystemLexer.g:82:9: ( 'service' )
            // InternalRosSystemLexer.g:82:11: 'service'
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

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:84:7: ( 'Array:' )
            // InternalRosSystemLexer.g:84:9: 'Array:'
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
            // InternalRosSystemLexer.g:86:8: ( 'Base64' )
            // InternalRosSystemLexer.g:86:10: 'Base64'
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
            // InternalRosSystemLexer.g:88:8: ( 'Double' )
            // InternalRosSystemLexer.g:88:10: 'Double'
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
            // InternalRosSystemLexer.g:90:8: ( 'Header' )
            // InternalRosSystemLexer.g:90:10: 'Header'
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
            // InternalRosSystemLexer.g:92:8: ( 'String' )
            // InternalRosSystemLexer.g:92:10: 'String'
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
            // InternalRosSystemLexer.g:94:8: ( 'Struct' )
            // InternalRosSystemLexer.g:94:10: 'Struct'
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

    // $ANTLR start "Bool_1"
    public final void mBool_1() throws RecognitionException {
        try {
            int _type = Bool_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:96:8: ( '[bool]' )
            // InternalRosSystemLexer.g:96:10: '[bool]'
            {
            match("[bool]");


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
            // InternalRosSystemLexer.g:98:8: ( '[byte]' )
            // InternalRosSystemLexer.g:98:10: '[byte]'
            {
            match("[byte]");


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
            // InternalRosSystemLexer.g:100:8: ( '[int8]' )
            // InternalRosSystemLexer.g:100:10: '[int8]'
            {
            match("[int8]");


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8_1"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:102:8: ( 'action' )
            // InternalRosSystemLexer.g:102:10: 'action'
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

    // $ANTLR start "Nodes"
    public final void mNodes() throws RecognitionException {
        try {
            int _type = Nodes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:104:7: ( 'nodes:' )
            // InternalRosSystemLexer.g:104:9: 'nodes:'
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
            // InternalRosSystemLexer.g:106:8: ( 'result' )
            // InternalRosSystemLexer.g:106:10: 'result'
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
            // InternalRosSystemLexer.g:108:10: ( 'string' )
            // InternalRosSystemLexer.g:108:12: 'string'
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
            // InternalRosSystemLexer.g:110:8: ( 'uint16' )
            // InternalRosSystemLexer.g:110:10: 'uint16'
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
            // InternalRosSystemLexer.g:112:8: ( 'uint32' )
            // InternalRosSystemLexer.g:112:10: 'uint32'
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
            // InternalRosSystemLexer.g:114:8: ( 'uint64' )
            // InternalRosSystemLexer.g:114:10: 'uint64'
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
            // InternalRosSystemLexer.g:116:9: ( 'value:' )
            // InternalRosSystemLexer.g:116:11: 'value:'
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
            // InternalRosSystemLexer.g:118:6: ( 'from:' )
            // InternalRosSystemLexer.g:118:8: 'from:'
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
            // InternalRosSystemLexer.g:120:7: ( 'int16' )
            // InternalRosSystemLexer.g:120:9: 'int16'
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
            // InternalRosSystemLexer.g:122:7: ( 'int32' )
            // InternalRosSystemLexer.g:122:9: 'int32'
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
            // InternalRosSystemLexer.g:124:7: ( 'int64' )
            // InternalRosSystemLexer.g:124:9: 'int64'
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
            // InternalRosSystemLexer.g:126:8: ( 'type:' )
            // InternalRosSystemLexer.g:126:10: 'type:'
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
            // InternalRosSystemLexer.g:128:7: ( 'uint8' )
            // InternalRosSystemLexer.g:128:9: 'uint8'
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
            // InternalRosSystemLexer.g:130:7: ( 'value' )
            // InternalRosSystemLexer.g:130:9: 'value'
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
            // InternalRosSystemLexer.g:132:6: ( 'Date' )
            // InternalRosSystemLexer.g:132:8: 'Date'
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
            // InternalRosSystemLexer.g:134:6: ( 'List' )
            // InternalRosSystemLexer.g:134:8: 'List'
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
            // InternalRosSystemLexer.g:136:6: ( 'bool' )
            // InternalRosSystemLexer.g:136:8: 'bool'
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
            // InternalRosSystemLexer.g:138:6: ( 'byte' )
            // InternalRosSystemLexer.g:138:8: 'byte'
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

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:156:7: ( ',' )
            // InternalRosSystemLexer.g:156:9: ','
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
            // InternalRosSystemLexer.g:158:13: ( '-' )
            // InternalRosSystemLexer.g:158:15: '-'
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
            // InternalRosSystemLexer.g:160:7: ( ':' )
            // InternalRosSystemLexer.g:160:9: ':'
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
            // InternalRosSystemLexer.g:162:19: ( '[' )
            // InternalRosSystemLexer.g:162:21: '['
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
            // InternalRosSystemLexer.g:164:20: ( ']' )
            // InternalRosSystemLexer.g:164:22: ']'
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
            // InternalRosSystemLexer.g:166:21: ( '0' .. '9' )
            // InternalRosSystemLexer.g:166:23: '0' .. '9'
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
            // InternalRosSystemLexer.g:168:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosSystemLexer.g:168:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosSystemLexer.g:168:15: ( '0b' | '0B' )
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
                    // InternalRosSystemLexer.g:168:16: '0b'
                    {
                    match("0b");


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:168:21: '0B'
                    {
                    match("0B");


                    }
                    break;

            }

            // InternalRosSystemLexer.g:168:27: ( '0' | '1' )+
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
            // InternalRosSystemLexer.g:170:14: ( ( 'true' | 'false' ) )
            // InternalRosSystemLexer.g:170:16: ( 'true' | 'false' )
            {
            // InternalRosSystemLexer.g:170:16: ( 'true' | 'false' )
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
                    // InternalRosSystemLexer.g:170:17: 'true'
                    {
                    match("true");


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:170:24: 'false'
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
            // InternalRosSystemLexer.g:172:13: ( ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRosSystemLexer.g:172:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* ) ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            // InternalRosSystemLexer.g:172:15: ( RULE_DIGIT | '-' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:172:16: RULE_DIGIT
                    {
                    mRULE_DIGIT();

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:172:27: '-' ( RULE_DIGIT )*
                    {
                    match('-');
                    // InternalRosSystemLexer.g:172:31: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                        case 1 :
                            // InternalRosSystemLexer.g:172:31: RULE_DIGIT
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

            // InternalRosSystemLexer.g:172:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalRosSystemLexer.g:172:45: '.' ( RULE_DECINT )*
                    {
                    match('.');
                    // InternalRosSystemLexer.g:172:49: ( RULE_DECINT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                        case 1 :
                            // InternalRosSystemLexer.g:172:49: RULE_DECINT
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
                    // InternalRosSystemLexer.g:172:62: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRosSystemLexer.g:172:62: ( '.' ( RULE_DIGIT )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRosSystemLexer.g:172:63: '.' ( RULE_DIGIT )*
                            {
                            match('.');
                            // InternalRosSystemLexer.g:172:67: ( RULE_DIGIT )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                                case 1 :
                                    // InternalRosSystemLexer.g:172:67: RULE_DIGIT
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

                    // InternalRosSystemLexer.g:172:91: ( '-' | '+' )?
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
            // InternalRosSystemLexer.g:174:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:174:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:174:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosSystemLexer.g:174:16: '0'
                    {
                    match('0');

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:174:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9');
                    // InternalRosSystemLexer.g:174:29: ( RULE_DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                        case 1 :
                            // InternalRosSystemLexer.g:174:29: RULE_DIGIT
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
                    // InternalRosSystemLexer.g:174:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-');
                    matchRange('0','9');
                    // InternalRosSystemLexer.g:174:54: ( RULE_DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                        case 1 :
                            // InternalRosSystemLexer.g:174:54: RULE_DIGIT
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
            // InternalRosSystemLexer.g:176:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosSystemLexer.g:176:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosSystemLexer.g:176:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosSystemLexer.g:176:22: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:176:31: '1' .. '3' '0' .. '9'
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
            // InternalRosSystemLexer.g:178:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosSystemLexer.g:178:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosSystemLexer.g:178:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosSystemLexer.g:178:24: '1' .. '9'
                    {
                    matchRange('1','9');

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:178:33: '1' '0' .. '2'
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
            // InternalRosSystemLexer.g:180:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosSystemLexer.g:180:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosSystemLexer.g:182:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosSystemLexer.g:182:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosSystemLexer.g:182:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosSystemLexer.g:182:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1');
                    matchRange('0','9');

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:182:41: '2' '0' .. '3'
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
            // InternalRosSystemLexer.g:184:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosSystemLexer.g:184:25: '0' .. '5' '0' .. '9'
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
            // InternalRosSystemLexer.g:186:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosSystemLexer.g:186:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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
            // InternalRosSystemLexer.g:188:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosSystemLexer.g:188:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosSystemLexer.g:188:25: ( RULE_ID | RULE_STRING )
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
                    // InternalRosSystemLexer.g:188:26: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:188:34: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;

            }

            match('=');
            // InternalRosSystemLexer.g:188:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
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
                    // InternalRosSystemLexer.g:188:52: RULE_ID
                    {
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:188:60: RULE_STRING
                    {
                    mRULE_STRING();

                    }
                    break;
                case 3 :
                    // InternalRosSystemLexer.g:188:72: RULE_INT
                    {
                    mRULE_INT();

                    }
                    break;
                case 4 :
                    // InternalRosSystemLexer.g:188:81: '-' RULE_INT
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
            // InternalRosSystemLexer.g:190:21: ()
            // InternalRosSystemLexer.g:190:23:
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
            // InternalRosSystemLexer.g:192:19: ()
            // InternalRosSystemLexer.g:192:21:
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
            // InternalRosSystemLexer.g:194:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosSystemLexer.g:194:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#');
            // InternalRosSystemLexer.g:194:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
                case 1 :
                    // InternalRosSystemLexer.g:194:23: ~ ( ( '\\n' | '\\r' ) )
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
            // InternalRosSystemLexer.g:196:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosSystemLexer.g:196:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosSystemLexer.g:196:25: ( '/' RULE_ID | RULE_ID '/' )*
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
                    // InternalRosSystemLexer.g:196:26: '/' RULE_ID
                    {
                    match('/');
                    mRULE_ID();

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:196:38: RULE_ID '/'
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
            // InternalRosSystemLexer.g:198:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosSystemLexer.g:198:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosSystemLexer.g:198:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
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
                    // InternalRosSystemLexer.g:198:30: '/' RULE_STRING
                    {
                    match('/');
                    mRULE_STRING();

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:198:46: RULE_STRING '/'
                    {
                    mRULE_STRING();
                    match('/');

                    }
                    break;
                case 3 :
                    // InternalRosSystemLexer.g:198:62: '~' RULE_STRING
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
            // InternalRosSystemLexer.g:200:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystemLexer.g:200:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystemLexer.g:200:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystemLexer.g:200:11: '^'
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

            // InternalRosSystemLexer.g:200:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalRosSystemLexer.g:202:19: ( ( '0' .. '9' )+ )
            // InternalRosSystemLexer.g:202:21: ( '0' .. '9' )+
            {
            // InternalRosSystemLexer.g:202:21: ( '0' .. '9' )+
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
                    // InternalRosSystemLexer.g:202:22: '0' .. '9'
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
            // InternalRosSystemLexer.g:204:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystemLexer.g:204:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystemLexer.g:204:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalRosSystemLexer.g:204:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"');
                    // InternalRosSystemLexer.g:204:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            // InternalRosSystemLexer.g:204:21: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalRosSystemLexer.g:204:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalRosSystemLexer.g:204:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\'');
                    // InternalRosSystemLexer.g:204:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            // InternalRosSystemLexer.g:204:54: '\\\\' .
                            {
                            match('\\');
                            matchAny();

                            }
                            break;
                        case 2 :
                            // InternalRosSystemLexer.g:204:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalRosSystemLexer.g:206:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystemLexer.g:206:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*");

            // InternalRosSystemLexer.g:206:24: ( options {greedy=false; } : . )*
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
                    // InternalRosSystemLexer.g:206:52: .
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
            // InternalRosSystemLexer.g:208:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystemLexer.g:208:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystemLexer.g:208:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalRosSystemLexer.g:210:16: ( . )
            // InternalRosSystemLexer.g:210:18: .
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
        // InternalRosSystemLexer.g:1:8: ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Default | Duration | Feedback | FromPub | FromSub | Threads | Boolean | Integer | Int16_1 | Int32_1 | Int64_1 | Uint8_1 | Float32 | Float64 | FromAC | FromAS | FromSC | FromSS | Message | Service | Array | Base64 | Double | Header | String | Struct | Bool_1 | Byte_1 | Int8_1 | Action | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt30=90;
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
                // InternalRosSystemLexer.g:1:148: String_2
                {
                mString_2();

                }
                break;
            case 13 :
                // InternalRosSystemLexer.g:1:157: Uint16_1
                {
                mUint16_1();

                }
                break;
            case 14 :
                // InternalRosSystemLexer.g:1:166: Uint32_1
                {
                mUint32_1();

                }
                break;
            case 15 :
                // InternalRosSystemLexer.g:1:175: Uint64_1
                {
                mUint64_1();

                }
                break;
            case 16 :
                // InternalRosSystemLexer.g:1:184: Default
                {
                mDefault();

                }
                break;
            case 17 :
                // InternalRosSystemLexer.g:1:192: Duration
                {
                mDuration();

                }
                break;
            case 18 :
                // InternalRosSystemLexer.g:1:201: Feedback
                {
                mFeedback();

                }
                break;
            case 19 :
                // InternalRosSystemLexer.g:1:210: FromPub
                {
                mFromPub();

                }
                break;
            case 20 :
                // InternalRosSystemLexer.g:1:218: FromSub
                {
                mFromSub();

                }
                break;
            case 21 :
                // InternalRosSystemLexer.g:1:226: Threads
                {
                mThreads();

                }
                break;
            case 22 :
                // InternalRosSystemLexer.g:1:234: Boolean
                {
                mBoolean();

                }
                break;
            case 23 :
                // InternalRosSystemLexer.g:1:242: Integer
                {
                mInteger();

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
                // InternalRosSystemLexer.g:1:274: Uint8_1
                {
                mUint8_1();

                }
                break;
            case 28 :
                // InternalRosSystemLexer.g:1:282: Float32
                {
                mFloat32();

                }
                break;
            case 29 :
                // InternalRosSystemLexer.g:1:290: Float64
                {
                mFloat64();

                }
                break;
            case 30 :
                // InternalRosSystemLexer.g:1:298: FromAC
                {
                mFromAC();

                }
                break;
            case 31 :
                // InternalRosSystemLexer.g:1:305: FromAS
                {
                mFromAS();

                }
                break;
            case 32 :
                // InternalRosSystemLexer.g:1:312: FromSC
                {
                mFromSC();

                }
                break;
            case 33 :
                // InternalRosSystemLexer.g:1:319: FromSS
                {
                mFromSS();

                }
                break;
            case 34 :
                // InternalRosSystemLexer.g:1:326: Message
                {
                mMessage();

                }
                break;
            case 35 :
                // InternalRosSystemLexer.g:1:334: Service
                {
                mService();

                }
                break;
            case 36 :
                // InternalRosSystemLexer.g:1:342: Array
                {
                mArray();

                }
                break;
            case 37 :
                // InternalRosSystemLexer.g:1:348: Base64
                {
                mBase64();

                }
                break;
            case 38 :
                // InternalRosSystemLexer.g:1:355: Double
                {
                mDouble();

                }
                break;
            case 39 :
                // InternalRosSystemLexer.g:1:362: Header
                {
                mHeader();

                }
                break;
            case 40 :
                // InternalRosSystemLexer.g:1:369: String
                {
                mString();

                }
                break;
            case 41 :
                // InternalRosSystemLexer.g:1:376: Struct
                {
                mStruct();

                }
                break;
            case 42 :
                // InternalRosSystemLexer.g:1:383: Bool_1
                {
                mBool_1();

                }
                break;
            case 43 :
                // InternalRosSystemLexer.g:1:390: Byte_1
                {
                mByte_1();

                }
                break;
            case 44 :
                // InternalRosSystemLexer.g:1:397: Int8_1
                {
                mInt8_1();

                }
                break;
            case 45 :
                // InternalRosSystemLexer.g:1:404: Action
                {
                mAction();

                }
                break;
            case 46 :
                // InternalRosSystemLexer.g:1:411: Nodes
                {
                mNodes();

                }
                break;
            case 47 :
                // InternalRosSystemLexer.g:1:417: Result
                {
                mResult();

                }
                break;
            case 48 :
                // InternalRosSystemLexer.g:1:424: String_1
                {
                mString_1();

                }
                break;
            case 49 :
                // InternalRosSystemLexer.g:1:433: Uint16
                {
                mUint16();

                }
                break;
            case 50 :
                // InternalRosSystemLexer.g:1:440: Uint32
                {
                mUint32();

                }
                break;
            case 51 :
                // InternalRosSystemLexer.g:1:447: Uint64
                {
                mUint64();

                }
                break;
            case 52 :
                // InternalRosSystemLexer.g:1:454: Value_1
                {
                mValue_1();

                }
                break;
            case 53 :
                // InternalRosSystemLexer.g:1:462: From
                {
                mFrom();

                }
                break;
            case 54 :
                // InternalRosSystemLexer.g:1:467: Int16
                {
                mInt16();

                }
                break;
            case 55 :
                // InternalRosSystemLexer.g:1:473: Int32
                {
                mInt32();

                }
                break;
            case 56 :
                // InternalRosSystemLexer.g:1:479: Int64
                {
                mInt64();

                }
                break;
            case 57 :
                // InternalRosSystemLexer.g:1:485: Type_1
                {
                mType_1();

                }
                break;
            case 58 :
                // InternalRosSystemLexer.g:1:492: Uint8
                {
                mUint8();

                }
                break;
            case 59 :
                // InternalRosSystemLexer.g:1:498: Value
                {
                mValue();

                }
                break;
            case 60 :
                // InternalRosSystemLexer.g:1:504: Date
                {
                mDate();

                }
                break;
            case 61 :
                // InternalRosSystemLexer.g:1:509: List
                {
                mList();

                }
                break;
            case 62 :
                // InternalRosSystemLexer.g:1:514: Bool
                {
                mBool();

                }
                break;
            case 63 :
                // InternalRosSystemLexer.g:1:519: Byte
                {
                mByte();

                }
                break;
            case 64 :
                // InternalRosSystemLexer.g:1:524: Goal
                {
                mGoal();

                }
                break;
            case 65 :
                // InternalRosSystemLexer.g:1:529: Int8
                {
                mInt8();

                }
                break;
            case 66 :
                // InternalRosSystemLexer.g:1:534: Name
                {
                mName();

                }
                break;
            case 67 :
                // InternalRosSystemLexer.g:1:539: Node
                {
                mNode();

                }
                break;
            case 68 :
                // InternalRosSystemLexer.g:1:544: Time
                {
                mTime();

                }
                break;
            case 69 :
                // InternalRosSystemLexer.g:1:549: Type
                {
                mType();

                }
                break;
            case 70 :
                // InternalRosSystemLexer.g:1:554: Any
                {
                mAny();

                }
                break;
            case 71 :
                // InternalRosSystemLexer.g:1:558: Ns
                {
                mNs();

                }
                break;
            case 72 :
                // InternalRosSystemLexer.g:1:561: Comma
                {
                mComma();

                }
                break;
            case 73 :
                // InternalRosSystemLexer.g:1:567: HyphenMinus
                {
                mHyphenMinus();

                }
                break;
            case 74 :
                // InternalRosSystemLexer.g:1:579: Colon
                {
                mColon();

                }
                break;
            case 75 :
                // InternalRosSystemLexer.g:1:585: LeftSquareBracket
                {
                mLeftSquareBracket();

                }
                break;
            case 76 :
                // InternalRosSystemLexer.g:1:603: RightSquareBracket
                {
                mRightSquareBracket();

                }
                break;
            case 77 :
                // InternalRosSystemLexer.g:1:622: RULE_BINARY
                {
                mRULE_BINARY();

                }
                break;
            case 78 :
                // InternalRosSystemLexer.g:1:634: RULE_BOOLEAN
                {
                mRULE_BOOLEAN();

                }
                break;
            case 79 :
                // InternalRosSystemLexer.g:1:647: RULE_DOUBLE
                {
                mRULE_DOUBLE();

                }
                break;
            case 80 :
                // InternalRosSystemLexer.g:1:659: RULE_DECINT
                {
                mRULE_DECINT();

                }
                break;
            case 81 :
                // InternalRosSystemLexer.g:1:671: RULE_DATE_TIME
                {
                mRULE_DATE_TIME();

                }
                break;
            case 82 :
                // InternalRosSystemLexer.g:1:686: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT();

                }
                break;
            case 83 :
                // InternalRosSystemLexer.g:1:708: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT();

                }
                break;
            case 84 :
                // InternalRosSystemLexer.g:1:724: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A();

                }
                break;
            case 85 :
                // InternalRosSystemLexer.g:1:746: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM();

                }
                break;
            case 86 :
                // InternalRosSystemLexer.g:1:772: RULE_ID
                {
                mRULE_ID();

                }
                break;
            case 87 :
                // InternalRosSystemLexer.g:1:780: RULE_STRING
                {
                mRULE_STRING();

                }
                break;
            case 88 :
                // InternalRosSystemLexer.g:1:792: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT();

                }
                break;
            case 89 :
                // InternalRosSystemLexer.g:1:808: RULE_WS
                {
                mRULE_WS();

                }
                break;
            case 90 :
                // InternalRosSystemLexer.g:1:816: RULE_ANY_OTHER
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
            return "172:44: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA30_eotS =
        "\1\50\6\56\1\75\23\56\1\uffff\1\141\2\uffff\3\147\1\53\1\56\2\53\1\uffff\1\53\1\uffff\1\53\2\uffff\2\56\2\uffff\10\56\6\uffff\41\56\1\uffff\1\147\7\uffff\1\147\1\56\2\uffff\1\u00a6\2\uffff\1\u00a6\4\uffff\11\56\5\uffff\21\56\1\u00c9\7\56\1\uffff\7\56\2\147\3\uffff\12\56\1\u00e4\2\56\3\uffff\7\56\1\u00f8\1\u00f9\1\u00fa\7\56\1\uffff\1\56\1\u0103\4\56\1\u0109\1\u010a\3\56\1\u0111\1\u0112\1\u0113\1\u0114\1\147\7\56\1\u011c\1\u011d\1\u011e\1\uffff\2\56\6\uffff\6\56\1\uffff\1\56\1\u00fa\1\56\4\uffff\10\56\1\uffff\5\56\2\uffff\4\56\1\u0143\1\u0145\4\uffff\7\56\3\uffff\2\56\5\uffff\15\56\1\u015e\3\56\1\u0162\1\uffff\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167\1\uffff\1\u0168\1\u0169\1\u016a\1\u016b\3\uffff\11\56\2\uffff\5\56\4\uffff\1\u017a\1\u017b\1\56\1\u017d\1\uffff\1\u017e\1\u017f\1\u0180\12\uffff\11\56\1\uffff\1\u018a\1\u018b\11\uffff\4\56\1\u0190\4\56\2\uffff\4\56\1\uffff\3\56\1\uffff\5\56\2\uffff\2\56\1\u01a3\1\56\1\uffff\2\56\1\uffff\6\56\1\u01ad\1\56\1\u01af\1\uffff\1\u01b0\2\uffff";
    static final String DFA30_eofS =
        "\u01b1\uffff";
    static final String DFA30_minS =
        "\1\0\6\57\1\142\23\57\1\uffff\1\56\2\uffff\3\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\2\57\2\uffff\10\57\1\154\1\uffff\1\151\1\156\1\157\1\uffff\41\57\1\uffff\1\56\7\uffff\1\60\1\57\2\0\1\57\2\0\1\57\4\uffff\11\57\1\157\1\156\1\164\2\uffff\31\57\1\uffff\7\57\1\56\1\60\1\0\1\uffff\1\0\15\57\1\141\1\164\1\61\21\57\1\uffff\17\57\1\55\12\57\1\uffff\2\57\1\164\1\61\4\uffff\6\57\1\uffff\3\57\4\uffff\10\57\1\uffff\5\57\2\uffff\6\57\4\uffff\7\57\3\uffff\2\57\1\63\4\uffff\22\57\1\uffff\5\57\1\uffff\4\57\3\uffff\11\57\2\uffff\5\57\4\uffff\4\57\1\uffff\3\57\12\uffff\11\57\1\uffff\2\57\11\uffff\11\57\2\uffff\4\57\1\uffff\3\57\1\uffff\5\57\2\uffff\4\57\1\uffff\2\57\1\uffff\11\57\1\uffff\1\57\2\uffff";
    static final String DFA30_maxS =
        "\1\uffff\6\172\1\165\23\172\1\uffff\1\145\2\uffff\3\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\2\172\2\uffff\10\172\1\154\1\uffff\1\151\1\156\1\171\1\uffff\41\172\1\uffff\1\145\7\uffff\1\71\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\11\172\1\157\1\156\1\164\2\uffff\31\172\1\uffff\7\172\1\145\1\71\1\uffff\1\uffff\1\uffff\15\172\1\141\1\164\1\70\21\172\1\uffff\17\172\1\55\12\172\1\uffff\2\172\1\164\1\70\4\uffff\6\172\1\uffff\3\172\4\uffff\10\172\1\uffff\5\172\2\uffff\6\172\4\uffff\7\172\3\uffff\2\172\1\66\4\uffff\22\172\1\uffff\5\172\1\uffff\4\172\3\uffff\11\172\2\uffff\5\172\4\uffff\4\172\1\uffff\3\172\12\uffff\11\172\1\uffff\2\172\11\uffff\11\172\2\uffff\4\172\1\uffff\3\172\1\uffff\5\172\2\uffff\4\172\1\uffff\2\172\1\uffff\11\172\1\uffff\1\172\2\uffff";
    static final String DFA30_acceptS =
        "\33\uffff\1\110\1\uffff\1\112\1\114\7\uffff\1\123\1\uffff\1\124\1\uffff\1\131\1\132\2\uffff\1\126\1\122\11\uffff\1\14\3\uffff\1\113\41\uffff\1\110\1\uffff\1\111\1\117\1\112\1\114\1\115\1\121\1\120\10\uffff\1\123\1\130\1\125\1\131\14\uffff\1\52\1\53\31\uffff\1\107\12\uffff\1\127\42\uffff\1\106\32\uffff\1\101\4\uffff\1\30\1\31\1\32\1\54\6\uffff\1\65\3\uffff\1\71\1\105\1\104\1\116\10\uffff\1\74\5\uffff\1\103\1\102\6\uffff\1\75\1\76\1\77\1\100\7\uffff\1\66\1\67\1\70\3\uffff\1\15\1\16\1\17\1\33\22\uffff\1\44\5\uffff\1\56\4\uffff\1\72\1\64\1\73\11\uffff\1\12\1\13\5\uffff\1\40\1\41\1\36\1\37\4\uffff\1\45\3\uffff\1\60\1\46\1\47\1\50\1\51\1\55\1\57\1\61\1\62\1\63\11\uffff\1\20\2\uffff\1\23\1\24\1\34\1\35\1\25\1\26\1\27\1\42\1\43\11\uffff\1\21\1\22\4\uffff\1\11\3\uffff\1\10\5\uffff\1\6\1\7\4\uffff\1\5\2\uffff\1\4\11\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA30_specialS =
        "\1\1\43\uffff\1\0\1\6\104\uffff\1\4\1\10\1\uffff\1\5\1\3\66\uffff\1\7\1\uffff\1\2\u0109\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\44\1\46\3\53\1\45\4\53\1\33\1\34\1\53\1\47\1\37\2\40\7\41\1\35\6\53\1\17\1\13\1\43\1\20\2\43\1\3\1\21\1\14\2\43\1\30\3\43\1\2\1\43\1\1\1\22\7\43\1\7\1\53\1\36\1\42\1\43\1\53\1\23\1\31\1\4\1\10\1\43\1\11\1\32\1\43\1\5\3\43\1\15\1\24\1\43\1\6\1\43\1\25\1\16\1\12\1\26\1\27\4\43\3\53\1\51\uff81\53",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\54\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\61\20\55\1\60\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\62\5\55\1\63\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\64\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\65\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\66\20\55\1\67\10\55",
            "\1\74\3\uffff\1\70\2\uffff\1\73\11\uffff\1\71\1\uffff\1\72",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\76\17\55\1\77\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\103\3\55\1\100\6\55\1\102\5\55\1\101\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\7\55\1\104\1\106\10\55\1\107\6\55\1\105\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\111\15\55\1\110\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\112\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\113\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\114\16\55\1\115\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\117\3\55\1\116\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\121\15\55\1\120\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\122\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\123\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\124\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\126\15\55\1\125\3\55\1\127\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\130\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\131\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\132\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\133\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\134\11\55\1\135\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\136\13\55",
            "",
            "\1\142\1\uffff\12\140\13\uffff\1\142\37\uffff\1\142",
            "",
            "",
            "\1\142\1\uffff\12\146\10\uffff\1\145\2\uffff\1\142\34\uffff\1\145\2\uffff\1\142",
            "\1\142\1\uffff\12\150\13\uffff\1\142\37\uffff\1\142",
            "\1\142\26\uffff\1\142\37\uffff\1\142",
            "\32\151\4\uffff\1\151\1\uffff\32\151",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\42\153\1\154\71\153\1\152\uffa3\153",
            "\47\156\1\157\64\156\1\155\uffa3\156",
            "",
            "\1\162\4\uffff\1\162\2\uffff\1\161\26\uffff\32\50\3\uffff\2\50\1\uffff\32\50",
            "",
            "\1\162\4\uffff\1\162",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\164\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\165\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\166\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\167\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\170\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\171\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\172\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\173\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\174\13\55",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080\11\uffff\1\u0081",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\u0082\24\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0083\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0084\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0085\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0086\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0087\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0088\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u0089\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u008a\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u008b\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u008c\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u008d\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u008e\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u008f\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0090\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0091\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0092\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\u0093\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u0094\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0095\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0096\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0097\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0098\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u0099\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u009a\15\55",
            "\1\50\12\55\1\u009b\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u009c\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u009d\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u009e\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u009f\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u00a0\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00a1\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00a2\31\55",
            "",
            "\1\142\1\uffff\12\u00a3\13\uffff\1\142\37\uffff\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u00a4",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\0\u00a5",
            "\42\153\1\154\71\153\1\152\uffa3\153",
            "\1\162\15\uffff\1\57",
            "\0\u00a7",
            "\47\156\1\157\64\156\1\155\uffa3\156",
            "\1\162\15\uffff\1\57",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00a8\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u00a9\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00aa\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u00ab\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u00ac\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u00ad\14\55",
            "\1\50\1\55\1\u00af\1\55\1\u00b0\2\55\1\u00b1\1\55\1\u00b2\1\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00ae\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00b3\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u00b4\27\55",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00b8\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00b9\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u00ba\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u00bb\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00bc\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00bd\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00be\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00bf\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00c0\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00c1\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00c2\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00c3\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00c4\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u00c5\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u00c6\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00c7\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00c8\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u00ca\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00cb\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u00cc\26\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00cd\13\55\1\u00ce\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00cf\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d0\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d1\25\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00d2\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00d3\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00d4\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00d5\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00d6\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00d7\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u00d8\16\55",
            "\1\142\1\uffff\12\u00a3\13\uffff\1\142\37\uffff\1\142",
            "\12\u00d9",
            "\42\153\1\154\71\153\1\152\uffa3\153",
            "",
            "\47\156\1\157\64\156\1\155\uffa3\156",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00da\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00db\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u00dc\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00dd\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\7\55\1\u00de\22\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00df\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u00e0\10\55",
            "\1\50\6\55\1\u00e1\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\2\55\1\u00e2\7\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\4\55\1\u00e3\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u00e5\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00e6\25\55",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\1\uffff\1\u00ea\2\uffff\1\u00eb\1\uffff\1\u00ec",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u00ed\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00ee\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u00ef\30\55",
            "\1\50\12\55\1\u00f3\2\uffff\1\57\3\uffff\1\u00f2\16\55\1\u00f0\2\55\1\u00f1\7\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u00f4\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00f5\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00f6\31\55",
            "\1\50\12\55\1\u00f7\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u00fb\25\55",
            "\1\50\6\55\1\u00fc\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u00fd\23\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u00fe\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00ff\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0100\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\u0101\1\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0102\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0104\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0105\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0106\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0107\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0108\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u010b\16\55",
            "\1\50\1\55\1\u010c\1\55\1\u010d\2\55\1\u010e\1\55\1\u010f\1\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0110\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\146",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0115\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0116\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0117\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0118\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u0119\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u011a\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\5\55\1\u011b\24\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u011f\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0120\7\55",
            "\1\u0121",
            "\1\u0122\1\uffff\1\u0123\2\uffff\1\u0124\1\uffff\1\u0125",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\13\55\1\u0126\16\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0127\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0128\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u0129\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\2\55\1\u012b\17\55\1\u012c\7\55\4\uffff\1\55\1\uffff\24\55\1\u012a\5\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\2\55\1\u012d\17\55\1\u012e\7\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\3\55\1\u012f\2\55\1\u0130\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\3\55\1\u0131\26\55",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0132\31\55",
            "\1\50\4\55\1\u0133\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0134\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u0135\23\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0136\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u0137\23\55",
            "\1\50\12\55\1\u0138\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0139\25\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u013a\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\6\55\1\u013b\23\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u013c\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u013d\14\55",
            "\1\50\12\55\1\u013e\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u013f\6\55",
            "\1\50\6\55\1\u0140\3\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\2\55\1\u0141\7\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\4\55\1\u0142\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u0144\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\25\55\1\u0146\4\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0147\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0148\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u0149\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u014a\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u014b\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u014c\31\55",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u014d\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u014e\7\55",
            "\1\u014f\2\uffff\1\u0150",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\23\55\1\u0151\6\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0152\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0153\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u0154\30\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\55\1\u0155\30\55",
            "\1\50\12\55\1\u0156\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u0157\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u0158\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u0159\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\2\55\1\u015a\7\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\4\55\1\u015b\5\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u015c\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u015d\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u015f\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0160\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0161\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u016c\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u016d\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u016e\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u016f\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u0170\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u0171\21\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u0172\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0173\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0174\25\55",
            "",
            "",
            "\1\50\12\55\1\u0175\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0176\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\12\55\1\u0177\17\55",
            "\1\50\12\55\1\u0178\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u0179\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u017c\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
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
            "\1\50\12\55\3\uffff\1\57\3\uffff\15\55\1\u0181\14\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u0182\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0183\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u0184\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0185\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\16\55\1\u0186\13\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0187\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\21\55\1\u0188\10\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0189\7\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u018c\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u018d\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\1\u018e\31\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u018f\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0191\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0192\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0193\7\55",
            "\1\50\12\55\1\u0194\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\14\55\1\u0195\15\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u0196\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\15\55\1\u0197\14\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0198\7\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u0199\7\55",
            "\1\50\12\55\1\u019a\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\1\u019b\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u019c\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u019d\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\30\55\1\u019e\1\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u019f\12\55",
            "\1\50\12\55\1\u01a0\2\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u01a1\7\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u01a2\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u01a4\31\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\17\55\1\u01a5\12\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u01a6\31\55",
            "",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u01a7\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\1\u01a8\31\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u01a9\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01aa\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\2\55\1\u01ab\27\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01ac\25\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\50\12\55\3\uffff\1\57\3\uffff\32\55\4\uffff\1\55\1\uffff\4\55\1\u01ae\25\55",
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
            return "1:1: Tokens : ( RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | String_2 | Uint16_1 | Uint32_1 | Uint64_1 | Default | Duration | Feedback | FromPub | FromSub | Threads | Boolean | Integer | Int16_1 | Int32_1 | Int64_1 | Uint8_1 | Float32 | Float64 | FromAC | FromAS | FromSC | FromSS | Message | Service | Array | Base64 | Double | Header | String | Struct | Bool_1 | Byte_1 | Int8_1 | Action | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | Comma | HyphenMinus | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
            int _s = s;
            switch ( s ) {
                    case 0 :
                        int LA30_36 = input.LA(1);

                        s = -1;
                        if ( (LA30_36=='\\') ) {s = 106;}

                        else if ( ((LA30_36>='\u0000' && LA30_36<='!')||(LA30_36>='#' && LA30_36<='[')||(LA30_36>=']' && LA30_36<='\uFFFF')) ) {s = 107;}

                        else if ( (LA30_36=='\"') ) {s = 108;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 :
                        int LA30_0 = input.LA(1);

                        s = -1;
                        if ( (LA30_0=='R') ) {s = 1;}

                        else if ( (LA30_0=='P') ) {s = 2;}

                        else if ( (LA30_0=='G') ) {s = 3;}

                        else if ( (LA30_0=='c') ) {s = 4;}

                        else if ( (LA30_0=='i') ) {s = 5;}

                        else if ( (LA30_0=='p') ) {s = 6;}

                        else if ( (LA30_0=='[') ) {s = 7;}

                        else if ( (LA30_0=='d') ) {s = 8;}

                        else if ( (LA30_0=='f') ) {s = 9;}

                        else if ( (LA30_0=='t') ) {s = 10;}

                        else if ( (LA30_0=='B') ) {s = 11;}

                        else if ( (LA30_0=='I') ) {s = 12;}

                        else if ( (LA30_0=='m') ) {s = 13;}

                        else if ( (LA30_0=='s') ) {s = 14;}

                        else if ( (LA30_0=='A') ) {s = 15;}

                        else if ( (LA30_0=='D') ) {s = 16;}

                        else if ( (LA30_0=='H') ) {s = 17;}

                        else if ( (LA30_0=='S') ) {s = 18;}

                        else if ( (LA30_0=='a') ) {s = 19;}

                        else if ( (LA30_0=='n') ) {s = 20;}

                        else if ( (LA30_0=='r') ) {s = 21;}

                        else if ( (LA30_0=='u') ) {s = 22;}

                        else if ( (LA30_0=='v') ) {s = 23;}

                        else if ( (LA30_0=='L') ) {s = 24;}

                        else if ( (LA30_0=='b') ) {s = 25;}

                        else if ( (LA30_0=='g') ) {s = 26;}

                        else if ( (LA30_0==',') ) {s = 27;}

                        else if ( (LA30_0=='-') ) {s = 28;}

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
                    case 2 :
                        int LA30_167 = input.LA(1);

                        s = -1;
                        if ( (LA30_167=='\'') ) {s = 111;}

                        else if ( (LA30_167=='\\') ) {s = 109;}

                        else if ( ((LA30_167>='\u0000' && LA30_167<='&')||(LA30_167>='(' && LA30_167<='[')||(LA30_167>=']' && LA30_167<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 :
                        int LA30_110 = input.LA(1);

                        s = -1;
                        if ( (LA30_110=='\'') ) {s = 111;}

                        else if ( (LA30_110=='\\') ) {s = 109;}

                        else if ( ((LA30_110>='\u0000' && LA30_110<='&')||(LA30_110>='(' && LA30_110<='[')||(LA30_110>=']' && LA30_110<='\uFFFF')) ) {s = 110;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 :
                        int LA30_106 = input.LA(1);

                        s = -1;
                        if ( ((LA30_106>='\u0000' && LA30_106<='\uFFFF')) ) {s = 165;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 :
                        int LA30_109 = input.LA(1);

                        s = -1;
                        if ( ((LA30_109>='\u0000' && LA30_109<='\uFFFF')) ) {s = 167;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 :
                        int LA30_37 = input.LA(1);

                        s = -1;
                        if ( (LA30_37=='\\') ) {s = 109;}

                        else if ( ((LA30_37>='\u0000' && LA30_37<='&')||(LA30_37>='(' && LA30_37<='[')||(LA30_37>=']' && LA30_37<='\uFFFF')) ) {s = 110;}

                        else if ( (LA30_37=='\'') ) {s = 111;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 7 :
                        int LA30_165 = input.LA(1);

                        s = -1;
                        if ( (LA30_165=='\"') ) {s = 108;}

                        else if ( (LA30_165=='\\') ) {s = 106;}

                        else if ( ((LA30_165>='\u0000' && LA30_165<='!')||(LA30_165>='#' && LA30_165<='[')||(LA30_165>=']' && LA30_165<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 :
                        int LA30_107 = input.LA(1);

                        s = -1;
                        if ( (LA30_107=='\"') ) {s = 108;}

                        else if ( (LA30_107=='\\') ) {s = 106;}

                        else if ( ((LA30_107>='\u0000' && LA30_107<='!')||(LA30_107>='#' && LA30_107<='[')||(LA30_107>=']' && LA30_107<='\uFFFF')) ) {s = 107;}

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
