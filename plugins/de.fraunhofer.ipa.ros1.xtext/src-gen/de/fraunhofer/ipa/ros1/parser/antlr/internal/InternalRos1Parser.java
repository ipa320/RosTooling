package de.fraunhofer.ipa.ros1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.ros1.services.Ros1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRos1Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExternalDependency", "Dependencies", "FromGitRepo", "Subscribers", "Parameters", "Publishers", "Artifacts", "Node_1", "Type", "Node", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ID", "RULE_ROS_CONVENTION_A", "RULE_STRING", "RULE_ROS_CONVENTION_PARAM", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=20;
    public static final int RULE_BEGIN=19;
    public static final int Node=13;
    public static final int RULE_STRING=24;
    public static final int RULE_SL_COMMENT=21;
    public static final int Comma=14;
    public static final int RULE_ROS_CONVENTION_A=23;
    public static final int Publishers=9;
    public static final int RULE_ROS_CONVENTION_PARAM=25;
    public static final int Dependencies=5;
    public static final int Colon=15;
    public static final int RightCurlyBracket=18;
    public static final int EOF=-1;
    public static final int RightSquareBracket=17;
    public static final int FromGitRepo=6;
    public static final int ExternalDependency=4;
    public static final int Parameters=8;
    public static final int RULE_ID=22;
    public static final int RULE_WS=28;
    public static final int RULE_ANY_OTHER=29;
    public static final int Artifacts=10;
    public static final int Node_1=11;
    public static final int Type=12;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=27;
    public static final int LeftSquareBracket=16;
    public static final int Subscribers=7;

    // delegates
    // delegators


        public InternalRos1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRos1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRos1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalRos1Parser.g"; }



     	private Ros1GrammarAccess grammarAccess;

        public InternalRos1Parser(TokenStream input, Ros1GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CatkinPackage";
       	}

       	@Override
       	protected Ros1GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCatkinPackage"
    // InternalRos1Parser.g:57:1: entryRuleCatkinPackage returns [EObject current=null] : iv_ruleCatkinPackage= ruleCatkinPackage EOF ;
    public final EObject entryRuleCatkinPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatkinPackage = null;


        try {
            // InternalRos1Parser.g:57:54: (iv_ruleCatkinPackage= ruleCatkinPackage EOF )
            // InternalRos1Parser.g:58:2: iv_ruleCatkinPackage= ruleCatkinPackage EOF
            {
             newCompositeNode(grammarAccess.getCatkinPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCatkinPackage=ruleCatkinPackage();

            state._fsp--;

             current =iv_ruleCatkinPackage; 
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
    // $ANTLR end "entryRuleCatkinPackage"


    // $ANTLR start "ruleCatkinPackage"
    // InternalRos1Parser.g:64:1: ruleCatkinPackage returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) ;
    public final EObject ruleCatkinPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_fromGitRepo_5_0 = null;

        EObject lv_artifact_8_0 = null;

        EObject lv_dependency_12_0 = null;

        EObject lv_dependency_14_0 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:70:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) )
            // InternalRos1Parser.g:71:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            {
            // InternalRos1Parser.g:71:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            // InternalRos1Parser.g:72:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END
            {
            // InternalRos1Parser.g:72:3: ()
            // InternalRos1Parser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCatkinPackageAccess().getCatkinPackageAction_0(),
            					current);
            			

            }

            // InternalRos1Parser.g:79:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos1Parser.g:80:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos1Parser.g:80:4: (lv_name_1_0= ruleRosNames )
            // InternalRos1Parser.g:81:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getCatkinPackageAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros1.Ros1.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCatkinPackageAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getCatkinPackageAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos1Parser.g:106:3: (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==FromGitRepo) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRos1Parser.g:107:4: otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,FromGitRepo,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCatkinPackageAccess().getFromGitRepoKeyword_4_0());
                    			
                    // InternalRos1Parser.g:111:4: ( (lv_fromGitRepo_5_0= ruleEString ) )
                    // InternalRos1Parser.g:112:5: (lv_fromGitRepo_5_0= ruleEString )
                    {
                    // InternalRos1Parser.g:112:5: (lv_fromGitRepo_5_0= ruleEString )
                    // InternalRos1Parser.g:113:6: lv_fromGitRepo_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getFromGitRepoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_fromGitRepo_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    						}
                    						set(
                    							current,
                    							"fromGitRepo",
                    							lv_fromGitRepo_5_0,
                    							"de.fraunhofer.ipa.ros1.Ros1.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos1Parser.g:131:3: (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Artifacts) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos1Parser.g:132:4: otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Artifacts,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getCatkinPackageAccess().getArtifactsKeyword_5_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getCatkinPackageAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalRos1Parser.g:140:4: ( (lv_artifact_8_0= ruleArtifact ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Node||(LA2_0>=RULE_ID && LA2_0<=RULE_ROS_CONVENTION_A)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRos1Parser.g:141:5: (lv_artifact_8_0= ruleArtifact )
                    	    {
                    	    // InternalRos1Parser.g:141:5: (lv_artifact_8_0= ruleArtifact )
                    	    // InternalRos1Parser.g:142:6: lv_artifact_8_0= ruleArtifact
                    	    {

                    	    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_artifact_8_0=ruleArtifact();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"artifact",
                    	    							lv_artifact_8_0,
                    	    							"de.fraunhofer.ipa.ros1.Ros1.Artifact");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_9); 

                    				newLeafNode(this_END_9, grammarAccess.getCatkinPackageAccess().getENDTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalRos1Parser.g:164:3: (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Dependencies) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRos1Parser.g:165:4: otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket
                    {
                    otherlv_10=(Token)match(input,Dependencies,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getCatkinPackageAccess().getDependenciesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getCatkinPackageAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalRos1Parser.g:173:4: ( (lv_dependency_12_0= ruleDependency ) )
                    // InternalRos1Parser.g:174:5: (lv_dependency_12_0= ruleDependency )
                    {
                    // InternalRos1Parser.g:174:5: (lv_dependency_12_0= ruleDependency )
                    // InternalRos1Parser.g:175:6: lv_dependency_12_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dependency_12_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    						}
                    						add(
                    							current,
                    							"dependency",
                    							lv_dependency_12_0,
                    							"de.fraunhofer.ipa.ros1.Ros1.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos1Parser.g:192:4: (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRos1Parser.g:193:5: otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCatkinPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos1Parser.g:197:5: ( (lv_dependency_14_0= ruleDependency ) )
                    	    // InternalRos1Parser.g:198:6: (lv_dependency_14_0= ruleDependency )
                    	    {
                    	    // InternalRos1Parser.g:198:6: (lv_dependency_14_0= ruleDependency )
                    	    // InternalRos1Parser.g:199:7: lv_dependency_14_0= ruleDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_dependency_14_0=ruleDependency();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dependency",
                    	    								lv_dependency_14_0,
                    	    								"de.fraunhofer.ipa.ros1.Ros1.Dependency");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightSquareBracket,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getCatkinPackageAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getCatkinPackageAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleCatkinPackage"


    // $ANTLR start "entryRuleArtifact"
    // InternalRos1Parser.g:230:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos1Parser.g:230:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos1Parser.g:231:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalRos1Parser.g:237:1: ruleArtifact returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_node_4_0 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:243:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) )
            // InternalRos1Parser.g:244:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            {
            // InternalRos1Parser.g:244:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            // InternalRos1Parser.g:245:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END
            {
            // InternalRos1Parser.g:245:3: ()
            // InternalRos1Parser.g:246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            // InternalRos1Parser.g:252:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos1Parser.g:253:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos1Parser.g:253:4: (lv_name_1_0= ruleRosNames )
            // InternalRos1Parser.g:254:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros1.Ros1.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos1Parser.g:279:3: ( (lv_node_4_0= ruleNode ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Node_1) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRos1Parser.g:280:4: (lv_node_4_0= ruleNode )
                    {
                    // InternalRos1Parser.g:280:4: (lv_node_4_0= ruleNode )
                    // InternalRos1Parser.g:281:5: lv_node_4_0= ruleNode
                    {

                    					newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_node_4_0=ruleNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArtifactRule());
                    					}
                    					set(
                    						current,
                    						"node",
                    						lv_node_4_0,
                    						"de.fraunhofer.ipa.ros1.Ros1.Node");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getArtifactAccess().getENDTerminalRuleCall_5());
            		

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


    // $ANTLR start "entryRuleNode"
    // InternalRos1Parser.g:306:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos1Parser.g:306:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos1Parser.g:307:2: iv_ruleNode= ruleNode EOF
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
    // InternalRos1Parser.g:313:1: ruleNode returns [EObject current=null] : (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )? (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )? (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleParameter ) )* this_END_14= RULE_END )? this_END_15= RULE_END ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_14=null;
        Token this_END_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_publisher_5_0 = null;

        EObject lv_subscriber_9_0 = null;

        EObject lv_parameter_13_0 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:319:2: ( (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )? (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )? (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleParameter ) )* this_END_14= RULE_END )? this_END_15= RULE_END ) )
            // InternalRos1Parser.g:320:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )? (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )? (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleParameter ) )* this_END_14= RULE_END )? this_END_15= RULE_END )
            {
            // InternalRos1Parser.g:320:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )? (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )? (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleParameter ) )* this_END_14= RULE_END )? this_END_15= RULE_END )
            // InternalRos1Parser.g:321:3: otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )? (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )? (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleParameter ) )* this_END_14= RULE_END )? this_END_15= RULE_END
            {
            otherlv_0=(Token)match(input,Node_1,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalRos1Parser.g:325:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos1Parser.g:326:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos1Parser.g:326:4: (lv_name_1_0= ruleRosNames )
            // InternalRos1Parser.g:327:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros1.Ros1.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRos1Parser.g:348:3: (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Publishers) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRos1Parser.g:349:4: otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Publishers,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getPublishersKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalRos1Parser.g:357:4: ( (lv_publisher_5_0= rulePublisher ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID||LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRos1Parser.g:358:5: (lv_publisher_5_0= rulePublisher )
                    	    {
                    	    // InternalRos1Parser.g:358:5: (lv_publisher_5_0= rulePublisher )
                    	    // InternalRos1Parser.g:359:6: lv_publisher_5_0= rulePublisher
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_publisher_5_0=rulePublisher();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"publisher",
                    	    							lv_publisher_5_0,
                    	    							"de.fraunhofer.ipa.ros1.Ros1.Publisher");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_18); 

                    				newLeafNode(this_END_6, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            // InternalRos1Parser.g:381:3: (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Subscribers) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRos1Parser.g:382:4: otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END
                    {
                    otherlv_7=(Token)match(input,Subscribers,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getSubscribersKeyword_4_0());
                    			
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_4_1());
                    			
                    // InternalRos1Parser.g:390:4: ( (lv_subscriber_9_0= ruleSubscriber ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRos1Parser.g:391:5: (lv_subscriber_9_0= ruleSubscriber )
                    	    {
                    	    // InternalRos1Parser.g:391:5: (lv_subscriber_9_0= ruleSubscriber )
                    	    // InternalRos1Parser.g:392:6: lv_subscriber_9_0= ruleSubscriber
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_subscriber_9_0=ruleSubscriber();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subscriber",
                    	    							lv_subscriber_9_0,
                    	    							"de.fraunhofer.ipa.ros1.Ros1.Subscriber");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_19); 

                    				newLeafNode(this_END_10, grammarAccess.getNodeAccess().getENDTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            // InternalRos1Parser.g:414:3: (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleParameter ) )* this_END_14= RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Parameters) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRos1Parser.g:415:4: otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleParameter ) )* this_END_14= RULE_END
                    {
                    otherlv_11=(Token)match(input,Parameters,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getParametersKeyword_5_0());
                    			
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_12, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalRos1Parser.g:423:4: ( (lv_parameter_13_0= ruleParameter ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRos1Parser.g:424:5: (lv_parameter_13_0= ruleParameter )
                    	    {
                    	    // InternalRos1Parser.g:424:5: (lv_parameter_13_0= ruleParameter )
                    	    // InternalRos1Parser.g:425:6: lv_parameter_13_0= ruleParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_parameter_13_0=ruleParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameter",
                    	    							lv_parameter_13_0,
                    	    							"de.fraunhofer.ipa.ros1.Ros1.Parameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_END_14=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_14, grammarAccess.getNodeAccess().getENDTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            this_END_15=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_15, grammarAccess.getNodeAccess().getENDTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRulePublisher"
    // InternalRos1Parser.g:455:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos1Parser.g:455:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos1Parser.g:456:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos1Parser.g:462:1: rulePublisher returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:468:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END ) )
            // InternalRos1Parser.g:469:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END )
            {
            // InternalRos1Parser.g:469:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END )
            // InternalRos1Parser.g:470:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END
            {
            // InternalRos1Parser.g:470:3: ()
            // InternalRos1Parser.g:471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublisherAccess().getPublisherAction_0(),
            					current);
            			

            }

            // InternalRos1Parser.g:477:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos1Parser.g:478:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos1Parser.g:478:4: (lv_name_1_0= ruleEString )
            // InternalRos1Parser.g:479:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros1.Ros1.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getTypeKeyword_4());
            		
            // InternalRos1Parser.g:508:3: ( ( ruleEString ) )
            // InternalRos1Parser.g:509:4: ( ruleEString )
            {
            // InternalRos1Parser.g:509:4: ( ruleEString )
            // InternalRos1Parser.g:510:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getPublisherAccess().getENDTerminalRuleCall_6());
            		

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
    // InternalRos1Parser.g:532:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos1Parser.g:532:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos1Parser.g:533:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos1Parser.g:539:1: ruleSubscriber returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:545:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END ) )
            // InternalRos1Parser.g:546:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END )
            {
            // InternalRos1Parser.g:546:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END )
            // InternalRos1Parser.g:547:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( ( ruleEString ) ) this_END_6= RULE_END
            {
            // InternalRos1Parser.g:547:3: ()
            // InternalRos1Parser.g:548:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubscriberAccess().getSubscriberAction_0(),
            					current);
            			

            }

            // InternalRos1Parser.g:554:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos1Parser.g:555:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos1Parser.g:555:4: (lv_name_1_0= ruleEString )
            // InternalRos1Parser.g:556:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros1.Ros1.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSubscriberAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getTypeKeyword_4());
            		
            // InternalRos1Parser.g:585:3: ( ( ruleEString ) )
            // InternalRos1Parser.g:586:4: ( ruleEString )
            {
            // InternalRos1Parser.g:586:4: ( ruleEString )
            // InternalRos1Parser.g:587:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getSubscriberAccess().getENDTerminalRuleCall_6());
            		

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


    // $ANTLR start "entryRuleParameter"
    // InternalRos1Parser.g:609:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos1Parser.g:609:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos1Parser.g:610:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRos1Parser.g:616:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN this_END_4= RULE_END otherlv_5= RightCurlyBracket ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:622:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN this_END_4= RULE_END otherlv_5= RightCurlyBracket ) )
            // InternalRos1Parser.g:623:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            {
            // InternalRos1Parser.g:623:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN this_END_4= RULE_END otherlv_5= RightCurlyBracket )
            // InternalRos1Parser.g:624:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN this_END_4= RULE_END otherlv_5= RightCurlyBracket
            {
            // InternalRos1Parser.g:624:3: ()
            // InternalRos1Parser.g:625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalRos1Parser.g:631:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos1Parser.g:632:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos1Parser.g:632:4: (lv_name_1_0= ruleEString )
            // InternalRos1Parser.g:633:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros1.Ros1.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3());
            		
            this_END_4=(Token)match(input,RULE_END,FOLLOW_21); 

            			newLeafNode(this_END_4, grammarAccess.getParameterAccess().getENDTerminalRuleCall_4());
            		
            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleDependency"
    // InternalRos1Parser.g:670:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos1Parser.g:670:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos1Parser.g:671:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalRos1Parser.g:677:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:683:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos1Parser.g:684:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos1Parser.g:684:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==ExternalDependency) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRos1Parser.g:685:3: this_PackageDependency_0= rulePackageDependency
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
                    // InternalRos1Parser.g:694:3: this_ExternalDependency_1= ruleExternalDependency
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


    // $ANTLR start "entryRulePackageDependency"
    // InternalRos1Parser.g:706:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos1Parser.g:706:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos1Parser.g:707:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRos1Parser.g:713:1: rulePackageDependency returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos1Parser.g:719:2: ( ( ( ruleEString ) ) )
            // InternalRos1Parser.g:720:2: ( ( ruleEString ) )
            {
            // InternalRos1Parser.g:720:2: ( ( ruleEString ) )
            // InternalRos1Parser.g:721:3: ( ruleEString )
            {
            // InternalRos1Parser.g:721:3: ( ruleEString )
            // InternalRos1Parser.g:722:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPackageDependencyRule());
            				}
            			

            				newCompositeNode(grammarAccess.getPackageDependencyAccess().getPackagePackageCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "rulePackageDependency"


    // $ANTLR start "entryRuleExternalDependency"
    // InternalRos1Parser.g:739:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos1Parser.g:739:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos1Parser.g:740:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRos1Parser.g:746:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos1Parser.g:752:2: ( ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos1Parser.g:753:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos1Parser.g:753:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos1Parser.g:754:3: () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos1Parser.g:754:3: ()
            // InternalRos1Parser.g:755:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ExternalDependency,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos1Parser.g:765:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos1Parser.g:766:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos1Parser.g:766:4: (lv_name_2_0= ruleEString )
            // InternalRos1Parser.g:767:5: lv_name_2_0= ruleEString
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
            						"de.fraunhofer.ipa.ros1.Ros1.EString");
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


    // $ANTLR start "entryRuleRosNames"
    // InternalRos1Parser.g:788:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRos1Parser.g:788:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRos1Parser.g:789:2: iv_ruleRosNames= ruleRosNames EOF
            {
             newCompositeNode(grammarAccess.getRosNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosNames=ruleRosNames();

            state._fsp--;

             current =iv_ruleRosNames.getText(); 
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
    // $ANTLR end "entryRuleRosNames"


    // $ANTLR start "ruleRosNames"
    // InternalRos1Parser.g:795:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ROS_CONVENTION_A_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRos1Parser.g:801:2: ( (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) )
            // InternalRos1Parser.g:802:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            {
            // InternalRos1Parser.g:802:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case Node:
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
                    // InternalRos1Parser.g:803:3: this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A
                    {
                    this_ROS_CONVENTION_A_0=(Token)match(input,RULE_ROS_CONVENTION_A,FOLLOW_2); 

                    			current.merge(this_ROS_CONVENTION_A_0);
                    		

                    			newLeafNode(this_ROS_CONVENTION_A_0, grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos1Parser.g:811:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos1Parser.g:819:3: kw= Node
                    {
                    kw=(Token)match(input,Node,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRosNamesAccess().getNodeKeyword_2());
                    		

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
    // $ANTLR end "ruleRosNames"


    // $ANTLR start "entryRuleEString"
    // InternalRos1Parser.g:828:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos1Parser.g:828:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos1Parser.g:829:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos1Parser.g:835:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRos1Parser.g:841:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos1Parser.g:842:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos1Parser.g:842:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos1Parser.g:843:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos1Parser.g:851:3: this_ID_1= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100460L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100420L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000D02000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100380L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100180L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});

}