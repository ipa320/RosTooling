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
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
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
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_5_0 = null;

        EObject lv_rospublisher_8_0 = null;

        EObject lv_rospublisher_10_0 = null;

        EObject lv_rossubscriber_14_0 = null;

        EObject lv_rossubscriber_16_0 = null;

        EObject lv_rosserviceserver_20_0 = null;

        EObject lv_rosserviceserver_22_0 = null;

        EObject lv_rosserviceclient_26_0 = null;

        EObject lv_rosserviceclient_28_0 = null;

        EObject lv_rosactionserver_32_0 = null;

        EObject lv_rosactionserver_34_0 = null;

        EObject lv_rosactionclient_38_0 = null;

        EObject lv_rosactionclient_40_0 = null;

        EObject lv_rosparameter_44_0 = null;

        EObject lv_rosparameter_46_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )? otherlv_48= '}'
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

            // InternalComponentInterface.g:135:3: (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:136:4: otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalComponentInterface.g:144:4: ( (lv_rospublisher_8_0= ruleRosPublisher ) )
                    // InternalComponentInterface.g:145:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    {
                    // InternalComponentInterface.g:145:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    // InternalComponentInterface.g:146:6: lv_rospublisher_8_0= ruleRosPublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rospublisher_8_0=ruleRosPublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rospublisher",
                    							lv_rospublisher_8_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:163:4: (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==27) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalComponentInterface.g:164:5: otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_9=(Token)match(input,27,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComponentInterface.g:168:5: ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    // InternalComponentInterface.g:169:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    {
                    	    // InternalComponentInterface.g:169:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    // InternalComponentInterface.g:170:7: lv_rospublisher_10_0= ruleRosPublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:193:3: (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:194:4: otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,23,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalComponentInterface.g:202:4: ( (lv_rossubscriber_14_0= ruleRosSubscriber ) )
                    // InternalComponentInterface.g:203:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    {
                    // InternalComponentInterface.g:203:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    // InternalComponentInterface.g:204:6: lv_rossubscriber_14_0= ruleRosSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rossubscriber_14_0=ruleRosSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rossubscriber",
                    							lv_rossubscriber_14_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:221:4: (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==27) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalComponentInterface.g:222:5: otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_15=(Token)match(input,27,FOLLOW_11); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComponentInterface.g:226:5: ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    // InternalComponentInterface.g:227:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    {
                    	    // InternalComponentInterface.g:227:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    // InternalComponentInterface.g:228:7: lv_rossubscriber_16_0= ruleRosSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:251:3: (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:252:4: otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalComponentInterface.g:260:4: ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) )
                    // InternalComponentInterface.g:261:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    {
                    // InternalComponentInterface.g:261:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    // InternalComponentInterface.g:262:6: lv_rosserviceserver_20_0= ruleRosServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rosserviceserver_20_0=ruleRosServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceserver",
                    							lv_rosserviceserver_20_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:279:4: (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalComponentInterface.g:280:5: otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,27,FOLLOW_13); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalComponentInterface.g:284:5: ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    // InternalComponentInterface.g:285:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    {
                    	    // InternalComponentInterface.g:285:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    // InternalComponentInterface.g:286:7: lv_rosserviceserver_22_0= ruleRosServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:309:3: (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:310:4: otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalComponentInterface.g:318:4: ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) )
                    // InternalComponentInterface.g:319:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    {
                    // InternalComponentInterface.g:319:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    // InternalComponentInterface.g:320:6: lv_rosserviceclient_26_0= ruleRosServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rosserviceclient_26_0=ruleRosServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceclient",
                    							lv_rosserviceclient_26_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:337:4: (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==27) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalComponentInterface.g:338:5: otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_27=(Token)match(input,27,FOLLOW_15); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalComponentInterface.g:342:5: ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    // InternalComponentInterface.g:343:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    {
                    	    // InternalComponentInterface.g:343:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    // InternalComponentInterface.g:344:7: lv_rosserviceclient_28_0= ruleRosServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_29, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:367:3: (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:368:4: otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_31, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalComponentInterface.g:376:4: ( (lv_rosactionserver_32_0= ruleRosActionServer ) )
                    // InternalComponentInterface.g:377:5: (lv_rosactionserver_32_0= ruleRosActionServer )
                    {
                    // InternalComponentInterface.g:377:5: (lv_rosactionserver_32_0= ruleRosActionServer )
                    // InternalComponentInterface.g:378:6: lv_rosactionserver_32_0= ruleRosActionServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rosactionserver_32_0=ruleRosActionServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionserver",
                    							lv_rosactionserver_32_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:395:4: (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComponentInterface.g:396:5: otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    	    {
                    	    otherlv_33=(Token)match(input,27,FOLLOW_17); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalComponentInterface.g:400:5: ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    	    // InternalComponentInterface.g:401:6: (lv_rosactionserver_34_0= ruleRosActionServer )
                    	    {
                    	    // InternalComponentInterface.g:401:6: (lv_rosactionserver_34_0= ruleRosActionServer )
                    	    // InternalComponentInterface.g:402:7: lv_rosactionserver_34_0= ruleRosActionServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_35, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:425:3: (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:426:4: otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0());
                    			
                    otherlv_37=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_37, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalComponentInterface.g:434:4: ( (lv_rosactionclient_38_0= ruleRosActionClient ) )
                    // InternalComponentInterface.g:435:5: (lv_rosactionclient_38_0= ruleRosActionClient )
                    {
                    // InternalComponentInterface.g:435:5: (lv_rosactionclient_38_0= ruleRosActionClient )
                    // InternalComponentInterface.g:436:6: lv_rosactionclient_38_0= ruleRosActionClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rosactionclient_38_0=ruleRosActionClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionclient",
                    							lv_rosactionclient_38_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosActionClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:453:4: (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==27) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalComponentInterface.g:454:5: otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    	    {
                    	    otherlv_39=(Token)match(input,27,FOLLOW_19); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalComponentInterface.g:458:5: ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    	    // InternalComponentInterface.g:459:6: (lv_rosactionclient_40_0= ruleRosActionClient )
                    	    {
                    	    // InternalComponentInterface.g:459:6: (lv_rosactionclient_40_0= ruleRosActionClient )
                    	    // InternalComponentInterface.g:460:7: lv_rosactionclient_40_0= ruleRosActionClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_41, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:483:3: (otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:484:4: otherlv_42= 'RosParameters' otherlv_43= '{' ( (lv_rosparameter_44_0= ruleRosParameter ) ) (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_42, grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_11_0());
                    			
                    otherlv_43=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_43, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalComponentInterface.g:492:4: ( (lv_rosparameter_44_0= ruleRosParameter ) )
                    // InternalComponentInterface.g:493:5: (lv_rosparameter_44_0= ruleRosParameter )
                    {
                    // InternalComponentInterface.g:493:5: (lv_rosparameter_44_0= ruleRosParameter )
                    // InternalComponentInterface.g:494:6: lv_rosparameter_44_0= ruleRosParameter
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_rosparameter_44_0=ruleRosParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosparameter",
                    							lv_rosparameter_44_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:511:4: (otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==27) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalComponentInterface.g:512:5: otherlv_45= ',' ( (lv_rosparameter_46_0= ruleRosParameter ) )
                    	    {
                    	    otherlv_45=(Token)match(input,27,FOLLOW_21); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalComponentInterface.g:516:5: ( (lv_rosparameter_46_0= ruleRosParameter ) )
                    	    // InternalComponentInterface.g:517:6: (lv_rosparameter_46_0= ruleRosParameter )
                    	    {
                    	    // InternalComponentInterface.g:517:6: (lv_rosparameter_46_0= ruleRosParameter )
                    	    // InternalComponentInterface.g:518:7: lv_rosparameter_46_0= ruleRosParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_47, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_48=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_48, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalComponentInterface.g:549:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalComponentInterface.g:549:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalComponentInterface.g:550:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalComponentInterface.g:556:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:562:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:563:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:563:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:564:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:564:3: ()
            // InternalComponentInterface.g:565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalComponentInterface.g:575:3: ( (lv_name_2_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:576:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:576:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:577:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:598:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:599:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:603:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:604:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:604:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:605:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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
            		
            // InternalComponentInterface.g:627:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:628:4: ( ruleEString )
            {
            // InternalComponentInterface.g:628:4: ( ruleEString )
            // InternalComponentInterface.g:629:5: ruleEString
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
    // InternalComponentInterface.g:651:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalComponentInterface.g:651:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalComponentInterface.g:652:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalComponentInterface.g:658:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:664:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:665:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:665:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:666:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:666:3: ()
            // InternalComponentInterface.g:667:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalComponentInterface.g:677:3: ( (lv_name_2_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:678:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:678:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:679:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:700:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:701:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:705:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:706:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:706:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:707:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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
            		
            // InternalComponentInterface.g:729:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:730:4: ( ruleEString )
            {
            // InternalComponentInterface.g:730:4: ( ruleEString )
            // InternalComponentInterface.g:731:5: ruleEString
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
    // InternalComponentInterface.g:753:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalComponentInterface.g:753:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalComponentInterface.g:754:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalComponentInterface.g:760:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:766:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:767:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:767:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:768:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:768:3: ()
            // InternalComponentInterface.g:769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalComponentInterface.g:779:3: ( (lv_name_2_0= ruleEString ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:780:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:780:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:781:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:802:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:803:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:807:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:808:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:808:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:809:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
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
            		
            // InternalComponentInterface.g:831:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:832:4: ( ruleEString )
            {
            // InternalComponentInterface.g:832:4: ( ruleEString )
            // InternalComponentInterface.g:833:5: ruleEString
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
    // InternalComponentInterface.g:855:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalComponentInterface.g:855:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalComponentInterface.g:856:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalComponentInterface.g:862:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:868:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:869:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:869:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:870:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:870:3: ()
            // InternalComponentInterface.g:871:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalComponentInterface.g:881:3: ( (lv_name_2_0= ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:882:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:882:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:883:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:904:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:905:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:909:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:910:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:910:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:911:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
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
            		
            // InternalComponentInterface.g:933:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:934:4: ( ruleEString )
            {
            // InternalComponentInterface.g:934:4: ( ruleEString )
            // InternalComponentInterface.g:935:5: ruleEString
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
    // InternalComponentInterface.g:957:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalComponentInterface.g:957:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalComponentInterface.g:958:2: iv_ruleRosActionServer= ruleRosActionServer EOF
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
    // InternalComponentInterface.g:964:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:970:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:971:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:971:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:972:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:972:3: ()
            // InternalComponentInterface.g:973:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalComponentInterface.g:983:3: ( (lv_name_2_0= ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:984:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:984:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:985:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1006:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1007:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1011:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1012:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1012:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1013:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
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
            		
            // InternalComponentInterface.g:1035:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1036:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1036:4: ( ruleEString )
            // InternalComponentInterface.g:1037:5: ruleEString
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
    // InternalComponentInterface.g:1059:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalComponentInterface.g:1059:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalComponentInterface.g:1060:2: iv_ruleRosActionClient= ruleRosActionClient EOF
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
    // InternalComponentInterface.g:1066:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:1072:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:1073:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:1073:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:1074:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:1074:3: ()
            // InternalComponentInterface.g:1075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalComponentInterface.g:1085:3: ( (lv_name_2_0= ruleEString ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:1086:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1086:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1087:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1108:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentInterface.g:1109:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1113:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1114:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1114:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1115:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
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
            		
            // InternalComponentInterface.g:1137:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1138:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1138:4: ( ruleEString )
            // InternalComponentInterface.g:1139:5: ruleEString
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
    // InternalComponentInterface.g:1161:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalComponentInterface.g:1161:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalComponentInterface.g:1162:2: iv_ruleRosParameter= ruleRosParameter EOF
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
    // InternalComponentInterface.g:1168:1: ruleRosParameter returns [EObject current=null] : ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) ;
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
            // InternalComponentInterface.g:1174:2: ( ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' ) )
            // InternalComponentInterface.g:1175:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            {
            // InternalComponentInterface.g:1175:2: ( () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}' )
            // InternalComponentInterface.g:1176:3: () otherlv_1= 'RosParameter' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefParameter' ( ( ruleEString ) ) (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )? otherlv_10= '}'
            {
            // InternalComponentInterface.g:1176:3: ()
            // InternalComponentInterface.g:1177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosParameterAccess().getRosParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getRosParameterKeyword_1());
            		
            // InternalComponentInterface.g:1187:3: ( (lv_name_2_0= ruleEString ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentInterface.g:1188:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1188:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1189:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1210:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentInterface.g:1211:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1215:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1216:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1216:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1217:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
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
            		
            // InternalComponentInterface.g:1239:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1240:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1240:4: ( ruleEString )
            // InternalComponentInterface.g:1241:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:1255:3: (otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentInterface.g:1256:4: otherlv_8= 'value' ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getRosParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalComponentInterface.g:1260:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalComponentInterface.g:1261:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalComponentInterface.g:1261:5: (lv_value_9_0= ruleParameterValue )
                    // InternalComponentInterface.g:1262:6: lv_value_9_0= ruleParameterValue
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
    // InternalComponentInterface.g:1288:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:1288:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:1289:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentInterface.g:1295:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1301:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:1302:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:1302:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentInterface.g:1303:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1311:3: this_ID_1= RULE_ID
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
    // InternalComponentInterface.g:1322:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalComponentInterface.g:1322:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalComponentInterface.g:1323:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalComponentInterface.g:1329:1: ruleParameterValue returns [EObject current=null] : (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) ;
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
            // InternalComponentInterface.g:1335:2: ( (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString ) )
            // InternalComponentInterface.g:1336:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            {
            // InternalComponentInterface.g:1336:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )
            int alt32=7;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalComponentInterface.g:1337:3: this_ParameterDouble_0= ruleParameterDouble
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
                    // InternalComponentInterface.g:1346:3: this_ParameterBoolean_1= ruleParameterBoolean
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
                    // InternalComponentInterface.g:1355:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalComponentInterface.g:1364:3: this_ParameterBase64_3= ruleParameterBase64
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
                    // InternalComponentInterface.g:1373:3: this_ParameterList_4= ruleParameterList
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
                    // InternalComponentInterface.g:1382:3: this_ParameterStruct_5= ruleParameterStruct
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
                    // InternalComponentInterface.g:1391:3: this_ParameterString_6= ruleParameterString
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
    // InternalComponentInterface.g:1403:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalComponentInterface.g:1403:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalComponentInterface.g:1404:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalComponentInterface.g:1410:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1416:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalComponentInterface.g:1417:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalComponentInterface.g:1417:2: ( (lv_value_0_0= ruleEString ) )
            // InternalComponentInterface.g:1418:3: (lv_value_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1418:3: (lv_value_0_0= ruleEString )
            // InternalComponentInterface.g:1419:4: lv_value_0_0= ruleEString
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
    // InternalComponentInterface.g:1439:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalComponentInterface.g:1439:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalComponentInterface.g:1440:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalComponentInterface.g:1446:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1452:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalComponentInterface.g:1453:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalComponentInterface.g:1453:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalComponentInterface.g:1454:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalComponentInterface.g:1454:3: (lv_value_0_0= ruleBase64Binary )
            // InternalComponentInterface.g:1455:4: lv_value_0_0= ruleBase64Binary
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
    // InternalComponentInterface.g:1475:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalComponentInterface.g:1475:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalComponentInterface.g:1476:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalComponentInterface.g:1482:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1488:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalComponentInterface.g:1489:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalComponentInterface.g:1489:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalComponentInterface.g:1490:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalComponentInterface.g:1490:3: (lv_value_0_0= ruleInteger0 )
            // InternalComponentInterface.g:1491:4: lv_value_0_0= ruleInteger0
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
    // InternalComponentInterface.g:1511:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalComponentInterface.g:1511:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalComponentInterface.g:1512:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalComponentInterface.g:1518:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1524:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalComponentInterface.g:1525:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalComponentInterface.g:1525:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalComponentInterface.g:1526:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalComponentInterface.g:1526:3: (lv_value_0_0= ruleDouble0 )
            // InternalComponentInterface.g:1527:4: lv_value_0_0= ruleDouble0
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
    // InternalComponentInterface.g:1547:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalComponentInterface.g:1547:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalComponentInterface.g:1548:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalComponentInterface.g:1554:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1560:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalComponentInterface.g:1561:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalComponentInterface.g:1561:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalComponentInterface.g:1562:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalComponentInterface.g:1562:3: (lv_value_0_0= ruleboolean0 )
            // InternalComponentInterface.g:1563:4: lv_value_0_0= ruleboolean0
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
    // InternalComponentInterface.g:1583:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalComponentInterface.g:1583:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalComponentInterface.g:1584:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalComponentInterface.g:1590:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1596:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalComponentInterface.g:1597:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalComponentInterface.g:1597:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalComponentInterface.g:1598:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalComponentInterface.g:1598:3: ()
            // InternalComponentInterface.g:1599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalComponentInterface.g:1609:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1610:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1610:4: (lv_value_2_0= ruleParameterValue )
            // InternalComponentInterface.g:1611:5: lv_value_2_0= ruleParameterValue
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

            // InternalComponentInterface.g:1628:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalComponentInterface.g:1629:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_35); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalComponentInterface.g:1633:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalComponentInterface.g:1634:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalComponentInterface.g:1634:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalComponentInterface.g:1635:6: lv_value_4_0= ruleParameterValue
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
            	    break loop33;
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
    // InternalComponentInterface.g:1661:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalComponentInterface.g:1661:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalComponentInterface.g:1662:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalComponentInterface.g:1668:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
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
            // InternalComponentInterface.g:1674:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalComponentInterface.g:1675:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalComponentInterface.g:1675:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalComponentInterface.g:1676:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalComponentInterface.g:1676:3: ()
            // InternalComponentInterface.g:1677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalComponentInterface.g:1683:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentInterface.g:1684:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalComponentInterface.g:1688:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalComponentInterface.g:1689:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalComponentInterface.g:1689:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalComponentInterface.g:1690:6: lv_value_2_0= ruleParameterStructMember
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

                    // InternalComponentInterface.g:1707:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==27) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1708:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalComponentInterface.g:1716:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalComponentInterface.g:1717:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalComponentInterface.g:1717:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalComponentInterface.g:1718:7: lv_value_5_0= ruleParameterStructMember
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
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,28,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
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
    // InternalComponentInterface.g:1749:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalComponentInterface.g:1749:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalComponentInterface.g:1750:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalComponentInterface.g:1756:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1762:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' ) )
            // InternalComponentInterface.g:1763:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            {
            // InternalComponentInterface.g:1763:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}' )
            // InternalComponentInterface.g:1764:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleParameterValue ) ) otherlv_4= '}'
            {
            // InternalComponentInterface.g:1764:3: ( (lv_name_0_0= ruleEString ) )
            // InternalComponentInterface.g:1765:4: (lv_name_0_0= ruleEString )
            {
            // InternalComponentInterface.g:1765:4: (lv_name_0_0= ruleEString )
            // InternalComponentInterface.g:1766:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,23,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,48,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getValueKeyword_2());
            		
            // InternalComponentInterface.g:1791:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalComponentInterface.g:1792:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalComponentInterface.g:1792:4: (lv_value_3_0= ruleParameterValue )
            // InternalComponentInterface.g:1793:5: lv_value_3_0= ruleParameterValue
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
    // InternalComponentInterface.g:1818:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalComponentInterface.g:1818:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalComponentInterface.g:1819:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalComponentInterface.g:1825:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1831:2: (this_BINARY_0= RULE_BINARY )
            // InternalComponentInterface.g:1832:2: this_BINARY_0= RULE_BINARY
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
    // InternalComponentInterface.g:1842:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalComponentInterface.g:1842:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalComponentInterface.g:1843:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalComponentInterface.g:1849:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1855:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalComponentInterface.g:1856:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalComponentInterface.g:1866:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalComponentInterface.g:1866:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalComponentInterface.g:1867:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalComponentInterface.g:1873:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1879:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalComponentInterface.g:1880:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalComponentInterface.g:1890:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalComponentInterface.g:1890:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalComponentInterface.g:1891:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalComponentInterface.g:1897:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1903:2: (this_DECINT_0= RULE_DECINT )
            // InternalComponentInterface.g:1904:2: this_DECINT_0= RULE_DECINT
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


    protected DFA32 dfa32 = new DFA32(this);
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

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1336:2: (this_ParameterDouble_0= ruleParameterDouble | this_ParameterBoolean_1= ruleParameterBoolean | this_ParameterInteger_2= ruleParameterInteger | this_ParameterBase64_3= ruleParameterBase64 | this_ParameterList_4= ruleParameterList | this_ParameterStruct_5= ruleParameterStruct | this_ParameterString_6= ruleParameterString )";
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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000007F0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000007D0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000790000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000710000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000610000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000081000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000801000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000008003F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});

}