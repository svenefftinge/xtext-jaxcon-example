package de.jax.smarthome.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.jax.smarthome.regelSprache.Geraet;
import de.jax.smarthome.regelSprache.Model;
import de.jax.smarthome.regelSprache.Regel;
import de.jax.smarthome.regelSprache.RegelSprachePackage;
import de.jax.smarthome.regelSprache.Zustand;
import de.jax.smarthome.services.RegelSpracheGrammarAccess;
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
public class RegelSpracheSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RegelSpracheGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RegelSprachePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RegelSprachePackage.GERAET:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getGeraetRule()) {
					sequence_Geraet(context, (Geraet) semanticObject); 
					return; 
				}
				else break;
			case RegelSprachePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case RegelSprachePackage.REGEL:
				if(context == grammarAccess.getDefinitionRule() ||
				   context == grammarAccess.getRegelRule()) {
					sequence_Regel(context, (Regel) semanticObject); 
					return; 
				}
				else break;
			case RegelSprachePackage.ZUSTAND:
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
	 *     (artikel=Artikel name=ID (zustaende+=Zustand (zustaende+=Zustand* zustaende+=Zustand)*)?)
	 */
	protected void sequence_Geraet(EObject context, Geraet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definitionen+=Definition*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         wennArtikel=ArtikelKlein 
	 *         wennGeraet=[Geraet|ID] 
	 *         wenn=[Zustand|ID] 
	 *         dannArtikel=ArtikelKlein 
	 *         dannGeraet=[Geraet|ID] 
	 *         dann=[Zustand|ID]
	 *     )
	 */
	protected void sequence_Regel(EObject context, Regel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RegelSprachePackage.Literals.REGEL__WENN_ARTIKEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelSprachePackage.Literals.REGEL__WENN_ARTIKEL));
			if(transientValues.isValueTransient(semanticObject, RegelSprachePackage.Literals.REGEL__WENN_GERAET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelSprachePackage.Literals.REGEL__WENN_GERAET));
			if(transientValues.isValueTransient(semanticObject, RegelSprachePackage.Literals.REGEL__WENN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelSprachePackage.Literals.REGEL__WENN));
			if(transientValues.isValueTransient(semanticObject, RegelSprachePackage.Literals.REGEL__DANN_ARTIKEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelSprachePackage.Literals.REGEL__DANN_ARTIKEL));
			if(transientValues.isValueTransient(semanticObject, RegelSprachePackage.Literals.REGEL__DANN_GERAET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelSprachePackage.Literals.REGEL__DANN_GERAET));
			if(transientValues.isValueTransient(semanticObject, RegelSprachePackage.Literals.REGEL__DANN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelSprachePackage.Literals.REGEL__DANN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegelAccess().getWennArtikelArtikelKleinParserRuleCall_1_0(), semanticObject.getWennArtikel());
		feeder.accept(grammarAccess.getRegelAccess().getWennGeraetGeraetIDTerminalRuleCall_2_0_1(), semanticObject.getWennGeraet());
		feeder.accept(grammarAccess.getRegelAccess().getWennZustandIDTerminalRuleCall_3_0_1(), semanticObject.getWenn());
		feeder.accept(grammarAccess.getRegelAccess().getDannArtikelArtikelKleinParserRuleCall_7_0(), semanticObject.getDannArtikel());
		feeder.accept(grammarAccess.getRegelAccess().getDannGeraetGeraetIDTerminalRuleCall_8_0_1(), semanticObject.getDannGeraet());
		feeder.accept(grammarAccess.getRegelAccess().getDannZustandIDTerminalRuleCall_9_0_1(), semanticObject.getDann());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Zustand(EObject context, Zustand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RegelSprachePackage.Literals.ZUSTAND__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RegelSprachePackage.Literals.ZUSTAND__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getZustandAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
}
