package de.fraunhofer.ipa.ros.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.ros.xtext.services.RosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'spec'", "','", "'}'", "'artifact'", "'Artifact'", "'node'", "'ServiceSpec'", "'request'", "'response'", "'TopicSpec'", "'message'", "'ActionSpec'", "'goal'", "'result'", "'feedback'", "'MessageDefinition'", "'Node'", "'name'", "'serviceserver'", "'publisher'", "'subscriber'", "'serviceclient'", "'actionserver'", "'actionclient'", "'parameter'", "'ServiceServer'", "'service'", "'namespace'", "'Publisher'", "'Subscriber'", "'ServiceClient'", "'ActionServer'", "'action'", "'ActionClient'", "'GraphName'", "'Parameter'", "'type'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'ParameterType'", "'ParameterListType'", "'sequence'", "'default'", "'ParameterStructType'", "'parameterstructypetmember'", "'ParameterIntegerType'", "'ParameterStringType'", "'ParameterDoubleType'", "'ParameterDateType'", "'ParameterBooleanType'", "'ParameterBase64Type'", "'ParameterAnyType'", "'ParameterArrayType'", "'ParameterSequence'", "'value'", "'ParameterAny'", "'ParameterString'", "'ParameterBase64'", "'ParameterInteger'", "'ParameterDouble'", "'ParameterBoolean'", "'ParameterStruct'", "'ParameterDate'", "'Base64Binary'", "'Int'", "'Double'", "'Boolean'", "'ParameterStructMember'", "'DateTime'", "'ParameterStructTypeMember'", "'PackageDependency'", "'package'", "'ExternalDependency'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalRosParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRos.g"; }



     	private RosGrammarAccess grammarAccess;

        public InternalRosParser(TokenStream input, RosGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package_Impl";
       	}

       	@Override
       	protected RosGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage_Impl"
    // InternalRos.g:64:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRos.g:64:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRos.g:65:2: iv_rulePackage_Impl= rulePackage_Impl EOF
            {
             newCompositeNode(grammarAccess.getPackage_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Impl=rulePackage_Impl();

            state._fsp--;

             current =iv_rulePackage_Impl; 
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
    // $ANTLR end "entryRulePackage_Impl"


    // $ANTLR start "rulePackage_Impl"
    // InternalRos.g:71:1: rulePackage_Impl returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_artifact_12_0 = null;

        EObject lv_artifact_14_0 = null;



        	enterRule();

        try {
            // InternalRos.g:77:2: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRos.g:78:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRos.g:78:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRos.g:79:3: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalRos.g:79:3: ()
            // InternalRos.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackage_ImplAccess().getPackageKeyword_1());
            		
            // InternalRos.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:91:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPackage_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:113:3: (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRos.g:114:4: otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getSpecKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:122:4: ( (lv_spec_6_0= ruleSpecBase ) )
                    // InternalRos.g:123:5: (lv_spec_6_0= ruleSpecBase )
                    {
                    // InternalRos.g:123:5: (lv_spec_6_0= ruleSpecBase )
                    // InternalRos.g:124:6: lv_spec_6_0= ruleSpecBase
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_spec_6_0=ruleSpecBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						add(
                    							current,
                    							"spec",
                    							lv_spec_6_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.SpecBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:141:4: (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRos.g:142:5: otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPackage_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:146:5: ( (lv_spec_8_0= ruleSpecBase ) )
                    	    // InternalRos.g:147:6: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:147:6: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos.g:148:7: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_spec_8_0=ruleSpecBase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"spec",
                    	    								lv_spec_8_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.SpecBase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:171:3: (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRos.g:172:4: otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getPackage_ImplAccess().getArtifactKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRos.g:180:4: ( (lv_artifact_12_0= ruleArtifact ) )
                    // InternalRos.g:181:5: (lv_artifact_12_0= ruleArtifact )
                    {
                    // InternalRos.g:181:5: (lv_artifact_12_0= ruleArtifact )
                    // InternalRos.g:182:6: lv_artifact_12_0= ruleArtifact
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_artifact_12_0=ruleArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						add(
                    							current,
                    							"artifact",
                    							lv_artifact_12_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.Artifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:199:4: (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRos.g:200:5: otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRos.g:204:5: ( (lv_artifact_14_0= ruleArtifact ) )
                    	    // InternalRos.g:205:6: (lv_artifact_14_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:205:6: (lv_artifact_14_0= ruleArtifact )
                    	    // InternalRos.g:206:7: lv_artifact_14_0= ruleArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_artifact_14_0=ruleArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"artifact",
                    	    								lv_artifact_14_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.Artifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePackage_Impl"


    // $ANTLR start "entryRuleSpecBase"
    // InternalRos.g:237:1: entryRuleSpecBase returns [EObject current=null] : iv_ruleSpecBase= ruleSpecBase EOF ;
    public final EObject entryRuleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBase = null;


        try {
            // InternalRos.g:237:49: (iv_ruleSpecBase= ruleSpecBase EOF )
            // InternalRos.g:238:2: iv_ruleSpecBase= ruleSpecBase EOF
            {
             newCompositeNode(grammarAccess.getSpecBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecBase=ruleSpecBase();

            state._fsp--;

             current =iv_ruleSpecBase; 
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
    // $ANTLR end "entryRuleSpecBase"


    // $ANTLR start "ruleSpecBase"
    // InternalRos.g:244:1: ruleSpecBase returns [EObject current=null] : (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) ;
    public final EObject ruleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceSpec_0 = null;

        EObject this_TopicSpec_1 = null;

        EObject this_ActionSpec_2 = null;



        	enterRule();

        try {
            // InternalRos.g:250:2: ( (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) )
            // InternalRos.g:251:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            {
            // InternalRos.g:251:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRos.g:252:3: this_ServiceSpec_0= ruleServiceSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getServiceSpecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceSpec_0=ruleServiceSpec();

                    state._fsp--;


                    			current = this_ServiceSpec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:261:3: this_TopicSpec_1= ruleTopicSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getTopicSpecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopicSpec_1=ruleTopicSpec();

                    state._fsp--;


                    			current = this_TopicSpec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:270:3: this_ActionSpec_2= ruleActionSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getActionSpecParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionSpec_2=ruleActionSpec();

                    state._fsp--;


                    			current = this_ActionSpec_2;
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
    // $ANTLR end "ruleSpecBase"


    // $ANTLR start "entryRuleDependency"
    // InternalRos.g:282:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos.g:282:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos.g:283:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalRos.g:289:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRos.g:295:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos.g:296:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos.g:296:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==85) ) {
                alt6=1;
            }
            else if ( (LA6_0==87) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRos.g:297:3: this_PackageDependency_0= rulePackageDependency
                    {

                    			newCompositeNode(grammarAccess.getDependencyAccess().getPackageDependencyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDependency_0=rulePackageDependency();

                    state._fsp--;


                    			current = this_PackageDependency_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:306:3: this_ExternalDependency_1= ruleExternalDependency
                    {

                    			newCompositeNode(grammarAccess.getDependencyAccess().getExternalDependencyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalDependency_1=ruleExternalDependency();

                    state._fsp--;


                    			current = this_ExternalDependency_1;
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleNamespace"
    // InternalRos.g:318:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRos.g:318:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRos.g:319:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRos.g:325:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRos.g:331:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRos.g:332:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRos.g:332:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt7=1;
                }
                break;
            case 52:
                {
                alt7=2;
                }
                break;
            case 53:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRos.g:333:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRos.g:342:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRos.g:351:3: this_PrivateNamespace_2= rulePrivateNamespace
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


    // $ANTLR start "entryRuleParameterType"
    // InternalRos.g:363:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRos.g:363:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRos.g:364:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalRos.g:370:1: ruleParameterType returns [EObject current=null] : (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterListType_1= ruleParameterListType | this_ParameterStructType_2= ruleParameterStructType | this_ParameterIntegerType_3= ruleParameterIntegerType | this_ParameterStringType_4= ruleParameterStringType | this_ParameterDoubleType_5= ruleParameterDoubleType | this_ParameterDateType_6= ruleParameterDateType | this_ParameterBooleanType_7= ruleParameterBooleanType | this_ParameterBase64Type_8= ruleParameterBase64Type | this_ParameterAnyType_9= ruleParameterAnyType | this_ParameterArrayType_10= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterType_Impl_0 = null;

        EObject this_ParameterListType_1 = null;

        EObject this_ParameterStructType_2 = null;

        EObject this_ParameterIntegerType_3 = null;

        EObject this_ParameterStringType_4 = null;

        EObject this_ParameterDoubleType_5 = null;

        EObject this_ParameterDateType_6 = null;

        EObject this_ParameterBooleanType_7 = null;

        EObject this_ParameterBase64Type_8 = null;

        EObject this_ParameterAnyType_9 = null;

        EObject this_ParameterArrayType_10 = null;



        	enterRule();

        try {
            // InternalRos.g:376:2: ( (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterListType_1= ruleParameterListType | this_ParameterStructType_2= ruleParameterStructType | this_ParameterIntegerType_3= ruleParameterIntegerType | this_ParameterStringType_4= ruleParameterStringType | this_ParameterDoubleType_5= ruleParameterDoubleType | this_ParameterDateType_6= ruleParameterDateType | this_ParameterBooleanType_7= ruleParameterBooleanType | this_ParameterBase64Type_8= ruleParameterBase64Type | this_ParameterAnyType_9= ruleParameterAnyType | this_ParameterArrayType_10= ruleParameterArrayType ) )
            // InternalRos.g:377:2: (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterListType_1= ruleParameterListType | this_ParameterStructType_2= ruleParameterStructType | this_ParameterIntegerType_3= ruleParameterIntegerType | this_ParameterStringType_4= ruleParameterStringType | this_ParameterDoubleType_5= ruleParameterDoubleType | this_ParameterDateType_6= ruleParameterDateType | this_ParameterBooleanType_7= ruleParameterBooleanType | this_ParameterBase64Type_8= ruleParameterBase64Type | this_ParameterAnyType_9= ruleParameterAnyType | this_ParameterArrayType_10= ruleParameterArrayType )
            {
            // InternalRos.g:377:2: (this_ParameterType_Impl_0= ruleParameterType_Impl | this_ParameterListType_1= ruleParameterListType | this_ParameterStructType_2= ruleParameterStructType | this_ParameterIntegerType_3= ruleParameterIntegerType | this_ParameterStringType_4= ruleParameterStringType | this_ParameterDoubleType_5= ruleParameterDoubleType | this_ParameterDateType_6= ruleParameterDateType | this_ParameterBooleanType_7= ruleParameterBooleanType | this_ParameterBase64Type_8= ruleParameterBase64Type | this_ParameterAnyType_9= ruleParameterAnyType | this_ParameterArrayType_10= ruleParameterArrayType )
            int alt8=11;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt8=1;
                }
                break;
            case 55:
                {
                alt8=2;
                }
                break;
            case 58:
                {
                alt8=3;
                }
                break;
            case 60:
                {
                alt8=4;
                }
                break;
            case 61:
                {
                alt8=5;
                }
                break;
            case 62:
                {
                alt8=6;
                }
                break;
            case 63:
                {
                alt8=7;
                }
                break;
            case 64:
                {
                alt8=8;
                }
                break;
            case 65:
                {
                alt8=9;
                }
                break;
            case 66:
                {
                alt8=10;
                }
                break;
            case 67:
                {
                alt8=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRos.g:378:3: this_ParameterType_Impl_0= ruleParameterType_Impl
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterType_Impl_0=ruleParameterType_Impl();

                    state._fsp--;


                    			current = this_ParameterType_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:387:3: this_ParameterListType_1= ruleParameterListType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_1=ruleParameterListType();

                    state._fsp--;


                    			current = this_ParameterListType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:396:3: this_ParameterStructType_2= ruleParameterStructType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_2=ruleParameterStructType();

                    state._fsp--;


                    			current = this_ParameterStructType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRos.g:405:3: this_ParameterIntegerType_3= ruleParameterIntegerType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_3=ruleParameterIntegerType();

                    state._fsp--;


                    			current = this_ParameterIntegerType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRos.g:414:3: this_ParameterStringType_4= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_4=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRos.g:423:3: this_ParameterDoubleType_5= ruleParameterDoubleType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_5=ruleParameterDoubleType();

                    state._fsp--;


                    			current = this_ParameterDoubleType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRos.g:432:3: this_ParameterDateType_6= ruleParameterDateType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDateTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDateType_6=ruleParameterDateType();

                    state._fsp--;


                    			current = this_ParameterDateType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRos.g:441:3: this_ParameterBooleanType_7= ruleParameterBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_7=ruleParameterBooleanType();

                    state._fsp--;


                    			current = this_ParameterBooleanType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRos.g:450:3: this_ParameterBase64Type_8= ruleParameterBase64Type
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_8=ruleParameterBase64Type();

                    state._fsp--;


                    			current = this_ParameterBase64Type_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRos.g:459:3: this_ParameterAnyType_9= ruleParameterAnyType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterAnyTypeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterAnyType_9=ruleParameterAnyType();

                    state._fsp--;


                    			current = this_ParameterAnyType_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRos.g:468:3: this_ParameterArrayType_10= ruleParameterArrayType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_10=ruleParameterArrayType();

                    state._fsp--;


                    			current = this_ParameterArrayType_10;
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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalRos.g:480:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRos.g:480:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRos.g:481:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRos.g:487:1: ruleParameterValue returns [EObject current=null] : (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterAny_0 = null;

        EObject this_ParameterString_1 = null;

        EObject this_ParameterBase64_2 = null;

        EObject this_ParameterInteger_3 = null;

        EObject this_ParameterDouble_4 = null;

        EObject this_ParameterBoolean_5 = null;

        EObject this_ParameterSequence_6 = null;

        EObject this_ParameterStruct_7 = null;

        EObject this_ParameterDate_8 = null;



        	enterRule();

        try {
            // InternalRos.g:493:2: ( (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate ) )
            // InternalRos.g:494:2: (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate )
            {
            // InternalRos.g:494:2: (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt9=1;
                }
                break;
            case 71:
                {
                alt9=2;
                }
                break;
            case 72:
                {
                alt9=3;
                }
                break;
            case 73:
                {
                alt9=4;
                }
                break;
            case 74:
                {
                alt9=5;
                }
                break;
            case 75:
                {
                alt9=6;
                }
                break;
            case 68:
                {
                alt9=7;
                }
                break;
            case 76:
                {
                alt9=8;
                }
                break;
            case 77:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRos.g:495:3: this_ParameterAny_0= ruleParameterAny
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterAnyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterAny_0=ruleParameterAny();

                    state._fsp--;


                    			current = this_ParameterAny_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:504:3: this_ParameterString_1= ruleParameterString
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterString_1=ruleParameterString();

                    state._fsp--;


                    			current = this_ParameterString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:513:3: this_ParameterBase64_2= ruleParameterBase64
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_2=ruleParameterBase64();

                    state._fsp--;


                    			current = this_ParameterBase64_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRos.g:522:3: this_ParameterInteger_3= ruleParameterInteger
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_3=ruleParameterInteger();

                    state._fsp--;


                    			current = this_ParameterInteger_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRos.g:531:3: this_ParameterDouble_4= ruleParameterDouble
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_4=ruleParameterDouble();

                    state._fsp--;


                    			current = this_ParameterDouble_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRos.g:540:3: this_ParameterBoolean_5= ruleParameterBoolean
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_5=ruleParameterBoolean();

                    state._fsp--;


                    			current = this_ParameterBoolean_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRos.g:549:3: this_ParameterSequence_6= ruleParameterSequence
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterSequenceParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterSequence_6=ruleParameterSequence();

                    state._fsp--;


                    			current = this_ParameterSequence_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRos.g:558:3: this_ParameterStruct_7= ruleParameterStruct
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_7=ruleParameterStruct();

                    state._fsp--;


                    			current = this_ParameterStruct_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRos.g:567:3: this_ParameterDate_8= ruleParameterDate
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDateParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDate_8=ruleParameterDate();

                    state._fsp--;


                    			current = this_ParameterDate_8;
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


    // $ANTLR start "entryRuleEString"
    // InternalRos.g:579:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos.g:579:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos.g:580:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos.g:586:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRos.g:592:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos.g:593:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos.g:593:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalRos.g:594:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:602:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleArtifact"
    // InternalRos.g:613:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos.g:613:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos.g:614:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalRos.g:620:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'node' ( (lv_node_4_0= ruleNode ) ) otherlv_5= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_node_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:626:2: ( (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'node' ( (lv_node_4_0= ruleNode ) ) otherlv_5= '}' ) )
            // InternalRos.g:627:2: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'node' ( (lv_node_4_0= ruleNode ) ) otherlv_5= '}' )
            {
            // InternalRos.g:627:2: (otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'node' ( (lv_node_4_0= ruleNode ) ) otherlv_5= '}' )
            // InternalRos.g:628:3: otherlv_0= 'Artifact' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'node' ( (lv_node_4_0= ruleNode ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
            		
            // InternalRos.g:632:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:633:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:633:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:634:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getNodeKeyword_3());
            		
            // InternalRos.g:659:3: ( (lv_node_4_0= ruleNode ) )
            // InternalRos.g:660:4: (lv_node_4_0= ruleNode )
            {
            // InternalRos.g:660:4: (lv_node_4_0= ruleNode )
            // InternalRos.g:661:5: lv_node_4_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_node_4_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_4_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleServiceSpec"
    // InternalRos.g:686:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRos.g:686:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRos.g:687:2: iv_ruleServiceSpec= ruleServiceSpec EOF
            {
             newCompositeNode(grammarAccess.getServiceSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceSpec=ruleServiceSpec();

            state._fsp--;

             current =iv_ruleServiceSpec; 
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
    // $ANTLR end "entryRuleServiceSpec"


    // $ANTLR start "ruleServiceSpec"
    // InternalRos.g:693:1: ruleServiceSpec returns [EObject current=null] : ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleServiceSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_request_5_0 = null;

        EObject lv_response_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:699:2: ( ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:700:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:700:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            // InternalRos.g:701:3: () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}'
            {
            // InternalRos.g:701:3: ()
            // InternalRos.g:702:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceSpecAccess().getServiceSpecKeyword_1());
            		
            // InternalRos.g:712:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:713:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:713:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:714:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:735:3: (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRos.g:736:4: otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceSpecAccess().getRequestKeyword_4_0());
                    			
                    // InternalRos.g:740:4: ( (lv_request_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:741:5: (lv_request_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:741:5: (lv_request_5_0= ruleMessageDefinition )
                    // InternalRos.g:742:6: lv_request_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getRequestMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_request_5_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSpecRule());
                    						}
                    						set(
                    							current,
                    							"request",
                    							lv_request_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos.g:760:3: (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRos.g:761:4: otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceSpecAccess().getResponseKeyword_5_0());
                    			
                    // InternalRos.g:765:4: ( (lv_response_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:766:5: (lv_response_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:766:5: (lv_response_7_0= ruleMessageDefinition )
                    // InternalRos.g:767:6: lv_response_7_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getResponseMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_response_7_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSpecRule());
                    						}
                    						set(
                    							current,
                    							"response",
                    							lv_response_7_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceSpecAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleServiceSpec"


    // $ANTLR start "entryRuleTopicSpec"
    // InternalRos.g:793:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRos.g:793:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRos.g:794:2: iv_ruleTopicSpec= ruleTopicSpec EOF
            {
             newCompositeNode(grammarAccess.getTopicSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicSpec=ruleTopicSpec();

            state._fsp--;

             current =iv_ruleTopicSpec; 
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
    // $ANTLR end "entryRuleTopicSpec"


    // $ANTLR start "ruleTopicSpec"
    // InternalRos.g:800:1: ruleTopicSpec returns [EObject current=null] : ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTopicSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_message_5_0 = null;



        	enterRule();

        try {
            // InternalRos.g:806:2: ( ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:807:2: ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:807:2: ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            // InternalRos.g:808:3: () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}'
            {
            // InternalRos.g:808:3: ()
            // InternalRos.g:809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicSpecAccess().getTopicSpecKeyword_1());
            		
            // InternalRos.g:819:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:820:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:820:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:821:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopicSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopicSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:842:3: (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRos.g:843:4: otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getTopicSpecAccess().getMessageKeyword_4_0());
                    			
                    // InternalRos.g:847:4: ( (lv_message_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:848:5: (lv_message_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:848:5: (lv_message_5_0= ruleMessageDefinition )
                    // InternalRos.g:849:6: lv_message_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getMessageMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_message_5_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicSpecRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTopicSpecAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTopicSpec"


    // $ANTLR start "entryRuleActionSpec"
    // InternalRos.g:875:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRos.g:875:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRos.g:876:2: iv_ruleActionSpec= ruleActionSpec EOF
            {
             newCompositeNode(grammarAccess.getActionSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionSpec=ruleActionSpec();

            state._fsp--;

             current =iv_ruleActionSpec; 
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
    // $ANTLR end "entryRuleActionSpec"


    // $ANTLR start "ruleActionSpec"
    // InternalRos.g:882:1: ruleActionSpec returns [EObject current=null] : ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleActionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_goal_5_0 = null;

        EObject lv_result_7_0 = null;

        EObject lv_feedback_9_0 = null;



        	enterRule();

        try {
            // InternalRos.g:888:2: ( ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) )
            // InternalRos.g:889:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            {
            // InternalRos.g:889:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            // InternalRos.g:890:3: () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}'
            {
            // InternalRos.g:890:3: ()
            // InternalRos.g:891:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActionSpecAccess().getActionSpecKeyword_1());
            		
            // InternalRos.g:901:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:902:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:902:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:903:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getActionSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:924:3: (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRos.g:925:4: otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionSpecAccess().getGoalKeyword_4_0());
                    			
                    // InternalRos.g:929:4: ( (lv_goal_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:930:5: (lv_goal_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:930:5: (lv_goal_5_0= ruleMessageDefinition )
                    // InternalRos.g:931:6: lv_goal_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getGoalMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_goal_5_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"goal",
                    							lv_goal_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos.g:949:3: (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos.g:950:4: otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionSpecAccess().getResultKeyword_5_0());
                    			
                    // InternalRos.g:954:4: ( (lv_result_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:955:5: (lv_result_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:955:5: (lv_result_7_0= ruleMessageDefinition )
                    // InternalRos.g:956:6: lv_result_7_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getResultMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_result_7_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_7_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos.g:974:3: (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos.g:975:4: otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionSpecAccess().getFeedbackKeyword_6_0());
                    			
                    // InternalRos.g:979:4: ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    // InternalRos.g:980:5: (lv_feedback_9_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:980:5: (lv_feedback_9_0= ruleMessageDefinition )
                    // InternalRos.g:981:6: lv_feedback_9_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getFeedbackMessageDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_feedback_9_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"feedback",
                    							lv_feedback_9_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getActionSpecAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleActionSpec"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalRos.g:1007:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos.g:1007:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos.g:1008:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
            {
             newCompositeNode(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageDefinition=ruleMessageDefinition();

            state._fsp--;

             current =iv_ruleMessageDefinition; 
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
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalRos.g:1014:1: ruleMessageDefinition returns [EObject current=null] : ( () otherlv_1= 'MessageDefinition' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:1020:2: ( ( () otherlv_1= 'MessageDefinition' ) )
            // InternalRos.g:1021:2: ( () otherlv_1= 'MessageDefinition' )
            {
            // InternalRos.g:1021:2: ( () otherlv_1= 'MessageDefinition' )
            // InternalRos.g:1022:3: () otherlv_1= 'MessageDefinition'
            {
            // InternalRos.g:1022:3: ()
            // InternalRos.g:1023:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1());
            		

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
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "entryRuleNode"
    // InternalRos.g:1037:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos.g:1037:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos.g:1038:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalRos.g:1044:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_serviceserver_6_0 = null;

        EObject lv_serviceserver_8_0 = null;

        EObject lv_publisher_12_0 = null;

        EObject lv_publisher_14_0 = null;

        EObject lv_subscriber_18_0 = null;

        EObject lv_subscriber_20_0 = null;

        EObject lv_serviceclient_24_0 = null;

        EObject lv_serviceclient_26_0 = null;

        EObject lv_actionserver_30_0 = null;

        EObject lv_actionserver_32_0 = null;

        EObject lv_actionclient_36_0 = null;

        EObject lv_actionclient_38_0 = null;

        EObject lv_parameter_42_0 = null;

        EObject lv_parameter_44_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1050:2: ( (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalRos.g:1051:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalRos.g:1051:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalRos.g:1052:3: otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getNameKeyword_2());
            		
            // InternalRos.g:1064:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1065:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1065:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1066:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:1083:3: (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRos.g:1084:4: otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getServiceserverKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:1092:4: ( (lv_serviceserver_6_0= ruleServiceServer ) )
                    // InternalRos.g:1093:5: (lv_serviceserver_6_0= ruleServiceServer )
                    {
                    // InternalRos.g:1093:5: (lv_serviceserver_6_0= ruleServiceServer )
                    // InternalRos.g:1094:6: lv_serviceserver_6_0= ruleServiceServer
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_serviceserver_6_0=ruleServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"serviceserver",
                    							lv_serviceserver_6_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1111:4: (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRos.g:1112:5: otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_22); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:1116:5: ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    // InternalRos.g:1117:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    {
                    	    // InternalRos.g:1117:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    // InternalRos.g:1118:7: lv_serviceserver_8_0= ruleServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_serviceserver_8_0=ruleServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceserver",
                    	    								lv_serviceserver_8_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ServiceServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1141:3: (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRos.g:1142:4: otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getPublisherKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRos.g:1150:4: ( (lv_publisher_12_0= rulePublisher ) )
                    // InternalRos.g:1151:5: (lv_publisher_12_0= rulePublisher )
                    {
                    // InternalRos.g:1151:5: (lv_publisher_12_0= rulePublisher )
                    // InternalRos.g:1152:6: lv_publisher_12_0= rulePublisher
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_publisher_12_0=rulePublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"publisher",
                    							lv_publisher_12_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.Publisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1169:4: (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRos.g:1170:5: otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_24); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRos.g:1174:5: ( (lv_publisher_14_0= rulePublisher ) )
                    	    // InternalRos.g:1175:6: (lv_publisher_14_0= rulePublisher )
                    	    {
                    	    // InternalRos.g:1175:6: (lv_publisher_14_0= rulePublisher )
                    	    // InternalRos.g:1176:7: lv_publisher_14_0= rulePublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_publisher_14_0=rulePublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"publisher",
                    	    								lv_publisher_14_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.Publisher");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1199:3: (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRos.g:1200:4: otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getSubscriberKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_26); 

                    				newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRos.g:1208:4: ( (lv_subscriber_18_0= ruleSubscriber ) )
                    // InternalRos.g:1209:5: (lv_subscriber_18_0= ruleSubscriber )
                    {
                    // InternalRos.g:1209:5: (lv_subscriber_18_0= ruleSubscriber )
                    // InternalRos.g:1210:6: lv_subscriber_18_0= ruleSubscriber
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_subscriber_18_0=ruleSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"subscriber",
                    							lv_subscriber_18_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.Subscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1227:4: (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRos.g:1228:5: otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos.g:1232:5: ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    // InternalRos.g:1233:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    {
                    	    // InternalRos.g:1233:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    // InternalRos.g:1234:7: lv_subscriber_20_0= ruleSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_subscriber_20_0=ruleSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subscriber",
                    	    								lv_subscriber_20_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.Subscriber");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1257:3: (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRos.g:1258:4: otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getServiceclientKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRos.g:1266:4: ( (lv_serviceclient_24_0= ruleServiceClient ) )
                    // InternalRos.g:1267:5: (lv_serviceclient_24_0= ruleServiceClient )
                    {
                    // InternalRos.g:1267:5: (lv_serviceclient_24_0= ruleServiceClient )
                    // InternalRos.g:1268:6: lv_serviceclient_24_0= ruleServiceClient
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_serviceclient_24_0=ruleServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"serviceclient",
                    							lv_serviceclient_24_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1285:4: (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRos.g:1286:5: otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos.g:1290:5: ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    // InternalRos.g:1291:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    {
                    	    // InternalRos.g:1291:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    // InternalRos.g:1292:7: lv_serviceclient_26_0= ruleServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_serviceclient_26_0=ruleServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceclient",
                    	    								lv_serviceclient_26_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ServiceClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1315:3: (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRos.g:1316:4: otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getActionserverKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_29, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRos.g:1324:4: ( (lv_actionserver_30_0= ruleActionServer ) )
                    // InternalRos.g:1325:5: (lv_actionserver_30_0= ruleActionServer )
                    {
                    // InternalRos.g:1325:5: (lv_actionserver_30_0= ruleActionServer )
                    // InternalRos.g:1326:6: lv_actionserver_30_0= ruleActionServer
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_actionserver_30_0=ruleActionServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"actionserver",
                    							lv_actionserver_30_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ActionServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1343:4: (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==14) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalRos.g:1344:5: otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_30); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRos.g:1348:5: ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    // InternalRos.g:1349:6: (lv_actionserver_32_0= ruleActionServer )
                    	    {
                    	    // InternalRos.g:1349:6: (lv_actionserver_32_0= ruleActionServer )
                    	    // InternalRos.g:1350:7: lv_actionserver_32_0= ruleActionServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_actionserver_32_0=ruleActionServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionserver",
                    	    								lv_actionserver_32_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ActionServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_33, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1373:3: (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRos.g:1374:4: otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getNodeAccess().getActionclientKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_35, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRos.g:1382:4: ( (lv_actionclient_36_0= ruleActionClient ) )
                    // InternalRos.g:1383:5: (lv_actionclient_36_0= ruleActionClient )
                    {
                    // InternalRos.g:1383:5: (lv_actionclient_36_0= ruleActionClient )
                    // InternalRos.g:1384:6: lv_actionclient_36_0= ruleActionClient
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_actionclient_36_0=ruleActionClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"actionclient",
                    							lv_actionclient_36_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ActionClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1401:4: (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRos.g:1402:5: otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getNodeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRos.g:1406:5: ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    // InternalRos.g:1407:6: (lv_actionclient_38_0= ruleActionClient )
                    	    {
                    	    // InternalRos.g:1407:6: (lv_actionclient_38_0= ruleActionClient )
                    	    // InternalRos.g:1408:7: lv_actionclient_38_0= ruleActionClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_actionclient_38_0=ruleActionClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionclient",
                    	    								lv_actionclient_38_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ActionClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_39, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1431:3: (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRos.g:1432:4: otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,37,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getNodeAccess().getParameterKeyword_10_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_41, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRos.g:1440:4: ( (lv_parameter_42_0= ruleParameter ) )
                    // InternalRos.g:1441:5: (lv_parameter_42_0= ruleParameter )
                    {
                    // InternalRos.g:1441:5: (lv_parameter_42_0= ruleParameter )
                    // InternalRos.g:1442:6: lv_parameter_42_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameter_42_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_42_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1459:4: (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRos.g:1460:5: otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_34); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getNodeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRos.g:1464:5: ( (lv_parameter_44_0= ruleParameter ) )
                    	    // InternalRos.g:1465:6: (lv_parameter_44_0= ruleParameter )
                    	    {
                    	    // InternalRos.g:1465:6: (lv_parameter_44_0= ruleParameter )
                    	    // InternalRos.g:1466:7: lv_parameter_44_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameter_44_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_44_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_45, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleServiceServer"
    // InternalRos.g:1497:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos.g:1497:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos.g:1498:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRos.g:1504:1: ruleServiceServer returns [EObject current=null] : (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1510:2: ( (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) )
            // InternalRos.g:1511:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            {
            // InternalRos.g:1511:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            // InternalRos.g:1512:3: otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceServerAccess().getServiceServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:1524:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1525:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1525:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1526:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getServiceKeyword_4());
            		
            // InternalRos.g:1547:3: ( ( ruleEString ) )
            // InternalRos.g:1548:4: ( ruleEString )
            {
            // InternalRos.g:1548:4: ( ruleEString )
            // InternalRos.g:1549:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNamespaceKeyword_6());
            		
            // InternalRos.g:1567:3: ( (lv_namespace_7_0= ruleNamespace ) )
            // InternalRos.g:1568:4: (lv_namespace_7_0= ruleNamespace )
            {
            // InternalRos.g:1568:4: (lv_namespace_7_0= ruleNamespace )
            // InternalRos.g:1569:5: lv_namespace_7_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_namespace_7_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceServerRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_7_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRulePublisher"
    // InternalRos.g:1594:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos.g:1594:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos.g:1595:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos.g:1601:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1607:2: ( (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) )
            // InternalRos.g:1608:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            {
            // InternalRos.g:1608:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            // InternalRos.g:1609:3: otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getNameKeyword_2());
            		
            // InternalRos.g:1621:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1622:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1622:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1623:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getMessageKeyword_4());
            		
            // InternalRos.g:1644:3: ( ( ruleEString ) )
            // InternalRos.g:1645:4: ( ruleEString )
            {
            // InternalRos.g:1645:4: ( ruleEString )
            // InternalRos.g:1646:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNamespaceKeyword_6());
            		
            // InternalRos.g:1664:3: ( (lv_namespace_7_0= ruleNamespace ) )
            // InternalRos.g:1665:4: (lv_namespace_7_0= ruleNamespace )
            {
            // InternalRos.g:1665:4: (lv_namespace_7_0= ruleNamespace )
            // InternalRos.g:1666:5: lv_namespace_7_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_namespace_7_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_7_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRos.g:1691:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos.g:1691:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos.g:1692:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos.g:1698:1: ruleSubscriber returns [EObject current=null] : (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1704:2: ( (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) )
            // InternalRos.g:1705:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            {
            // InternalRos.g:1705:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            // InternalRos.g:1706:3: otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberAccess().getSubscriberKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getNameKeyword_2());
            		
            // InternalRos.g:1718:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1719:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1719:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1720:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getMessageKeyword_4());
            		
            // InternalRos.g:1741:3: ( ( ruleEString ) )
            // InternalRos.g:1742:4: ( ruleEString )
            {
            // InternalRos.g:1742:4: ( ruleEString )
            // InternalRos.g:1743:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNamespaceKeyword_6());
            		
            // InternalRos.g:1761:3: ( (lv_namespace_7_0= ruleNamespace ) )
            // InternalRos.g:1762:4: (lv_namespace_7_0= ruleNamespace )
            {
            // InternalRos.g:1762:4: (lv_namespace_7_0= ruleNamespace )
            // InternalRos.g:1763:5: lv_namespace_7_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_namespace_7_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_7_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleServiceClient"
    // InternalRos.g:1788:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos.g:1788:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos.g:1789:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRos.g:1795:1: ruleServiceClient returns [EObject current=null] : (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1801:2: ( (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) )
            // InternalRos.g:1802:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            {
            // InternalRos.g:1802:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            // InternalRos.g:1803:3: otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceClientAccess().getServiceClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:1815:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1816:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1816:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1817:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getServiceKeyword_4());
            		
            // InternalRos.g:1838:3: ( ( ruleEString ) )
            // InternalRos.g:1839:4: ( ruleEString )
            {
            // InternalRos.g:1839:4: ( ruleEString )
            // InternalRos.g:1840:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNamespaceKeyword_6());
            		
            // InternalRos.g:1858:3: ( (lv_namespace_7_0= ruleNamespace ) )
            // InternalRos.g:1859:4: (lv_namespace_7_0= ruleNamespace )
            {
            // InternalRos.g:1859:4: (lv_namespace_7_0= ruleNamespace )
            // InternalRos.g:1860:5: lv_namespace_7_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_namespace_7_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceClientRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_7_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleActionServer"
    // InternalRos.g:1885:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos.g:1885:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos.g:1886:2: iv_ruleActionServer= ruleActionServer EOF
            {
             newCompositeNode(grammarAccess.getActionServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionServer=ruleActionServer();

            state._fsp--;

             current =iv_ruleActionServer; 
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
    // $ANTLR end "entryRuleActionServer"


    // $ANTLR start "ruleActionServer"
    // InternalRos.g:1892:1: ruleActionServer returns [EObject current=null] : (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) ;
    public final EObject ruleActionServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1898:2: ( (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) )
            // InternalRos.g:1899:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            {
            // InternalRos.g:1899:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            // InternalRos.g:1900:3: otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionServerAccess().getActionServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getActionServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:1912:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1913:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1913:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1914:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getActionKeyword_4());
            		
            // InternalRos.g:1935:3: ( ( ruleEString ) )
            // InternalRos.g:1936:4: ( ruleEString )
            {
            // InternalRos.g:1936:4: ( ruleEString )
            // InternalRos.g:1937:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNamespaceKeyword_6());
            		
            // InternalRos.g:1955:3: ( (lv_namespace_7_0= ruleNamespace ) )
            // InternalRos.g:1956:4: (lv_namespace_7_0= ruleNamespace )
            {
            // InternalRos.g:1956:4: (lv_namespace_7_0= ruleNamespace )
            // InternalRos.g:1957:5: lv_namespace_7_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_namespace_7_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionServerRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_7_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActionServerAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleActionServer"


    // $ANTLR start "entryRuleActionClient"
    // InternalRos.g:1982:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos.g:1982:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos.g:1983:2: iv_ruleActionClient= ruleActionClient EOF
            {
             newCompositeNode(grammarAccess.getActionClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionClient=ruleActionClient();

            state._fsp--;

             current =iv_ruleActionClient; 
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
    // $ANTLR end "entryRuleActionClient"


    // $ANTLR start "ruleActionClient"
    // InternalRos.g:1989:1: ruleActionClient returns [EObject current=null] : (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) ;
    public final EObject ruleActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1995:2: ( (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' ) )
            // InternalRos.g:1996:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            {
            // InternalRos.g:1996:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}' )
            // InternalRos.g:1997:3: otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionClientAccess().getActionClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2009:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2010:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2010:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2011:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getActionKeyword_4());
            		
            // InternalRos.g:2032:3: ( ( ruleEString ) )
            // InternalRos.g:2033:4: ( ruleEString )
            {
            // InternalRos.g:2033:4: ( ruleEString )
            // InternalRos.g:2034:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNamespaceKeyword_6());
            		
            // InternalRos.g:2052:3: ( (lv_namespace_7_0= ruleNamespace ) )
            // InternalRos.g:2053:4: (lv_namespace_7_0= ruleNamespace )
            {
            // InternalRos.g:2053:4: (lv_namespace_7_0= ruleNamespace )
            // InternalRos.g:2054:5: lv_namespace_7_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_namespace_7_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionClientRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_7_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActionClientAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleActionClient"


    // $ANTLR start "entryRuleGraphName"
    // InternalRos.g:2079:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos.g:2079:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos.g:2080:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos.g:2086:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:2092:2: (kw= 'GraphName' )
            // InternalRos.g:2093:2: kw= 'GraphName'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
            	

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


    // $ANTLR start "entryRuleParameter"
    // InternalRos.g:2101:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos.g:2101:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos.g:2102:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRos.g:2108:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2114:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) )
            // InternalRos.g:2115:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            {
            // InternalRos.g:2115:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            // InternalRos.g:2116:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalRos.g:2128:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2129:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2129:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2130:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_37); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNamespaceKeyword_4());
            		
            // InternalRos.g:2151:3: ( (lv_namespace_5_0= ruleNamespace ) )
            // InternalRos.g:2152:4: (lv_namespace_5_0= ruleNamespace )
            {
            // InternalRos.g:2152:4: (lv_namespace_5_0= ruleNamespace )
            // InternalRos.g:2153:5: lv_namespace_5_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
            lv_namespace_5_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_5_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_6());
            		
            // InternalRos.g:2174:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalRos.g:2175:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalRos.g:2175:4: (lv_type_7_0= ruleParameterType )
            // InternalRos.g:2176:5: lv_type_7_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_7_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRos.g:2201:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos.g:2201:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos.g:2202:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos.g:2208:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2214:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2215:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2215:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2216:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2216:3: ()
            // InternalRos.g:2217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2231:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRos.g:2232:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2240:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2241:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2241:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2242:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:2259:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalRos.g:2260:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2264:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2265:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2265:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2266:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2297:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos.g:2297:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos.g:2298:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos.g:2304:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2310:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2311:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2311:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2312:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2312:3: ()
            // InternalRos.g:2313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2327:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRos.g:2328:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2336:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2337:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2337:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2338:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:2355:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRos.g:2356:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2360:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2361:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2361:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2362:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2393:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos.g:2393:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos.g:2394:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos.g:2400:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2406:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2407:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2407:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2408:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2408:3: ()
            // InternalRos.g:2409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2423:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRos.g:2424:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2432:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2433:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2433:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2434:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:2451:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRos.g:2452:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_43); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2456:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2457:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2457:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2458:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameterType_Impl"
    // InternalRos.g:2489:1: entryRuleParameterType_Impl returns [EObject current=null] : iv_ruleParameterType_Impl= ruleParameterType_Impl EOF ;
    public final EObject entryRuleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType_Impl = null;


        try {
            // InternalRos.g:2489:59: (iv_ruleParameterType_Impl= ruleParameterType_Impl EOF )
            // InternalRos.g:2490:2: iv_ruleParameterType_Impl= ruleParameterType_Impl EOF
            {
             newCompositeNode(grammarAccess.getParameterType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType_Impl=ruleParameterType_Impl();

            state._fsp--;

             current =iv_ruleParameterType_Impl; 
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
    // $ANTLR end "entryRuleParameterType_Impl"


    // $ANTLR start "ruleParameterType_Impl"
    // InternalRos.g:2496:1: ruleParameterType_Impl returns [EObject current=null] : ( () otherlv_1= 'ParameterType' ) ;
    public final EObject ruleParameterType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:2502:2: ( ( () otherlv_1= 'ParameterType' ) )
            // InternalRos.g:2503:2: ( () otherlv_1= 'ParameterType' )
            {
            // InternalRos.g:2503:2: ( () otherlv_1= 'ParameterType' )
            // InternalRos.g:2504:3: () otherlv_1= 'ParameterType'
            {
            // InternalRos.g:2504:3: ()
            // InternalRos.g:2505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterType_ImplAccess().getParameterTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterType_ImplAccess().getParameterTypeKeyword_1());
            		

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
    // $ANTLR end "ruleParameterType_Impl"


    // $ANTLR start "entryRuleParameterListType"
    // InternalRos.g:2519:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos.g:2519:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos.g:2520:2: iv_ruleParameterListType= ruleParameterListType EOF
            {
             newCompositeNode(grammarAccess.getParameterListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterListType=ruleParameterListType();

            state._fsp--;

             current =iv_ruleParameterListType; 
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
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalRos.g:2526:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleParameterListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_sequence_5_0 = null;

        EObject lv_sequence_7_0 = null;

        EObject lv_default_10_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2532:2: ( ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) )
            // InternalRos.g:2533:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            {
            // InternalRos.g:2533:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            // InternalRos.g:2534:3: () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}'
            {
            // InternalRos.g:2534:3: ()
            // InternalRos.g:2535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getParameterListTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2549:3: (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRos.g:2550:4: otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterListTypeAccess().getSequenceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2558:4: ( (lv_sequence_5_0= ruleParameterType ) )
                    // InternalRos.g:2559:5: (lv_sequence_5_0= ruleParameterType )
                    {
                    // InternalRos.g:2559:5: (lv_sequence_5_0= ruleParameterType )
                    // InternalRos.g:2560:6: lv_sequence_5_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sequence_5_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    						}
                    						add(
                    							current,
                    							"sequence",
                    							lv_sequence_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:2577:4: (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalRos.g:2578:5: otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2582:5: ( (lv_sequence_7_0= ruleParameterType ) )
                    	    // InternalRos.g:2583:6: (lv_sequence_7_0= ruleParameterType )
                    	    {
                    	    // InternalRos.g:2583:6: (lv_sequence_7_0= ruleParameterType )
                    	    // InternalRos.g:2584:7: lv_sequence_7_0= ruleParameterType
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_sequence_7_0=ruleParameterType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sequence",
                    	    								lv_sequence_7_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ParameterType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:2607:3: (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRos.g:2608:4: otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) )
                    {
                    otherlv_9=(Token)match(input,57,FOLLOW_46); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterListTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:2612:4: ( (lv_default_10_0= ruleParameterSequence ) )
                    // InternalRos.g:2613:5: (lv_default_10_0= ruleParameterSequence )
                    {
                    // InternalRos.g:2613:5: (lv_default_10_0= ruleParameterSequence )
                    // InternalRos.g:2614:6: lv_default_10_0= ruleParameterSequence
                    {

                    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getDefaultParameterSequenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_10_0=ruleParameterSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_10_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalRos.g:2640:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos.g:2640:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos.g:2641:2: iv_ruleParameterStructType= ruleParameterStructType EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructType=ruleParameterStructType();

            state._fsp--;

             current =iv_ruleParameterStructType; 
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
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalRos.g:2647:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleParameterStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameterstructypetmember_5_0 = null;

        EObject lv_parameterstructypetmember_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2653:2: ( ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2654:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2654:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2655:3: () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2655:3: ()
            // InternalRos.g:2656:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getParameterStructTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2670:3: (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==59) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRos.g:2671:4: otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2679:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
                    // InternalRos.g:2680:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    {
                    // InternalRos.g:2680:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    // InternalRos.g:2681:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
                    						}
                    						add(
                    							current,
                    							"parameterstructypetmember",
                    							lv_parameterstructypetmember_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterStructTypeMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:2698:4: (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRos.g:2699:5: otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2703:5: ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    // InternalRos.g:2704:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    {
                    	    // InternalRos.g:2704:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    // InternalRos.g:2705:7: lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_parameterstructypetmember_7_0=ruleParameterStructTypeMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameterstructypetmember",
                    	    								lv_parameterstructypetmember_7_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ParameterStructTypeMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalRos.g:2736:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos.g:2736:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos.g:2737:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterIntegerType=ruleParameterIntegerType();

            state._fsp--;

             current =iv_ruleParameterIntegerType; 
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
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalRos.g:2743:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2749:2: ( ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:2750:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:2750:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            // InternalRos.g:2751:3: () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:2751:3: ()
            // InternalRos.g:2752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2766:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRos.g:2767:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_49); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:2771:4: ( (lv_default_4_0= ruleParameterInteger ) )
                    // InternalRos.g:2772:5: (lv_default_4_0= ruleParameterInteger )
                    {
                    // InternalRos.g:2772:5: (lv_default_4_0= ruleParameterInteger )
                    // InternalRos.g:2773:6: lv_default_4_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_4_0=ruleParameterInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterIntegerTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalRos.g:2799:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos.g:2799:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos.g:2800:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
             newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;

             current =iv_ruleParameterStringType; 
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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalRos.g:2806:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2812:2: ( ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:2813:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:2813:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            // InternalRos.g:2814:3: () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:2814:3: ()
            // InternalRos.g:2815:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getParameterStringTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2829:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==57) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRos.g:2830:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:2834:4: ( (lv_default_4_0= ruleParameterString ) )
                    // InternalRos.g:2835:5: (lv_default_4_0= ruleParameterString )
                    {
                    // InternalRos.g:2835:5: (lv_default_4_0= ruleParameterString )
                    // InternalRos.g:2836:6: lv_default_4_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_4_0=ruleParameterString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterStringTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalRos.g:2862:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos.g:2862:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos.g:2863:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDoubleType=ruleParameterDoubleType();

            state._fsp--;

             current =iv_ruleParameterDoubleType; 
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
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalRos.g:2869:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2875:2: ( ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:2876:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:2876:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            // InternalRos.g:2877:3: () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:2877:3: ()
            // InternalRos.g:2878:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2892:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==57) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRos.g:2893:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_51); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:2897:4: ( (lv_default_4_0= ruleParameterDouble ) )
                    // InternalRos.g:2898:5: (lv_default_4_0= ruleParameterDouble )
                    {
                    // InternalRos.g:2898:5: (lv_default_4_0= ruleParameterDouble )
                    // InternalRos.g:2899:6: lv_default_4_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_4_0=ruleParameterDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterDoubleTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterDateType"
    // InternalRos.g:2925:1: entryRuleParameterDateType returns [EObject current=null] : iv_ruleParameterDateType= ruleParameterDateType EOF ;
    public final EObject entryRuleParameterDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDateType = null;


        try {
            // InternalRos.g:2925:58: (iv_ruleParameterDateType= ruleParameterDateType EOF )
            // InternalRos.g:2926:2: iv_ruleParameterDateType= ruleParameterDateType EOF
            {
             newCompositeNode(grammarAccess.getParameterDateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDateType=ruleParameterDateType();

            state._fsp--;

             current =iv_ruleParameterDateType; 
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
    // $ANTLR end "entryRuleParameterDateType"


    // $ANTLR start "ruleParameterDateType"
    // InternalRos.g:2932:1: ruleParameterDateType returns [EObject current=null] : ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2938:2: ( ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:2939:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:2939:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            // InternalRos.g:2940:3: () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:2940:3: ()
            // InternalRos.g:2941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDateTypeAccess().getParameterDateTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateTypeAccess().getParameterDateTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2955:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRos.g:2956:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_52); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDateTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:2960:4: ( (lv_default_4_0= ruleParameterDate ) )
                    // InternalRos.g:2961:5: (lv_default_4_0= ruleParameterDate )
                    {
                    // InternalRos.g:2961:5: (lv_default_4_0= ruleParameterDate )
                    // InternalRos.g:2962:6: lv_default_4_0= ruleParameterDate
                    {

                    						newCompositeNode(grammarAccess.getParameterDateTypeAccess().getDefaultParameterDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_4_0=ruleParameterDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDateTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterDateTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterDateType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalRos.g:2988:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos.g:2988:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos.g:2989:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBooleanType=ruleParameterBooleanType();

            state._fsp--;

             current =iv_ruleParameterBooleanType; 
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
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalRos.g:2995:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3001:2: ( ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3002:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3002:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            // InternalRos.g:3003:3: () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3003:3: ()
            // InternalRos.g:3004:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3018:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRos.g:3019:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_53); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3023:4: ( (lv_default_4_0= ruleParameterBoolean ) )
                    // InternalRos.g:3024:5: (lv_default_4_0= ruleParameterBoolean )
                    {
                    // InternalRos.g:3024:5: (lv_default_4_0= ruleParameterBoolean )
                    // InternalRos.g:3025:6: lv_default_4_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_4_0=ruleParameterBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterBooleanTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalRos.g:3051:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos.g:3051:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos.g:3052:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64TypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64Type=ruleParameterBase64Type();

            state._fsp--;

             current =iv_ruleParameterBase64Type; 
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
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalRos.g:3058:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3064:2: ( ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3065:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3065:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            // InternalRos.g:3066:3: () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3066:3: ()
            // InternalRos.g:3067:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3081:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRos.g:3082:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_54); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3086:4: ( (lv_default_4_0= ruleParameterBase64 ) )
                    // InternalRos.g:3087:5: (lv_default_4_0= ruleParameterBase64 )
                    {
                    // InternalRos.g:3087:5: (lv_default_4_0= ruleParameterBase64 )
                    // InternalRos.g:3088:6: lv_default_4_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_4_0=ruleParameterBase64();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterBase64");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterBase64TypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterAnyType"
    // InternalRos.g:3114:1: entryRuleParameterAnyType returns [EObject current=null] : iv_ruleParameterAnyType= ruleParameterAnyType EOF ;
    public final EObject entryRuleParameterAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAnyType = null;


        try {
            // InternalRos.g:3114:57: (iv_ruleParameterAnyType= ruleParameterAnyType EOF )
            // InternalRos.g:3115:2: iv_ruleParameterAnyType= ruleParameterAnyType EOF
            {
             newCompositeNode(grammarAccess.getParameterAnyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterAnyType=ruleParameterAnyType();

            state._fsp--;

             current =iv_ruleParameterAnyType; 
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
    // $ANTLR end "entryRuleParameterAnyType"


    // $ANTLR start "ruleParameterAnyType"
    // InternalRos.g:3121:1: ruleParameterAnyType returns [EObject current=null] : ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3127:2: ( ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3128:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3128:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            // InternalRos.g:3129:3: () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3129:3: ()
            // InternalRos.g:3130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3144:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==57) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRos.g:3145:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3149:4: ( (lv_default_4_0= ruleParameterAny ) )
                    // InternalRos.g:3150:5: (lv_default_4_0= ruleParameterAny )
                    {
                    // InternalRos.g:3150:5: (lv_default_4_0= ruleParameterAny )
                    // InternalRos.g:3151:6: lv_default_4_0= ruleParameterAny
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyTypeAccess().getDefaultParameterAnyParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_4_0=ruleParameterAny();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterAny");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAnyTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterAnyType"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalRos.g:3177:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos.g:3177:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos.g:3178:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
            {
             newCompositeNode(grammarAccess.getParameterArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterArrayType=ruleParameterArrayType();

            state._fsp--;

             current =iv_ruleParameterArrayType; 
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
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalRos.g:3184:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3190:2: ( (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:3191:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:3191:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            // InternalRos.g:3192:3: otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getParameterArrayTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,49,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRos.g:3204:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRos.g:3205:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRos.g:3205:4: (lv_type_3_0= ruleParameterType )
            // InternalRos.g:3206:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
            lv_type_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:3223:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos.g:3224:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:3228:4: ( (lv_default_5_0= ruleParameterSequence ) )
                    // InternalRos.g:3229:5: (lv_default_5_0= ruleParameterSequence )
                    {
                    // InternalRos.g:3229:5: (lv_default_5_0= ruleParameterSequence )
                    // InternalRos.g:3230:6: lv_default_5_0= ruleParameterSequence
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterSequenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_5_0=ruleParameterSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterArrayTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterSequence"
    // InternalRos.g:3256:1: entryRuleParameterSequence returns [EObject current=null] : iv_ruleParameterSequence= ruleParameterSequence EOF ;
    public final EObject entryRuleParameterSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSequence = null;


        try {
            // InternalRos.g:3256:58: (iv_ruleParameterSequence= ruleParameterSequence EOF )
            // InternalRos.g:3257:2: iv_ruleParameterSequence= ruleParameterSequence EOF
            {
             newCompositeNode(grammarAccess.getParameterSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterSequence=ruleParameterSequence();

            state._fsp--;

             current =iv_ruleParameterSequence; 
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
    // $ANTLR end "entryRuleParameterSequence"


    // $ANTLR start "ruleParameterSequence"
    // InternalRos.g:3263:1: ruleParameterSequence returns [EObject current=null] : ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleParameterSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3269:2: ( ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3270:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3270:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3271:3: () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3271:3: ()
            // InternalRos.g:3272:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterSequenceAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSequenceAccess().getParameterSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3286:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==69) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRos.g:3287:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterSequenceAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3295:4: ( (lv_value_5_0= ruleParameterValue ) )
                    // InternalRos.g:3296:5: (lv_value_5_0= ruleParameterValue )
                    {
                    // InternalRos.g:3296:5: (lv_value_5_0= ruleParameterValue )
                    // InternalRos.g:3297:6: lv_value_5_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterSequenceAccess().getValueParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_5_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterSequenceRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:3314:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRos.g:3315:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_57); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterSequenceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3319:5: ( (lv_value_7_0= ruleParameterValue ) )
                    	    // InternalRos.g:3320:6: (lv_value_7_0= ruleParameterValue )
                    	    {
                    	    // InternalRos.g:3320:6: (lv_value_7_0= ruleParameterValue )
                    	    // InternalRos.g:3321:7: lv_value_7_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterSequenceAccess().getValueParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_value_7_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterSequenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_7_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterSequenceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterSequenceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterSequence"


    // $ANTLR start "entryRuleParameterAny"
    // InternalRos.g:3352:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos.g:3352:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos.g:3353:2: iv_ruleParameterAny= ruleParameterAny EOF
            {
             newCompositeNode(grammarAccess.getParameterAnyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterAny=ruleParameterAny();

            state._fsp--;

             current =iv_ruleParameterAny; 
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
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalRos.g:3359:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3365:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3366:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3366:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRos.g:3367:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3367:3: ()
            // InternalRos.g:3368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3382:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==69) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRos.g:3383:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRos.g:3387:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRos.g:3388:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRos.g:3388:5: (lv_value_4_0= ruleEString )
                    // InternalRos.g:3389:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAnyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalRos.g:3415:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos.g:3415:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos.g:3416:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos.g:3422:1: ruleParameterString returns [EObject current=null] : (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3428:2: ( (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalRos.g:3429:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3429:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalRos.g:3430:3: otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStringAccess().getParameterStringKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringAccess().getValueKeyword_2());
            		
            // InternalRos.g:3442:3: ( (lv_value_3_0= ruleEString ) )
            // InternalRos.g:3443:4: (lv_value_3_0= ruleEString )
            {
            // InternalRos.g:3443:4: (lv_value_3_0= ruleEString )
            // InternalRos.g:3444:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStringRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterStringAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRos.g:3469:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos.g:3469:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos.g:3470:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos.g:3476:1: ruleParameterBase64 returns [EObject current=null] : (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3482:2: ( (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) )
            // InternalRos.g:3483:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3483:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            // InternalRos.g:3484:3: otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBase64Access().getParameterBase64Keyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64Access().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64Access().getValueKeyword_2());
            		
            // InternalRos.g:3496:3: ( (lv_value_3_0= ruleBase64Binary ) )
            // InternalRos.g:3497:4: (lv_value_3_0= ruleBase64Binary )
            {
            // InternalRos.g:3497:4: (lv_value_3_0= ruleBase64Binary )
            // InternalRos.g:3498:5: lv_value_3_0= ruleBase64Binary
            {

            					newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleBase64Binary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Base64Binary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterBase64Access().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRos.g:3523:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos.g:3523:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos.g:3524:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos.g:3530:1: ruleParameterInteger returns [EObject current=null] : (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3536:2: ( (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) )
            // InternalRos.g:3537:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3537:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            // InternalRos.g:3538:3: otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterIntegerAccess().getParameterIntegerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerAccess().getValueKeyword_2());
            		
            // InternalRos.g:3550:3: ( (lv_value_3_0= ruleInt0 ) )
            // InternalRos.g:3551:4: (lv_value_3_0= ruleInt0 )
            {
            // InternalRos.g:3551:4: (lv_value_3_0= ruleInt0 )
            // InternalRos.g:3552:5: lv_value_3_0= ruleInt0
            {

            					newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInt0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleInt0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Int0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterIntegerAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRos.g:3577:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos.g:3577:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos.g:3578:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos.g:3584:1: ruleParameterDouble returns [EObject current=null] : (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3590:2: ( (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) )
            // InternalRos.g:3591:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3591:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            // InternalRos.g:3592:3: otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDoubleAccess().getParameterDoubleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleAccess().getValueKeyword_2());
            		
            // InternalRos.g:3604:3: ( (lv_value_3_0= ruleDouble ) )
            // InternalRos.g:3605:4: (lv_value_3_0= ruleDouble )
            {
            // InternalRos.g:3605:4: (lv_value_3_0= ruleDouble )
            // InternalRos.g:3606:5: lv_value_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterDoubleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalRos.g:3631:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos.g:3631:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos.g:3632:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos.g:3638:1: ruleParameterBoolean returns [EObject current=null] : (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3644:2: ( (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // InternalRos.g:3645:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3645:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // InternalRos.g:3646:3: otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBooleanAccess().getParameterBooleanKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanAccess().getValueKeyword_2());
            		
            // InternalRos.g:3658:3: ( (lv_value_3_0= ruleBoolean ) )
            // InternalRos.g:3659:4: (lv_value_3_0= ruleBoolean )
            {
            // InternalRos.g:3659:4: (lv_value_3_0= ruleBoolean )
            // InternalRos.g:3660:5: lv_value_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterBooleanAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleParameterStruct"
    // InternalRos.g:3685:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos.g:3685:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos.g:3686:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos.g:3692:1: ruleParameterStruct returns [EObject current=null] : ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3698:2: ( ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3699:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3699:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3700:3: () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3700:3: ()
            // InternalRos.g:3701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getParameterStructKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3715:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==69) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRos.g:3716:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_63); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3724:4: ( (lv_value_5_0= ruleParameterStructMember ) )
                    // InternalRos.g:3725:5: (lv_value_5_0= ruleParameterStructMember )
                    {
                    // InternalRos.g:3725:5: (lv_value_5_0= ruleParameterStructMember )
                    // InternalRos.g:3726:6: lv_value_5_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_5_0=ruleParameterStructMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterStructMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:3743:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalRos.g:3744:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_63); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3748:5: ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    // InternalRos.g:3749:6: (lv_value_7_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRos.g:3749:6: (lv_value_7_0= ruleParameterStructMember )
                    	    // InternalRos.g:3750:7: lv_value_7_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_value_7_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_7_0,
                    	    								"de.fraunhofer.ipa.ros.xtext.Ros.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleParameterDate"
    // InternalRos.g:3781:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos.g:3781:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos.g:3782:2: iv_ruleParameterDate= ruleParameterDate EOF
            {
             newCompositeNode(grammarAccess.getParameterDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDate=ruleParameterDate();

            state._fsp--;

             current =iv_ruleParameterDate; 
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
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalRos.g:3788:1: ruleParameterDate returns [EObject current=null] : (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3794:2: ( (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) )
            // InternalRos.g:3795:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3795:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            // InternalRos.g:3796:3: otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDateAccess().getParameterDateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,69,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateAccess().getValueKeyword_2());
            		
            // InternalRos.g:3808:3: ( (lv_value_3_0= ruleDateTime ) )
            // InternalRos.g:3809:4: (lv_value_3_0= ruleDateTime )
            {
            // InternalRos.g:3809:4: (lv_value_3_0= ruleDateTime )
            // InternalRos.g:3810:5: lv_value_3_0= ruleDateTime
            {

            					newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleDateTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.DateTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterDateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalRos.g:3835:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos.g:3835:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos.g:3836:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos.g:3842:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Base64Binary' ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:3848:2: (kw= 'Base64Binary' )
            // InternalRos.g:3849:2: kw= 'Base64Binary'
            {
            kw=(Token)match(input,78,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBase64BinaryAccess().getBase64BinaryKeyword());
            	

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


    // $ANTLR start "entryRuleInt0"
    // InternalRos.g:3857:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // InternalRos.g:3857:44: (iv_ruleInt0= ruleInt0 EOF )
            // InternalRos.g:3858:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
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
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalRos.g:3864:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:3870:2: (kw= 'Int' )
            // InternalRos.g:3871:2: kw= 'Int'
            {
            kw=(Token)match(input,79,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInt0Access().getIntKeyword());
            	

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
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleDouble"
    // InternalRos.g:3879:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalRos.g:3879:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalRos.g:3880:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalRos.g:3886:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Double' ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:3892:2: (kw= 'Double' )
            // InternalRos.g:3893:2: kw= 'Double'
            {
            kw=(Token)match(input,80,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDoubleAccess().getDoubleKeyword());
            	

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
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleBoolean"
    // InternalRos.g:3901:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalRos.g:3901:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRos.g:3902:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRos.g:3908:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:3914:2: (kw= 'Boolean' )
            // InternalRos.g:3915:2: kw= 'Boolean'
            {
            kw=(Token)match(input,81,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBooleanAccess().getBooleanKeyword());
            	

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalRos.g:3923:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos.g:3923:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos.g:3924:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos.g:3930:1: ruleParameterStructMember returns [EObject current=null] : (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3936:2: ( (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) )
            // InternalRos.g:3937:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            {
            // InternalRos.g:3937:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            // InternalRos.g:3938:3: otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0());
            		
            // InternalRos.g:3942:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:3943:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:3943:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:3944:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,69,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructMemberAccess().getValueKeyword_3());
            		
            // InternalRos.g:3969:3: ( (lv_value_4_0= ruleParameterValue ) )
            // InternalRos.g:3970:4: (lv_value_4_0= ruleParameterValue )
            {
            // InternalRos.g:3970:4: (lv_value_4_0= ruleParameterValue )
            // InternalRos.g:3971:5: lv_value_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_4_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleDateTime"
    // InternalRos.g:3996:1: entryRuleDateTime returns [String current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final String entryRuleDateTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime = null;


        try {
            // InternalRos.g:3996:48: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalRos.g:3997:2: iv_ruleDateTime= ruleDateTime EOF
            {
             newCompositeNode(grammarAccess.getDateTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;

             current =iv_ruleDateTime.getText(); 
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
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // InternalRos.g:4003:1: ruleDateTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DateTime' ;
    public final AntlrDatatypeRuleToken ruleDateTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4009:2: (kw= 'DateTime' )
            // InternalRos.g:4010:2: kw= 'DateTime'
            {
            kw=(Token)match(input,83,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDateTimeAccess().getDateTimeKeyword());
            	

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
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalRos.g:4018:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos.g:4018:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos.g:4019:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructTypeMember=ruleParameterStructTypeMember();

            state._fsp--;

             current =iv_ruleParameterStructTypeMember; 
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
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalRos.g:4025:1: ruleParameterStructTypeMember returns [EObject current=null] : (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_default_6_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4031:2: ( (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) )
            // InternalRos.g:4032:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            {
            // InternalRos.g:4032:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            // InternalRos.g:4033:3: otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructTypeMemberAccess().getParameterStructTypeMemberKeyword_0());
            		
            // InternalRos.g:4037:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:4038:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:4038:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:4039:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,49,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeMemberAccess().getTypeKeyword_3());
            		
            // InternalRos.g:4064:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalRos.g:4065:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalRos.g:4065:4: (lv_type_4_0= ruleParameterType )
            // InternalRos.g:4066:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_45);
            lv_type_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:4083:3: (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==57) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRos.g:4084:4: otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) )
                    {
                    otherlv_5=(Token)match(input,57,FOLLOW_65); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterStructTypeMemberAccess().getDefaultKeyword_5_0());
                    			
                    // InternalRos.g:4088:4: ( (lv_default_6_0= ruleParameterStruct ) )
                    // InternalRos.g:4089:5: (lv_default_6_0= ruleParameterStruct )
                    {
                    // InternalRos.g:4089:5: (lv_default_6_0= ruleParameterStruct )
                    // InternalRos.g:4090:6: lv_default_6_0= ruleParameterStruct
                    {

                    						newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getDefaultParameterStructParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_default_6_0=ruleParameterStruct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_6_0,
                    							"de.fraunhofer.ipa.ros.xtext.Ros.ParameterStruct");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterStructTypeMemberAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRulePackageDependency"
    // InternalRos.g:4116:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos.g:4116:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos.g:4117:2: iv_rulePackageDependency= rulePackageDependency EOF
            {
             newCompositeNode(grammarAccess.getPackageDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDependency=rulePackageDependency();

            state._fsp--;

             current =iv_rulePackageDependency; 
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
    // $ANTLR end "entryRulePackageDependency"


    // $ANTLR start "rulePackageDependency"
    // InternalRos.g:4123:1: rulePackageDependency returns [EObject current=null] : (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRos.g:4129:2: ( (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRos.g:4130:2: (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRos.g:4130:2: (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRos.g:4131:3: otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDependencyAccess().getPackageDependencyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageDependencyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,86,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDependencyAccess().getPackageKeyword_2());
            		
            // InternalRos.g:4143:3: ( ( ruleEString ) )
            // InternalRos.g:4144:4: ( ruleEString )
            {
            // InternalRos.g:4144:4: ( ruleEString )
            // InternalRos.g:4145:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPackageDependencyAccess().getPackagePackageCrossReference_3_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDependencyAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePackageDependency"


    // $ANTLR start "entryRuleExternalDependency"
    // InternalRos.g:4167:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos.g:4167:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos.g:4168:2: iv_ruleExternalDependency= ruleExternalDependency EOF
            {
             newCompositeNode(grammarAccess.getExternalDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDependency=ruleExternalDependency();

            state._fsp--;

             current =iv_ruleExternalDependency; 
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
    // $ANTLR end "entryRuleExternalDependency"


    // $ANTLR start "ruleExternalDependency"
    // InternalRos.g:4174:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4180:2: ( ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos.g:4181:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos.g:4181:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos.g:4182:3: () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos.g:4182:3: ()
            // InternalRos.g:4183:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos.g:4193:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:4194:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:4194:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:4195:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalDependencyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalDependencyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.xtext.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleExternalDependency"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001480000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000E008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003F80008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003F00008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003E00008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003C00008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003800008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0034000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xF4C0000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0300000000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003FD0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});

}