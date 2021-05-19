package de.fraunhofer.ipa.componentInterface.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_DIGIT", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'NameSpace'", "'FromRosNode'", "'RosPublishers'", "','", "'}'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosParameters'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'", "'RosParameter'", "'RefParameter'", "'value'"
    };
    public static final int RULE_DAY=11;
    public static final int RULE_DATE_TIME=16;
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_YEAR=13;
    public static final int RULE_MIN_SEC=15;
    public static final int RULE_ID=5;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HOUR=14;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_MONTH=12;
    public static final int T__46=46;
    public static final int RULE_BINARY=6;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalComponentInterfaceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentInterfaceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentInterfaceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }



     	private ComponentInterfaceGrammarAccess grammarAccess;

        public InternalComponentInterfaceParser(TokenStream input, ComponentInterfaceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ComponentInterface";
       	}

       	@Override
       	protected ComponentInterfaceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleComponentInterface"
    // InternalComponentInterface.g:64:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalComponentInterface.g:64:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalComponentInterface.g:65:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) ) ) otherlv_51= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_5_0 = null;

        EObject lv_rospublisher_11_0 = null;

        EObject lv_rospublisher_13_0 = null;

        EObject lv_rossubscriber_17_0 = null;

        EObject lv_rossubscriber_19_0 = null;

        EObject lv_rosserviceserver_23_0 = null;

        EObject lv_rosserviceserver_25_0 = null;

        EObject lv_rosserviceclient_29_0 = null;

        EObject lv_rosserviceclient_31_0 = null;

        EObject lv_rosactionserver_35_0 = null;

        EObject lv_rosactionserver_37_0 = null;

        EObject lv_rosactionclient_41_0 = null;

        EObject lv_rosactionclient_43_0 = null;

        EObject lv_rosparameter_47_0 = null;

        EObject lv_rosparameter_49_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) ) ) otherlv_51= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) ) ) otherlv_51= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) ) ) otherlv_51= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) ) ) otherlv_51= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getNameKeyword_2());
            		
            // InternalComponentInterface.g:91:3: ( (lv_name_3_0= ruleEString ) )
            // InternalComponentInterface.g:92:4: (lv_name_3_0= ruleEString )
            {
            // InternalComponentInterface.g:92:4: (lv_name_3_0= ruleEString )
            // InternalComponentInterface.g:93:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:110:3: (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:111:4: otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0());
                    			
                    // InternalComponentInterface.g:115:4: ( (lv_NameSpace_5_0= ruleEString ) )
                    // InternalComponentInterface.g:116:5: (lv_NameSpace_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:116:5: (lv_NameSpace_5_0= ruleEString )
                    // InternalComponentInterface.g:117:6: lv_NameSpace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_NameSpace_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:135:3: (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:136:4: otherlv_6= 'FromRosNode' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getFromRosNodeKeyword_5_0());
                    			
                    // InternalComponentInterface.g:140:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:141:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:141:5: ( ruleEString )
                    // InternalComponentInterface.g:142:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getFromRosNodeNodeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:157:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) ) )
            // InternalComponentInterface.g:158:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) )
            {
            // InternalComponentInterface.g:158:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* ) )
            // InternalComponentInterface.g:159:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            				
            // InternalComponentInterface.g:162:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )* )
            // InternalComponentInterface.g:163:6: ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )*
            {
            // InternalComponentInterface.g:163:6: ( ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) ) )*
            loop10:
            do {
                int alt10=8;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
                    alt10=5;
                }
                else if ( LA10_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
                    alt10=6;
                }
                else if ( LA10_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
                    alt10=7;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentInterface.g:164:4: ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:164:4: ({...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) ) )
            	    // InternalComponentInterface.g:165:5: {...}? => ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalComponentInterface.g:165:115: ( ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) ) )
            	    // InternalComponentInterface.g:166:6: ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 0);
            	    					
            	    // InternalComponentInterface.g:169:9: ({...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' ) )
            	    // InternalComponentInterface.g:169:10: {...}? => (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:169:19: (otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}' )
            	    // InternalComponentInterface.g:169:20: otherlv_9= 'RosPublishers' otherlv_10= '{' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )* otherlv_14= '}'
            	    {
            	    otherlv_9=(Token)match(input,27,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_6_0_0());
            	    								
            	    otherlv_10=(Token)match(input,23,FOLLOW_9); 

            	    									newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_0_1());
            	    								
            	    // InternalComponentInterface.g:177:9: ( (lv_rospublisher_11_0= ruleRosPublisher ) )
            	    // InternalComponentInterface.g:178:10: (lv_rospublisher_11_0= ruleRosPublisher )
            	    {
            	    // InternalComponentInterface.g:178:10: (lv_rospublisher_11_0= ruleRosPublisher )
            	    // InternalComponentInterface.g:179:11: lv_rospublisher_11_0= ruleRosPublisher
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_0_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_rospublisher_11_0=ruleRosPublisher();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rospublisher",
            	    												lv_rospublisher_11_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:196:9: (otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==28) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:197:10: otherlv_12= ',' ( (lv_rospublisher_13_0= ruleRosPublisher ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,28,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_0_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:201:10: ( (lv_rospublisher_13_0= ruleRosPublisher ) )
            	    	    // InternalComponentInterface.g:202:11: (lv_rospublisher_13_0= ruleRosPublisher )
            	    	    {
            	    	    // InternalComponentInterface.g:202:11: (lv_rospublisher_13_0= ruleRosPublisher )
            	    	    // InternalComponentInterface.g:203:12: lv_rospublisher_13_0= ruleRosPublisher
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_0_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_rospublisher_13_0=ruleRosPublisher();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rospublisher",
            	    	    													lv_rospublisher_13_0,
            	    	    													"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_14=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentInterface.g:231:4: ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:231:4: ({...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) ) )
            	    // InternalComponentInterface.g:232:5: {...}? => ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalComponentInterface.g:232:115: ( ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) ) )
            	    // InternalComponentInterface.g:233:6: ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 1);
            	    					
            	    // InternalComponentInterface.g:236:9: ({...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' ) )
            	    // InternalComponentInterface.g:236:10: {...}? => (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:236:19: (otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}' )
            	    // InternalComponentInterface.g:236:20: otherlv_15= 'RosSubscribers' otherlv_16= '{' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )* otherlv_20= '}'
            	    {
            	    otherlv_15=(Token)match(input,30,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_1_0());
            	    								
            	    otherlv_16=(Token)match(input,23,FOLLOW_11); 

            	    									newLeafNode(otherlv_16, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1_1());
            	    								
            	    // InternalComponentInterface.g:244:9: ( (lv_rossubscriber_17_0= ruleRosSubscriber ) )
            	    // InternalComponentInterface.g:245:10: (lv_rossubscriber_17_0= ruleRosSubscriber )
            	    {
            	    // InternalComponentInterface.g:245:10: (lv_rossubscriber_17_0= ruleRosSubscriber )
            	    // InternalComponentInterface.g:246:11: lv_rossubscriber_17_0= ruleRosSubscriber
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_1_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_rossubscriber_17_0=ruleRosSubscriber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rossubscriber",
            	    												lv_rossubscriber_17_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:263:9: (otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==28) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:264:10: otherlv_18= ',' ( (lv_rossubscriber_19_0= ruleRosSubscriber ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,28,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_1_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:268:10: ( (lv_rossubscriber_19_0= ruleRosSubscriber ) )
            	    	    // InternalComponentInterface.g:269:11: (lv_rossubscriber_19_0= ruleRosSubscriber )
            	    	    {
            	    	    // InternalComponentInterface.g:269:11: (lv_rossubscriber_19_0= ruleRosSubscriber )
            	    	    // InternalComponentInterface.g:270:12: lv_rossubscriber_19_0= ruleRosSubscriber
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_rossubscriber_19_0=ruleRosSubscriber();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rossubscriber",
            	    	    													lv_rossubscriber_19_0,
            	    	    													"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentInterface.g:298:4: ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:298:4: ({...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) ) )
            	    // InternalComponentInterface.g:299:5: {...}? => ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalComponentInterface.g:299:115: ( ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) ) )
            	    // InternalComponentInterface.g:300:6: ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 2);
            	    					
            	    // InternalComponentInterface.g:303:9: ({...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' ) )
            	    // InternalComponentInterface.g:303:10: {...}? => (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:303:19: (otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}' )
            	    // InternalComponentInterface.g:303:20: otherlv_21= 'RosSrvServers' otherlv_22= '{' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )* otherlv_26= '}'
            	    {
            	    otherlv_21=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_2_0());
            	    								
            	    otherlv_22=(Token)match(input,23,FOLLOW_12); 

            	    									newLeafNode(otherlv_22, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_2_1());
            	    								
            	    // InternalComponentInterface.g:311:9: ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) )
            	    // InternalComponentInterface.g:312:10: (lv_rosserviceserver_23_0= ruleRosServiceServer )
            	    {
            	    // InternalComponentInterface.g:312:10: (lv_rosserviceserver_23_0= ruleRosServiceServer )
            	    // InternalComponentInterface.g:313:11: lv_rosserviceserver_23_0= ruleRosServiceServer
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_rosserviceserver_23_0=ruleRosServiceServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosserviceserver",
            	    												lv_rosserviceserver_23_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:330:9: (otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==28) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:331:10: otherlv_24= ',' ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,28,FOLLOW_12); 

            	    	    										newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_2_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:335:10: ( (lv_rosserviceserver_25_0= ruleRosServiceServer ) )
            	    	    // InternalComponentInterface.g:336:11: (lv_rosserviceserver_25_0= ruleRosServiceServer )
            	    	    {
            	    	    // InternalComponentInterface.g:336:11: (lv_rosserviceserver_25_0= ruleRosServiceServer )
            	    	    // InternalComponentInterface.g:337:12: lv_rosserviceserver_25_0= ruleRosServiceServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_rosserviceserver_25_0=ruleRosServiceServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosserviceserver",
            	    	    													lv_rosserviceserver_25_0,
            	    	    													"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_26=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_26, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComponentInterface.g:365:4: ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:365:4: ({...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) ) )
            	    // InternalComponentInterface.g:366:5: {...}? => ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalComponentInterface.g:366:115: ( ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) ) )
            	    // InternalComponentInterface.g:367:6: ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 3);
            	    					
            	    // InternalComponentInterface.g:370:9: ({...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' ) )
            	    // InternalComponentInterface.g:370:10: {...}? => (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:370:19: (otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}' )
            	    // InternalComponentInterface.g:370:20: otherlv_27= 'RosSrvClients' otherlv_28= '{' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )* otherlv_32= '}'
            	    {
            	    otherlv_27=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_6_3_0());
            	    								
            	    otherlv_28=(Token)match(input,23,FOLLOW_13); 

            	    									newLeafNode(otherlv_28, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_3_1());
            	    								
            	    // InternalComponentInterface.g:378:9: ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) )
            	    // InternalComponentInterface.g:379:10: (lv_rosserviceclient_29_0= ruleRosServiceClient )
            	    {
            	    // InternalComponentInterface.g:379:10: (lv_rosserviceclient_29_0= ruleRosServiceClient )
            	    // InternalComponentInterface.g:380:11: lv_rosserviceclient_29_0= ruleRosServiceClient
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_6_3_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_rosserviceclient_29_0=ruleRosServiceClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosserviceclient",
            	    												lv_rosserviceclient_29_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:397:9: (otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==28) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:398:10: otherlv_30= ',' ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) )
            	    	    {
            	    	    otherlv_30=(Token)match(input,28,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:402:10: ( (lv_rosserviceclient_31_0= ruleRosServiceClient ) )
            	    	    // InternalComponentInterface.g:403:11: (lv_rosserviceclient_31_0= ruleRosServiceClient )
            	    	    {
            	    	    // InternalComponentInterface.g:403:11: (lv_rosserviceclient_31_0= ruleRosServiceClient )
            	    	    // InternalComponentInterface.g:404:12: lv_rosserviceclient_31_0= ruleRosServiceClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_6_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_rosserviceclient_31_0=ruleRosServiceClient();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosserviceclient",
            	    	    													lv_rosserviceclient_31_0,
            	    	    													"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_32=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_32, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComponentInterface.g:432:4: ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:432:4: ({...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) ) )
            	    // InternalComponentInterface.g:433:5: {...}? => ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalComponentInterface.g:433:115: ( ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) ) )
            	    // InternalComponentInterface.g:434:6: ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 4);
            	    					
            	    // InternalComponentInterface.g:437:9: ({...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' ) )
            	    // InternalComponentInterface.g:437:10: {...}? => (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:437:19: (otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}' )
            	    // InternalComponentInterface.g:437:20: otherlv_33= 'RosActionServers' otherlv_34= '{' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )* otherlv_38= '}'
            	    {
            	    otherlv_33=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_33, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_6_4_0());
            	    								
            	    otherlv_34=(Token)match(input,23,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_4_1());
            	    								
            	    // InternalComponentInterface.g:445:9: ( (lv_rosactionserver_35_0= ruleRosActionServer ) )
            	    // InternalComponentInterface.g:446:10: (lv_rosactionserver_35_0= ruleRosActionServer )
            	    {
            	    // InternalComponentInterface.g:446:10: (lv_rosactionserver_35_0= ruleRosActionServer )
            	    // InternalComponentInterface.g:447:11: lv_rosactionserver_35_0= ruleRosActionServer
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_6_4_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_rosactionserver_35_0=ruleRosActionServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosactionserver",
            	    												lv_rosactionserver_35_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:464:9: (otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==28) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:465:10: otherlv_36= ',' ( (lv_rosactionserver_37_0= ruleRosActionServer ) )
            	    	    {
            	    	    otherlv_36=(Token)match(input,28,FOLLOW_14); 

            	    	    										newLeafNode(otherlv_36, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_4_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:469:10: ( (lv_rosactionserver_37_0= ruleRosActionServer ) )
            	    	    // InternalComponentInterface.g:470:11: (lv_rosactionserver_37_0= ruleRosActionServer )
            	    	    {
            	    	    // InternalComponentInterface.g:470:11: (lv_rosactionserver_37_0= ruleRosActionServer )
            	    	    // InternalComponentInterface.g:471:12: lv_rosactionserver_37_0= ruleRosActionServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_6_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_rosactionserver_37_0=ruleRosActionServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosactionserver",
            	    	    													lv_rosactionserver_37_0,
            	    	    													"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionServer");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_38=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_38, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComponentInterface.g:499:4: ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:499:4: ({...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) ) )
            	    // InternalComponentInterface.g:500:5: {...}? => ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalComponentInterface.g:500:115: ( ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) ) )
            	    // InternalComponentInterface.g:501:6: ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 5);
            	    					
            	    // InternalComponentInterface.g:504:9: ({...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' ) )
            	    // InternalComponentInterface.g:504:10: {...}? => (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:504:19: (otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}' )
            	    // InternalComponentInterface.g:504:20: otherlv_39= 'RosActionClients' otherlv_40= '{' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )* otherlv_44= '}'
            	    {
            	    otherlv_39=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_39, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_6_5_0());
            	    								
            	    otherlv_40=(Token)match(input,23,FOLLOW_15); 

            	    									newLeafNode(otherlv_40, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_5_1());
            	    								
            	    // InternalComponentInterface.g:512:9: ( (lv_rosactionclient_41_0= ruleRosActionClient ) )
            	    // InternalComponentInterface.g:513:10: (lv_rosactionclient_41_0= ruleRosActionClient )
            	    {
            	    // InternalComponentInterface.g:513:10: (lv_rosactionclient_41_0= ruleRosActionClient )
            	    // InternalComponentInterface.g:514:11: lv_rosactionclient_41_0= ruleRosActionClient
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_6_5_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_rosactionclient_41_0=ruleRosActionClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosactionclient",
            	    												lv_rosactionclient_41_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:531:9: (otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==28) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:532:10: otherlv_42= ',' ( (lv_rosactionclient_43_0= ruleRosActionClient ) )
            	    	    {
            	    	    otherlv_42=(Token)match(input,28,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_42, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_5_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:536:10: ( (lv_rosactionclient_43_0= ruleRosActionClient ) )
            	    	    // InternalComponentInterface.g:537:11: (lv_rosactionclient_43_0= ruleRosActionClient )
            	    	    {
            	    	    // InternalComponentInterface.g:537:11: (lv_rosactionclient_43_0= ruleRosActionClient )
            	    	    // InternalComponentInterface.g:538:12: lv_rosactionclient_43_0= ruleRosActionClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_6_5_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_rosactionclient_43_0=ruleRosActionClient();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosactionclient",
            	    	    													lv_rosactionclient_43_0,
            	    	    													"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionClient");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_44=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_44, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalComponentInterface.g:566:4: ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:566:4: ({...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) ) )
            	    // InternalComponentInterface.g:567:5: {...}? => ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalComponentInterface.g:567:115: ( ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) ) )
            	    // InternalComponentInterface.g:568:6: ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6(), 6);
            	    					
            	    // InternalComponentInterface.g:571:9: ({...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' ) )
            	    // InternalComponentInterface.g:571:10: {...}? => (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:571:19: (otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}' )
            	    // InternalComponentInterface.g:571:20: otherlv_45= 'RosParameters' otherlv_46= '{' ( (lv_rosparameter_47_0= ruleRosParameter ) ) (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )* otherlv_50= '}'
            	    {
            	    otherlv_45=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_45, grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_6_6_0());
            	    								
            	    otherlv_46=(Token)match(input,23,FOLLOW_16); 

            	    									newLeafNode(otherlv_46, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_6_1());
            	    								
            	    // InternalComponentInterface.g:579:9: ( (lv_rosparameter_47_0= ruleRosParameter ) )
            	    // InternalComponentInterface.g:580:10: (lv_rosparameter_47_0= ruleRosParameter )
            	    {
            	    // InternalComponentInterface.g:580:10: (lv_rosparameter_47_0= ruleRosParameter )
            	    // InternalComponentInterface.g:581:11: lv_rosparameter_47_0= ruleRosParameter
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_6_6_2_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_rosparameter_47_0=ruleRosParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosparameter",
            	    												lv_rosparameter_47_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosParameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:598:9: (otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==28) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:599:10: otherlv_48= ',' ( (lv_rosparameter_49_0= ruleRosParameter ) )
            	    	    {
            	    	    otherlv_48=(Token)match(input,28,FOLLOW_16); 

            	    	    										newLeafNode(otherlv_48, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_6_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:603:10: ( (lv_rosparameter_49_0= ruleRosParameter ) )
            	    	    // InternalComponentInterface.g:604:11: (lv_rosparameter_49_0= ruleRosParameter )
            	    	    {
            	    	    // InternalComponentInterface.g:604:11: (lv_rosparameter_49_0= ruleRosParameter )
            	    	    // InternalComponentInterface.g:605:12: lv_rosparameter_49_0= ruleRosParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_6_6_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_rosparameter_49_0=ruleRosParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"rosparameter",
            	    	    													lv_rosparameter_49_0,
            	    	    													"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosParameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_50=(Token)match(input,29,FOLLOW_8); 

            	    									newLeafNode(otherlv_50, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_6());
            				

            }

            otherlv_51=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_51, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalComponentInterface.g:648:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalComponentInterface.g:648:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalComponentInterface.g:649:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalComponentInterface.g:655:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:661:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:662:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:662:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:663:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:663:3: ()
            // InternalComponentInterface.g:664:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalComponentInterface.g:674:3: ( (lv_name_2_0= ruleEString ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:675:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:675:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:676:5: lv_name_2_0= ruleEString
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
                    						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:697:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:698:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:702:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:703:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:703:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:704:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5());
            		
            // InternalComponentInterface.g:726:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:727:4: ( ruleEString )
            {
            // InternalComponentInterface.g:727:4: ( ruleEString )
            // InternalComponentInterface.g:728:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalComponentInterface.g:750:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalComponentInterface.g:750:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalComponentInterface.g:751:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalComponentInterface.g:757:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:763:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:764:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:764:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:765:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:765:3: ()
            // InternalComponentInterface.g:766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalComponentInterface.g:776:3: ( (lv_name_2_0= ruleEString ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:777:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:777:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:778:5: lv_name_2_0= ruleEString
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
                    						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:799:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:800:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:804:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:805:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:805:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:806:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5());
            		
            // InternalComponentInterface.g:828:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:829:4: ( ruleEString )
            {
            // InternalComponentInterface.g:829:4: ( ruleEString )
            // InternalComponentInterface.g:830:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalComponentInterface.g:852:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalComponentInterface.g:852:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalComponentInterface.g:853:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalComponentInterface.g:859:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:865:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:866:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:866:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:867:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:867:3: ()
            // InternalComponentInterface.g:868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalComponentInterface.g:878:3: ( (lv_name_2_0= ruleEString ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:879:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:879:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:880:5: lv_name_2_0= ruleEString
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
                    						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:901:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:902:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:906:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:907:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:907:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:908:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5());
            		
            // InternalComponentInterface.g:930:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:931:4: ( ruleEString )
            {
            // InternalComponentInterface.g:931:4: ( ruleEString )
            // InternalComponentInterface.g:932:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalComponentInterface.g:954:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalComponentInterface.g:954:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalComponentInterface.g:955:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalComponentInterface.g:961:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:967:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:968:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:968:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:969:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:969:3: ()
            // InternalComponentInterface.g:970:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalComponentInterface.g:980:3: ( (lv_name_2_0= ruleEString ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:981:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:981:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:982:5: lv_name_2_0= ruleEString
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
                    						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1003:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:1004:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1008:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1009:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1009:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1010:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5());
            		
            // InternalComponentInterface.g:1032:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1033:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1033:4: ( ruleEString )
            // InternalComponentInterface.g:1034:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalComponentInterface.g:1056:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalComponentInterface.g:1056:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalComponentInterface.g:1057:2: iv_ruleRosActionServer= ruleRosActionServer EOF
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
    // InternalComponentInterface.g:1063:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:1069:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:1070:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:1070:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:1071:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:1071:3: ()
            // InternalComponentInterface.g:1072:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalComponentInterface.g:1082:3: ( (lv_name_2_0= ruleEString ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:1083:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1083:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1084:5: lv_name_2_0= ruleEString
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
                    						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1105:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:1106:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1110:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1111:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1111:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1112:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosActionServerRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionServerAccess().getRefServerKeyword_5());
            		
            // InternalComponentInterface.g:1134:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1135:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1135:4: ( ruleEString )
            // InternalComponentInterface.g:1136:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalComponentInterface.g:1158:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalComponentInterface.g:1158:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalComponentInterface.g:1159:2: iv_ruleRosActionClient= ruleRosActionClient EOF
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
    // InternalComponentInterface.g:1165:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:1171:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:1172:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:1172:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:1173:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:1173:3: ()
            // InternalComponentInterface.g:1174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalComponentInterface.g:1184:3: ( (lv_name_2_0= ruleEString ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:1185:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1185:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1186:5: lv_name_2_0= ruleEString
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
                    						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1207:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:1208:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1212:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1213:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1213:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1214:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosActionClientRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionClientAccess().getRefClientKeyword_5());
            		
            // InternalComponentInterface.g:1236:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1237:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1237:4: ( ruleEString )
            // InternalComponentInterface.g:1238:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalComponentInterface.g:1260:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalComponentInterface.g:1260:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalComponentInterface.g:1261:2: iv_ruleRosParameter= ruleRosParameter EOF
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
    // InternalComponentInterface.g:1267:1: ruleRosParameter returns [EObject current=null] : ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
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
            // InternalComponentInterface.g:1273:2: ( ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalComponentInterface.g:1274:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalComponentInterface.g:1274:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalComponentInterface.g:1275:3: () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            // InternalComponentInterface.g:1275:3: ()
            // InternalComponentInterface.g:1276:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosParameterAccess().getRosParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getRosParameterKeyword_1());
            		
            // InternalComponentInterface.g:1286:3: ( (lv_name_2_0= ruleEString ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:1287:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1287:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1288:5: lv_name_2_0= ruleEString
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
                    						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1309:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:1310:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1314:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1315:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1315:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1316:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_ns_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    						}
                    						set(
                    							current,
                    							"ns",
                    							lv_ns_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosParameterAccess().getRefParameterKeyword_5());
            		
            // InternalComponentInterface.g:1338:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1339:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1339:4: ( ruleEString )
            // InternalComponentInterface.g:1340:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:1354:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1355:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getRosParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalComponentInterface.g:1359:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalComponentInterface.g:1360:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalComponentInterface.g:1360:5: (lv_value_9_0= ruleParameterValue )
                    // InternalComponentInterface.g:1361:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_value_9_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:1387:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:1387:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:1388:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentInterface.g:1394:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1400:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:1401:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:1401:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:1402:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1410:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleParameterValue"
    // InternalComponentInterface.g:1421:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalComponentInterface.g:1421:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalComponentInterface.g:1422:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalComponentInterface.g:1428:1: ruleParameterValue returns [EObject current=null] : (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterDouble_0 = null;

        EObject this_ParameterBoolean_1 = null;

        EObject this_ParameterInteger_2 = null;

        EObject this_ParameterBase64_3 = null;

        EObject this_ParameterList_4 = null;

        EObject this_ParameterStruct_5 = null;

        EObject this_ParameterString_6 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1434:2: ( (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) )
            // InternalComponentInterface.g:1435:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            {
            // InternalComponentInterface.g:1435:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            int alt27=7;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalComponentInterface.g:1436:3: this_ParameterDouble_0= ruleParameterDouble
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_0=ruleParameterDouble();

                    state._fsp--;


                    			current = this_ParameterDouble_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1445:3: this_ParameterBoolean_1= ruleParameterBoolean
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_1=ruleParameterBoolean();

                    state._fsp--;


                    			current = this_ParameterBoolean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:1454:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalComponentInterface.g:1463:3: this_ParameterBase64_3= ruleParameterBase64
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_3=ruleParameterBase64();

                    state._fsp--;


                    			current = this_ParameterBase64_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalComponentInterface.g:1472:3: this_ParameterList_4= ruleParameterList
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterList_4=ruleParameterList();

                    state._fsp--;


                    			current = this_ParameterList_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalComponentInterface.g:1481:3: this_ParameterStruct_5= ruleParameterStruct
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_5=ruleParameterStruct();

                    state._fsp--;


                    			current = this_ParameterStruct_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalComponentInterface.g:1490:3: this_ParameterString_6= ruleParameterString
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterString_6=ruleParameterString();

                    state._fsp--;


                    			current = this_ParameterString_6;
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


    // $ANTLR start "entryRuleParameterString"
    // InternalComponentInterface.g:1502:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalComponentInterface.g:1502:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalComponentInterface.g:1503:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalComponentInterface.g:1509:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1515:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalComponentInterface.g:1516:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalComponentInterface.g:1516:2: ( (lv_value_0_0= ruleEString ) )
            // InternalComponentInterface.g:1517:3: (lv_value_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1517:3: (lv_value_0_0= ruleEString )
            // InternalComponentInterface.g:1518:4: lv_value_0_0= ruleEString
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
            					"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
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
    // InternalComponentInterface.g:1538:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalComponentInterface.g:1538:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalComponentInterface.g:1539:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalComponentInterface.g:1545:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1551:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalComponentInterface.g:1552:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalComponentInterface.g:1552:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalComponentInterface.g:1553:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalComponentInterface.g:1553:3: (lv_value_0_0= ruleBase64Binary )
            // InternalComponentInterface.g:1554:4: lv_value_0_0= ruleBase64Binary
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
            					"de.fraunhofer.ipa.componentInterface.ComponentInterface.Base64Binary");
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
    // InternalComponentInterface.g:1574:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalComponentInterface.g:1574:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalComponentInterface.g:1575:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalComponentInterface.g:1581:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1587:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalComponentInterface.g:1588:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalComponentInterface.g:1588:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalComponentInterface.g:1589:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalComponentInterface.g:1589:3: (lv_value_0_0= ruleInteger0 )
            // InternalComponentInterface.g:1590:4: lv_value_0_0= ruleInteger0
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
            					"de.fraunhofer.ipa.componentInterface.ComponentInterface.Integer0");
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
    // InternalComponentInterface.g:1610:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalComponentInterface.g:1610:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalComponentInterface.g:1611:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalComponentInterface.g:1617:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1623:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalComponentInterface.g:1624:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalComponentInterface.g:1624:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalComponentInterface.g:1625:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalComponentInterface.g:1625:3: (lv_value_0_0= ruleDouble0 )
            // InternalComponentInterface.g:1626:4: lv_value_0_0= ruleDouble0
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
            					"de.fraunhofer.ipa.componentInterface.ComponentInterface.Double0");
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
    // InternalComponentInterface.g:1646:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalComponentInterface.g:1646:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalComponentInterface.g:1647:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalComponentInterface.g:1653:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1659:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalComponentInterface.g:1660:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalComponentInterface.g:1660:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalComponentInterface.g:1661:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalComponentInterface.g:1661:3: (lv_value_0_0= ruleboolean0 )
            // InternalComponentInterface.g:1662:4: lv_value_0_0= ruleboolean0
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
            					"de.fraunhofer.ipa.componentInterface.ComponentInterface.boolean0");
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


    // $ANTLR start "entryRuleParameterList"
    // InternalComponentInterface.g:1682:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalComponentInterface.g:1682:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalComponentInterface.g:1683:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalComponentInterface.g:1689:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1695:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalComponentInterface.g:1696:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalComponentInterface.g:1696:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalComponentInterface.g:1697:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalComponentInterface.g:1697:3: ()
            // InternalComponentInterface.g:1698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalComponentInterface.g:1708:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1709:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1709:4: (lv_value_2_0= ruleParameterValue )
            // InternalComponentInterface.g:1710:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:1727:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalComponentInterface.g:1728:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_30); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalComponentInterface.g:1732:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalComponentInterface.g:1733:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalComponentInterface.g:1733:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalComponentInterface.g:1734:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.ParameterValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameterStruct"
    // InternalComponentInterface.g:1760:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalComponentInterface.g:1760:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalComponentInterface.g:1761:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalComponentInterface.g:1767:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
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
            // InternalComponentInterface.g:1773:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalComponentInterface.g:1774:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalComponentInterface.g:1774:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalComponentInterface.g:1775:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalComponentInterface.g:1775:3: ()
            // InternalComponentInterface.g:1776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalComponentInterface.g:1782:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentInterface.g:1783:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalComponentInterface.g:1787:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalComponentInterface.g:1788:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalComponentInterface.g:1788:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalComponentInterface.g:1789:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_2_0=ruleParameterStructMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.ParameterStructMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:1806:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==28) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1807:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalComponentInterface.g:1815:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalComponentInterface.g:1816:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalComponentInterface.g:1816:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalComponentInterface.g:1817:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_value_5_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_5_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,29,FOLLOW_10); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalComponentInterface.g:1848:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalComponentInterface.g:1848:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalComponentInterface.g:1849:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalComponentInterface.g:1855:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1861:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) )
            // InternalComponentInterface.g:1862:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            {
            // InternalComponentInterface.g:1862:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            // InternalComponentInterface.g:1863:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}'
            {
            // InternalComponentInterface.g:1863:3: ( (lv_name_0_0= ruleEString ) )
            // InternalComponentInterface.g:1864:4: (lv_name_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1864:4: (lv_name_0_0= ruleEString )
            // InternalComponentInterface.g:1865:5: lv_name_0_0= ruleEString
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
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getValueKeyword_2());
            		
            // InternalComponentInterface.g:1890:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1891:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1891:4: (lv_value_3_0= ruleParameterValue )
            // InternalComponentInterface.g:1892:5: lv_value_3_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_value_3_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.componentInterface.ComponentInterface.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBase64Binary"
    // InternalComponentInterface.g:1917:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalComponentInterface.g:1917:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalComponentInterface.g:1918:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalComponentInterface.g:1924:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1930:2: (this_BINARY_0= RULE_BINARY )
            // InternalComponentInterface.g:1931:2: this_BINARY_0= RULE_BINARY
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
    // InternalComponentInterface.g:1941:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalComponentInterface.g:1941:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalComponentInterface.g:1942:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalComponentInterface.g:1948:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1954:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalComponentInterface.g:1955:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalComponentInterface.g:1965:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalComponentInterface.g:1965:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalComponentInterface.g:1966:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalComponentInterface.g:1972:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1978:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalComponentInterface.g:1979:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalComponentInterface.g:1989:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalComponentInterface.g:1989:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalComponentInterface.g:1990:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalComponentInterface.g:1996:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:2002:2: (this_DECINT_0= RULE_DECINT )
            // InternalComponentInterface.g:2003:2: this_DECINT_0= RULE_DECINT
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

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\6\12\uffff";
    static final String dfa_3s = "\1\4\4\uffff\1\4\3\uffff\2\27";
    static final String dfa_4s = "\1\35\4\uffff\1\35\3\uffff\2\35";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\5\2\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\7\1\4\1\2\1\1\1\3\15\uffff\1\5\4\uffff\2\6",
            "",
            "",
            "",
            "",
            "\1\11\1\12\4\10\15\uffff\1\10\4\uffff\2\10",
            "",
            "",
            "",
            "\1\6\4\uffff\2\10",
            "\1\6\4\uffff\2\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1435:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000FEE000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000FEC000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000FE8000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000008003F0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});

}
