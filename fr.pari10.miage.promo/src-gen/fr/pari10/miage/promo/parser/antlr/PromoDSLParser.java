/*
 * generated by Xtext 2.10.0
 */
package fr.pari10.miage.promo.parser.antlr;

import com.google.inject.Inject;
import fr.pari10.miage.promo.parser.antlr.internal.InternalPromoDSLParser;
import fr.pari10.miage.promo.services.PromoDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PromoDSLParser extends AbstractAntlrParser {

	@Inject
	private PromoDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPromoDSLParser createParser(XtextTokenStream stream) {
		return new InternalPromoDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Modele";
	}

	public PromoDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PromoDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
