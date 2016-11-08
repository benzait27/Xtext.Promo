package fr.pari10.miage.promo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.pari10.miage.promo.services.PromoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPromoDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Livre'", "'par'", "'/Livre'", "'Chapitre'", "'/Chapitre'", "'Recette'", "'photo'", "'ingredients'", "';'", "'instruction'", "'alternatives'", "'/Recette'"
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

        public InternalPromoDSLParser(TokenStream input, PromoDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Modele";
       	}

       	@Override
       	protected PromoDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModele"
    // InternalPromoDSL.g:64:1: entryRuleModele returns [EObject current=null] : iv_ruleModele= ruleModele EOF ;
    public final EObject entryRuleModele() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModele = null;


        try {
            // InternalPromoDSL.g:64:47: (iv_ruleModele= ruleModele EOF )
            // InternalPromoDSL.g:65:2: iv_ruleModele= ruleModele EOF
            {
             newCompositeNode(grammarAccess.getModeleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModele=ruleModele();

            state._fsp--;

             current =iv_ruleModele; 
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
    // $ANTLR end "entryRuleModele"


    // $ANTLR start "ruleModele"
    // InternalPromoDSL.g:71:1: ruleModele returns [EObject current=null] : ( (lv_livre_0_0= ruleLivre ) )* ;
    public final EObject ruleModele() throws RecognitionException {
        EObject current = null;

        EObject lv_livre_0_0 = null;



        	enterRule();

        try {
            // InternalPromoDSL.g:77:2: ( ( (lv_livre_0_0= ruleLivre ) )* )
            // InternalPromoDSL.g:78:2: ( (lv_livre_0_0= ruleLivre ) )*
            {
            // InternalPromoDSL.g:78:2: ( (lv_livre_0_0= ruleLivre ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPromoDSL.g:79:3: (lv_livre_0_0= ruleLivre )
            	    {
            	    // InternalPromoDSL.g:79:3: (lv_livre_0_0= ruleLivre )
            	    // InternalPromoDSL.g:80:4: lv_livre_0_0= ruleLivre
            	    {

            	    				newCompositeNode(grammarAccess.getModeleAccess().getLivreLivreParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_livre_0_0=ruleLivre();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModeleRule());
            	    				}
            	    				add(
            	    					current,
            	    					"livre",
            	    					lv_livre_0_0,
            	    					"fr.pari10.miage.promo.PromoDSL.Livre");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModele"


    // $ANTLR start "entryRuleLivre"
    // InternalPromoDSL.g:100:1: entryRuleLivre returns [EObject current=null] : iv_ruleLivre= ruleLivre EOF ;
    public final EObject entryRuleLivre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLivre = null;


        try {
            // InternalPromoDSL.g:100:46: (iv_ruleLivre= ruleLivre EOF )
            // InternalPromoDSL.g:101:2: iv_ruleLivre= ruleLivre EOF
            {
             newCompositeNode(grammarAccess.getLivreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLivre=ruleLivre();

            state._fsp--;

             current =iv_ruleLivre; 
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
    // $ANTLR end "entryRuleLivre"


    // $ANTLR start "ruleLivre"
    // InternalPromoDSL.g:107:1: ruleLivre returns [EObject current=null] : (otherlv_0= 'Livre' ( (lv_nomDuLivre_1_0= RULE_STRING ) ) otherlv_2= 'par' ( (lv_nomDuLauteur_3_0= RULE_STRING ) ) ( (lv_chapitre_4_0= ruleChapitre ) )+ otherlv_5= '/Livre' ) ;
    public final EObject ruleLivre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nomDuLivre_1_0=null;
        Token otherlv_2=null;
        Token lv_nomDuLauteur_3_0=null;
        Token otherlv_5=null;
        EObject lv_chapitre_4_0 = null;



        	enterRule();

        try {
            // InternalPromoDSL.g:113:2: ( (otherlv_0= 'Livre' ( (lv_nomDuLivre_1_0= RULE_STRING ) ) otherlv_2= 'par' ( (lv_nomDuLauteur_3_0= RULE_STRING ) ) ( (lv_chapitre_4_0= ruleChapitre ) )+ otherlv_5= '/Livre' ) )
            // InternalPromoDSL.g:114:2: (otherlv_0= 'Livre' ( (lv_nomDuLivre_1_0= RULE_STRING ) ) otherlv_2= 'par' ( (lv_nomDuLauteur_3_0= RULE_STRING ) ) ( (lv_chapitre_4_0= ruleChapitre ) )+ otherlv_5= '/Livre' )
            {
            // InternalPromoDSL.g:114:2: (otherlv_0= 'Livre' ( (lv_nomDuLivre_1_0= RULE_STRING ) ) otherlv_2= 'par' ( (lv_nomDuLauteur_3_0= RULE_STRING ) ) ( (lv_chapitre_4_0= ruleChapitre ) )+ otherlv_5= '/Livre' )
            // InternalPromoDSL.g:115:3: otherlv_0= 'Livre' ( (lv_nomDuLivre_1_0= RULE_STRING ) ) otherlv_2= 'par' ( (lv_nomDuLauteur_3_0= RULE_STRING ) ) ( (lv_chapitre_4_0= ruleChapitre ) )+ otherlv_5= '/Livre'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLivreAccess().getLivreKeyword_0());
            		
            // InternalPromoDSL.g:119:3: ( (lv_nomDuLivre_1_0= RULE_STRING ) )
            // InternalPromoDSL.g:120:4: (lv_nomDuLivre_1_0= RULE_STRING )
            {
            // InternalPromoDSL.g:120:4: (lv_nomDuLivre_1_0= RULE_STRING )
            // InternalPromoDSL.g:121:5: lv_nomDuLivre_1_0= RULE_STRING
            {
            lv_nomDuLivre_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_nomDuLivre_1_0, grammarAccess.getLivreAccess().getNomDuLivreSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLivreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nomDuLivre",
            						lv_nomDuLivre_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLivreAccess().getParKeyword_2());
            		
            // InternalPromoDSL.g:141:3: ( (lv_nomDuLauteur_3_0= RULE_STRING ) )
            // InternalPromoDSL.g:142:4: (lv_nomDuLauteur_3_0= RULE_STRING )
            {
            // InternalPromoDSL.g:142:4: (lv_nomDuLauteur_3_0= RULE_STRING )
            // InternalPromoDSL.g:143:5: lv_nomDuLauteur_3_0= RULE_STRING
            {
            lv_nomDuLauteur_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_nomDuLauteur_3_0, grammarAccess.getLivreAccess().getNomDuLauteurSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLivreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nomDuLauteur",
            						lv_nomDuLauteur_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPromoDSL.g:159:3: ( (lv_chapitre_4_0= ruleChapitre ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPromoDSL.g:160:4: (lv_chapitre_4_0= ruleChapitre )
            	    {
            	    // InternalPromoDSL.g:160:4: (lv_chapitre_4_0= ruleChapitre )
            	    // InternalPromoDSL.g:161:5: lv_chapitre_4_0= ruleChapitre
            	    {

            	    					newCompositeNode(grammarAccess.getLivreAccess().getChapitreChapitreParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_chapitre_4_0=ruleChapitre();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLivreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chapitre",
            	    						lv_chapitre_4_0,
            	    						"fr.pari10.miage.promo.PromoDSL.Chapitre");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLivreAccess().getLivreKeyword_5());
            		

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
    // $ANTLR end "ruleLivre"


    // $ANTLR start "entryRuleChapitre"
    // InternalPromoDSL.g:186:1: entryRuleChapitre returns [EObject current=null] : iv_ruleChapitre= ruleChapitre EOF ;
    public final EObject entryRuleChapitre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapitre = null;


        try {
            // InternalPromoDSL.g:186:49: (iv_ruleChapitre= ruleChapitre EOF )
            // InternalPromoDSL.g:187:2: iv_ruleChapitre= ruleChapitre EOF
            {
             newCompositeNode(grammarAccess.getChapitreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChapitre=ruleChapitre();

            state._fsp--;

             current =iv_ruleChapitre; 
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
    // $ANTLR end "entryRuleChapitre"


    // $ANTLR start "ruleChapitre"
    // InternalPromoDSL.g:193:1: ruleChapitre returns [EObject current=null] : (otherlv_0= 'Chapitre' ( (lv_numDuChapitre_1_0= RULE_STRING ) ) ( (lv_recette_2_0= ruleRecette ) )+ otherlv_3= '/Chapitre' ) ;
    public final EObject ruleChapitre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_numDuChapitre_1_0=null;
        Token otherlv_3=null;
        EObject lv_recette_2_0 = null;



        	enterRule();

        try {
            // InternalPromoDSL.g:199:2: ( (otherlv_0= 'Chapitre' ( (lv_numDuChapitre_1_0= RULE_STRING ) ) ( (lv_recette_2_0= ruleRecette ) )+ otherlv_3= '/Chapitre' ) )
            // InternalPromoDSL.g:200:2: (otherlv_0= 'Chapitre' ( (lv_numDuChapitre_1_0= RULE_STRING ) ) ( (lv_recette_2_0= ruleRecette ) )+ otherlv_3= '/Chapitre' )
            {
            // InternalPromoDSL.g:200:2: (otherlv_0= 'Chapitre' ( (lv_numDuChapitre_1_0= RULE_STRING ) ) ( (lv_recette_2_0= ruleRecette ) )+ otherlv_3= '/Chapitre' )
            // InternalPromoDSL.g:201:3: otherlv_0= 'Chapitre' ( (lv_numDuChapitre_1_0= RULE_STRING ) ) ( (lv_recette_2_0= ruleRecette ) )+ otherlv_3= '/Chapitre'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getChapitreAccess().getChapitreKeyword_0());
            		
            // InternalPromoDSL.g:205:3: ( (lv_numDuChapitre_1_0= RULE_STRING ) )
            // InternalPromoDSL.g:206:4: (lv_numDuChapitre_1_0= RULE_STRING )
            {
            // InternalPromoDSL.g:206:4: (lv_numDuChapitre_1_0= RULE_STRING )
            // InternalPromoDSL.g:207:5: lv_numDuChapitre_1_0= RULE_STRING
            {
            lv_numDuChapitre_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_numDuChapitre_1_0, grammarAccess.getChapitreAccess().getNumDuChapitreSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChapitreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numDuChapitre",
            						lv_numDuChapitre_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPromoDSL.g:223:3: ( (lv_recette_2_0= ruleRecette ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPromoDSL.g:224:4: (lv_recette_2_0= ruleRecette )
            	    {
            	    // InternalPromoDSL.g:224:4: (lv_recette_2_0= ruleRecette )
            	    // InternalPromoDSL.g:225:5: lv_recette_2_0= ruleRecette
            	    {

            	    					newCompositeNode(grammarAccess.getChapitreAccess().getRecetteRecetteParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_recette_2_0=ruleRecette();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChapitreRule());
            	    					}
            	    					add(
            	    						current,
            	    						"recette",
            	    						lv_recette_2_0,
            	    						"fr.pari10.miage.promo.PromoDSL.Recette");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getChapitreAccess().getChapitreKeyword_3());
            		

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
    // $ANTLR end "ruleChapitre"


    // $ANTLR start "entryRuleRecette"
    // InternalPromoDSL.g:250:1: entryRuleRecette returns [EObject current=null] : iv_ruleRecette= ruleRecette EOF ;
    public final EObject entryRuleRecette() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecette = null;


        try {
            // InternalPromoDSL.g:250:48: (iv_ruleRecette= ruleRecette EOF )
            // InternalPromoDSL.g:251:2: iv_ruleRecette= ruleRecette EOF
            {
             newCompositeNode(grammarAccess.getRecetteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecette=ruleRecette();

            state._fsp--;

             current =iv_ruleRecette; 
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
    // $ANTLR end "entryRuleRecette"


    // $ANTLR start "ruleRecette"
    // InternalPromoDSL.g:257:1: ruleRecette returns [EObject current=null] : (otherlv_0= 'Recette' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'photo' ( (lv_NumPhoto_3_0= RULE_STRING ) ) otherlv_4= 'ingredients' ( (lv_ingredients_5_0= ruleIngredient ) ) (otherlv_6= ';' ( (lv_ingredients_7_0= ruleIngredient ) ) )* otherlv_8= 'instruction' ( (lv_instructions_9_0= ruleInstruction ) ) (otherlv_10= ';' ( (lv_instructions_11_0= ruleInstruction ) ) )* (otherlv_12= 'alternatives' ( (lv_alternatives_13_0= ruleAlternatives ) ) (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )* )? otherlv_16= '/Recette' ) ;
    public final EObject ruleRecette() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_NumPhoto_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_ingredients_5_0 = null;

        EObject lv_ingredients_7_0 = null;

        EObject lv_instructions_9_0 = null;

        EObject lv_instructions_11_0 = null;

        EObject lv_alternatives_13_0 = null;

        EObject lv_alternatives_15_0 = null;



        	enterRule();

        try {
            // InternalPromoDSL.g:263:2: ( (otherlv_0= 'Recette' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'photo' ( (lv_NumPhoto_3_0= RULE_STRING ) ) otherlv_4= 'ingredients' ( (lv_ingredients_5_0= ruleIngredient ) ) (otherlv_6= ';' ( (lv_ingredients_7_0= ruleIngredient ) ) )* otherlv_8= 'instruction' ( (lv_instructions_9_0= ruleInstruction ) ) (otherlv_10= ';' ( (lv_instructions_11_0= ruleInstruction ) ) )* (otherlv_12= 'alternatives' ( (lv_alternatives_13_0= ruleAlternatives ) ) (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )* )? otherlv_16= '/Recette' ) )
            // InternalPromoDSL.g:264:2: (otherlv_0= 'Recette' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'photo' ( (lv_NumPhoto_3_0= RULE_STRING ) ) otherlv_4= 'ingredients' ( (lv_ingredients_5_0= ruleIngredient ) ) (otherlv_6= ';' ( (lv_ingredients_7_0= ruleIngredient ) ) )* otherlv_8= 'instruction' ( (lv_instructions_9_0= ruleInstruction ) ) (otherlv_10= ';' ( (lv_instructions_11_0= ruleInstruction ) ) )* (otherlv_12= 'alternatives' ( (lv_alternatives_13_0= ruleAlternatives ) ) (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )* )? otherlv_16= '/Recette' )
            {
            // InternalPromoDSL.g:264:2: (otherlv_0= 'Recette' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'photo' ( (lv_NumPhoto_3_0= RULE_STRING ) ) otherlv_4= 'ingredients' ( (lv_ingredients_5_0= ruleIngredient ) ) (otherlv_6= ';' ( (lv_ingredients_7_0= ruleIngredient ) ) )* otherlv_8= 'instruction' ( (lv_instructions_9_0= ruleInstruction ) ) (otherlv_10= ';' ( (lv_instructions_11_0= ruleInstruction ) ) )* (otherlv_12= 'alternatives' ( (lv_alternatives_13_0= ruleAlternatives ) ) (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )* )? otherlv_16= '/Recette' )
            // InternalPromoDSL.g:265:3: otherlv_0= 'Recette' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'photo' ( (lv_NumPhoto_3_0= RULE_STRING ) ) otherlv_4= 'ingredients' ( (lv_ingredients_5_0= ruleIngredient ) ) (otherlv_6= ';' ( (lv_ingredients_7_0= ruleIngredient ) ) )* otherlv_8= 'instruction' ( (lv_instructions_9_0= ruleInstruction ) ) (otherlv_10= ';' ( (lv_instructions_11_0= ruleInstruction ) ) )* (otherlv_12= 'alternatives' ( (lv_alternatives_13_0= ruleAlternatives ) ) (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )* )? otherlv_16= '/Recette'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRecetteAccess().getRecetteKeyword_0());
            		
            // InternalPromoDSL.g:269:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPromoDSL.g:270:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPromoDSL.g:270:4: (lv_name_1_0= RULE_STRING )
            // InternalPromoDSL.g:271:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRecetteAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecetteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRecetteAccess().getPhotoKeyword_2());
            		
            // InternalPromoDSL.g:291:3: ( (lv_NumPhoto_3_0= RULE_STRING ) )
            // InternalPromoDSL.g:292:4: (lv_NumPhoto_3_0= RULE_STRING )
            {
            // InternalPromoDSL.g:292:4: (lv_NumPhoto_3_0= RULE_STRING )
            // InternalPromoDSL.g:293:5: lv_NumPhoto_3_0= RULE_STRING
            {
            lv_NumPhoto_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_NumPhoto_3_0, grammarAccess.getRecetteAccess().getNumPhotoSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecetteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"NumPhoto",
            						lv_NumPhoto_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRecetteAccess().getIngredientsKeyword_4());
            		
            // InternalPromoDSL.g:313:3: ( (lv_ingredients_5_0= ruleIngredient ) )
            // InternalPromoDSL.g:314:4: (lv_ingredients_5_0= ruleIngredient )
            {
            // InternalPromoDSL.g:314:4: (lv_ingredients_5_0= ruleIngredient )
            // InternalPromoDSL.g:315:5: lv_ingredients_5_0= ruleIngredient
            {

            					newCompositeNode(grammarAccess.getRecetteAccess().getIngredientsIngredientParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_ingredients_5_0=ruleIngredient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecetteRule());
            					}
            					add(
            						current,
            						"ingredients",
            						lv_ingredients_5_0,
            						"fr.pari10.miage.promo.PromoDSL.Ingredient");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromoDSL.g:332:3: (otherlv_6= ';' ( (lv_ingredients_7_0= ruleIngredient ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPromoDSL.g:333:4: otherlv_6= ';' ( (lv_ingredients_7_0= ruleIngredient ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRecetteAccess().getSemicolonKeyword_6_0());
            	    			
            	    // InternalPromoDSL.g:337:4: ( (lv_ingredients_7_0= ruleIngredient ) )
            	    // InternalPromoDSL.g:338:5: (lv_ingredients_7_0= ruleIngredient )
            	    {
            	    // InternalPromoDSL.g:338:5: (lv_ingredients_7_0= ruleIngredient )
            	    // InternalPromoDSL.g:339:6: lv_ingredients_7_0= ruleIngredient
            	    {

            	    						newCompositeNode(grammarAccess.getRecetteAccess().getIngredientsIngredientParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_ingredients_7_0=ruleIngredient();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecetteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ingredients",
            	    							lv_ingredients_7_0,
            	    							"fr.pari10.miage.promo.PromoDSL.Ingredient");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getRecetteAccess().getInstructionKeyword_7());
            		
            // InternalPromoDSL.g:361:3: ( (lv_instructions_9_0= ruleInstruction ) )
            // InternalPromoDSL.g:362:4: (lv_instructions_9_0= ruleInstruction )
            {
            // InternalPromoDSL.g:362:4: (lv_instructions_9_0= ruleInstruction )
            // InternalPromoDSL.g:363:5: lv_instructions_9_0= ruleInstruction
            {

            					newCompositeNode(grammarAccess.getRecetteAccess().getInstructionsInstructionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_instructions_9_0=ruleInstruction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecetteRule());
            					}
            					add(
            						current,
            						"instructions",
            						lv_instructions_9_0,
            						"fr.pari10.miage.promo.PromoDSL.Instruction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPromoDSL.g:380:3: (otherlv_10= ';' ( (lv_instructions_11_0= ruleInstruction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPromoDSL.g:381:4: otherlv_10= ';' ( (lv_instructions_11_0= ruleInstruction ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_4); 

            	    				newLeafNode(otherlv_10, grammarAccess.getRecetteAccess().getSemicolonKeyword_9_0());
            	    			
            	    // InternalPromoDSL.g:385:4: ( (lv_instructions_11_0= ruleInstruction ) )
            	    // InternalPromoDSL.g:386:5: (lv_instructions_11_0= ruleInstruction )
            	    {
            	    // InternalPromoDSL.g:386:5: (lv_instructions_11_0= ruleInstruction )
            	    // InternalPromoDSL.g:387:6: lv_instructions_11_0= ruleInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getRecetteAccess().getInstructionsInstructionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_instructions_11_0=ruleInstruction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecetteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"instructions",
            	    							lv_instructions_11_0,
            	    							"fr.pari10.miage.promo.PromoDSL.Instruction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalPromoDSL.g:405:3: (otherlv_12= 'alternatives' ( (lv_alternatives_13_0= ruleAlternatives ) ) (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPromoDSL.g:406:4: otherlv_12= 'alternatives' ( (lv_alternatives_13_0= ruleAlternatives ) ) (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )*
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getRecetteAccess().getAlternativesKeyword_10_0());
                    			
                    // InternalPromoDSL.g:410:4: ( (lv_alternatives_13_0= ruleAlternatives ) )
                    // InternalPromoDSL.g:411:5: (lv_alternatives_13_0= ruleAlternatives )
                    {
                    // InternalPromoDSL.g:411:5: (lv_alternatives_13_0= ruleAlternatives )
                    // InternalPromoDSL.g:412:6: lv_alternatives_13_0= ruleAlternatives
                    {

                    						newCompositeNode(grammarAccess.getRecetteAccess().getAlternativesAlternativesParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_alternatives_13_0=ruleAlternatives();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecetteRule());
                    						}
                    						add(
                    							current,
                    							"alternatives",
                    							lv_alternatives_13_0,
                    							"fr.pari10.miage.promo.PromoDSL.Alternatives");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPromoDSL.g:429:4: (otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPromoDSL.g:430:5: otherlv_14= ';' ( (lv_alternatives_15_0= ruleAlternatives ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_4); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRecetteAccess().getSemicolonKeyword_10_2_0());
                    	    				
                    	    // InternalPromoDSL.g:434:5: ( (lv_alternatives_15_0= ruleAlternatives ) )
                    	    // InternalPromoDSL.g:435:6: (lv_alternatives_15_0= ruleAlternatives )
                    	    {
                    	    // InternalPromoDSL.g:435:6: (lv_alternatives_15_0= ruleAlternatives )
                    	    // InternalPromoDSL.g:436:7: lv_alternatives_15_0= ruleAlternatives
                    	    {

                    	    							newCompositeNode(grammarAccess.getRecetteAccess().getAlternativesAlternativesParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_alternatives_15_0=ruleAlternatives();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRecetteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"alternatives",
                    	    								lv_alternatives_15_0,
                    	    								"fr.pari10.miage.promo.PromoDSL.Alternatives");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRecetteAccess().getRecetteKeyword_11());
            		

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
    // $ANTLR end "ruleRecette"


    // $ANTLR start "entryRuleAlternatives"
    // InternalPromoDSL.g:463:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // InternalPromoDSL.g:463:53: (iv_ruleAlternatives= ruleAlternatives EOF )
            // InternalPromoDSL.g:464:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalPromoDSL.g:470:1: ruleAlternatives returns [EObject current=null] : ( (lv_altNum_0_0= RULE_STRING ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token lv_altNum_0_0=null;


        	enterRule();

        try {
            // InternalPromoDSL.g:476:2: ( ( (lv_altNum_0_0= RULE_STRING ) ) )
            // InternalPromoDSL.g:477:2: ( (lv_altNum_0_0= RULE_STRING ) )
            {
            // InternalPromoDSL.g:477:2: ( (lv_altNum_0_0= RULE_STRING ) )
            // InternalPromoDSL.g:478:3: (lv_altNum_0_0= RULE_STRING )
            {
            // InternalPromoDSL.g:478:3: (lv_altNum_0_0= RULE_STRING )
            // InternalPromoDSL.g:479:4: lv_altNum_0_0= RULE_STRING
            {
            lv_altNum_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_altNum_0_0, grammarAccess.getAlternativesAccess().getAltNumSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAlternativesRule());
            				}
            				setWithLastConsumed(
            					current,
            					"altNum",
            					lv_altNum_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleIngredient"
    // InternalPromoDSL.g:498:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalPromoDSL.g:498:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalPromoDSL.g:499:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalPromoDSL.g:505:1: ruleIngredient returns [EObject current=null] : ( ( (lv_NomDuIng_0_0= RULE_STRING ) ) ( (lv_num_1_0= RULE_INT ) ) ( (lv_unite_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token lv_NomDuIng_0_0=null;
        Token lv_num_1_0=null;
        Token lv_unite_2_0=null;


        	enterRule();

        try {
            // InternalPromoDSL.g:511:2: ( ( ( (lv_NomDuIng_0_0= RULE_STRING ) ) ( (lv_num_1_0= RULE_INT ) ) ( (lv_unite_2_0= RULE_STRING ) ) ) )
            // InternalPromoDSL.g:512:2: ( ( (lv_NomDuIng_0_0= RULE_STRING ) ) ( (lv_num_1_0= RULE_INT ) ) ( (lv_unite_2_0= RULE_STRING ) ) )
            {
            // InternalPromoDSL.g:512:2: ( ( (lv_NomDuIng_0_0= RULE_STRING ) ) ( (lv_num_1_0= RULE_INT ) ) ( (lv_unite_2_0= RULE_STRING ) ) )
            // InternalPromoDSL.g:513:3: ( (lv_NomDuIng_0_0= RULE_STRING ) ) ( (lv_num_1_0= RULE_INT ) ) ( (lv_unite_2_0= RULE_STRING ) )
            {
            // InternalPromoDSL.g:513:3: ( (lv_NomDuIng_0_0= RULE_STRING ) )
            // InternalPromoDSL.g:514:4: (lv_NomDuIng_0_0= RULE_STRING )
            {
            // InternalPromoDSL.g:514:4: (lv_NomDuIng_0_0= RULE_STRING )
            // InternalPromoDSL.g:515:5: lv_NomDuIng_0_0= RULE_STRING
            {
            lv_NomDuIng_0_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_NomDuIng_0_0, grammarAccess.getIngredientAccess().getNomDuIngSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"NomDuIng",
            						lv_NomDuIng_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPromoDSL.g:531:3: ( (lv_num_1_0= RULE_INT ) )
            // InternalPromoDSL.g:532:4: (lv_num_1_0= RULE_INT )
            {
            // InternalPromoDSL.g:532:4: (lv_num_1_0= RULE_INT )
            // InternalPromoDSL.g:533:5: lv_num_1_0= RULE_INT
            {
            lv_num_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_num_1_0, grammarAccess.getIngredientAccess().getNumINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPromoDSL.g:549:3: ( (lv_unite_2_0= RULE_STRING ) )
            // InternalPromoDSL.g:550:4: (lv_unite_2_0= RULE_STRING )
            {
            // InternalPromoDSL.g:550:4: (lv_unite_2_0= RULE_STRING )
            // InternalPromoDSL.g:551:5: lv_unite_2_0= RULE_STRING
            {
            lv_unite_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_unite_2_0, grammarAccess.getIngredientAccess().getUniteSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unite",
            						lv_unite_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleInstruction"
    // InternalPromoDSL.g:571:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalPromoDSL.g:571:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalPromoDSL.g:572:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalPromoDSL.g:578:1: ruleInstruction returns [EObject current=null] : ( (lv_numDuInstruction_0_0= RULE_STRING ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_numDuInstruction_0_0=null;


        	enterRule();

        try {
            // InternalPromoDSL.g:584:2: ( ( (lv_numDuInstruction_0_0= RULE_STRING ) ) )
            // InternalPromoDSL.g:585:2: ( (lv_numDuInstruction_0_0= RULE_STRING ) )
            {
            // InternalPromoDSL.g:585:2: ( (lv_numDuInstruction_0_0= RULE_STRING ) )
            // InternalPromoDSL.g:586:3: (lv_numDuInstruction_0_0= RULE_STRING )
            {
            // InternalPromoDSL.g:586:3: (lv_numDuInstruction_0_0= RULE_STRING )
            // InternalPromoDSL.g:587:4: lv_numDuInstruction_0_0= RULE_STRING
            {
            lv_numDuInstruction_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_numDuInstruction_0_0, grammarAccess.getInstructionAccess().getNumDuInstructionSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInstructionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"numDuInstruction",
            					lv_numDuInstruction_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleInstruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});

}