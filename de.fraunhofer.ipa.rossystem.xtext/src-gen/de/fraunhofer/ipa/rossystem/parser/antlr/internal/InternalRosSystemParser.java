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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'Name'", "'RosComponent'", "'('", "','", "')'", "'TopicConnections'", "'}'", "'ServiceConnections'", "'TopicConnection'", "'FromTopic'", "'ToTopic'", "'ServiceConnection'", "'FromSrv'", "'ToSrv'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalRosSystem.g:71:1: ruleRosSystem returns [EObject current=null] : ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
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

        EObject lv_TopicConnections_13_0 = null;

        EObject lv_TopicConnections_15_0 = null;

        EObject lv_ServiceConnections_19_0 = null;

        EObject lv_ServiceConnections_21_0 = null;



        	enterRule();

        try {
            // InternalRosSystem.g:77:2: ( ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalRosSystem.g:78:2: ( () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalRosSystem.g:79:3: () otherlv_1= 'RosSystem' otherlv_2= '{' (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )? (otherlv_5= 'RosComponent' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'TopicConnections' otherlv_12= '{' ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* otherlv_16= '}' )? (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* otherlv_22= '}' )? otherlv_23= '}'
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
            		
            // InternalRosSystem.g:94:3: (otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosSystem.g:95:4: otherlv_3= 'Name' ( (lv_Name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getNameKeyword_3_0());
                    			
                    // InternalRosSystem.g:99:4: ( (lv_Name_4_0= ruleEString ) )
                    // InternalRosSystem.g:100:5: (lv_Name_4_0= ruleEString )
                    {
                    // InternalRosSystem.g:100:5: (lv_Name_4_0= ruleEString )
                    // InternalRosSystem.g:101:6: lv_Name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0());
                    					
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


                    }
                    break;

            }

            // InternalRosSystem.g:119:3: (otherlv_5= 'RosComponent' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:120:4: otherlv_5= 'RosComponent' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRosSystemAccess().getRosComponentKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosSystemAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalRosSystem.g:128:4: ( ( ruleEString ) )
                    // InternalRosSystem.g:129:5: ( ruleEString )
                    {
                    // InternalRosSystem.g:129:5: ( ruleEString )
                    // InternalRosSystem.g:130:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRosSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosSystem.g:144:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRosSystem.g:145:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRosSystem.g:149:5: ( ( ruleEString ) )
                    	    // InternalRosSystem.g:150:6: ( ruleEString )
                    	    {
                    	    // InternalRosSystem.g:150:6: ( ruleEString )
                    	    // InternalRosSystem.g:151:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRosSystemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentComponentInterfaceCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getRosSystemAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:171:3: (otherlv_11= 'TopicConnections' otherlv_12= '{' ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* otherlv_16= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosSystem.g:172:4: otherlv_11= 'TopicConnections' otherlv_12= '{' ( (lv_TopicConnections_13_0= ruleTopicConnection ) ) (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRosSystem.g:180:4: ( (lv_TopicConnections_13_0= ruleTopicConnection ) )
                    // InternalRosSystem.g:181:5: (lv_TopicConnections_13_0= ruleTopicConnection )
                    {
                    // InternalRosSystem.g:181:5: (lv_TopicConnections_13_0= ruleTopicConnection )
                    // InternalRosSystem.g:182:6: lv_TopicConnections_13_0= ruleTopicConnection
                    {

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalRosSystem.g:199:4: (otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosSystem.g:200:5: otherlv_14= ',' ( (lv_TopicConnections_15_0= ruleTopicConnection ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRosSystem.g:204:5: ( (lv_TopicConnections_15_0= ruleTopicConnection ) )
                    	    // InternalRosSystem.g:205:6: (lv_TopicConnections_15_0= ruleTopicConnection )
                    	    {
                    	    // InternalRosSystem.g:205:6: (lv_TopicConnections_15_0= ruleTopicConnection )
                    	    // InternalRosSystem.g:206:7: lv_TopicConnections_15_0= ruleTopicConnection
                    	    {

                    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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

                    otherlv_16=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRosSystem.g:229:3: (otherlv_17= 'ServiceConnections' otherlv_18= '{' ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* otherlv_22= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRosSystem.g:230:4: otherlv_17= 'ServiceConnections' otherlv_18= '{' ( (lv_ServiceConnections_19_0= ruleServiceConnection ) ) (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRosSystem.g:238:4: ( (lv_ServiceConnections_19_0= ruleServiceConnection ) )
                    // InternalRosSystem.g:239:5: (lv_ServiceConnections_19_0= ruleServiceConnection )
                    {
                    // InternalRosSystem.g:239:5: (lv_ServiceConnections_19_0= ruleServiceConnection )
                    // InternalRosSystem.g:240:6: lv_ServiceConnections_19_0= ruleServiceConnection
                    {

                    						newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalRosSystem.g:257:4: (otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRosSystem.g:258:5: otherlv_20= ',' ( (lv_ServiceConnections_21_0= ruleServiceConnection ) )
                    	    {
                    	    otherlv_20=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRosSystem.g:262:5: ( (lv_ServiceConnections_21_0= ruleServiceConnection ) )
                    	    // InternalRosSystem.g:263:6: (lv_ServiceConnections_21_0= ruleServiceConnection )
                    	    {
                    	    // InternalRosSystem.g:263:6: (lv_ServiceConnections_21_0= ruleServiceConnection )
                    	    // InternalRosSystem.g:264:7: lv_ServiceConnections_21_0= ruleServiceConnection
                    	    {

                    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalRosSystem.g:295:1: entryRuleTopicConnection returns [EObject current=null] : iv_ruleTopicConnection= ruleTopicConnection EOF ;
    public final EObject entryRuleTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicConnection = null;


        try {
            // InternalRosSystem.g:295:56: (iv_ruleTopicConnection= ruleTopicConnection EOF )
            // InternalRosSystem.g:296:2: iv_ruleTopicConnection= ruleTopicConnection EOF
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
    // InternalRosSystem.g:302:1: ruleTopicConnection returns [EObject current=null] : (otherlv_0= 'TopicConnection' otherlv_1= '{' otherlv_2= 'FromTopic' ( ( ruleEString ) ) otherlv_4= 'ToTopic' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleTopicConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRosSystem.g:308:2: ( (otherlv_0= 'TopicConnection' otherlv_1= '{' otherlv_2= 'FromTopic' ( ( ruleEString ) ) otherlv_4= 'ToTopic' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalRosSystem.g:309:2: (otherlv_0= 'TopicConnection' otherlv_1= '{' otherlv_2= 'FromTopic' ( ( ruleEString ) ) otherlv_4= 'ToTopic' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalRosSystem.g:309:2: (otherlv_0= 'TopicConnection' otherlv_1= '{' otherlv_2= 'FromTopic' ( ( ruleEString ) ) otherlv_4= 'ToTopic' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalRosSystem.g:310:3: otherlv_0= 'TopicConnection' otherlv_1= '{' otherlv_2= 'FromTopic' ( ( ruleEString ) ) otherlv_4= 'ToTopic' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTopicConnectionAccess().getFromTopicKeyword_2());
            		
            // InternalRosSystem.g:322:3: ( ( ruleEString ) )
            // InternalRosSystem.g:323:4: ( ruleEString )
            {
            // InternalRosSystem.g:323:4: ( ruleEString )
            // InternalRosSystem.g:324:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromTopicRosPublisherCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTopicConnectionAccess().getToTopicKeyword_4());
            		
            // InternalRosSystem.g:342:3: ( ( ruleEString ) )
            // InternalRosSystem.g:343:4: ( ruleEString )
            {
            // InternalRosSystem.g:343:4: ( ruleEString )
            // InternalRosSystem.g:344:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTopicConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTopicConnectionAccess().getToTopicRosSubscriberCrossReference_5_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosSystem.g:366:1: entryRuleServiceConnection returns [EObject current=null] : iv_ruleServiceConnection= ruleServiceConnection EOF ;
    public final EObject entryRuleServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConnection = null;


        try {
            // InternalRosSystem.g:366:58: (iv_ruleServiceConnection= ruleServiceConnection EOF )
            // InternalRosSystem.g:367:2: iv_ruleServiceConnection= ruleServiceConnection EOF
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
    // InternalRosSystem.g:373:1: ruleServiceConnection returns [EObject current=null] : (otherlv_0= 'ServiceConnection' otherlv_1= '{' otherlv_2= 'FromSrv' ( ( ruleEString ) ) otherlv_4= 'ToSrv' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleServiceConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRosSystem.g:379:2: ( (otherlv_0= 'ServiceConnection' otherlv_1= '{' otherlv_2= 'FromSrv' ( ( ruleEString ) ) otherlv_4= 'ToSrv' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalRosSystem.g:380:2: (otherlv_0= 'ServiceConnection' otherlv_1= '{' otherlv_2= 'FromSrv' ( ( ruleEString ) ) otherlv_4= 'ToSrv' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalRosSystem.g:380:2: (otherlv_0= 'ServiceConnection' otherlv_1= '{' otherlv_2= 'FromSrv' ( ( ruleEString ) ) otherlv_4= 'ToSrv' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalRosSystem.g:381:3: otherlv_0= 'ServiceConnection' otherlv_1= '{' otherlv_2= 'FromSrv' ( ( ruleEString ) ) otherlv_4= 'ToSrv' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceConnectionAccess().getFromSrvKeyword_2());
            		
            // InternalRosSystem.g:393:3: ( ( ruleEString ) )
            // InternalRosSystem.g:394:4: ( ruleEString )
            {
            // InternalRosSystem.g:394:4: ( ruleEString )
            // InternalRosSystem.g:395:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromSrvRosServiceServerCrossReference_3_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceConnectionAccess().getToSrvKeyword_4());
            		
            // InternalRosSystem.g:413:3: ( ( ruleEString ) )
            // InternalRosSystem.g:414:4: ( ruleEString )
            {
            // InternalRosSystem.g:414:4: ( ruleEString )
            // InternalRosSystem.g:415:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceConnectionAccess().getToSrvRosServiceClientCrossReference_5_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosSystem.g:437:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystem.g:437:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystem.g:438:2: iv_ruleEString= ruleEString EOF
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
    // InternalRosSystem.g:444:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystem.g:450:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystem.g:451:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystem.g:451:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosSystem.g:452:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:460:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001C6000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C4000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});

}