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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'RosComponents'", "'('", "','", "')'", "'TopicConnections'", "'}'", "'ServiceConnections'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'ComponentInterface'", "'name'", "'NameSpace'", "'RosPublishers'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalRosSystem.g:71:1: ruleRosSystem returns [EObject current=null] : ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleRosSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        EObject lv_RosComponent_7_0 = null;

        EObject lv_RosComponent_9_0 = null;

        EObject lv_TopicConnections_13_0 = null;

        EObject lv_TopicConnections_15_0 = null;

        EObject lv_ServiceConnections_19_0 = null;

        EObject lv_ServiceConnections_21_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:77:2: ( ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? otherlv_23= '}' )
            // InternalRosSystem.g:79:3: () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? otherlv_23= '}'
            {
            // InternalRosSystem.g:79:3: ()
            // InternalRosSystem.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSystemAccess().getRosSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getRosSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

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

            // InternalRosSystem.g:117:3: (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:118:4: otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosSystemAccess().getRosComponentsKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalRosSystem.g:126:4: ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==25) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRosSystem.g:127:5: ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )*
                            {
                            // InternalRosSystem.g:127:5: ( (lv_RosComponent_7_0= ruleComponentInterface ) )
                            // InternalRosSystem.g:128:6: (lv_RosComponent_7_0= ruleComponentInterface )
                            {
                            // InternalRosSystem.g:128:6: (lv_RosComponent_7_0= ruleComponentInterface )
                            // InternalRosSystem.g:129:7: lv_RosComponent_7_0= ruleComponentInterface
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_RosComponent_7_0=ruleComponentInterface();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"RosComponent",
                            								lv_RosComponent_7_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ComponentInterface");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:146:5: (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==16) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalRosSystem.g:147:6: otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) )
                            	    {
                            	    otherlv_8=(Token)match(input,16,FOLLOW_10); 

                            	    						newLeafNode(otherlv_8, grammarAccess.getRosSystemAccess().getCommaKeyword_5_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:151:6: ( (lv_RosComponent_9_0= ruleComponentInterface ) )
                            	    // InternalRosSystem.g:152:7: (lv_RosComponent_9_0= ruleComponentInterface )
                            	    {
                            	    // InternalRosSystem.g:152:7: (lv_RosComponent_9_0= ruleComponentInterface )
                            	    // InternalRosSystem.g:153:8: lv_RosComponent_9_0= ruleComponentInterface
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceParserRuleCall_5_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_9);
                            	    lv_RosComponent_9_0=ruleComponentInterface();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"RosComponent",
                            	    									lv_RosComponent_9_0,
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

                    otherlv_10=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:177:3: (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRosSystem.g:178:4: otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_6_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRosSystem.g:186:4: ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==21) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRosSystem.g:187:5: ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )*
                            {
                            // InternalRosSystem.g:187:5: ( (lv_TopicConnections_13_0= ruleTopicConnection ) )
                            // InternalRosSystem.g:188:6: (lv_TopicConnections_13_0= ruleTopicConnection )
                            {
                            // InternalRosSystem.g:188:6: (lv_TopicConnections_13_0= ruleTopicConnection )
                            // InternalRosSystem.g:189:7: lv_TopicConnections_13_0= ruleTopicConnection
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_6_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_TopicConnections_13_0=ruleTopicConnection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"TopicConnections",
                            								lv_TopicConnections_13_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:206:5: (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==16) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalRosSystem.g:207:6: otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) )
                            	    {
                            	    otherlv_14=(Token)match(input,16,FOLLOW_14); 

                            	    						newLeafNode(otherlv_14, grammarAccess.getRosSystemAccess().getCommaKeyword_6_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:211:6: ( (lv_TopicConnections_15_0= ruleTopicConnection ) )
                            	    // InternalRosSystem.g:212:7: (lv_TopicConnections_15_0= ruleTopicConnection )
                            	    {
                            	    // InternalRosSystem.g:212:7: (lv_TopicConnections_15_0= ruleTopicConnection )
                            	    // InternalRosSystem.g:213:8: lv_TopicConnections_15_0= ruleTopicConnection
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_6_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_13);
                            	    lv_TopicConnections_15_0=ruleTopicConnection();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"TopicConnections",
                            	    									lv_TopicConnections_15_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:237:3: (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:238:4: otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_7_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_18, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRosSystem.g:246:4: ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRosSystem.g:247:5: ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )*
                            {
                            // InternalRosSystem.g:247:5: ( (lv_ServiceConnections_19_0= ruleServiceConnection ) )
                            // InternalRosSystem.g:248:6: (lv_ServiceConnections_19_0= ruleServiceConnection )
                            {
                            // InternalRosSystem.g:248:6: (lv_ServiceConnections_19_0= ruleServiceConnection )
                            // InternalRosSystem.g:249:7: lv_ServiceConnections_19_0= ruleServiceConnection
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_7_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_ServiceConnections_19_0=ruleServiceConnection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"ServiceConnections",
                            								lv_ServiceConnections_19_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:266:5: (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==16) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalRosSystem.g:267:6: otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) )
                            	    {
                            	    otherlv_20=(Token)match(input,16,FOLLOW_17); 

                            	    						newLeafNode(otherlv_20, grammarAccess.getRosSystemAccess().getCommaKeyword_7_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:271:6: ( (lv_ServiceConnections_21_0= ruleServiceConnection ) )
                            	    // InternalRosSystem.g:272:7: (lv_ServiceConnections_21_0= ruleServiceConnection )
                            	    {
                            	    // InternalRosSystem.g:272:7: (lv_ServiceConnections_21_0= ruleServiceConnection )
                            	    // InternalRosSystem.g:273:8: lv_ServiceConnections_21_0= ruleServiceConnection
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_7_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_13);
                            	    lv_ServiceConnections_21_0=ruleServiceConnection();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"ServiceConnections",
                            	    									lv_ServiceConnections_21_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
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

                    otherlv_22=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_22, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRosSystem.g:305:1: entryRuleTopicConnection returns [EObject current=null] : iv_ruleTopicConnection= ruleTopicConnection EOF ;
    public final EObject entryRuleTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicConnection = null;


        try {
            // InternalRosSystem.g:305:56: (iv_ruleTopicConnection= ruleTopicConnection EOF )
            // InternalRosSystem.g:306:2: iv_ruleTopicConnection= ruleTopicConnection EOF
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
    // InternalRosSystem.g:312:1: ruleTopicConnection returns [EObject current=null] : (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) ;
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
            // InternalRosSystem.g:318:2: ( (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) )
            // InternalRosSystem.g:319:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            {
            // InternalRosSystem.g:319:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            // InternalRosSystem.g:320:3: otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0());
            		
            // InternalRosSystem.g:324:3: ( (lv_TopicName_1_0= ruleEString ) )
            // InternalRosSystem.g:325:4: (lv_TopicName_1_0= ruleEString )
            {
            // InternalRosSystem.g:325:4: (lv_TopicName_1_0= ruleEString )
            // InternalRosSystem.g:326:5: lv_TopicName_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:355:3: ( ( ruleEString ) )
            // InternalRosSystem.g:356:4: ( ruleEString )
            {
            // InternalRosSystem.g:356:4: ( ruleEString )
            // InternalRosSystem.g:357:5: ruleEString
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

            // InternalRosSystem.g:371:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRosSystem.g:372:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:376:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:377:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:377:5: ( ruleEString )
            	    // InternalRosSystem.g:378:6: ruleEString
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
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTopicConnectionAccess().getToKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_9());
            		
            // InternalRosSystem.g:405:3: ( ( ruleEString ) )
            // InternalRosSystem.g:406:4: ( ruleEString )
            {
            // InternalRosSystem.g:406:4: ( ruleEString )
            // InternalRosSystem.g:407:5: ruleEString
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

            // InternalRosSystem.g:421:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosSystem.g:422:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_12, grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalRosSystem.g:426:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:427:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:427:5: ( ruleEString )
            	    // InternalRosSystem.g:428:6: ruleEString
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
            	    break loop11;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_12());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRosSystem.g:455:1: entryRuleServiceConnection returns [EObject current=null] : iv_ruleServiceConnection= ruleServiceConnection EOF ;
    public final EObject entryRuleServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConnection = null;


        try {
            // InternalRosSystem.g:455:58: (iv_ruleServiceConnection= ruleServiceConnection EOF )
            // InternalRosSystem.g:456:2: iv_ruleServiceConnection= ruleServiceConnection EOF
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
    // InternalRosSystem.g:462:1: ruleServiceConnection returns [EObject current=null] : (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalRosSystem.g:468:2: ( (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalRosSystem.g:469:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalRosSystem.g:469:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalRosSystem.g:470:3: otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0());
            		
            // InternalRosSystem.g:474:3: ( (lv_ServiceName_1_0= ruleEString ) )
            // InternalRosSystem.g:475:4: (lv_ServiceName_1_0= ruleEString )
            {
            // InternalRosSystem.g:475:4: (lv_ServiceName_1_0= ruleEString )
            // InternalRosSystem.g:476:5: lv_ServiceName_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:505:3: ( ( ruleEString ) )
            // InternalRosSystem.g:506:4: ( ruleEString )
            {
            // InternalRosSystem.g:506:4: ( ruleEString )
            // InternalRosSystem.g:507:5: ruleEString
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

            // InternalRosSystem.g:521:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRosSystem.g:522:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:526:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:527:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:527:5: ( ruleEString )
            	    // InternalRosSystem.g:528:6: ruleEString
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
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceConnectionAccess().getToKeyword_8());
            		
            // InternalRosSystem.g:551:3: ( ( ruleEString ) )
            // InternalRosSystem.g:552:4: ( ruleEString )
            {
            // InternalRosSystem.g:552:4: ( ruleEString )
            // InternalRosSystem.g:553:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:575:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystem.g:575:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystem.g:576:2: iv_ruleEString= ruleEString EOF
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
    // InternalRosSystem.g:582:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystem.g:588:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystem.g:589:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystem.g:589:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosSystem.g:590:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:598:3: this_ID_1= RULE_ID
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
    // InternalRosSystem.g:609:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalRosSystem.g:609:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalRosSystem.g:610:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalRosSystem.g:616:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
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

        AntlrDatatypeRuleToken lv_NameSpace_5_0 = null;

        EObject lv_rospublisher_8_0 = null;

        EObject lv_rospublisher_10_0 = null;

        EObject lv_rossubscriber_14_0 = null;

        EObject lv_rossubscriber_16_0 = null;

        EObject lv_rosserviceserver_20_0 = null;

        EObject lv_rosserviceserver_22_0 = null;

        EObject lv_rosserviceclient_26_0 = null;

        EObject lv_rosserviceclient_28_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:622:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // InternalRosSystem.g:623:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // InternalRosSystem.g:623:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // InternalRosSystem.g:624:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosSystem.g:632:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystem.g:633:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getNameKeyword_2_0());
                    			
                    // InternalRosSystem.g:637:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosSystem.g:638:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosSystem.g:638:5: (lv_name_3_0= ruleEString )
                    // InternalRosSystem.g:639:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
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


                    }
                    break;

            }

            // InternalRosSystem.g:657:3: (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystem.g:658:4: otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_3_0());
                    			
                    // InternalRosSystem.g:662:4: ( (lv_NameSpace_5_0= ruleEString ) )
                    // InternalRosSystem.g:663:5: (lv_NameSpace_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:663:5: (lv_NameSpace_5_0= ruleEString )
                    // InternalRosSystem.g:664:6: lv_NameSpace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalRosSystem.g:682:3: (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystem.g:683:4: otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRosSystem.g:691:4: ( (lv_rospublisher_8_0= ruleRosPublisher ) )
                    // InternalRosSystem.g:692:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    {
                    // InternalRosSystem.g:692:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    // InternalRosSystem.g:693:6: lv_rospublisher_8_0= ruleRosPublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rospublisher_8_0=ruleRosPublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rospublisher",
                    							lv_rospublisher_8_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosPublisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:710:4: (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRosSystem.g:711:5: otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_24); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRosSystem.g:715:5: ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    // InternalRosSystem.g:716:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    {
                    	    // InternalRosSystem.g:716:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    // InternalRosSystem.g:717:7: lv_rospublisher_10_0= ruleRosPublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_rospublisher_10_0=ruleRosPublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rospublisher",
                    	    								lv_rospublisher_10_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosPublisher");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:740:3: (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystem.g:741:4: otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_5_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRosSystem.g:749:4: ( (lv_rossubscriber_14_0= ruleRosSubscriber ) )
                    // InternalRosSystem.g:750:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    {
                    // InternalRosSystem.g:750:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    // InternalRosSystem.g:751:6: lv_rossubscriber_14_0= ruleRosSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rossubscriber_14_0=ruleRosSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rossubscriber",
                    							lv_rossubscriber_14_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosSubscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:768:4: (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRosSystem.g:769:5: otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_26); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRosSystem.g:773:5: ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    // InternalRosSystem.g:774:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    {
                    	    // InternalRosSystem.g:774:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    // InternalRosSystem.g:775:7: lv_rossubscriber_16_0= ruleRosSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_rossubscriber_16_0=ruleRosSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rossubscriber",
                    	    								lv_rossubscriber_16_0,
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

                    otherlv_17=(Token)match(input,19,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:798:3: (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystem.g:799:4: otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRosSystem.g:807:4: ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) )
                    // InternalRosSystem.g:808:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    {
                    // InternalRosSystem.g:808:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    // InternalRosSystem.g:809:6: lv_rosserviceserver_20_0= ruleRosServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rosserviceserver_20_0=ruleRosServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceserver",
                    							lv_rosserviceserver_20_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:826:4: (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRosSystem.g:827:5: otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_28); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRosSystem.g:831:5: ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    // InternalRosSystem.g:832:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    {
                    	    // InternalRosSystem.g:832:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    // InternalRosSystem.g:833:7: lv_rosserviceserver_22_0= ruleRosServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_rosserviceserver_22_0=ruleRosServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceserver",
                    	    								lv_rosserviceserver_22_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_29); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:856:3: (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosSystem.g:857:4: otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_7_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRosSystem.g:865:4: ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) )
                    // InternalRosSystem.g:866:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    {
                    // InternalRosSystem.g:866:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    // InternalRosSystem.g:867:6: lv_rosserviceclient_26_0= ruleRosServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rosserviceclient_26_0=ruleRosServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosserviceclient",
                    							lv_rosserviceclient_26_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:884:4: (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRosSystem.g:885:5: otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_30); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRosSystem.g:889:5: ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    // InternalRosSystem.g:890:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    {
                    	    // InternalRosSystem.g:890:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    // InternalRosSystem.g:891:7: lv_rosserviceclient_28_0= ruleRosServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_rosserviceclient_28_0=ruleRosServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosserviceclient",
                    	    								lv_rosserviceclient_28_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosServiceClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_29, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRosSystem.g:922:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalRosSystem.g:922:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalRosSystem.g:923:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalRosSystem.g:929:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:935:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:936:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:936:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:937:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:937:3: ()
            // InternalRosSystem.g:938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalRosSystem.g:948:3: ( (lv_name_2_0= ruleEString ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystem.g:949:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:949:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:950:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:971:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:972:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:976:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:977:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:977:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:978:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
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

            otherlv_6=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5());
            		
            // InternalRosSystem.g:1000:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1001:4: ( ruleEString )
            {
            // InternalRosSystem.g:1001:4: ( ruleEString )
            // InternalRosSystem.g:1002:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRosSystem.g:1024:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalRosSystem.g:1024:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalRosSystem.g:1025:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalRosSystem.g:1031:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1037:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1038:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1038:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1039:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1039:3: ()
            // InternalRosSystem.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalRosSystem.g:1050:3: ( (lv_name_2_0= ruleEString ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystem.g:1051:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1051:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1052:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1073:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystem.g:1074:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1078:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1079:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1079:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1080:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
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

            otherlv_6=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5());
            		
            // InternalRosSystem.g:1102:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1103:4: ( ruleEString )
            {
            // InternalRosSystem.g:1103:4: ( ruleEString )
            // InternalRosSystem.g:1104:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRosSystem.g:1126:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalRosSystem.g:1126:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalRosSystem.g:1127:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalRosSystem.g:1133:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1139:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1140:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1140:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1141:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1141:3: ()
            // InternalRosSystem.g:1142:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalRosSystem.g:1152:3: ( (lv_name_2_0= ruleEString ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystem.g:1153:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1153:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1154:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1175:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystem.g:1176:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1180:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1181:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1181:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1182:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            otherlv_6=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5());
            		
            // InternalRosSystem.g:1204:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1205:4: ( ruleEString )
            {
            // InternalRosSystem.g:1205:4: ( ruleEString )
            // InternalRosSystem.g:1206:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRosSystem.g:1228:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalRosSystem.g:1228:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalRosSystem.g:1229:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalRosSystem.g:1235:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1241:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1242:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1242:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1243:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1243:3: ()
            // InternalRosSystem.g:1244:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalRosSystem.g:1254:3: ( (lv_name_2_0= ruleEString ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:1255:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1255:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1256:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1277:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystem.g:1278:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1282:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1283:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1283:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1284:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

            otherlv_6=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5());
            		
            // InternalRosSystem.g:1306:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1307:4: ( ruleEString )
            {
            // InternalRosSystem.g:1307:4: ( ruleEString )
            // InternalRosSystem.g:1308:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000FC080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F8080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000F0080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000E0080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000C0080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});

}