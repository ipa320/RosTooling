/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.services.BasicsGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BasicsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BasicsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ParameterStruct___LeftSquareBracketKeyword_1_0_BEGINTerminalRuleCall_1_1_RightSquareBracketKeyword_1_3_ENDTerminalRuleCall_1_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BasicsGrammarAccess) access;
		match_ParameterStruct___LeftSquareBracketKeyword_1_0_BEGINTerminalRuleCall_1_1_RightSquareBracketKeyword_1_3_ENDTerminalRuleCall_1_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getParameterStructAccess().getBEGINTerminalRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getParameterStructAccess().getENDTerminalRuleCall_1_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ParameterStruct___LeftSquareBracketKeyword_1_0_BEGINTerminalRuleCall_1_1_RightSquareBracketKeyword_1_3_ENDTerminalRuleCall_1_4__q.equals(syntax))
				emit_ParameterStruct___LeftSquareBracketKeyword_1_0_BEGINTerminalRuleCall_1_1_RightSquareBracketKeyword_1_3_ENDTerminalRuleCall_1_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('[' BEGIN ']' END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_ParameterStruct___LeftSquareBracketKeyword_1_0_BEGINTerminalRuleCall_1_1_RightSquareBracketKeyword_1_3_ENDTerminalRuleCall_1_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
