package de.jax.heim.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.jax.heim.regelsprache.Geraet;
import de.jax.heim.regelsprache.Model;
import de.jax.heim.regelsprache.Regel;
import de.jax.heim.regelsprache.RegelsprachePackage;
import de.jax.heim.regelsprache.Zustand;
import de.jax.heim.services.RegelspracheGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RegelspracheSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RegelspracheGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RegelsprachePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RegelsprachePackage.GERAET:
				if(context == grammarAccess.getDeklarationRule() ||
				   context == grammarAccess.getGeraetRule()) {
					sequence_Geraet(context, (Geraet) semanticObject); 
					return; 
				}
				else break;
			case RegelsprachePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case RegelsprachePackage.REGEL:
				if(context == grammarAccess.getDeklarationRule() ||
				   context == grammarAccess.getRegelRule()) {
					sequence_Regel(context, (Regel) semanticObject); 
					return; 
				}
				else break;
			case RegelsprachePackage.ZUSTAND:
				if(context == grammarAccess.getZustandRule()) {
					sequence_Zustand(context, (Zustand) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID (zustaende+=Zustand zustaende+=Zustand*)?)
	 */
	protected void sequence_Geraet(EObject context, Geraet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     deklarationen+=Deklaration*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (wenn=[Zustand|QualifiedName] dann=[Zustand|QualifiedName])
	 */
	protected void sequence_Regel(EObject context, Regel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RegelsprachePackage.Literals.REGEL__WENN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelsprachePackage.Literals.REGEL__WENN));
			if(transientValues.isValueTransient(semanticObject, RegelsprachePackage.Literals.REGEL__DANN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelsprachePackage.Literals.REGEL__DANN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegelAccess().getWennZustandQualifiedNameParserRuleCall_1_0_1(), semanticObject.getWenn());
		feeder.accept(grammarAccess.getRegelAccess().getDannZustandQualifiedNameParserRuleCall_3_0_1(), semanticObject.getDann());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Zustand(EObject context, Zustand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RegelsprachePackage.Literals.ZUSTAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelsprachePackage.Literals.ZUSTAND__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getZustandAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
