/*
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PromoDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModeleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.pari10.miage.promo.PromoDSL.Modele");
		private final Assignment cLivreAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLivreLivreParserRuleCall_0 = (RuleCall)cLivreAssignment.eContents().get(0);
		
		//Modele:
		//	livre+=Livre*;
		@Override public ParserRule getRule() { return rule; }
		
		//livre+=Livre*
		public Assignment getLivreAssignment() { return cLivreAssignment; }
		
		//Livre
		public RuleCall getLivreLivreParserRuleCall_0() { return cLivreLivreParserRuleCall_0; }
	}
	public class LivreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.pari10.miage.promo.PromoDSL.Livre");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLivreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNomDuLivreAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNomDuLivreSTRINGTerminalRuleCall_1_0 = (RuleCall)cNomDuLivreAssignment_1.eContents().get(0);
		private final Keyword cParKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNomDuLauteurAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNomDuLauteurSTRINGTerminalRuleCall_3_0 = (RuleCall)cNomDuLauteurAssignment_3.eContents().get(0);
		private final Assignment cChapitreAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cChapitreChapitreParserRuleCall_4_0 = (RuleCall)cChapitreAssignment_4.eContents().get(0);
		private final Keyword cLivreKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Livre:
		//	'Livre' nomDuLivre=STRING 'par' nomDuLauteur=STRING
		//	chapitre+=Chapitre+
		//	'/Livre';
		@Override public ParserRule getRule() { return rule; }
		
		//'Livre' nomDuLivre=STRING 'par' nomDuLauteur=STRING chapitre+=Chapitre+ '/Livre'
		public Group getGroup() { return cGroup; }
		
		//'Livre'
		public Keyword getLivreKeyword_0() { return cLivreKeyword_0; }
		
		//nomDuLivre=STRING
		public Assignment getNomDuLivreAssignment_1() { return cNomDuLivreAssignment_1; }
		
		//STRING
		public RuleCall getNomDuLivreSTRINGTerminalRuleCall_1_0() { return cNomDuLivreSTRINGTerminalRuleCall_1_0; }
		
		//'par'
		public Keyword getParKeyword_2() { return cParKeyword_2; }
		
		//nomDuLauteur=STRING
		public Assignment getNomDuLauteurAssignment_3() { return cNomDuLauteurAssignment_3; }
		
		//STRING
		public RuleCall getNomDuLauteurSTRINGTerminalRuleCall_3_0() { return cNomDuLauteurSTRINGTerminalRuleCall_3_0; }
		
		//chapitre+=Chapitre+
		public Assignment getChapitreAssignment_4() { return cChapitreAssignment_4; }
		
		//Chapitre
		public RuleCall getChapitreChapitreParserRuleCall_4_0() { return cChapitreChapitreParserRuleCall_4_0; }
		
		//'/Livre'
		public Keyword getLivreKeyword_5() { return cLivreKeyword_5; }
	}
	public class ChapitreElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.pari10.miage.promo.PromoDSL.Chapitre");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChapitreKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNumDuChapitreAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNumDuChapitreSTRINGTerminalRuleCall_1_0 = (RuleCall)cNumDuChapitreAssignment_1.eContents().get(0);
		private final Assignment cRecetteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRecetteRecetteParserRuleCall_2_0 = (RuleCall)cRecetteAssignment_2.eContents().get(0);
		private final Keyword cChapitreKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Chapitre:
		//	'Chapitre' numDuChapitre=STRING
		//	recette+=Recette+
		//	'/Chapitre';
		@Override public ParserRule getRule() { return rule; }
		
		//'Chapitre' numDuChapitre=STRING recette+=Recette+ '/Chapitre'
		public Group getGroup() { return cGroup; }
		
		//'Chapitre'
		public Keyword getChapitreKeyword_0() { return cChapitreKeyword_0; }
		
		//numDuChapitre=STRING
		public Assignment getNumDuChapitreAssignment_1() { return cNumDuChapitreAssignment_1; }
		
		//STRING
		public RuleCall getNumDuChapitreSTRINGTerminalRuleCall_1_0() { return cNumDuChapitreSTRINGTerminalRuleCall_1_0; }
		
		//recette+=Recette+
		public Assignment getRecetteAssignment_2() { return cRecetteAssignment_2; }
		
		//Recette
		public RuleCall getRecetteRecetteParserRuleCall_2_0() { return cRecetteRecetteParserRuleCall_2_0; }
		
		//'/Chapitre'
		public Keyword getChapitreKeyword_3() { return cChapitreKeyword_3; }
	}
	public class RecetteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.pari10.miage.promo.PromoDSL.Recette");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRecetteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cPhotoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNumPhotoAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNumPhotoSTRINGTerminalRuleCall_3_0 = (RuleCall)cNumPhotoAssignment_3.eContents().get(0);
		private final Keyword cIngredientsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIngredientsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIngredientsIngredientParserRuleCall_5_0 = (RuleCall)cIngredientsAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cSemicolonKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cIngredientsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cIngredientsIngredientParserRuleCall_6_1_0 = (RuleCall)cIngredientsAssignment_6_1.eContents().get(0);
		private final Keyword cInstructionKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cInstructionsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cInstructionsInstructionParserRuleCall_8_0 = (RuleCall)cInstructionsAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cSemicolonKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cInstructionsAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cInstructionsInstructionParserRuleCall_9_1_0 = (RuleCall)cInstructionsAssignment_9_1.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cAlternativesKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cAlternativesAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cAlternativesAlternativesParserRuleCall_10_1_0 = (RuleCall)cAlternativesAssignment_10_1.eContents().get(0);
		private final Group cGroup_10_2 = (Group)cGroup_10.eContents().get(2);
		private final Keyword cSemicolonKeyword_10_2_0 = (Keyword)cGroup_10_2.eContents().get(0);
		private final Assignment cAlternativesAssignment_10_2_1 = (Assignment)cGroup_10_2.eContents().get(1);
		private final RuleCall cAlternativesAlternativesParserRuleCall_10_2_1_0 = (RuleCall)cAlternativesAssignment_10_2_1.eContents().get(0);
		private final Keyword cRecetteKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//Recette:
		//	'Recette' name=STRING
		//	'photo' NumPhoto=STRING
		//	'ingredients'
		//	ingredients+=Ingredient (';' ingredients+=Ingredient)*
		//	'instruction'
		//	instructions+=Instruction (';' instructions+=Instruction)* ('alternatives' alternatives+=Alternatives (';'
		//	alternatives+=Alternatives)*)?
		//	'/Recette';
		@Override public ParserRule getRule() { return rule; }
		
		//'Recette' name=STRING 'photo' NumPhoto=STRING 'ingredients' ingredients+=Ingredient (';' ingredients+=Ingredient)*
		//'instruction' instructions+=Instruction (';' instructions+=Instruction)* ('alternatives' alternatives+=Alternatives
		//(';' alternatives+=Alternatives)*)? '/Recette'
		public Group getGroup() { return cGroup; }
		
		//'Recette'
		public Keyword getRecetteKeyword_0() { return cRecetteKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'photo'
		public Keyword getPhotoKeyword_2() { return cPhotoKeyword_2; }
		
		//NumPhoto=STRING
		public Assignment getNumPhotoAssignment_3() { return cNumPhotoAssignment_3; }
		
		//STRING
		public RuleCall getNumPhotoSTRINGTerminalRuleCall_3_0() { return cNumPhotoSTRINGTerminalRuleCall_3_0; }
		
		//'ingredients'
		public Keyword getIngredientsKeyword_4() { return cIngredientsKeyword_4; }
		
		//ingredients+=Ingredient
		public Assignment getIngredientsAssignment_5() { return cIngredientsAssignment_5; }
		
		//Ingredient
		public RuleCall getIngredientsIngredientParserRuleCall_5_0() { return cIngredientsIngredientParserRuleCall_5_0; }
		
		//(';' ingredients+=Ingredient)*
		public Group getGroup_6() { return cGroup_6; }
		
		//';'
		public Keyword getSemicolonKeyword_6_0() { return cSemicolonKeyword_6_0; }
		
		//ingredients+=Ingredient
		public Assignment getIngredientsAssignment_6_1() { return cIngredientsAssignment_6_1; }
		
		//Ingredient
		public RuleCall getIngredientsIngredientParserRuleCall_6_1_0() { return cIngredientsIngredientParserRuleCall_6_1_0; }
		
		//'instruction'
		public Keyword getInstructionKeyword_7() { return cInstructionKeyword_7; }
		
		//instructions+=Instruction
		public Assignment getInstructionsAssignment_8() { return cInstructionsAssignment_8; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_8_0() { return cInstructionsInstructionParserRuleCall_8_0; }
		
		//(';' instructions+=Instruction)*
		public Group getGroup_9() { return cGroup_9; }
		
		//';'
		public Keyword getSemicolonKeyword_9_0() { return cSemicolonKeyword_9_0; }
		
		//instructions+=Instruction
		public Assignment getInstructionsAssignment_9_1() { return cInstructionsAssignment_9_1; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_9_1_0() { return cInstructionsInstructionParserRuleCall_9_1_0; }
		
		//('alternatives' alternatives+=Alternatives (';' alternatives+=Alternatives)*)?
		public Group getGroup_10() { return cGroup_10; }
		
		//'alternatives'
		public Keyword getAlternativesKeyword_10_0() { return cAlternativesKeyword_10_0; }
		
		//alternatives+=Alternatives
		public Assignment getAlternativesAssignment_10_1() { return cAlternativesAssignment_10_1; }
		
		//Alternatives
		public RuleCall getAlternativesAlternativesParserRuleCall_10_1_0() { return cAlternativesAlternativesParserRuleCall_10_1_0; }
		
		//(';' alternatives+=Alternatives)*
		public Group getGroup_10_2() { return cGroup_10_2; }
		
		//';'
		public Keyword getSemicolonKeyword_10_2_0() { return cSemicolonKeyword_10_2_0; }
		
		//alternatives+=Alternatives
		public Assignment getAlternativesAssignment_10_2_1() { return cAlternativesAssignment_10_2_1; }
		
		//Alternatives
		public RuleCall getAlternativesAlternativesParserRuleCall_10_2_1_0() { return cAlternativesAlternativesParserRuleCall_10_2_1_0; }
		
		//'/Recette'
		public Keyword getRecetteKeyword_11() { return cRecetteKeyword_11; }
	}
	public class AlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.pari10.miage.promo.PromoDSL.Alternatives");
		private final Assignment cAltNumAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAltNumSTRINGTerminalRuleCall_0 = (RuleCall)cAltNumAssignment.eContents().get(0);
		
		//Alternatives:
		//	altNum=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//altNum=STRING
		public Assignment getAltNumAssignment() { return cAltNumAssignment; }
		
		//STRING
		public RuleCall getAltNumSTRINGTerminalRuleCall_0() { return cAltNumSTRINGTerminalRuleCall_0; }
	}
	public class IngredientElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.pari10.miage.promo.PromoDSL.Ingredient");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNomDuIngAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNomDuIngSTRINGTerminalRuleCall_0_0 = (RuleCall)cNomDuIngAssignment_0.eContents().get(0);
		private final Assignment cNumAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNumINTTerminalRuleCall_1_0 = (RuleCall)cNumAssignment_1.eContents().get(0);
		private final Assignment cUniteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUniteSTRINGTerminalRuleCall_2_0 = (RuleCall)cUniteAssignment_2.eContents().get(0);
		
		//Ingredient:
		//	NomDuIng=STRING num=INT unite=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//NomDuIng=STRING num=INT unite=STRING
		public Group getGroup() { return cGroup; }
		
		//NomDuIng=STRING
		public Assignment getNomDuIngAssignment_0() { return cNomDuIngAssignment_0; }
		
		//STRING
		public RuleCall getNomDuIngSTRINGTerminalRuleCall_0_0() { return cNomDuIngSTRINGTerminalRuleCall_0_0; }
		
		//num=INT
		public Assignment getNumAssignment_1() { return cNumAssignment_1; }
		
		//INT
		public RuleCall getNumINTTerminalRuleCall_1_0() { return cNumINTTerminalRuleCall_1_0; }
		
		//unite=STRING
		public Assignment getUniteAssignment_2() { return cUniteAssignment_2; }
		
		//STRING
		public RuleCall getUniteSTRINGTerminalRuleCall_2_0() { return cUniteSTRINGTerminalRuleCall_2_0; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.pari10.miage.promo.PromoDSL.Instruction");
		private final Assignment cNumDuInstructionAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNumDuInstructionSTRINGTerminalRuleCall_0 = (RuleCall)cNumDuInstructionAssignment.eContents().get(0);
		
		//Instruction:
		//	numDuInstruction=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//numDuInstruction=STRING
		public Assignment getNumDuInstructionAssignment() { return cNumDuInstructionAssignment; }
		
		//STRING
		public RuleCall getNumDuInstructionSTRINGTerminalRuleCall_0() { return cNumDuInstructionSTRINGTerminalRuleCall_0; }
	}
	
	
	private final ModeleElements pModele;
	private final LivreElements pLivre;
	private final ChapitreElements pChapitre;
	private final RecetteElements pRecette;
	private final AlternativesElements pAlternatives;
	private final IngredientElements pIngredient;
	private final InstructionElements pInstruction;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PromoDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModele = new ModeleElements();
		this.pLivre = new LivreElements();
		this.pChapitre = new ChapitreElements();
		this.pRecette = new RecetteElements();
		this.pAlternatives = new AlternativesElements();
		this.pIngredient = new IngredientElements();
		this.pInstruction = new InstructionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.pari10.miage.promo.PromoDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Modele:
	//	livre+=Livre*;
	public ModeleElements getModeleAccess() {
		return pModele;
	}
	
	public ParserRule getModeleRule() {
		return getModeleAccess().getRule();
	}
	
	//Livre:
	//	'Livre' nomDuLivre=STRING 'par' nomDuLauteur=STRING
	//	chapitre+=Chapitre+
	//	'/Livre';
	public LivreElements getLivreAccess() {
		return pLivre;
	}
	
	public ParserRule getLivreRule() {
		return getLivreAccess().getRule();
	}
	
	//Chapitre:
	//	'Chapitre' numDuChapitre=STRING
	//	recette+=Recette+
	//	'/Chapitre';
	public ChapitreElements getChapitreAccess() {
		return pChapitre;
	}
	
	public ParserRule getChapitreRule() {
		return getChapitreAccess().getRule();
	}
	
	//Recette:
	//	'Recette' name=STRING
	//	'photo' NumPhoto=STRING
	//	'ingredients'
	//	ingredients+=Ingredient (';' ingredients+=Ingredient)*
	//	'instruction'
	//	instructions+=Instruction (';' instructions+=Instruction)* ('alternatives' alternatives+=Alternatives (';'
	//	alternatives+=Alternatives)*)?
	//	'/Recette';
	public RecetteElements getRecetteAccess() {
		return pRecette;
	}
	
	public ParserRule getRecetteRule() {
		return getRecetteAccess().getRule();
	}
	
	//Alternatives:
	//	altNum=STRING;
	public AlternativesElements getAlternativesAccess() {
		return pAlternatives;
	}
	
	public ParserRule getAlternativesRule() {
		return getAlternativesAccess().getRule();
	}
	
	//Ingredient:
	//	NomDuIng=STRING num=INT unite=STRING;
	public IngredientElements getIngredientAccess() {
		return pIngredient;
	}
	
	public ParserRule getIngredientRule() {
		return getIngredientAccess().getRule();
	}
	
	//Instruction:
	//	numDuInstruction=STRING;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
