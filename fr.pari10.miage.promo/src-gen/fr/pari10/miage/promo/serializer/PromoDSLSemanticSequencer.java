/*
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo.serializer;

import com.google.inject.Inject;
import fr.pari10.miage.promo.promoDSL.Alternatives;
import fr.pari10.miage.promo.promoDSL.Chapitre;
import fr.pari10.miage.promo.promoDSL.Ingredient;
import fr.pari10.miage.promo.promoDSL.Instruction;
import fr.pari10.miage.promo.promoDSL.Livre;
import fr.pari10.miage.promo.promoDSL.Modele;
import fr.pari10.miage.promo.promoDSL.PromoDSLPackage;
import fr.pari10.miage.promo.promoDSL.Recette;
import fr.pari10.miage.promo.services.PromoDSLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PromoDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PromoDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PromoDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PromoDSLPackage.ALTERNATIVES:
				sequence_Alternatives(context, (Alternatives) semanticObject); 
				return; 
			case PromoDSLPackage.CHAPITRE:
				sequence_Chapitre(context, (Chapitre) semanticObject); 
				return; 
			case PromoDSLPackage.INGREDIENT:
				sequence_Ingredient(context, (Ingredient) semanticObject); 
				return; 
			case PromoDSLPackage.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case PromoDSLPackage.LIVRE:
				sequence_Livre(context, (Livre) semanticObject); 
				return; 
			case PromoDSLPackage.MODELE:
				sequence_Modele(context, (Modele) semanticObject); 
				return; 
			case PromoDSLPackage.RECETTE:
				sequence_Recette(context, (Recette) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Alternatives returns Alternatives
	 *
	 * Constraint:
	 *     altNum=STRING
	 */
	protected void sequence_Alternatives(ISerializationContext context, Alternatives semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromoDSLPackage.Literals.ALTERNATIVES__ALT_NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromoDSLPackage.Literals.ALTERNATIVES__ALT_NUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAlternativesAccess().getAltNumSTRINGTerminalRuleCall_0(), semanticObject.getAltNum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Chapitre returns Chapitre
	 *
	 * Constraint:
	 *     (numDuChapitre=STRING recette+=Recette+)
	 */
	protected void sequence_Chapitre(ISerializationContext context, Chapitre semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ingredient returns Ingredient
	 *
	 * Constraint:
	 *     (NomDuIng=STRING num=INT unite=STRING)
	 */
	protected void sequence_Ingredient(ISerializationContext context, Ingredient semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromoDSLPackage.Literals.INGREDIENT__NOM_DU_ING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromoDSLPackage.Literals.INGREDIENT__NOM_DU_ING));
			if (transientValues.isValueTransient(semanticObject, PromoDSLPackage.Literals.INGREDIENT__NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromoDSLPackage.Literals.INGREDIENT__NUM));
			if (transientValues.isValueTransient(semanticObject, PromoDSLPackage.Literals.INGREDIENT__UNITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromoDSLPackage.Literals.INGREDIENT__UNITE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIngredientAccess().getNomDuIngSTRINGTerminalRuleCall_0_0(), semanticObject.getNomDuIng());
		feeder.accept(grammarAccess.getIngredientAccess().getNumINTTerminalRuleCall_1_0(), semanticObject.getNum());
		feeder.accept(grammarAccess.getIngredientAccess().getUniteSTRINGTerminalRuleCall_2_0(), semanticObject.getUnite());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     numDuInstruction=STRING
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PromoDSLPackage.Literals.INSTRUCTION__NUM_DU_INSTRUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PromoDSLPackage.Literals.INSTRUCTION__NUM_DU_INSTRUCTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInstructionAccess().getNumDuInstructionSTRINGTerminalRuleCall_0(), semanticObject.getNumDuInstruction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Livre returns Livre
	 *
	 * Constraint:
	 *     (nomDuLivre=STRING nomDuLauteur=STRING chapitre+=Chapitre+)
	 */
	protected void sequence_Livre(ISerializationContext context, Livre semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Modele returns Modele
	 *
	 * Constraint:
	 *     livre+=Livre+
	 */
	protected void sequence_Modele(ISerializationContext context, Modele semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Recette returns Recette
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         NumPhoto=STRING 
	 *         ingredients+=Ingredient 
	 *         ingredients+=Ingredient* 
	 *         instructions+=Instruction 
	 *         instructions+=Instruction* 
	 *         (alternatives+=Alternatives alternatives+=Alternatives*)?
	 *     )
	 */
	protected void sequence_Recette(ISerializationContext context, Recette semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}