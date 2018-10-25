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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'namespace'", "'RosTopicPublisher'", "','", "'}'", "'RosTopicSubscriber'", "'RosServiceServer'", "'RosServiceClient'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'ServiceServer'", "'ServiceName'", "'SrvRef'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosTopicPublisher' otherlv_7= '{' ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosTopicSubscriber' otherlv_13= '{' ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosServiceServer' otherlv_19= '{' ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosServiceClient' otherlv_25= '{' ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_RosTopicPublisher_8_0 = null;

        EObject lv_RosTopicPublisher_10_0 = null;

        EObject lv_RosTopicSubscriber_14_0 = null;

        EObject lv_RosTopicSubscriber_16_0 = null;

        EObject lv_RosServiceServer_20_0 = null;

        EObject lv_RosServiceServer_22_0 = null;

        EObject lv_RosServiceClient_26_0 = null;

        EObject lv_RosServiceClient_28_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosTopicPublisher' otherlv_7= '{' ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosTopicSubscriber' otherlv_13= '{' ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosServiceServer' otherlv_19= '{' ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosServiceClient' otherlv_25= '{' ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosTopicPublisher' otherlv_7= '{' ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosTopicSubscriber' otherlv_13= '{' ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosServiceServer' otherlv_19= '{' ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosServiceClient' otherlv_25= '{' ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosTopicPublisher' otherlv_7= '{' ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosTopicSubscriber' otherlv_13= '{' ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosServiceServer' otherlv_19= '{' ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosServiceClient' otherlv_25= '{' ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'RosTopicPublisher' otherlv_7= '{' ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosTopicSubscriber' otherlv_13= '{' ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosServiceServer' otherlv_19= '{' ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosServiceClient' otherlv_25= '{' ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}'
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

            // InternalComponentInterface.g:110:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:111:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNamespaceKeyword_4_0());
                    			
                    // InternalComponentInterface.g:115:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalComponentInterface.g:116:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalComponentInterface.g:116:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalComponentInterface.g:117:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:135:3: (otherlv_6= 'RosTopicPublisher' otherlv_7= '{' ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:136:4: otherlv_6= 'RosTopicPublisher' otherlv_7= '{' ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalComponentInterface.g:144:4: ( (lv_RosTopicPublisher_8_0= ruleRosPublisher ) )
                    // InternalComponentInterface.g:145:5: (lv_RosTopicPublisher_8_0= ruleRosPublisher )
                    {
                    // InternalComponentInterface.g:145:5: (lv_RosTopicPublisher_8_0= ruleRosPublisher )
                    // InternalComponentInterface.g:146:6: lv_RosTopicPublisher_8_0= ruleRosPublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherRosPublisherParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_RosTopicPublisher_8_0=ruleRosPublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosTopicPublisher",
                    							lv_RosTopicPublisher_8_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosPublisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:163:4: (otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalComponentInterface.g:164:5: otherlv_9= ',' ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalComponentInterface.g:168:5: ( (lv_RosTopicPublisher_10_0= ruleRosPublisher ) )
                    	    // InternalComponentInterface.g:169:6: (lv_RosTopicPublisher_10_0= ruleRosPublisher )
                    	    {
                    	    // InternalComponentInterface.g:169:6: (lv_RosTopicPublisher_10_0= ruleRosPublisher )
                    	    // InternalComponentInterface.g:170:7: lv_RosTopicPublisher_10_0= ruleRosPublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherRosPublisherParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_RosTopicPublisher_10_0=ruleRosPublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"RosTopicPublisher",
                    	    								lv_RosTopicPublisher_10_0,
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

                    otherlv_11=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:193:3: (otherlv_12= 'RosTopicSubscriber' otherlv_13= '{' ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:194:4: otherlv_12= 'RosTopicSubscriber' otherlv_13= '{' ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalComponentInterface.g:202:4: ( (lv_RosTopicSubscriber_14_0= ruleRosSubscriber ) )
                    // InternalComponentInterface.g:203:5: (lv_RosTopicSubscriber_14_0= ruleRosSubscriber )
                    {
                    // InternalComponentInterface.g:203:5: (lv_RosTopicSubscriber_14_0= ruleRosSubscriber )
                    // InternalComponentInterface.g:204:6: lv_RosTopicSubscriber_14_0= ruleRosSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberRosSubscriberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_RosTopicSubscriber_14_0=ruleRosSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosTopicSubscriber",
                    							lv_RosTopicSubscriber_14_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosSubscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:221:4: (otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalComponentInterface.g:222:5: otherlv_15= ',' ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalComponentInterface.g:226:5: ( (lv_RosTopicSubscriber_16_0= ruleRosSubscriber ) )
                    	    // InternalComponentInterface.g:227:6: (lv_RosTopicSubscriber_16_0= ruleRosSubscriber )
                    	    {
                    	    // InternalComponentInterface.g:227:6: (lv_RosTopicSubscriber_16_0= ruleRosSubscriber )
                    	    // InternalComponentInterface.g:228:7: lv_RosTopicSubscriber_16_0= ruleRosSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberRosSubscriberParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_RosTopicSubscriber_16_0=ruleRosSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"RosTopicSubscriber",
                    	    								lv_RosTopicSubscriber_16_0,
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

                    otherlv_17=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:251:3: (otherlv_18= 'RosServiceServer' otherlv_19= '{' ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:252:4: otherlv_18= 'RosServiceServer' otherlv_19= '{' ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRosServiceServerKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalComponentInterface.g:260:4: ( (lv_RosServiceServer_20_0= ruleRosServiceServer ) )
                    // InternalComponentInterface.g:261:5: (lv_RosServiceServer_20_0= ruleRosServiceServer )
                    {
                    // InternalComponentInterface.g:261:5: (lv_RosServiceServer_20_0= ruleRosServiceServer )
                    // InternalComponentInterface.g:262:6: lv_RosServiceServer_20_0= ruleRosServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceServerRosServiceServerParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_RosServiceServer_20_0=ruleRosServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosServiceServer",
                    							lv_RosServiceServer_20_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:279:4: (otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalComponentInterface.g:280:5: otherlv_21= ',' ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_14); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalComponentInterface.g:284:5: ( (lv_RosServiceServer_22_0= ruleRosServiceServer ) )
                    	    // InternalComponentInterface.g:285:6: (lv_RosServiceServer_22_0= ruleRosServiceServer )
                    	    {
                    	    // InternalComponentInterface.g:285:6: (lv_RosServiceServer_22_0= ruleRosServiceServer )
                    	    // InternalComponentInterface.g:286:7: lv_RosServiceServer_22_0= ruleRosServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceServerRosServiceServerParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_RosServiceServer_22_0=ruleRosServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"RosServiceServer",
                    	    								lv_RosServiceServer_22_0,
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

                    otherlv_23=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalComponentInterface.g:309:3: (otherlv_24= 'RosServiceClient' otherlv_25= '{' ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:310:4: otherlv_24= 'RosServiceClient' otherlv_25= '{' ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRosServiceClientKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalComponentInterface.g:318:4: ( (lv_RosServiceClient_26_0= ruleRosServiceClient ) )
                    // InternalComponentInterface.g:319:5: (lv_RosServiceClient_26_0= ruleRosServiceClient )
                    {
                    // InternalComponentInterface.g:319:5: (lv_RosServiceClient_26_0= ruleRosServiceClient )
                    // InternalComponentInterface.g:320:6: lv_RosServiceClient_26_0= ruleRosServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceClientRosServiceClientParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_RosServiceClient_26_0=ruleRosServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosServiceClient",
                    							lv_RosServiceClient_26_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.RosServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:337:4: (otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalComponentInterface.g:338:5: otherlv_27= ',' ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_14); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalComponentInterface.g:342:5: ( (lv_RosServiceClient_28_0= ruleRosServiceClient ) )
                    	    // InternalComponentInterface.g:343:6: (lv_RosServiceClient_28_0= ruleRosServiceClient )
                    	    {
                    	    // InternalComponentInterface.g:343:6: (lv_RosServiceClient_28_0= ruleRosServiceClient )
                    	    // InternalComponentInterface.g:344:7: lv_RosServiceClient_28_0= ruleRosServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceClientRosServiceClientParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_RosServiceClient_28_0=ruleRosServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"RosServiceClient",
                    	    								lv_RosServiceClient_28_0,
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

            otherlv_30=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:375:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:375:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:376:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentInterface.g:382:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:388:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalComponentInterface.g:389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalComponentInterface.g:389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:390:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:398:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleNamespace"
    // InternalComponentInterface.g:409:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalComponentInterface.g:409:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalComponentInterface.g:410:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalComponentInterface.g:416:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:422:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalComponentInterface.g:423:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalComponentInterface.g:423:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
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
                    // InternalComponentInterface.g:424:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalComponentInterface.g:433:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalComponentInterface.g:442:3: this_PrivateNamespace_2= rulePrivateNamespace
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
    // InternalComponentInterface.g:454:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalComponentInterface.g:454:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalComponentInterface.g:455:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalComponentInterface.g:461:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalComponentInterface.g:467:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:468:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:468:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:469:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:469:3: ()
            // InternalComponentInterface.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:484:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:485:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:493:4: ( (lv_parts_5_0= ruleEString ) )
                    // InternalComponentInterface.g:494:5: (lv_parts_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:494:5: (lv_parts_5_0= ruleEString )
                    // InternalComponentInterface.g:495:6: lv_parts_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parts_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:512:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalComponentInterface.g:513:5: otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:517:5: ( (lv_parts_7_0= ruleEString ) )
                    	    // InternalComponentInterface.g:518:6: (lv_parts_7_0= ruleEString )
                    	    {
                    	    // InternalComponentInterface.g:518:6: (lv_parts_7_0= ruleEString )
                    	    // InternalComponentInterface.g:519:7: lv_parts_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parts_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentInterface.g:550:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalComponentInterface.g:550:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalComponentInterface.g:551:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalComponentInterface.g:557:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalComponentInterface.g:563:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:564:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:564:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:565:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:565:3: ()
            // InternalComponentInterface.g:566:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:580:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:581:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:589:4: ( (lv_parts_5_0= ruleEString ) )
                    // InternalComponentInterface.g:590:5: (lv_parts_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:590:5: (lv_parts_5_0= ruleEString )
                    // InternalComponentInterface.g:591:6: lv_parts_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parts_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:608:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalComponentInterface.g:609:5: otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:613:5: ( (lv_parts_7_0= ruleEString ) )
                    	    // InternalComponentInterface.g:614:6: (lv_parts_7_0= ruleEString )
                    	    {
                    	    // InternalComponentInterface.g:614:6: (lv_parts_7_0= ruleEString )
                    	    // InternalComponentInterface.g:615:7: lv_parts_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parts_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

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
    // InternalComponentInterface.g:646:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalComponentInterface.g:646:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalComponentInterface.g:647:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalComponentInterface.g:653:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalComponentInterface.g:659:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:660:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:660:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:661:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:661:3: ()
            // InternalComponentInterface.g:662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:676:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:677:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:685:4: ( (lv_parts_5_0= ruleEString ) )
                    // InternalComponentInterface.g:686:5: (lv_parts_5_0= ruleEString )
                    {
                    // InternalComponentInterface.g:686:5: (lv_parts_5_0= ruleEString )
                    // InternalComponentInterface.g:687:6: lv_parts_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parts_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:704:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalComponentInterface.g:705:5: otherlv_6= ',' ( (lv_parts_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:709:5: ( (lv_parts_7_0= ruleEString ) )
                    	    // InternalComponentInterface.g:710:6: (lv_parts_7_0= ruleEString )
                    	    {
                    	    // InternalComponentInterface.g:710:6: (lv_parts_7_0= ruleEString )
                    	    // InternalComponentInterface.g:711:7: lv_parts_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_parts_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRosPublisher"
    // InternalComponentInterface.g:742:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalComponentInterface.g:742:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalComponentInterface.g:743:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalComponentInterface.g:749:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleRosPublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_TopicName_4_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_8_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:755:2: ( ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:756:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:756:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:757:3: () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:757:3: ()
            // InternalComponentInterface.g:758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getPublisherKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:772:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:773:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:777:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:778:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:778:5: (lv_TopicName_4_0= ruleEString )
                    // InternalComponentInterface.g:779:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:797:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:798:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosPublisherAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:802:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:803:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:803:5: ( ruleEString )
                    // InternalComponentInterface.g:804:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosPublisherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getTopicRefPublisherCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:819:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:820:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRosPublisherAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:824:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:825:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:825:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:826:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosPublisherRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalComponentInterface.g:852:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalComponentInterface.g:852:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalComponentInterface.g:853:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalComponentInterface.g:859:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleRosSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_TopicName_4_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_8_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:865:2: ( ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:866:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:866:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:867:3: () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:867:3: ()
            // InternalComponentInterface.g:868:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getSubscriberKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:882:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:883:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:887:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:888:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:888:5: (lv_TopicName_4_0= ruleEString )
                    // InternalComponentInterface.g:889:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:907:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:908:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosSubscriberAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:912:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:913:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:913:5: ( ruleEString )
                    // InternalComponentInterface.g:914:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosSubscriberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:929:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:930:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRosSubscriberAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:934:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:935:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:935:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:936:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalComponentInterface.g:962:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalComponentInterface.g:962:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalComponentInterface.g:963:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalComponentInterface.g:969:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleRosServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_ServiceName_4_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_8_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:975:2: ( ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:976:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:976:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:977:3: () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:977:3: ()
            // InternalComponentInterface.g:978:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getServiceServerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:992:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:993:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:997:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:998:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:998:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalComponentInterface.g:999:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:1017:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1018:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosServiceServerAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1022:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:1023:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:1023:5: ( ruleEString )
                    // InternalComponentInterface.g:1024:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosServiceServerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:1039:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:1040:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRosServiceServerAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:1044:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:1045:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1045:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:1046:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalComponentInterface.g:1072:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalComponentInterface.g:1072:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalComponentInterface.g:1073:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalComponentInterface.g:1079:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleRosServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_ServiceName_4_0 = null;

        AntlrDatatypeRuleToken lv_NameSpace_8_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:1085:2: ( ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:1086:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:1086:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:1087:3: () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:1087:3: ()
            // InternalComponentInterface.g:1088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getServiceServerKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:1102:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentInterface.g:1103:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:1107:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:1108:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1108:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalComponentInterface.g:1109:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:1127:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentInterface.g:1128:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosServiceClientAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1132:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:1133:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:1133:5: ( ruleEString )
                    // InternalComponentInterface.g:1134:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosServiceClientRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:1149:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentInterface.g:1150:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRosServiceClientAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:1154:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:1155:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1155:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:1156:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRosServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.componentInterface.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_6());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001EC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001C020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000190020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000110020000L});

}