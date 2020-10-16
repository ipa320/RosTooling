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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_DIGIT", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'NameSpace'", "'RosPublishers'", "','", "'}'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosParameters'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'", "'RosParameter'", "'RefParameter'", "'value'"
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
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' ) ;
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
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) ) otherlv_49= '}'
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

            // InternalComponentInterface.g:135:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) ) )
            // InternalComponentInterface.g:136:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) )
            {
            // InternalComponentInterface.g:136:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* ) )
            // InternalComponentInterface.g:137:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            				
            // InternalComponentInterface.g:140:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )* )
            // InternalComponentInterface.g:141:6: ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )*
            {
            // InternalComponentInterface.g:141:6: ( ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) ) )*
            loop9:
            do {
                int alt9=8;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3) ) {
                    alt9=4;
                }
                else if ( LA9_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4) ) {
                    alt9=5;
                }
                else if ( LA9_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5) ) {
                    alt9=6;
                }
                else if ( LA9_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6) ) {
                    alt9=7;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentInterface.g:142:4: ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:142:4: ({...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) ) )
            	    // InternalComponentInterface.g:143:5: {...}? => ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalComponentInterface.g:143:115: ( ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) ) )
            	    // InternalComponentInterface.g:144:6: ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalComponentInterface.g:147:9: ({...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' ) )
            	    // InternalComponentInterface.g:147:10: {...}? => (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:147:19: (otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}' )
            	    // InternalComponentInterface.g:147:20: otherlv_7= 'RosPublishers' otherlv_8= '{' ( (lv_rospublisher_9_0= ruleRosPublisher ) ) (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )* otherlv_12= '}'
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0_0());
            	    								
            	    otherlv_8=(Token)match(input,23,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_0_1());
            	    								
            	    // InternalComponentInterface.g:155:9: ( (lv_rospublisher_9_0= ruleRosPublisher ) )
            	    // InternalComponentInterface.g:156:10: (lv_rospublisher_9_0= ruleRosPublisher )
            	    {
            	    // InternalComponentInterface.g:156:10: (lv_rospublisher_9_0= ruleRosPublisher )
            	    // InternalComponentInterface.g:157:11: lv_rospublisher_9_0= ruleRosPublisher
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_0_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_rospublisher_9_0=ruleRosPublisher();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rospublisher",
            	    												lv_rospublisher_9_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:174:9: (otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==27) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:175:10: otherlv_10= ',' ( (lv_rospublisher_11_0= ruleRosPublisher ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,27,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_0_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:179:10: ( (lv_rospublisher_11_0= ruleRosPublisher ) )
            	    	    // InternalComponentInterface.g:180:11: (lv_rospublisher_11_0= ruleRosPublisher )
            	    	    {
            	    	    // InternalComponentInterface.g:180:11: (lv_rospublisher_11_0= ruleRosPublisher )
            	    	    // InternalComponentInterface.g:181:12: lv_rospublisher_11_0= ruleRosPublisher
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_0_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalComponentInterface.g:209:4: ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:209:4: ({...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) ) )
            	    // InternalComponentInterface.g:210:5: {...}? => ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalComponentInterface.g:210:115: ( ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) ) )
            	    // InternalComponentInterface.g:211:6: ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalComponentInterface.g:214:9: ({...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' ) )
            	    // InternalComponentInterface.g:214:10: {...}? => (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:214:19: (otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}' )
            	    // InternalComponentInterface.g:214:20: otherlv_13= 'RosSubscribers' otherlv_14= '{' ( (lv_rossubscriber_15_0= ruleRosSubscriber ) ) (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )* otherlv_18= '}'
            	    {
            	    otherlv_13=(Token)match(input,29,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_1_0());
            	    								
            	    otherlv_14=(Token)match(input,23,FOLLOW_10); 

            	    									newLeafNode(otherlv_14, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1_1());
            	    								
            	    // InternalComponentInterface.g:222:9: ( (lv_rossubscriber_15_0= ruleRosSubscriber ) )
            	    // InternalComponentInterface.g:223:10: (lv_rossubscriber_15_0= ruleRosSubscriber )
            	    {
            	    // InternalComponentInterface.g:223:10: (lv_rossubscriber_15_0= ruleRosSubscriber )
            	    // InternalComponentInterface.g:224:11: lv_rossubscriber_15_0= ruleRosSubscriber
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_1_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_rossubscriber_15_0=ruleRosSubscriber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rossubscriber",
            	    												lv_rossubscriber_15_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:241:9: (otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==27) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:242:10: otherlv_16= ',' ( (lv_rossubscriber_17_0= ruleRosSubscriber ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,27,FOLLOW_10); 

            	    	    										newLeafNode(otherlv_16, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_1_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:246:10: ( (lv_rossubscriber_17_0= ruleRosSubscriber ) )
            	    	    // InternalComponentInterface.g:247:11: (lv_rossubscriber_17_0= ruleRosSubscriber )
            	    	    {
            	    	    // InternalComponentInterface.g:247:11: (lv_rossubscriber_17_0= ruleRosSubscriber )
            	    	    // InternalComponentInterface.g:248:12: lv_rossubscriber_17_0= ruleRosSubscriber
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalComponentInterface.g:276:4: ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:276:4: ({...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) ) )
            	    // InternalComponentInterface.g:277:5: {...}? => ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalComponentInterface.g:277:115: ( ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) ) )
            	    // InternalComponentInterface.g:278:6: ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalComponentInterface.g:281:9: ({...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' ) )
            	    // InternalComponentInterface.g:281:10: {...}? => (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:281:19: (otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}' )
            	    // InternalComponentInterface.g:281:20: otherlv_19= 'RosSrvServers' otherlv_20= '{' ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) ) (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )* otherlv_24= '}'
            	    {
            	    otherlv_19=(Token)match(input,30,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_5_2_0());
            	    								
            	    otherlv_20=(Token)match(input,23,FOLLOW_11); 

            	    									newLeafNode(otherlv_20, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_2_1());
            	    								
            	    // InternalComponentInterface.g:289:9: ( (lv_rosserviceserver_21_0= ruleRosServiceServer ) )
            	    // InternalComponentInterface.g:290:10: (lv_rosserviceserver_21_0= ruleRosServiceServer )
            	    {
            	    // InternalComponentInterface.g:290:10: (lv_rosserviceserver_21_0= ruleRosServiceServer )
            	    // InternalComponentInterface.g:291:11: lv_rosserviceserver_21_0= ruleRosServiceServer
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_5_2_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_rosserviceserver_21_0=ruleRosServiceServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosserviceserver",
            	    												lv_rosserviceserver_21_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:308:9: (otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==27) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:309:10: otherlv_22= ',' ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,27,FOLLOW_11); 

            	    	    										newLeafNode(otherlv_22, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_2_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:313:10: ( (lv_rosserviceserver_23_0= ruleRosServiceServer ) )
            	    	    // InternalComponentInterface.g:314:11: (lv_rosserviceserver_23_0= ruleRosServiceServer )
            	    	    {
            	    	    // InternalComponentInterface.g:314:11: (lv_rosserviceserver_23_0= ruleRosServiceServer )
            	    	    // InternalComponentInterface.g:315:12: lv_rosserviceserver_23_0= ruleRosServiceServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_5_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalComponentInterface.g:343:4: ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:343:4: ({...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) ) )
            	    // InternalComponentInterface.g:344:5: {...}? => ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalComponentInterface.g:344:115: ( ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) ) )
            	    // InternalComponentInterface.g:345:6: ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalComponentInterface.g:348:9: ({...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' ) )
            	    // InternalComponentInterface.g:348:10: {...}? => (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:348:19: (otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}' )
            	    // InternalComponentInterface.g:348:20: otherlv_25= 'RosSrvClients' otherlv_26= '{' ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) ) (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )* otherlv_30= '}'
            	    {
            	    otherlv_25=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_5_3_0());
            	    								
            	    otherlv_26=(Token)match(input,23,FOLLOW_12); 

            	    									newLeafNode(otherlv_26, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_3_1());
            	    								
            	    // InternalComponentInterface.g:356:9: ( (lv_rosserviceclient_27_0= ruleRosServiceClient ) )
            	    // InternalComponentInterface.g:357:10: (lv_rosserviceclient_27_0= ruleRosServiceClient )
            	    {
            	    // InternalComponentInterface.g:357:10: (lv_rosserviceclient_27_0= ruleRosServiceClient )
            	    // InternalComponentInterface.g:358:11: lv_rosserviceclient_27_0= ruleRosServiceClient
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_5_3_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_rosserviceclient_27_0=ruleRosServiceClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosserviceclient",
            	    												lv_rosserviceclient_27_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:375:9: (otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==27) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:376:10: otherlv_28= ',' ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) )
            	    	    {
            	    	    otherlv_28=(Token)match(input,27,FOLLOW_12); 

            	    	    										newLeafNode(otherlv_28, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:380:10: ( (lv_rosserviceclient_29_0= ruleRosServiceClient ) )
            	    	    // InternalComponentInterface.g:381:11: (lv_rosserviceclient_29_0= ruleRosServiceClient )
            	    	    {
            	    	    // InternalComponentInterface.g:381:11: (lv_rosserviceclient_29_0= ruleRosServiceClient )
            	    	    // InternalComponentInterface.g:382:12: lv_rosserviceclient_29_0= ruleRosServiceClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_5_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_30=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalComponentInterface.g:410:4: ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:410:4: ({...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) ) )
            	    // InternalComponentInterface.g:411:5: {...}? => ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalComponentInterface.g:411:115: ( ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) ) )
            	    // InternalComponentInterface.g:412:6: ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalComponentInterface.g:415:9: ({...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' ) )
            	    // InternalComponentInterface.g:415:10: {...}? => (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:415:19: (otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}' )
            	    // InternalComponentInterface.g:415:20: otherlv_31= 'RosActionServers' otherlv_32= '{' ( (lv_rosactionserver_33_0= ruleRosActionServer ) ) (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )* otherlv_36= '}'
            	    {
            	    otherlv_31=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_31, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_5_4_0());
            	    								
            	    otherlv_32=(Token)match(input,23,FOLLOW_13); 

            	    									newLeafNode(otherlv_32, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_4_1());
            	    								
            	    // InternalComponentInterface.g:423:9: ( (lv_rosactionserver_33_0= ruleRosActionServer ) )
            	    // InternalComponentInterface.g:424:10: (lv_rosactionserver_33_0= ruleRosActionServer )
            	    {
            	    // InternalComponentInterface.g:424:10: (lv_rosactionserver_33_0= ruleRosActionServer )
            	    // InternalComponentInterface.g:425:11: lv_rosactionserver_33_0= ruleRosActionServer
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_5_4_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_rosactionserver_33_0=ruleRosActionServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosactionserver",
            	    												lv_rosactionserver_33_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:442:9: (otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==27) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:443:10: otherlv_34= ',' ( (lv_rosactionserver_35_0= ruleRosActionServer ) )
            	    	    {
            	    	    otherlv_34=(Token)match(input,27,FOLLOW_13); 

            	    	    										newLeafNode(otherlv_34, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_4_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:447:10: ( (lv_rosactionserver_35_0= ruleRosActionServer ) )
            	    	    // InternalComponentInterface.g:448:11: (lv_rosactionserver_35_0= ruleRosActionServer )
            	    	    {
            	    	    // InternalComponentInterface.g:448:11: (lv_rosactionserver_35_0= ruleRosActionServer )
            	    	    // InternalComponentInterface.g:449:12: lv_rosactionserver_35_0= ruleRosActionServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_5_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    otherlv_36=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_36, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalComponentInterface.g:477:4: ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:477:4: ({...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) ) )
            	    // InternalComponentInterface.g:478:5: {...}? => ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalComponentInterface.g:478:115: ( ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) ) )
            	    // InternalComponentInterface.g:479:6: ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 5);
            	    					
            	    // InternalComponentInterface.g:482:9: ({...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' ) )
            	    // InternalComponentInterface.g:482:10: {...}? => (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:482:19: (otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}' )
            	    // InternalComponentInterface.g:482:20: otherlv_37= 'RosActionClients' otherlv_38= '{' ( (lv_rosactionclient_39_0= ruleRosActionClient ) ) (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )* otherlv_42= '}'
            	    {
            	    otherlv_37=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_37, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_5_5_0());
            	    								
            	    otherlv_38=(Token)match(input,23,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_5_1());
            	    								
            	    // InternalComponentInterface.g:490:9: ( (lv_rosactionclient_39_0= ruleRosActionClient ) )
            	    // InternalComponentInterface.g:491:10: (lv_rosactionclient_39_0= ruleRosActionClient )
            	    {
            	    // InternalComponentInterface.g:491:10: (lv_rosactionclient_39_0= ruleRosActionClient )
            	    // InternalComponentInterface.g:492:11: lv_rosactionclient_39_0= ruleRosActionClient
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_5_5_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_rosactionclient_39_0=ruleRosActionClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosactionclient",
            	    												lv_rosactionclient_39_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:509:9: (otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==27) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:510:10: otherlv_40= ',' ( (lv_rosactionclient_41_0= ruleRosActionClient ) )
            	    	    {
            	    	    otherlv_40=(Token)match(input,27,FOLLOW_14); 

            	    	    										newLeafNode(otherlv_40, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_5_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:514:10: ( (lv_rosactionclient_41_0= ruleRosActionClient ) )
            	    	    // InternalComponentInterface.g:515:11: (lv_rosactionclient_41_0= ruleRosActionClient )
            	    	    {
            	    	    // InternalComponentInterface.g:515:11: (lv_rosactionclient_41_0= ruleRosActionClient )
            	    	    // InternalComponentInterface.g:516:12: lv_rosactionclient_41_0= ruleRosActionClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_5_5_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_42=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_42, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalComponentInterface.g:544:4: ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) )
            	    {
            	    // InternalComponentInterface.g:544:4: ({...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) ) )
            	    // InternalComponentInterface.g:545:5: {...}? => ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // InternalComponentInterface.g:545:115: ( ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) ) )
            	    // InternalComponentInterface.g:546:6: ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5(), 6);
            	    					
            	    // InternalComponentInterface.g:549:9: ({...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' ) )
            	    // InternalComponentInterface.g:549:10: {...}? => (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponentInterface", "true");
            	    }
            	    // InternalComponentInterface.g:549:19: (otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}' )
            	    // InternalComponentInterface.g:549:20: otherlv_43= 'RosParameters' otherlv_44= '{' ( (lv_rosparameter_45_0= ruleRosParameter ) ) (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )* otherlv_48= '}'
            	    {
            	    otherlv_43=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_43, grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_5_6_0());
            	    								
            	    otherlv_44=(Token)match(input,23,FOLLOW_15); 

            	    									newLeafNode(otherlv_44, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_6_1());
            	    								
            	    // InternalComponentInterface.g:557:9: ( (lv_rosparameter_45_0= ruleRosParameter ) )
            	    // InternalComponentInterface.g:558:10: (lv_rosparameter_45_0= ruleRosParameter )
            	    {
            	    // InternalComponentInterface.g:558:10: (lv_rosparameter_45_0= ruleRosParameter )
            	    // InternalComponentInterface.g:559:11: lv_rosparameter_45_0= ruleRosParameter
            	    {

            	    											newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_5_6_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
            	    lv_rosparameter_45_0=ruleRosParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
            	    											}
            	    											add(
            	    												current,
            	    												"rosparameter",
            	    												lv_rosparameter_45_0,
            	    												"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosParameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalComponentInterface.g:576:9: (otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==27) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:577:10: otherlv_46= ',' ( (lv_rosparameter_47_0= ruleRosParameter ) )
            	    	    {
            	    	    otherlv_46=(Token)match(input,27,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_46, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_6_3_0());
            	    	    									
            	    	    // InternalComponentInterface.g:581:10: ( (lv_rosparameter_47_0= ruleRosParameter ) )
            	    	    // InternalComponentInterface.g:582:11: (lv_rosparameter_47_0= ruleRosParameter )
            	    	    {
            	    	    // InternalComponentInterface.g:582:11: (lv_rosparameter_47_0= ruleRosParameter )
            	    	    // InternalComponentInterface.g:583:12: lv_rosparameter_47_0= ruleRosParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_5_6_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_9);
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_48=(Token)match(input,28,FOLLOW_7); 

            	    									newLeafNode(otherlv_48, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentInterfaceAccess().getUnorderedGroup_5());
            				

            }

            otherlv_49=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:626:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalComponentInterface.g:626:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalComponentInterface.g:627:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalComponentInterface.g:633:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:639:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:640:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:640:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:641:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:641:3: ()
            // InternalComponentInterface.g:642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalComponentInterface.g:652:3: ( (lv_name_2_0= ruleEString ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:653:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:653:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:654:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:675:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:676:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:680:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:681:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:681:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:682:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_6=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5());
            		
            // InternalComponentInterface.g:704:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:705:4: ( ruleEString )
            {
            // InternalComponentInterface.g:705:4: ( ruleEString )
            // InternalComponentInterface.g:706:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:728:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalComponentInterface.g:728:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalComponentInterface.g:729:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalComponentInterface.g:735:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:741:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:742:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:742:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:743:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:743:3: ()
            // InternalComponentInterface.g:744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalComponentInterface.g:754:3: ( (lv_name_2_0= ruleEString ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:755:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:755:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:756:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:777:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:778:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:782:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:783:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:783:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:784:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            otherlv_6=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5());
            		
            // InternalComponentInterface.g:806:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:807:4: ( ruleEString )
            {
            // InternalComponentInterface.g:807:4: ( ruleEString )
            // InternalComponentInterface.g:808:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:830:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalComponentInterface.g:830:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalComponentInterface.g:831:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalComponentInterface.g:837:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:843:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:844:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:844:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:845:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:845:3: ()
            // InternalComponentInterface.g:846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalComponentInterface.g:856:3: ( (lv_name_2_0= ruleEString ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:857:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:857:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:858:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:879:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:880:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:884:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:885:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:885:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:886:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            otherlv_6=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5());
            		
            // InternalComponentInterface.g:908:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:909:4: ( ruleEString )
            {
            // InternalComponentInterface.g:909:4: ( ruleEString )
            // InternalComponentInterface.g:910:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:932:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalComponentInterface.g:932:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalComponentInterface.g:933:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalComponentInterface.g:939:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:945:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:946:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:946:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:947:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:947:3: ()
            // InternalComponentInterface.g:948:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalComponentInterface.g:958:3: ( (lv_name_2_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:959:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:959:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:960:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:981:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:982:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:986:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:987:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:987:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:988:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            otherlv_6=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5());
            		
            // InternalComponentInterface.g:1010:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1011:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1011:4: ( ruleEString )
            // InternalComponentInterface.g:1012:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:1034:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalComponentInterface.g:1034:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalComponentInterface.g:1035:2: iv_ruleRosActionServer= ruleRosActionServer EOF
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
    // InternalComponentInterface.g:1041:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:1047:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:1048:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:1048:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:1049:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:1049:3: ()
            // InternalComponentInterface.g:1050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalComponentInterface.g:1060:3: ( (lv_name_2_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:1061:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1061:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1062:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1083:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:1084:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1088:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1089:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1089:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1090:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            otherlv_6=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionServerAccess().getRefServerKeyword_5());
            		
            // InternalComponentInterface.g:1112:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1113:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1113:4: ( ruleEString )
            // InternalComponentInterface.g:1114:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:1136:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalComponentInterface.g:1136:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalComponentInterface.g:1137:2: iv_ruleRosActionClient= ruleRosActionClient EOF
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
    // InternalComponentInterface.g:1143:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:1149:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:1150:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:1150:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:1151:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:1151:3: ()
            // InternalComponentInterface.g:1152:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalComponentInterface.g:1162:3: ( (lv_name_2_0= ruleEString ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:1163:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1163:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1164:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1185:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:1186:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1190:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1191:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1191:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1192:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            otherlv_6=(Token)match(input,43,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionClientAccess().getRefClientKeyword_5());
            		
            // InternalComponentInterface.g:1214:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1215:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1215:4: ( ruleEString )
            // InternalComponentInterface.g:1216:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:1238:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalComponentInterface.g:1238:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalComponentInterface.g:1239:2: iv_ruleRosParameter= ruleRosParameter EOF
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
    // InternalComponentInterface.g:1245:1: ruleRosParameter returns [EObject current=null] : ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
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
            // InternalComponentInterface.g:1251:2: ( ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalComponentInterface.g:1252:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalComponentInterface.g:1252:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalComponentInterface.g:1253:3: () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            // InternalComponentInterface.g:1253:3: ()
            // InternalComponentInterface.g:1254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosParameterAccess().getRosParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getRosParameterKeyword_1());
            		
            // InternalComponentInterface.g:1264:3: ( (lv_name_2_0= ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:1265:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1265:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1266:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1287:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:1288:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1292:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1293:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1293:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1294:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_6=(Token)match(input,47,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosParameterAccess().getRefParameterKeyword_5());
            		
            // InternalComponentInterface.g:1316:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1317:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1317:4: ( ruleEString )
            // InternalComponentInterface.g:1318:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:1332:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:1333:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_29); 

                    				newLeafNode(otherlv_8, grammarAccess.getRosParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalComponentInterface.g:1337:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalComponentInterface.g:1338:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalComponentInterface.g:1338:5: (lv_value_9_0= ruleParameterValue )
                    // InternalComponentInterface.g:1339:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

            otherlv_10=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:1365:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:1365:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:1366:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentInterface.g:1372:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1378:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:1379:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:1379:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1380:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1388:3: this_ID_1= RULE_ID
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
    // InternalComponentInterface.g:1399:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalComponentInterface.g:1399:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalComponentInterface.g:1400:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalComponentInterface.g:1406:1: ruleParameterValue returns [EObject current=null] : (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) ;
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
            // InternalComponentInterface.g:1412:2: ( (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) )
            // InternalComponentInterface.g:1413:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            {
            // InternalComponentInterface.g:1413:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            int alt26=7;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:1414:3: this_ParameterDouble_0= ruleParameterDouble
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
                    // InternalComponentInterface.g:1423:3: this_ParameterBoolean_1= ruleParameterBoolean
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
                    // InternalComponentInterface.g:1432:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalComponentInterface.g:1441:3: this_ParameterBase64_3= ruleParameterBase64
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
                    // InternalComponentInterface.g:1450:3: this_ParameterList_4= ruleParameterList
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
                    // InternalComponentInterface.g:1459:3: this_ParameterStruct_5= ruleParameterStruct
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
                    // InternalComponentInterface.g:1468:3: this_ParameterString_6= ruleParameterString
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
    // InternalComponentInterface.g:1480:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalComponentInterface.g:1480:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalComponentInterface.g:1481:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalComponentInterface.g:1487:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1493:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalComponentInterface.g:1494:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalComponentInterface.g:1494:2: ( (lv_value_0_0= ruleEString ) )
            // InternalComponentInterface.g:1495:3: (lv_value_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1495:3: (lv_value_0_0= ruleEString )
            // InternalComponentInterface.g:1496:4: lv_value_0_0= ruleEString
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
    // InternalComponentInterface.g:1516:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalComponentInterface.g:1516:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalComponentInterface.g:1517:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalComponentInterface.g:1523:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1529:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalComponentInterface.g:1530:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalComponentInterface.g:1530:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalComponentInterface.g:1531:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalComponentInterface.g:1531:3: (lv_value_0_0= ruleBase64Binary )
            // InternalComponentInterface.g:1532:4: lv_value_0_0= ruleBase64Binary
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
    // InternalComponentInterface.g:1552:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalComponentInterface.g:1552:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalComponentInterface.g:1553:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalComponentInterface.g:1559:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1565:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalComponentInterface.g:1566:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalComponentInterface.g:1566:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalComponentInterface.g:1567:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalComponentInterface.g:1567:3: (lv_value_0_0= ruleInteger0 )
            // InternalComponentInterface.g:1568:4: lv_value_0_0= ruleInteger0
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
    // InternalComponentInterface.g:1588:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalComponentInterface.g:1588:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalComponentInterface.g:1589:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalComponentInterface.g:1595:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1601:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalComponentInterface.g:1602:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalComponentInterface.g:1602:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalComponentInterface.g:1603:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalComponentInterface.g:1603:3: (lv_value_0_0= ruleDouble0 )
            // InternalComponentInterface.g:1604:4: lv_value_0_0= ruleDouble0
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
    // InternalComponentInterface.g:1624:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalComponentInterface.g:1624:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalComponentInterface.g:1625:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalComponentInterface.g:1631:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1637:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalComponentInterface.g:1638:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalComponentInterface.g:1638:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalComponentInterface.g:1639:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalComponentInterface.g:1639:3: (lv_value_0_0= ruleboolean0 )
            // InternalComponentInterface.g:1640:4: lv_value_0_0= ruleboolean0
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
    // InternalComponentInterface.g:1660:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalComponentInterface.g:1660:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalComponentInterface.g:1661:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalComponentInterface.g:1667:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1673:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalComponentInterface.g:1674:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalComponentInterface.g:1674:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalComponentInterface.g:1675:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalComponentInterface.g:1675:3: ()
            // InternalComponentInterface.g:1676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalComponentInterface.g:1686:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1687:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1687:4: (lv_value_2_0= ruleParameterValue )
            // InternalComponentInterface.g:1688:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalComponentInterface.g:1705:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==27) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalComponentInterface.g:1706:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_29); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalComponentInterface.g:1710:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalComponentInterface.g:1711:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalComponentInterface.g:1711:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalComponentInterface.g:1712:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
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
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:1738:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalComponentInterface.g:1738:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalComponentInterface.g:1739:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalComponentInterface.g:1745:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
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
            // InternalComponentInterface.g:1751:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalComponentInterface.g:1752:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalComponentInterface.g:1752:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalComponentInterface.g:1753:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalComponentInterface.g:1753:3: ()
            // InternalComponentInterface.g:1754:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalComponentInterface.g:1760:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentInterface.g:1761:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalComponentInterface.g:1765:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalComponentInterface.g:1766:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalComponentInterface.g:1766:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalComponentInterface.g:1767:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalComponentInterface.g:1784:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==27) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1785:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalComponentInterface.g:1793:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalComponentInterface.g:1794:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalComponentInterface.g:1794:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalComponentInterface.g:1795:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
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

                    	    otherlv_6=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:1826:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalComponentInterface.g:1826:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalComponentInterface.g:1827:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalComponentInterface.g:1833:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1839:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) )
            // InternalComponentInterface.g:1840:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            {
            // InternalComponentInterface.g:1840:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            // InternalComponentInterface.g:1841:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}'
            {
            // InternalComponentInterface.g:1841:3: ( (lv_name_0_0= ruleEString ) )
            // InternalComponentInterface.g:1842:4: (lv_name_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1842:4: (lv_name_0_0= ruleEString )
            // InternalComponentInterface.g:1843:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getValueKeyword_2());
            		
            // InternalComponentInterface.g:1868:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1869:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1869:4: (lv_value_3_0= ruleParameterValue )
            // InternalComponentInterface.g:1870:5: lv_value_3_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

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
    // InternalComponentInterface.g:1895:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalComponentInterface.g:1895:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalComponentInterface.g:1896:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalComponentInterface.g:1902:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1908:2: (this_BINARY_0= RULE_BINARY )
            // InternalComponentInterface.g:1909:2: this_BINARY_0= RULE_BINARY
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
    // InternalComponentInterface.g:1919:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalComponentInterface.g:1919:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalComponentInterface.g:1920:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalComponentInterface.g:1926:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1932:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalComponentInterface.g:1933:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalComponentInterface.g:1943:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalComponentInterface.g:1943:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalComponentInterface.g:1944:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalComponentInterface.g:1950:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1956:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalComponentInterface.g:1957:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalComponentInterface.g:1967:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalComponentInterface.g:1967:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalComponentInterface.g:1968:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalComponentInterface.g:1974:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1980:2: (this_DECINT_0= RULE_DECINT )
            // InternalComponentInterface.g:1981:2: this_DECINT_0= RULE_DECINT
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


    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\6\12\uffff";
    static final String dfa_3s = "\1\4\4\uffff\1\4\3\uffff\2\27";
    static final String dfa_4s = "\1\34\4\uffff\1\34\3\uffff\2\34";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\5\2\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\2\7\1\4\1\2\1\1\1\3\15\uffff\1\5\3\uffff\2\6",
            "",
            "",
            "",
            "",
            "\1\11\1\12\4\10\15\uffff\1\10\3\uffff\2\10",
            "",
            "",
            "",
            "\1\6\3\uffff\2\10",
            "\1\6\3\uffff\2\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1413:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000007F6000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000007F4000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000081000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000008003F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});

}
