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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'NameSpace'", "'RosPublishers'", "','", "'}'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) ;
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



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

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

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:111:4: otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_5); 

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

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:136:4: otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_8); 

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

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalComponentInterface.g:164:5: otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

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

                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:193:3: (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:194:4: otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_11); 

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

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalComponentInterface.g:222:5: otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_11); 

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

                    otherlv_17=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:251:3: (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:252:4: otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_13); 

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

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalComponentInterface.g:280:5: otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_13); 

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

                    otherlv_23=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:309:3: (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:310:4: otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_15); 

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

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalComponentInterface.g:338:5: otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_15); 

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

                    otherlv_29=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_29, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:367:3: (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:368:4: otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_17); 

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

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComponentInterface.g:396:5: otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    	    {
                    	    otherlv_33=(Token)match(input,16,FOLLOW_17); 

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

                    otherlv_35=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_35, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:425:3: (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:426:4: otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0());
                    			
                    otherlv_37=(Token)match(input,12,FOLLOW_19); 

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

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalComponentInterface.g:454:5: otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    	    {
                    	    otherlv_39=(Token)match(input,16,FOLLOW_19); 

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

                    otherlv_41=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_41, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_42, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalComponentInterface.g:491:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalComponentInterface.g:491:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalComponentInterface.g:492:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalComponentInterface.g:498:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:504:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:505:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:505:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:506:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:506:3: ()
            // InternalComponentInterface.g:507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalComponentInterface.g:517:3: ( (lv_name_2_0= ruleEString ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:518:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:518:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:519:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:540:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:541:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:545:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:546:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:546:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:547:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            otherlv_6=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5());
            		
            // InternalComponentInterface.g:569:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:570:4: ( ruleEString )
            {
            // InternalComponentInterface.g:570:4: ( ruleEString )
            // InternalComponentInterface.g:571:5: ruleEString
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentInterface.g:593:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalComponentInterface.g:593:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalComponentInterface.g:594:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalComponentInterface.g:600:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:606:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:607:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:607:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:608:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:608:3: ()
            // InternalComponentInterface.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalComponentInterface.g:619:3: ( (lv_name_2_0= ruleEString ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:620:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:620:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:621:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:642:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:643:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:647:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:648:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:648:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:649:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            otherlv_6=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5());
            		
            // InternalComponentInterface.g:671:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:672:4: ( ruleEString )
            {
            // InternalComponentInterface.g:672:4: ( ruleEString )
            // InternalComponentInterface.g:673:5: ruleEString
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentInterface.g:695:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalComponentInterface.g:695:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalComponentInterface.g:696:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalComponentInterface.g:702:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:708:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:709:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:709:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:710:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:710:3: ()
            // InternalComponentInterface.g:711:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalComponentInterface.g:721:3: ( (lv_name_2_0= ruleEString ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:722:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:722:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:723:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:744:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:745:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:749:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:750:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:750:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:751:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_6=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5());
            		
            // InternalComponentInterface.g:773:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:774:4: ( ruleEString )
            {
            // InternalComponentInterface.g:774:4: ( ruleEString )
            // InternalComponentInterface.g:775:5: ruleEString
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentInterface.g:797:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalComponentInterface.g:797:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalComponentInterface.g:798:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalComponentInterface.g:804:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:810:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:811:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:811:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:812:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:812:3: ()
            // InternalComponentInterface.g:813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalComponentInterface.g:823:3: ( (lv_name_2_0= ruleEString ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:824:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:824:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:825:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:846:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:847:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:851:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:852:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:852:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:853:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

            otherlv_6=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5());
            		
            // InternalComponentInterface.g:875:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:876:4: ( ruleEString )
            {
            // InternalComponentInterface.g:876:4: ( ruleEString )
            // InternalComponentInterface.g:877:5: ruleEString
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentInterface.g:899:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalComponentInterface.g:899:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalComponentInterface.g:900:2: iv_ruleRosActionServer= ruleRosActionServer EOF
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
    // InternalComponentInterface.g:906:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:912:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:913:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:913:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:914:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:914:3: ()
            // InternalComponentInterface.g:915:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalComponentInterface.g:925:3: ( (lv_name_2_0= ruleEString ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:926:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:926:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:927:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:948:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:949:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:953:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:954:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:954:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:955:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_6=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionServerAccess().getRefServerKeyword_5());
            		
            // InternalComponentInterface.g:977:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:978:4: ( ruleEString )
            {
            // InternalComponentInterface.g:978:4: ( ruleEString )
            // InternalComponentInterface.g:979:5: ruleEString
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentInterface.g:1001:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalComponentInterface.g:1001:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalComponentInterface.g:1002:2: iv_ruleRosActionClient= ruleRosActionClient EOF
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
    // InternalComponentInterface.g:1008:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalComponentInterface.g:1014:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalComponentInterface.g:1015:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalComponentInterface.g:1015:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalComponentInterface.g:1016:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalComponentInterface.g:1016:3: ()
            // InternalComponentInterface.g:1017:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalComponentInterface.g:1027:3: ( (lv_name_2_0= ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:1028:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1028:4: (lv_name_2_0= ruleEString )
                    // InternalComponentInterface.g:1029:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalComponentInterface.g:1050:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1051:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1055:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalComponentInterface.g:1056:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1056:5: (lv_ns_5_0= ruleEString )
                    // InternalComponentInterface.g:1057:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
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

            otherlv_6=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionClientAccess().getRefClientKeyword_5());
            		
            // InternalComponentInterface.g:1079:3: ( ( ruleEString ) )
            // InternalComponentInterface.g:1080:4: ( ruleEString )
            {
            // InternalComponentInterface.g:1080:4: ( ruleEString )
            // InternalComponentInterface.g:1081:5: ruleEString
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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:1103:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:1103:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:1104:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentInterface.g:1110:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:1116:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:1117:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:1117:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalComponentInterface.g:1118:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1126:3: this_ID_1= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007EC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007E8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000007A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000720000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});

}