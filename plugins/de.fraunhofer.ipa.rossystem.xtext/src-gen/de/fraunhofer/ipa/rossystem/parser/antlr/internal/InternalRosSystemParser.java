package de.fraunhofer.ipa.rossystem.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_DATE_TIME", "RULE_DIGIT", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'RosComponents'", "'('", "','", "')'", "'TopicConnections'", "'}'", "'ServiceConnections'", "'ActionConnections'", "'Parameters'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'ActionConnection'", "'ComponentInterface'", "'name'", "'NameSpace'", "'RosPublishers'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosParameters'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'", "'RosParameter'", "'RefParameter'", "'value'", "'Parameter'", "'type'", "'List'", "'Struc'", "'Integer'", "'default'", "'String'", "'Double'", "'Boolean'", "'Base64'", "'Array'", "'ParameterAny'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'GraphName'"
    };
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
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }



     	private RosSystemGrammarAccess grammarAccess;

        public InternalRosSystemParser(TokenStream input, RosSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RosSystem";
       	}

       	@Override
       	protected RosSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystem.g:64:1: entryRuleRosSystem returns [EObject current=null] : iv_ruleRosSystem= ruleRosSystem EOF ;
    public final EObject entryRuleRosSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSystem = null;


        try {
            // InternalRosSystem.g:64:50: (iv_ruleRosSystem= ruleRosSystem EOF )
            // InternalRosSystem.g:65:2: iv_ruleRosSystem= ruleRosSystem EOF
            {
             newCompositeNode(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSystem=ruleRosSystem();

            state._fsp--;

             current =iv_ruleRosSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystem.g:71:1: ruleRosSystem returns [EObject current=null] : ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) ) ) otherlv_36= '}' ) ;
    public final EObject ruleRosSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        EObject lv_RosComponent_8_0 = null;

        EObject lv_RosComponent_10_0 = null;

        EObject lv_TopicConnections_14_0 = null;

        EObject lv_TopicConnections_16_0 = null;

        EObject lv_ServiceConnections_20_0 = null;

        EObject lv_ServiceConnections_22_0 = null;

        EObject lv_ActionConnections_26_0 = null;

        EObject lv_ActionConnections_28_0 = null;

        EObject lv_Parameter_32_0 = null;

        EObject lv_Parameter_34_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:77:2: ( ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) ) ) otherlv_36= '}' ) )
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) ) ) otherlv_36= '}' )
            {
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) ) ) otherlv_36= '}' )
            // InternalRosSystem.g:79:3: () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) ) ) otherlv_36= '}'
            {
            // InternalRosSystem.g:79:3: ()
            // InternalRosSystem.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSystemAccess().getRosSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getRosSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getNameKeyword_3());
            		
            // InternalRosSystem.g:98:3: ( (lv_Name_4_0= ruleEString ) )
            // InternalRosSystem.g:99:4: (lv_Name_4_0= ruleEString )
            {
            // InternalRosSystem.g:99:4: (lv_Name_4_0= ruleEString )
            // InternalRosSystem.g:100:5: lv_Name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_Name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSystemRule());
            					}
            					set(
            						current,
            						"Name",
            						lv_Name_4_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:117:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) ) )
            // InternalRosSystem.g:118:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) )
            {
            // InternalRosSystem.g:118:4: ( ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* ) )
            // InternalRosSystem.g:119:5: ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRosSystemAccess().getUnorderedGroup_5());
            				
            // InternalRosSystem.g:122:5: ( ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )* )
            // InternalRosSystem.g:123:6: ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )*
            {
            // InternalRosSystem.g:123:6: ( ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) ) )*
            loop11:
            do {
                int alt11=6;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 4) ) {
                    alt11=5;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosSystem.g:124:4: ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalRosSystem.g:124:4: ({...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) ) )
            	    // InternalRosSystem.g:125:5: {...}? => ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalRosSystem.g:125:106: ( ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) ) )
            	    // InternalRosSystem.g:126:6: ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalRosSystem.g:129:9: ({...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' ) )
            	    // InternalRosSystem.g:129:10: {...}? => (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "true");
            	    }
            	    // InternalRosSystem.g:129:19: (otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')' )
            	    // InternalRosSystem.g:129:20: otherlv_6= 'RosComponents' otherlv_7= '(' ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )? otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,25,FOLLOW_7); 

            	    									newLeafNode(otherlv_6, grammarAccess.getRosSystemAccess().getRosComponentsKeyword_5_0_0());
            	    								
            	    otherlv_7=(Token)match(input,26,FOLLOW_8); 

            	    									newLeafNode(otherlv_7, grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_5_0_1());
            	    								
            	    // InternalRosSystem.g:137:9: ( ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )* )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==39) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalRosSystem.g:138:10: ( (lv_RosComponent_8_0= ruleComponentInterface ) ) (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )*
            	            {
            	            // InternalRosSystem.g:138:10: ( (lv_RosComponent_8_0= ruleComponentInterface ) )
            	            // InternalRosSystem.g:139:11: (lv_RosComponent_8_0= ruleComponentInterface )
            	            {
            	            // InternalRosSystem.g:139:11: (lv_RosComponent_8_0= ruleComponentInterface )
            	            // InternalRosSystem.g:140:12: lv_RosComponent_8_0= ruleComponentInterface
            	            {

            	            												newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_0_2_0_0());
            	            											
            	            pushFollow(FOLLOW_9);
            	            lv_RosComponent_8_0=ruleComponentInterface();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            												}
            	            												add(
            	            													current,
            	            													"RosComponent",
            	            													lv_RosComponent_8_0,
            	            													"de.fraunhofer.ipa.rossystem.RosSystem.ComponentInterface");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }

            	            // InternalRosSystem.g:157:10: (otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) ) )*
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( (LA1_0==27) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // InternalRosSystem.g:158:11: otherlv_9= ',' ( (lv_RosComponent_10_0= ruleComponentInterface ) )
            	            	    {
            	            	    otherlv_9=(Token)match(input,27,FOLLOW_10); 

            	            	    											newLeafNode(otherlv_9, grammarAccess.getRosSystemAccess().getCommaKeyword_5_0_2_1_0());
            	            	    										
            	            	    // InternalRosSystem.g:162:11: ( (lv_RosComponent_10_0= ruleComponentInterface ) )
            	            	    // InternalRosSystem.g:163:12: (lv_RosComponent_10_0= ruleComponentInterface )
            	            	    {
            	            	    // InternalRosSystem.g:163:12: (lv_RosComponent_10_0= ruleComponentInterface )
            	            	    // InternalRosSystem.g:164:13: lv_RosComponent_10_0= ruleComponentInterface
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_0_2_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_9);
            	            	    lv_RosComponent_10_0=ruleComponentInterface();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"RosComponent",
            	            	    														lv_RosComponent_10_0,
            	            	    														"de.fraunhofer.ipa.rossystem.RosSystem.ComponentInterface");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop1;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,28,FOLLOW_6); 

            	    									newLeafNode(otherlv_11, grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_5_0_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRosSystemAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystem.g:193:4: ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:193:4: ({...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) ) )
            	    // InternalRosSystem.g:194:5: {...}? => ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalRosSystem.g:194:106: ( ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) ) )
            	    // InternalRosSystem.g:195:6: ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalRosSystem.g:198:9: ({...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' ) )
            	    // InternalRosSystem.g:198:10: {...}? => (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "true");
            	    }
            	    // InternalRosSystem.g:198:19: (otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}' )
            	    // InternalRosSystem.g:198:20: otherlv_12= 'TopicConnections' otherlv_13= '{' ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )? otherlv_17= '}'
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_1_0());
            	    								
            	    otherlv_13=(Token)match(input,23,FOLLOW_11); 

            	    									newLeafNode(otherlv_13, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1_1());
            	    								
            	    // InternalRosSystem.g:206:9: ( ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )* )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==34) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalRosSystem.g:207:10: ( (lv_TopicConnections_14_0= ruleTopicConnection ) ) (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )*
            	            {
            	            // InternalRosSystem.g:207:10: ( (lv_TopicConnections_14_0= ruleTopicConnection ) )
            	            // InternalRosSystem.g:208:11: (lv_TopicConnections_14_0= ruleTopicConnection )
            	            {
            	            // InternalRosSystem.g:208:11: (lv_TopicConnections_14_0= ruleTopicConnection )
            	            // InternalRosSystem.g:209:12: lv_TopicConnections_14_0= ruleTopicConnection
            	            {

            	            												newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_1_2_0_0());
            	            											
            	            pushFollow(FOLLOW_12);
            	            lv_TopicConnections_14_0=ruleTopicConnection();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            												}
            	            												add(
            	            													current,
            	            													"TopicConnections",
            	            													lv_TopicConnections_14_0,
            	            													"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }

            	            // InternalRosSystem.g:226:10: (otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) ) )*
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( (LA3_0==27) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // InternalRosSystem.g:227:11: otherlv_15= ',' ( (lv_TopicConnections_16_0= ruleTopicConnection ) )
            	            	    {
            	            	    otherlv_15=(Token)match(input,27,FOLLOW_13); 

            	            	    											newLeafNode(otherlv_15, grammarAccess.getRosSystemAccess().getCommaKeyword_5_1_2_1_0());
            	            	    										
            	            	    // InternalRosSystem.g:231:11: ( (lv_TopicConnections_16_0= ruleTopicConnection ) )
            	            	    // InternalRosSystem.g:232:12: (lv_TopicConnections_16_0= ruleTopicConnection )
            	            	    {
            	            	    // InternalRosSystem.g:232:12: (lv_TopicConnections_16_0= ruleTopicConnection )
            	            	    // InternalRosSystem.g:233:13: lv_TopicConnections_16_0= ruleTopicConnection
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_1_2_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_12);
            	            	    lv_TopicConnections_16_0=ruleTopicConnection();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"TopicConnections",
            	            	    														lv_TopicConnections_16_0,
            	            	    														"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop3;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_17=(Token)match(input,30,FOLLOW_6); 

            	    									newLeafNode(otherlv_17, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRosSystemAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystem.g:262:4: ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:262:4: ({...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) ) )
            	    // InternalRosSystem.g:263:5: {...}? => ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalRosSystem.g:263:106: ( ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) ) )
            	    // InternalRosSystem.g:264:6: ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalRosSystem.g:267:9: ({...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' ) )
            	    // InternalRosSystem.g:267:10: {...}? => (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "true");
            	    }
            	    // InternalRosSystem.g:267:19: (otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}' )
            	    // InternalRosSystem.g:267:20: otherlv_18= 'ServiceConnections' otherlv_19= '{' ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )? otherlv_23= '}'
            	    {
            	    otherlv_18=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_5_2_0());
            	    								
            	    otherlv_19=(Token)match(input,23,FOLLOW_14); 

            	    									newLeafNode(otherlv_19, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_2_1());
            	    								
            	    // InternalRosSystem.g:275:9: ( ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )* )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==37) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalRosSystem.g:276:10: ( (lv_ServiceConnections_20_0= ruleServiceConnection ) ) (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )*
            	            {
            	            // InternalRosSystem.g:276:10: ( (lv_ServiceConnections_20_0= ruleServiceConnection ) )
            	            // InternalRosSystem.g:277:11: (lv_ServiceConnections_20_0= ruleServiceConnection )
            	            {
            	            // InternalRosSystem.g:277:11: (lv_ServiceConnections_20_0= ruleServiceConnection )
            	            // InternalRosSystem.g:278:12: lv_ServiceConnections_20_0= ruleServiceConnection
            	            {

            	            												newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_5_2_2_0_0());
            	            											
            	            pushFollow(FOLLOW_12);
            	            lv_ServiceConnections_20_0=ruleServiceConnection();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            												}
            	            												add(
            	            													current,
            	            													"ServiceConnections",
            	            													lv_ServiceConnections_20_0,
            	            													"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }

            	            // InternalRosSystem.g:295:10: (otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) ) )*
            	            loop5:
            	            do {
            	                int alt5=2;
            	                int LA5_0 = input.LA(1);

            	                if ( (LA5_0==27) ) {
            	                    alt5=1;
            	                }


            	                switch (alt5) {
            	            	case 1 :
            	            	    // InternalRosSystem.g:296:11: otherlv_21= ',' ( (lv_ServiceConnections_22_0= ruleServiceConnection ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,27,FOLLOW_15); 

            	            	    											newLeafNode(otherlv_21, grammarAccess.getRosSystemAccess().getCommaKeyword_5_2_2_1_0());
            	            	    										
            	            	    // InternalRosSystem.g:300:11: ( (lv_ServiceConnections_22_0= ruleServiceConnection ) )
            	            	    // InternalRosSystem.g:301:12: (lv_ServiceConnections_22_0= ruleServiceConnection )
            	            	    {
            	            	    // InternalRosSystem.g:301:12: (lv_ServiceConnections_22_0= ruleServiceConnection )
            	            	    // InternalRosSystem.g:302:13: lv_ServiceConnections_22_0= ruleServiceConnection
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_5_2_2_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_12);
            	            	    lv_ServiceConnections_22_0=ruleServiceConnection();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"ServiceConnections",
            	            	    														lv_ServiceConnections_22_0,
            	            	    														"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop5;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_23=(Token)match(input,30,FOLLOW_6); 

            	    									newLeafNode(otherlv_23, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRosSystemAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRosSystem.g:331:4: ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:331:4: ({...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) ) )
            	    // InternalRosSystem.g:332:5: {...}? => ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalRosSystem.g:332:106: ( ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) ) )
            	    // InternalRosSystem.g:333:6: ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalRosSystem.g:336:9: ({...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' ) )
            	    // InternalRosSystem.g:336:10: {...}? => (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "true");
            	    }
            	    // InternalRosSystem.g:336:19: (otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}' )
            	    // InternalRosSystem.g:336:20: otherlv_24= 'ActionConnections' otherlv_25= '{' ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )? otherlv_29= '}'
            	    {
            	    otherlv_24=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getRosSystemAccess().getActionConnectionsKeyword_5_3_0());
            	    								
            	    otherlv_25=(Token)match(input,23,FOLLOW_16); 

            	    									newLeafNode(otherlv_25, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_3_1());
            	    								
            	    // InternalRosSystem.g:344:9: ( ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )* )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==38) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalRosSystem.g:345:10: ( (lv_ActionConnections_26_0= ruleActionConnection ) ) (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )*
            	            {
            	            // InternalRosSystem.g:345:10: ( (lv_ActionConnections_26_0= ruleActionConnection ) )
            	            // InternalRosSystem.g:346:11: (lv_ActionConnections_26_0= ruleActionConnection )
            	            {
            	            // InternalRosSystem.g:346:11: (lv_ActionConnections_26_0= ruleActionConnection )
            	            // InternalRosSystem.g:347:12: lv_ActionConnections_26_0= ruleActionConnection
            	            {

            	            												newCompositeNode(grammarAccess.getRosSystemAccess().getActionConnectionsActionConnectionParserRuleCall_5_3_2_0_0());
            	            											
            	            pushFollow(FOLLOW_12);
            	            lv_ActionConnections_26_0=ruleActionConnection();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            												}
            	            												add(
            	            													current,
            	            													"ActionConnections",
            	            													lv_ActionConnections_26_0,
            	            													"de.fraunhofer.ipa.rossystem.RosSystem.ActionConnection");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }

            	            // InternalRosSystem.g:364:10: (otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) ) )*
            	            loop7:
            	            do {
            	                int alt7=2;
            	                int LA7_0 = input.LA(1);

            	                if ( (LA7_0==27) ) {
            	                    alt7=1;
            	                }


            	                switch (alt7) {
            	            	case 1 :
            	            	    // InternalRosSystem.g:365:11: otherlv_27= ',' ( (lv_ActionConnections_28_0= ruleActionConnection ) )
            	            	    {
            	            	    otherlv_27=(Token)match(input,27,FOLLOW_17); 

            	            	    											newLeafNode(otherlv_27, grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_2_1_0());
            	            	    										
            	            	    // InternalRosSystem.g:369:11: ( (lv_ActionConnections_28_0= ruleActionConnection ) )
            	            	    // InternalRosSystem.g:370:12: (lv_ActionConnections_28_0= ruleActionConnection )
            	            	    {
            	            	    // InternalRosSystem.g:370:12: (lv_ActionConnections_28_0= ruleActionConnection )
            	            	    // InternalRosSystem.g:371:13: lv_ActionConnections_28_0= ruleActionConnection
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getRosSystemAccess().getActionConnectionsActionConnectionParserRuleCall_5_3_2_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_12);
            	            	    lv_ActionConnections_28_0=ruleActionConnection();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"ActionConnections",
            	            	    														lv_ActionConnections_28_0,
            	            	    														"de.fraunhofer.ipa.rossystem.RosSystem.ActionConnection");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop7;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_29=(Token)match(input,30,FOLLOW_6); 

            	    									newLeafNode(otherlv_29, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRosSystemAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRosSystem.g:400:4: ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:400:4: ({...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) ) )
            	    // InternalRosSystem.g:401:5: {...}? => ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "getUnorderedGroupHelper().canSelect(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalRosSystem.g:401:106: ( ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) ) )
            	    // InternalRosSystem.g:402:6: ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRosSystemAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalRosSystem.g:405:9: ({...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' ) )
            	    // InternalRosSystem.g:405:10: {...}? => (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRosSystem", "true");
            	    }
            	    // InternalRosSystem.g:405:19: (otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}' )
            	    // InternalRosSystem.g:405:20: otherlv_30= 'Parameters' otherlv_31= '{' ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )? otherlv_35= '}'
            	    {
            	    otherlv_30=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getRosSystemAccess().getParametersKeyword_5_4_0());
            	    								
            	    otherlv_31=(Token)match(input,23,FOLLOW_18); 

            	    									newLeafNode(otherlv_31, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_4_1());
            	    								
            	    // InternalRosSystem.g:413:9: ( ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )* )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==63) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalRosSystem.g:414:10: ( (lv_Parameter_32_0= ruleParameter ) ) (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )*
            	            {
            	            // InternalRosSystem.g:414:10: ( (lv_Parameter_32_0= ruleParameter ) )
            	            // InternalRosSystem.g:415:11: (lv_Parameter_32_0= ruleParameter )
            	            {
            	            // InternalRosSystem.g:415:11: (lv_Parameter_32_0= ruleParameter )
            	            // InternalRosSystem.g:416:12: lv_Parameter_32_0= ruleParameter
            	            {

            	            												newCompositeNode(grammarAccess.getRosSystemAccess().getParameterParameterParserRuleCall_5_4_2_0_0());
            	            											
            	            pushFollow(FOLLOW_12);
            	            lv_Parameter_32_0=ruleParameter();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            												}
            	            												add(
            	            													current,
            	            													"Parameter",
            	            													lv_Parameter_32_0,
            	            													"de.fraunhofer.ipa.rossystem.RosSystem.Parameter");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }

            	            // InternalRosSystem.g:433:10: (otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) ) )*
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==27) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalRosSystem.g:434:11: otherlv_33= ',' ( (lv_Parameter_34_0= ruleParameter ) )
            	            	    {
            	            	    otherlv_33=(Token)match(input,27,FOLLOW_19); 

            	            	    											newLeafNode(otherlv_33, grammarAccess.getRosSystemAccess().getCommaKeyword_5_4_2_1_0());
            	            	    										
            	            	    // InternalRosSystem.g:438:11: ( (lv_Parameter_34_0= ruleParameter ) )
            	            	    // InternalRosSystem.g:439:12: (lv_Parameter_34_0= ruleParameter )
            	            	    {
            	            	    // InternalRosSystem.g:439:12: (lv_Parameter_34_0= ruleParameter )
            	            	    // InternalRosSystem.g:440:13: lv_Parameter_34_0= ruleParameter
            	            	    {

            	            	    													newCompositeNode(grammarAccess.getRosSystemAccess().getParameterParameterParserRuleCall_5_4_2_1_1_0());
            	            	    												
            	            	    pushFollow(FOLLOW_12);
            	            	    lv_Parameter_34_0=ruleParameter();

            	            	    state._fsp--;


            	            	    													if (current==null) {
            	            	    														current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	            	    													}
            	            	    													add(
            	            	    														current,
            	            	    														"Parameter",
            	            	    														lv_Parameter_34_0,
            	            	    														"de.fraunhofer.ipa.rossystem.RosSystem.Parameter");
            	            	    													afterParserOrEnumRuleCall();
            	            	    												

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop9;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_35=(Token)match(input,30,FOLLOW_6); 

            	    									newLeafNode(otherlv_35, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRosSystemAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRosSystemAccess().getUnorderedGroup_5());
            				

            }

            otherlv_36=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleTopicConnection"
    // InternalRosSystem.g:484:1: entryRuleTopicConnection returns [EObject current=null] : iv_ruleTopicConnection= ruleTopicConnection EOF ;
    public final EObject entryRuleTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicConnection = null;


        try {
            // InternalRosSystem.g:484:56: (iv_ruleTopicConnection= ruleTopicConnection EOF )
            // InternalRosSystem.g:485:2: iv_ruleTopicConnection= ruleTopicConnection EOF
            {
             newCompositeNode(grammarAccess.getTopicConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicConnection=ruleTopicConnection();

            state._fsp--;

             current =iv_ruleTopicConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopicConnection"


    // $ANTLR start "ruleTopicConnection"
    // InternalRosSystem.g:491:1: ruleTopicConnection returns [EObject current=null] : (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) ;
    public final EObject ruleTopicConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_TopicName_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:497:2: ( (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) )
            // InternalRosSystem.g:498:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            {
            // InternalRosSystem.g:498:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            // InternalRosSystem.g:499:3: otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0());
            		
            // InternalRosSystem.g:503:3: ( (lv_TopicName_1_0= ruleEString ) )
            // InternalRosSystem.g:504:4: (lv_TopicName_1_0= ruleEString )
            {
            // InternalRosSystem.g:504:4: (lv_TopicName_1_0= ruleEString )
            // InternalRosSystem.g:505:5: lv_TopicName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getTopicNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_TopicName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopicConnectionRule());
            					}
            					set(
            						current,
            						"TopicName",
            						lv_TopicName_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:534:3: ( ( ruleEString ) )
            // InternalRosSystem.g:535:4: ( ruleEString )
            {
            // InternalRosSystem.g:535:4: ( ruleEString )
            // InternalRosSystem.g:536:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:550:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRosSystem.g:551:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:555:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:556:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:556:5: ( ruleEString )
            	    // InternalRosSystem.g:557:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTopicConnectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTopicConnectionAccess().getToKeyword_8());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_9());
            		
            // InternalRosSystem.g:584:3: ( ( ruleEString ) )
            // InternalRosSystem.g:585:4: ( ruleEString )
            {
            // InternalRosSystem.g:585:4: ( ruleEString )
            // InternalRosSystem.g:586:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_10_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:600:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRosSystem.g:601:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_12, grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalRosSystem.g:605:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:606:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:606:5: ( ruleEString )
            	    // InternalRosSystem.g:607:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTopicConnectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_14=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_14, grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_12());
            		
            otherlv_15=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopicConnection"


    // $ANTLR start "entryRuleServiceConnection"
    // InternalRosSystem.g:634:1: entryRuleServiceConnection returns [EObject current=null] : iv_ruleServiceConnection= ruleServiceConnection EOF ;
    public final EObject entryRuleServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConnection = null;


        try {
            // InternalRosSystem.g:634:58: (iv_ruleServiceConnection= ruleServiceConnection EOF )
            // InternalRosSystem.g:635:2: iv_ruleServiceConnection= ruleServiceConnection EOF
            {
             newCompositeNode(grammarAccess.getServiceConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceConnection=ruleServiceConnection();

            state._fsp--;

             current =iv_ruleServiceConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceConnection"


    // $ANTLR start "ruleServiceConnection"
    // InternalRosSystem.g:641:1: ruleServiceConnection returns [EObject current=null] : (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleServiceConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ServiceName_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:647:2: ( (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalRosSystem.g:648:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalRosSystem.g:648:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalRosSystem.g:649:3: otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0());
            		
            // InternalRosSystem.g:653:3: ( (lv_ServiceName_1_0= ruleEString ) )
            // InternalRosSystem.g:654:4: (lv_ServiceName_1_0= ruleEString )
            {
            // InternalRosSystem.g:654:4: (lv_ServiceName_1_0= ruleEString )
            // InternalRosSystem.g:655:5: lv_ServiceName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getServiceNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_ServiceName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceConnectionRule());
            					}
            					set(
            						current,
            						"ServiceName",
            						lv_ServiceName_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:684:3: ( ( ruleEString ) )
            // InternalRosSystem.g:685:4: ( ruleEString )
            {
            // InternalRosSystem.g:685:4: ( ruleEString )
            // InternalRosSystem.g:686:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:700:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRosSystem.g:701:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:705:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:706:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:706:5: ( ruleEString )
            	    // InternalRosSystem.g:707:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceConnectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceConnectionAccess().getToKeyword_8());
            		
            // InternalRosSystem.g:730:3: ( ( ruleEString ) )
            // InternalRosSystem.g:731:4: ( ruleEString )
            {
            // InternalRosSystem.g:731:4: ( ruleEString )
            // InternalRosSystem.g:732:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceConnection"


    // $ANTLR start "entryRuleActionConnection"
    // InternalRosSystem.g:754:1: entryRuleActionConnection returns [EObject current=null] : iv_ruleActionConnection= ruleActionConnection EOF ;
    public final EObject entryRuleActionConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionConnection = null;


        try {
            // InternalRosSystem.g:754:57: (iv_ruleActionConnection= ruleActionConnection EOF )
            // InternalRosSystem.g:755:2: iv_ruleActionConnection= ruleActionConnection EOF
            {
             newCompositeNode(grammarAccess.getActionConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionConnection=ruleActionConnection();

            state._fsp--;

             current =iv_ruleActionConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionConnection"


    // $ANTLR start "ruleActionConnection"
    // InternalRosSystem.g:761:1: ruleActionConnection returns [EObject current=null] : (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleActionConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ActionName_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:767:2: ( (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalRosSystem.g:768:2: (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRosSystem.g:768:2: (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalRosSystem.g:769:3: otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionConnectionAccess().getActionConnectionKeyword_0());
            		
            // InternalRosSystem.g:773:3: ( (lv_ActionName_1_0= ruleEString ) )
            // InternalRosSystem.g:774:4: (lv_ActionName_1_0= ruleEString )
            {
            // InternalRosSystem.g:774:4: (lv_ActionName_1_0= ruleEString )
            // InternalRosSystem.g:775:5: lv_ActionName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getActionNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_ActionName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionConnectionRule());
            					}
            					set(
            						current,
            						"ActionName",
            						lv_ActionName_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getActionConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getActionConnectionAccess().getFromKeyword_3());
            		
            // InternalRosSystem.g:800:3: ( ( ruleEString ) )
            // InternalRosSystem.g:801:4: ( ruleEString )
            {
            // InternalRosSystem.g:801:4: ( ruleEString )
            // InternalRosSystem.g:802:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getFromRosActionServerCrossReference_4_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getActionConnectionAccess().getToKeyword_5());
            		
            // InternalRosSystem.g:820:3: ( ( ruleEString ) )
            // InternalRosSystem.g:821:4: ( ruleEString )
            {
            // InternalRosSystem.g:821:4: ( ruleEString )
            // InternalRosSystem.g:822:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getToRosActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getActionConnectionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionConnection"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:844:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystem.g:844:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystem.g:845:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosSystem.g:851:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystem.g:857:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystem.g:858:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystem.g:858:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:859:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:867:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleComponentInterface"
    // InternalRosSystem.g:878:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalRosSystem.g:878:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalRosSystem.g:879:2: iv_ruleComponentInterface= ruleComponentInterface EOF
            {
             newCompositeNode(grammarAccess.getComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInterface=ruleComponentInterface();

            state._fsp--;

             current =iv_ruleComponentInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalRosSystem.g:885:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_5_0 = null;

        EObject lv_rospublisher_9_0 = null;

        EObject lv_rospublisher_11_0 = null;

        EObject lv_rossubscriber_15_0 = null;

        EObject lv_rossubscriber_17_0 = null;

        EObject lv_rosserviceserver_21_0 = null;

        EObject lv_rosserviceserver_23_0 = null;

        EObject lv_rosserviceclient_27_0 = null;

        EObject lv_rosserviceclient_29_0 = null;

        EObject lv_rosactionserver_33_0 = null;

        EObject lv_rosactionserver_35_0 = null;

        EObject lv_rosactionclient_39_0 = null;

        EObject lv_rosactionclient_41_0 = null;

        EObject lv_rosparameter_45_0 = null;

        EObject lv_rosparameter_47_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:891:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' ) )
            // InternalRosSystem.g:892:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' )
            {
            // InternalRosSystem.g:892:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' )
            // InternalRosSystem.g:893:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getNameKeyword_2());
            		
            // InternalRosSystem.g:905:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRosSystem.g:906:4: (lv_name_3_0= ruleEString )
            {
            // InternalRosSystem.g:906:4: (lv_name_3_0= ruleEString )
            // InternalRosSystem.g:907:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:924:3: (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystem.g:925:4: otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0());
                    			
                    // InternalRosSystem.g:929:4: ( (lv_NameSpace_5_0= ruleEString ) )
                    // InternalRosSystem.g:930:5: (lv_NameSpace_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:930:5: (lv_NameSpace_5_0= ruleEString )
                    // InternalRosSystem.g:931:6: lv_NameSpace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_NameSpace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:949:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) )
            // InternalRosSystem.g:950:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) )
            {
            // InternalRosSystem.g:950:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) )
            // InternalRosSystem.g:951:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            				
            // InternalRosSystem.g:954:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* )
            // InternalRosSystem.g:955:6: ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )*
            {
            // InternalRosSystem.g:955:6: ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )*
            loop24:
            do {
                int alt24=8;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2) ) {
                    alt24=3;
                }
                else if ( LA24_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3) ) {
                    alt24=4;
                }
                else if ( LA24_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4) ) {
                    alt24=5;
                }
                else if ( LA24_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5) ) {
                    alt24=6;
                }
                else if ( LA24_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6) ) {
                    alt24=7;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRosSystem.g:956:4: ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:956:4: ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) )
            	    // InternalRosSystem.g:957:5: {...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalRosSystem.g:957:115: ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) )
            	    // InternalRosSystem.g:958:6: ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalRosSystem.g:961:9: ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) )
            	    // InternalRosSystem.g:961:10: {...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalRosSystem.g:961:19: (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' )
            	    // InternalRosSystem.g:961:20: otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}'
            	    {
            	    otherlv_7=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0_0());
            	    								
            	    otherlv_8=(Token)match(input,23,FOLLOW_26); 

            	    									newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_0_1());
            	    								
            	    // InternalRosSystem.g:969:9: ( (lv_rospublisher_9_0= ruleRosPublisher ) )
            	    // InternalRosSystem.g:970:10: (lv_rospublisher_9_0= ruleRosPublisher )
            	    {
            	    // InternalRosSystem.g:970:10: (lv_rospublisher_9_0= ruleRosPublisher )
            	    // InternalRosSystem.g:971:11: lv_rospublisher_9_0= ruleRosPublisher
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_0_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_rospublisher_9_0=ruleRosPublisher();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rospublisher",
            	    												lv_rospublisher_9_0,
            	    												"de.fraunhofer.ipa.rossystem.RosSystem.RosPublisher");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRosSystem.g:988:9: (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==27) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:989:10: otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,27,FOLLOW_26); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_0_3_0());
            	    	    									
            	    	    // InternalRosSystem.g:993:10: ( (lv_rospublisher_11_0= ruleRosPublisher ) )
            	    	    // InternalRosSystem.g:994:11: (lv_rospublisher_11_0= ruleRosPublisher )
            	    	    {
            	    	    // InternalRosSystem.g:994:11: (lv_rospublisher_11_0= ruleRosPublisher )
            	    	    // InternalRosSystem.g:995:12: lv_rospublisher_11_0= ruleRosPublisher
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_0_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_rospublisher_11_0=ruleRosPublisher();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rospublisher",
            	    	    													lv_rospublisher_11_0,
            	    	    													"de.fraunhofer.ipa.rossystem.RosSystem.RosPublisher");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,30,FOLLOW_25); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystem.g:1023:4: ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:1023:4: ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) )
            	    // InternalRosSystem.g:1024:5: {...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalRosSystem.g:1024:115: ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) )
            	    // InternalRosSystem.g:1025:6: ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalRosSystem.g:1028:9: ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) )
            	    // InternalRosSystem.g:1028:10: {...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalRosSystem.g:1028:19: (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' )
            	    // InternalRosSystem.g:1028:20: otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}'
            	    {
            	    otherlv_13=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_1_0());
            	    								
            	    otherlv_14=(Token)match(input,23,FOLLOW_27); 

            	    									newLeafNode(otherlv_14, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1_1());
            	    								
            	    // InternalRosSystem.g:1036:9: ( (lv_rossubscriber_15_0= ruleRosSubscriber ) )
            	    // InternalRosSystem.g:1037:10: (lv_rossubscriber_15_0= ruleRosSubscriber )
            	    {
            	    // InternalRosSystem.g:1037:10: (lv_rossubscriber_15_0= ruleRosSubscriber )
            	    // InternalRosSystem.g:1038:11: lv_rossubscriber_15_0= ruleRosSubscriber
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_1_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_rossubscriber_15_0=ruleRosSubscriber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rossubscriber",
            	    												lv_rossubscriber_15_0,
            	    												"de.fraunhofer.ipa.rossystem.RosSystem.RosSubscriber");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRosSystem.g:1055:9: (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==27) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:1056:10: otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,27,FOLLOW_27); 

            	    	    										newLeafNode(otherlv_16, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_1_3_0());
            	    	    									
            	    	    // InternalRosSystem.g:1060:10: ( (lv_rossubscriber_17_0= ruleRosSubscriber ) )
            	    	    // InternalRosSystem.g:1061:11: (lv_rossubscriber_17_0= ruleRosSubscriber )
            	    	    {
            	    	    // InternalRosSystem.g:1061:11: (lv_rossubscriber_17_0= ruleRosSubscriber )
            	    	    // InternalRosSystem.g:1062:12: lv_rossubscriber_17_0= ruleRosSubscriber
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_rossubscriber_17_0=ruleRosSubscriber();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rossubscriber",
            	    	    													lv_rossubscriber_17_0,
            	    	    													"de.fraunhofer.ipa.rossystem.RosSystem.RosSubscriber");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,30,FOLLOW_25); 

            	    									newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystem.g:1090:4: ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:1090:4: ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) )
            	    // InternalRosSystem.g:1091:5: {...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalRosSystem.g:1091:115: ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) )
            	    // InternalRosSystem.g:1092:6: ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalRosSystem.g:1095:9: ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) )
            	    // InternalRosSystem.g:1095:10: {...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalRosSystem.g:1095:19: (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' )
            	    // InternalRosSystem.g:1095:20: otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}'
            	    {
            	    otherlv_19=(Token)match(input,44,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_5_2_0());
            	    								
            	    otherlv_20=(Token)match(input,23,FOLLOW_28); 

            	    									newLeafNode(otherlv_20, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_2_1());
            	    								
            	    // InternalRosSystem.g:1103:9: ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) )
            	    // InternalRosSystem.g:1104:10: (lv_rosserviceserver_21_0= ruleRosServiceServer )
            	    {
            	    // InternalRosSystem.g:1104:10: (lv_rosserviceserver_21_0= ruleRosServiceServer )
            	    // InternalRosSystem.g:1105:11: lv_rosserviceserver_21_0= ruleRosServiceServer
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_5_2_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_rosserviceserver_21_0=ruleRosServiceServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosserviceserver",
            	    												lv_rosserviceserver_21_0,
            	    												"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRosSystem.g:1122:9: (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==27) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:1123:10: otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,27,FOLLOW_28); 

            	    	    										newLeafNode(otherlv_22, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_2_3_0());
            	    	    									
            	    	    // InternalRosSystem.g:1127:10: ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) )
            	    	    // InternalRosSystem.g:1128:11: (lv_rosserviceserver_23_0= ruleRosServiceServer )
            	    	    {
            	    	    // InternalRosSystem.g:1128:11: (lv_rosserviceserver_23_0= ruleRosServiceServer )
            	    	    // InternalRosSystem.g:1129:12: lv_rosserviceserver_23_0= ruleRosServiceServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_5_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_rosserviceserver_23_0=ruleRosServiceServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosserviceserver",
            	    	    													lv_rosserviceserver_23_0,
            	    	    													"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceServer");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,30,FOLLOW_25); 

            	    									newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRosSystem.g:1157:4: ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:1157:4: ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) )
            	    // InternalRosSystem.g:1158:5: {...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalRosSystem.g:1158:115: ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) )
            	    // InternalRosSystem.g:1159:6: ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalRosSystem.g:1162:9: ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) )
            	    // InternalRosSystem.g:1162:10: {...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalRosSystem.g:1162:19: (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' )
            	    // InternalRosSystem.g:1162:20: otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}'
            	    {
            	    otherlv_25=(Token)match(input,45,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_5_3_0());
            	    								
            	    otherlv_26=(Token)match(input,23,FOLLOW_29); 

            	    									newLeafNode(otherlv_26, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_3_1());
            	    								
            	    // InternalRosSystem.g:1170:9: ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) )
            	    // InternalRosSystem.g:1171:10: (lv_rosserviceclient_27_0= ruleRosServiceClient )
            	    {
            	    // InternalRosSystem.g:1171:10: (lv_rosserviceclient_27_0= ruleRosServiceClient )
            	    // InternalRosSystem.g:1172:11: lv_rosserviceclient_27_0= ruleRosServiceClient
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_5_3_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_rosserviceclient_27_0=ruleRosServiceClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosserviceclient",
            	    												lv_rosserviceclient_27_0,
            	    												"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRosSystem.g:1189:9: (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==27) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:1190:10: otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) )
            	    	    {
            	    	    otherlv_28=(Token)match(input,27,FOLLOW_29); 

            	    	    										newLeafNode(otherlv_28, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_3_0());
            	    	    									
            	    	    // InternalRosSystem.g:1194:10: ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) )
            	    	    // InternalRosSystem.g:1195:11: (lv_rosserviceclient_29_0= ruleRosServiceClient )
            	    	    {
            	    	    // InternalRosSystem.g:1195:11: (lv_rosserviceclient_29_0= ruleRosServiceClient )
            	    	    // InternalRosSystem.g:1196:12: lv_rosserviceclient_29_0= ruleRosServiceClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_5_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_rosserviceclient_29_0=ruleRosServiceClient();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosserviceclient",
            	    	    													lv_rosserviceclient_29_0,
            	    	    													"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceClient");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    otherlv_30=(Token)match(input,30,FOLLOW_25); 

            	    									newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRosSystem.g:1224:4: ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:1224:4: ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) )
            	    // InternalRosSystem.g:1225:5: {...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalRosSystem.g:1225:115: ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) )
            	    // InternalRosSystem.g:1226:6: ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalRosSystem.g:1229:9: ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) )
            	    // InternalRosSystem.g:1229:10: {...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalRosSystem.g:1229:19: (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' )
            	    // InternalRosSystem.g:1229:20: otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}'
            	    {
            	    otherlv_31=(Token)match(input,46,FOLLOW_3); 

            	    									newLeafNode(otherlv_31, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_5_4_0());
            	    								
            	    otherlv_32=(Token)match(input,23,FOLLOW_30); 

            	    									newLeafNode(otherlv_32, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_4_1());
            	    								
            	    // InternalRosSystem.g:1237:9: ( (lv_rosactionserver_33_0= ruleRosActionServer ) )
            	    // InternalRosSystem.g:1238:10: (lv_rosactionserver_33_0= ruleRosActionServer )
            	    {
            	    // InternalRosSystem.g:1238:10: (lv_rosactionserver_33_0= ruleRosActionServer )
            	    // InternalRosSystem.g:1239:11: lv_rosactionserver_33_0= ruleRosActionServer
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_5_4_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_rosactionserver_33_0=ruleRosActionServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosactionserver",
            	    												lv_rosactionserver_33_0,
            	    												"de.fraunhofer.ipa.rossystem.RosSystem.RosActionServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRosSystem.g:1256:9: (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==27) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:1257:10: otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) )
            	    	    {
            	    	    otherlv_34=(Token)match(input,27,FOLLOW_30); 

            	    	    										newLeafNode(otherlv_34, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_4_3_0());
            	    	    									
            	    	    // InternalRosSystem.g:1261:10: ( (lv_rosactionserver_35_0= ruleRosActionServer ) )
            	    	    // InternalRosSystem.g:1262:11: (lv_rosactionserver_35_0= ruleRosActionServer )
            	    	    {
            	    	    // InternalRosSystem.g:1262:11: (lv_rosactionserver_35_0= ruleRosActionServer )
            	    	    // InternalRosSystem.g:1263:12: lv_rosactionserver_35_0= ruleRosActionServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_5_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_rosactionserver_35_0=ruleRosActionServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosactionserver",
            	    	    													lv_rosactionserver_35_0,
            	    	    													"de.fraunhofer.ipa.rossystem.RosSystem.RosActionServer");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    otherlv_36=(Token)match(input,30,FOLLOW_25); 

            	    									newLeafNode(otherlv_36, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRosSystem.g:1291:4: ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:1291:4: ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) )
            	    // InternalRosSystem.g:1292:5: {...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalRosSystem.g:1292:115: ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) )
            	    // InternalRosSystem.g:1293:6: ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5);
            	    					
            	    // InternalRosSystem.g:1296:9: ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) )
            	    // InternalRosSystem.g:1296:10: {...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalRosSystem.g:1296:19: (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' )
            	    // InternalRosSystem.g:1296:20: otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}'
            	    {
            	    otherlv_37=(Token)match(input,47,FOLLOW_3); 

            	    									newLeafNode(otherlv_37, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_5_5_0());
            	    								
            	    otherlv_38=(Token)match(input,23,FOLLOW_31); 

            	    									newLeafNode(otherlv_38, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_5_1());
            	    								
            	    // InternalRosSystem.g:1304:9: ( (lv_rosactionclient_39_0= ruleRosActionClient ) )
            	    // InternalRosSystem.g:1305:10: (lv_rosactionclient_39_0= ruleRosActionClient )
            	    {
            	    // InternalRosSystem.g:1305:10: (lv_rosactionclient_39_0= ruleRosActionClient )
            	    // InternalRosSystem.g:1306:11: lv_rosactionclient_39_0= ruleRosActionClient
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_5_5_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_rosactionclient_39_0=ruleRosActionClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosactionclient",
            	    												lv_rosactionclient_39_0,
            	    												"de.fraunhofer.ipa.rossystem.RosSystem.RosActionClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRosSystem.g:1323:9: (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==27) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:1324:10: otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) )
            	    	    {
            	    	    otherlv_40=(Token)match(input,27,FOLLOW_31); 

            	    	    										newLeafNode(otherlv_40, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_5_3_0());
            	    	    									
            	    	    // InternalRosSystem.g:1328:10: ( (lv_rosactionclient_41_0= ruleRosActionClient ) )
            	    	    // InternalRosSystem.g:1329:11: (lv_rosactionclient_41_0= ruleRosActionClient )
            	    	    {
            	    	    // InternalRosSystem.g:1329:11: (lv_rosactionclient_41_0= ruleRosActionClient )
            	    	    // InternalRosSystem.g:1330:12: lv_rosactionclient_41_0= ruleRosActionClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_5_5_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_rosactionclient_41_0=ruleRosActionClient();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosactionclient",
            	    	    													lv_rosactionclient_41_0,
            	    	    													"de.fraunhofer.ipa.rossystem.RosSystem.RosActionClient");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    otherlv_42=(Token)match(input,30,FOLLOW_25); 

            	    									newLeafNode(otherlv_42, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRosSystem.g:1358:4: ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) )
            	    {
            	    // InternalRosSystem.g:1358:4: ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) )
            	    // InternalRosSystem.g:1359:5: {...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // InternalRosSystem.g:1359:115: ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) )
            	    // InternalRosSystem.g:1360:6: ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6);
            	    					
            	    // InternalRosSystem.g:1363:9: ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) )
            	    // InternalRosSystem.g:1363:10: {...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalRosSystem.g:1363:19: (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' )
            	    // InternalRosSystem.g:1363:20: otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}'
            	    {
            	    otherlv_43=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_43, grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_5_6_0());
            	    								
            	    otherlv_44=(Token)match(input,23,FOLLOW_32); 

            	    									newLeafNode(otherlv_44, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_6_1());
            	    								
            	    // InternalRosSystem.g:1371:9: ( (lv_rosparameter_45_0= ruleRosParameter ) )
            	    // InternalRosSystem.g:1372:10: (lv_rosparameter_45_0= ruleRosParameter )
            	    {
            	    // InternalRosSystem.g:1372:10: (lv_rosparameter_45_0= ruleRosParameter )
            	    // InternalRosSystem.g:1373:11: lv_rosparameter_45_0= ruleRosParameter
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_5_6_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_rosparameter_45_0=ruleRosParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosparameter",
            	    												lv_rosparameter_45_0,
            	    												"de.fraunhofer.ipa.rossystem.RosSystem.RosParameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRosSystem.g:1390:9: (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==27) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalRosSystem.g:1391:10: otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) )
            	    	    {
            	    	    otherlv_46=(Token)match(input,27,FOLLOW_32); 

            	    	    										newLeafNode(otherlv_46, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_6_3_0());
            	    	    									
            	    	    // InternalRosSystem.g:1395:10: ( (lv_rosparameter_47_0= ruleRosParameter ) )
            	    	    // InternalRosSystem.g:1396:11: (lv_rosparameter_47_0= ruleRosParameter )
            	    	    {
            	    	    // InternalRosSystem.g:1396:11: (lv_rosparameter_47_0= ruleRosParameter )
            	    	    // InternalRosSystem.g:1397:12: lv_rosparameter_47_0= ruleRosParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_5_6_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_rosparameter_47_0=ruleRosParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosparameter",
            	    	    													lv_rosparameter_47_0,
            	    	    													"de.fraunhofer.ipa.rossystem.RosSystem.RosParameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);

            	    otherlv_48=(Token)match(input,30,FOLLOW_25); 

            	    									newLeafNode(otherlv_48, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            				

            }

            otherlv_49=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_49, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalRosSystem.g:1440:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalRosSystem.g:1440:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalRosSystem.g:1441:2: iv_ruleRosPublisher= ruleRosPublisher EOF
            {
             newCompositeNode(grammarAccess.getRosPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosPublisher=ruleRosPublisher();

            state._fsp--;

             current =iv_ruleRosPublisher; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosPublisher"


    // $ANTLR start "ruleRosPublisher"
    // InternalRosSystem.g:1447:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosPublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1453:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1454:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1454:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1455:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1455:3: ()
            // InternalRosSystem.g:1456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalRosSystem.g:1466:3: ( (lv_name_2_0= ruleEString ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:1467:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1467:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1468:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosPublisherAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1489:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystem.g:1490:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1494:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1495:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1495:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1496:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,51,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5());
            		
            // InternalRosSystem.g:1518:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1519:4: ( ruleEString )
            {
            // InternalRosSystem.g:1519:4: ( ruleEString )
            // InternalRosSystem.g:1520:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosPublisher"


    // $ANTLR start "entryRuleRosSubscriber"
    // InternalRosSystem.g:1542:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalRosSystem.g:1542:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalRosSystem.g:1543:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
            {
             newCompositeNode(grammarAccess.getRosSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSubscriber=ruleRosSubscriber();

            state._fsp--;

             current =iv_ruleRosSubscriber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSubscriber"


    // $ANTLR start "ruleRosSubscriber"
    // InternalRosSystem.g:1549:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1555:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1556:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1556:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1557:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1557:3: ()
            // InternalRosSystem.g:1558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalRosSystem.g:1568:3: ( (lv_name_2_0= ruleEString ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystem.g:1569:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1569:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1570:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosSubscriberAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1591:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystem.g:1592:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1596:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1597:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1597:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1598:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5());
            		
            // InternalRosSystem.g:1620:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1621:4: ( ruleEString )
            {
            // InternalRosSystem.g:1621:4: ( ruleEString )
            // InternalRosSystem.g:1622:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSubscriber"


    // $ANTLR start "entryRuleRosServiceServer"
    // InternalRosSystem.g:1644:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalRosSystem.g:1644:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalRosSystem.g:1645:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
            {
             newCompositeNode(grammarAccess.getRosServiceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceServer=ruleRosServiceServer();

            state._fsp--;

             current =iv_ruleRosServiceServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceServer"


    // $ANTLR start "ruleRosServiceServer"
    // InternalRosSystem.g:1651:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1657:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1658:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1658:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1659:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1659:3: ()
            // InternalRosSystem.g:1660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalRosSystem.g:1670:3: ( (lv_name_2_0= ruleEString ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystem.g:1671:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1671:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1672:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosServiceServerAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1693:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:1694:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1698:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1699:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1699:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1700:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5());
            		
            // InternalRosSystem.g:1722:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1723:4: ( ruleEString )
            {
            // InternalRosSystem.g:1723:4: ( ruleEString )
            // InternalRosSystem.g:1724:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceServer"


    // $ANTLR start "entryRuleRosServiceClient"
    // InternalRosSystem.g:1746:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalRosSystem.g:1746:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalRosSystem.g:1747:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
            {
             newCompositeNode(grammarAccess.getRosServiceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceClient=ruleRosServiceClient();

            state._fsp--;

             current =iv_ruleRosServiceClient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceClient"


    // $ANTLR start "ruleRosServiceClient"
    // InternalRosSystem.g:1753:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1759:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1760:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1760:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1761:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1761:3: ()
            // InternalRosSystem.g:1762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalRosSystem.g:1772:3: ( (lv_name_2_0= ruleEString ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystem.g:1773:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1773:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1774:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosServiceClientAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1795:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRosSystem.g:1796:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1800:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1801:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1801:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1802:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5());
            		
            // InternalRosSystem.g:1824:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1825:4: ( ruleEString )
            {
            // InternalRosSystem.g:1825:4: ( ruleEString )
            // InternalRosSystem.g:1826:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceClient"


    // $ANTLR start "entryRuleRosActionServer"
    // InternalRosSystem.g:1848:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalRosSystem.g:1848:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalRosSystem.g:1849:2: iv_ruleRosActionServer= ruleRosActionServer EOF
            {
             newCompositeNode(grammarAccess.getRosActionServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosActionServer=ruleRosActionServer();

            state._fsp--;

             current =iv_ruleRosActionServer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionServer"


    // $ANTLR start "ruleRosActionServer"
    // InternalRosSystem.g:1855:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosActionServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1861:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1862:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1862:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1863:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1863:3: ()
            // InternalRosSystem.g:1864:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalRosSystem.g:1874:3: ( (lv_name_2_0= ruleEString ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystem.g:1875:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1875:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1876:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosActionServerAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosActionServerRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1897:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosSystem.g:1898:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1902:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1903:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1903:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1904:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosActionServerRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,55,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionServerAccess().getRefServerKeyword_5());
            		
            // InternalRosSystem.g:1926:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1927:4: ( ruleEString )
            {
            // InternalRosSystem.g:1927:4: ( ruleEString )
            // InternalRosSystem.g:1928:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionServer"


    // $ANTLR start "entryRuleRosActionClient"
    // InternalRosSystem.g:1950:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalRosSystem.g:1950:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalRosSystem.g:1951:2: iv_ruleRosActionClient= ruleRosActionClient EOF
            {
             newCompositeNode(grammarAccess.getRosActionClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosActionClient=ruleRosActionClient();

            state._fsp--;

             current =iv_ruleRosActionClient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionClient"


    // $ANTLR start "ruleRosActionClient"
    // InternalRosSystem.g:1957:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleRosActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:1963:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1964:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1964:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1965:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1965:3: ()
            // InternalRosSystem.g:1966:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,59,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalRosSystem.g:1976:3: ( (lv_name_2_0= ruleEString ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosSystem.g:1977:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1977:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1978:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosActionClientAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosActionClientRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1999:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==50) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosSystem.g:2000:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:2004:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:2005:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:2005:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:2006:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosActionClientRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionClientAccess().getRefClientKeyword_5());
            		
            // InternalRosSystem.g:2028:3: ( ( ruleEString ) )
            // InternalRosSystem.g:2029:4: ( ruleEString )
            {
            // InternalRosSystem.g:2029:4: ( ruleEString )
            // InternalRosSystem.g:2030:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionClient"


    // $ANTLR start "entryRuleRosParameter"
    // InternalRosSystem.g:2052:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalRosSystem.g:2052:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalRosSystem.g:2053:2: iv_ruleRosParameter= ruleRosParameter EOF
            {
             newCompositeNode(grammarAccess.getRosParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosParameter=ruleRosParameter();

            state._fsp--;

             current =iv_ruleRosParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosParameter"


    // $ANTLR start "ruleRosParameter"
    // InternalRosSystem.g:2059:1: ruleRosParameter returns [EObject current=null] : ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleRosParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ns_5_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2065:2: ( ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalRosSystem.g:2066:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalRosSystem.g:2066:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalRosSystem.g:2067:3: () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            // InternalRosSystem.g:2067:3: ()
            // InternalRosSystem.g:2068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosParameterAccess().getRosParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getRosParameterKeyword_1());
            		
            // InternalRosSystem.g:2078:3: ( (lv_name_2_0= ruleEString ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRosSystem.g:2079:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:2079:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:2080:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:2101:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRosSystem.g:2102:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:2106:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:2107:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:2107:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:2108:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosParameterAccess().getRefParameterKeyword_5());
            		
            // InternalRosSystem.g:2130:3: ( ( ruleEString ) )
            // InternalRosSystem.g:2131:4: ( ruleEString )
            {
            // InternalRosSystem.g:2131:4: ( ruleEString )
            // InternalRosSystem.g:2132:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2146:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==62) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosSystem.g:2147:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_45); 

                    				newLeafNode(otherlv_8, grammarAccess.getRosParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalRosSystem.g:2151:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalRosSystem.g:2152:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalRosSystem.g:2152:5: (lv_value_9_0= ruleParameterValue )
                    // InternalRosSystem.g:2153:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_value_9_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRosParameterAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosParameter"


    // $ANTLR start "entryRuleParameter"
    // InternalRosSystem.g:2179:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRosSystem.g:2179:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRosSystem.g:2180:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRosSystem.g:2186:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2192:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalRosSystem.g:2193:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalRosSystem.g:2193:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalRosSystem.g:2194:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )? (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalRosSystem.g:2206:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRosSystem.g:2207:4: (lv_name_3_0= ruleEString )
            {
            // InternalRosSystem.g:2207:4: (lv_name_3_0= ruleEString )
            // InternalRosSystem.g:2208:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2225:3: (otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRosSystem.g:2226:4: otherlv_4= 'NameSpace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_47); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNameSpaceKeyword_4_0());
                    			
                    // InternalRosSystem.g:2230:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRosSystem.g:2231:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRosSystem.g:2231:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRosSystem.g:2232:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:2250:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==64) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRosSystem.g:2251:4: otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) )
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_49); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5_0());
                    			
                    // InternalRosSystem.g:2255:4: ( (lv_type_7_0= ruleParameterType ) )
                    // InternalRosSystem.g:2256:5: (lv_type_7_0= ruleParameterType )
                    {
                    // InternalRosSystem.g:2256:5: (lv_type_7_0= ruleParameterType )
                    // InternalRosSystem.g:2257:6: lv_type_7_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_type_7_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosSystem.g:2275:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==62) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRosSystem.g:2276:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_45); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getValueKeyword_6_0());
                    			
                    // InternalRosSystem.g:2280:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalRosSystem.g:2281:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalRosSystem.g:2281:5: (lv_value_9_0= ruleParameterValue )
                    // InternalRosSystem.g:2282:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_value_9_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterType"
    // InternalRosSystem.g:2308:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRosSystem.g:2308:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRosSystem.g:2309:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalRosSystem.g:2315:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterListType_0 = null;

        EObject this_ParameterStructType_1 = null;

        EObject this_ParameterIntegerType_2 = null;

        EObject this_ParameterStringType_3 = null;

        EObject this_ParameterDoubleType_4 = null;

        EObject this_ParameterBooleanType_5 = null;

        EObject this_ParameterBase64Type_6 = null;

        EObject this_ParameterArrayType_7 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2321:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRosSystem.g:2322:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRosSystem.g:2322:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt43=8;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt43=1;
                }
                break;
            case 66:
                {
                alt43=2;
                }
                break;
            case 67:
                {
                alt43=3;
                }
                break;
            case 69:
                {
                alt43=4;
                }
                break;
            case 70:
                {
                alt43=5;
                }
                break;
            case 71:
                {
                alt43=6;
                }
                break;
            case 72:
                {
                alt43=7;
                }
                break;
            case 73:
                {
                alt43=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalRosSystem.g:2323:3: this_ParameterListType_0= ruleParameterListType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_0=ruleParameterListType();

                    state._fsp--;


                    			current = this_ParameterListType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:2332:3: this_ParameterStructType_1= ruleParameterStructType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_1=ruleParameterStructType();

                    state._fsp--;


                    			current = this_ParameterStructType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystem.g:2341:3: this_ParameterIntegerType_2= ruleParameterIntegerType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_2=ruleParameterIntegerType();

                    state._fsp--;


                    			current = this_ParameterIntegerType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystem.g:2350:3: this_ParameterStringType_3= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_3=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystem.g:2359:3: this_ParameterDoubleType_4= ruleParameterDoubleType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_4=ruleParameterDoubleType();

                    state._fsp--;


                    			current = this_ParameterDoubleType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystem.g:2368:3: this_ParameterBooleanType_5= ruleParameterBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_5=ruleParameterBooleanType();

                    state._fsp--;


                    			current = this_ParameterBooleanType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystem.g:2377:3: this_ParameterBase64Type_6= ruleParameterBase64Type
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_6=ruleParameterBase64Type();

                    state._fsp--;


                    			current = this_ParameterBase64Type_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRosSystem.g:2386:3: this_ParameterArrayType_7= ruleParameterArrayType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_7=ruleParameterArrayType();

                    state._fsp--;


                    			current = this_ParameterArrayType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalRosSystem.g:2398:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRosSystem.g:2398:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRosSystem.g:2399:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalRosSystem.g:2405:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterString_0 = null;

        EObject this_ParameterBase64_1 = null;

        EObject this_ParameterInteger_2 = null;

        EObject this_ParameterDouble_3 = null;

        EObject this_ParameterBoolean_4 = null;

        EObject this_ParameterList_5 = null;

        EObject this_ParameterStruct_6 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2411:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRosSystem.g:2412:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRosSystem.g:2412:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt44=7;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalRosSystem.g:2413:3: this_ParameterString_0= ruleParameterString
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterString_0=ruleParameterString();

                    state._fsp--;


                    			current = this_ParameterString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:2422:3: this_ParameterBase64_1= ruleParameterBase64
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_1=ruleParameterBase64();

                    state._fsp--;


                    			current = this_ParameterBase64_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystem.g:2431:3: this_ParameterInteger_2= ruleParameterInteger
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_2=ruleParameterInteger();

                    state._fsp--;


                    			current = this_ParameterInteger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystem.g:2440:3: this_ParameterDouble_3= ruleParameterDouble
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_3=ruleParameterDouble();

                    state._fsp--;


                    			current = this_ParameterDouble_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystem.g:2449:3: this_ParameterBoolean_4= ruleParameterBoolean
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_4=ruleParameterBoolean();

                    state._fsp--;


                    			current = this_ParameterBoolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystem.g:2458:3: this_ParameterList_5= ruleParameterList
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterList_5=ruleParameterList();

                    state._fsp--;


                    			current = this_ParameterList_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystem.g:2467:3: this_ParameterStruct_6= ruleParameterStruct
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_6=ruleParameterStruct();

                    state._fsp--;


                    			current = this_ParameterStruct_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterListType"
    // InternalRosSystem.g:2479:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRosSystem.g:2479:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRosSystem.g:2480:2: iv_ruleParameterListType= ruleParameterListType EOF
            {
             newCompositeNode(grammarAccess.getParameterListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterListType=ruleParameterListType();

            state._fsp--;

             current =iv_ruleParameterListType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalRosSystem.g:2486:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleParameterListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sequence_3_0 = null;

        EObject lv_sequence_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2492:2: ( ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) )
            // InternalRosSystem.g:2493:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            {
            // InternalRosSystem.g:2493:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            // InternalRosSystem.g:2494:3: () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}'
            {
            // InternalRosSystem.g:2494:3: ()
            // InternalRosSystem.g:2495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:2509:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRosSystem.g:2510:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRosSystem.g:2510:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRosSystem.g:2511:5: lv_sequence_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_sequence_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            					}
            					add(
            						current,
            						"sequence",
            						lv_sequence_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2528:3: (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==27) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalRosSystem.g:2529:4: otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_49); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosSystem.g:2533:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRosSystem.g:2534:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRosSystem.g:2534:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRosSystem.g:2535:6: lv_sequence_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_sequence_5_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sequence",
            	    							lv_sequence_5_0,
            	    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalRosSystem.g:2561:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRosSystem.g:2561:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRosSystem.g:2562:2: iv_ruleParameterStructType= ruleParameterStructType EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructType=ruleParameterStructType();

            state._fsp--;

             current =iv_ruleParameterStructType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalRosSystem.g:2568:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleParameterStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterstructypetmember_3_0 = null;

        EObject lv_parameterstructypetmember_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2574:2: ( ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) )
            // InternalRosSystem.g:2575:2: ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            {
            // InternalRosSystem.g:2575:2: ( () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            // InternalRosSystem.g:2576:3: () otherlv_1= 'Struc' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}'
            {
            // InternalRosSystem.g:2576:3: ()
            // InternalRosSystem.g:2577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStrucKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:2591:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRosSystem.g:2592:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRosSystem.g:2592:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRosSystem.g:2593:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_parameterstructypetmember_3_0=ruleParameterStructTypeMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            					}
            					add(
            						current,
            						"parameterstructypetmember",
            						lv_parameterstructypetmember_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructTypeMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:2610:3: (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==27) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalRosSystem.g:2611:4: otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosSystem.g:2615:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRosSystem.g:2616:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRosSystem.g:2616:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRosSystem.g:2617:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameterstructypetmember",
            	    							lv_parameterstructypetmember_5_0,
            	    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructTypeMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalRosSystem.g:2643:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRosSystem.g:2643:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRosSystem.g:2644:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterIntegerType=ruleParameterIntegerType();

            state._fsp--;

             current =iv_ruleParameterIntegerType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalRosSystem.g:2650:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2656:2: ( ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2657:2: ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2657:2: ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2658:3: () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2658:3: ()
            // InternalRosSystem.g:2659:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRosSystem.g:2669:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==23) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRosSystem.g:2670:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,68,FOLLOW_52); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2678:4: ( (lv_default_4_0= ruleParameterInteger ) )
                    // InternalRosSystem.g:2679:5: (lv_default_4_0= ruleParameterInteger )
                    {
                    // InternalRosSystem.g:2679:5: (lv_default_4_0= ruleParameterInteger )
                    // InternalRosSystem.g:2680:6: lv_default_4_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_default_4_0=ruleParameterInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterIntegerTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalRosSystem.g:2706:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRosSystem.g:2706:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRosSystem.g:2707:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
             newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;

             current =iv_ruleParameterStringType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalRosSystem.g:2713:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2719:2: ( ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2720:2: ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2720:2: ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2721:3: () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2721:3: ()
            // InternalRosSystem.g:2722:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRosSystem.g:2732:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==23) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRosSystem.g:2733:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,68,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2741:4: ( (lv_default_4_0= ruleParameterString ) )
                    // InternalRosSystem.g:2742:5: (lv_default_4_0= ruleParameterString )
                    {
                    // InternalRosSystem.g:2742:5: (lv_default_4_0= ruleParameterString )
                    // InternalRosSystem.g:2743:6: lv_default_4_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_default_4_0=ruleParameterString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterStringTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalRosSystem.g:2769:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRosSystem.g:2769:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRosSystem.g:2770:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDoubleType=ruleParameterDoubleType();

            state._fsp--;

             current =iv_ruleParameterDoubleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalRosSystem.g:2776:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2782:2: ( ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2783:2: ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2783:2: ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2784:3: () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2784:3: ()
            // InternalRosSystem.g:2785:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRosSystem.g:2795:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==23) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRosSystem.g:2796:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,68,FOLLOW_53); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2804:4: ( (lv_default_4_0= ruleParameterDouble ) )
                    // InternalRosSystem.g:2805:5: (lv_default_4_0= ruleParameterDouble )
                    {
                    // InternalRosSystem.g:2805:5: (lv_default_4_0= ruleParameterDouble )
                    // InternalRosSystem.g:2806:6: lv_default_4_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_default_4_0=ruleParameterDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterDoubleTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalRosSystem.g:2832:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRosSystem.g:2832:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRosSystem.g:2833:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBooleanType=ruleParameterBooleanType();

            state._fsp--;

             current =iv_ruleParameterBooleanType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalRosSystem.g:2839:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2845:2: ( ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2846:2: ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2846:2: ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2847:3: () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2847:3: ()
            // InternalRosSystem.g:2848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRosSystem.g:2858:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==23) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRosSystem.g:2859:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,68,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2867:4: ( (lv_default_4_0= ruleParameterBoolean ) )
                    // InternalRosSystem.g:2868:5: (lv_default_4_0= ruleParameterBoolean )
                    {
                    // InternalRosSystem.g:2868:5: (lv_default_4_0= ruleParameterBoolean )
                    // InternalRosSystem.g:2869:6: lv_default_4_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_default_4_0=ruleParameterBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterBooleanTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalRosSystem.g:2895:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRosSystem.g:2895:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRosSystem.g:2896:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64TypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64Type=ruleParameterBase64Type();

            state._fsp--;

             current =iv_ruleParameterBase64Type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalRosSystem.g:2902:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2908:2: ( ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? ) )
            // InternalRosSystem.g:2909:2: ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? )
            {
            // InternalRosSystem.g:2909:2: ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? )
            // InternalRosSystem.g:2910:3: () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )?
            {
            // InternalRosSystem.g:2910:3: ()
            // InternalRosSystem.g:2911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRosSystem.g:2921:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==23) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRosSystem.g:2922:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,68,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRosSystem.g:2930:4: ( (lv_default_4_0= ruleParameterBase64 ) )
                    // InternalRosSystem.g:2931:5: (lv_default_4_0= ruleParameterBase64 )
                    {
                    // InternalRosSystem.g:2931:5: (lv_default_4_0= ruleParameterBase64 )
                    // InternalRosSystem.g:2932:6: lv_default_4_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_default_4_0=ruleParameterBase64();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterBase64");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterBase64TypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalRosSystem.g:2958:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRosSystem.g:2958:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRosSystem.g:2959:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
            {
             newCompositeNode(grammarAccess.getParameterArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterArrayType=ruleParameterArrayType();

            state._fsp--;

             current =iv_ruleParameterArrayType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalRosSystem.g:2965:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:2971:2: ( (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) )
            // InternalRosSystem.g:2972:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            {
            // InternalRosSystem.g:2972:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            // InternalRosSystem.g:2973:3: otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,64,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRosSystem.g:2985:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRosSystem.g:2986:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRosSystem.g:2986:4: (lv_type_3_0= ruleParameterType )
            // InternalRosSystem.g:2987:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_57);
            lv_type_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:3004:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==68) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRosSystem.g:3005:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRosSystem.g:3009:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalRosSystem.g:3010:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalRosSystem.g:3010:5: (lv_default_5_0= ruleParameterList )
                    // InternalRosSystem.g:3011:6: lv_default_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_default_5_0=ruleParameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterArrayTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalRosSystem.g:3037:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRosSystem.g:3037:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRosSystem.g:3038:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalRosSystem.g:3044:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3050:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalRosSystem.g:3051:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalRosSystem.g:3051:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalRosSystem.g:3052:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalRosSystem.g:3052:3: ()
            // InternalRosSystem.g:3053:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosSystem.g:3063:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRosSystem.g:3064:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRosSystem.g:3064:4: (lv_value_2_0= ruleParameterValue )
            // InternalRosSystem.g:3065:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:3082:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==27) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalRosSystem.g:3083:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_45); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRosSystem.g:3087:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRosSystem.g:3088:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRosSystem.g:3088:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRosSystem.g:3089:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalRosSystem.g:3115:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRosSystem.g:3115:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRosSystem.g:3116:2: iv_ruleParameterAny= ruleParameterAny EOF
            {
             newCompositeNode(grammarAccess.getParameterAnyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterAny=ruleParameterAny();

            state._fsp--;

             current =iv_ruleParameterAny; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalRosSystem.g:3122:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3128:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRosSystem.g:3129:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRosSystem.g:3129:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRosSystem.g:3130:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRosSystem.g:3130:3: ()
            // InternalRosSystem.g:3131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:3145:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRosSystem.g:3146:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRosSystem.g:3150:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRosSystem.g:3151:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:3151:5: (lv_value_4_0= ruleEString )
                    // InternalRosSystem.g:3152:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAnyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalRosSystem.g:3178:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRosSystem.g:3178:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRosSystem.g:3179:2: iv_ruleParameterString= ruleParameterString EOF
            {
             newCompositeNode(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterString=ruleParameterString();

            state._fsp--;

             current =iv_ruleParameterString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalRosSystem.g:3185:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3191:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRosSystem.g:3192:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRosSystem.g:3192:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRosSystem.g:3193:3: (lv_value_0_0= ruleEString )
            {
            // InternalRosSystem.g:3193:3: (lv_value_0_0= ruleEString )
            // InternalRosSystem.g:3194:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterStringRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalRosSystem.g:3214:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRosSystem.g:3214:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRosSystem.g:3215:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64=ruleParameterBase64();

            state._fsp--;

             current =iv_ruleParameterBase64; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalRosSystem.g:3221:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3227:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRosSystem.g:3228:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRosSystem.g:3228:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRosSystem.g:3229:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRosSystem.g:3229:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRosSystem.g:3230:4: lv_value_0_0= ruleBase64Binary
            {

            				newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBase64Binary();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.Base64Binary");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalRosSystem.g:3250:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRosSystem.g:3250:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRosSystem.g:3251:2: iv_ruleParameterInteger= ruleParameterInteger EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterInteger=ruleParameterInteger();

            state._fsp--;

             current =iv_ruleParameterInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalRosSystem.g:3257:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3263:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRosSystem.g:3264:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRosSystem.g:3264:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRosSystem.g:3265:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRosSystem.g:3265:3: (lv_value_0_0= ruleInteger0 )
            // InternalRosSystem.g:3266:4: lv_value_0_0= ruleInteger0
            {

            				newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInteger0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.Integer0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalRosSystem.g:3286:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRosSystem.g:3286:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRosSystem.g:3287:2: iv_ruleParameterDouble= ruleParameterDouble EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDouble=ruleParameterDouble();

            state._fsp--;

             current =iv_ruleParameterDouble; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalRosSystem.g:3293:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3299:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRosSystem.g:3300:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRosSystem.g:3300:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRosSystem.g:3301:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRosSystem.g:3301:3: (lv_value_0_0= ruleDouble0 )
            // InternalRosSystem.g:3302:4: lv_value_0_0= ruleDouble0
            {

            				newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDouble0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.Double0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalRosSystem.g:3322:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRosSystem.g:3322:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRosSystem.g:3323:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBoolean=ruleParameterBoolean();

            state._fsp--;

             current =iv_ruleParameterBoolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalRosSystem.g:3329:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3335:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRosSystem.g:3336:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRosSystem.g:3336:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRosSystem.g:3337:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRosSystem.g:3337:3: (lv_value_0_0= ruleboolean0 )
            // InternalRosSystem.g:3338:4: lv_value_0_0= ruleboolean0
            {

            				newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleboolean0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.boolean0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterDate"
    // InternalRosSystem.g:3358:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRosSystem.g:3358:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRosSystem.g:3359:2: iv_ruleParameterDate= ruleParameterDate EOF
            {
             newCompositeNode(grammarAccess.getParameterDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDate=ruleParameterDate();

            state._fsp--;

             current =iv_ruleParameterDate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalRosSystem.g:3365:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3371:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRosSystem.g:3372:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRosSystem.g:3372:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRosSystem.g:3373:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRosSystem.g:3373:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRosSystem.g:3374:4: lv_value_0_0= ruleDateTime0
            {

            				newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDateTime0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterDateRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.rossystem.RosSystem.DateTime0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalRosSystem.g:3394:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRosSystem.g:3394:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRosSystem.g:3395:2: iv_ruleParameterStruct= ruleParameterStruct EOF
            {
             newCompositeNode(grammarAccess.getParameterStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStruct=ruleParameterStruct();

            state._fsp--;

             current =iv_ruleParameterStruct; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalRosSystem.g:3401:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3407:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalRosSystem.g:3408:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalRosSystem.g:3408:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalRosSystem.g:3409:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalRosSystem.g:3409:3: ()
            // InternalRosSystem.g:3410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRosSystem.g:3416:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==23) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRosSystem.g:3417:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalRosSystem.g:3421:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRosSystem.g:3422:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRosSystem.g:3422:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRosSystem.g:3423:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_2_0=ruleParameterStructMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:3440:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==27) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalRosSystem.g:3441:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalRosSystem.g:3449:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRosSystem.g:3450:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRosSystem.g:3450:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRosSystem.g:3451:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_value_5_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_5_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,30,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalRosSystem.g:3482:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRosSystem.g:3482:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRosSystem.g:3483:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructMember=ruleParameterStructMember();

            state._fsp--;

             current =iv_ruleParameterStructMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalRosSystem.g:3489:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3495:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) )
            // InternalRosSystem.g:3496:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            {
            // InternalRosSystem.g:3496:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            // InternalRosSystem.g:3497:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}'
            {
            // InternalRosSystem.g:3497:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystem.g:3498:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystem.g:3498:4: (lv_name_0_0= ruleEString )
            // InternalRosSystem.g:3499:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,62,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getValueKeyword_2());
            		
            // InternalRosSystem.g:3524:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalRosSystem.g:3525:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalRosSystem.g:3525:4: (lv_value_3_0= ruleParameterValue )
            // InternalRosSystem.g:3526:5: lv_value_3_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_3_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalRosSystem.g:3551:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRosSystem.g:3551:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRosSystem.g:3552:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructTypeMember=ruleParameterStructTypeMember();

            state._fsp--;

             current =iv_ruleParameterStructTypeMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalRosSystem.g:3558:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3564:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRosSystem.g:3565:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRosSystem.g:3565:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRosSystem.g:3566:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRosSystem.g:3566:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystem.g:3567:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystem.g:3567:4: (lv_name_0_0= ruleEString )
            // InternalRosSystem.g:3568:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_49);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystem.g:3585:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRosSystem.g:3586:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRosSystem.g:3586:4: (lv_type_1_0= ruleParameterType )
            // InternalRosSystem.g:3587:5: lv_type_1_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.fraunhofer.ipa.rossystem.RosSystem.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalRosSystem.g:3608:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRosSystem.g:3608:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRosSystem.g:3609:2: iv_ruleBase64Binary= ruleBase64Binary EOF
            {
             newCompositeNode(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64Binary=ruleBase64Binary();

            state._fsp--;

             current =iv_ruleBase64Binary.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalRosSystem.g:3615:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3621:2: (this_BINARY_0= RULE_BINARY )
            // InternalRosSystem.g:3622:2: this_BINARY_0= RULE_BINARY
            {
            this_BINARY_0=(Token)match(input,RULE_BINARY,FOLLOW_2); 

            		current.merge(this_BINARY_0);
            	

            		newLeafNode(this_BINARY_0, grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalRosSystem.g:3632:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRosSystem.g:3632:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRosSystem.g:3633:2: iv_ruleboolean0= ruleboolean0 EOF
            {
             newCompositeNode(grammarAccess.getBoolean0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleboolean0=ruleboolean0();

            state._fsp--;

             current =iv_ruleboolean0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalRosSystem.g:3639:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3645:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRosSystem.g:3646:2: this_BOOLEAN_0= RULE_BOOLEAN
            {
            this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            		current.merge(this_BOOLEAN_0);
            	

            		newLeafNode(this_BOOLEAN_0, grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalRosSystem.g:3656:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRosSystem.g:3656:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRosSystem.g:3657:2: iv_ruleDouble0= ruleDouble0 EOF
            {
             newCompositeNode(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;

             current =iv_ruleDouble0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalRosSystem.g:3663:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3669:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRosSystem.g:3670:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            		current.merge(this_DOUBLE_0);
            	

            		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalRosSystem.g:3680:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRosSystem.g:3680:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRosSystem.g:3681:2: iv_ruleInteger0= ruleInteger0 EOF
            {
             newCompositeNode(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger0=ruleInteger0();

            state._fsp--;

             current =iv_ruleInteger0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalRosSystem.g:3687:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3693:2: (this_DECINT_0= RULE_DECINT )
            // InternalRosSystem.g:3694:2: this_DECINT_0= RULE_DECINT
            {
            this_DECINT_0=(Token)match(input,RULE_DECINT,FOLLOW_2); 

            		current.merge(this_DECINT_0);
            	

            		newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleDateTime0"
    // InternalRosSystem.g:3704:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRosSystem.g:3704:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRosSystem.g:3705:2: iv_ruleDateTime0= ruleDateTime0 EOF
            {
             newCompositeNode(grammarAccess.getDateTime0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime0=ruleDateTime0();

            state._fsp--;

             current =iv_ruleDateTime0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalRosSystem.g:3711:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRosSystem.g:3717:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRosSystem.g:3718:2: this_DATE_TIME_0= RULE_DATE_TIME
            {
            this_DATE_TIME_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_2); 

            		current.merge(this_DATE_TIME_0);
            	

            		newLeafNode(this_DATE_TIME_0, grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystem.g:3728:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRosSystem.g:3728:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRosSystem.g:3729:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalRosSystem.g:3735:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3741:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRosSystem.g:3742:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRosSystem.g:3742:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt57=1;
                }
                break;
            case 77:
                {
                alt57=2;
                }
                break;
            case 78:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalRosSystem.g:3743:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;


                    			current = this_GlobalNamespace_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:3752:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;


                    			current = this_RelativeNamespace_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystem.g:3761:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;


                    			current = this_PrivateNamespace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRosSystem.g:3773:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRosSystem.g:3773:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRosSystem.g:3774:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
             newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;

             current =iv_ruleGlobalNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalRosSystem.g:3780:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3786:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:3787:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:3787:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:3788:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:3788:3: ()
            // InternalRosSystem.g:3789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:3803:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==76) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRosSystem.g:3804:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:3812:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:3813:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:3813:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:3814:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:3831:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==27) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalRosSystem.g:3832:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_60); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:3836:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:3837:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:3837:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:3838:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalRosSystem.g:3869:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRosSystem.g:3869:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRosSystem.g:3870:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;

             current =iv_ruleRelativeNamespace_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalRosSystem.g:3876:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3882:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:3883:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:3883:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:3884:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:3884:3: ()
            // InternalRosSystem.g:3885:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:3899:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==76) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRosSystem.g:3900:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:3908:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:3909:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:3909:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:3910:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:3927:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==27) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalRosSystem.g:3928:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_60); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:3932:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:3933:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:3933:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:3934:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalRosSystem.g:3965:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRosSystem.g:3965:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRosSystem.g:3966:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
             newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;

             current =iv_rulePrivateNamespace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalRosSystem.g:3972:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:3978:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosSystem.g:3979:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosSystem.g:3979:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosSystem.g:3980:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosSystem.g:3980:3: ()
            // InternalRosSystem.g:3981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosSystem.g:3995:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==76) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRosSystem.g:3996:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosSystem.g:4004:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosSystem.g:4005:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosSystem.g:4005:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosSystem.g:4006:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:4023:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==27) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalRosSystem.g:4024:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_60); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosSystem.g:4028:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosSystem.g:4029:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystem.g:4029:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosSystem.g:4030:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,30,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalRosSystem.g:4061:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRosSystem.g:4061:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRosSystem.g:4062:2: iv_ruleGraphName= ruleGraphName EOF
            {
             newCompositeNode(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;

             current =iv_ruleGraphName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalRosSystem.g:4068:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosSystem.g:4074:2: (kw= 'GraphName' )
            // InternalRosSystem.g:4075:2: kw= 'GraphName'
            {
            kw=(Token)match(input,79,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphName"

    // Delegated rules


    protected DFA44 dfa44 = new DFA44(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\4\1\uffff\2\27\1\uffff";
    static final String dfa_4s = "\1\36\5\uffff\1\36\1\uffff\2\36\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\1\2\1\5\1\4\1\3\15\uffff\1\6\3\uffff\1\7\2\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\11\4\12\15\uffff\1\12\3\uffff\1\12\2\uffff\1\12",
            "",
            "\1\7\3\uffff\1\12\2\uffff\1\12",
            "\1\7\3\uffff\1\12\2\uffff\1\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2412:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003E2000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x8000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001FE0040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001FC0040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0204000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000040000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000008003F0L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x4000020040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000040000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003EEL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000040000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});

}
