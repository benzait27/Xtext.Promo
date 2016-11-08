package fr.pari10.miage.promo.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.pari10.miage.promo.services.PromoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPromoDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Livre'", "'par'", "'/Livre'", "'Chapitre'", "'/Chapitre'", "'Recette'", "'photo'", "'ingredients'", "'instruction'", "'/Recette'", "';'", "'alternatives'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPromoDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPromoDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPromoDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPromoDSL.g"; }


    	private PromoDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PromoDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModele"
    // InternalPromoDSL.g:53:1: entryRuleModele : ruleModele EOF ;
    public final void entryRuleModele() throws RecognitionException {
        try {
            // InternalPromoDSL.g:54:1: ( ruleModele EOF )
            // InternalPromoDSL.g:55:1: ruleModele EOF
            {
             before(grammarAccess.getModeleRule()); 
            pushFollow(FOLLOW_1);
            ruleModele();

            state._fsp--;

             after(grammarAccess.getModeleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModele"


    // $ANTLR start "ruleModele"
    // InternalPromoDSL.g:62:1: ruleModele : ( ( rule__Modele__LivreAssignment )* ) ;
    public final void ruleModele() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:66:2: ( ( ( rule__Modele__LivreAssignment )* ) )
            // InternalPromoDSL.g:67:2: ( ( rule__Modele__LivreAssignment )* )
            {
            // InternalPromoDSL.g:67:2: ( ( rule__Modele__LivreAssignment )* )
            // InternalPromoDSL.g:68:3: ( rule__Modele__LivreAssignment )*
            {
             before(grammarAccess.getModeleAccess().getLivreAssignment()); 
            // InternalPromoDSL.g:69:3: ( rule__Modele__LivreAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPromoDSL.g:69:4: rule__Modele__LivreAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Modele__LivreAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModeleAccess().getLivreAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModele"


    // $ANTLR start "entryRuleLivre"
    // InternalPromoDSL.g:78:1: entryRuleLivre : ruleLivre EOF ;
    public final void entryRuleLivre() throws RecognitionException {
        try {
            // InternalPromoDSL.g:79:1: ( ruleLivre EOF )
            // InternalPromoDSL.g:80:1: ruleLivre EOF
            {
             before(grammarAccess.getLivreRule()); 
            pushFollow(FOLLOW_1);
            ruleLivre();

            state._fsp--;

             after(grammarAccess.getLivreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLivre"


    // $ANTLR start "ruleLivre"
    // InternalPromoDSL.g:87:1: ruleLivre : ( ( rule__Livre__Group__0 ) ) ;
    public final void ruleLivre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:91:2: ( ( ( rule__Livre__Group__0 ) ) )
            // InternalPromoDSL.g:92:2: ( ( rule__Livre__Group__0 ) )
            {
            // InternalPromoDSL.g:92:2: ( ( rule__Livre__Group__0 ) )
            // InternalPromoDSL.g:93:3: ( rule__Livre__Group__0 )
            {
             before(grammarAccess.getLivreAccess().getGroup()); 
            // InternalPromoDSL.g:94:3: ( rule__Livre__Group__0 )
            // InternalPromoDSL.g:94:4: rule__Livre__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Livre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLivreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLivre"


    // $ANTLR start "entryRuleChapitre"
    // InternalPromoDSL.g:103:1: entryRuleChapitre : ruleChapitre EOF ;
    public final void entryRuleChapitre() throws RecognitionException {
        try {
            // InternalPromoDSL.g:104:1: ( ruleChapitre EOF )
            // InternalPromoDSL.g:105:1: ruleChapitre EOF
            {
             before(grammarAccess.getChapitreRule()); 
            pushFollow(FOLLOW_1);
            ruleChapitre();

            state._fsp--;

             after(grammarAccess.getChapitreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChapitre"


    // $ANTLR start "ruleChapitre"
    // InternalPromoDSL.g:112:1: ruleChapitre : ( ( rule__Chapitre__Group__0 ) ) ;
    public final void ruleChapitre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:116:2: ( ( ( rule__Chapitre__Group__0 ) ) )
            // InternalPromoDSL.g:117:2: ( ( rule__Chapitre__Group__0 ) )
            {
            // InternalPromoDSL.g:117:2: ( ( rule__Chapitre__Group__0 ) )
            // InternalPromoDSL.g:118:3: ( rule__Chapitre__Group__0 )
            {
             before(grammarAccess.getChapitreAccess().getGroup()); 
            // InternalPromoDSL.g:119:3: ( rule__Chapitre__Group__0 )
            // InternalPromoDSL.g:119:4: rule__Chapitre__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chapitre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapitreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChapitre"


    // $ANTLR start "entryRuleRecette"
    // InternalPromoDSL.g:128:1: entryRuleRecette : ruleRecette EOF ;
    public final void entryRuleRecette() throws RecognitionException {
        try {
            // InternalPromoDSL.g:129:1: ( ruleRecette EOF )
            // InternalPromoDSL.g:130:1: ruleRecette EOF
            {
             before(grammarAccess.getRecetteRule()); 
            pushFollow(FOLLOW_1);
            ruleRecette();

            state._fsp--;

             after(grammarAccess.getRecetteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecette"


    // $ANTLR start "ruleRecette"
    // InternalPromoDSL.g:137:1: ruleRecette : ( ( rule__Recette__Group__0 ) ) ;
    public final void ruleRecette() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:141:2: ( ( ( rule__Recette__Group__0 ) ) )
            // InternalPromoDSL.g:142:2: ( ( rule__Recette__Group__0 ) )
            {
            // InternalPromoDSL.g:142:2: ( ( rule__Recette__Group__0 ) )
            // InternalPromoDSL.g:143:3: ( rule__Recette__Group__0 )
            {
             before(grammarAccess.getRecetteAccess().getGroup()); 
            // InternalPromoDSL.g:144:3: ( rule__Recette__Group__0 )
            // InternalPromoDSL.g:144:4: rule__Recette__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recette__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecette"


    // $ANTLR start "entryRuleAlternatives"
    // InternalPromoDSL.g:153:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // InternalPromoDSL.g:154:1: ( ruleAlternatives EOF )
            // InternalPromoDSL.g:155:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalPromoDSL.g:162:1: ruleAlternatives : ( ( rule__Alternatives__AltNumAssignment ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:166:2: ( ( ( rule__Alternatives__AltNumAssignment ) ) )
            // InternalPromoDSL.g:167:2: ( ( rule__Alternatives__AltNumAssignment ) )
            {
            // InternalPromoDSL.g:167:2: ( ( rule__Alternatives__AltNumAssignment ) )
            // InternalPromoDSL.g:168:3: ( rule__Alternatives__AltNumAssignment )
            {
             before(grammarAccess.getAlternativesAccess().getAltNumAssignment()); 
            // InternalPromoDSL.g:169:3: ( rule__Alternatives__AltNumAssignment )
            // InternalPromoDSL.g:169:4: rule__Alternatives__AltNumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__AltNumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getAltNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleIngredient"
    // InternalPromoDSL.g:178:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalPromoDSL.g:179:1: ( ruleIngredient EOF )
            // InternalPromoDSL.g:180:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalPromoDSL.g:187:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:191:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalPromoDSL.g:192:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalPromoDSL.g:192:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalPromoDSL.g:193:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalPromoDSL.g:194:3: ( rule__Ingredient__Group__0 )
            // InternalPromoDSL.g:194:4: rule__Ingredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleInstruction"
    // InternalPromoDSL.g:203:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalPromoDSL.g:204:1: ( ruleInstruction EOF )
            // InternalPromoDSL.g:205:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalPromoDSL.g:212:1: ruleInstruction : ( ( rule__Instruction__NumDuInstructionAssignment ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:216:2: ( ( ( rule__Instruction__NumDuInstructionAssignment ) ) )
            // InternalPromoDSL.g:217:2: ( ( rule__Instruction__NumDuInstructionAssignment ) )
            {
            // InternalPromoDSL.g:217:2: ( ( rule__Instruction__NumDuInstructionAssignment ) )
            // InternalPromoDSL.g:218:3: ( rule__Instruction__NumDuInstructionAssignment )
            {
             before(grammarAccess.getInstructionAccess().getNumDuInstructionAssignment()); 
            // InternalPromoDSL.g:219:3: ( rule__Instruction__NumDuInstructionAssignment )
            // InternalPromoDSL.g:219:4: rule__Instruction__NumDuInstructionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__NumDuInstructionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getNumDuInstructionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "rule__Livre__Group__0"
    // InternalPromoDSL.g:227:1: rule__Livre__Group__0 : rule__Livre__Group__0__Impl rule__Livre__Group__1 ;
    public final void rule__Livre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:231:1: ( rule__Livre__Group__0__Impl rule__Livre__Group__1 )
            // InternalPromoDSL.g:232:2: rule__Livre__Group__0__Impl rule__Livre__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Livre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Livre__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__0"


    // $ANTLR start "rule__Livre__Group__0__Impl"
    // InternalPromoDSL.g:239:1: rule__Livre__Group__0__Impl : ( 'Livre' ) ;
    public final void rule__Livre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:243:1: ( ( 'Livre' ) )
            // InternalPromoDSL.g:244:1: ( 'Livre' )
            {
            // InternalPromoDSL.g:244:1: ( 'Livre' )
            // InternalPromoDSL.g:245:2: 'Livre'
            {
             before(grammarAccess.getLivreAccess().getLivreKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLivreAccess().getLivreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__0__Impl"


    // $ANTLR start "rule__Livre__Group__1"
    // InternalPromoDSL.g:254:1: rule__Livre__Group__1 : rule__Livre__Group__1__Impl rule__Livre__Group__2 ;
    public final void rule__Livre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:258:1: ( rule__Livre__Group__1__Impl rule__Livre__Group__2 )
            // InternalPromoDSL.g:259:2: rule__Livre__Group__1__Impl rule__Livre__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Livre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Livre__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__1"


    // $ANTLR start "rule__Livre__Group__1__Impl"
    // InternalPromoDSL.g:266:1: rule__Livre__Group__1__Impl : ( ( rule__Livre__NomDuLivreAssignment_1 ) ) ;
    public final void rule__Livre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:270:1: ( ( ( rule__Livre__NomDuLivreAssignment_1 ) ) )
            // InternalPromoDSL.g:271:1: ( ( rule__Livre__NomDuLivreAssignment_1 ) )
            {
            // InternalPromoDSL.g:271:1: ( ( rule__Livre__NomDuLivreAssignment_1 ) )
            // InternalPromoDSL.g:272:2: ( rule__Livre__NomDuLivreAssignment_1 )
            {
             before(grammarAccess.getLivreAccess().getNomDuLivreAssignment_1()); 
            // InternalPromoDSL.g:273:2: ( rule__Livre__NomDuLivreAssignment_1 )
            // InternalPromoDSL.g:273:3: rule__Livre__NomDuLivreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Livre__NomDuLivreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLivreAccess().getNomDuLivreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__1__Impl"


    // $ANTLR start "rule__Livre__Group__2"
    // InternalPromoDSL.g:281:1: rule__Livre__Group__2 : rule__Livre__Group__2__Impl rule__Livre__Group__3 ;
    public final void rule__Livre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:285:1: ( rule__Livre__Group__2__Impl rule__Livre__Group__3 )
            // InternalPromoDSL.g:286:2: rule__Livre__Group__2__Impl rule__Livre__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Livre__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Livre__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__2"


    // $ANTLR start "rule__Livre__Group__2__Impl"
    // InternalPromoDSL.g:293:1: rule__Livre__Group__2__Impl : ( 'par' ) ;
    public final void rule__Livre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:297:1: ( ( 'par' ) )
            // InternalPromoDSL.g:298:1: ( 'par' )
            {
            // InternalPromoDSL.g:298:1: ( 'par' )
            // InternalPromoDSL.g:299:2: 'par'
            {
             before(grammarAccess.getLivreAccess().getParKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLivreAccess().getParKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__2__Impl"


    // $ANTLR start "rule__Livre__Group__3"
    // InternalPromoDSL.g:308:1: rule__Livre__Group__3 : rule__Livre__Group__3__Impl rule__Livre__Group__4 ;
    public final void rule__Livre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:312:1: ( rule__Livre__Group__3__Impl rule__Livre__Group__4 )
            // InternalPromoDSL.g:313:2: rule__Livre__Group__3__Impl rule__Livre__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Livre__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Livre__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__3"


    // $ANTLR start "rule__Livre__Group__3__Impl"
    // InternalPromoDSL.g:320:1: rule__Livre__Group__3__Impl : ( ( rule__Livre__NomDuLauteurAssignment_3 ) ) ;
    public final void rule__Livre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:324:1: ( ( ( rule__Livre__NomDuLauteurAssignment_3 ) ) )
            // InternalPromoDSL.g:325:1: ( ( rule__Livre__NomDuLauteurAssignment_3 ) )
            {
            // InternalPromoDSL.g:325:1: ( ( rule__Livre__NomDuLauteurAssignment_3 ) )
            // InternalPromoDSL.g:326:2: ( rule__Livre__NomDuLauteurAssignment_3 )
            {
             before(grammarAccess.getLivreAccess().getNomDuLauteurAssignment_3()); 
            // InternalPromoDSL.g:327:2: ( rule__Livre__NomDuLauteurAssignment_3 )
            // InternalPromoDSL.g:327:3: rule__Livre__NomDuLauteurAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Livre__NomDuLauteurAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLivreAccess().getNomDuLauteurAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__3__Impl"


    // $ANTLR start "rule__Livre__Group__4"
    // InternalPromoDSL.g:335:1: rule__Livre__Group__4 : rule__Livre__Group__4__Impl rule__Livre__Group__5 ;
    public final void rule__Livre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:339:1: ( rule__Livre__Group__4__Impl rule__Livre__Group__5 )
            // InternalPromoDSL.g:340:2: rule__Livre__Group__4__Impl rule__Livre__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Livre__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Livre__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__4"


    // $ANTLR start "rule__Livre__Group__4__Impl"
    // InternalPromoDSL.g:347:1: rule__Livre__Group__4__Impl : ( ( ( rule__Livre__ChapitreAssignment_4 ) ) ( ( rule__Livre__ChapitreAssignment_4 )* ) ) ;
    public final void rule__Livre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:351:1: ( ( ( ( rule__Livre__ChapitreAssignment_4 ) ) ( ( rule__Livre__ChapitreAssignment_4 )* ) ) )
            // InternalPromoDSL.g:352:1: ( ( ( rule__Livre__ChapitreAssignment_4 ) ) ( ( rule__Livre__ChapitreAssignment_4 )* ) )
            {
            // InternalPromoDSL.g:352:1: ( ( ( rule__Livre__ChapitreAssignment_4 ) ) ( ( rule__Livre__ChapitreAssignment_4 )* ) )
            // InternalPromoDSL.g:353:2: ( ( rule__Livre__ChapitreAssignment_4 ) ) ( ( rule__Livre__ChapitreAssignment_4 )* )
            {
            // InternalPromoDSL.g:353:2: ( ( rule__Livre__ChapitreAssignment_4 ) )
            // InternalPromoDSL.g:354:3: ( rule__Livre__ChapitreAssignment_4 )
            {
             before(grammarAccess.getLivreAccess().getChapitreAssignment_4()); 
            // InternalPromoDSL.g:355:3: ( rule__Livre__ChapitreAssignment_4 )
            // InternalPromoDSL.g:355:4: rule__Livre__ChapitreAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Livre__ChapitreAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLivreAccess().getChapitreAssignment_4()); 

            }

            // InternalPromoDSL.g:358:2: ( ( rule__Livre__ChapitreAssignment_4 )* )
            // InternalPromoDSL.g:359:3: ( rule__Livre__ChapitreAssignment_4 )*
            {
             before(grammarAccess.getLivreAccess().getChapitreAssignment_4()); 
            // InternalPromoDSL.g:360:3: ( rule__Livre__ChapitreAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPromoDSL.g:360:4: rule__Livre__ChapitreAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Livre__ChapitreAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getLivreAccess().getChapitreAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__4__Impl"


    // $ANTLR start "rule__Livre__Group__5"
    // InternalPromoDSL.g:369:1: rule__Livre__Group__5 : rule__Livre__Group__5__Impl ;
    public final void rule__Livre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:373:1: ( rule__Livre__Group__5__Impl )
            // InternalPromoDSL.g:374:2: rule__Livre__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Livre__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__5"


    // $ANTLR start "rule__Livre__Group__5__Impl"
    // InternalPromoDSL.g:380:1: rule__Livre__Group__5__Impl : ( '/Livre' ) ;
    public final void rule__Livre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:384:1: ( ( '/Livre' ) )
            // InternalPromoDSL.g:385:1: ( '/Livre' )
            {
            // InternalPromoDSL.g:385:1: ( '/Livre' )
            // InternalPromoDSL.g:386:2: '/Livre'
            {
             before(grammarAccess.getLivreAccess().getLivreKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLivreAccess().getLivreKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__Group__5__Impl"


    // $ANTLR start "rule__Chapitre__Group__0"
    // InternalPromoDSL.g:396:1: rule__Chapitre__Group__0 : rule__Chapitre__Group__0__Impl rule__Chapitre__Group__1 ;
    public final void rule__Chapitre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:400:1: ( rule__Chapitre__Group__0__Impl rule__Chapitre__Group__1 )
            // InternalPromoDSL.g:401:2: rule__Chapitre__Group__0__Impl rule__Chapitre__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Chapitre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapitre__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__0"


    // $ANTLR start "rule__Chapitre__Group__0__Impl"
    // InternalPromoDSL.g:408:1: rule__Chapitre__Group__0__Impl : ( 'Chapitre' ) ;
    public final void rule__Chapitre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:412:1: ( ( 'Chapitre' ) )
            // InternalPromoDSL.g:413:1: ( 'Chapitre' )
            {
            // InternalPromoDSL.g:413:1: ( 'Chapitre' )
            // InternalPromoDSL.g:414:2: 'Chapitre'
            {
             before(grammarAccess.getChapitreAccess().getChapitreKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getChapitreAccess().getChapitreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__0__Impl"


    // $ANTLR start "rule__Chapitre__Group__1"
    // InternalPromoDSL.g:423:1: rule__Chapitre__Group__1 : rule__Chapitre__Group__1__Impl rule__Chapitre__Group__2 ;
    public final void rule__Chapitre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:427:1: ( rule__Chapitre__Group__1__Impl rule__Chapitre__Group__2 )
            // InternalPromoDSL.g:428:2: rule__Chapitre__Group__1__Impl rule__Chapitre__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Chapitre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapitre__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__1"


    // $ANTLR start "rule__Chapitre__Group__1__Impl"
    // InternalPromoDSL.g:435:1: rule__Chapitre__Group__1__Impl : ( ( rule__Chapitre__NumDuChapitreAssignment_1 ) ) ;
    public final void rule__Chapitre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:439:1: ( ( ( rule__Chapitre__NumDuChapitreAssignment_1 ) ) )
            // InternalPromoDSL.g:440:1: ( ( rule__Chapitre__NumDuChapitreAssignment_1 ) )
            {
            // InternalPromoDSL.g:440:1: ( ( rule__Chapitre__NumDuChapitreAssignment_1 ) )
            // InternalPromoDSL.g:441:2: ( rule__Chapitre__NumDuChapitreAssignment_1 )
            {
             before(grammarAccess.getChapitreAccess().getNumDuChapitreAssignment_1()); 
            // InternalPromoDSL.g:442:2: ( rule__Chapitre__NumDuChapitreAssignment_1 )
            // InternalPromoDSL.g:442:3: rule__Chapitre__NumDuChapitreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chapitre__NumDuChapitreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChapitreAccess().getNumDuChapitreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__1__Impl"


    // $ANTLR start "rule__Chapitre__Group__2"
    // InternalPromoDSL.g:450:1: rule__Chapitre__Group__2 : rule__Chapitre__Group__2__Impl rule__Chapitre__Group__3 ;
    public final void rule__Chapitre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:454:1: ( rule__Chapitre__Group__2__Impl rule__Chapitre__Group__3 )
            // InternalPromoDSL.g:455:2: rule__Chapitre__Group__2__Impl rule__Chapitre__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Chapitre__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapitre__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__2"


    // $ANTLR start "rule__Chapitre__Group__2__Impl"
    // InternalPromoDSL.g:462:1: rule__Chapitre__Group__2__Impl : ( ( ( rule__Chapitre__RecetteAssignment_2 ) ) ( ( rule__Chapitre__RecetteAssignment_2 )* ) ) ;
    public final void rule__Chapitre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:466:1: ( ( ( ( rule__Chapitre__RecetteAssignment_2 ) ) ( ( rule__Chapitre__RecetteAssignment_2 )* ) ) )
            // InternalPromoDSL.g:467:1: ( ( ( rule__Chapitre__RecetteAssignment_2 ) ) ( ( rule__Chapitre__RecetteAssignment_2 )* ) )
            {
            // InternalPromoDSL.g:467:1: ( ( ( rule__Chapitre__RecetteAssignment_2 ) ) ( ( rule__Chapitre__RecetteAssignment_2 )* ) )
            // InternalPromoDSL.g:468:2: ( ( rule__Chapitre__RecetteAssignment_2 ) ) ( ( rule__Chapitre__RecetteAssignment_2 )* )
            {
            // InternalPromoDSL.g:468:2: ( ( rule__Chapitre__RecetteAssignment_2 ) )
            // InternalPromoDSL.g:469:3: ( rule__Chapitre__RecetteAssignment_2 )
            {
             before(grammarAccess.getChapitreAccess().getRecetteAssignment_2()); 
            // InternalPromoDSL.g:470:3: ( rule__Chapitre__RecetteAssignment_2 )
            // InternalPromoDSL.g:470:4: rule__Chapitre__RecetteAssignment_2
            {
            pushFollow(FOLLOW_11);
            rule__Chapitre__RecetteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChapitreAccess().getRecetteAssignment_2()); 

            }

            // InternalPromoDSL.g:473:2: ( ( rule__Chapitre__RecetteAssignment_2 )* )
            // InternalPromoDSL.g:474:3: ( rule__Chapitre__RecetteAssignment_2 )*
            {
             before(grammarAccess.getChapitreAccess().getRecetteAssignment_2()); 
            // InternalPromoDSL.g:475:3: ( rule__Chapitre__RecetteAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPromoDSL.g:475:4: rule__Chapitre__RecetteAssignment_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Chapitre__RecetteAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getChapitreAccess().getRecetteAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__2__Impl"


    // $ANTLR start "rule__Chapitre__Group__3"
    // InternalPromoDSL.g:484:1: rule__Chapitre__Group__3 : rule__Chapitre__Group__3__Impl ;
    public final void rule__Chapitre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:488:1: ( rule__Chapitre__Group__3__Impl )
            // InternalPromoDSL.g:489:2: rule__Chapitre__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chapitre__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__3"


    // $ANTLR start "rule__Chapitre__Group__3__Impl"
    // InternalPromoDSL.g:495:1: rule__Chapitre__Group__3__Impl : ( '/Chapitre' ) ;
    public final void rule__Chapitre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:499:1: ( ( '/Chapitre' ) )
            // InternalPromoDSL.g:500:1: ( '/Chapitre' )
            {
            // InternalPromoDSL.g:500:1: ( '/Chapitre' )
            // InternalPromoDSL.g:501:2: '/Chapitre'
            {
             before(grammarAccess.getChapitreAccess().getChapitreKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChapitreAccess().getChapitreKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__Group__3__Impl"


    // $ANTLR start "rule__Recette__Group__0"
    // InternalPromoDSL.g:511:1: rule__Recette__Group__0 : rule__Recette__Group__0__Impl rule__Recette__Group__1 ;
    public final void rule__Recette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:515:1: ( rule__Recette__Group__0__Impl rule__Recette__Group__1 )
            // InternalPromoDSL.g:516:2: rule__Recette__Group__0__Impl rule__Recette__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__0"


    // $ANTLR start "rule__Recette__Group__0__Impl"
    // InternalPromoDSL.g:523:1: rule__Recette__Group__0__Impl : ( 'Recette' ) ;
    public final void rule__Recette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:527:1: ( ( 'Recette' ) )
            // InternalPromoDSL.g:528:1: ( 'Recette' )
            {
            // InternalPromoDSL.g:528:1: ( 'Recette' )
            // InternalPromoDSL.g:529:2: 'Recette'
            {
             before(grammarAccess.getRecetteAccess().getRecetteKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getRecetteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__0__Impl"


    // $ANTLR start "rule__Recette__Group__1"
    // InternalPromoDSL.g:538:1: rule__Recette__Group__1 : rule__Recette__Group__1__Impl rule__Recette__Group__2 ;
    public final void rule__Recette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:542:1: ( rule__Recette__Group__1__Impl rule__Recette__Group__2 )
            // InternalPromoDSL.g:543:2: rule__Recette__Group__1__Impl rule__Recette__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Recette__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__1"


    // $ANTLR start "rule__Recette__Group__1__Impl"
    // InternalPromoDSL.g:550:1: rule__Recette__Group__1__Impl : ( ( rule__Recette__NameAssignment_1 ) ) ;
    public final void rule__Recette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:554:1: ( ( ( rule__Recette__NameAssignment_1 ) ) )
            // InternalPromoDSL.g:555:1: ( ( rule__Recette__NameAssignment_1 ) )
            {
            // InternalPromoDSL.g:555:1: ( ( rule__Recette__NameAssignment_1 ) )
            // InternalPromoDSL.g:556:2: ( rule__Recette__NameAssignment_1 )
            {
             before(grammarAccess.getRecetteAccess().getNameAssignment_1()); 
            // InternalPromoDSL.g:557:2: ( rule__Recette__NameAssignment_1 )
            // InternalPromoDSL.g:557:3: rule__Recette__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recette__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__1__Impl"


    // $ANTLR start "rule__Recette__Group__2"
    // InternalPromoDSL.g:565:1: rule__Recette__Group__2 : rule__Recette__Group__2__Impl rule__Recette__Group__3 ;
    public final void rule__Recette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:569:1: ( rule__Recette__Group__2__Impl rule__Recette__Group__3 )
            // InternalPromoDSL.g:570:2: rule__Recette__Group__2__Impl rule__Recette__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__2"


    // $ANTLR start "rule__Recette__Group__2__Impl"
    // InternalPromoDSL.g:577:1: rule__Recette__Group__2__Impl : ( 'photo' ) ;
    public final void rule__Recette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:581:1: ( ( 'photo' ) )
            // InternalPromoDSL.g:582:1: ( 'photo' )
            {
            // InternalPromoDSL.g:582:1: ( 'photo' )
            // InternalPromoDSL.g:583:2: 'photo'
            {
             before(grammarAccess.getRecetteAccess().getPhotoKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getPhotoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__2__Impl"


    // $ANTLR start "rule__Recette__Group__3"
    // InternalPromoDSL.g:592:1: rule__Recette__Group__3 : rule__Recette__Group__3__Impl rule__Recette__Group__4 ;
    public final void rule__Recette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:596:1: ( rule__Recette__Group__3__Impl rule__Recette__Group__4 )
            // InternalPromoDSL.g:597:2: rule__Recette__Group__3__Impl rule__Recette__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Recette__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__3"


    // $ANTLR start "rule__Recette__Group__3__Impl"
    // InternalPromoDSL.g:604:1: rule__Recette__Group__3__Impl : ( ( rule__Recette__NumPhotoAssignment_3 ) ) ;
    public final void rule__Recette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:608:1: ( ( ( rule__Recette__NumPhotoAssignment_3 ) ) )
            // InternalPromoDSL.g:609:1: ( ( rule__Recette__NumPhotoAssignment_3 ) )
            {
            // InternalPromoDSL.g:609:1: ( ( rule__Recette__NumPhotoAssignment_3 ) )
            // InternalPromoDSL.g:610:2: ( rule__Recette__NumPhotoAssignment_3 )
            {
             before(grammarAccess.getRecetteAccess().getNumPhotoAssignment_3()); 
            // InternalPromoDSL.g:611:2: ( rule__Recette__NumPhotoAssignment_3 )
            // InternalPromoDSL.g:611:3: rule__Recette__NumPhotoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Recette__NumPhotoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getNumPhotoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__3__Impl"


    // $ANTLR start "rule__Recette__Group__4"
    // InternalPromoDSL.g:619:1: rule__Recette__Group__4 : rule__Recette__Group__4__Impl rule__Recette__Group__5 ;
    public final void rule__Recette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:623:1: ( rule__Recette__Group__4__Impl rule__Recette__Group__5 )
            // InternalPromoDSL.g:624:2: rule__Recette__Group__4__Impl rule__Recette__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__4"


    // $ANTLR start "rule__Recette__Group__4__Impl"
    // InternalPromoDSL.g:631:1: rule__Recette__Group__4__Impl : ( 'ingredients' ) ;
    public final void rule__Recette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:635:1: ( ( 'ingredients' ) )
            // InternalPromoDSL.g:636:1: ( 'ingredients' )
            {
            // InternalPromoDSL.g:636:1: ( 'ingredients' )
            // InternalPromoDSL.g:637:2: 'ingredients'
            {
             before(grammarAccess.getRecetteAccess().getIngredientsKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getIngredientsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__4__Impl"


    // $ANTLR start "rule__Recette__Group__5"
    // InternalPromoDSL.g:646:1: rule__Recette__Group__5 : rule__Recette__Group__5__Impl rule__Recette__Group__6 ;
    public final void rule__Recette__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:650:1: ( rule__Recette__Group__5__Impl rule__Recette__Group__6 )
            // InternalPromoDSL.g:651:2: rule__Recette__Group__5__Impl rule__Recette__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Recette__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__5"


    // $ANTLR start "rule__Recette__Group__5__Impl"
    // InternalPromoDSL.g:658:1: rule__Recette__Group__5__Impl : ( ( rule__Recette__IngredientsAssignment_5 ) ) ;
    public final void rule__Recette__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:662:1: ( ( ( rule__Recette__IngredientsAssignment_5 ) ) )
            // InternalPromoDSL.g:663:1: ( ( rule__Recette__IngredientsAssignment_5 ) )
            {
            // InternalPromoDSL.g:663:1: ( ( rule__Recette__IngredientsAssignment_5 ) )
            // InternalPromoDSL.g:664:2: ( rule__Recette__IngredientsAssignment_5 )
            {
             before(grammarAccess.getRecetteAccess().getIngredientsAssignment_5()); 
            // InternalPromoDSL.g:665:2: ( rule__Recette__IngredientsAssignment_5 )
            // InternalPromoDSL.g:665:3: rule__Recette__IngredientsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Recette__IngredientsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getIngredientsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__5__Impl"


    // $ANTLR start "rule__Recette__Group__6"
    // InternalPromoDSL.g:673:1: rule__Recette__Group__6 : rule__Recette__Group__6__Impl rule__Recette__Group__7 ;
    public final void rule__Recette__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:677:1: ( rule__Recette__Group__6__Impl rule__Recette__Group__7 )
            // InternalPromoDSL.g:678:2: rule__Recette__Group__6__Impl rule__Recette__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Recette__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__6"


    // $ANTLR start "rule__Recette__Group__6__Impl"
    // InternalPromoDSL.g:685:1: rule__Recette__Group__6__Impl : ( ( rule__Recette__Group_6__0 )* ) ;
    public final void rule__Recette__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:689:1: ( ( ( rule__Recette__Group_6__0 )* ) )
            // InternalPromoDSL.g:690:1: ( ( rule__Recette__Group_6__0 )* )
            {
            // InternalPromoDSL.g:690:1: ( ( rule__Recette__Group_6__0 )* )
            // InternalPromoDSL.g:691:2: ( rule__Recette__Group_6__0 )*
            {
             before(grammarAccess.getRecetteAccess().getGroup_6()); 
            // InternalPromoDSL.g:692:2: ( rule__Recette__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPromoDSL.g:692:3: rule__Recette__Group_6__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Recette__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRecetteAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__6__Impl"


    // $ANTLR start "rule__Recette__Group__7"
    // InternalPromoDSL.g:700:1: rule__Recette__Group__7 : rule__Recette__Group__7__Impl rule__Recette__Group__8 ;
    public final void rule__Recette__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:704:1: ( rule__Recette__Group__7__Impl rule__Recette__Group__8 )
            // InternalPromoDSL.g:705:2: rule__Recette__Group__7__Impl rule__Recette__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__7"


    // $ANTLR start "rule__Recette__Group__7__Impl"
    // InternalPromoDSL.g:712:1: rule__Recette__Group__7__Impl : ( 'instruction' ) ;
    public final void rule__Recette__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:716:1: ( ( 'instruction' ) )
            // InternalPromoDSL.g:717:1: ( 'instruction' )
            {
            // InternalPromoDSL.g:717:1: ( 'instruction' )
            // InternalPromoDSL.g:718:2: 'instruction'
            {
             before(grammarAccess.getRecetteAccess().getInstructionKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getInstructionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__7__Impl"


    // $ANTLR start "rule__Recette__Group__8"
    // InternalPromoDSL.g:727:1: rule__Recette__Group__8 : rule__Recette__Group__8__Impl rule__Recette__Group__9 ;
    public final void rule__Recette__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:731:1: ( rule__Recette__Group__8__Impl rule__Recette__Group__9 )
            // InternalPromoDSL.g:732:2: rule__Recette__Group__8__Impl rule__Recette__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Recette__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__8"


    // $ANTLR start "rule__Recette__Group__8__Impl"
    // InternalPromoDSL.g:739:1: rule__Recette__Group__8__Impl : ( ( rule__Recette__InstructionsAssignment_8 ) ) ;
    public final void rule__Recette__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:743:1: ( ( ( rule__Recette__InstructionsAssignment_8 ) ) )
            // InternalPromoDSL.g:744:1: ( ( rule__Recette__InstructionsAssignment_8 ) )
            {
            // InternalPromoDSL.g:744:1: ( ( rule__Recette__InstructionsAssignment_8 ) )
            // InternalPromoDSL.g:745:2: ( rule__Recette__InstructionsAssignment_8 )
            {
             before(grammarAccess.getRecetteAccess().getInstructionsAssignment_8()); 
            // InternalPromoDSL.g:746:2: ( rule__Recette__InstructionsAssignment_8 )
            // InternalPromoDSL.g:746:3: rule__Recette__InstructionsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Recette__InstructionsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getInstructionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__8__Impl"


    // $ANTLR start "rule__Recette__Group__9"
    // InternalPromoDSL.g:754:1: rule__Recette__Group__9 : rule__Recette__Group__9__Impl rule__Recette__Group__10 ;
    public final void rule__Recette__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:758:1: ( rule__Recette__Group__9__Impl rule__Recette__Group__10 )
            // InternalPromoDSL.g:759:2: rule__Recette__Group__9__Impl rule__Recette__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Recette__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__9"


    // $ANTLR start "rule__Recette__Group__9__Impl"
    // InternalPromoDSL.g:766:1: rule__Recette__Group__9__Impl : ( ( rule__Recette__Group_9__0 )* ) ;
    public final void rule__Recette__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:770:1: ( ( ( rule__Recette__Group_9__0 )* ) )
            // InternalPromoDSL.g:771:1: ( ( rule__Recette__Group_9__0 )* )
            {
            // InternalPromoDSL.g:771:1: ( ( rule__Recette__Group_9__0 )* )
            // InternalPromoDSL.g:772:2: ( rule__Recette__Group_9__0 )*
            {
             before(grammarAccess.getRecetteAccess().getGroup_9()); 
            // InternalPromoDSL.g:773:2: ( rule__Recette__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPromoDSL.g:773:3: rule__Recette__Group_9__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Recette__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRecetteAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__9__Impl"


    // $ANTLR start "rule__Recette__Group__10"
    // InternalPromoDSL.g:781:1: rule__Recette__Group__10 : rule__Recette__Group__10__Impl rule__Recette__Group__11 ;
    public final void rule__Recette__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:785:1: ( rule__Recette__Group__10__Impl rule__Recette__Group__11 )
            // InternalPromoDSL.g:786:2: rule__Recette__Group__10__Impl rule__Recette__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Recette__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__10"


    // $ANTLR start "rule__Recette__Group__10__Impl"
    // InternalPromoDSL.g:793:1: rule__Recette__Group__10__Impl : ( ( rule__Recette__Group_10__0 )? ) ;
    public final void rule__Recette__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:797:1: ( ( ( rule__Recette__Group_10__0 )? ) )
            // InternalPromoDSL.g:798:1: ( ( rule__Recette__Group_10__0 )? )
            {
            // InternalPromoDSL.g:798:1: ( ( rule__Recette__Group_10__0 )? )
            // InternalPromoDSL.g:799:2: ( rule__Recette__Group_10__0 )?
            {
             before(grammarAccess.getRecetteAccess().getGroup_10()); 
            // InternalPromoDSL.g:800:2: ( rule__Recette__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPromoDSL.g:800:3: rule__Recette__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recette__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecetteAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__10__Impl"


    // $ANTLR start "rule__Recette__Group__11"
    // InternalPromoDSL.g:808:1: rule__Recette__Group__11 : rule__Recette__Group__11__Impl ;
    public final void rule__Recette__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:812:1: ( rule__Recette__Group__11__Impl )
            // InternalPromoDSL.g:813:2: rule__Recette__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recette__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__11"


    // $ANTLR start "rule__Recette__Group__11__Impl"
    // InternalPromoDSL.g:819:1: rule__Recette__Group__11__Impl : ( '/Recette' ) ;
    public final void rule__Recette__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:823:1: ( ( '/Recette' ) )
            // InternalPromoDSL.g:824:1: ( '/Recette' )
            {
            // InternalPromoDSL.g:824:1: ( '/Recette' )
            // InternalPromoDSL.g:825:2: '/Recette'
            {
             before(grammarAccess.getRecetteAccess().getRecetteKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getRecetteKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group__11__Impl"


    // $ANTLR start "rule__Recette__Group_6__0"
    // InternalPromoDSL.g:835:1: rule__Recette__Group_6__0 : rule__Recette__Group_6__0__Impl rule__Recette__Group_6__1 ;
    public final void rule__Recette__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:839:1: ( rule__Recette__Group_6__0__Impl rule__Recette__Group_6__1 )
            // InternalPromoDSL.g:840:2: rule__Recette__Group_6__0__Impl rule__Recette__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_6__0"


    // $ANTLR start "rule__Recette__Group_6__0__Impl"
    // InternalPromoDSL.g:847:1: rule__Recette__Group_6__0__Impl : ( ';' ) ;
    public final void rule__Recette__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:851:1: ( ( ';' ) )
            // InternalPromoDSL.g:852:1: ( ';' )
            {
            // InternalPromoDSL.g:852:1: ( ';' )
            // InternalPromoDSL.g:853:2: ';'
            {
             before(grammarAccess.getRecetteAccess().getSemicolonKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getSemicolonKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_6__0__Impl"


    // $ANTLR start "rule__Recette__Group_6__1"
    // InternalPromoDSL.g:862:1: rule__Recette__Group_6__1 : rule__Recette__Group_6__1__Impl ;
    public final void rule__Recette__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:866:1: ( rule__Recette__Group_6__1__Impl )
            // InternalPromoDSL.g:867:2: rule__Recette__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recette__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_6__1"


    // $ANTLR start "rule__Recette__Group_6__1__Impl"
    // InternalPromoDSL.g:873:1: rule__Recette__Group_6__1__Impl : ( ( rule__Recette__IngredientsAssignment_6_1 ) ) ;
    public final void rule__Recette__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:877:1: ( ( ( rule__Recette__IngredientsAssignment_6_1 ) ) )
            // InternalPromoDSL.g:878:1: ( ( rule__Recette__IngredientsAssignment_6_1 ) )
            {
            // InternalPromoDSL.g:878:1: ( ( rule__Recette__IngredientsAssignment_6_1 ) )
            // InternalPromoDSL.g:879:2: ( rule__Recette__IngredientsAssignment_6_1 )
            {
             before(grammarAccess.getRecetteAccess().getIngredientsAssignment_6_1()); 
            // InternalPromoDSL.g:880:2: ( rule__Recette__IngredientsAssignment_6_1 )
            // InternalPromoDSL.g:880:3: rule__Recette__IngredientsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Recette__IngredientsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getIngredientsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_6__1__Impl"


    // $ANTLR start "rule__Recette__Group_9__0"
    // InternalPromoDSL.g:889:1: rule__Recette__Group_9__0 : rule__Recette__Group_9__0__Impl rule__Recette__Group_9__1 ;
    public final void rule__Recette__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:893:1: ( rule__Recette__Group_9__0__Impl rule__Recette__Group_9__1 )
            // InternalPromoDSL.g:894:2: rule__Recette__Group_9__0__Impl rule__Recette__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_9__0"


    // $ANTLR start "rule__Recette__Group_9__0__Impl"
    // InternalPromoDSL.g:901:1: rule__Recette__Group_9__0__Impl : ( ';' ) ;
    public final void rule__Recette__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:905:1: ( ( ';' ) )
            // InternalPromoDSL.g:906:1: ( ';' )
            {
            // InternalPromoDSL.g:906:1: ( ';' )
            // InternalPromoDSL.g:907:2: ';'
            {
             before(grammarAccess.getRecetteAccess().getSemicolonKeyword_9_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getSemicolonKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_9__0__Impl"


    // $ANTLR start "rule__Recette__Group_9__1"
    // InternalPromoDSL.g:916:1: rule__Recette__Group_9__1 : rule__Recette__Group_9__1__Impl ;
    public final void rule__Recette__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:920:1: ( rule__Recette__Group_9__1__Impl )
            // InternalPromoDSL.g:921:2: rule__Recette__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recette__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_9__1"


    // $ANTLR start "rule__Recette__Group_9__1__Impl"
    // InternalPromoDSL.g:927:1: rule__Recette__Group_9__1__Impl : ( ( rule__Recette__InstructionsAssignment_9_1 ) ) ;
    public final void rule__Recette__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:931:1: ( ( ( rule__Recette__InstructionsAssignment_9_1 ) ) )
            // InternalPromoDSL.g:932:1: ( ( rule__Recette__InstructionsAssignment_9_1 ) )
            {
            // InternalPromoDSL.g:932:1: ( ( rule__Recette__InstructionsAssignment_9_1 ) )
            // InternalPromoDSL.g:933:2: ( rule__Recette__InstructionsAssignment_9_1 )
            {
             before(grammarAccess.getRecetteAccess().getInstructionsAssignment_9_1()); 
            // InternalPromoDSL.g:934:2: ( rule__Recette__InstructionsAssignment_9_1 )
            // InternalPromoDSL.g:934:3: rule__Recette__InstructionsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Recette__InstructionsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getInstructionsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_9__1__Impl"


    // $ANTLR start "rule__Recette__Group_10__0"
    // InternalPromoDSL.g:943:1: rule__Recette__Group_10__0 : rule__Recette__Group_10__0__Impl rule__Recette__Group_10__1 ;
    public final void rule__Recette__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:947:1: ( rule__Recette__Group_10__0__Impl rule__Recette__Group_10__1 )
            // InternalPromoDSL.g:948:2: rule__Recette__Group_10__0__Impl rule__Recette__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10__0"


    // $ANTLR start "rule__Recette__Group_10__0__Impl"
    // InternalPromoDSL.g:955:1: rule__Recette__Group_10__0__Impl : ( 'alternatives' ) ;
    public final void rule__Recette__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:959:1: ( ( 'alternatives' ) )
            // InternalPromoDSL.g:960:1: ( 'alternatives' )
            {
            // InternalPromoDSL.g:960:1: ( 'alternatives' )
            // InternalPromoDSL.g:961:2: 'alternatives'
            {
             before(grammarAccess.getRecetteAccess().getAlternativesKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getAlternativesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10__0__Impl"


    // $ANTLR start "rule__Recette__Group_10__1"
    // InternalPromoDSL.g:970:1: rule__Recette__Group_10__1 : rule__Recette__Group_10__1__Impl rule__Recette__Group_10__2 ;
    public final void rule__Recette__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:974:1: ( rule__Recette__Group_10__1__Impl rule__Recette__Group_10__2 )
            // InternalPromoDSL.g:975:2: rule__Recette__Group_10__1__Impl rule__Recette__Group_10__2
            {
            pushFollow(FOLLOW_17);
            rule__Recette__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10__1"


    // $ANTLR start "rule__Recette__Group_10__1__Impl"
    // InternalPromoDSL.g:982:1: rule__Recette__Group_10__1__Impl : ( ( rule__Recette__AlternativesAssignment_10_1 ) ) ;
    public final void rule__Recette__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:986:1: ( ( ( rule__Recette__AlternativesAssignment_10_1 ) ) )
            // InternalPromoDSL.g:987:1: ( ( rule__Recette__AlternativesAssignment_10_1 ) )
            {
            // InternalPromoDSL.g:987:1: ( ( rule__Recette__AlternativesAssignment_10_1 ) )
            // InternalPromoDSL.g:988:2: ( rule__Recette__AlternativesAssignment_10_1 )
            {
             before(grammarAccess.getRecetteAccess().getAlternativesAssignment_10_1()); 
            // InternalPromoDSL.g:989:2: ( rule__Recette__AlternativesAssignment_10_1 )
            // InternalPromoDSL.g:989:3: rule__Recette__AlternativesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Recette__AlternativesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getAlternativesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10__1__Impl"


    // $ANTLR start "rule__Recette__Group_10__2"
    // InternalPromoDSL.g:997:1: rule__Recette__Group_10__2 : rule__Recette__Group_10__2__Impl ;
    public final void rule__Recette__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1001:1: ( rule__Recette__Group_10__2__Impl )
            // InternalPromoDSL.g:1002:2: rule__Recette__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recette__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10__2"


    // $ANTLR start "rule__Recette__Group_10__2__Impl"
    // InternalPromoDSL.g:1008:1: rule__Recette__Group_10__2__Impl : ( ( rule__Recette__Group_10_2__0 )* ) ;
    public final void rule__Recette__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1012:1: ( ( ( rule__Recette__Group_10_2__0 )* ) )
            // InternalPromoDSL.g:1013:1: ( ( rule__Recette__Group_10_2__0 )* )
            {
            // InternalPromoDSL.g:1013:1: ( ( rule__Recette__Group_10_2__0 )* )
            // InternalPromoDSL.g:1014:2: ( rule__Recette__Group_10_2__0 )*
            {
             before(grammarAccess.getRecetteAccess().getGroup_10_2()); 
            // InternalPromoDSL.g:1015:2: ( rule__Recette__Group_10_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPromoDSL.g:1015:3: rule__Recette__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Recette__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRecetteAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10__2__Impl"


    // $ANTLR start "rule__Recette__Group_10_2__0"
    // InternalPromoDSL.g:1024:1: rule__Recette__Group_10_2__0 : rule__Recette__Group_10_2__0__Impl rule__Recette__Group_10_2__1 ;
    public final void rule__Recette__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1028:1: ( rule__Recette__Group_10_2__0__Impl rule__Recette__Group_10_2__1 )
            // InternalPromoDSL.g:1029:2: rule__Recette__Group_10_2__0__Impl rule__Recette__Group_10_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Recette__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recette__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10_2__0"


    // $ANTLR start "rule__Recette__Group_10_2__0__Impl"
    // InternalPromoDSL.g:1036:1: rule__Recette__Group_10_2__0__Impl : ( ';' ) ;
    public final void rule__Recette__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1040:1: ( ( ';' ) )
            // InternalPromoDSL.g:1041:1: ( ';' )
            {
            // InternalPromoDSL.g:1041:1: ( ';' )
            // InternalPromoDSL.g:1042:2: ';'
            {
             before(grammarAccess.getRecetteAccess().getSemicolonKeyword_10_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getSemicolonKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10_2__0__Impl"


    // $ANTLR start "rule__Recette__Group_10_2__1"
    // InternalPromoDSL.g:1051:1: rule__Recette__Group_10_2__1 : rule__Recette__Group_10_2__1__Impl ;
    public final void rule__Recette__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1055:1: ( rule__Recette__Group_10_2__1__Impl )
            // InternalPromoDSL.g:1056:2: rule__Recette__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recette__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10_2__1"


    // $ANTLR start "rule__Recette__Group_10_2__1__Impl"
    // InternalPromoDSL.g:1062:1: rule__Recette__Group_10_2__1__Impl : ( ( rule__Recette__AlternativesAssignment_10_2_1 ) ) ;
    public final void rule__Recette__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1066:1: ( ( ( rule__Recette__AlternativesAssignment_10_2_1 ) ) )
            // InternalPromoDSL.g:1067:1: ( ( rule__Recette__AlternativesAssignment_10_2_1 ) )
            {
            // InternalPromoDSL.g:1067:1: ( ( rule__Recette__AlternativesAssignment_10_2_1 ) )
            // InternalPromoDSL.g:1068:2: ( rule__Recette__AlternativesAssignment_10_2_1 )
            {
             before(grammarAccess.getRecetteAccess().getAlternativesAssignment_10_2_1()); 
            // InternalPromoDSL.g:1069:2: ( rule__Recette__AlternativesAssignment_10_2_1 )
            // InternalPromoDSL.g:1069:3: rule__Recette__AlternativesAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Recette__AlternativesAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecetteAccess().getAlternativesAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__Group_10_2__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalPromoDSL.g:1078:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1082:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalPromoDSL.g:1083:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // InternalPromoDSL.g:1090:1: rule__Ingredient__Group__0__Impl : ( ( rule__Ingredient__NomDuIngAssignment_0 ) ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1094:1: ( ( ( rule__Ingredient__NomDuIngAssignment_0 ) ) )
            // InternalPromoDSL.g:1095:1: ( ( rule__Ingredient__NomDuIngAssignment_0 ) )
            {
            // InternalPromoDSL.g:1095:1: ( ( rule__Ingredient__NomDuIngAssignment_0 ) )
            // InternalPromoDSL.g:1096:2: ( rule__Ingredient__NomDuIngAssignment_0 )
            {
             before(grammarAccess.getIngredientAccess().getNomDuIngAssignment_0()); 
            // InternalPromoDSL.g:1097:2: ( rule__Ingredient__NomDuIngAssignment_0 )
            // InternalPromoDSL.g:1097:3: rule__Ingredient__NomDuIngAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NomDuIngAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNomDuIngAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // InternalPromoDSL.g:1105:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1109:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalPromoDSL.g:1110:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // InternalPromoDSL.g:1117:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__NumAssignment_1 ) ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1121:1: ( ( ( rule__Ingredient__NumAssignment_1 ) ) )
            // InternalPromoDSL.g:1122:1: ( ( rule__Ingredient__NumAssignment_1 ) )
            {
            // InternalPromoDSL.g:1122:1: ( ( rule__Ingredient__NumAssignment_1 ) )
            // InternalPromoDSL.g:1123:2: ( rule__Ingredient__NumAssignment_1 )
            {
             before(grammarAccess.getIngredientAccess().getNumAssignment_1()); 
            // InternalPromoDSL.g:1124:2: ( rule__Ingredient__NumAssignment_1 )
            // InternalPromoDSL.g:1124:3: rule__Ingredient__NumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__2"
    // InternalPromoDSL.g:1132:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1136:1: ( rule__Ingredient__Group__2__Impl )
            // InternalPromoDSL.g:1137:2: rule__Ingredient__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2"


    // $ANTLR start "rule__Ingredient__Group__2__Impl"
    // InternalPromoDSL.g:1143:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__UniteAssignment_2 ) ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1147:1: ( ( ( rule__Ingredient__UniteAssignment_2 ) ) )
            // InternalPromoDSL.g:1148:1: ( ( rule__Ingredient__UniteAssignment_2 ) )
            {
            // InternalPromoDSL.g:1148:1: ( ( rule__Ingredient__UniteAssignment_2 ) )
            // InternalPromoDSL.g:1149:2: ( rule__Ingredient__UniteAssignment_2 )
            {
             before(grammarAccess.getIngredientAccess().getUniteAssignment_2()); 
            // InternalPromoDSL.g:1150:2: ( rule__Ingredient__UniteAssignment_2 )
            // InternalPromoDSL.g:1150:3: rule__Ingredient__UniteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__UniteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getUniteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2__Impl"


    // $ANTLR start "rule__Modele__LivreAssignment"
    // InternalPromoDSL.g:1159:1: rule__Modele__LivreAssignment : ( ruleLivre ) ;
    public final void rule__Modele__LivreAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1163:1: ( ( ruleLivre ) )
            // InternalPromoDSL.g:1164:2: ( ruleLivre )
            {
            // InternalPromoDSL.g:1164:2: ( ruleLivre )
            // InternalPromoDSL.g:1165:3: ruleLivre
            {
             before(grammarAccess.getModeleAccess().getLivreLivreParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLivre();

            state._fsp--;

             after(grammarAccess.getModeleAccess().getLivreLivreParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modele__LivreAssignment"


    // $ANTLR start "rule__Livre__NomDuLivreAssignment_1"
    // InternalPromoDSL.g:1174:1: rule__Livre__NomDuLivreAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Livre__NomDuLivreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1178:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1179:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1179:2: ( RULE_STRING )
            // InternalPromoDSL.g:1180:3: RULE_STRING
            {
             before(grammarAccess.getLivreAccess().getNomDuLivreSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLivreAccess().getNomDuLivreSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__NomDuLivreAssignment_1"


    // $ANTLR start "rule__Livre__NomDuLauteurAssignment_3"
    // InternalPromoDSL.g:1189:1: rule__Livre__NomDuLauteurAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Livre__NomDuLauteurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1193:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1194:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1194:2: ( RULE_STRING )
            // InternalPromoDSL.g:1195:3: RULE_STRING
            {
             before(grammarAccess.getLivreAccess().getNomDuLauteurSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLivreAccess().getNomDuLauteurSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__NomDuLauteurAssignment_3"


    // $ANTLR start "rule__Livre__ChapitreAssignment_4"
    // InternalPromoDSL.g:1204:1: rule__Livre__ChapitreAssignment_4 : ( ruleChapitre ) ;
    public final void rule__Livre__ChapitreAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1208:1: ( ( ruleChapitre ) )
            // InternalPromoDSL.g:1209:2: ( ruleChapitre )
            {
            // InternalPromoDSL.g:1209:2: ( ruleChapitre )
            // InternalPromoDSL.g:1210:3: ruleChapitre
            {
             before(grammarAccess.getLivreAccess().getChapitreChapitreParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChapitre();

            state._fsp--;

             after(grammarAccess.getLivreAccess().getChapitreChapitreParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Livre__ChapitreAssignment_4"


    // $ANTLR start "rule__Chapitre__NumDuChapitreAssignment_1"
    // InternalPromoDSL.g:1219:1: rule__Chapitre__NumDuChapitreAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Chapitre__NumDuChapitreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1223:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1224:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1224:2: ( RULE_STRING )
            // InternalPromoDSL.g:1225:3: RULE_STRING
            {
             before(grammarAccess.getChapitreAccess().getNumDuChapitreSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChapitreAccess().getNumDuChapitreSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__NumDuChapitreAssignment_1"


    // $ANTLR start "rule__Chapitre__RecetteAssignment_2"
    // InternalPromoDSL.g:1234:1: rule__Chapitre__RecetteAssignment_2 : ( ruleRecette ) ;
    public final void rule__Chapitre__RecetteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1238:1: ( ( ruleRecette ) )
            // InternalPromoDSL.g:1239:2: ( ruleRecette )
            {
            // InternalPromoDSL.g:1239:2: ( ruleRecette )
            // InternalPromoDSL.g:1240:3: ruleRecette
            {
             before(grammarAccess.getChapitreAccess().getRecetteRecetteParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRecette();

            state._fsp--;

             after(grammarAccess.getChapitreAccess().getRecetteRecetteParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chapitre__RecetteAssignment_2"


    // $ANTLR start "rule__Recette__NameAssignment_1"
    // InternalPromoDSL.g:1249:1: rule__Recette__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Recette__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1253:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1254:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1254:2: ( RULE_STRING )
            // InternalPromoDSL.g:1255:3: RULE_STRING
            {
             before(grammarAccess.getRecetteAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__NameAssignment_1"


    // $ANTLR start "rule__Recette__NumPhotoAssignment_3"
    // InternalPromoDSL.g:1264:1: rule__Recette__NumPhotoAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Recette__NumPhotoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1268:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1269:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1269:2: ( RULE_STRING )
            // InternalPromoDSL.g:1270:3: RULE_STRING
            {
             before(grammarAccess.getRecetteAccess().getNumPhotoSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRecetteAccess().getNumPhotoSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__NumPhotoAssignment_3"


    // $ANTLR start "rule__Recette__IngredientsAssignment_5"
    // InternalPromoDSL.g:1279:1: rule__Recette__IngredientsAssignment_5 : ( ruleIngredient ) ;
    public final void rule__Recette__IngredientsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1283:1: ( ( ruleIngredient ) )
            // InternalPromoDSL.g:1284:2: ( ruleIngredient )
            {
            // InternalPromoDSL.g:1284:2: ( ruleIngredient )
            // InternalPromoDSL.g:1285:3: ruleIngredient
            {
             before(grammarAccess.getRecetteAccess().getIngredientsIngredientParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecetteAccess().getIngredientsIngredientParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__IngredientsAssignment_5"


    // $ANTLR start "rule__Recette__IngredientsAssignment_6_1"
    // InternalPromoDSL.g:1294:1: rule__Recette__IngredientsAssignment_6_1 : ( ruleIngredient ) ;
    public final void rule__Recette__IngredientsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1298:1: ( ( ruleIngredient ) )
            // InternalPromoDSL.g:1299:2: ( ruleIngredient )
            {
            // InternalPromoDSL.g:1299:2: ( ruleIngredient )
            // InternalPromoDSL.g:1300:3: ruleIngredient
            {
             before(grammarAccess.getRecetteAccess().getIngredientsIngredientParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecetteAccess().getIngredientsIngredientParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__IngredientsAssignment_6_1"


    // $ANTLR start "rule__Recette__InstructionsAssignment_8"
    // InternalPromoDSL.g:1309:1: rule__Recette__InstructionsAssignment_8 : ( ruleInstruction ) ;
    public final void rule__Recette__InstructionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1313:1: ( ( ruleInstruction ) )
            // InternalPromoDSL.g:1314:2: ( ruleInstruction )
            {
            // InternalPromoDSL.g:1314:2: ( ruleInstruction )
            // InternalPromoDSL.g:1315:3: ruleInstruction
            {
             before(grammarAccess.getRecetteAccess().getInstructionsInstructionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getRecetteAccess().getInstructionsInstructionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__InstructionsAssignment_8"


    // $ANTLR start "rule__Recette__InstructionsAssignment_9_1"
    // InternalPromoDSL.g:1324:1: rule__Recette__InstructionsAssignment_9_1 : ( ruleInstruction ) ;
    public final void rule__Recette__InstructionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1328:1: ( ( ruleInstruction ) )
            // InternalPromoDSL.g:1329:2: ( ruleInstruction )
            {
            // InternalPromoDSL.g:1329:2: ( ruleInstruction )
            // InternalPromoDSL.g:1330:3: ruleInstruction
            {
             before(grammarAccess.getRecetteAccess().getInstructionsInstructionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getRecetteAccess().getInstructionsInstructionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__InstructionsAssignment_9_1"


    // $ANTLR start "rule__Recette__AlternativesAssignment_10_1"
    // InternalPromoDSL.g:1339:1: rule__Recette__AlternativesAssignment_10_1 : ( ruleAlternatives ) ;
    public final void rule__Recette__AlternativesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1343:1: ( ( ruleAlternatives ) )
            // InternalPromoDSL.g:1344:2: ( ruleAlternatives )
            {
            // InternalPromoDSL.g:1344:2: ( ruleAlternatives )
            // InternalPromoDSL.g:1345:3: ruleAlternatives
            {
             before(grammarAccess.getRecetteAccess().getAlternativesAlternativesParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getRecetteAccess().getAlternativesAlternativesParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__AlternativesAssignment_10_1"


    // $ANTLR start "rule__Recette__AlternativesAssignment_10_2_1"
    // InternalPromoDSL.g:1354:1: rule__Recette__AlternativesAssignment_10_2_1 : ( ruleAlternatives ) ;
    public final void rule__Recette__AlternativesAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1358:1: ( ( ruleAlternatives ) )
            // InternalPromoDSL.g:1359:2: ( ruleAlternatives )
            {
            // InternalPromoDSL.g:1359:2: ( ruleAlternatives )
            // InternalPromoDSL.g:1360:3: ruleAlternatives
            {
             before(grammarAccess.getRecetteAccess().getAlternativesAlternativesParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getRecetteAccess().getAlternativesAlternativesParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recette__AlternativesAssignment_10_2_1"


    // $ANTLR start "rule__Alternatives__AltNumAssignment"
    // InternalPromoDSL.g:1369:1: rule__Alternatives__AltNumAssignment : ( RULE_STRING ) ;
    public final void rule__Alternatives__AltNumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1373:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1374:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1374:2: ( RULE_STRING )
            // InternalPromoDSL.g:1375:3: RULE_STRING
            {
             before(grammarAccess.getAlternativesAccess().getAltNumSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getAltNumSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__AltNumAssignment"


    // $ANTLR start "rule__Ingredient__NomDuIngAssignment_0"
    // InternalPromoDSL.g:1384:1: rule__Ingredient__NomDuIngAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Ingredient__NomDuIngAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1388:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1389:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1389:2: ( RULE_STRING )
            // InternalPromoDSL.g:1390:3: RULE_STRING
            {
             before(grammarAccess.getIngredientAccess().getNomDuIngSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNomDuIngSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NomDuIngAssignment_0"


    // $ANTLR start "rule__Ingredient__NumAssignment_1"
    // InternalPromoDSL.g:1399:1: rule__Ingredient__NumAssignment_1 : ( RULE_INT ) ;
    public final void rule__Ingredient__NumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1403:1: ( ( RULE_INT ) )
            // InternalPromoDSL.g:1404:2: ( RULE_INT )
            {
            // InternalPromoDSL.g:1404:2: ( RULE_INT )
            // InternalPromoDSL.g:1405:3: RULE_INT
            {
             before(grammarAccess.getIngredientAccess().getNumINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNumINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NumAssignment_1"


    // $ANTLR start "rule__Ingredient__UniteAssignment_2"
    // InternalPromoDSL.g:1414:1: rule__Ingredient__UniteAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ingredient__UniteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1418:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1419:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1419:2: ( RULE_STRING )
            // InternalPromoDSL.g:1420:3: RULE_STRING
            {
             before(grammarAccess.getIngredientAccess().getUniteSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getUniteSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__UniteAssignment_2"


    // $ANTLR start "rule__Instruction__NumDuInstructionAssignment"
    // InternalPromoDSL.g:1429:1: rule__Instruction__NumDuInstructionAssignment : ( RULE_STRING ) ;
    public final void rule__Instruction__NumDuInstructionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPromoDSL.g:1433:1: ( ( RULE_STRING ) )
            // InternalPromoDSL.g:1434:2: ( RULE_STRING )
            {
            // InternalPromoDSL.g:1434:2: ( RULE_STRING )
            // InternalPromoDSL.g:1435:3: RULE_STRING
            {
             before(grammarAccess.getInstructionAccess().getNumDuInstructionSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstructionAccess().getNumDuInstructionSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__NumDuInstructionAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});

}