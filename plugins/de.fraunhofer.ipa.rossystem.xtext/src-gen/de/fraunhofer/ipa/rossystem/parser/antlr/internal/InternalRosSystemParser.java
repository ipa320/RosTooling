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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'RosComponents'", "'('", "','", "')'", "'TopicConnections'", "'}'", "'ServiceConnections'", "'ActionConnections'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'", "'ActionConnection'", "'ComponentInterface'", "'name'", "'NameSpace'", "'RosPublishers'", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosPublisher'", "'ns'", "'RefPublisher'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    // InternalRosSystem.g:71:1: ruleRosSystem returns [EObject current=null] : ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ActionConnections' otherlv_24= '{' ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )? otherlv_28= '}' )? otherlv_29= '}' ) ;
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
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_Name_4_0 = null;

        EObject lv_RosComponent_7_0 = null;

        EObject lv_RosComponent_9_0 = null;

        EObject lv_TopicConnections_13_0 = null;

        EObject lv_TopicConnections_15_0 = null;

        EObject lv_ServiceConnections_19_0 = null;

        EObject lv_ServiceConnections_21_0 = null;

        EObject lv_ActionConnections_25_0 = null;

        EObject lv_ActionConnections_27_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:77:2: ( ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ActionConnections' otherlv_24= '{' ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )? otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ActionConnections' otherlv_24= '{' ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )? otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ActionConnections' otherlv_24= '{' ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )? otherlv_28= '}' )? otherlv_29= '}' )
            // InternalRosSystem.g:79:3: () otherlv_1= 'RosSystem' otherlv_2= '{' otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) (otherlv_5= 'RosComponents' otherlv_6= '(' ( ( (lv_RosComponent_7_0= ruleComponentInterface ) ) (otherlv_8= ',' ( (lv_RosComponent_9_0= ruleComponentInterface ) ) )* )? otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* )? otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* )? otherlv_22= '}' )? (otherlv_23= 'ActionConnections' otherlv_24= '{' ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )? otherlv_28= '}' )? otherlv_29= '}'
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

                    if ( (LA2_0==27) ) {
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

                    if ( (LA5_0==22) ) {
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

                    if ( (LA8_0==25) ) {
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

            // InternalRosSystem.g:297:3: (otherlv_23= 'ActionConnections' otherlv_24= '{' ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )? otherlv_28= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystem.g:298:4: otherlv_23= 'ActionConnections' otherlv_24= '{' ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )? otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getRosSystemAccess().getActionConnectionsKeyword_8_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_24, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRosSystem.g:306:4: ( ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==26) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRosSystem.g:307:5: ( (lv_ActionConnections_25_0= ruleActionConnection ) ) (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )*
                            {
                            // InternalRosSystem.g:307:5: ( (lv_ActionConnections_25_0= ruleActionConnection ) )
                            // InternalRosSystem.g:308:6: (lv_ActionConnections_25_0= ruleActionConnection )
                            {
                            // InternalRosSystem.g:308:6: (lv_ActionConnections_25_0= ruleActionConnection )
                            // InternalRosSystem.g:309:7: lv_ActionConnections_25_0= ruleActionConnection
                            {

                            							newCompositeNode(grammarAccess.getRosSystemAccess().getActionConnectionsActionConnectionParserRuleCall_8_2_0_0());
                            						
                            pushFollow(FOLLOW_13);
                            lv_ActionConnections_25_0=ruleActionConnection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            							}
                            							add(
                            								current,
                            								"ActionConnections",
                            								lv_ActionConnections_25_0,
                            								"de.fraunhofer.ipa.rossystem.RosSystem.ActionConnection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRosSystem.g:326:5: (otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==16) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalRosSystem.g:327:6: otherlv_26= ',' ( (lv_ActionConnections_27_0= ruleActionConnection ) )
                            	    {
                            	    otherlv_26=(Token)match(input,16,FOLLOW_20); 

                            	    						newLeafNode(otherlv_26, grammarAccess.getRosSystemAccess().getCommaKeyword_8_2_1_0());
                            	    					
                            	    // InternalRosSystem.g:331:6: ( (lv_ActionConnections_27_0= ruleActionConnection ) )
                            	    // InternalRosSystem.g:332:7: (lv_ActionConnections_27_0= ruleActionConnection )
                            	    {
                            	    // InternalRosSystem.g:332:7: (lv_ActionConnections_27_0= ruleActionConnection )
                            	    // InternalRosSystem.g:333:8: lv_ActionConnections_27_0= ruleActionConnection
                            	    {

                            	    								newCompositeNode(grammarAccess.getRosSystemAccess().getActionConnectionsActionConnectionParserRuleCall_8_2_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_13);
                            	    lv_ActionConnections_27_0=ruleActionConnection();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getRosSystemRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"ActionConnections",
                            	    									lv_ActionConnections_27_0,
                            	    									"de.fraunhofer.ipa.rossystem.RosSystem.ActionConnection");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_28=(Token)match(input,19,FOLLOW_21); 

                    				newLeafNode(otherlv_28, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalRosSystem.g:365:1: entryRuleTopicConnection returns [EObject current=null] : iv_ruleTopicConnection= ruleTopicConnection EOF ;
    public final EObject entryRuleTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicConnection = null;


        try {
            // InternalRosSystem.g:365:56: (iv_ruleTopicConnection= ruleTopicConnection EOF )
            // InternalRosSystem.g:366:2: iv_ruleTopicConnection= ruleTopicConnection EOF
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
    // InternalRosSystem.g:372:1: ruleTopicConnection returns [EObject current=null] : (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) ;
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
            // InternalRosSystem.g:378:2: ( (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) )
            // InternalRosSystem.g:379:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            {
            // InternalRosSystem.g:379:2: (otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            // InternalRosSystem.g:380:3: otherlv_0= 'TopicConnection' ( (lv_TopicName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0());
            		
            // InternalRosSystem.g:384:3: ( (lv_TopicName_1_0= ruleEString ) )
            // InternalRosSystem.g:385:4: (lv_TopicName_1_0= ruleEString )
            {
            // InternalRosSystem.g:385:4: (lv_TopicName_1_0= ruleEString )
            // InternalRosSystem.g:386:5: lv_TopicName_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:415:3: ( ( ruleEString ) )
            // InternalRosSystem.g:416:4: ( ruleEString )
            {
            // InternalRosSystem.g:416:4: ( ruleEString )
            // InternalRosSystem.g:417:5: ruleEString
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

            // InternalRosSystem.g:431:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRosSystem.g:432:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:436:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:437:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:437:5: ( ruleEString )
            	    // InternalRosSystem.g:438:6: ruleEString
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
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getTopicConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTopicConnectionAccess().getToKeyword_8());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTopicConnectionAccess().getLeftParenthesisKeyword_9());
            		
            // InternalRosSystem.g:465:3: ( ( ruleEString ) )
            // InternalRosSystem.g:466:4: ( ruleEString )
            {
            // InternalRosSystem.g:466:4: ( ruleEString )
            // InternalRosSystem.g:467:5: ruleEString
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

            // InternalRosSystem.g:481:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRosSystem.g:482:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_12, grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalRosSystem.g:486:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:487:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:487:5: ( ruleEString )
            	    // InternalRosSystem.g:488:6: ruleEString
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
            	    break loop14;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_21); 

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
    // InternalRosSystem.g:515:1: entryRuleServiceConnection returns [EObject current=null] : iv_ruleServiceConnection= ruleServiceConnection EOF ;
    public final EObject entryRuleServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConnection = null;


        try {
            // InternalRosSystem.g:515:58: (iv_ruleServiceConnection= ruleServiceConnection EOF )
            // InternalRosSystem.g:516:2: iv_ruleServiceConnection= ruleServiceConnection EOF
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
    // InternalRosSystem.g:522:1: ruleServiceConnection returns [EObject current=null] : (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) ;
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
            // InternalRosSystem.g:528:2: ( (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalRosSystem.g:529:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalRosSystem.g:529:2: (otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalRosSystem.g:530:3: otherlv_0= 'ServiceConnection' ( (lv_ServiceName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'To' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0());
            		
            // InternalRosSystem.g:534:3: ( (lv_ServiceName_1_0= ruleEString ) )
            // InternalRosSystem.g:535:4: (lv_ServiceName_1_0= ruleEString )
            {
            // InternalRosSystem.g:535:4: (lv_ServiceName_1_0= ruleEString )
            // InternalRosSystem.g:536:5: lv_ServiceName_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceConnectionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceConnectionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalRosSystem.g:565:3: ( ( ruleEString ) )
            // InternalRosSystem.g:566:4: ( ruleEString )
            {
            // InternalRosSystem.g:566:4: ( ruleEString )
            // InternalRosSystem.g:567:5: ruleEString
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

            // InternalRosSystem.g:581:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRosSystem.g:582:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRosSystem.g:586:4: ( ( ruleEString ) )
            	    // InternalRosSystem.g:587:5: ( ruleEString )
            	    {
            	    // InternalRosSystem.g:587:5: ( ruleEString )
            	    // InternalRosSystem.g:588:6: ruleEString
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
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceConnectionAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getServiceConnectionAccess().getToKeyword_8());
            		
            // InternalRosSystem.g:611:3: ( ( ruleEString ) )
            // InternalRosSystem.g:612:4: ( ruleEString )
            {
            // InternalRosSystem.g:612:4: ( ruleEString )
            // InternalRosSystem.g:613:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0());
            				
            pushFollow(FOLLOW_21);
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


    // $ANTLR start "entryRuleActionConnection"
    // InternalRosSystem.g:635:1: entryRuleActionConnection returns [EObject current=null] : iv_ruleActionConnection= ruleActionConnection EOF ;
    public final EObject entryRuleActionConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionConnection = null;


        try {
            // InternalRosSystem.g:635:57: (iv_ruleActionConnection= ruleActionConnection EOF )
            // InternalRosSystem.g:636:2: iv_ruleActionConnection= ruleActionConnection EOF
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
    // InternalRosSystem.g:642:1: ruleActionConnection returns [EObject current=null] : (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalRosSystem.g:648:2: ( (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalRosSystem.g:649:2: (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRosSystem.g:649:2: (otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalRosSystem.g:650:3: otherlv_0= 'ActionConnection' ( (lv_ActionName_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'From' ( ( ruleEString ) ) otherlv_5= 'To' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionConnectionAccess().getActionConnectionKeyword_0());
            		
            // InternalRosSystem.g:654:3: ( (lv_ActionName_1_0= ruleEString ) )
            // InternalRosSystem.g:655:4: (lv_ActionName_1_0= ruleEString )
            {
            // InternalRosSystem.g:655:4: (lv_ActionName_1_0= ruleEString )
            // InternalRosSystem.g:656:5: lv_ActionName_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getActionConnectionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getActionConnectionAccess().getFromKeyword_3());
            		
            // InternalRosSystem.g:681:3: ( ( ruleEString ) )
            // InternalRosSystem.g:682:4: ( ruleEString )
            {
            // InternalRosSystem.g:682:4: ( ruleEString )
            // InternalRosSystem.g:683:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getFromRosActionServerCrossReference_4_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getActionConnectionAccess().getToKeyword_5());
            		
            // InternalRosSystem.g:701:3: ( ( ruleEString ) )
            // InternalRosSystem.g:702:4: ( ruleEString )
            {
            // InternalRosSystem.g:702:4: ( ruleEString )
            // InternalRosSystem.g:703:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionConnectionAccess().getToRosActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRosSystem.g:725:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystem.g:725:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystem.g:726:2: iv_ruleEString= ruleEString EOF
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
    // InternalRosSystem.g:732:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystem.g:738:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystem.g:739:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystem.g:739:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystem.g:740:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:748:3: this_ID_1= RULE_ID
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
    // InternalRosSystem.g:759:1: entryRuleComponentInterface returns [EObject current=null] : iv_ruleComponentInterface= ruleComponentInterface EOF ;
    public final EObject entryRuleComponentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInterface = null;


        try {
            // InternalRosSystem.g:759:59: (iv_ruleComponentInterface= ruleComponentInterface EOF )
            // InternalRosSystem.g:760:2: iv_ruleComponentInterface= ruleComponentInterface EOF
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
    // InternalRosSystem.g:766:1: ruleComponentInterface returns [EObject current=null] : (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) ;
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
            // InternalRosSystem.g:772:2: ( (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' ) )
            // InternalRosSystem.g:773:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            {
            // InternalRosSystem.g:773:2: (otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}' )
            // InternalRosSystem.g:774:3: otherlv_0= 'ComponentInterface' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )? (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )? (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )? (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )? (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )? (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )? (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )? otherlv_42= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentInterfaceAccess().getNameKeyword_2());
            		
            // InternalRosSystem.g:786:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRosSystem.g:787:4: (lv_name_3_0= ruleEString )
            {
            // InternalRosSystem.g:787:4: (lv_name_3_0= ruleEString )
            // InternalRosSystem.g:788:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalRosSystem.g:805:3: (otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystem.g:806:4: otherlv_4= 'NameSpace' ( (lv_NameSpace_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0());
                    			
                    // InternalRosSystem.g:810:4: ( (lv_NameSpace_5_0= ruleEString ) )
                    // InternalRosSystem.g:811:5: (lv_NameSpace_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:811:5: (lv_NameSpace_5_0= ruleEString )
                    // InternalRosSystem.g:812:6: lv_NameSpace_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalRosSystem.g:830:3: (otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystem.g:831:4: otherlv_6= 'RosPublishers' otherlv_7= '{' ( (lv_rospublisher_8_0= ruleRosPublisher ) ) (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRosSystem.g:839:4: ( (lv_rospublisher_8_0= ruleRosPublisher ) )
                    // InternalRosSystem.g:840:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    {
                    // InternalRosSystem.g:840:5: (lv_rospublisher_8_0= ruleRosPublisher )
                    // InternalRosSystem.g:841:6: lv_rospublisher_8_0= ruleRosPublisher
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_2_0());
                    					
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

                    // InternalRosSystem.g:858:4: (otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRosSystem.g:859:5: otherlv_9= ',' ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_27); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRosSystem.g:863:5: ( (lv_rospublisher_10_0= ruleRosPublisher ) )
                    	    // InternalRosSystem.g:864:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    {
                    	    // InternalRosSystem.g:864:6: (lv_rospublisher_10_0= ruleRosPublisher )
                    	    // InternalRosSystem.g:865:7: lv_rospublisher_10_0= ruleRosPublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_3_1_0());
                    	    						
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
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:888:3: (otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystem.g:889:4: otherlv_12= 'RosSubscribers' otherlv_13= '{' ( (lv_rossubscriber_14_0= ruleRosSubscriber ) ) (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRosSystem.g:897:4: ( (lv_rossubscriber_14_0= ruleRosSubscriber ) )
                    // InternalRosSystem.g:898:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    {
                    // InternalRosSystem.g:898:5: (lv_rossubscriber_14_0= ruleRosSubscriber )
                    // InternalRosSystem.g:899:6: lv_rossubscriber_14_0= ruleRosSubscriber
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_2_0());
                    					
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

                    // InternalRosSystem.g:916:4: (otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRosSystem.g:917:5: otherlv_15= ',' ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_29); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRosSystem.g:921:5: ( (lv_rossubscriber_16_0= ruleRosSubscriber ) )
                    	    // InternalRosSystem.g:922:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    {
                    	    // InternalRosSystem.g:922:6: (lv_rossubscriber_16_0= ruleRosSubscriber )
                    	    // InternalRosSystem.g:923:7: lv_rossubscriber_16_0= ruleRosSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_3_1_0());
                    	    						
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_30); 

                    				newLeafNode(otherlv_17, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:946:3: (otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosSystem.g:947:4: otherlv_18= 'RosSrvServers' otherlv_19= '{' ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) ) (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_19, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRosSystem.g:955:4: ( (lv_rosserviceserver_20_0= ruleRosServiceServer ) )
                    // InternalRosSystem.g:956:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    {
                    // InternalRosSystem.g:956:5: (lv_rosserviceserver_20_0= ruleRosServiceServer )
                    // InternalRosSystem.g:957:6: lv_rosserviceserver_20_0= ruleRosServiceServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_2_0());
                    					
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

                    // InternalRosSystem.g:974:4: (otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==16) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRosSystem.g:975:5: otherlv_21= ',' ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_31); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRosSystem.g:979:5: ( (lv_rosserviceserver_22_0= ruleRosServiceServer ) )
                    	    // InternalRosSystem.g:980:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    {
                    	    // InternalRosSystem.g:980:6: (lv_rosserviceserver_22_0= ruleRosServiceServer )
                    	    // InternalRosSystem.g:981:7: lv_rosserviceserver_22_0= ruleRosServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_3_1_0());
                    	    						
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,19,FOLLOW_32); 

                    				newLeafNode(otherlv_23, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1004:3: (otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystem.g:1005:4: otherlv_24= 'RosSrvClients' otherlv_25= '{' ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) ) (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_24, grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0());
                    			
                    otherlv_25=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_25, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRosSystem.g:1013:4: ( (lv_rosserviceclient_26_0= ruleRosServiceClient ) )
                    // InternalRosSystem.g:1014:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    {
                    // InternalRosSystem.g:1014:5: (lv_rosserviceclient_26_0= ruleRosServiceClient )
                    // InternalRosSystem.g:1015:6: lv_rosserviceclient_26_0= ruleRosServiceClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_2_0());
                    					
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

                    // InternalRosSystem.g:1032:4: (otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRosSystem.g:1033:5: otherlv_27= ',' ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_33); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRosSystem.g:1037:5: ( (lv_rosserviceclient_28_0= ruleRosServiceClient ) )
                    	    // InternalRosSystem.g:1038:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    {
                    	    // InternalRosSystem.g:1038:6: (lv_rosserviceclient_28_0= ruleRosServiceClient )
                    	    // InternalRosSystem.g:1039:7: lv_rosserviceclient_28_0= ruleRosServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_3_1_0());
                    	    						
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
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,19,FOLLOW_34); 

                    				newLeafNode(otherlv_29, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1062:3: (otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystem.g:1063:4: otherlv_30= 'RosActionServers' otherlv_31= '{' ( (lv_rosactionserver_32_0= ruleRosActionServer ) ) (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0());
                    			
                    otherlv_31=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_31, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRosSystem.g:1071:4: ( (lv_rosactionserver_32_0= ruleRosActionServer ) )
                    // InternalRosSystem.g:1072:5: (lv_rosactionserver_32_0= ruleRosActionServer )
                    {
                    // InternalRosSystem.g:1072:5: (lv_rosactionserver_32_0= ruleRosActionServer )
                    // InternalRosSystem.g:1073:6: lv_rosactionserver_32_0= ruleRosActionServer
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rosactionserver_32_0=ruleRosActionServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionserver",
                    							lv_rosactionserver_32_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosActionServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1090:4: (otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalRosSystem.g:1091:5: otherlv_33= ',' ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    	    {
                    	    otherlv_33=(Token)match(input,16,FOLLOW_35); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRosSystem.g:1095:5: ( (lv_rosactionserver_34_0= ruleRosActionServer ) )
                    	    // InternalRosSystem.g:1096:6: (lv_rosactionserver_34_0= ruleRosActionServer )
                    	    {
                    	    // InternalRosSystem.g:1096:6: (lv_rosactionserver_34_0= ruleRosActionServer )
                    	    // InternalRosSystem.g:1097:7: lv_rosactionserver_34_0= ruleRosActionServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_rosactionserver_34_0=ruleRosActionServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosactionserver",
                    	    								lv_rosactionserver_34_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosActionServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,19,FOLLOW_36); 

                    				newLeafNode(otherlv_35, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:1120:3: (otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystem.g:1121:4: otherlv_36= 'RosActionClients' otherlv_37= '{' ( (lv_rosactionclient_38_0= ruleRosActionClient ) ) (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0());
                    			
                    otherlv_37=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_37, grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRosSystem.g:1129:4: ( (lv_rosactionclient_38_0= ruleRosActionClient ) )
                    // InternalRosSystem.g:1130:5: (lv_rosactionclient_38_0= ruleRosActionClient )
                    {
                    // InternalRosSystem.g:1130:5: (lv_rosactionclient_38_0= ruleRosActionClient )
                    // InternalRosSystem.g:1131:6: lv_rosactionclient_38_0= ruleRosActionClient
                    {

                    						newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_rosactionclient_38_0=ruleRosActionClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    						}
                    						add(
                    							current,
                    							"rosactionclient",
                    							lv_rosactionclient_38_0,
                    							"de.fraunhofer.ipa.rossystem.RosSystem.RosActionClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:1148:4: (otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRosSystem.g:1149:5: otherlv_39= ',' ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    	    {
                    	    otherlv_39=(Token)match(input,16,FOLLOW_37); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRosSystem.g:1153:5: ( (lv_rosactionclient_40_0= ruleRosActionClient ) )
                    	    // InternalRosSystem.g:1154:6: (lv_rosactionclient_40_0= ruleRosActionClient )
                    	    {
                    	    // InternalRosSystem.g:1154:6: (lv_rosactionclient_40_0= ruleRosActionClient )
                    	    // InternalRosSystem.g:1155:7: lv_rosactionclient_40_0= ruleRosActionClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_rosactionclient_40_0=ruleRosActionClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComponentInterfaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rosactionclient",
                    	    								lv_rosactionclient_40_0,
                    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosActionClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,19,FOLLOW_21); 

                    				newLeafNode(otherlv_41, grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_42=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRosSystem.g:1186:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalRosSystem.g:1186:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalRosSystem.g:1187:2: iv_ruleRosPublisher= ruleRosPublisher EOF
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
    // InternalRosSystem.g:1193:1: ruleRosPublisher returns [EObject current=null] : ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1199:2: ( ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1200:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1200:2: ( () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1201:3: () otherlv_1= 'RosPublisher' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefPublisher' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1201:3: ()
            // InternalRosSystem.g:1202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosPublisherAccess().getRosPublisherAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1());
            		
            // InternalRosSystem.g:1212:3: ( (lv_name_2_0= ruleEString ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystem.g:1213:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1213:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1214:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1235:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystem.g:1236:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosPublisherAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1240:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1241:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1241:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1242:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

            otherlv_6=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5());
            		
            // InternalRosSystem.g:1264:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1265:4: ( ruleEString )
            {
            // InternalRosSystem.g:1265:4: ( ruleEString )
            // InternalRosSystem.g:1266:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:1288:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalRosSystem.g:1288:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalRosSystem.g:1289:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
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
    // InternalRosSystem.g:1295:1: ruleRosSubscriber returns [EObject current=null] : ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1301:2: ( ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1302:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1302:2: ( () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1303:3: () otherlv_1= 'RosSubscriber' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefSubscriber' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1303:3: ()
            // InternalRosSystem.g:1304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1());
            		
            // InternalRosSystem.g:1314:3: ( (lv_name_2_0= ruleEString ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRosSystem.g:1315:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1315:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1316:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1337:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystem.g:1338:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1342:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1343:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1343:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1344:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            otherlv_6=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5());
            		
            // InternalRosSystem.g:1366:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1367:4: ( ruleEString )
            {
            // InternalRosSystem.g:1367:4: ( ruleEString )
            // InternalRosSystem.g:1368:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:1390:1: entryRuleRosServiceServer returns [EObject current=null] : iv_ruleRosServiceServer= ruleRosServiceServer EOF ;
    public final EObject entryRuleRosServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServer = null;


        try {
            // InternalRosSystem.g:1390:57: (iv_ruleRosServiceServer= ruleRosServiceServer EOF )
            // InternalRosSystem.g:1391:2: iv_ruleRosServiceServer= ruleRosServiceServer EOF
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
    // InternalRosSystem.g:1397:1: ruleRosServiceServer returns [EObject current=null] : ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1403:2: ( ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1404:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1404:2: ( () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1405:3: () otherlv_1= 'RosServiceServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1405:3: ()
            // InternalRosSystem.g:1406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1());
            		
            // InternalRosSystem.g:1416:3: ( (lv_name_2_0= ruleEString ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosSystem.g:1417:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1417:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1418:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1439:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosSystem.g:1440:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1444:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1445:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1445:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1446:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            otherlv_6=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5());
            		
            // InternalRosSystem.g:1468:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1469:4: ( ruleEString )
            {
            // InternalRosSystem.g:1469:4: ( ruleEString )
            // InternalRosSystem.g:1470:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
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
    // InternalRosSystem.g:1492:1: entryRuleRosServiceClient returns [EObject current=null] : iv_ruleRosServiceClient= ruleRosServiceClient EOF ;
    public final EObject entryRuleRosServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceClient = null;


        try {
            // InternalRosSystem.g:1492:57: (iv_ruleRosServiceClient= ruleRosServiceClient EOF )
            // InternalRosSystem.g:1493:2: iv_ruleRosServiceClient= ruleRosServiceClient EOF
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
    // InternalRosSystem.g:1499:1: ruleRosServiceClient returns [EObject current=null] : ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1505:2: ( ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1506:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1506:2: ( () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1507:3: () otherlv_1= 'RosServiceClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1507:3: ()
            // InternalRosSystem.g:1508:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1());
            		
            // InternalRosSystem.g:1518:3: ( (lv_name_2_0= ruleEString ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_ID)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosSystem.g:1519:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1519:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1520:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1541:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==37) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRosSystem.g:1542:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1546:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1547:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1547:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1548:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            otherlv_6=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5());
            		
            // InternalRosSystem.g:1570:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1571:4: ( ruleEString )
            {
            // InternalRosSystem.g:1571:4: ( ruleEString )
            // InternalRosSystem.g:1572:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
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


    // $ANTLR start "entryRuleRosActionServer"
    // InternalRosSystem.g:1594:1: entryRuleRosActionServer returns [EObject current=null] : iv_ruleRosActionServer= ruleRosActionServer EOF ;
    public final EObject entryRuleRosActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServer = null;


        try {
            // InternalRosSystem.g:1594:56: (iv_ruleRosActionServer= ruleRosActionServer EOF )
            // InternalRosSystem.g:1595:2: iv_ruleRosActionServer= ruleRosActionServer EOF
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
    // InternalRosSystem.g:1601:1: ruleRosActionServer returns [EObject current=null] : ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1607:2: ( ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1608:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1608:2: ( () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1609:3: () otherlv_1= 'RosActionServer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefServer' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1609:3: ()
            // InternalRosSystem.g:1610:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionServerAccess().getRosActionServerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1());
            		
            // InternalRosSystem.g:1620:3: ( (lv_name_2_0= ruleEString ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_ID)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRosSystem.g:1621:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1621:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1622:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1643:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosSystem.g:1644:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionServerAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1648:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1649:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1649:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1650:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            otherlv_6=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionServerAccess().getRefServerKeyword_5());
            		
            // InternalRosSystem.g:1672:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1673:4: ( ruleEString )
            {
            // InternalRosSystem.g:1673:4: ( ruleEString )
            // InternalRosSystem.g:1674:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRosSystem.g:1696:1: entryRuleRosActionClient returns [EObject current=null] : iv_ruleRosActionClient= ruleRosActionClient EOF ;
    public final EObject entryRuleRosActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClient = null;


        try {
            // InternalRosSystem.g:1696:56: (iv_ruleRosActionClient= ruleRosActionClient EOF )
            // InternalRosSystem.g:1697:2: iv_ruleRosActionClient= ruleRosActionClient EOF
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
    // InternalRosSystem.g:1703:1: ruleRosActionClient returns [EObject current=null] : ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalRosSystem.g:1709:2: ( ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalRosSystem.g:1710:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalRosSystem.g:1710:2: ( () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalRosSystem.g:1711:3: () otherlv_1= 'RosActionClient' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )? otherlv_6= 'RefClient' ( ( ruleEString ) ) otherlv_8= '}'
            {
            // InternalRosSystem.g:1711:3: ()
            // InternalRosSystem.g:1712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosActionClientAccess().getRosActionClientAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1());
            		
            // InternalRosSystem.g:1722:3: ( (lv_name_2_0= ruleEString ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRosSystem.g:1723:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalRosSystem.g:1723:4: (lv_name_2_0= ruleEString )
                    // InternalRosSystem.g:1724:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosSystem.g:1745:3: (otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRosSystem.g:1746:4: otherlv_4= 'ns' ( (lv_ns_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRosActionClientAccess().getNsKeyword_4_0());
                    			
                    // InternalRosSystem.g:1750:4: ( (lv_ns_5_0= ruleEString ) )
                    // InternalRosSystem.g:1751:5: (lv_ns_5_0= ruleEString )
                    {
                    // InternalRosSystem.g:1751:5: (lv_ns_5_0= ruleEString )
                    // InternalRosSystem.g:1752:6: lv_ns_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            otherlv_6=(Token)match(input,44,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getRosActionClientAccess().getRefClientKeyword_5());
            		
            // InternalRosSystem.g:1774:3: ( ( ruleEString ) )
            // InternalRosSystem.g:1775:4: ( ruleEString )
            {
            // InternalRosSystem.g:1775:4: ( ruleEString )
            // InternalRosSystem.g:1776:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000003C4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000FE0080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000FC0080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000F80080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000F00080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000E00080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000C00080000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000102000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});

}