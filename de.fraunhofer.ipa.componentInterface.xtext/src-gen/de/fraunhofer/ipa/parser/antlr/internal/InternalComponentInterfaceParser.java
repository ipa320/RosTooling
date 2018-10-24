package de.fraunhofer.ipa.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_STRING_SLASH", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'namespace'", "'publisher'", "'subscriber'", "'serviceServer'", "'serviceClient'", "'}'", "'GraphName'", "'GlobalNamespace'", "'parts'", "','", "'RelativeNamespace'", "'PrivateNamespace'", "'Publisher'", "'TopicName'", "'TopicRef'", "'NameSpace'", "'Subscriber'", "'ServiceServer'", "'ServiceName'", "'SrvRef'"
    };
    public static final int RULE_STRING_SLASH=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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
    // InternalComponentInterface.g:71:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleComponentInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_RosTopicPublisher_7_0 = null;

        EObject lv_RosTopicSubscriber_9_0 = null;

        EObject lv_RosServiceServer_11_0 = null;

        EObject lv_RosServiceClient_13_0 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:77:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' ) )
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' )
            {
            // InternalComponentInterface.g:78:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}' )
            // InternalComponentInterface.g:79:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )? (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )? (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )? (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

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
            						"de.fraunhofer.ipa.ComponentInterface.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalComponentInterface.g:110:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:111:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_7); 

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
                    							"de.fraunhofer.ipa.ComponentInterface.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:135:3: (otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:136:4: otherlv_6= 'publisher' ( (lv_RosTopicPublisher_7_0= rulePublisher ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getPublisherKeyword_5_0());
                    			
                    // InternalComponentInterface.g:140:4: ( (lv_RosTopicPublisher_7_0= rulePublisher ) )
                    // InternalComponentInterface.g:141:5: (lv_RosTopicPublisher_7_0= rulePublisher )
                    {
                    // InternalComponentInterface.g:141:5: (lv_RosTopicPublisher_7_0= rulePublisher )
                    // InternalComponentInterface.g:142:6: lv_RosTopicPublisher_7_0= rulePublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicPublisherPublisherParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_RosTopicPublisher_7_0=rulePublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosTopicPublisher",
                    							lv_RosTopicPublisher_7_0,
                    							"de.fraunhofer.ipa.ComponentInterface.Publisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:160:3: (otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:161:4: otherlv_8= 'subscriber' ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getComponentInterfaceAccess().getSubscriberKeyword_6_0());
                    			
                    // InternalComponentInterface.g:165:4: ( (lv_RosTopicSubscriber_9_0= ruleSubscriber ) )
                    // InternalComponentInterface.g:166:5: (lv_RosTopicSubscriber_9_0= ruleSubscriber )
                    {
                    // InternalComponentInterface.g:166:5: (lv_RosTopicSubscriber_9_0= ruleSubscriber )
                    // InternalComponentInterface.g:167:6: lv_RosTopicSubscriber_9_0= ruleSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosTopicSubscriberSubscriberParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_RosTopicSubscriber_9_0=ruleSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosTopicSubscriber",
                    							lv_RosTopicSubscriber_9_0,
                    							"de.fraunhofer.ipa.ComponentInterface.Subscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:185:3: (otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:186:4: otherlv_10= 'serviceServer' ( (lv_RosServiceServer_11_0= ruleServiceServer ) )
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getComponentInterfaceAccess().getServiceServerKeyword_7_0());
                    			
                    // InternalComponentInterface.g:190:4: ( (lv_RosServiceServer_11_0= ruleServiceServer ) )
                    // InternalComponentInterface.g:191:5: (lv_RosServiceServer_11_0= ruleServiceServer )
                    {
                    // InternalComponentInterface.g:191:5: (lv_RosServiceServer_11_0= ruleServiceServer )
                    // InternalComponentInterface.g:192:6: lv_RosServiceServer_11_0= ruleServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceServerServiceServerParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_RosServiceServer_11_0=ruleServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosServiceServer",
                    							lv_RosServiceServer_11_0,
                    							"de.fraunhofer.ipa.ComponentInterface.ServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:210:3: (otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:211:4: otherlv_12= 'serviceClient' ( (lv_RosServiceClient_13_0= ruleServiceClient ) )
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getServiceClientKeyword_8_0());
                    			
                    // InternalComponentInterface.g:215:4: ( (lv_RosServiceClient_13_0= ruleServiceClient ) )
                    // InternalComponentInterface.g:216:5: (lv_RosServiceClient_13_0= ruleServiceClient )
                    {
                    // InternalComponentInterface.g:216:5: (lv_RosServiceClient_13_0= ruleServiceClient )
                    // InternalComponentInterface.g:217:6: lv_RosServiceClient_13_0= ruleServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosServiceClientServiceClientParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_RosServiceClient_13_0=ruleServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"RosServiceClient",
                    							lv_RosServiceClient_13_0,
                    							"de.fraunhofer.ipa.ComponentInterface.ServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleNamespace"
    // InternalComponentInterface.g:243:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalComponentInterface.g:243:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalComponentInterface.g:244:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalComponentInterface.g:250:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalComponentInterface.g:256:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalComponentInterface.g:257:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalComponentInterface.g:257:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:258:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalComponentInterface.g:267:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalComponentInterface.g:276:3: this_PrivateNamespace_2= rulePrivateNamespace
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


    // $ANTLR start "entryRuleGraphName"
    // InternalComponentInterface.g:288:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalComponentInterface.g:288:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalComponentInterface.g:289:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalComponentInterface.g:295:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= 'GraphName' ) ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:301:2: ( (this_STRING_0= RULE_STRING | kw= 'GraphName' ) )
            // InternalComponentInterface.g:302:2: (this_STRING_0= RULE_STRING | kw= 'GraphName' )
            {
            // InternalComponentInterface.g:302:2: (this_STRING_0= RULE_STRING | kw= 'GraphName' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:303:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getGraphNameAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:311:3: kw= 'GraphName'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword_1());
                    		

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
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalComponentInterface.g:320:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalComponentInterface.g:320:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalComponentInterface.g:321:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalComponentInterface.g:327:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalComponentInterface.g:333:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:334:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:334:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:335:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:335:3: ()
            // InternalComponentInterface.g:336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:350:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:351:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:359:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalComponentInterface.g:360:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalComponentInterface.g:360:5: (lv_parts_5_0= ruleGraphName )
                    // InternalComponentInterface.g:361:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ComponentInterface.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:378:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==24) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalComponentInterface.g:379:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_17); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:383:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalComponentInterface.g:384:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalComponentInterface.g:384:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalComponentInterface.g:385:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ComponentInterface.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

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
    // InternalComponentInterface.g:416:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalComponentInterface.g:416:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalComponentInterface.g:417:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalComponentInterface.g:423:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalComponentInterface.g:429:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:430:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:430:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:431:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:431:3: ()
            // InternalComponentInterface.g:432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:446:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentInterface.g:447:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:455:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalComponentInterface.g:456:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalComponentInterface.g:456:5: (lv_parts_5_0= ruleGraphName )
                    // InternalComponentInterface.g:457:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ComponentInterface.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:474:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalComponentInterface.g:475:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_17); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:479:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalComponentInterface.g:480:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalComponentInterface.g:480:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalComponentInterface.g:481:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ComponentInterface.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

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
    // InternalComponentInterface.g:512:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalComponentInterface.g:512:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalComponentInterface.g:513:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalComponentInterface.g:519:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalComponentInterface.g:525:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:526:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:526:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalComponentInterface.g:527:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:527:3: ()
            // InternalComponentInterface.g:528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:542:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentInterface.g:543:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalComponentInterface.g:551:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalComponentInterface.g:552:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalComponentInterface.g:552:5: (lv_parts_5_0= ruleGraphName )
                    // InternalComponentInterface.g:553:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ComponentInterface.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalComponentInterface.g:570:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==24) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalComponentInterface.g:571:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_17); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalComponentInterface.g:575:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalComponentInterface.g:576:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalComponentInterface.g:576:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalComponentInterface.g:577:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ComponentInterface.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:608:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalComponentInterface.g:608:47: (iv_ruleEString= ruleEString EOF )
            // InternalComponentInterface.g:609:2: iv_ruleEString= ruleEString EOF
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
    // InternalComponentInterface.g:615:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_STRING_SLASH_2= RULE_STRING_SLASH ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_STRING_SLASH_2=null;


        	enterRule();

        try {
            // InternalComponentInterface.g:621:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_STRING_SLASH_2= RULE_STRING_SLASH ) )
            // InternalComponentInterface.g:622:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_STRING_SLASH_2= RULE_STRING_SLASH )
            {
            // InternalComponentInterface.g:622:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_STRING_SLASH_2= RULE_STRING_SLASH )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case RULE_STRING_SLASH:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:623:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:631:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:639:3: this_STRING_SLASH_2= RULE_STRING_SLASH
                    {
                    this_STRING_SLASH_2=(Token)match(input,RULE_STRING_SLASH,FOLLOW_2); 

                    			current.merge(this_STRING_SLASH_2);
                    		

                    			newLeafNode(this_STRING_SLASH_2, grammarAccess.getEStringAccess().getSTRING_SLASHTerminalRuleCall_2());
                    		

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


    // $ANTLR start "entryRulePublisher"
    // InternalComponentInterface.g:650:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalComponentInterface.g:650:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalComponentInterface.g:651:2: iv_rulePublisher= rulePublisher EOF
            {
             newCompositeNode(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublisher=rulePublisher();

            state._fsp--;

             current =iv_rulePublisher; 
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
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalComponentInterface.g:657:1: rulePublisher returns [EObject current=null] : ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePublisher() throws RecognitionException {
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
            // InternalComponentInterface.g:663:2: ( ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:664:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:664:2: ( () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:665:3: () otherlv_1= 'Publisher' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:665:3: ()
            // InternalComponentInterface.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getPublisherKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:680:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentInterface.g:681:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPublisherAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:685:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:686:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:686:5: (lv_TopicName_4_0= ruleEString )
                    // InternalComponentInterface.g:687:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:705:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentInterface.g:706:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPublisherAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:710:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:711:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:711:5: ( ruleEString )
                    // InternalComponentInterface.g:712:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPublisherRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPublisherAccess().getTopicRefPublisherCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:727:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentInterface.g:728:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPublisherAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:732:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:733:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:733:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:734:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalComponentInterface.g:760:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalComponentInterface.g:760:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalComponentInterface.g:761:2: iv_ruleSubscriber= ruleSubscriber EOF
            {
             newCompositeNode(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubscriber=ruleSubscriber();

            state._fsp--;

             current =iv_ruleSubscriber; 
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
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalComponentInterface.g:767:1: ruleSubscriber returns [EObject current=null] : ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
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
            // InternalComponentInterface.g:773:2: ( ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:774:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:774:2: ( () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:775:3: () otherlv_1= 'Subscriber' otherlv_2= '{' (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )? (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:775:3: ()
            // InternalComponentInterface.g:776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getSubscriberKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:790:3: (otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:791:4: otherlv_3= 'TopicName' ( (lv_TopicName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubscriberAccess().getTopicNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:795:4: ( (lv_TopicName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:796:5: (lv_TopicName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:796:5: (lv_TopicName_4_0= ruleEString )
                    // InternalComponentInterface.g:797:6: lv_TopicName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getTopicNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_TopicName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"TopicName",
                    							lv_TopicName_4_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:815:3: (otherlv_5= 'TopicRef' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:816:4: otherlv_5= 'TopicRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubscriberAccess().getTopicRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:820:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:821:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:821:5: ( ruleEString )
                    // InternalComponentInterface.g:822:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubscriberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getTopicRefSubscriberCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:837:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:838:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubscriberAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:842:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:843:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:843:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:844:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleServiceServer"
    // InternalComponentInterface.g:870:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalComponentInterface.g:870:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalComponentInterface.g:871:2: iv_ruleServiceServer= ruleServiceServer EOF
            {
             newCompositeNode(grammarAccess.getServiceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceServer=ruleServiceServer();

            state._fsp--;

             current =iv_ruleServiceServer; 
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
    // $ANTLR end "entryRuleServiceServer"


    // $ANTLR start "ruleServiceServer"
    // InternalComponentInterface.g:877:1: ruleServiceServer returns [EObject current=null] : ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
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
            // InternalComponentInterface.g:883:2: ( ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:884:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:884:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:885:3: () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:885:3: ()
            // InternalComponentInterface.g:886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getServiceServerKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:900:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:901:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceServerAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:905:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:906:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:906:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalComponentInterface.g:907:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:925:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:926:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceServerAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:930:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:931:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:931:5: ( ruleEString )
                    // InternalComponentInterface.g:932:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceServerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getSrvRefServiceServerCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:947:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:948:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceServerAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:952:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:953:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:953:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:954:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleServiceServer"


    // $ANTLR start "entryRuleServiceClient"
    // InternalComponentInterface.g:980:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalComponentInterface.g:980:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalComponentInterface.g:981:2: iv_ruleServiceClient= ruleServiceClient EOF
            {
             newCompositeNode(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceClient=ruleServiceClient();

            state._fsp--;

             current =iv_ruleServiceClient; 
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
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // InternalComponentInterface.g:987:1: ruleServiceClient returns [EObject current=null] : ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
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
            // InternalComponentInterface.g:993:2: ( ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalComponentInterface.g:994:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalComponentInterface.g:994:2: ( () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalComponentInterface.g:995:3: () otherlv_1= 'ServiceServer' otherlv_2= '{' (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )? (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )? (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalComponentInterface.g:995:3: ()
            // InternalComponentInterface.g:996:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getServiceServerKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalComponentInterface.g:1010:3: (otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:1011:4: otherlv_3= 'ServiceName' ( (lv_ServiceName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceClientAccess().getServiceNameKeyword_3_0());
                    			
                    // InternalComponentInterface.g:1015:4: ( (lv_ServiceName_4_0= ruleEString ) )
                    // InternalComponentInterface.g:1016:5: (lv_ServiceName_4_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1016:5: (lv_ServiceName_4_0= ruleEString )
                    // InternalComponentInterface.g:1017:6: lv_ServiceName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getServiceNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_ServiceName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"ServiceName",
                    							lv_ServiceName_4_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:1035:3: (otherlv_5= 'SrvRef' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:1036:4: otherlv_5= 'SrvRef' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getServiceClientAccess().getSrvRefKeyword_4_0());
                    			
                    // InternalComponentInterface.g:1040:4: ( ( ruleEString ) )
                    // InternalComponentInterface.g:1041:5: ( ruleEString )
                    {
                    // InternalComponentInterface.g:1041:5: ( ruleEString )
                    // InternalComponentInterface.g:1042:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServiceClientRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getSrvRefServiceClientCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalComponentInterface.g:1057:3: (otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:1058:4: otherlv_7= 'NameSpace' ( (lv_NameSpace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getServiceClientAccess().getNameSpaceKeyword_5_0());
                    			
                    // InternalComponentInterface.g:1062:4: ( (lv_NameSpace_8_0= ruleEString ) )
                    // InternalComponentInterface.g:1063:5: (lv_NameSpace_8_0= ruleEString )
                    {
                    // InternalComponentInterface.g:1063:5: (lv_NameSpace_8_0= ruleEString )
                    // InternalComponentInterface.g:1064:6: lv_NameSpace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNameSpaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_NameSpace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"NameSpace",
                    							lv_NameSpace_8_0,
                    							"de.fraunhofer.ipa.ComponentInterface.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleServiceClient"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000006400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000070100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000640100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000440100000L});

}