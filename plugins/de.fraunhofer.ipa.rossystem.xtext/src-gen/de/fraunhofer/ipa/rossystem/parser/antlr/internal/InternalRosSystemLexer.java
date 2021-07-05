package de.fraunhofer.ipa.rossystem.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_DAY=12;
    public static final int RULE_DATE_TIME=10;
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_YEAR=14;
    public static final int RULE_MIN_SEC=16;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DIGIT=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int RULE_DECINT=9;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HOUR=15;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_MONTH=13;
    public static final int T__46=46;
    public static final int RULE_BINARY=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalRosSystemLexer() {;} 
    public InternalRosSystemLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRosSystemLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:11:7: ( 'RosSystem' )
            // InternalRosSystem.g:11:9: 'RosSystem'
            {
            match("RosSystem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:12:7: ( '{' )
            // InternalRosSystem.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:13:7: ( 'Name' )
            // InternalRosSystem.g:13:9: 'Name'
            {
            match("Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:14:7: ( 'RosComponents' )
            // InternalRosSystem.g:14:9: 'RosComponents'
            {
            match("RosComponents"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:15:7: ( '(' )
            // InternalRosSystem.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:16:7: ( ',' )
            // InternalRosSystem.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:17:7: ( ')' )
            // InternalRosSystem.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:18:7: ( 'RosComponentStacks' )
            // InternalRosSystem.g:18:9: 'RosComponentStacks'
            {
            match("RosComponentStacks"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:19:7: ( 'TopicConnections' )
            // InternalRosSystem.g:19:9: 'TopicConnections'
            {
            match("TopicConnections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:20:7: ( '}' )
            // InternalRosSystem.g:20:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:21:7: ( 'ServiceConnections' )
            // InternalRosSystem.g:21:9: 'ServiceConnections'
            {
            match("ServiceConnections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:22:7: ( 'ActionConnections' )
            // InternalRosSystem.g:22:9: 'ActionConnections'
            {
            match("ActionConnections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:23:7: ( 'Parameters' )
            // InternalRosSystem.g:23:9: 'Parameters'
            {
            match("Parameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:24:7: ( 'TopicConnection' )
            // InternalRosSystem.g:24:9: 'TopicConnection'
            {
            match("TopicConnection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:25:7: ( 'From' )
            // InternalRosSystem.g:25:9: 'From'
            {
            match("From"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:26:7: ( 'To' )
            // InternalRosSystem.g:26:9: 'To'
            {
            match("To"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:27:7: ( 'ServiceConnection' )
            // InternalRosSystem.g:27:9: 'ServiceConnection'
            {
            match("ServiceConnection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:28:7: ( 'ActionConnection' )
            // InternalRosSystem.g:28:9: 'ActionConnection'
            {
            match("ActionConnection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:29:7: ( 'ComponentStack' )
            // InternalRosSystem.g:29:9: 'ComponentStack'
            {
            match("ComponentStack"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:30:7: ( 'name' )
            // InternalRosSystem.g:30:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:31:7: ( 'QualityAttributes' )
            // InternalRosSystem.g:31:9: 'QualityAttributes'
            {
            match("QualityAttributes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:32:7: ( 'QualityAttribute' )
            // InternalRosSystem.g:32:9: 'QualityAttribute'
            {
            match("QualityAttribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:33:7: ( 'type' )
            // InternalRosSystem.g:33:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:34:7: ( 'value' )
            // InternalRosSystem.g:34:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:35:7: ( 'ComponentInterface' )
            // InternalRosSystem.g:35:9: 'ComponentInterface'
            {
            match("ComponentInterface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:36:7: ( 'NameSpace' )
            // InternalRosSystem.g:36:9: 'NameSpace'
            {
            match("NameSpace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:37:7: ( 'FromRosNode' )
            // InternalRosSystem.g:37:9: 'FromRosNode'
            {
            match("FromRosNode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:38:7: ( 'RosPublishers' )
            // InternalRosSystem.g:38:9: 'RosPublishers'
            {
            match("RosPublishers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:39:7: ( 'RosSubscribers' )
            // InternalRosSystem.g:39:9: 'RosSubscribers'
            {
            match("RosSubscribers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:40:7: ( 'RosSrvServers' )
            // InternalRosSystem.g:40:9: 'RosSrvServers'
            {
            match("RosSrvServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:41:7: ( 'RosSrvClients' )
            // InternalRosSystem.g:41:9: 'RosSrvClients'
            {
            match("RosSrvClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:42:7: ( 'RosActionServers' )
            // InternalRosSystem.g:42:9: 'RosActionServers'
            {
            match("RosActionServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:43:7: ( 'RosActionClients' )
            // InternalRosSystem.g:43:9: 'RosActionClients'
            {
            match("RosActionClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:44:7: ( 'RosParameters' )
            // InternalRosSystem.g:44:9: 'RosParameters'
            {
            match("RosParameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:45:7: ( 'RosPublisher' )
            // InternalRosSystem.g:45:9: 'RosPublisher'
            {
            match("RosPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:46:7: ( 'ns' )
            // InternalRosSystem.g:46:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:47:7: ( 'RefPublisher' )
            // InternalRosSystem.g:47:9: 'RefPublisher'
            {
            match("RefPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:48:7: ( 'RosSubscriber' )
            // InternalRosSystem.g:48:9: 'RosSubscriber'
            {
            match("RosSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:49:7: ( 'RefSubscriber' )
            // InternalRosSystem.g:49:9: 'RefSubscriber'
            {
            match("RefSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:50:7: ( 'RosServiceServer' )
            // InternalRosSystem.g:50:9: 'RosServiceServer'
            {
            match("RosServiceServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:51:7: ( 'RefServer' )
            // InternalRosSystem.g:51:9: 'RefServer'
            {
            match("RefServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:52:7: ( 'RosServiceClient' )
            // InternalRosSystem.g:52:9: 'RosServiceClient'
            {
            match("RosServiceClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:53:7: ( 'RefClient' )
            // InternalRosSystem.g:53:9: 'RefClient'
            {
            match("RefClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:54:7: ( 'RosActionServer' )
            // InternalRosSystem.g:54:9: 'RosActionServer'
            {
            match("RosActionServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:55:7: ( 'RosActionClient' )
            // InternalRosSystem.g:55:9: 'RosActionClient'
            {
            match("RosActionClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:56:7: ( 'RosParameter' )
            // InternalRosSystem.g:56:9: 'RosParameter'
            {
            match("RosParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:57:7: ( 'RefParameter' )
            // InternalRosSystem.g:57:9: 'RefParameter'
            {
            match("RefParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:58:7: ( 'Parameter' )
            // InternalRosSystem.g:58:9: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:59:7: ( 'List' )
            // InternalRosSystem.g:59:9: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:60:7: ( 'Struct' )
            // InternalRosSystem.g:60:9: 'Struct'
            {
            match("Struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:61:7: ( 'Integer' )
            // InternalRosSystem.g:61:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:62:7: ( 'default' )
            // InternalRosSystem.g:62:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:63:7: ( 'String' )
            // InternalRosSystem.g:63:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:64:7: ( 'Double' )
            // InternalRosSystem.g:64:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:65:7: ( 'Boolean' )
            // InternalRosSystem.g:65:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:66:7: ( 'Base64' )
            // InternalRosSystem.g:66:9: 'Base64'
            {
            match("Base64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:67:7: ( 'Array' )
            // InternalRosSystem.g:67:9: 'Array'
            {
            match("Array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:68:7: ( 'ParameterAny' )
            // InternalRosSystem.g:68:9: 'ParameterAny'
            {
            match("ParameterAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:69:7: ( 'GlobalNamespace' )
            // InternalRosSystem.g:69:9: 'GlobalNamespace'
            {
            match("GlobalNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:70:7: ( 'parts' )
            // InternalRosSystem.g:70:9: 'parts'
            {
            match("parts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:71:7: ( 'RelativeNamespace' )
            // InternalRosSystem.g:71:9: 'RelativeNamespace'
            {
            match("RelativeNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:72:7: ( 'PrivateNamespace' )
            // InternalRosSystem.g:72:9: 'PrivateNamespace'
            {
            match("PrivateNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:73:7: ( 'GraphName' )
            // InternalRosSystem.g:73:9: 'GraphName'
            {
            match("GraphName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalRosSystem.g:4254:21: ( '0' .. '9' )
            // InternalRosSystem.g:4254:23: '0' .. '9'
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
            // InternalRosSystem.g:4256:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosSystem.g:4256:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosSystem.g:4256:15: ( '0b' | '0B' )
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
                    // InternalRosSystem.g:4256:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4256:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosSystem.g:4256:27: ( '0' | '1' )+
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
            	    // InternalRosSystem.g:
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
            // InternalRosSystem.g:4258:14: ( ( 'true' | 'false' ) )
            // InternalRosSystem.g:4258:16: ( 'true' | 'false' )
            {
            // InternalRosSystem.g:4258:16: ( 'true' | 'false' )
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
                    // InternalRosSystem.g:4258:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4258:24: 'false'
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
            // InternalRosSystem.g:4260:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalRosSystem.g:4260:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalRosSystem.g:4260:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRosSystem.g:4260:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalRosSystem.g:4260:32: ( RULE_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosSystem.g:4260:32: RULE_DIGIT
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
                    // InternalRosSystem.g:4260:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalRosSystem.g:4260:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRosSystem.g:4260:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosSystem.g:4260:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalRosSystem.g:4260:49: RULE_DIGIT
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

                    // InternalRosSystem.g:4260:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='-') ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1=='0') ) {
                            alt7=1;
                        }
                        else if ( (LA7_1=='-'||(LA7_1>='1' && LA7_1<='9')) ) {
                            alt7=1;
                        }
                    }
                    else if ( (LA7_0=='+') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRosSystem.g:
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

                    mRULE_DECINT(); 

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
            // InternalRosSystem.g:4262:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystem.g:4262:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystem.g:4262:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
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
                    // InternalRosSystem.g:4262:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4262:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosSystem.g:4262:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRosSystem.g:4262:29: RULE_DIGIT
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
                    // InternalRosSystem.g:4262:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosSystem.g:4262:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRosSystem.g:4262:54: RULE_DIGIT
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
            // InternalRosSystem.g:4264:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosSystem.g:4264:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosSystem.g:4264:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
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
                    // InternalRosSystem.g:4264:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4264:31: '1' .. '3' '0' .. '9'
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
            // InternalRosSystem.g:4266:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosSystem.g:4266:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosSystem.g:4266:23: ( '1' .. '9' | '1' '0' .. '2' )
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
                    // InternalRosSystem.g:4266:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4266:33: '1' '0' .. '2'
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
            // InternalRosSystem.g:4268:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosSystem.g:4268:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
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
            // InternalRosSystem.g:4270:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosSystem.g:4270:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosSystem.g:4270:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
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
                    // InternalRosSystem.g:4270:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4270:41: '2' '0' .. '3'
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
            // InternalRosSystem.g:4272:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosSystem.g:4272:25: '0' .. '5' '0' .. '9'
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
            // InternalRosSystem.g:4274:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosSystem.g:4274:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4276:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystem.g:4276:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystem.g:4276:11: ( '^' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='^') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:4276:11: '^'
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

            // InternalRosSystem.g:4276:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRosSystem.g:
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
            	    break loop16;
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
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4278:10: ( ( '0' .. '9' )+ )
            // InternalRosSystem.g:4278:12: ( '0' .. '9' )+
            {
            // InternalRosSystem.g:4278:12: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRosSystem.g:4278:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalRosSystem.g:4280:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystem.g:4280:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystem.g:4280:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystem.g:4280:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosSystem.g:4280:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRosSystem.g:4280:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystem.g:4280:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:4280:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosSystem.g:4280:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRosSystem.g:4280:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystem.g:4280:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop19;
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
            // InternalRosSystem.g:4282:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystem.g:4282:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosSystem.g:4282:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosSystem.g:4282:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4284:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRosSystem.g:4284:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRosSystem.g:4284:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystem.g:4284:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop22;
                }
            } while (true);

            // InternalRosSystem.g:4284:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystem.g:4284:41: ( '\\r' )? '\\n'
                    {
                    // InternalRosSystem.g:4284:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalRosSystem.g:4284:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystem.g:4286:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystem.g:4286:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystem.g:4286:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRosSystem.g:
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // InternalRosSystem.g:4288:16: ( . )
            // InternalRosSystem.g:4288:18: .
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
        // InternalRosSystem.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=75;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // InternalRosSystem.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalRosSystem.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalRosSystem.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalRosSystem.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalRosSystem.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalRosSystem.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalRosSystem.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalRosSystem.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalRosSystem.g:1:58: T__30
                {
                mT__30(); 

                }
                break;
            case 10 :
                // InternalRosSystem.g:1:64: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // InternalRosSystem.g:1:70: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // InternalRosSystem.g:1:76: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // InternalRosSystem.g:1:82: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // InternalRosSystem.g:1:88: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // InternalRosSystem.g:1:94: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // InternalRosSystem.g:1:100: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // InternalRosSystem.g:1:106: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // InternalRosSystem.g:1:112: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // InternalRosSystem.g:1:118: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // InternalRosSystem.g:1:124: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // InternalRosSystem.g:1:130: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // InternalRosSystem.g:1:136: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // InternalRosSystem.g:1:142: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // InternalRosSystem.g:1:148: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // InternalRosSystem.g:1:154: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // InternalRosSystem.g:1:160: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // InternalRosSystem.g:1:166: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // InternalRosSystem.g:1:172: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // InternalRosSystem.g:1:178: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // InternalRosSystem.g:1:184: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // InternalRosSystem.g:1:190: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // InternalRosSystem.g:1:196: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // InternalRosSystem.g:1:202: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // InternalRosSystem.g:1:208: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // InternalRosSystem.g:1:214: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // InternalRosSystem.g:1:220: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // InternalRosSystem.g:1:226: T__58
                {
                mT__58(); 

                }
                break;
            case 38 :
                // InternalRosSystem.g:1:232: T__59
                {
                mT__59(); 

                }
                break;
            case 39 :
                // InternalRosSystem.g:1:238: T__60
                {
                mT__60(); 

                }
                break;
            case 40 :
                // InternalRosSystem.g:1:244: T__61
                {
                mT__61(); 

                }
                break;
            case 41 :
                // InternalRosSystem.g:1:250: T__62
                {
                mT__62(); 

                }
                break;
            case 42 :
                // InternalRosSystem.g:1:256: T__63
                {
                mT__63(); 

                }
                break;
            case 43 :
                // InternalRosSystem.g:1:262: T__64
                {
                mT__64(); 

                }
                break;
            case 44 :
                // InternalRosSystem.g:1:268: T__65
                {
                mT__65(); 

                }
                break;
            case 45 :
                // InternalRosSystem.g:1:274: T__66
                {
                mT__66(); 

                }
                break;
            case 46 :
                // InternalRosSystem.g:1:280: T__67
                {
                mT__67(); 

                }
                break;
            case 47 :
                // InternalRosSystem.g:1:286: T__68
                {
                mT__68(); 

                }
                break;
            case 48 :
                // InternalRosSystem.g:1:292: T__69
                {
                mT__69(); 

                }
                break;
            case 49 :
                // InternalRosSystem.g:1:298: T__70
                {
                mT__70(); 

                }
                break;
            case 50 :
                // InternalRosSystem.g:1:304: T__71
                {
                mT__71(); 

                }
                break;
            case 51 :
                // InternalRosSystem.g:1:310: T__72
                {
                mT__72(); 

                }
                break;
            case 52 :
                // InternalRosSystem.g:1:316: T__73
                {
                mT__73(); 

                }
                break;
            case 53 :
                // InternalRosSystem.g:1:322: T__74
                {
                mT__74(); 

                }
                break;
            case 54 :
                // InternalRosSystem.g:1:328: T__75
                {
                mT__75(); 

                }
                break;
            case 55 :
                // InternalRosSystem.g:1:334: T__76
                {
                mT__76(); 

                }
                break;
            case 56 :
                // InternalRosSystem.g:1:340: T__77
                {
                mT__77(); 

                }
                break;
            case 57 :
                // InternalRosSystem.g:1:346: T__78
                {
                mT__78(); 

                }
                break;
            case 58 :
                // InternalRosSystem.g:1:352: T__79
                {
                mT__79(); 

                }
                break;
            case 59 :
                // InternalRosSystem.g:1:358: T__80
                {
                mT__80(); 

                }
                break;
            case 60 :
                // InternalRosSystem.g:1:364: T__81
                {
                mT__81(); 

                }
                break;
            case 61 :
                // InternalRosSystem.g:1:370: T__82
                {
                mT__82(); 

                }
                break;
            case 62 :
                // InternalRosSystem.g:1:376: T__83
                {
                mT__83(); 

                }
                break;
            case 63 :
                // InternalRosSystem.g:1:382: T__84
                {
                mT__84(); 

                }
                break;
            case 64 :
                // InternalRosSystem.g:1:388: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 65 :
                // InternalRosSystem.g:1:400: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 66 :
                // InternalRosSystem.g:1:413: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 67 :
                // InternalRosSystem.g:1:425: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 68 :
                // InternalRosSystem.g:1:437: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 69 :
                // InternalRosSystem.g:1:452: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 70 :
                // InternalRosSystem.g:1:460: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 71 :
                // InternalRosSystem.g:1:469: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 72 :
                // InternalRosSystem.g:1:481: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 73 :
                // InternalRosSystem.g:1:497: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 74 :
                // InternalRosSystem.g:1:513: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 75 :
                // InternalRosSystem.g:1:521: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA8_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
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
            return "4260:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\47\1\uffff\1\47\3\uffff\1\47\1\uffff\20\47\1\110\1\47\1\110\1\44\1\110\1\44\1\uffff\3\44\2\uffff\2\47\2\uffff\1\47\3\uffff\1\127\1\uffff\11\47\1\141\15\47\1\uffff\1\160\2\uffff\1\47\3\110\4\uffff\5\47\1\uffff\11\47\1\uffff\15\47\1\160\1\uffff\1\47\2\110\10\47\1\u00a7\10\47\1\u00b1\1\47\1\u00b3\1\47\1\u00b5\1\u00b6\1\47\1\u00b8\10\47\1\160\1\47\1\110\17\47\1\uffff\5\47\1\u00d7\3\47\1\uffff\1\47\1\uffff\1\47\2\uffff\1\u00dd\1\uffff\7\47\1\u00e5\1\uffff\1\u00b6\21\47\1\u00f8\1\u00f9\1\47\1\uffff\5\47\1\uffff\2\47\1\u0102\1\47\1\u0104\2\47\1\uffff\22\47\2\uffff\6\47\1\u011f\1\u0120\1\uffff\1\u0121\1\uffff\32\47\3\uffff\2\47\1\u013e\13\47\1\u014b\1\u014c\1\47\1\u014e\3\47\1\u0154\5\47\1\u015b\1\uffff\14\47\2\uffff\1\47\1\uffff\3\47\1\u016d\1\47\1\uffff\6\47\1\uffff\21\47\1\uffff\2\47\1\u0188\12\47\1\u0195\1\u0197\2\47\1\u019a\1\u019b\5\47\1\u01a1\1\47\1\uffff\4\47\1\u01a8\1\u01a9\1\u01aa\2\47\1\u01ad\1\47\1\u01af\1\uffff\1\u01b0\1\uffff\2\47\2\uffff\1\u01b3\4\47\1\uffff\5\47\1\u01bd\3\uffff\2\47\1\uffff\1\47\2\uffff\2\47\1\uffff\5\47\1\u01c8\3\47\1\uffff\3\47\1\u01d0\1\u01d2\1\47\1\u01d5\3\47\1\uffff\2\47\1\u01db\1\u01dc\1\u01dd\1\47\1\u01df\1\uffff\1\u01e0\1\uffff\1\47\1\u01e2\1\uffff\1\47\1\u01e5\1\u01e6\1\47\1\u01e9\3\uffff\1\47\2\uffff\1\u01eb\1\uffff\1\u01ed\1\u01ee\2\uffff\1\47\1\u01f0\1\uffff\1\u01f1\1\uffff\1\u01f2\2\uffff\1\u01f3\4\uffff";
    static final String DFA26_eofS =
        "\u01f4\uffff";
    static final String DFA26_minS =
        "\1\0\1\145\1\uffff\1\141\3\uffff\1\157\1\uffff\1\145\1\143\1\141\1\162\1\157\1\141\1\165\1\162\1\141\1\151\1\156\1\145\1\157\1\141\1\154\1\141\1\56\1\141\1\56\1\60\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\163\1\146\2\uffff\1\155\3\uffff\1\60\1\uffff\2\162\1\164\2\162\1\151\1\157\2\155\1\60\1\141\1\160\1\165\1\154\1\163\1\164\1\146\1\165\1\157\1\163\1\157\1\141\1\162\1\uffff\1\60\2\uffff\1\154\3\56\4\uffff\1\101\1\103\1\141\1\145\1\151\1\uffff\1\166\2\151\2\141\1\166\1\155\1\160\1\145\1\uffff\1\154\2\145\1\165\1\164\1\145\1\141\1\142\1\154\1\145\1\142\1\160\1\164\1\60\1\uffff\1\163\2\56\1\145\1\157\1\141\1\143\1\141\1\145\1\154\1\164\1\60\1\143\1\151\1\143\1\156\1\157\1\171\1\155\1\141\1\60\1\157\1\60\1\151\2\60\1\145\1\60\1\147\1\165\1\154\1\145\1\66\1\141\1\150\1\163\1\55\1\145\1\55\1\163\1\142\1\166\1\162\1\155\1\142\1\162\1\164\1\142\1\162\1\142\1\162\2\151\1\160\1\uffff\1\103\1\143\1\164\1\147\1\156\1\60\1\145\1\164\1\157\1\uffff\1\156\1\uffff\1\164\2\uffff\1\60\1\uffff\1\145\1\154\1\145\1\141\1\64\1\154\1\116\1\60\1\uffff\1\60\1\164\1\163\1\103\1\166\1\160\1\154\1\141\1\151\1\154\1\141\1\163\1\166\1\145\1\166\1\141\1\157\1\145\2\60\1\103\1\uffff\1\164\1\145\1\163\1\145\1\171\1\uffff\1\162\1\164\1\60\1\156\1\60\1\116\1\141\1\uffff\1\145\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\157\1\151\1\155\1\143\1\145\1\156\1\145\1\143\1\156\1\103\2\uffff\1\157\1\145\2\116\1\156\1\101\2\60\1\uffff\1\60\1\uffff\1\141\2\155\2\162\1\151\1\143\1\156\1\163\1\145\1\156\1\163\1\145\2\162\1\164\1\116\1\145\1\156\1\157\1\156\1\162\1\141\1\157\2\164\3\uffff\1\155\1\145\1\60\1\151\1\166\3\145\1\150\1\164\1\103\1\150\1\164\1\151\2\60\1\141\1\60\1\145\2\156\1\60\1\155\1\144\1\111\1\164\1\145\1\60\1\uffff\1\142\1\145\1\156\1\103\1\156\3\145\1\154\2\145\1\142\2\uffff\1\155\1\uffff\1\143\1\156\1\145\1\60\1\156\1\uffff\2\145\1\164\1\156\1\162\1\163\1\uffff\1\145\1\162\1\164\1\145\1\154\1\164\3\162\1\151\2\162\2\145\1\164\1\145\1\143\1\uffff\1\171\1\163\1\60\1\141\1\164\1\151\1\160\1\162\2\163\1\162\1\151\1\123\2\60\1\166\1\145\2\60\1\162\1\163\1\151\1\143\1\164\1\60\1\160\1\uffff\1\143\1\145\1\142\1\141\3\60\1\166\1\145\1\60\1\164\1\60\1\uffff\1\60\1\uffff\1\145\1\156\2\uffff\1\60\1\160\1\157\1\164\1\151\1\uffff\1\141\1\153\1\162\1\165\1\143\1\60\3\uffff\1\145\1\156\1\uffff\1\141\2\uffff\1\162\1\164\1\uffff\1\141\1\156\1\151\1\157\1\143\1\60\1\146\1\164\1\145\1\uffff\1\162\1\164\1\143\2\60\1\143\1\60\1\157\1\156\1\145\1\uffff\1\141\1\145\3\60\1\153\1\60\1\uffff\1\60\1\uffff\1\145\1\60\1\uffff\1\156\2\60\1\143\1\60\3\uffff\1\163\2\uffff\1\60\1\uffff\2\60\2\uffff\1\145\1\60\1\uffff\1\60\1\uffff\1\60\2\uffff\1\60\4\uffff";
    static final String DFA26_maxS =
        "\1\uffff\1\157\1\uffff\1\141\3\uffff\1\157\1\uffff\1\164\3\162\1\157\1\163\1\165\1\171\1\141\1\151\1\156\1\145\2\157\1\162\1\141\1\145\1\141\1\145\1\71\1\145\1\172\1\uffff\2\uffff\1\57\2\uffff\1\163\1\154\2\uffff\1\155\3\uffff\1\172\1\uffff\2\162\1\164\2\162\1\151\1\157\2\155\1\172\1\141\1\160\1\165\1\154\1\163\1\164\1\146\1\165\1\157\1\163\1\157\1\141\1\162\1\uffff\1\71\2\uffff\1\154\3\145\4\uffff\2\123\1\141\1\145\1\151\1\uffff\1\166\1\165\1\151\2\141\1\166\1\155\1\160\1\145\1\uffff\1\154\2\145\1\165\1\164\1\145\1\141\1\142\1\154\1\145\1\142\1\160\1\164\1\71\1\uffff\1\163\2\145\1\171\1\157\1\165\1\143\2\165\1\154\1\164\1\172\1\143\1\151\1\143\1\156\1\157\1\171\1\155\1\141\1\172\1\157\1\172\1\151\2\172\1\145\1\172\1\147\1\165\1\154\1\145\1\66\1\141\1\150\1\163\1\55\2\145\1\163\1\142\1\166\1\162\1\155\1\142\1\162\1\164\1\142\1\162\1\142\1\162\2\151\1\160\1\uffff\1\103\1\143\1\164\1\147\1\156\1\172\1\145\1\164\1\157\1\uffff\1\156\1\uffff\1\164\2\uffff\1\172\1\uffff\1\145\1\154\1\145\1\141\1\64\1\154\1\116\1\172\1\uffff\1\172\1\164\1\163\1\123\1\166\1\160\1\154\1\141\1\151\1\154\1\141\1\163\1\166\1\145\1\166\1\141\1\157\1\145\2\172\1\103\1\uffff\1\164\1\145\1\163\1\145\1\171\1\uffff\1\162\1\164\1\172\1\156\1\172\1\116\1\141\1\uffff\1\145\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\157\1\151\1\155\1\143\1\145\1\156\1\145\1\143\1\156\1\103\2\uffff\1\157\1\145\2\116\1\156\1\101\2\172\1\uffff\1\172\1\uffff\1\141\2\155\2\162\1\151\1\143\1\156\1\163\1\145\1\156\1\163\1\145\2\162\1\164\1\116\1\145\1\156\1\157\1\156\1\162\1\141\1\157\2\164\3\uffff\1\155\1\145\1\172\1\151\1\166\3\145\1\150\1\164\1\123\1\150\1\164\1\151\2\172\1\141\1\172\1\145\2\156\1\172\1\155\1\144\1\123\1\164\1\145\1\172\1\uffff\1\142\1\145\1\156\1\123\1\156\3\145\1\154\2\145\1\142\2\uffff\1\155\1\uffff\1\143\1\156\1\145\1\172\1\156\1\uffff\2\145\1\164\1\156\1\162\1\163\1\uffff\1\145\1\162\1\164\1\145\1\154\1\164\3\162\1\151\2\162\2\145\1\164\1\145\1\143\1\uffff\1\171\1\163\1\172\1\141\1\164\1\151\1\160\1\162\2\163\1\162\1\151\1\163\2\172\1\166\1\145\2\172\1\162\1\163\1\151\1\143\1\164\1\172\1\160\1\uffff\1\143\1\145\1\142\1\141\3\172\1\166\1\145\1\172\1\164\1\172\1\uffff\1\172\1\uffff\1\145\1\156\2\uffff\1\172\1\160\1\157\1\164\1\151\1\uffff\1\141\1\153\1\162\1\165\1\143\1\172\3\uffff\1\145\1\156\1\uffff\1\141\2\uffff\1\162\1\164\1\uffff\1\141\1\156\1\151\1\157\1\143\1\172\1\146\1\164\1\145\1\uffff\1\162\1\164\1\143\2\172\1\143\1\172\1\157\1\156\1\145\1\uffff\1\141\1\145\3\172\1\153\1\172\1\uffff\1\172\1\uffff\1\145\1\172\1\uffff\1\156\2\172\1\143\1\172\3\uffff\1\163\2\uffff\1\172\1\uffff\2\172\2\uffff\1\145\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172\4\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\12\26\uffff\1\105\3\uffff\1\112\1\113\2\uffff\1\105\1\2\1\uffff\1\5\1\6\1\7\1\uffff\1\12\27\uffff\1\100\1\uffff\1\103\1\102\4\uffff\1\107\1\110\1\111\1\112\5\uffff\1\20\11\uffff\1\44\16\uffff\1\106\66\uffff\1\3\11\uffff\1\17\1\uffff\1\24\1\uffff\1\27\1\101\1\uffff\1\61\10\uffff\1\104\25\uffff\1\71\5\uffff\1\30\7\uffff\1\74\22\uffff\1\62\1\65\10\uffff\1\66\1\uffff\1\70\32\uffff\1\63\1\64\1\67\34\uffff\1\1\14\uffff\1\51\1\53\1\uffff\1\32\5\uffff\1\60\6\uffff\1\77\21\uffff\1\15\32\uffff\1\33\14\uffff\1\43\1\uffff\1\56\2\uffff\1\45\1\57\5\uffff\1\72\6\uffff\1\46\1\36\1\37\2\uffff\1\4\1\uffff\1\34\1\42\2\uffff\1\47\11\uffff\1\35\12\uffff\1\23\7\uffff\1\54\1\uffff\1\55\2\uffff\1\16\5\uffff\1\73\1\50\1\52\1\uffff\1\40\1\41\1\uffff\1\11\2\uffff\1\22\1\76\2\uffff\1\26\1\uffff\1\75\1\uffff\1\21\1\14\1\uffff\1\25\1\10\1\13\1\31";
    static final String DFA26_specialS =
        "\1\1\37\uffff\1\2\1\0\u01d2\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\1\4\1\6\2\44\1\5\1\34\1\44\1\42\1\31\2\33\7\35\7\44\1\12\1\26\1\15\1\25\1\37\1\14\1\27\1\37\1\23\2\37\1\22\1\37\1\3\1\37\1\13\1\17\1\1\1\11\1\7\6\37\3\44\1\36\1\37\1\44\3\37\1\24\1\37\1\32\7\37\1\16\1\37\1\30\3\37\1\20\1\37\1\21\4\37\1\2\1\44\1\10\uff82\44",
            "\1\46\11\uffff\1\45",
            "",
            "\1\51",
            "",
            "",
            "",
            "\1\55",
            "",
            "\1\57\16\uffff\1\60",
            "\1\61\16\uffff\1\62",
            "\1\63\20\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67\21\uffff\1\70",
            "\1\71",
            "\1\73\6\uffff\1\72",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\15\uffff\1\101",
            "\1\103\5\uffff\1\104",
            "\1\105",
            "\1\111\1\uffff\12\107\10\uffff\1\106\2\uffff\1\111\34\uffff\1\106\2\uffff\1\111",
            "\1\112",
            "\1\111\1\uffff\12\113\13\uffff\1\111\37\uffff\1\111",
            "\12\114",
            "\1\111\1\uffff\12\115\13\uffff\1\111\37\uffff\1\111",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\0\116",
            "\0\116",
            "\1\117\4\uffff\1\120",
            "",
            "",
            "\1\122",
            "\1\123\5\uffff\1\124",
            "",
            "",
            "\1\125",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\126\12\47",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\12\157",
            "",
            "",
            "\1\161",
            "\1\111\1\uffff\12\162\13\uffff\1\111\37\uffff\1\111",
            "\1\111\1\uffff\12\163\13\uffff\1\111\37\uffff\1\111",
            "\1\111\1\uffff\12\115\13\uffff\1\111\37\uffff\1\111",
            "",
            "",
            "",
            "",
            "\1\167\1\uffff\1\165\14\uffff\1\166\2\uffff\1\164",
            "\1\172\14\uffff\1\170\2\uffff\1\171",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\u0080\13\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\u0095",
            "",
            "\1\u0096",
            "\1\111\1\uffff\12\u0097\13\uffff\1\111\37\uffff\1\111",
            "\1\111\1\uffff\12\163\13\uffff\1\111\37\uffff\1\111",
            "\1\u009b\14\uffff\1\u009a\2\uffff\1\u0099\3\uffff\1\u0098",
            "\1\u009c",
            "\1\u009e\23\uffff\1\u009d",
            "\1\u009f",
            "\1\u00a1\23\uffff\1\u00a0",
            "\1\u00a3\17\uffff\1\u00a2",
            "\1\u00a4",
            "\1\u00a5",
            "\12\47\7\uffff\22\47\1\u00a6\7\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\47\7\uffff\21\47\1\u00b0\10\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b7",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c1\1\111\1\uffff\12\115\13\uffff\1\111\37\uffff\1\111",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "",
            "\1\u00dc",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e9\17\uffff\1\u00e8",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0103",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "",
            "",
            "",
            "\1\u013c",
            "\1\u013d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0147\17\uffff\1\u0146",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u014d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\12\47\7\uffff\1\u0153\31\47\4\uffff\1\47\1\uffff\22\47\1\u0152\7\47",
            "\1\u0155",
            "\1\u0156",
            "\1\u0158\11\uffff\1\u0157",
            "\1\u0159",
            "\1\u015a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u0160\17\uffff\1\u015f",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "",
            "",
            "\1\u0169",
            "",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0193\37\uffff\1\u0192",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0194\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0196\7\47",
            "\1\u0198",
            "\1\u0199",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01a2",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01a7\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ab",
            "\1\u01ac",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ae",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\u01be",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01cf\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01d1\7\47",
            "\1\u01d3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01d4\7\47",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "",
            "\1\u01d9",
            "\1\u01da",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01de",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01e1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01e3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01e4\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01e7",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01e8\7\47",
            "",
            "",
            "",
            "\1\u01ea",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01ec\7\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u01ef",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_33 = input.LA(1);

                        s = -1;
                        if ( ((LA26_33>='\u0000' && LA26_33<='\uFFFF')) ) {s = 78;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='R') ) {s = 1;}

                        else if ( (LA26_0=='{') ) {s = 2;}

                        else if ( (LA26_0=='N') ) {s = 3;}

                        else if ( (LA26_0=='(') ) {s = 4;}

                        else if ( (LA26_0==',') ) {s = 5;}

                        else if ( (LA26_0==')') ) {s = 6;}

                        else if ( (LA26_0=='T') ) {s = 7;}

                        else if ( (LA26_0=='}') ) {s = 8;}

                        else if ( (LA26_0=='S') ) {s = 9;}

                        else if ( (LA26_0=='A') ) {s = 10;}

                        else if ( (LA26_0=='P') ) {s = 11;}

                        else if ( (LA26_0=='F') ) {s = 12;}

                        else if ( (LA26_0=='C') ) {s = 13;}

                        else if ( (LA26_0=='n') ) {s = 14;}

                        else if ( (LA26_0=='Q') ) {s = 15;}

                        else if ( (LA26_0=='t') ) {s = 16;}

                        else if ( (LA26_0=='v') ) {s = 17;}

                        else if ( (LA26_0=='L') ) {s = 18;}

                        else if ( (LA26_0=='I') ) {s = 19;}

                        else if ( (LA26_0=='d') ) {s = 20;}

                        else if ( (LA26_0=='D') ) {s = 21;}

                        else if ( (LA26_0=='B') ) {s = 22;}

                        else if ( (LA26_0=='G') ) {s = 23;}

                        else if ( (LA26_0=='p') ) {s = 24;}

                        else if ( (LA26_0=='0') ) {s = 25;}

                        else if ( (LA26_0=='f') ) {s = 26;}

                        else if ( ((LA26_0>='1' && LA26_0<='2')) ) {s = 27;}

                        else if ( (LA26_0=='-') ) {s = 28;}

                        else if ( ((LA26_0>='3' && LA26_0<='9')) ) {s = 29;}

                        else if ( (LA26_0=='^') ) {s = 30;}

                        else if ( (LA26_0=='E'||LA26_0=='H'||(LA26_0>='J' && LA26_0<='K')||LA26_0=='M'||LA26_0=='O'||(LA26_0>='U' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='c')||LA26_0=='e'||(LA26_0>='g' && LA26_0<='m')||LA26_0=='o'||(LA26_0>='q' && LA26_0<='s')||LA26_0=='u'||(LA26_0>='w' && LA26_0<='z')) ) {s = 31;}

                        else if ( (LA26_0=='\"') ) {s = 32;}

                        else if ( (LA26_0=='\'') ) {s = 33;}

                        else if ( (LA26_0=='/') ) {s = 34;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 35;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||LA26_0=='!'||(LA26_0>='#' && LA26_0<='&')||(LA26_0>='*' && LA26_0<='+')||LA26_0=='.'||(LA26_0>=':' && LA26_0<='@')||(LA26_0>='[' && LA26_0<=']')||LA26_0=='`'||LA26_0=='|'||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_32 = input.LA(1);

                        s = -1;
                        if ( ((LA26_32>='\u0000' && LA26_32<='\uFFFF')) ) {s = 78;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}