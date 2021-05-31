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
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? (otherlv_8= 'RosPublishers' otherlv_9= '{' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )* otherlv_13= '}' )? (otherlv_14= 'RosSubscribers' otherlv_15= '{' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )* otherlv_19= '}' )? (otherlv_20= 'RosSrvServers' otherlv_21= '{' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )* otherlv_25= '}' )? (otherlv_26= 'RosSrvClients' otherlv_27= '{' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )* otherlv_31= '}' )? (otherlv_32= 'RosActionServers' otherlv_33= '{' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )* otherlv_37= '}' )? (otherlv_38= 'RosActionClients' otherlv_39= '{' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )* otherlv_43= '}' )? (otherlv_44= 'RosParameters' otherlv_45= '{' ( (lv_rosparameter_46_0= ruleRosParameter ) ) (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )* otherlv_49= '}' )? otherlv_50= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_5_0 = null;

        EObject lv_rospublisher_10_0 = null;

        EObject lv_rospublisher_12_0 = null;

        EObject lv_rossubscriber_16_0 = null;

        EObject lv_rossubscriber_18_0 = null;

        EObject lv_rosserviceserver_22_0 = null;

        EObject lv_rosserviceserver_24_0 = null;

        EObject lv_rosserviceclient_28_0 = null;

        EObject lv_rosserviceclient_30_0 = null;

        EObject lv_rosactionserver_34_0 = null;

        EObject lv_rosactionserver_36_0 = null;

        EObject lv_rosactionclient_40_0 = null;

        EObject lv_rosactionclient_42_0 = null;

        EObject lv_rosparameter_46_0 = null;

        EObject lv_rosparameter_48_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? (otherlv_8= 'RosPublishers' otherlv_9= '{' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )* otherlv_13= '}' )? (otherlv_14= 'RosSubscribers' otherlv_15= '{' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )* otherlv_19= '}' )? (otherlv_20= 'RosSrvServers' otherlv_21= '{' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )* otherlv_25= '}' )? (otherlv_26= 'RosSrvClients' otherlv_27= '{' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )* otherlv_31= '}' )? (otherlv_32= 'RosActionServers' otherlv_33= '{' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )* otherlv_37= '}' )? (otherlv_38= 'RosActionClients' otherlv_39= '{' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )* otherlv_43= '}' )? (otherlv_44= 'RosParameters' otherlv_45= '{' ( (lv_rosparameter_46_0= ruleRosParameter ) ) (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )* otherlv_49= '}' )? otherlv_50= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? (otherlv_8= 'RosPublishers' otherlv_9= '{' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )* otherlv_13= '}' )? (otherlv_14= 'RosSubscribers' otherlv_15= '{' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )* otherlv_19= '}' )? (otherlv_20= 'RosSrvServers' otherlv_21= '{' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )* otherlv_25= '}' )? (otherlv_26= 'RosSrvClients' otherlv_27= '{' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )* otherlv_31= '}' )? (otherlv_32= 'RosActionServers' otherlv_33= '{' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )* otherlv_37= '}' )? (otherlv_38= 'RosActionClients' otherlv_39= '{' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )* otherlv_43= '}' )? (otherlv_44= 'RosParameters' otherlv_45= '{' ( (lv_rosparameter_46_0= ruleRosParameter ) ) (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )* otherlv_49= '}' )? otherlv_50= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? (otherlv_8= 'RosPublishers' otherlv_9= '{' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )* otherlv_13= '}' )? (otherlv_14= 'RosSubscribers' otherlv_15= '{' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )* otherlv_19= '}' )? (otherlv_20= 'RosSrvServers' otherlv_21= '{' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )* otherlv_25= '}' )? (otherlv_26= 'RosSrvClients' otherlv_27= '{' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )* otherlv_31= '}' )? (otherlv_32= 'RosActionServers' otherlv_33= '{' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )* otherlv_37= '}' )? (otherlv_38= 'RosActionClients' otherlv_39= '{' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )* otherlv_43= '}' )? (otherlv_44= 'RosParameters' otherlv_45= '{' ( (lv_rosparameter_46_0= ruleRosParameter ) ) (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )* otherlv_49= '}' )? otherlv_50= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'FromRosNode' ( ( ruleEString ) ) )? (otherlv_8= 'RosPublishers' otherlv_9= '{' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )* otherlv_13= '}' )? (otherlv_14= 'RosSubscribers' otherlv_15= '{' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )* otherlv_19= '}' )? (otherlv_20= 'RosSrvServers' otherlv_21= '{' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )* otherlv_25= '}' )? (otherlv_26= 'RosSrvClients' otherlv_27= '{' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )* otherlv_31= '}' )? (otherlv_32= 'RosActionServers' otherlv_33= '{' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )* otherlv_37= '}' )? (otherlv_38= 'RosActionClients' otherlv_39= '{' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )* otherlv_43= '}' )? (otherlv_44= 'RosParameters' otherlv_45= '{' ( (lv_rosparameter_46_0= ruleRosParameter ) ) (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )* otherlv_49= '}' )? otherlv_50= '}'
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

            // InternalComponentInterface.g:157:3: (otherlv_8= 'RosPublishers' otherlv_9= '{' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:158:4: otherlv_8= 'RosPublishers' otherlv_9= '{' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalComponentInterface.g:166:4: ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    // InternalComponentInterface.g:167:5: (lv_rospublisher_10_0= ruleRosPublisher )
                    {
                    // InternalComponentInterface.g:167:5: (lv_rospublisher_10_0= ruleRosPublisher )
                    // InternalComponentInterface.g:168:6: lv_rospublisher_10_0= ruleRosPublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rospublisher_10_0=ruleRosPublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rospublisher",
                    							lv_rospublisher_10_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:185:4: (otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==28) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalComponentInterface.g:186:5: otherlv_11= ',' ( (lv_rospublisher_12_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_11=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComponentInterface.g:190:5: ( (lv_rospublisher_12_0= ruleRosPublisher ) )
                    	    // InternalComponentInterface.g:191:6: (lv_rospublisher_12_0= ruleRosPublisher )
                    	    {
                    	    // InternalComponentInterface.g:191:6: (lv_rospublisher_12_0= ruleRosPublisher )
                    	    // InternalComponentInterface.g:192:7: lv_rospublisher_12_0= ruleRosPublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rospublisher_12_0=ruleRosPublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rospublisher",
                    	    								lv_rospublisher_12_0,
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

                    otherlv_13=(Token)match(input,29,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:215:3: (otherlv_14= 'RosSubscribers' otherlv_15= '{' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:216:4: otherlv_14= 'RosSubscribers' otherlv_15= '{' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalComponentInterface.g:224:4: ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    // InternalComponentInterface.g:225:5: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    {
                    // InternalComponentInterface.g:225:5: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    // InternalComponentInterface.g:226:6: lv_rossubscriber_16_0= ruleRosSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rossubscriber_16_0=ruleRosSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rossubscriber",
                    							lv_rossubscriber_16_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:243:4: (otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==28) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalComponentInterface.g:244:5: otherlv_17= ',' ( (lv_rossubscriber_18_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_17=(Token)match(input,28,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalComponentInterface.g:248:5: ( (lv_rossubscriber_18_0= ruleRosSubscriber ) )
                    	    // InternalComponentInterface.g:249:6: (lv_rossubscriber_18_0= ruleRosSubscriber )
                    	    {
                    	    // InternalComponentInterface.g:249:6: (lv_rossubscriber_18_0= ruleRosSubscriber )
                    	    // InternalComponentInterface.g:250:7: lv_rossubscriber_18_0= ruleRosSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rossubscriber_18_0=ruleRosSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rossubscriber",
                    	    								lv_rossubscriber_18_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,29,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:273:3: (otherlv_20= 'RosSrvServers' otherlv_21= '{' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )* otherlv_25= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:274:4: otherlv_20= 'RosSrvServers' otherlv_21= '{' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalComponentInterface.g:282:4: ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    // InternalComponentInterface.g:283:5: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    {
                    // InternalComponentInterface.g:283:5: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    // InternalComponentInterface.g:284:6: lv_rosserviceserver_22_0= ruleRosServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rosserviceserver_22_0=ruleRosServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceserver",
                    							lv_rosserviceserver_22_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:301:4: (otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==28) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalComponentInterface.g:302:5: otherlv_23= ',' ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_23=(Token)match(input,28,FOLLOW_14); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalComponentInterface.g:306:5: ( (lv_rosserviceserver_24_0= ruleRosServiceServer ) )
                    	    // InternalComponentInterface.g:307:6: (lv_rosserviceserver_24_0= ruleRosServiceServer )
                    	    {
                    	    // InternalComponentInterface.g:307:6: (lv_rosserviceserver_24_0= ruleRosServiceServer )
                    	    // InternalComponentInterface.g:308:7: lv_rosserviceserver_24_0= ruleRosServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rosserviceserver_24_0=ruleRosServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceserver",
                    	    								lv_rosserviceserver_24_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:331:3: (otherlv_26= 'RosSrvClients' otherlv_27= '{' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )* otherlv_31= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:332:4: otherlv_26= 'RosSrvClients' otherlv_27= '{' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_9_0());
                    			
                    otherlv_27=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalComponentInterface.g:340:4: ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    // InternalComponentInterface.g:341:5: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    {
                    // InternalComponentInterface.g:341:5: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    // InternalComponentInterface.g:342:6: lv_rosserviceclient_28_0= ruleRosServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rosserviceclient_28_0=ruleRosServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceclient",
                    							lv_rosserviceclient_28_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:359:4: (otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalComponentInterface.g:360:5: otherlv_29= ',' ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_29=(Token)match(input,28,FOLLOW_16); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalComponentInterface.g:364:5: ( (lv_rosserviceclient_30_0= ruleRosServiceClient ) )
                    	    // InternalComponentInterface.g:365:6: (lv_rosserviceclient_30_0= ruleRosServiceClient )
                    	    {
                    	    // InternalComponentInterface.g:365:6: (lv_rosserviceclient_30_0= ruleRosServiceClient )
                    	    // InternalComponentInterface.g:366:7: lv_rosserviceclient_30_0= ruleRosServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rosserviceclient_30_0=ruleRosServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceclient",
                    	    								lv_rosserviceclient_30_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,29,FOLLOW_17); 

                    				newLeafNode(otherlv_31, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:389:3: (otherlv_32= 'RosActionServers' otherlv_33= '{' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )* otherlv_37= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentInterface.g:390:4: otherlv_32= 'RosActionServers' otherlv_33= '{' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )* otherlv_37= '}'
                    {
                    otherlv_32=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_32, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_10_0());
                    			
                    otherlv_33=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_33, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalComponentInterface.g:398:4: ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    // InternalComponentInterface.g:399:5: (lv_rosactionserver_34_0= ruleRosActionServer )
                    {
                    // InternalComponentInterface.g:399:5: (lv_rosactionserver_34_0= ruleRosActionServer )
                    // InternalComponentInterface.g:400:6: lv_rosactionserver_34_0= ruleRosActionServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rosactionserver_34_0=ruleRosActionServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionserver",
                    							lv_rosactionserver_34_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:417:4: (otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalComponentInterface.g:418:5: otherlv_35= ',' ( (lv_rosactionserver_36_0= ruleRosActionServer ) )
                    	    {
                    	    otherlv_35=(Token)match(input,28,FOLLOW_18); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalComponentInterface.g:422:5: ( (lv_rosactionserver_36_0= ruleRosActionServer ) )
                    	    // InternalComponentInterface.g:423:6: (lv_rosactionserver_36_0= ruleRosActionServer )
                    	    {
                    	    // InternalComponentInterface.g:423:6: (lv_rosactionserver_36_0= ruleRosActionServer )
                    	    // InternalComponentInterface.g:424:7: lv_rosactionserver_36_0= ruleRosActionServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rosactionserver_36_0=ruleRosActionServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosactionserver",
                    	    								lv_rosactionserver_36_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_37, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:447:3: (otherlv_38= 'RosActionClients' otherlv_39= '{' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )* otherlv_43= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:448:4: otherlv_38= 'RosActionClients' otherlv_39= '{' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )* otherlv_43= '}'
                    {
                    otherlv_38=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_38, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_11_0());
                    			
                    otherlv_39=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_39, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalComponentInterface.g:456:4: ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    // InternalComponentInterface.g:457:5: (lv_rosactionclient_40_0= ruleRosActionClient )
                    {
                    // InternalComponentInterface.g:457:5: (lv_rosactionclient_40_0= ruleRosActionClient )
                    // InternalComponentInterface.g:458:6: lv_rosactionclient_40_0= ruleRosActionClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rosactionclient_40_0=ruleRosActionClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionclient",
                    							lv_rosactionclient_40_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:475:4: (otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==28) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalComponentInterface.g:476:5: otherlv_41= ',' ( (lv_rosactionclient_42_0= ruleRosActionClient ) )
                    	    {
                    	    otherlv_41=(Token)match(input,28,FOLLOW_20); 

                    	    					newLeafNode(otherlv_41, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalComponentInterface.g:480:5: ( (lv_rosactionclient_42_0= ruleRosActionClient ) )
                    	    // InternalComponentInterface.g:481:6: (lv_rosactionclient_42_0= ruleRosActionClient )
                    	    {
                    	    // InternalComponentInterface.g:481:6: (lv_rosactionclient_42_0= ruleRosActionClient )
                    	    // InternalComponentInterface.g:482:7: lv_rosactionclient_42_0= ruleRosActionClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rosactionclient_42_0=ruleRosActionClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosactionclient",
                    	    								lv_rosactionclient_42_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_43=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_43, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:505:3: (otherlv_44= 'RosParameters' otherlv_45= '{' ( (lv_rosparameter_46_0= ruleRosParameter ) ) (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )* otherlv_49= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:506:4: otherlv_44= 'RosParameters' otherlv_45= '{' ( (lv_rosparameter_46_0= ruleRosParameter ) ) (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )* otherlv_49= '}'
                    {
                    otherlv_44=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_44, grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_12_0());
                    			
                    otherlv_45=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_45, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalComponentInterface.g:514:4: ( (lv_rosparameter_46_0= ruleRosParameter ) )
                    // InternalComponentInterface.g:515:5: (lv_rosparameter_46_0= ruleRosParameter )
                    {
                    // InternalComponentInterface.g:515:5: (lv_rosparameter_46_0= ruleRosParameter )
                    // InternalComponentInterface.g:516:6: lv_rosparameter_46_0= ruleRosParameter
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_rosparameter_46_0=ruleRosParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosparameter",
                    							lv_rosparameter_46_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:533:4: (otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==28) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalComponentInterface.g:534:5: otherlv_47= ',' ( (lv_rosparameter_48_0= ruleRosParameter ) )
                    	    {
                    	    otherlv_47=(Token)match(input,28,FOLLOW_22); 

                    	    					newLeafNode(otherlv_47, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalComponentInterface.g:538:5: ( (lv_rosparameter_48_0= ruleRosParameter ) )
                    	    // InternalComponentInterface.g:539:6: (lv_rosparameter_48_0= ruleRosParameter )
                    	    {
                    	    // InternalComponentInterface.g:539:6: (lv_rosparameter_48_0= ruleRosParameter )
                    	    // InternalComponentInterface.g:540:7: lv_rosparameter_48_0= ruleRosParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_rosparameter_48_0=ruleRosParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosparameter",
                    	    								lv_rosparameter_48_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_49=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_49, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_50=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_50, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalComponentInterface.g:571:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalComponentInterface.g:571:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalComponentInterface.g:572:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalComponentInterface.g:578:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:584:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:585:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:585:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:586:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:586:3: ()
            // InternalComponentInterface.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalComponentInterface.g:597:3: ( (lv_name_2_0= ruleEString ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:598:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:598:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:599:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:620:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:621:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:625:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:626:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:626:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:627:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
            		
            // InternalComponentInterface.g:649:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:650:4: ( ruleEString )
            {
            // InternalComponentInterface.g:650:4: ( ruleEString )
            // InternalComponentInterface.g:651:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:673:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalComponentInterface.g:673:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalComponentInterface.g:674:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalComponentInterface.g:680:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:686:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:687:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:687:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:688:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:688:3: ()
            // InternalComponentInterface.g:689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalComponentInterface.g:699:3: ( (lv_name_2_0= ruleEString ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:700:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:700:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:701:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:722:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:723:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:727:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:728:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:728:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:729:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
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
            		
            // InternalComponentInterface.g:751:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:752:4: ( ruleEString )
            {
            // InternalComponentInterface.g:752:4: ( ruleEString )
            // InternalComponentInterface.g:753:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:775:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalComponentInterface.g:775:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalComponentInterface.g:776:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalComponentInterface.g:782:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:788:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:789:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:789:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:790:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:790:3: ()
            // InternalComponentInterface.g:791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalComponentInterface.g:801:3: ( (lv_name_2_0= ruleEString ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:802:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:802:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:803:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:824:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:825:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:829:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:830:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:830:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:831:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
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
            		
            // InternalComponentInterface.g:853:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:854:4: ( ruleEString )
            {
            // InternalComponentInterface.g:854:4: ( ruleEString )
            // InternalComponentInterface.g:855:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:877:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalComponentInterface.g:877:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalComponentInterface.g:878:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalComponentInterface.g:884:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:890:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:891:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:891:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:892:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:892:3: ()
            // InternalComponentInterface.g:893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalComponentInterface.g:903:3: ( (lv_name_2_0= ruleEString ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:904:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:904:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:905:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:926:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:927:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:931:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:932:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:932:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:933:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
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
            		
            // InternalComponentInterface.g:955:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:956:4: ( ruleEString )
            {
            // InternalComponentInterface.g:956:4: ( ruleEString )
            // InternalComponentInterface.g:957:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:979:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalComponentInterface.g:979:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalComponentInterface.g:980:2: iv_ruleRosActionServer= ruleRosActionServer EOF
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
    // InternalComponentInterface.g:986:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:992:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:993:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:993:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:994:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:994:3: ()
            // InternalComponentInterface.g:995:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalComponentInterface.g:1005:3: ( (lv_name_2_0= ruleEString ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1006:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1006:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1007:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1028:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:1029:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1033:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1034:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1034:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1035:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
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
            		
            // InternalComponentInterface.g:1057:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1058:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1058:4: ( ruleEString )
            // InternalComponentInterface.g:1059:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:1081:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalComponentInterface.g:1081:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalComponentInterface.g:1082:2: iv_ruleRosActionClient= ruleRosActionClient EOF
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
    // InternalComponentInterface.g:1088:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:1094:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:1095:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:1095:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:1096:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:1096:3: ()
            // InternalComponentInterface.g:1097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalComponentInterface.g:1107:3: ( (lv_name_2_0= ruleEString ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentInterface.g:1108:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1108:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1109:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1130:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentInterface.g:1131:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1135:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1136:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1136:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1137:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
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
            		
            // InternalComponentInterface.g:1159:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1160:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1160:4: ( ruleEString )
            // InternalComponentInterface.g:1161:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:1183:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalComponentInterface.g:1183:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalComponentInterface.g:1184:2: iv_ruleRosParameter= ruleRosParameter EOF
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
    // InternalComponentInterface.g:1190:1: ruleRosParameter returns [EObject current=null] : ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
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
            // InternalComponentInterface.g:1196:2: ( ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalComponentInterface.g:1197:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalComponentInterface.g:1197:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalComponentInterface.g:1198:3: () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            // InternalComponentInterface.g:1198:3: ()
            // InternalComponentInterface.g:1199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosParameterAccess().getRosParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getRosParameterKeyword_1());
            		
            // InternalComponentInterface.g:1209:3: ( (lv_name_2_0= ruleEString ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentInterface.g:1210:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1210:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1211:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1232:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentInterface.g:1233:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1237:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1238:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1238:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1239:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_34);
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
            		
            // InternalComponentInterface.g:1261:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1262:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1262:4: ( ruleEString )
            // InternalComponentInterface.g:1263:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:1277:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentInterface.g:1278:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_36); 

                    				newLeafNode(otherlv_8, grammarAccess.getRosParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalComponentInterface.g:1282:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalComponentInterface.g:1283:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalComponentInterface.g:1283:5: (lv_value_9_0= ruleParameterValue )
                    // InternalComponentInterface.g:1284:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:1310:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:1310:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:1311:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentInterface.g:1317:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1323:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:1324:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:1324:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentInterface.g:1325:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1333:3: this_ID_1= RULE_ID
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
    // InternalComponentInterface.g:1344:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalComponentInterface.g:1344:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalComponentInterface.g:1345:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalComponentInterface.g:1351:1: ruleParameterValue returns [EObject current=null] : (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) ;
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
            // InternalComponentInterface.g:1357:2: ( (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) )
            // InternalComponentInterface.g:1358:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            {
            // InternalComponentInterface.g:1358:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            int alt33=7;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalComponentInterface.g:1359:3: this_ParameterDouble_0= ruleParameterDouble
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
                    // InternalComponentInterface.g:1368:3: this_ParameterBoolean_1= ruleParameterBoolean
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
                    // InternalComponentInterface.g:1377:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalComponentInterface.g:1386:3: this_ParameterBase64_3= ruleParameterBase64
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
                    // InternalComponentInterface.g:1395:3: this_ParameterList_4= ruleParameterList
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
                    // InternalComponentInterface.g:1404:3: this_ParameterStruct_5= ruleParameterStruct
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
                    // InternalComponentInterface.g:1413:3: this_ParameterString_6= ruleParameterString
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
    // InternalComponentInterface.g:1425:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalComponentInterface.g:1425:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalComponentInterface.g:1426:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalComponentInterface.g:1432:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1438:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalComponentInterface.g:1439:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalComponentInterface.g:1439:2: ( (lv_value_0_0= ruleEString ) )
            // InternalComponentInterface.g:1440:3: (lv_value_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1440:3: (lv_value_0_0= ruleEString )
            // InternalComponentInterface.g:1441:4: lv_value_0_0= ruleEString
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
    // InternalComponentInterface.g:1461:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalComponentInterface.g:1461:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalComponentInterface.g:1462:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalComponentInterface.g:1468:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1474:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalComponentInterface.g:1475:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalComponentInterface.g:1475:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalComponentInterface.g:1476:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalComponentInterface.g:1476:3: (lv_value_0_0= ruleBase64Binary )
            // InternalComponentInterface.g:1477:4: lv_value_0_0= ruleBase64Binary
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
    // InternalComponentInterface.g:1497:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalComponentInterface.g:1497:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalComponentInterface.g:1498:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalComponentInterface.g:1504:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1510:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalComponentInterface.g:1511:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalComponentInterface.g:1511:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalComponentInterface.g:1512:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalComponentInterface.g:1512:3: (lv_value_0_0= ruleInteger0 )
            // InternalComponentInterface.g:1513:4: lv_value_0_0= ruleInteger0
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
    // InternalComponentInterface.g:1533:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalComponentInterface.g:1533:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalComponentInterface.g:1534:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalComponentInterface.g:1540:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1546:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalComponentInterface.g:1547:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalComponentInterface.g:1547:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalComponentInterface.g:1548:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalComponentInterface.g:1548:3: (lv_value_0_0= ruleDouble0 )
            // InternalComponentInterface.g:1549:4: lv_value_0_0= ruleDouble0
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
    // InternalComponentInterface.g:1569:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalComponentInterface.g:1569:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalComponentInterface.g:1570:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalComponentInterface.g:1576:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1582:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalComponentInterface.g:1583:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalComponentInterface.g:1583:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalComponentInterface.g:1584:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalComponentInterface.g:1584:3: (lv_value_0_0= ruleboolean0 )
            // InternalComponentInterface.g:1585:4: lv_value_0_0= ruleboolean0
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
    // InternalComponentInterface.g:1605:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalComponentInterface.g:1605:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalComponentInterface.g:1606:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalComponentInterface.g:1612:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1618:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalComponentInterface.g:1619:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalComponentInterface.g:1619:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalComponentInterface.g:1620:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalComponentInterface.g:1620:3: ()
            // InternalComponentInterface.g:1621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalComponentInterface.g:1631:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1632:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1632:4: (lv_value_2_0= ruleParameterValue )
            // InternalComponentInterface.g:1633:5: lv_value_2_0= ruleParameterValue
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

            // InternalComponentInterface.g:1650:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalComponentInterface.g:1651:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_36); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalComponentInterface.g:1655:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalComponentInterface.g:1656:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalComponentInterface.g:1656:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalComponentInterface.g:1657:6: lv_value_4_0= ruleParameterValue
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
            	    break loop34;
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
    // InternalComponentInterface.g:1683:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalComponentInterface.g:1683:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalComponentInterface.g:1684:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalComponentInterface.g:1690:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
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
            // InternalComponentInterface.g:1696:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalComponentInterface.g:1697:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalComponentInterface.g:1697:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalComponentInterface.g:1698:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalComponentInterface.g:1698:3: ()
            // InternalComponentInterface.g:1699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalComponentInterface.g:1705:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentInterface.g:1706:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalComponentInterface.g:1710:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalComponentInterface.g:1711:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalComponentInterface.g:1711:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalComponentInterface.g:1712:6: lv_value_2_0= ruleParameterStructMember
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

                    // InternalComponentInterface.g:1729:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==28) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1730:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalComponentInterface.g:1738:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalComponentInterface.g:1739:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalComponentInterface.g:1739:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalComponentInterface.g:1740:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop35;
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
    // InternalComponentInterface.g:1771:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalComponentInterface.g:1771:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalComponentInterface.g:1772:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalComponentInterface.g:1778:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1784:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) )
            // InternalComponentInterface.g:1785:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            {
            // InternalComponentInterface.g:1785:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            // InternalComponentInterface.g:1786:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}'
            {
            // InternalComponentInterface.g:1786:3: ( (lv_name_0_0= ruleEString ) )
            // InternalComponentInterface.g:1787:4: (lv_name_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1787:4: (lv_name_0_0= ruleEString )
            // InternalComponentInterface.g:1788:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,23,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getValueKeyword_2());
            		
            // InternalComponentInterface.g:1813:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1814:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1814:4: (lv_value_3_0= ruleParameterValue )
            // InternalComponentInterface.g:1815:5: lv_value_3_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
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
    // InternalComponentInterface.g:1840:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalComponentInterface.g:1840:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalComponentInterface.g:1841:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalComponentInterface.g:1847:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1853:2: (this_BINARY_0= RULE_BINARY )
            // InternalComponentInterface.g:1854:2: this_BINARY_0= RULE_BINARY
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
    // InternalComponentInterface.g:1864:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalComponentInterface.g:1864:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalComponentInterface.g:1865:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalComponentInterface.g:1871:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1877:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalComponentInterface.g:1878:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalComponentInterface.g:1888:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalComponentInterface.g:1888:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalComponentInterface.g:1889:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalComponentInterface.g:1895:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1901:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalComponentInterface.g:1902:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalComponentInterface.g:1912:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalComponentInterface.g:1912:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalComponentInterface.g:1913:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalComponentInterface.g:1919:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1925:2: (this_DECINT_0= RULE_DECINT )
            // InternalComponentInterface.g:1926:2: this_DECINT_0= RULE_DECINT
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


    protected DFA33 dfa33 = new DFA33(this);
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

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1358:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000FE0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000FA0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000F20000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000E20000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000C20000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000008003F0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});

}