package de.jax.smarthome.serializer;

import com.google.inject.Inject;
import de.jax.smarthome.services.RegelSpracheGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RegelSpracheSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RegelSpracheGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Regel_FullStopKeyword_10_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RegelSpracheGrammarAccess) access;
		match_Regel_FullStopKeyword_10_q = new TokenAlias(false, true, grammarAccess.getRegelAccess().getFullStopKeyword_10());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Regel_FullStopKeyword_10_q.equals(syntax))
				emit_Regel_FullStopKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '.'?
	 */
	protected void emit_Regel_FullStopKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
