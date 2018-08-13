package de.fraunhofer.ipa.ros.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.ros.services.RosArtifactGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosArtifactParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Artifact'", "'{'", "'node'", "'}'", "'Node'", "'name'", "'serviceserver'", "','", "'publisher'", "'subscriber'", "'serviceclient'", "'actionserver'", "'actionclient'", "'parameter'", "'ServiceServer'", "'service'", "'namespace'", "'Publisher'", "'message'", "'Subscriber'", "'ServiceClient'", "'ActionServer'", "'action'", "'ActionClient'", "'GraphName'", "'Parameter'", "'type'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'ParameterListType'", "'sequence'", "'default'", "'ParameterStructType'", "'parameterstructypetmember'", "'ParameterIntegerType'", "'ParameterStringType'", "'ParameterDoubleType'", "'ParameterDateType'", "'ParameterBooleanType'", "'ParameterBase64Type'", "'ParameterAnyType'", "'ParameterArrayType'", "'ParameterSequence'", "'value'", "'ParameterAny'", "'ParameterString'", "'ParameterBase64'", "'ParameterInteger'", "'ParameterDouble'", "'ParameterBoolean'", "'ParameterStruct'", "'ParameterDate'", "'Base64Binary'", "'Int'", "'Double'", "'Boolean'", "'ParameterStructMember'", "'DateTime'", "'ParameterStructTypeMember'"
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRosArtifactParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosArtifactParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosArtifactParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosArtifact.g"; }



     	private RosArtifactGrammarAccess grammarAccess;

        public InternalRosArtifactParser(TokenStream input, RosArtifactGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Artifact";
       	}

       	@Override
       	protected RosArtifactGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleArtifact"
    // InternalRosArtifact.g:64:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRosArtifact.g:64:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRosArtifact.g:65:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalRosArtifact.g:71:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_node_5_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:77:2: ( ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' ) )
            // InternalRosArtifact.g:78:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' )
            {
            // InternalRosArtifact.g:78:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' )
            // InternalRosArtifact.g:79:3: () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}'
            {
            // InternalRosArtifact.g:79:3: ()
            // InternalRosArtifact.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalRosArtifact.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosArtifact.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosArtifact.g:91:4: (lv_name_2_0= ruleEString )
            // InternalRosArtifact.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRosArtifact.g:113:3: (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosArtifact.g:114:4: otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getNodeKeyword_4_0());
                    			
                    // InternalRosArtifact.g:118:4: ( (lv_node_5_0= ruleNode ) )
                    // InternalRosArtifact.g:119:5: (lv_node_5_0= ruleNode )
                    {
                    // InternalRosArtifact.g:119:5: (lv_node_5_0= ruleNode )
                    // InternalRosArtifact.g:120:6: lv_node_5_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_node_5_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    						}
                    						set(
                    							current,
                    							"node",
                    							lv_node_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleNamespace"
    // InternalRosArtifact.g:146:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRosArtifact.g:146:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRosArtifact.g:147:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRosArtifact.g:153:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:159:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRosArtifact.g:160:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRosArtifact.g:160:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt2=1;
                }
                break;
            case 40:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRosArtifact.g:161:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRosArtifact.g:170:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRosArtifact.g:179:3: this_PrivateNamespace_2= rulePrivateNamespace
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
    // InternalRosArtifact.g:191:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRosArtifact.g:191:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRosArtifact.g:192:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRosArtifact.g:198:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterListType_0 = null;

        EObject this_ParameterStructType_1 = null;

        EObject this_ParameterIntegerType_2 = null;

        EObject this_ParameterStringType_3 = null;

        EObject this_ParameterDoubleType_4 = null;

        EObject this_ParameterDateType_5 = null;

        EObject this_ParameterBooleanType_6 = null;

        EObject this_ParameterBase64Type_7 = null;

        EObject this_ParameterAnyType_8 = null;

        EObject this_ParameterArrayType_9 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:204:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType ) )
            // InternalRosArtifact.g:205:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType )
            {
            // InternalRosArtifact.g:205:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType )
            int alt3=10;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt3=1;
                }
                break;
            case 45:
                {
                alt3=2;
                }
                break;
            case 47:
                {
                alt3=3;
                }
                break;
            case 48:
                {
                alt3=4;
                }
                break;
            case 49:
                {
                alt3=5;
                }
                break;
            case 50:
                {
                alt3=6;
                }
                break;
            case 51:
                {
                alt3=7;
                }
                break;
            case 52:
                {
                alt3=8;
                }
                break;
            case 53:
                {
                alt3=9;
                }
                break;
            case 54:
                {
                alt3=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRosArtifact.g:206:3: this_ParameterListType_0= ruleParameterListType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_0=ruleParameterListType();

                    state._fsp--;


                    			current = this_ParameterListType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosArtifact.g:215:3: this_ParameterStructType_1= ruleParameterStructType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_1=ruleParameterStructType();

                    state._fsp--;


                    			current = this_ParameterStructType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosArtifact.g:224:3: this_ParameterIntegerType_2= ruleParameterIntegerType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_2=ruleParameterIntegerType();

                    state._fsp--;


                    			current = this_ParameterIntegerType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosArtifact.g:233:3: this_ParameterStringType_3= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_3=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosArtifact.g:242:3: this_ParameterDoubleType_4= ruleParameterDoubleType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_4=ruleParameterDoubleType();

                    state._fsp--;


                    			current = this_ParameterDoubleType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosArtifact.g:251:3: this_ParameterDateType_5= ruleParameterDateType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDateTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDateType_5=ruleParameterDateType();

                    state._fsp--;


                    			current = this_ParameterDateType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosArtifact.g:260:3: this_ParameterBooleanType_6= ruleParameterBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_6=ruleParameterBooleanType();

                    state._fsp--;


                    			current = this_ParameterBooleanType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRosArtifact.g:269:3: this_ParameterBase64Type_7= ruleParameterBase64Type
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_7=ruleParameterBase64Type();

                    state._fsp--;


                    			current = this_ParameterBase64Type_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRosArtifact.g:278:3: this_ParameterAnyType_8= ruleParameterAnyType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterAnyTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterAnyType_8=ruleParameterAnyType();

                    state._fsp--;


                    			current = this_ParameterAnyType_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRosArtifact.g:287:3: this_ParameterArrayType_9= ruleParameterArrayType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_9=ruleParameterArrayType();

                    state._fsp--;


                    			current = this_ParameterArrayType_9;
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
    // InternalRosArtifact.g:299:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRosArtifact.g:299:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRosArtifact.g:300:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRosArtifact.g:306:1: ruleParameterValue returns [EObject current=null] : (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate ) ;
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
            // InternalRosArtifact.g:312:2: ( (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate ) )
            // InternalRosArtifact.g:313:2: (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate )
            {
            // InternalRosArtifact.g:313:2: (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt4=1;
                }
                break;
            case 58:
                {
                alt4=2;
                }
                break;
            case 59:
                {
                alt4=3;
                }
                break;
            case 60:
                {
                alt4=4;
                }
                break;
            case 61:
                {
                alt4=5;
                }
                break;
            case 62:
                {
                alt4=6;
                }
                break;
            case 55:
                {
                alt4=7;
                }
                break;
            case 63:
                {
                alt4=8;
                }
                break;
            case 64:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRosArtifact.g:314:3: this_ParameterAny_0= ruleParameterAny
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
                    // InternalRosArtifact.g:323:3: this_ParameterString_1= ruleParameterString
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
                    // InternalRosArtifact.g:332:3: this_ParameterBase64_2= ruleParameterBase64
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
                    // InternalRosArtifact.g:341:3: this_ParameterInteger_3= ruleParameterInteger
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
                    // InternalRosArtifact.g:350:3: this_ParameterDouble_4= ruleParameterDouble
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
                    // InternalRosArtifact.g:359:3: this_ParameterBoolean_5= ruleParameterBoolean
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
                    // InternalRosArtifact.g:368:3: this_ParameterSequence_6= ruleParameterSequence
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
                    // InternalRosArtifact.g:377:3: this_ParameterStruct_7= ruleParameterStruct
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
                    // InternalRosArtifact.g:386:3: this_ParameterDate_8= ruleParameterDate
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
    // InternalRosArtifact.g:398:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosArtifact.g:398:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosArtifact.g:399:2: iv_ruleEString= ruleEString EOF
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
    // InternalRosArtifact.g:405:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosArtifact.g:411:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosArtifact.g:412:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosArtifact.g:412:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosArtifact.g:413:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosArtifact.g:421:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleNode"
    // InternalRosArtifact.g:432:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRosArtifact.g:432:45: (iv_ruleNode= ruleNode EOF )
            // InternalRosArtifact.g:433:2: iv_ruleNode= ruleNode EOF
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
    // InternalRosArtifact.g:439:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalRosArtifact.g:445:2: ( (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalRosArtifact.g:446:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalRosArtifact.g:446:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalRosArtifact.g:447:3: otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getNameKeyword_2());
            		
            // InternalRosArtifact.g:459:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRosArtifact.g:460:4: (lv_name_3_0= ruleEString )
            {
            // InternalRosArtifact.g:460:4: (lv_name_3_0= ruleEString )
            // InternalRosArtifact.g:461:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:478:3: (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRosArtifact.g:479:4: otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getServiceserverKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRosArtifact.g:487:4: ( (lv_serviceserver_6_0= ruleServiceServer ) )
                    // InternalRosArtifact.g:488:5: (lv_serviceserver_6_0= ruleServiceServer )
                    {
                    // InternalRosArtifact.g:488:5: (lv_serviceserver_6_0= ruleServiceServer )
                    // InternalRosArtifact.g:489:6: lv_serviceserver_6_0= ruleServiceServer
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_serviceserver_6_0=ruleServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"serviceserver",
                    							lv_serviceserver_6_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:506:4: (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRosArtifact.g:507:5: otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRosArtifact.g:511:5: ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    // InternalRosArtifact.g:512:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    {
                    	    // InternalRosArtifact.g:512:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    // InternalRosArtifact.g:513:7: lv_serviceserver_8_0= ruleServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_serviceserver_8_0=ruleServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceserver",
                    	    								lv_serviceserver_8_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ServiceServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRosArtifact.g:536:3: (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosArtifact.g:537:4: otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getPublisherKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRosArtifact.g:545:4: ( (lv_publisher_12_0= rulePublisher ) )
                    // InternalRosArtifact.g:546:5: (lv_publisher_12_0= rulePublisher )
                    {
                    // InternalRosArtifact.g:546:5: (lv_publisher_12_0= rulePublisher )
                    // InternalRosArtifact.g:547:6: lv_publisher_12_0= rulePublisher
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_publisher_12_0=rulePublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"publisher",
                    							lv_publisher_12_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Publisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:564:4: (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRosArtifact.g:565:5: otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) )
                    	    {
                    	    otherlv_13=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRosArtifact.g:569:5: ( (lv_publisher_14_0= rulePublisher ) )
                    	    // InternalRosArtifact.g:570:6: (lv_publisher_14_0= rulePublisher )
                    	    {
                    	    // InternalRosArtifact.g:570:6: (lv_publisher_14_0= rulePublisher )
                    	    // InternalRosArtifact.g:571:7: lv_publisher_14_0= rulePublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_publisher_14_0=rulePublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"publisher",
                    	    								lv_publisher_14_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.Publisher");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRosArtifact.g:594:3: (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRosArtifact.g:595:4: otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getSubscriberKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRosArtifact.g:603:4: ( (lv_subscriber_18_0= ruleSubscriber ) )
                    // InternalRosArtifact.g:604:5: (lv_subscriber_18_0= ruleSubscriber )
                    {
                    // InternalRosArtifact.g:604:5: (lv_subscriber_18_0= ruleSubscriber )
                    // InternalRosArtifact.g:605:6: lv_subscriber_18_0= ruleSubscriber
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_subscriber_18_0=ruleSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"subscriber",
                    							lv_subscriber_18_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Subscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:622:4: (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==18) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRosArtifact.g:623:5: otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    {
                    	    otherlv_19=(Token)match(input,18,FOLLOW_15); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRosArtifact.g:627:5: ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    // InternalRosArtifact.g:628:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    {
                    	    // InternalRosArtifact.g:628:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    // InternalRosArtifact.g:629:7: lv_subscriber_20_0= ruleSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_subscriber_20_0=ruleSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subscriber",
                    	    								lv_subscriber_20_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.Subscriber");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRosArtifact.g:652:3: (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosArtifact.g:653:4: otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getServiceclientKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRosArtifact.g:661:4: ( (lv_serviceclient_24_0= ruleServiceClient ) )
                    // InternalRosArtifact.g:662:5: (lv_serviceclient_24_0= ruleServiceClient )
                    {
                    // InternalRosArtifact.g:662:5: (lv_serviceclient_24_0= ruleServiceClient )
                    // InternalRosArtifact.g:663:6: lv_serviceclient_24_0= ruleServiceClient
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_serviceclient_24_0=ruleServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"serviceclient",
                    							lv_serviceclient_24_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:680:4: (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRosArtifact.g:681:5: otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FOLLOW_17); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRosArtifact.g:685:5: ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    // InternalRosArtifact.g:686:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    {
                    	    // InternalRosArtifact.g:686:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    // InternalRosArtifact.g:687:7: lv_serviceclient_26_0= ruleServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_serviceclient_26_0=ruleServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceclient",
                    	    								lv_serviceclient_26_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ServiceClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRosArtifact.g:710:3: (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosArtifact.g:711:4: otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getActionserverKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_29, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRosArtifact.g:719:4: ( (lv_actionserver_30_0= ruleActionServer ) )
                    // InternalRosArtifact.g:720:5: (lv_actionserver_30_0= ruleActionServer )
                    {
                    // InternalRosArtifact.g:720:5: (lv_actionserver_30_0= ruleActionServer )
                    // InternalRosArtifact.g:721:6: lv_actionserver_30_0= ruleActionServer
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_actionserver_30_0=ruleActionServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"actionserver",
                    							lv_actionserver_30_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ActionServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:738:4: (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRosArtifact.g:739:5: otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    {
                    	    otherlv_31=(Token)match(input,18,FOLLOW_19); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRosArtifact.g:743:5: ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    // InternalRosArtifact.g:744:6: (lv_actionserver_32_0= ruleActionServer )
                    	    {
                    	    // InternalRosArtifact.g:744:6: (lv_actionserver_32_0= ruleActionServer )
                    	    // InternalRosArtifact.g:745:7: lv_actionserver_32_0= ruleActionServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_actionserver_32_0=ruleActionServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionserver",
                    	    								lv_actionserver_32_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ActionServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,14,FOLLOW_20); 

                    				newLeafNode(otherlv_33, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRosArtifact.g:768:3: (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosArtifact.g:769:4: otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getNodeAccess().getActionclientKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_21); 

                    				newLeafNode(otherlv_35, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRosArtifact.g:777:4: ( (lv_actionclient_36_0= ruleActionClient ) )
                    // InternalRosArtifact.g:778:5: (lv_actionclient_36_0= ruleActionClient )
                    {
                    // InternalRosArtifact.g:778:5: (lv_actionclient_36_0= ruleActionClient )
                    // InternalRosArtifact.g:779:6: lv_actionclient_36_0= ruleActionClient
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_actionclient_36_0=ruleActionClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"actionclient",
                    							lv_actionclient_36_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ActionClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:796:4: (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRosArtifact.g:797:5: otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    {
                    	    otherlv_37=(Token)match(input,18,FOLLOW_21); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getNodeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRosArtifact.g:801:5: ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    // InternalRosArtifact.g:802:6: (lv_actionclient_38_0= ruleActionClient )
                    	    {
                    	    // InternalRosArtifact.g:802:6: (lv_actionclient_38_0= ruleActionClient )
                    	    // InternalRosArtifact.g:803:7: lv_actionclient_38_0= ruleActionClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_actionclient_38_0=ruleActionClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionclient",
                    	    								lv_actionclient_38_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ActionClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,14,FOLLOW_22); 

                    				newLeafNode(otherlv_39, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRosArtifact.g:826:3: (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosArtifact.g:827:4: otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getNodeAccess().getParameterKeyword_10_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_41, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRosArtifact.g:835:4: ( (lv_parameter_42_0= ruleParameter ) )
                    // InternalRosArtifact.g:836:5: (lv_parameter_42_0= ruleParameter )
                    {
                    // InternalRosArtifact.g:836:5: (lv_parameter_42_0= ruleParameter )
                    // InternalRosArtifact.g:837:6: lv_parameter_42_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameter_42_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_42_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:854:4: (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRosArtifact.g:855:5: otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) )
                    	    {
                    	    otherlv_43=(Token)match(input,18,FOLLOW_23); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getNodeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRosArtifact.g:859:5: ( (lv_parameter_44_0= ruleParameter ) )
                    	    // InternalRosArtifact.g:860:6: (lv_parameter_44_0= ruleParameter )
                    	    {
                    	    // InternalRosArtifact.g:860:6: (lv_parameter_44_0= ruleParameter )
                    	    // InternalRosArtifact.g:861:7: lv_parameter_44_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parameter_44_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_44_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_45, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:892:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRosArtifact.g:892:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRosArtifact.g:893:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRosArtifact.g:899:1: ruleServiceServer returns [EObject current=null] : (otherlv_0= 'ServiceServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRosArtifact.g:905:2: ( (otherlv_0= 'ServiceServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRosArtifact.g:906:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRosArtifact.g:906:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRosArtifact.g:907:3: otherlv_0= 'ServiceServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceServerAccess().getServiceServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosArtifact.g:915:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosArtifact.g:916:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getNameKeyword_2_0());
                    			
                    // InternalRosArtifact.g:920:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosArtifact.g:921:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosArtifact.g:921:5: (lv_name_3_0= ruleEString )
                    // InternalRosArtifact.g:922:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getServiceKeyword_3());
            		
            // InternalRosArtifact.g:944:3: ( ( ruleEString ) )
            // InternalRosArtifact.g:945:4: ( ruleEString )
            {
            // InternalRosArtifact.g:945:4: ( ruleEString )
            // InternalRosArtifact.g:946:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:960:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosArtifact.g:961:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNamespaceKeyword_5_0());
                    			
                    // InternalRosArtifact.g:965:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosArtifact.g:966:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosArtifact.g:966:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosArtifact.g:967:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosArtifact.g:993:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRosArtifact.g:993:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRosArtifact.g:994:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRosArtifact.g:1000:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRosArtifact.g:1006:2: ( (otherlv_0= 'Publisher' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRosArtifact.g:1007:2: (otherlv_0= 'Publisher' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRosArtifact.g:1007:2: (otherlv_0= 'Publisher' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRosArtifact.g:1008:3: otherlv_0= 'Publisher' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosArtifact.g:1016:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosArtifact.g:1017:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getNameKeyword_2_0());
                    			
                    // InternalRosArtifact.g:1021:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosArtifact.g:1022:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosArtifact.g:1022:5: (lv_name_3_0= ruleEString )
                    // InternalRosArtifact.g:1023:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getMessageKeyword_3());
            		
            // InternalRosArtifact.g:1045:3: ( ( ruleEString ) )
            // InternalRosArtifact.g:1046:4: ( ruleEString )
            {
            // InternalRosArtifact.g:1046:4: ( ruleEString )
            // InternalRosArtifact.g:1047:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:1061:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosArtifact.g:1062:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNamespaceKeyword_5_0());
                    			
                    // InternalRosArtifact.g:1066:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosArtifact.g:1067:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosArtifact.g:1067:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosArtifact.g:1068:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosArtifact.g:1094:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRosArtifact.g:1094:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRosArtifact.g:1095:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRosArtifact.g:1101:1: ruleSubscriber returns [EObject current=null] : (otherlv_0= 'Subscriber' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRosArtifact.g:1107:2: ( (otherlv_0= 'Subscriber' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRosArtifact.g:1108:2: (otherlv_0= 'Subscriber' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRosArtifact.g:1108:2: (otherlv_0= 'Subscriber' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRosArtifact.g:1109:3: otherlv_0= 'Subscriber' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberAccess().getSubscriberKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosArtifact.g:1117:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosArtifact.g:1118:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getNameKeyword_2_0());
                    			
                    // InternalRosArtifact.g:1122:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosArtifact.g:1123:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosArtifact.g:1123:5: (lv_name_3_0= ruleEString )
                    // InternalRosArtifact.g:1124:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getMessageKeyword_3());
            		
            // InternalRosArtifact.g:1146:3: ( ( ruleEString ) )
            // InternalRosArtifact.g:1147:4: ( ruleEString )
            {
            // InternalRosArtifact.g:1147:4: ( ruleEString )
            // InternalRosArtifact.g:1148:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:1162:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosArtifact.g:1163:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNamespaceKeyword_5_0());
                    			
                    // InternalRosArtifact.g:1167:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosArtifact.g:1168:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosArtifact.g:1168:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosArtifact.g:1169:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosArtifact.g:1195:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRosArtifact.g:1195:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRosArtifact.g:1196:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRosArtifact.g:1202:1: ruleServiceClient returns [EObject current=null] : (otherlv_0= 'ServiceClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRosArtifact.g:1208:2: ( (otherlv_0= 'ServiceClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRosArtifact.g:1209:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRosArtifact.g:1209:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRosArtifact.g:1210:3: otherlv_0= 'ServiceClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceClientAccess().getServiceClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosArtifact.g:1218:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosArtifact.g:1219:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getNameKeyword_2_0());
                    			
                    // InternalRosArtifact.g:1223:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosArtifact.g:1224:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosArtifact.g:1224:5: (lv_name_3_0= ruleEString )
                    // InternalRosArtifact.g:1225:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getServiceKeyword_3());
            		
            // InternalRosArtifact.g:1247:3: ( ( ruleEString ) )
            // InternalRosArtifact.g:1248:4: ( ruleEString )
            {
            // InternalRosArtifact.g:1248:4: ( ruleEString )
            // InternalRosArtifact.g:1249:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:1263:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosArtifact.g:1264:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNamespaceKeyword_5_0());
                    			
                    // InternalRosArtifact.g:1268:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosArtifact.g:1269:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosArtifact.g:1269:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosArtifact.g:1270:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosArtifact.g:1296:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRosArtifact.g:1296:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRosArtifact.g:1297:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRosArtifact.g:1303:1: ruleActionServer returns [EObject current=null] : (otherlv_0= 'ActionServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRosArtifact.g:1309:2: ( (otherlv_0= 'ActionServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRosArtifact.g:1310:2: (otherlv_0= 'ActionServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRosArtifact.g:1310:2: (otherlv_0= 'ActionServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRosArtifact.g:1311:3: otherlv_0= 'ActionServer' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionServerAccess().getActionServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getActionServerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosArtifact.g:1319:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==16) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosArtifact.g:1320:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getNameKeyword_2_0());
                    			
                    // InternalRosArtifact.g:1324:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosArtifact.g:1325:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosArtifact.g:1325:5: (lv_name_3_0= ruleEString )
                    // InternalRosArtifact.g:1326:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionServerRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getActionKeyword_3());
            		
            // InternalRosArtifact.g:1348:3: ( ( ruleEString ) )
            // InternalRosArtifact.g:1349:4: ( ruleEString )
            {
            // InternalRosArtifact.g:1349:4: ( ruleEString )
            // InternalRosArtifact.g:1350:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:1364:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosArtifact.g:1365:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNamespaceKeyword_5_0());
                    			
                    // InternalRosArtifact.g:1369:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosArtifact.g:1370:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosArtifact.g:1370:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosArtifact.g:1371:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionServerRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActionServerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosArtifact.g:1397:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRosArtifact.g:1397:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRosArtifact.g:1398:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRosArtifact.g:1404:1: ruleActionClient returns [EObject current=null] : (otherlv_0= 'ActionClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRosArtifact.g:1410:2: ( (otherlv_0= 'ActionClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRosArtifact.g:1411:2: (otherlv_0= 'ActionClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRosArtifact.g:1411:2: (otherlv_0= 'ActionClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRosArtifact.g:1412:3: otherlv_0= 'ActionClient' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionClientAccess().getActionClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosArtifact.g:1420:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosArtifact.g:1421:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getNameKeyword_2_0());
                    			
                    // InternalRosArtifact.g:1425:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosArtifact.g:1426:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosArtifact.g:1426:5: (lv_name_3_0= ruleEString )
                    // InternalRosArtifact.g:1427:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionClientRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getActionKeyword_3());
            		
            // InternalRosArtifact.g:1449:3: ( ( ruleEString ) )
            // InternalRosArtifact.g:1450:4: ( ruleEString )
            {
            // InternalRosArtifact.g:1450:4: ( ruleEString )
            // InternalRosArtifact.g:1451:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:1465:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosArtifact.g:1466:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNamespaceKeyword_5_0());
                    			
                    // InternalRosArtifact.g:1470:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosArtifact.g:1471:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosArtifact.g:1471:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosArtifact.g:1472:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionClientRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActionClientAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosArtifact.g:1498:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRosArtifact.g:1498:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRosArtifact.g:1499:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRosArtifact.g:1505:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosArtifact.g:1511:2: (kw= 'GraphName' )
            // InternalRosArtifact.g:1512:2: kw= 'GraphName'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalRosArtifact.g:1520:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRosArtifact.g:1520:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRosArtifact.g:1521:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRosArtifact.g:1527:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) ;
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
            // InternalRosArtifact.g:1533:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) )
            // InternalRosArtifact.g:1534:2: (otherlv_0= 'Parameter' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            {
            // InternalRosArtifact.g:1534:2: (otherlv_0= 'Parameter' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            // InternalRosArtifact.g:1535:3: otherlv_0= 'Parameter' otherlv_1= '{' (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRosArtifact.g:1543:3: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRosArtifact.g:1544:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2_0());
                    			
                    // InternalRosArtifact.g:1548:4: ( (lv_name_3_0= ruleEString ) )
                    // InternalRosArtifact.g:1549:5: (lv_name_3_0= ruleEString )
                    {
                    // InternalRosArtifact.g:1549:5: (lv_name_3_0= ruleEString )
                    // InternalRosArtifact.g:1550:6: lv_name_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRosArtifact.g:1568:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosArtifact.g:1569:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNamespaceKeyword_3_0());
                    			
                    // InternalRosArtifact.g:1573:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRosArtifact.g:1574:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRosArtifact.g:1574:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRosArtifact.g:1575:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_4());
            		
            // InternalRosArtifact.g:1597:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalRosArtifact.g:1598:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalRosArtifact.g:1598:4: (lv_type_7_0= ruleParameterType )
            // InternalRosArtifact.g:1599:5: lv_type_7_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_7_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRosArtifact.g:1624:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRosArtifact.g:1624:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRosArtifact.g:1625:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRosArtifact.g:1631:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRosArtifact.g:1637:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosArtifact.g:1638:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosArtifact.g:1638:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosArtifact.g:1639:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosArtifact.g:1639:3: ()
            // InternalRosArtifact.g:1640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:1654:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosArtifact.g:1655:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosArtifact.g:1663:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosArtifact.g:1664:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosArtifact.g:1664:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosArtifact.g:1665:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:1682:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==18) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRosArtifact.g:1683:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_37); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosArtifact.g:1687:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosArtifact.g:1688:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosArtifact.g:1688:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosArtifact.g:1689:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:1720:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRosArtifact.g:1720:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRosArtifact.g:1721:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRosArtifact.g:1727:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRosArtifact.g:1733:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosArtifact.g:1734:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosArtifact.g:1734:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosArtifact.g:1735:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosArtifact.g:1735:3: ()
            // InternalRosArtifact.g:1736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:1750:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRosArtifact.g:1751:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosArtifact.g:1759:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosArtifact.g:1760:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosArtifact.g:1760:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosArtifact.g:1761:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:1778:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRosArtifact.g:1779:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_37); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosArtifact.g:1783:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosArtifact.g:1784:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosArtifact.g:1784:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosArtifact.g:1785:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:1816:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRosArtifact.g:1816:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRosArtifact.g:1817:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRosArtifact.g:1823:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRosArtifact.g:1829:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosArtifact.g:1830:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosArtifact.g:1830:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosArtifact.g:1831:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosArtifact.g:1831:3: ()
            // InternalRosArtifact.g:1832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:1846:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==39) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosArtifact.g:1847:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosArtifact.g:1855:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRosArtifact.g:1856:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRosArtifact.g:1856:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRosArtifact.g:1857:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parts_5_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:1874:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==18) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRosArtifact.g:1875:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_37); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosArtifact.g:1879:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRosArtifact.g:1880:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRosArtifact.g:1880:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRosArtifact.g:1881:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameterListType"
    // InternalRosArtifact.g:1912:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRosArtifact.g:1912:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRosArtifact.g:1913:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRosArtifact.g:1919:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) ;
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
            // InternalRosArtifact.g:1925:2: ( ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) )
            // InternalRosArtifact.g:1926:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            {
            // InternalRosArtifact.g:1926:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            // InternalRosArtifact.g:1927:3: () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}'
            {
            // InternalRosArtifact.g:1927:3: ()
            // InternalRosArtifact.g:1928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getParameterListTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:1942:3: (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRosArtifact.g:1943:4: otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterListTypeAccess().getSequenceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosArtifact.g:1951:4: ( (lv_sequence_5_0= ruleParameterType ) )
                    // InternalRosArtifact.g:1952:5: (lv_sequence_5_0= ruleParameterType )
                    {
                    // InternalRosArtifact.g:1952:5: (lv_sequence_5_0= ruleParameterType )
                    // InternalRosArtifact.g:1953:6: lv_sequence_5_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_sequence_5_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    						}
                    						add(
                    							current,
                    							"sequence",
                    							lv_sequence_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:1970:4: (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==18) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRosArtifact.g:1971:5: otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_35); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosArtifact.g:1975:5: ( (lv_sequence_7_0= ruleParameterType ) )
                    	    // InternalRosArtifact.g:1976:6: (lv_sequence_7_0= ruleParameterType )
                    	    {
                    	    // InternalRosArtifact.g:1976:6: (lv_sequence_7_0= ruleParameterType )
                    	    // InternalRosArtifact.g:1977:7: lv_sequence_7_0= ruleParameterType
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_sequence_7_0=ruleParameterType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sequence",
                    	    								lv_sequence_7_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ParameterType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_39); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRosArtifact.g:2000:3: (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRosArtifact.g:2001:4: otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) )
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_40); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterListTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRosArtifact.g:2005:4: ( (lv_default_10_0= ruleParameterSequence ) )
                    // InternalRosArtifact.g:2006:5: (lv_default_10_0= ruleParameterSequence )
                    {
                    // InternalRosArtifact.g:2006:5: (lv_default_10_0= ruleParameterSequence )
                    // InternalRosArtifact.g:2007:6: lv_default_10_0= ruleParameterSequence
                    {

                    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getDefaultParameterSequenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_10_0=ruleParameterSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_10_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2033:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRosArtifact.g:2033:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRosArtifact.g:2034:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRosArtifact.g:2040:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRosArtifact.g:2046:2: ( ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosArtifact.g:2047:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosArtifact.g:2047:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosArtifact.g:2048:3: () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosArtifact.g:2048:3: ()
            // InternalRosArtifact.g:2049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getParameterStructTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2063:3: (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRosArtifact.g:2064:4: otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosArtifact.g:2072:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
                    // InternalRosArtifact.g:2073:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    {
                    // InternalRosArtifact.g:2073:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    // InternalRosArtifact.g:2074:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
                    						}
                    						add(
                    							current,
                    							"parameterstructypetmember",
                    							lv_parameterstructypetmember_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterStructTypeMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:2091:4: (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==18) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalRosArtifact.g:2092:5: otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_42); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosArtifact.g:2096:5: ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    // InternalRosArtifact.g:2097:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    {
                    	    // InternalRosArtifact.g:2097:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    // InternalRosArtifact.g:2098:7: lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parameterstructypetmember_7_0=ruleParameterStructTypeMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameterstructypetmember",
                    	    								lv_parameterstructypetmember_7_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ParameterStructTypeMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2129:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRosArtifact.g:2129:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRosArtifact.g:2130:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRosArtifact.g:2136:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2142:2: ( ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2143:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2143:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2144:3: () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2144:3: ()
            // InternalRosArtifact.g:2145:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2159:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRosArtifact.g:2160:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2164:4: ( (lv_default_4_0= ruleParameterInteger ) )
                    // InternalRosArtifact.g:2165:5: (lv_default_4_0= ruleParameterInteger )
                    {
                    // InternalRosArtifact.g:2165:5: (lv_default_4_0= ruleParameterInteger )
                    // InternalRosArtifact.g:2166:6: lv_default_4_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2192:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRosArtifact.g:2192:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRosArtifact.g:2193:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRosArtifact.g:2199:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2205:2: ( ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2206:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2206:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2207:3: () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2207:3: ()
            // InternalRosArtifact.g:2208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getParameterStringTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2222:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRosArtifact.g:2223:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2227:4: ( (lv_default_4_0= ruleParameterString ) )
                    // InternalRosArtifact.g:2228:5: (lv_default_4_0= ruleParameterString )
                    {
                    // InternalRosArtifact.g:2228:5: (lv_default_4_0= ruleParameterString )
                    // InternalRosArtifact.g:2229:6: lv_default_4_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2255:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRosArtifact.g:2255:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRosArtifact.g:2256:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRosArtifact.g:2262:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2268:2: ( ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2269:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2269:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2270:3: () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2270:3: ()
            // InternalRosArtifact.g:2271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2285:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRosArtifact.g:2286:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_45); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2290:4: ( (lv_default_4_0= ruleParameterDouble ) )
                    // InternalRosArtifact.g:2291:5: (lv_default_4_0= ruleParameterDouble )
                    {
                    // InternalRosArtifact.g:2291:5: (lv_default_4_0= ruleParameterDouble )
                    // InternalRosArtifact.g:2292:6: lv_default_4_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2318:1: entryRuleParameterDateType returns [EObject current=null] : iv_ruleParameterDateType= ruleParameterDateType EOF ;
    public final EObject entryRuleParameterDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDateType = null;


        try {
            // InternalRosArtifact.g:2318:58: (iv_ruleParameterDateType= ruleParameterDateType EOF )
            // InternalRosArtifact.g:2319:2: iv_ruleParameterDateType= ruleParameterDateType EOF
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
    // InternalRosArtifact.g:2325:1: ruleParameterDateType returns [EObject current=null] : ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2331:2: ( ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2332:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2332:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2333:3: () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2333:3: ()
            // InternalRosArtifact.g:2334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDateTypeAccess().getParameterDateTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateTypeAccess().getParameterDateTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2348:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRosArtifact.g:2349:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDateTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2353:4: ( (lv_default_4_0= ruleParameterDate ) )
                    // InternalRosArtifact.g:2354:5: (lv_default_4_0= ruleParameterDate )
                    {
                    // InternalRosArtifact.g:2354:5: (lv_default_4_0= ruleParameterDate )
                    // InternalRosArtifact.g:2355:6: lv_default_4_0= ruleParameterDate
                    {

                    						newCompositeNode(grammarAccess.getParameterDateTypeAccess().getDefaultParameterDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDateTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2381:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRosArtifact.g:2381:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRosArtifact.g:2382:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRosArtifact.g:2388:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2394:2: ( ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2395:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2395:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2396:3: () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2396:3: ()
            // InternalRosArtifact.g:2397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2411:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==44) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRosArtifact.g:2412:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2416:4: ( (lv_default_4_0= ruleParameterBoolean ) )
                    // InternalRosArtifact.g:2417:5: (lv_default_4_0= ruleParameterBoolean )
                    {
                    // InternalRosArtifact.g:2417:5: (lv_default_4_0= ruleParameterBoolean )
                    // InternalRosArtifact.g:2418:6: lv_default_4_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2444:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRosArtifact.g:2444:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRosArtifact.g:2445:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRosArtifact.g:2451:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2457:2: ( ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2458:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2458:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2459:3: () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2459:3: ()
            // InternalRosArtifact.g:2460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2474:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRosArtifact.g:2475:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_48); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2479:4: ( (lv_default_4_0= ruleParameterBase64 ) )
                    // InternalRosArtifact.g:2480:5: (lv_default_4_0= ruleParameterBase64 )
                    {
                    // InternalRosArtifact.g:2480:5: (lv_default_4_0= ruleParameterBase64 )
                    // InternalRosArtifact.g:2481:6: lv_default_4_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterBase64();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterBase64");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2507:1: entryRuleParameterAnyType returns [EObject current=null] : iv_ruleParameterAnyType= ruleParameterAnyType EOF ;
    public final EObject entryRuleParameterAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAnyType = null;


        try {
            // InternalRosArtifact.g:2507:57: (iv_ruleParameterAnyType= ruleParameterAnyType EOF )
            // InternalRosArtifact.g:2508:2: iv_ruleParameterAnyType= ruleParameterAnyType EOF
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
    // InternalRosArtifact.g:2514:1: ruleParameterAnyType returns [EObject current=null] : ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2520:2: ( ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2521:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2521:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2522:3: () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2522:3: ()
            // InternalRosArtifact.g:2523:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2537:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==44) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRosArtifact.g:2538:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_49); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2542:4: ( (lv_default_4_0= ruleParameterAny ) )
                    // InternalRosArtifact.g:2543:5: (lv_default_4_0= ruleParameterAny )
                    {
                    // InternalRosArtifact.g:2543:5: (lv_default_4_0= ruleParameterAny )
                    // InternalRosArtifact.g:2544:6: lv_default_4_0= ruleParameterAny
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyTypeAccess().getDefaultParameterAnyParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterAny();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterAny");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2570:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRosArtifact.g:2570:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRosArtifact.g:2571:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRosArtifact.g:2577:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) ;
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
            // InternalRosArtifact.g:2583:2: ( (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) )
            // InternalRosArtifact.g:2584:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            {
            // InternalRosArtifact.g:2584:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            // InternalRosArtifact.g:2585:3: otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getParameterArrayTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRosArtifact.g:2597:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRosArtifact.g:2598:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRosArtifact.g:2598:4: (lv_type_3_0= ruleParameterType )
            // InternalRosArtifact.g:2599:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_type_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:2616:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==44) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRosArtifact.g:2617:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRosArtifact.g:2621:4: ( (lv_default_5_0= ruleParameterSequence ) )
                    // InternalRosArtifact.g:2622:5: (lv_default_5_0= ruleParameterSequence )
                    {
                    // InternalRosArtifact.g:2622:5: (lv_default_5_0= ruleParameterSequence )
                    // InternalRosArtifact.g:2623:6: lv_default_5_0= ruleParameterSequence
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterSequenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_5_0=ruleParameterSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2649:1: entryRuleParameterSequence returns [EObject current=null] : iv_ruleParameterSequence= ruleParameterSequence EOF ;
    public final EObject entryRuleParameterSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSequence = null;


        try {
            // InternalRosArtifact.g:2649:58: (iv_ruleParameterSequence= ruleParameterSequence EOF )
            // InternalRosArtifact.g:2650:2: iv_ruleParameterSequence= ruleParameterSequence EOF
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
    // InternalRosArtifact.g:2656:1: ruleParameterSequence returns [EObject current=null] : ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRosArtifact.g:2662:2: ( ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosArtifact.g:2663:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosArtifact.g:2663:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosArtifact.g:2664:3: () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosArtifact.g:2664:3: ()
            // InternalRosArtifact.g:2665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterSequenceAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSequenceAccess().getParameterSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2679:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRosArtifact.g:2680:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterSequenceAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosArtifact.g:2688:4: ( (lv_value_5_0= ruleParameterValue ) )
                    // InternalRosArtifact.g:2689:5: (lv_value_5_0= ruleParameterValue )
                    {
                    // InternalRosArtifact.g:2689:5: (lv_value_5_0= ruleParameterValue )
                    // InternalRosArtifact.g:2690:6: lv_value_5_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterSequenceAccess().getValueParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_5_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterSequenceRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:2707:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==18) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalRosArtifact.g:2708:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_51); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterSequenceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosArtifact.g:2712:5: ( (lv_value_7_0= ruleParameterValue ) )
                    	    // InternalRosArtifact.g:2713:6: (lv_value_7_0= ruleParameterValue )
                    	    {
                    	    // InternalRosArtifact.g:2713:6: (lv_value_7_0= ruleParameterValue )
                    	    // InternalRosArtifact.g:2714:7: lv_value_7_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterSequenceAccess().getValueParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_value_7_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterSequenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_7_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterSequenceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2745:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRosArtifact.g:2745:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRosArtifact.g:2746:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRosArtifact.g:2752:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2758:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRosArtifact.g:2759:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRosArtifact.g:2759:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRosArtifact.g:2760:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRosArtifact.g:2760:3: ()
            // InternalRosArtifact.g:2761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:2775:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRosArtifact.g:2776:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRosArtifact.g:2780:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRosArtifact.g:2781:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRosArtifact.g:2781:5: (lv_value_4_0= ruleEString )
                    // InternalRosArtifact.g:2782:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2808:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRosArtifact.g:2808:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRosArtifact.g:2809:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRosArtifact.g:2815:1: ruleParameterString returns [EObject current=null] : (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2821:2: ( (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalRosArtifact.g:2822:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRosArtifact.g:2822:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalRosArtifact.g:2823:3: otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStringAccess().getParameterStringKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringAccess().getValueKeyword_2());
            		
            // InternalRosArtifact.g:2835:3: ( (lv_value_3_0= ruleEString ) )
            // InternalRosArtifact.g:2836:4: (lv_value_3_0= ruleEString )
            {
            // InternalRosArtifact.g:2836:4: (lv_value_3_0= ruleEString )
            // InternalRosArtifact.g:2837:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStringRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2862:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRosArtifact.g:2862:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRosArtifact.g:2863:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRosArtifact.g:2869:1: ruleParameterBase64 returns [EObject current=null] : (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2875:2: ( (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) )
            // InternalRosArtifact.g:2876:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            {
            // InternalRosArtifact.g:2876:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            // InternalRosArtifact.g:2877:3: otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBase64Access().getParameterBase64Keyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64Access().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64Access().getValueKeyword_2());
            		
            // InternalRosArtifact.g:2889:3: ( (lv_value_3_0= ruleBase64Binary ) )
            // InternalRosArtifact.g:2890:4: (lv_value_3_0= ruleBase64Binary )
            {
            // InternalRosArtifact.g:2890:4: (lv_value_3_0= ruleBase64Binary )
            // InternalRosArtifact.g:2891:5: lv_value_3_0= ruleBase64Binary
            {

            					newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleBase64Binary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.Base64Binary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2916:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRosArtifact.g:2916:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRosArtifact.g:2917:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRosArtifact.g:2923:1: ruleParameterInteger returns [EObject current=null] : (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2929:2: ( (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) )
            // InternalRosArtifact.g:2930:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            {
            // InternalRosArtifact.g:2930:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            // InternalRosArtifact.g:2931:3: otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterIntegerAccess().getParameterIntegerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerAccess().getValueKeyword_2());
            		
            // InternalRosArtifact.g:2943:3: ( (lv_value_3_0= ruleInt0 ) )
            // InternalRosArtifact.g:2944:4: (lv_value_3_0= ruleInt0 )
            {
            // InternalRosArtifact.g:2944:4: (lv_value_3_0= ruleInt0 )
            // InternalRosArtifact.g:2945:5: lv_value_3_0= ruleInt0
            {

            					newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInt0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleInt0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.Int0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:2970:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRosArtifact.g:2970:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRosArtifact.g:2971:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRosArtifact.g:2977:1: ruleParameterDouble returns [EObject current=null] : (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:2983:2: ( (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) )
            // InternalRosArtifact.g:2984:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            {
            // InternalRosArtifact.g:2984:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            // InternalRosArtifact.g:2985:3: otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDoubleAccess().getParameterDoubleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleAccess().getValueKeyword_2());
            		
            // InternalRosArtifact.g:2997:3: ( (lv_value_3_0= ruleDouble ) )
            // InternalRosArtifact.g:2998:4: (lv_value_3_0= ruleDouble )
            {
            // InternalRosArtifact.g:2998:4: (lv_value_3_0= ruleDouble )
            // InternalRosArtifact.g:2999:5: lv_value_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:3024:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRosArtifact.g:3024:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRosArtifact.g:3025:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRosArtifact.g:3031:1: ruleParameterBoolean returns [EObject current=null] : (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:3037:2: ( (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // InternalRosArtifact.g:3038:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // InternalRosArtifact.g:3038:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // InternalRosArtifact.g:3039:3: otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBooleanAccess().getParameterBooleanKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanAccess().getValueKeyword_2());
            		
            // InternalRosArtifact.g:3051:3: ( (lv_value_3_0= ruleBoolean ) )
            // InternalRosArtifact.g:3052:4: (lv_value_3_0= ruleBoolean )
            {
            // InternalRosArtifact.g:3052:4: (lv_value_3_0= ruleBoolean )
            // InternalRosArtifact.g:3053:5: lv_value_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:3078:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRosArtifact.g:3078:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRosArtifact.g:3079:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRosArtifact.g:3085:1: ruleParameterStruct returns [EObject current=null] : ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRosArtifact.g:3091:2: ( ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRosArtifact.g:3092:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRosArtifact.g:3092:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRosArtifact.g:3093:3: () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRosArtifact.g:3093:3: ()
            // InternalRosArtifact.g:3094:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getParameterStructKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosArtifact.g:3108:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRosArtifact.g:3109:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRosArtifact.g:3117:4: ( (lv_value_5_0= ruleParameterStructMember ) )
                    // InternalRosArtifact.g:3118:5: (lv_value_5_0= ruleParameterStructMember )
                    {
                    // InternalRosArtifact.g:3118:5: (lv_value_5_0= ruleParameterStructMember )
                    // InternalRosArtifact.g:3119:6: lv_value_5_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_5_0=ruleParameterStructMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterStructMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRosArtifact.g:3136:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==18) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalRosArtifact.g:3137:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_57); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRosArtifact.g:3141:5: ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    // InternalRosArtifact.g:3142:6: (lv_value_7_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRosArtifact.g:3142:6: (lv_value_7_0= ruleParameterStructMember )
                    	    // InternalRosArtifact.g:3143:7: lv_value_7_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_value_7_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_7_0,
                    	    								"de.fraunhofer.ipa.ros.RosArtifact.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:3174:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRosArtifact.g:3174:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRosArtifact.g:3175:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRosArtifact.g:3181:1: ruleParameterDate returns [EObject current=null] : (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosArtifact.g:3187:2: ( (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) )
            // InternalRosArtifact.g:3188:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            {
            // InternalRosArtifact.g:3188:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            // InternalRosArtifact.g:3189:3: otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDateAccess().getParameterDateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,56,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateAccess().getValueKeyword_2());
            		
            // InternalRosArtifact.g:3201:3: ( (lv_value_3_0= ruleDateTime ) )
            // InternalRosArtifact.g:3202:4: (lv_value_3_0= ruleDateTime )
            {
            // InternalRosArtifact.g:3202:4: (lv_value_3_0= ruleDateTime )
            // InternalRosArtifact.g:3203:5: lv_value_3_0= ruleDateTime
            {

            					newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleDateTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.DateTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:3228:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRosArtifact.g:3228:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRosArtifact.g:3229:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRosArtifact.g:3235:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Base64Binary' ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosArtifact.g:3241:2: (kw= 'Base64Binary' )
            // InternalRosArtifact.g:3242:2: kw= 'Base64Binary'
            {
            kw=(Token)match(input,65,FOLLOW_2); 

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
    // InternalRosArtifact.g:3250:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // InternalRosArtifact.g:3250:44: (iv_ruleInt0= ruleInt0 EOF )
            // InternalRosArtifact.g:3251:2: iv_ruleInt0= ruleInt0 EOF
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
    // InternalRosArtifact.g:3257:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosArtifact.g:3263:2: (kw= 'Int' )
            // InternalRosArtifact.g:3264:2: kw= 'Int'
            {
            kw=(Token)match(input,66,FOLLOW_2); 

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
    // InternalRosArtifact.g:3272:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalRosArtifact.g:3272:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalRosArtifact.g:3273:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalRosArtifact.g:3279:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Double' ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosArtifact.g:3285:2: (kw= 'Double' )
            // InternalRosArtifact.g:3286:2: kw= 'Double'
            {
            kw=(Token)match(input,67,FOLLOW_2); 

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
    // InternalRosArtifact.g:3294:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalRosArtifact.g:3294:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRosArtifact.g:3295:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalRosArtifact.g:3301:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosArtifact.g:3307:2: (kw= 'Boolean' )
            // InternalRosArtifact.g:3308:2: kw= 'Boolean'
            {
            kw=(Token)match(input,68,FOLLOW_2); 

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
    // InternalRosArtifact.g:3316:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRosArtifact.g:3316:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRosArtifact.g:3317:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRosArtifact.g:3323:1: ruleParameterStructMember returns [EObject current=null] : (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) ;
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
            // InternalRosArtifact.g:3329:2: ( (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) )
            // InternalRosArtifact.g:3330:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            {
            // InternalRosArtifact.g:3330:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            // InternalRosArtifact.g:3331:3: otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0());
            		
            // InternalRosArtifact.g:3335:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosArtifact.g:3336:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosArtifact.g:3336:4: (lv_name_1_0= ruleEString )
            // InternalRosArtifact.g:3337:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.RosArtifact.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,56,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructMemberAccess().getValueKeyword_3());
            		
            // InternalRosArtifact.g:3362:3: ( (lv_value_4_0= ruleParameterValue ) )
            // InternalRosArtifact.g:3363:4: (lv_value_4_0= ruleParameterValue )
            {
            // InternalRosArtifact.g:3363:4: (lv_value_4_0= ruleParameterValue )
            // InternalRosArtifact.g:3364:5: lv_value_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_4_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

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
    // InternalRosArtifact.g:3389:1: entryRuleDateTime returns [String current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final String entryRuleDateTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime = null;


        try {
            // InternalRosArtifact.g:3389:48: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalRosArtifact.g:3390:2: iv_ruleDateTime= ruleDateTime EOF
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
    // InternalRosArtifact.g:3396:1: ruleDateTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DateTime' ;
    public final AntlrDatatypeRuleToken ruleDateTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosArtifact.g:3402:2: (kw= 'DateTime' )
            // InternalRosArtifact.g:3403:2: kw= 'DateTime'
            {
            kw=(Token)match(input,70,FOLLOW_2); 

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
    // InternalRosArtifact.g:3411:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRosArtifact.g:3411:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRosArtifact.g:3412:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRosArtifact.g:3418:1: ruleParameterStructTypeMember returns [EObject current=null] : (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) ;
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
            // InternalRosArtifact.g:3424:2: ( (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) )
            // InternalRosArtifact.g:3425:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            {
            // InternalRosArtifact.g:3425:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            // InternalRosArtifact.g:3426:3: otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructTypeMemberAccess().getParameterStructTypeMemberKeyword_0());
            		
            // InternalRosArtifact.g:3430:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosArtifact.g:3431:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosArtifact.g:3431:4: (lv_name_1_0= ruleEString )
            // InternalRosArtifact.g:3432:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.RosArtifact.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeMemberAccess().getTypeKeyword_3());
            		
            // InternalRosArtifact.g:3457:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalRosArtifact.g:3458:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalRosArtifact.g:3458:4: (lv_type_4_0= ruleParameterType )
            // InternalRosArtifact.g:3459:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
            lv_type_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"de.fraunhofer.ipa.ros.RosArtifact.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosArtifact.g:3476:3: (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRosArtifact.g:3477:4: otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_59); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterStructTypeMemberAccess().getDefaultKeyword_5_0());
                    			
                    // InternalRosArtifact.g:3481:4: ( (lv_default_6_0= ruleParameterStruct ) )
                    // InternalRosArtifact.g:3482:5: (lv_default_6_0= ruleParameterStruct )
                    {
                    // InternalRosArtifact.g:3482:5: (lv_default_6_0= ruleParameterStruct )
                    // InternalRosArtifact.g:3483:6: lv_default_6_0= ruleParameterStruct
                    {

                    						newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getDefaultParameterStructParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_6_0=ruleParameterStruct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_6_0,
                    							"de.fraunhofer.ipa.ros.RosArtifact.ParameterStruct");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FA4000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F84000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001F04000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001E04000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001C04000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000034000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002008010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002008000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x007FA40000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000180000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xFE80000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000000L});

}