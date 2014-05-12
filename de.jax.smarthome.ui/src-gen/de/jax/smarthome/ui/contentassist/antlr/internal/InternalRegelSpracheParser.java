package de.jax.smarthome.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.jax.smarthome.services.RegelSpracheGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegelSpracheParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Der'", "'Die'", "'Das'", "'der'", "'die'", "'das'", "'kann'", "'und'", "','", "'Wenn'", "'ist'", "'muss'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRegelSpracheParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRegelSpracheParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRegelSpracheParser.tokenNames; }
    public String getGrammarFileName() { return "../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g"; }


     
     	private RegelSpracheGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RegelSpracheGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:61:1: ( ruleModel EOF )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:69:1: ruleModel : ( ( rule__Model__DefinitionenAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:73:2: ( ( ( rule__Model__DefinitionenAssignment )* ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:74:1: ( ( rule__Model__DefinitionenAssignment )* )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:74:1: ( ( rule__Model__DefinitionenAssignment )* )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:75:1: ( rule__Model__DefinitionenAssignment )*
            {
             before(grammarAccess.getModelAccess().getDefinitionenAssignment()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:76:1: ( rule__Model__DefinitionenAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:76:2: rule__Model__DefinitionenAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DefinitionenAssignment_in_ruleModel94);
            	    rule__Model__DefinitionenAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefinitionenAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefinition"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:88:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:89:1: ( ruleDefinition EOF )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:90:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition122);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition129); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:97:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:101:2: ( ( ( rule__Definition__Alternatives ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:102:1: ( ( rule__Definition__Alternatives ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:102:1: ( ( rule__Definition__Alternatives ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:103:1: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:104:1: ( rule__Definition__Alternatives )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:104:2: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_rule__Definition__Alternatives_in_ruleDefinition155);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleGeraet"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:116:1: entryRuleGeraet : ruleGeraet EOF ;
    public final void entryRuleGeraet() throws RecognitionException {
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:117:1: ( ruleGeraet EOF )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:118:1: ruleGeraet EOF
            {
             before(grammarAccess.getGeraetRule()); 
            pushFollow(FOLLOW_ruleGeraet_in_entryRuleGeraet182);
            ruleGeraet();

            state._fsp--;

             after(grammarAccess.getGeraetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeraet189); 

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
    // $ANTLR end "entryRuleGeraet"


    // $ANTLR start "ruleGeraet"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:125:1: ruleGeraet : ( ( rule__Geraet__Group__0 ) ) ;
    public final void ruleGeraet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:129:2: ( ( ( rule__Geraet__Group__0 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:130:1: ( ( rule__Geraet__Group__0 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:130:1: ( ( rule__Geraet__Group__0 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:131:1: ( rule__Geraet__Group__0 )
            {
             before(grammarAccess.getGeraetAccess().getGroup()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:132:1: ( rule__Geraet__Group__0 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:132:2: rule__Geraet__Group__0
            {
            pushFollow(FOLLOW_rule__Geraet__Group__0_in_ruleGeraet215);
            rule__Geraet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getGroup()); 

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
    // $ANTLR end "ruleGeraet"


    // $ANTLR start "entryRuleArtikel"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:144:1: entryRuleArtikel : ruleArtikel EOF ;
    public final void entryRuleArtikel() throws RecognitionException {
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:145:1: ( ruleArtikel EOF )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:146:1: ruleArtikel EOF
            {
             before(grammarAccess.getArtikelRule()); 
            pushFollow(FOLLOW_ruleArtikel_in_entryRuleArtikel242);
            ruleArtikel();

            state._fsp--;

             after(grammarAccess.getArtikelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtikel249); 

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
    // $ANTLR end "entryRuleArtikel"


    // $ANTLR start "ruleArtikel"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:153:1: ruleArtikel : ( ( rule__Artikel__Alternatives ) ) ;
    public final void ruleArtikel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:157:2: ( ( ( rule__Artikel__Alternatives ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:158:1: ( ( rule__Artikel__Alternatives ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:158:1: ( ( rule__Artikel__Alternatives ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:159:1: ( rule__Artikel__Alternatives )
            {
             before(grammarAccess.getArtikelAccess().getAlternatives()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:160:1: ( rule__Artikel__Alternatives )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:160:2: rule__Artikel__Alternatives
            {
            pushFollow(FOLLOW_rule__Artikel__Alternatives_in_ruleArtikel275);
            rule__Artikel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArtikelAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArtikel"


    // $ANTLR start "entryRuleZustand"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:172:1: entryRuleZustand : ruleZustand EOF ;
    public final void entryRuleZustand() throws RecognitionException {
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:173:1: ( ruleZustand EOF )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:174:1: ruleZustand EOF
            {
             before(grammarAccess.getZustandRule()); 
            pushFollow(FOLLOW_ruleZustand_in_entryRuleZustand302);
            ruleZustand();

            state._fsp--;

             after(grammarAccess.getZustandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZustand309); 

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
    // $ANTLR end "entryRuleZustand"


    // $ANTLR start "ruleZustand"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:181:1: ruleZustand : ( ( rule__Zustand__NameAssignment ) ) ;
    public final void ruleZustand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:185:2: ( ( ( rule__Zustand__NameAssignment ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:186:1: ( ( rule__Zustand__NameAssignment ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:186:1: ( ( rule__Zustand__NameAssignment ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:187:1: ( rule__Zustand__NameAssignment )
            {
             before(grammarAccess.getZustandAccess().getNameAssignment()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:188:1: ( rule__Zustand__NameAssignment )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:188:2: rule__Zustand__NameAssignment
            {
            pushFollow(FOLLOW_rule__Zustand__NameAssignment_in_ruleZustand335);
            rule__Zustand__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getZustandAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleZustand"


    // $ANTLR start "entryRuleRegel"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:200:1: entryRuleRegel : ruleRegel EOF ;
    public final void entryRuleRegel() throws RecognitionException {
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:201:1: ( ruleRegel EOF )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:202:1: ruleRegel EOF
            {
             before(grammarAccess.getRegelRule()); 
            pushFollow(FOLLOW_ruleRegel_in_entryRuleRegel362);
            ruleRegel();

            state._fsp--;

             after(grammarAccess.getRegelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegel369); 

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
    // $ANTLR end "entryRuleRegel"


    // $ANTLR start "ruleRegel"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:209:1: ruleRegel : ( ( rule__Regel__Group__0 ) ) ;
    public final void ruleRegel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:213:2: ( ( ( rule__Regel__Group__0 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:214:1: ( ( rule__Regel__Group__0 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:214:1: ( ( rule__Regel__Group__0 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:215:1: ( rule__Regel__Group__0 )
            {
             before(grammarAccess.getRegelAccess().getGroup()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:216:1: ( rule__Regel__Group__0 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:216:2: rule__Regel__Group__0
            {
            pushFollow(FOLLOW_rule__Regel__Group__0_in_ruleRegel395);
            rule__Regel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getGroup()); 

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
    // $ANTLR end "ruleRegel"


    // $ANTLR start "entryRuleArtikelKlein"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:228:1: entryRuleArtikelKlein : ruleArtikelKlein EOF ;
    public final void entryRuleArtikelKlein() throws RecognitionException {
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:229:1: ( ruleArtikelKlein EOF )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:230:1: ruleArtikelKlein EOF
            {
             before(grammarAccess.getArtikelKleinRule()); 
            pushFollow(FOLLOW_ruleArtikelKlein_in_entryRuleArtikelKlein422);
            ruleArtikelKlein();

            state._fsp--;

             after(grammarAccess.getArtikelKleinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtikelKlein429); 

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
    // $ANTLR end "entryRuleArtikelKlein"


    // $ANTLR start "ruleArtikelKlein"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:237:1: ruleArtikelKlein : ( ( rule__ArtikelKlein__Alternatives ) ) ;
    public final void ruleArtikelKlein() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:241:2: ( ( ( rule__ArtikelKlein__Alternatives ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:242:1: ( ( rule__ArtikelKlein__Alternatives ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:242:1: ( ( rule__ArtikelKlein__Alternatives ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:243:1: ( rule__ArtikelKlein__Alternatives )
            {
             before(grammarAccess.getArtikelKleinAccess().getAlternatives()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:244:1: ( rule__ArtikelKlein__Alternatives )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:244:2: rule__ArtikelKlein__Alternatives
            {
            pushFollow(FOLLOW_rule__ArtikelKlein__Alternatives_in_ruleArtikelKlein455);
            rule__ArtikelKlein__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArtikelKleinAccess().getAlternatives()); 

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
    // $ANTLR end "ruleArtikelKlein"


    // $ANTLR start "rule__Definition__Alternatives"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:256:1: rule__Definition__Alternatives : ( ( ruleGeraet ) | ( ruleRegel ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:260:1: ( ( ruleGeraet ) | ( ruleRegel ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:261:1: ( ruleGeraet )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:261:1: ( ruleGeraet )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:262:1: ruleGeraet
                    {
                     before(grammarAccess.getDefinitionAccess().getGeraetParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGeraet_in_rule__Definition__Alternatives491);
                    ruleGeraet();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getGeraetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:267:6: ( ruleRegel )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:267:6: ( ruleRegel )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:268:1: ruleRegel
                    {
                     before(grammarAccess.getDefinitionAccess().getRegelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRegel_in_rule__Definition__Alternatives508);
                    ruleRegel();

                    state._fsp--;

                     after(grammarAccess.getDefinitionAccess().getRegelParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Artikel__Alternatives"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:278:1: rule__Artikel__Alternatives : ( ( 'Der' ) | ( 'Die' ) | ( 'Das' ) );
    public final void rule__Artikel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:282:1: ( ( 'Der' ) | ( 'Die' ) | ( 'Das' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:283:1: ( 'Der' )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:283:1: ( 'Der' )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:284:1: 'Der'
                    {
                     before(grammarAccess.getArtikelAccess().getDerKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Artikel__Alternatives541); 
                     after(grammarAccess.getArtikelAccess().getDerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:291:6: ( 'Die' )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:291:6: ( 'Die' )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:292:1: 'Die'
                    {
                     before(grammarAccess.getArtikelAccess().getDieKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Artikel__Alternatives561); 
                     after(grammarAccess.getArtikelAccess().getDieKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:299:6: ( 'Das' )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:299:6: ( 'Das' )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:300:1: 'Das'
                    {
                     before(grammarAccess.getArtikelAccess().getDasKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Artikel__Alternatives581); 
                     after(grammarAccess.getArtikelAccess().getDasKeyword_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Artikel__Alternatives"


    // $ANTLR start "rule__ArtikelKlein__Alternatives"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:312:1: rule__ArtikelKlein__Alternatives : ( ( 'der' ) | ( 'die' ) | ( 'das' ) );
    public final void rule__ArtikelKlein__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:316:1: ( ( 'der' ) | ( 'die' ) | ( 'das' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:317:1: ( 'der' )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:317:1: ( 'der' )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:318:1: 'der'
                    {
                     before(grammarAccess.getArtikelKleinAccess().getDerKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__ArtikelKlein__Alternatives616); 
                     after(grammarAccess.getArtikelKleinAccess().getDerKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:325:6: ( 'die' )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:325:6: ( 'die' )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:326:1: 'die'
                    {
                     before(grammarAccess.getArtikelKleinAccess().getDieKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__ArtikelKlein__Alternatives636); 
                     after(grammarAccess.getArtikelKleinAccess().getDieKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:333:6: ( 'das' )
                    {
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:333:6: ( 'das' )
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:334:1: 'das'
                    {
                     before(grammarAccess.getArtikelKleinAccess().getDasKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__ArtikelKlein__Alternatives656); 
                     after(grammarAccess.getArtikelKleinAccess().getDasKeyword_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ArtikelKlein__Alternatives"


    // $ANTLR start "rule__Geraet__Group__0"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:348:1: rule__Geraet__Group__0 : rule__Geraet__Group__0__Impl rule__Geraet__Group__1 ;
    public final void rule__Geraet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:352:1: ( rule__Geraet__Group__0__Impl rule__Geraet__Group__1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:353:2: rule__Geraet__Group__0__Impl rule__Geraet__Group__1
            {
            pushFollow(FOLLOW_rule__Geraet__Group__0__Impl_in_rule__Geraet__Group__0688);
            rule__Geraet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group__1_in_rule__Geraet__Group__0691);
            rule__Geraet__Group__1();

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
    // $ANTLR end "rule__Geraet__Group__0"


    // $ANTLR start "rule__Geraet__Group__0__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:360:1: rule__Geraet__Group__0__Impl : ( ( rule__Geraet__ArtikelAssignment_0 ) ) ;
    public final void rule__Geraet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:364:1: ( ( ( rule__Geraet__ArtikelAssignment_0 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:365:1: ( ( rule__Geraet__ArtikelAssignment_0 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:365:1: ( ( rule__Geraet__ArtikelAssignment_0 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:366:1: ( rule__Geraet__ArtikelAssignment_0 )
            {
             before(grammarAccess.getGeraetAccess().getArtikelAssignment_0()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:367:1: ( rule__Geraet__ArtikelAssignment_0 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:367:2: rule__Geraet__ArtikelAssignment_0
            {
            pushFollow(FOLLOW_rule__Geraet__ArtikelAssignment_0_in_rule__Geraet__Group__0__Impl718);
            rule__Geraet__ArtikelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getArtikelAssignment_0()); 

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
    // $ANTLR end "rule__Geraet__Group__0__Impl"


    // $ANTLR start "rule__Geraet__Group__1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:377:1: rule__Geraet__Group__1 : rule__Geraet__Group__1__Impl rule__Geraet__Group__2 ;
    public final void rule__Geraet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:381:1: ( rule__Geraet__Group__1__Impl rule__Geraet__Group__2 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:382:2: rule__Geraet__Group__1__Impl rule__Geraet__Group__2
            {
            pushFollow(FOLLOW_rule__Geraet__Group__1__Impl_in_rule__Geraet__Group__1748);
            rule__Geraet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group__2_in_rule__Geraet__Group__1751);
            rule__Geraet__Group__2();

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
    // $ANTLR end "rule__Geraet__Group__1"


    // $ANTLR start "rule__Geraet__Group__1__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:389:1: rule__Geraet__Group__1__Impl : ( ( rule__Geraet__NameAssignment_1 ) ) ;
    public final void rule__Geraet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:393:1: ( ( ( rule__Geraet__NameAssignment_1 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:394:1: ( ( rule__Geraet__NameAssignment_1 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:394:1: ( ( rule__Geraet__NameAssignment_1 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:395:1: ( rule__Geraet__NameAssignment_1 )
            {
             before(grammarAccess.getGeraetAccess().getNameAssignment_1()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:396:1: ( rule__Geraet__NameAssignment_1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:396:2: rule__Geraet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Geraet__NameAssignment_1_in_rule__Geraet__Group__1__Impl778);
            rule__Geraet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Geraet__Group__1__Impl"


    // $ANTLR start "rule__Geraet__Group__2"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:406:1: rule__Geraet__Group__2 : rule__Geraet__Group__2__Impl rule__Geraet__Group__3 ;
    public final void rule__Geraet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:410:1: ( rule__Geraet__Group__2__Impl rule__Geraet__Group__3 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:411:2: rule__Geraet__Group__2__Impl rule__Geraet__Group__3
            {
            pushFollow(FOLLOW_rule__Geraet__Group__2__Impl_in_rule__Geraet__Group__2808);
            rule__Geraet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group__3_in_rule__Geraet__Group__2811);
            rule__Geraet__Group__3();

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
    // $ANTLR end "rule__Geraet__Group__2"


    // $ANTLR start "rule__Geraet__Group__2__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:418:1: rule__Geraet__Group__2__Impl : ( 'kann' ) ;
    public final void rule__Geraet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:422:1: ( ( 'kann' ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:423:1: ( 'kann' )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:423:1: ( 'kann' )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:424:1: 'kann'
            {
             before(grammarAccess.getGeraetAccess().getKannKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Geraet__Group__2__Impl839); 
             after(grammarAccess.getGeraetAccess().getKannKeyword_2()); 

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
    // $ANTLR end "rule__Geraet__Group__2__Impl"


    // $ANTLR start "rule__Geraet__Group__3"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:437:1: rule__Geraet__Group__3 : rule__Geraet__Group__3__Impl ;
    public final void rule__Geraet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:441:1: ( rule__Geraet__Group__3__Impl )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:442:2: rule__Geraet__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Geraet__Group__3__Impl_in_rule__Geraet__Group__3870);
            rule__Geraet__Group__3__Impl();

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
    // $ANTLR end "rule__Geraet__Group__3"


    // $ANTLR start "rule__Geraet__Group__3__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:448:1: rule__Geraet__Group__3__Impl : ( ( rule__Geraet__Group_3__0 )? ) ;
    public final void rule__Geraet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:452:1: ( ( ( rule__Geraet__Group_3__0 )? ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:453:1: ( ( rule__Geraet__Group_3__0 )? )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:453:1: ( ( rule__Geraet__Group_3__0 )? )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:454:1: ( rule__Geraet__Group_3__0 )?
            {
             before(grammarAccess.getGeraetAccess().getGroup_3()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:455:1: ( rule__Geraet__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:455:2: rule__Geraet__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Geraet__Group_3__0_in_rule__Geraet__Group__3__Impl897);
                    rule__Geraet__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeraetAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Geraet__Group__3__Impl"


    // $ANTLR start "rule__Geraet__Group_3__0"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:473:1: rule__Geraet__Group_3__0 : rule__Geraet__Group_3__0__Impl rule__Geraet__Group_3__1 ;
    public final void rule__Geraet__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:477:1: ( rule__Geraet__Group_3__0__Impl rule__Geraet__Group_3__1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:478:2: rule__Geraet__Group_3__0__Impl rule__Geraet__Group_3__1
            {
            pushFollow(FOLLOW_rule__Geraet__Group_3__0__Impl_in_rule__Geraet__Group_3__0936);
            rule__Geraet__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group_3__1_in_rule__Geraet__Group_3__0939);
            rule__Geraet__Group_3__1();

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
    // $ANTLR end "rule__Geraet__Group_3__0"


    // $ANTLR start "rule__Geraet__Group_3__0__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:485:1: rule__Geraet__Group_3__0__Impl : ( ( rule__Geraet__ZustaendeAssignment_3_0 ) ) ;
    public final void rule__Geraet__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:489:1: ( ( ( rule__Geraet__ZustaendeAssignment_3_0 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:490:1: ( ( rule__Geraet__ZustaendeAssignment_3_0 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:490:1: ( ( rule__Geraet__ZustaendeAssignment_3_0 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:491:1: ( rule__Geraet__ZustaendeAssignment_3_0 )
            {
             before(grammarAccess.getGeraetAccess().getZustaendeAssignment_3_0()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:492:1: ( rule__Geraet__ZustaendeAssignment_3_0 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:492:2: rule__Geraet__ZustaendeAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Geraet__ZustaendeAssignment_3_0_in_rule__Geraet__Group_3__0__Impl966);
            rule__Geraet__ZustaendeAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getZustaendeAssignment_3_0()); 

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
    // $ANTLR end "rule__Geraet__Group_3__0__Impl"


    // $ANTLR start "rule__Geraet__Group_3__1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:502:1: rule__Geraet__Group_3__1 : rule__Geraet__Group_3__1__Impl ;
    public final void rule__Geraet__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:506:1: ( rule__Geraet__Group_3__1__Impl )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:507:2: rule__Geraet__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Geraet__Group_3__1__Impl_in_rule__Geraet__Group_3__1996);
            rule__Geraet__Group_3__1__Impl();

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
    // $ANTLR end "rule__Geraet__Group_3__1"


    // $ANTLR start "rule__Geraet__Group_3__1__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:513:1: rule__Geraet__Group_3__1__Impl : ( ( rule__Geraet__Group_3_1__0 )* ) ;
    public final void rule__Geraet__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:517:1: ( ( ( rule__Geraet__Group_3_1__0 )* ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:518:1: ( ( rule__Geraet__Group_3_1__0 )* )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:518:1: ( ( rule__Geraet__Group_3_1__0 )* )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:519:1: ( rule__Geraet__Group_3_1__0 )*
            {
             before(grammarAccess.getGeraetAccess().getGroup_3_1()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:520:1: ( rule__Geraet__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:520:2: rule__Geraet__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Geraet__Group_3_1__0_in_rule__Geraet__Group_3__1__Impl1023);
            	    rule__Geraet__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGeraetAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Geraet__Group_3__1__Impl"


    // $ANTLR start "rule__Geraet__Group_3_1__0"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:534:1: rule__Geraet__Group_3_1__0 : rule__Geraet__Group_3_1__0__Impl rule__Geraet__Group_3_1__1 ;
    public final void rule__Geraet__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:538:1: ( rule__Geraet__Group_3_1__0__Impl rule__Geraet__Group_3_1__1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:539:2: rule__Geraet__Group_3_1__0__Impl rule__Geraet__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Geraet__Group_3_1__0__Impl_in_rule__Geraet__Group_3_1__01058);
            rule__Geraet__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group_3_1__1_in_rule__Geraet__Group_3_1__01061);
            rule__Geraet__Group_3_1__1();

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
    // $ANTLR end "rule__Geraet__Group_3_1__0"


    // $ANTLR start "rule__Geraet__Group_3_1__0__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:546:1: rule__Geraet__Group_3_1__0__Impl : ( ( rule__Geraet__Group_3_1_0__0 )* ) ;
    public final void rule__Geraet__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:550:1: ( ( ( rule__Geraet__Group_3_1_0__0 )* ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:551:1: ( ( rule__Geraet__Group_3_1_0__0 )* )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:551:1: ( ( rule__Geraet__Group_3_1_0__0 )* )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:552:1: ( rule__Geraet__Group_3_1_0__0 )*
            {
             before(grammarAccess.getGeraetAccess().getGroup_3_1_0()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:553:1: ( rule__Geraet__Group_3_1_0__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:553:2: rule__Geraet__Group_3_1_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Geraet__Group_3_1_0__0_in_rule__Geraet__Group_3_1__0__Impl1088);
            	    rule__Geraet__Group_3_1_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGeraetAccess().getGroup_3_1_0()); 

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
    // $ANTLR end "rule__Geraet__Group_3_1__0__Impl"


    // $ANTLR start "rule__Geraet__Group_3_1__1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:563:1: rule__Geraet__Group_3_1__1 : rule__Geraet__Group_3_1__1__Impl rule__Geraet__Group_3_1__2 ;
    public final void rule__Geraet__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:567:1: ( rule__Geraet__Group_3_1__1__Impl rule__Geraet__Group_3_1__2 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:568:2: rule__Geraet__Group_3_1__1__Impl rule__Geraet__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Geraet__Group_3_1__1__Impl_in_rule__Geraet__Group_3_1__11119);
            rule__Geraet__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group_3_1__2_in_rule__Geraet__Group_3_1__11122);
            rule__Geraet__Group_3_1__2();

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
    // $ANTLR end "rule__Geraet__Group_3_1__1"


    // $ANTLR start "rule__Geraet__Group_3_1__1__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:575:1: rule__Geraet__Group_3_1__1__Impl : ( 'und' ) ;
    public final void rule__Geraet__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:579:1: ( ( 'und' ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:580:1: ( 'und' )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:580:1: ( 'und' )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:581:1: 'und'
            {
             before(grammarAccess.getGeraetAccess().getUndKeyword_3_1_1()); 
            match(input,18,FOLLOW_18_in_rule__Geraet__Group_3_1__1__Impl1150); 
             after(grammarAccess.getGeraetAccess().getUndKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Geraet__Group_3_1__1__Impl"


    // $ANTLR start "rule__Geraet__Group_3_1__2"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:594:1: rule__Geraet__Group_3_1__2 : rule__Geraet__Group_3_1__2__Impl ;
    public final void rule__Geraet__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:598:1: ( rule__Geraet__Group_3_1__2__Impl )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:599:2: rule__Geraet__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Geraet__Group_3_1__2__Impl_in_rule__Geraet__Group_3_1__21181);
            rule__Geraet__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__Geraet__Group_3_1__2"


    // $ANTLR start "rule__Geraet__Group_3_1__2__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:605:1: rule__Geraet__Group_3_1__2__Impl : ( ( rule__Geraet__ZustaendeAssignment_3_1_2 ) ) ;
    public final void rule__Geraet__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:609:1: ( ( ( rule__Geraet__ZustaendeAssignment_3_1_2 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:610:1: ( ( rule__Geraet__ZustaendeAssignment_3_1_2 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:610:1: ( ( rule__Geraet__ZustaendeAssignment_3_1_2 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:611:1: ( rule__Geraet__ZustaendeAssignment_3_1_2 )
            {
             before(grammarAccess.getGeraetAccess().getZustaendeAssignment_3_1_2()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:612:1: ( rule__Geraet__ZustaendeAssignment_3_1_2 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:612:2: rule__Geraet__ZustaendeAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__Geraet__ZustaendeAssignment_3_1_2_in_rule__Geraet__Group_3_1__2__Impl1208);
            rule__Geraet__ZustaendeAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getZustaendeAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Geraet__Group_3_1__2__Impl"


    // $ANTLR start "rule__Geraet__Group_3_1_0__0"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:628:1: rule__Geraet__Group_3_1_0__0 : rule__Geraet__Group_3_1_0__0__Impl rule__Geraet__Group_3_1_0__1 ;
    public final void rule__Geraet__Group_3_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:632:1: ( rule__Geraet__Group_3_1_0__0__Impl rule__Geraet__Group_3_1_0__1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:633:2: rule__Geraet__Group_3_1_0__0__Impl rule__Geraet__Group_3_1_0__1
            {
            pushFollow(FOLLOW_rule__Geraet__Group_3_1_0__0__Impl_in_rule__Geraet__Group_3_1_0__01244);
            rule__Geraet__Group_3_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group_3_1_0__1_in_rule__Geraet__Group_3_1_0__01247);
            rule__Geraet__Group_3_1_0__1();

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
    // $ANTLR end "rule__Geraet__Group_3_1_0__0"


    // $ANTLR start "rule__Geraet__Group_3_1_0__0__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:640:1: rule__Geraet__Group_3_1_0__0__Impl : ( ',' ) ;
    public final void rule__Geraet__Group_3_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:644:1: ( ( ',' ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:645:1: ( ',' )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:645:1: ( ',' )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:646:1: ','
            {
             before(grammarAccess.getGeraetAccess().getCommaKeyword_3_1_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Geraet__Group_3_1_0__0__Impl1275); 
             after(grammarAccess.getGeraetAccess().getCommaKeyword_3_1_0_0()); 

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
    // $ANTLR end "rule__Geraet__Group_3_1_0__0__Impl"


    // $ANTLR start "rule__Geraet__Group_3_1_0__1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:659:1: rule__Geraet__Group_3_1_0__1 : rule__Geraet__Group_3_1_0__1__Impl ;
    public final void rule__Geraet__Group_3_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:663:1: ( rule__Geraet__Group_3_1_0__1__Impl )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:664:2: rule__Geraet__Group_3_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Geraet__Group_3_1_0__1__Impl_in_rule__Geraet__Group_3_1_0__11306);
            rule__Geraet__Group_3_1_0__1__Impl();

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
    // $ANTLR end "rule__Geraet__Group_3_1_0__1"


    // $ANTLR start "rule__Geraet__Group_3_1_0__1__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:670:1: rule__Geraet__Group_3_1_0__1__Impl : ( ( rule__Geraet__ZustaendeAssignment_3_1_0_1 ) ) ;
    public final void rule__Geraet__Group_3_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:674:1: ( ( ( rule__Geraet__ZustaendeAssignment_3_1_0_1 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:675:1: ( ( rule__Geraet__ZustaendeAssignment_3_1_0_1 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:675:1: ( ( rule__Geraet__ZustaendeAssignment_3_1_0_1 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:676:1: ( rule__Geraet__ZustaendeAssignment_3_1_0_1 )
            {
             before(grammarAccess.getGeraetAccess().getZustaendeAssignment_3_1_0_1()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:677:1: ( rule__Geraet__ZustaendeAssignment_3_1_0_1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:677:2: rule__Geraet__ZustaendeAssignment_3_1_0_1
            {
            pushFollow(FOLLOW_rule__Geraet__ZustaendeAssignment_3_1_0_1_in_rule__Geraet__Group_3_1_0__1__Impl1333);
            rule__Geraet__ZustaendeAssignment_3_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getZustaendeAssignment_3_1_0_1()); 

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
    // $ANTLR end "rule__Geraet__Group_3_1_0__1__Impl"


    // $ANTLR start "rule__Regel__Group__0"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:691:1: rule__Regel__Group__0 : rule__Regel__Group__0__Impl rule__Regel__Group__1 ;
    public final void rule__Regel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:695:1: ( rule__Regel__Group__0__Impl rule__Regel__Group__1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:696:2: rule__Regel__Group__0__Impl rule__Regel__Group__1
            {
            pushFollow(FOLLOW_rule__Regel__Group__0__Impl_in_rule__Regel__Group__01367);
            rule__Regel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__1_in_rule__Regel__Group__01370);
            rule__Regel__Group__1();

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
    // $ANTLR end "rule__Regel__Group__0"


    // $ANTLR start "rule__Regel__Group__0__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:703:1: rule__Regel__Group__0__Impl : ( 'Wenn' ) ;
    public final void rule__Regel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:707:1: ( ( 'Wenn' ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:708:1: ( 'Wenn' )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:708:1: ( 'Wenn' )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:709:1: 'Wenn'
            {
             before(grammarAccess.getRegelAccess().getWennKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Regel__Group__0__Impl1398); 
             after(grammarAccess.getRegelAccess().getWennKeyword_0()); 

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
    // $ANTLR end "rule__Regel__Group__0__Impl"


    // $ANTLR start "rule__Regel__Group__1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:722:1: rule__Regel__Group__1 : rule__Regel__Group__1__Impl rule__Regel__Group__2 ;
    public final void rule__Regel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:726:1: ( rule__Regel__Group__1__Impl rule__Regel__Group__2 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:727:2: rule__Regel__Group__1__Impl rule__Regel__Group__2
            {
            pushFollow(FOLLOW_rule__Regel__Group__1__Impl_in_rule__Regel__Group__11429);
            rule__Regel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__2_in_rule__Regel__Group__11432);
            rule__Regel__Group__2();

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
    // $ANTLR end "rule__Regel__Group__1"


    // $ANTLR start "rule__Regel__Group__1__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:734:1: rule__Regel__Group__1__Impl : ( ( rule__Regel__WennArtikelAssignment_1 ) ) ;
    public final void rule__Regel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:738:1: ( ( ( rule__Regel__WennArtikelAssignment_1 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:739:1: ( ( rule__Regel__WennArtikelAssignment_1 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:739:1: ( ( rule__Regel__WennArtikelAssignment_1 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:740:1: ( rule__Regel__WennArtikelAssignment_1 )
            {
             before(grammarAccess.getRegelAccess().getWennArtikelAssignment_1()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:741:1: ( rule__Regel__WennArtikelAssignment_1 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:741:2: rule__Regel__WennArtikelAssignment_1
            {
            pushFollow(FOLLOW_rule__Regel__WennArtikelAssignment_1_in_rule__Regel__Group__1__Impl1459);
            rule__Regel__WennArtikelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getWennArtikelAssignment_1()); 

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
    // $ANTLR end "rule__Regel__Group__1__Impl"


    // $ANTLR start "rule__Regel__Group__2"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:751:1: rule__Regel__Group__2 : rule__Regel__Group__2__Impl rule__Regel__Group__3 ;
    public final void rule__Regel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:755:1: ( rule__Regel__Group__2__Impl rule__Regel__Group__3 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:756:2: rule__Regel__Group__2__Impl rule__Regel__Group__3
            {
            pushFollow(FOLLOW_rule__Regel__Group__2__Impl_in_rule__Regel__Group__21489);
            rule__Regel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__3_in_rule__Regel__Group__21492);
            rule__Regel__Group__3();

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
    // $ANTLR end "rule__Regel__Group__2"


    // $ANTLR start "rule__Regel__Group__2__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:763:1: rule__Regel__Group__2__Impl : ( ( rule__Regel__WennGeraetAssignment_2 ) ) ;
    public final void rule__Regel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:767:1: ( ( ( rule__Regel__WennGeraetAssignment_2 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:768:1: ( ( rule__Regel__WennGeraetAssignment_2 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:768:1: ( ( rule__Regel__WennGeraetAssignment_2 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:769:1: ( rule__Regel__WennGeraetAssignment_2 )
            {
             before(grammarAccess.getRegelAccess().getWennGeraetAssignment_2()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:770:1: ( rule__Regel__WennGeraetAssignment_2 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:770:2: rule__Regel__WennGeraetAssignment_2
            {
            pushFollow(FOLLOW_rule__Regel__WennGeraetAssignment_2_in_rule__Regel__Group__2__Impl1519);
            rule__Regel__WennGeraetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getWennGeraetAssignment_2()); 

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
    // $ANTLR end "rule__Regel__Group__2__Impl"


    // $ANTLR start "rule__Regel__Group__3"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:780:1: rule__Regel__Group__3 : rule__Regel__Group__3__Impl rule__Regel__Group__4 ;
    public final void rule__Regel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:784:1: ( rule__Regel__Group__3__Impl rule__Regel__Group__4 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:785:2: rule__Regel__Group__3__Impl rule__Regel__Group__4
            {
            pushFollow(FOLLOW_rule__Regel__Group__3__Impl_in_rule__Regel__Group__31549);
            rule__Regel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__4_in_rule__Regel__Group__31552);
            rule__Regel__Group__4();

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
    // $ANTLR end "rule__Regel__Group__3"


    // $ANTLR start "rule__Regel__Group__3__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:792:1: rule__Regel__Group__3__Impl : ( ( rule__Regel__WennAssignment_3 ) ) ;
    public final void rule__Regel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:796:1: ( ( ( rule__Regel__WennAssignment_3 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:797:1: ( ( rule__Regel__WennAssignment_3 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:797:1: ( ( rule__Regel__WennAssignment_3 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:798:1: ( rule__Regel__WennAssignment_3 )
            {
             before(grammarAccess.getRegelAccess().getWennAssignment_3()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:799:1: ( rule__Regel__WennAssignment_3 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:799:2: rule__Regel__WennAssignment_3
            {
            pushFollow(FOLLOW_rule__Regel__WennAssignment_3_in_rule__Regel__Group__3__Impl1579);
            rule__Regel__WennAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getWennAssignment_3()); 

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
    // $ANTLR end "rule__Regel__Group__3__Impl"


    // $ANTLR start "rule__Regel__Group__4"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:809:1: rule__Regel__Group__4 : rule__Regel__Group__4__Impl rule__Regel__Group__5 ;
    public final void rule__Regel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:813:1: ( rule__Regel__Group__4__Impl rule__Regel__Group__5 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:814:2: rule__Regel__Group__4__Impl rule__Regel__Group__5
            {
            pushFollow(FOLLOW_rule__Regel__Group__4__Impl_in_rule__Regel__Group__41609);
            rule__Regel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__5_in_rule__Regel__Group__41612);
            rule__Regel__Group__5();

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
    // $ANTLR end "rule__Regel__Group__4"


    // $ANTLR start "rule__Regel__Group__4__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:821:1: rule__Regel__Group__4__Impl : ( 'ist' ) ;
    public final void rule__Regel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:825:1: ( ( 'ist' ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:826:1: ( 'ist' )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:826:1: ( 'ist' )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:827:1: 'ist'
            {
             before(grammarAccess.getRegelAccess().getIstKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Regel__Group__4__Impl1640); 
             after(grammarAccess.getRegelAccess().getIstKeyword_4()); 

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
    // $ANTLR end "rule__Regel__Group__4__Impl"


    // $ANTLR start "rule__Regel__Group__5"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:840:1: rule__Regel__Group__5 : rule__Regel__Group__5__Impl rule__Regel__Group__6 ;
    public final void rule__Regel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:844:1: ( rule__Regel__Group__5__Impl rule__Regel__Group__6 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:845:2: rule__Regel__Group__5__Impl rule__Regel__Group__6
            {
            pushFollow(FOLLOW_rule__Regel__Group__5__Impl_in_rule__Regel__Group__51671);
            rule__Regel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__6_in_rule__Regel__Group__51674);
            rule__Regel__Group__6();

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
    // $ANTLR end "rule__Regel__Group__5"


    // $ANTLR start "rule__Regel__Group__5__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:852:1: rule__Regel__Group__5__Impl : ( ',' ) ;
    public final void rule__Regel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:856:1: ( ( ',' ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:857:1: ( ',' )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:857:1: ( ',' )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:858:1: ','
            {
             before(grammarAccess.getRegelAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__Regel__Group__5__Impl1702); 
             after(grammarAccess.getRegelAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__Regel__Group__5__Impl"


    // $ANTLR start "rule__Regel__Group__6"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:871:1: rule__Regel__Group__6 : rule__Regel__Group__6__Impl rule__Regel__Group__7 ;
    public final void rule__Regel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:875:1: ( rule__Regel__Group__6__Impl rule__Regel__Group__7 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:876:2: rule__Regel__Group__6__Impl rule__Regel__Group__7
            {
            pushFollow(FOLLOW_rule__Regel__Group__6__Impl_in_rule__Regel__Group__61733);
            rule__Regel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__7_in_rule__Regel__Group__61736);
            rule__Regel__Group__7();

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
    // $ANTLR end "rule__Regel__Group__6"


    // $ANTLR start "rule__Regel__Group__6__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:883:1: rule__Regel__Group__6__Impl : ( 'muss' ) ;
    public final void rule__Regel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:887:1: ( ( 'muss' ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:888:1: ( 'muss' )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:888:1: ( 'muss' )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:889:1: 'muss'
            {
             before(grammarAccess.getRegelAccess().getMussKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Regel__Group__6__Impl1764); 
             after(grammarAccess.getRegelAccess().getMussKeyword_6()); 

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
    // $ANTLR end "rule__Regel__Group__6__Impl"


    // $ANTLR start "rule__Regel__Group__7"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:902:1: rule__Regel__Group__7 : rule__Regel__Group__7__Impl rule__Regel__Group__8 ;
    public final void rule__Regel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:906:1: ( rule__Regel__Group__7__Impl rule__Regel__Group__8 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:907:2: rule__Regel__Group__7__Impl rule__Regel__Group__8
            {
            pushFollow(FOLLOW_rule__Regel__Group__7__Impl_in_rule__Regel__Group__71795);
            rule__Regel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__8_in_rule__Regel__Group__71798);
            rule__Regel__Group__8();

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
    // $ANTLR end "rule__Regel__Group__7"


    // $ANTLR start "rule__Regel__Group__7__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:914:1: rule__Regel__Group__7__Impl : ( ( rule__Regel__DannArtikelAssignment_7 ) ) ;
    public final void rule__Regel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:918:1: ( ( ( rule__Regel__DannArtikelAssignment_7 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:919:1: ( ( rule__Regel__DannArtikelAssignment_7 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:919:1: ( ( rule__Regel__DannArtikelAssignment_7 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:920:1: ( rule__Regel__DannArtikelAssignment_7 )
            {
             before(grammarAccess.getRegelAccess().getDannArtikelAssignment_7()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:921:1: ( rule__Regel__DannArtikelAssignment_7 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:921:2: rule__Regel__DannArtikelAssignment_7
            {
            pushFollow(FOLLOW_rule__Regel__DannArtikelAssignment_7_in_rule__Regel__Group__7__Impl1825);
            rule__Regel__DannArtikelAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getDannArtikelAssignment_7()); 

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
    // $ANTLR end "rule__Regel__Group__7__Impl"


    // $ANTLR start "rule__Regel__Group__8"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:931:1: rule__Regel__Group__8 : rule__Regel__Group__8__Impl rule__Regel__Group__9 ;
    public final void rule__Regel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:935:1: ( rule__Regel__Group__8__Impl rule__Regel__Group__9 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:936:2: rule__Regel__Group__8__Impl rule__Regel__Group__9
            {
            pushFollow(FOLLOW_rule__Regel__Group__8__Impl_in_rule__Regel__Group__81855);
            rule__Regel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__9_in_rule__Regel__Group__81858);
            rule__Regel__Group__9();

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
    // $ANTLR end "rule__Regel__Group__8"


    // $ANTLR start "rule__Regel__Group__8__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:943:1: rule__Regel__Group__8__Impl : ( ( rule__Regel__DannGeraetAssignment_8 ) ) ;
    public final void rule__Regel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:947:1: ( ( ( rule__Regel__DannGeraetAssignment_8 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:948:1: ( ( rule__Regel__DannGeraetAssignment_8 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:948:1: ( ( rule__Regel__DannGeraetAssignment_8 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:949:1: ( rule__Regel__DannGeraetAssignment_8 )
            {
             before(grammarAccess.getRegelAccess().getDannGeraetAssignment_8()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:950:1: ( rule__Regel__DannGeraetAssignment_8 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:950:2: rule__Regel__DannGeraetAssignment_8
            {
            pushFollow(FOLLOW_rule__Regel__DannGeraetAssignment_8_in_rule__Regel__Group__8__Impl1885);
            rule__Regel__DannGeraetAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getDannGeraetAssignment_8()); 

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
    // $ANTLR end "rule__Regel__Group__8__Impl"


    // $ANTLR start "rule__Regel__Group__9"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:960:1: rule__Regel__Group__9 : rule__Regel__Group__9__Impl rule__Regel__Group__10 ;
    public final void rule__Regel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:964:1: ( rule__Regel__Group__9__Impl rule__Regel__Group__10 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:965:2: rule__Regel__Group__9__Impl rule__Regel__Group__10
            {
            pushFollow(FOLLOW_rule__Regel__Group__9__Impl_in_rule__Regel__Group__91915);
            rule__Regel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__10_in_rule__Regel__Group__91918);
            rule__Regel__Group__10();

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
    // $ANTLR end "rule__Regel__Group__9"


    // $ANTLR start "rule__Regel__Group__9__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:972:1: rule__Regel__Group__9__Impl : ( ( rule__Regel__DannAssignment_9 ) ) ;
    public final void rule__Regel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:976:1: ( ( ( rule__Regel__DannAssignment_9 ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:977:1: ( ( rule__Regel__DannAssignment_9 ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:977:1: ( ( rule__Regel__DannAssignment_9 ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:978:1: ( rule__Regel__DannAssignment_9 )
            {
             before(grammarAccess.getRegelAccess().getDannAssignment_9()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:979:1: ( rule__Regel__DannAssignment_9 )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:979:2: rule__Regel__DannAssignment_9
            {
            pushFollow(FOLLOW_rule__Regel__DannAssignment_9_in_rule__Regel__Group__9__Impl1945);
            rule__Regel__DannAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getDannAssignment_9()); 

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
    // $ANTLR end "rule__Regel__Group__9__Impl"


    // $ANTLR start "rule__Regel__Group__10"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:989:1: rule__Regel__Group__10 : rule__Regel__Group__10__Impl ;
    public final void rule__Regel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:993:1: ( rule__Regel__Group__10__Impl )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:994:2: rule__Regel__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Regel__Group__10__Impl_in_rule__Regel__Group__101975);
            rule__Regel__Group__10__Impl();

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
    // $ANTLR end "rule__Regel__Group__10"


    // $ANTLR start "rule__Regel__Group__10__Impl"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1000:1: rule__Regel__Group__10__Impl : ( ( '.' )? ) ;
    public final void rule__Regel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1004:1: ( ( ( '.' )? ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1005:1: ( ( '.' )? )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1005:1: ( ( '.' )? )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1006:1: ( '.' )?
            {
             before(grammarAccess.getRegelAccess().getFullStopKeyword_10()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1007:1: ( '.' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1008:2: '.'
                    {
                    match(input,23,FOLLOW_23_in_rule__Regel__Group__10__Impl2004); 

                    }
                    break;

            }

             after(grammarAccess.getRegelAccess().getFullStopKeyword_10()); 

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
    // $ANTLR end "rule__Regel__Group__10__Impl"


    // $ANTLR start "rule__Model__DefinitionenAssignment"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1042:1: rule__Model__DefinitionenAssignment : ( ruleDefinition ) ;
    public final void rule__Model__DefinitionenAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1046:1: ( ( ruleDefinition ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1047:1: ( ruleDefinition )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1047:1: ( ruleDefinition )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1048:1: ruleDefinition
            {
             before(grammarAccess.getModelAccess().getDefinitionenDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__Model__DefinitionenAssignment2064);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefinitionenDefinitionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__DefinitionenAssignment"


    // $ANTLR start "rule__Geraet__ArtikelAssignment_0"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1057:1: rule__Geraet__ArtikelAssignment_0 : ( ruleArtikel ) ;
    public final void rule__Geraet__ArtikelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1061:1: ( ( ruleArtikel ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1062:1: ( ruleArtikel )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1062:1: ( ruleArtikel )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1063:1: ruleArtikel
            {
             before(grammarAccess.getGeraetAccess().getArtikelArtikelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleArtikel_in_rule__Geraet__ArtikelAssignment_02095);
            ruleArtikel();

            state._fsp--;

             after(grammarAccess.getGeraetAccess().getArtikelArtikelParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Geraet__ArtikelAssignment_0"


    // $ANTLR start "rule__Geraet__NameAssignment_1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1072:1: rule__Geraet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Geraet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1076:1: ( ( RULE_ID ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1077:1: ( RULE_ID )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1077:1: ( RULE_ID )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1078:1: RULE_ID
            {
             before(grammarAccess.getGeraetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Geraet__NameAssignment_12126); 
             after(grammarAccess.getGeraetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Geraet__NameAssignment_1"


    // $ANTLR start "rule__Geraet__ZustaendeAssignment_3_0"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1087:1: rule__Geraet__ZustaendeAssignment_3_0 : ( ruleZustand ) ;
    public final void rule__Geraet__ZustaendeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1091:1: ( ( ruleZustand ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1092:1: ( ruleZustand )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1092:1: ( ruleZustand )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1093:1: ruleZustand
            {
             before(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_3_02157);
            ruleZustand();

            state._fsp--;

             after(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Geraet__ZustaendeAssignment_3_0"


    // $ANTLR start "rule__Geraet__ZustaendeAssignment_3_1_0_1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1102:1: rule__Geraet__ZustaendeAssignment_3_1_0_1 : ( ruleZustand ) ;
    public final void rule__Geraet__ZustaendeAssignment_3_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1106:1: ( ( ruleZustand ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1107:1: ( ruleZustand )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1107:1: ( ruleZustand )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1108:1: ruleZustand
            {
             before(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_0_1_0()); 
            pushFollow(FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_3_1_0_12188);
            ruleZustand();

            state._fsp--;

             after(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_0_1_0()); 

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
    // $ANTLR end "rule__Geraet__ZustaendeAssignment_3_1_0_1"


    // $ANTLR start "rule__Geraet__ZustaendeAssignment_3_1_2"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1117:1: rule__Geraet__ZustaendeAssignment_3_1_2 : ( ruleZustand ) ;
    public final void rule__Geraet__ZustaendeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1121:1: ( ( ruleZustand ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1122:1: ( ruleZustand )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1122:1: ( ruleZustand )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1123:1: ruleZustand
            {
             before(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_3_1_22219);
            ruleZustand();

            state._fsp--;

             after(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__Geraet__ZustaendeAssignment_3_1_2"


    // $ANTLR start "rule__Zustand__NameAssignment"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1132:1: rule__Zustand__NameAssignment : ( RULE_ID ) ;
    public final void rule__Zustand__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1136:1: ( ( RULE_ID ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1137:1: ( RULE_ID )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1137:1: ( RULE_ID )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1138:1: RULE_ID
            {
             before(grammarAccess.getZustandAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Zustand__NameAssignment2250); 
             after(grammarAccess.getZustandAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Zustand__NameAssignment"


    // $ANTLR start "rule__Regel__WennArtikelAssignment_1"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1147:1: rule__Regel__WennArtikelAssignment_1 : ( ruleArtikelKlein ) ;
    public final void rule__Regel__WennArtikelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1151:1: ( ( ruleArtikelKlein ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1152:1: ( ruleArtikelKlein )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1152:1: ( ruleArtikelKlein )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1153:1: ruleArtikelKlein
            {
             before(grammarAccess.getRegelAccess().getWennArtikelArtikelKleinParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArtikelKlein_in_rule__Regel__WennArtikelAssignment_12281);
            ruleArtikelKlein();

            state._fsp--;

             after(grammarAccess.getRegelAccess().getWennArtikelArtikelKleinParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Regel__WennArtikelAssignment_1"


    // $ANTLR start "rule__Regel__WennGeraetAssignment_2"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1162:1: rule__Regel__WennGeraetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Regel__WennGeraetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1166:1: ( ( ( RULE_ID ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1167:1: ( ( RULE_ID ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1167:1: ( ( RULE_ID ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1168:1: ( RULE_ID )
            {
             before(grammarAccess.getRegelAccess().getWennGeraetGeraetCrossReference_2_0()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1169:1: ( RULE_ID )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1170:1: RULE_ID
            {
             before(grammarAccess.getRegelAccess().getWennGeraetGeraetIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Regel__WennGeraetAssignment_22316); 
             after(grammarAccess.getRegelAccess().getWennGeraetGeraetIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRegelAccess().getWennGeraetGeraetCrossReference_2_0()); 

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
    // $ANTLR end "rule__Regel__WennGeraetAssignment_2"


    // $ANTLR start "rule__Regel__WennAssignment_3"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1181:1: rule__Regel__WennAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Regel__WennAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1185:1: ( ( ( RULE_ID ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1186:1: ( ( RULE_ID ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1186:1: ( ( RULE_ID ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1187:1: ( RULE_ID )
            {
             before(grammarAccess.getRegelAccess().getWennZustandCrossReference_3_0()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1188:1: ( RULE_ID )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1189:1: RULE_ID
            {
             before(grammarAccess.getRegelAccess().getWennZustandIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Regel__WennAssignment_32355); 
             after(grammarAccess.getRegelAccess().getWennZustandIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRegelAccess().getWennZustandCrossReference_3_0()); 

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
    // $ANTLR end "rule__Regel__WennAssignment_3"


    // $ANTLR start "rule__Regel__DannArtikelAssignment_7"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1200:1: rule__Regel__DannArtikelAssignment_7 : ( ruleArtikelKlein ) ;
    public final void rule__Regel__DannArtikelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1204:1: ( ( ruleArtikelKlein ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1205:1: ( ruleArtikelKlein )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1205:1: ( ruleArtikelKlein )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1206:1: ruleArtikelKlein
            {
             before(grammarAccess.getRegelAccess().getDannArtikelArtikelKleinParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleArtikelKlein_in_rule__Regel__DannArtikelAssignment_72390);
            ruleArtikelKlein();

            state._fsp--;

             after(grammarAccess.getRegelAccess().getDannArtikelArtikelKleinParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Regel__DannArtikelAssignment_7"


    // $ANTLR start "rule__Regel__DannGeraetAssignment_8"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1215:1: rule__Regel__DannGeraetAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Regel__DannGeraetAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1219:1: ( ( ( RULE_ID ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1220:1: ( ( RULE_ID ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1220:1: ( ( RULE_ID ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1221:1: ( RULE_ID )
            {
             before(grammarAccess.getRegelAccess().getDannGeraetGeraetCrossReference_8_0()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1222:1: ( RULE_ID )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1223:1: RULE_ID
            {
             before(grammarAccess.getRegelAccess().getDannGeraetGeraetIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Regel__DannGeraetAssignment_82425); 
             after(grammarAccess.getRegelAccess().getDannGeraetGeraetIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRegelAccess().getDannGeraetGeraetCrossReference_8_0()); 

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
    // $ANTLR end "rule__Regel__DannGeraetAssignment_8"


    // $ANTLR start "rule__Regel__DannAssignment_9"
    // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1234:1: rule__Regel__DannAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Regel__DannAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1238:1: ( ( ( RULE_ID ) ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1239:1: ( ( RULE_ID ) )
            {
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1239:1: ( ( RULE_ID ) )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1240:1: ( RULE_ID )
            {
             before(grammarAccess.getRegelAccess().getDannZustandCrossReference_9_0()); 
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1241:1: ( RULE_ID )
            // ../de.jax.smarthome.ui/src-gen/de/jax/smarthome/ui/contentassist/antlr/internal/InternalRegelSprache.g:1242:1: RULE_ID
            {
             before(grammarAccess.getRegelAccess().getDannZustandIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Regel__DannAssignment_92464); 
             after(grammarAccess.getRegelAccess().getDannZustandIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getRegelAccess().getDannZustandCrossReference_9_0()); 

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
    // $ANTLR end "rule__Regel__DannAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefinitionenAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000103802L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Alternatives_in_ruleDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_entryRuleGeraet182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeraet189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__0_in_ruleGeraet215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtikel_in_entryRuleArtikel242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtikel249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Artikel__Alternatives_in_ruleArtikel275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_entryRuleZustand302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZustand309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zustand__NameAssignment_in_ruleZustand335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_entryRuleRegel362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegel369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__0_in_ruleRegel395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtikelKlein_in_entryRuleArtikelKlein422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtikelKlein429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArtikelKlein__Alternatives_in_ruleArtikelKlein455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_rule__Definition__Alternatives491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_rule__Definition__Alternatives508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Artikel__Alternatives541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Artikel__Alternatives561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Artikel__Alternatives581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ArtikelKlein__Alternatives616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ArtikelKlein__Alternatives636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ArtikelKlein__Alternatives656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__0__Impl_in_rule__Geraet__Group__0688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Geraet__Group__1_in_rule__Geraet__Group__0691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__ArtikelAssignment_0_in_rule__Geraet__Group__0__Impl718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__1__Impl_in_rule__Geraet__Group__1748 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Geraet__Group__2_in_rule__Geraet__Group__1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__NameAssignment_1_in_rule__Geraet__Group__1__Impl778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__2__Impl_in_rule__Geraet__Group__2808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Geraet__Group__3_in_rule__Geraet__Group__2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Geraet__Group__2__Impl839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__3__Impl_in_rule__Geraet__Group__3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3__0_in_rule__Geraet__Group__3__Impl897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3__0__Impl_in_rule__Geraet__Group_3__0936 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3__1_in_rule__Geraet__Group_3__0939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__ZustaendeAssignment_3_0_in_rule__Geraet__Group_3__0__Impl966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3__1__Impl_in_rule__Geraet__Group_3__1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1__0_in_rule__Geraet__Group_3__1__Impl1023 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1__0__Impl_in_rule__Geraet__Group_3_1__01058 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1__1_in_rule__Geraet__Group_3_1__01061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1_0__0_in_rule__Geraet__Group_3_1__0__Impl1088 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1__1__Impl_in_rule__Geraet__Group_3_1__11119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1__2_in_rule__Geraet__Group_3_1__11122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Geraet__Group_3_1__1__Impl1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1__2__Impl_in_rule__Geraet__Group_3_1__21181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__ZustaendeAssignment_3_1_2_in_rule__Geraet__Group_3_1__2__Impl1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1_0__0__Impl_in_rule__Geraet__Group_3_1_0__01244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1_0__1_in_rule__Geraet__Group_3_1_0__01247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Geraet__Group_3_1_0__0__Impl1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_3_1_0__1__Impl_in_rule__Geraet__Group_3_1_0__11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__ZustaendeAssignment_3_1_0_1_in_rule__Geraet__Group_3_1_0__1__Impl1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__0__Impl_in_rule__Regel__Group__01367 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Regel__Group__1_in_rule__Regel__Group__01370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Regel__Group__0__Impl1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__1__Impl_in_rule__Regel__Group__11429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Regel__Group__2_in_rule__Regel__Group__11432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__WennArtikelAssignment_1_in_rule__Regel__Group__1__Impl1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__2__Impl_in_rule__Regel__Group__21489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Regel__Group__3_in_rule__Regel__Group__21492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__WennGeraetAssignment_2_in_rule__Regel__Group__2__Impl1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__3__Impl_in_rule__Regel__Group__31549 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Regel__Group__4_in_rule__Regel__Group__31552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__WennAssignment_3_in_rule__Regel__Group__3__Impl1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__4__Impl_in_rule__Regel__Group__41609 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Regel__Group__5_in_rule__Regel__Group__41612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Regel__Group__4__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__5__Impl_in_rule__Regel__Group__51671 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Regel__Group__6_in_rule__Regel__Group__51674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Regel__Group__5__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__6__Impl_in_rule__Regel__Group__61733 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Regel__Group__7_in_rule__Regel__Group__61736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Regel__Group__6__Impl1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__7__Impl_in_rule__Regel__Group__71795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Regel__Group__8_in_rule__Regel__Group__71798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__DannArtikelAssignment_7_in_rule__Regel__Group__7__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__8__Impl_in_rule__Regel__Group__81855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Regel__Group__9_in_rule__Regel__Group__81858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__DannGeraetAssignment_8_in_rule__Regel__Group__8__Impl1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__9__Impl_in_rule__Regel__Group__91915 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Regel__Group__10_in_rule__Regel__Group__91918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__DannAssignment_9_in_rule__Regel__Group__9__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__10__Impl_in_rule__Regel__Group__101975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Regel__Group__10__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Model__DefinitionenAssignment2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtikel_in_rule__Geraet__ArtikelAssignment_02095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Geraet__NameAssignment_12126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_3_02157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_3_1_0_12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_3_1_22219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Zustand__NameAssignment2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtikelKlein_in_rule__Regel__WennArtikelAssignment_12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Regel__WennGeraetAssignment_22316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Regel__WennAssignment_32355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtikelKlein_in_rule__Regel__DannArtikelAssignment_72390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Regel__DannGeraetAssignment_82425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Regel__DannAssignment_92464 = new BitSet(new long[]{0x0000000000000002L});

}