package de.jax.heim.ui.contentassist.antlr.internal; 

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
import de.jax.heim.services.RegelspracheGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegelspracheParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'kann'", "','", "'Wenn'", "'dann'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalRegelspracheParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRegelspracheParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRegelspracheParser.tokenNames; }
    public String getGrammarFileName() { return "../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g"; }


     
     	private RegelspracheGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RegelspracheGrammarAccess grammarAccess) {
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:61:1: ( ruleModel EOF )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:62:1: ruleModel EOF
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:69:1: ruleModel : ( ( rule__Model__DeklarationenAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:73:2: ( ( ( rule__Model__DeklarationenAssignment )* ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:74:1: ( ( rule__Model__DeklarationenAssignment )* )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:74:1: ( ( rule__Model__DeklarationenAssignment )* )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:75:1: ( rule__Model__DeklarationenAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeklarationenAssignment()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:76:1: ( rule__Model__DeklarationenAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:76:2: rule__Model__DeklarationenAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeklarationenAssignment_in_ruleModel94);
            	    rule__Model__DeklarationenAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeklarationenAssignment()); 

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


    // $ANTLR start "entryRuleDeklaration"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:88:1: entryRuleDeklaration : ruleDeklaration EOF ;
    public final void entryRuleDeklaration() throws RecognitionException {
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:89:1: ( ruleDeklaration EOF )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:90:1: ruleDeklaration EOF
            {
             before(grammarAccess.getDeklarationRule()); 
            pushFollow(FOLLOW_ruleDeklaration_in_entryRuleDeklaration122);
            ruleDeklaration();

            state._fsp--;

             after(grammarAccess.getDeklarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeklaration129); 

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
    // $ANTLR end "entryRuleDeklaration"


    // $ANTLR start "ruleDeklaration"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:97:1: ruleDeklaration : ( ( rule__Deklaration__Alternatives ) ) ;
    public final void ruleDeklaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:101:2: ( ( ( rule__Deklaration__Alternatives ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:102:1: ( ( rule__Deklaration__Alternatives ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:102:1: ( ( rule__Deklaration__Alternatives ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:103:1: ( rule__Deklaration__Alternatives )
            {
             before(grammarAccess.getDeklarationAccess().getAlternatives()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:104:1: ( rule__Deklaration__Alternatives )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:104:2: rule__Deklaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Deklaration__Alternatives_in_ruleDeklaration155);
            rule__Deklaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeklarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeklaration"


    // $ANTLR start "entryRuleGeraet"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:116:1: entryRuleGeraet : ruleGeraet EOF ;
    public final void entryRuleGeraet() throws RecognitionException {
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:117:1: ( ruleGeraet EOF )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:118:1: ruleGeraet EOF
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:125:1: ruleGeraet : ( ( rule__Geraet__Group__0 ) ) ;
    public final void ruleGeraet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:129:2: ( ( ( rule__Geraet__Group__0 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:130:1: ( ( rule__Geraet__Group__0 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:130:1: ( ( rule__Geraet__Group__0 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:131:1: ( rule__Geraet__Group__0 )
            {
             before(grammarAccess.getGeraetAccess().getGroup()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:132:1: ( rule__Geraet__Group__0 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:132:2: rule__Geraet__Group__0
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


    // $ANTLR start "entryRuleZustand"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:144:1: entryRuleZustand : ruleZustand EOF ;
    public final void entryRuleZustand() throws RecognitionException {
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:145:1: ( ruleZustand EOF )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:146:1: ruleZustand EOF
            {
             before(grammarAccess.getZustandRule()); 
            pushFollow(FOLLOW_ruleZustand_in_entryRuleZustand242);
            ruleZustand();

            state._fsp--;

             after(grammarAccess.getZustandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZustand249); 

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:153:1: ruleZustand : ( ( rule__Zustand__NameAssignment ) ) ;
    public final void ruleZustand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:157:2: ( ( ( rule__Zustand__NameAssignment ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:158:1: ( ( rule__Zustand__NameAssignment ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:158:1: ( ( rule__Zustand__NameAssignment ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:159:1: ( rule__Zustand__NameAssignment )
            {
             before(grammarAccess.getZustandAccess().getNameAssignment()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:160:1: ( rule__Zustand__NameAssignment )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:160:2: rule__Zustand__NameAssignment
            {
            pushFollow(FOLLOW_rule__Zustand__NameAssignment_in_ruleZustand275);
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:172:1: entryRuleRegel : ruleRegel EOF ;
    public final void entryRuleRegel() throws RecognitionException {
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:173:1: ( ruleRegel EOF )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:174:1: ruleRegel EOF
            {
             before(grammarAccess.getRegelRule()); 
            pushFollow(FOLLOW_ruleRegel_in_entryRuleRegel302);
            ruleRegel();

            state._fsp--;

             after(grammarAccess.getRegelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegel309); 

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:181:1: ruleRegel : ( ( rule__Regel__Group__0 ) ) ;
    public final void ruleRegel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:185:2: ( ( ( rule__Regel__Group__0 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:186:1: ( ( rule__Regel__Group__0 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:186:1: ( ( rule__Regel__Group__0 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:187:1: ( rule__Regel__Group__0 )
            {
             before(grammarAccess.getRegelAccess().getGroup()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:188:1: ( rule__Regel__Group__0 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:188:2: rule__Regel__Group__0
            {
            pushFollow(FOLLOW_rule__Regel__Group__0_in_ruleRegel335);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:200:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:201:1: ( ruleQualifiedName EOF )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:202:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName362);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName369); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:209:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:213:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:214:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:215:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:216:1: ( rule__QualifiedName__Group__0 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:216:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName395);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Deklaration__Alternatives"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:228:1: rule__Deklaration__Alternatives : ( ( ruleRegel ) | ( ruleGeraet ) );
    public final void rule__Deklaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:232:1: ( ( ruleRegel ) | ( ruleGeraet ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:233:1: ( ruleRegel )
                    {
                    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:233:1: ( ruleRegel )
                    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:234:1: ruleRegel
                    {
                     before(grammarAccess.getDeklarationAccess().getRegelParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRegel_in_rule__Deklaration__Alternatives431);
                    ruleRegel();

                    state._fsp--;

                     after(grammarAccess.getDeklarationAccess().getRegelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:239:6: ( ruleGeraet )
                    {
                    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:239:6: ( ruleGeraet )
                    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:240:1: ruleGeraet
                    {
                     before(grammarAccess.getDeklarationAccess().getGeraetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleGeraet_in_rule__Deklaration__Alternatives448);
                    ruleGeraet();

                    state._fsp--;

                     after(grammarAccess.getDeklarationAccess().getGeraetParserRuleCall_1()); 

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
    // $ANTLR end "rule__Deklaration__Alternatives"


    // $ANTLR start "rule__Geraet__Group__0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:252:1: rule__Geraet__Group__0 : rule__Geraet__Group__0__Impl rule__Geraet__Group__1 ;
    public final void rule__Geraet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:256:1: ( rule__Geraet__Group__0__Impl rule__Geraet__Group__1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:257:2: rule__Geraet__Group__0__Impl rule__Geraet__Group__1
            {
            pushFollow(FOLLOW_rule__Geraet__Group__0__Impl_in_rule__Geraet__Group__0478);
            rule__Geraet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group__1_in_rule__Geraet__Group__0481);
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:264:1: rule__Geraet__Group__0__Impl : ( ( rule__Geraet__NameAssignment_0 ) ) ;
    public final void rule__Geraet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:268:1: ( ( ( rule__Geraet__NameAssignment_0 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:269:1: ( ( rule__Geraet__NameAssignment_0 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:269:1: ( ( rule__Geraet__NameAssignment_0 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:270:1: ( rule__Geraet__NameAssignment_0 )
            {
             before(grammarAccess.getGeraetAccess().getNameAssignment_0()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:271:1: ( rule__Geraet__NameAssignment_0 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:271:2: rule__Geraet__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Geraet__NameAssignment_0_in_rule__Geraet__Group__0__Impl508);
            rule__Geraet__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getNameAssignment_0()); 

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:281:1: rule__Geraet__Group__1 : rule__Geraet__Group__1__Impl rule__Geraet__Group__2 ;
    public final void rule__Geraet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:285:1: ( rule__Geraet__Group__1__Impl rule__Geraet__Group__2 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:286:2: rule__Geraet__Group__1__Impl rule__Geraet__Group__2
            {
            pushFollow(FOLLOW_rule__Geraet__Group__1__Impl_in_rule__Geraet__Group__1538);
            rule__Geraet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group__2_in_rule__Geraet__Group__1541);
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:293:1: rule__Geraet__Group__1__Impl : ( 'kann' ) ;
    public final void rule__Geraet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:297:1: ( ( 'kann' ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:298:1: ( 'kann' )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:298:1: ( 'kann' )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:299:1: 'kann'
            {
             before(grammarAccess.getGeraetAccess().getKannKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Geraet__Group__1__Impl569); 
             after(grammarAccess.getGeraetAccess().getKannKeyword_1()); 

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:312:1: rule__Geraet__Group__2 : rule__Geraet__Group__2__Impl ;
    public final void rule__Geraet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:316:1: ( rule__Geraet__Group__2__Impl )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:317:2: rule__Geraet__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Geraet__Group__2__Impl_in_rule__Geraet__Group__2600);
            rule__Geraet__Group__2__Impl();

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:323:1: rule__Geraet__Group__2__Impl : ( ( rule__Geraet__Group_2__0 )? ) ;
    public final void rule__Geraet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:327:1: ( ( ( rule__Geraet__Group_2__0 )? ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:328:1: ( ( rule__Geraet__Group_2__0 )? )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:328:1: ( ( rule__Geraet__Group_2__0 )? )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:329:1: ( rule__Geraet__Group_2__0 )?
            {
             before(grammarAccess.getGeraetAccess().getGroup_2()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:330:1: ( rule__Geraet__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==RULE_ID||(LA3_1>=12 && LA3_1<=13)) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:330:2: rule__Geraet__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Geraet__Group_2__0_in_rule__Geraet__Group__2__Impl627);
                    rule__Geraet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGeraetAccess().getGroup_2()); 

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


    // $ANTLR start "rule__Geraet__Group_2__0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:346:1: rule__Geraet__Group_2__0 : rule__Geraet__Group_2__0__Impl rule__Geraet__Group_2__1 ;
    public final void rule__Geraet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:350:1: ( rule__Geraet__Group_2__0__Impl rule__Geraet__Group_2__1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:351:2: rule__Geraet__Group_2__0__Impl rule__Geraet__Group_2__1
            {
            pushFollow(FOLLOW_rule__Geraet__Group_2__0__Impl_in_rule__Geraet__Group_2__0664);
            rule__Geraet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group_2__1_in_rule__Geraet__Group_2__0667);
            rule__Geraet__Group_2__1();

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
    // $ANTLR end "rule__Geraet__Group_2__0"


    // $ANTLR start "rule__Geraet__Group_2__0__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:358:1: rule__Geraet__Group_2__0__Impl : ( ( rule__Geraet__ZustaendeAssignment_2_0 ) ) ;
    public final void rule__Geraet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:362:1: ( ( ( rule__Geraet__ZustaendeAssignment_2_0 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:363:1: ( ( rule__Geraet__ZustaendeAssignment_2_0 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:363:1: ( ( rule__Geraet__ZustaendeAssignment_2_0 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:364:1: ( rule__Geraet__ZustaendeAssignment_2_0 )
            {
             before(grammarAccess.getGeraetAccess().getZustaendeAssignment_2_0()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:365:1: ( rule__Geraet__ZustaendeAssignment_2_0 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:365:2: rule__Geraet__ZustaendeAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Geraet__ZustaendeAssignment_2_0_in_rule__Geraet__Group_2__0__Impl694);
            rule__Geraet__ZustaendeAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getZustaendeAssignment_2_0()); 

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
    // $ANTLR end "rule__Geraet__Group_2__0__Impl"


    // $ANTLR start "rule__Geraet__Group_2__1"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:375:1: rule__Geraet__Group_2__1 : rule__Geraet__Group_2__1__Impl ;
    public final void rule__Geraet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:379:1: ( rule__Geraet__Group_2__1__Impl )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:380:2: rule__Geraet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Geraet__Group_2__1__Impl_in_rule__Geraet__Group_2__1724);
            rule__Geraet__Group_2__1__Impl();

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
    // $ANTLR end "rule__Geraet__Group_2__1"


    // $ANTLR start "rule__Geraet__Group_2__1__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:386:1: rule__Geraet__Group_2__1__Impl : ( ( rule__Geraet__Group_2_1__0 )* ) ;
    public final void rule__Geraet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:390:1: ( ( ( rule__Geraet__Group_2_1__0 )* ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:391:1: ( ( rule__Geraet__Group_2_1__0 )* )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:391:1: ( ( rule__Geraet__Group_2_1__0 )* )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:392:1: ( rule__Geraet__Group_2_1__0 )*
            {
             before(grammarAccess.getGeraetAccess().getGroup_2_1()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:393:1: ( rule__Geraet__Group_2_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:393:2: rule__Geraet__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Geraet__Group_2_1__0_in_rule__Geraet__Group_2__1__Impl751);
            	    rule__Geraet__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGeraetAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Geraet__Group_2__1__Impl"


    // $ANTLR start "rule__Geraet__Group_2_1__0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:407:1: rule__Geraet__Group_2_1__0 : rule__Geraet__Group_2_1__0__Impl rule__Geraet__Group_2_1__1 ;
    public final void rule__Geraet__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:411:1: ( rule__Geraet__Group_2_1__0__Impl rule__Geraet__Group_2_1__1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:412:2: rule__Geraet__Group_2_1__0__Impl rule__Geraet__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Geraet__Group_2_1__0__Impl_in_rule__Geraet__Group_2_1__0786);
            rule__Geraet__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Geraet__Group_2_1__1_in_rule__Geraet__Group_2_1__0789);
            rule__Geraet__Group_2_1__1();

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
    // $ANTLR end "rule__Geraet__Group_2_1__0"


    // $ANTLR start "rule__Geraet__Group_2_1__0__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:419:1: rule__Geraet__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Geraet__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:423:1: ( ( ',' ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:424:1: ( ',' )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:424:1: ( ',' )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:425:1: ','
            {
             before(grammarAccess.getGeraetAccess().getCommaKeyword_2_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Geraet__Group_2_1__0__Impl817); 
             after(grammarAccess.getGeraetAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Geraet__Group_2_1__0__Impl"


    // $ANTLR start "rule__Geraet__Group_2_1__1"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:438:1: rule__Geraet__Group_2_1__1 : rule__Geraet__Group_2_1__1__Impl ;
    public final void rule__Geraet__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:442:1: ( rule__Geraet__Group_2_1__1__Impl )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:443:2: rule__Geraet__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Geraet__Group_2_1__1__Impl_in_rule__Geraet__Group_2_1__1848);
            rule__Geraet__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Geraet__Group_2_1__1"


    // $ANTLR start "rule__Geraet__Group_2_1__1__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:449:1: rule__Geraet__Group_2_1__1__Impl : ( ( rule__Geraet__ZustaendeAssignment_2_1_1 ) ) ;
    public final void rule__Geraet__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:453:1: ( ( ( rule__Geraet__ZustaendeAssignment_2_1_1 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:454:1: ( ( rule__Geraet__ZustaendeAssignment_2_1_1 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:454:1: ( ( rule__Geraet__ZustaendeAssignment_2_1_1 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:455:1: ( rule__Geraet__ZustaendeAssignment_2_1_1 )
            {
             before(grammarAccess.getGeraetAccess().getZustaendeAssignment_2_1_1()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:456:1: ( rule__Geraet__ZustaendeAssignment_2_1_1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:456:2: rule__Geraet__ZustaendeAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Geraet__ZustaendeAssignment_2_1_1_in_rule__Geraet__Group_2_1__1__Impl875);
            rule__Geraet__ZustaendeAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGeraetAccess().getZustaendeAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Geraet__Group_2_1__1__Impl"


    // $ANTLR start "rule__Regel__Group__0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:470:1: rule__Regel__Group__0 : rule__Regel__Group__0__Impl rule__Regel__Group__1 ;
    public final void rule__Regel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:474:1: ( rule__Regel__Group__0__Impl rule__Regel__Group__1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:475:2: rule__Regel__Group__0__Impl rule__Regel__Group__1
            {
            pushFollow(FOLLOW_rule__Regel__Group__0__Impl_in_rule__Regel__Group__0909);
            rule__Regel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__1_in_rule__Regel__Group__0912);
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:482:1: rule__Regel__Group__0__Impl : ( 'Wenn' ) ;
    public final void rule__Regel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:486:1: ( ( 'Wenn' ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:487:1: ( 'Wenn' )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:487:1: ( 'Wenn' )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:488:1: 'Wenn'
            {
             before(grammarAccess.getRegelAccess().getWennKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Regel__Group__0__Impl940); 
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:501:1: rule__Regel__Group__1 : rule__Regel__Group__1__Impl rule__Regel__Group__2 ;
    public final void rule__Regel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:505:1: ( rule__Regel__Group__1__Impl rule__Regel__Group__2 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:506:2: rule__Regel__Group__1__Impl rule__Regel__Group__2
            {
            pushFollow(FOLLOW_rule__Regel__Group__1__Impl_in_rule__Regel__Group__1971);
            rule__Regel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__2_in_rule__Regel__Group__1974);
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:513:1: rule__Regel__Group__1__Impl : ( ( rule__Regel__WennAssignment_1 ) ) ;
    public final void rule__Regel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:517:1: ( ( ( rule__Regel__WennAssignment_1 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:518:1: ( ( rule__Regel__WennAssignment_1 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:518:1: ( ( rule__Regel__WennAssignment_1 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:519:1: ( rule__Regel__WennAssignment_1 )
            {
             before(grammarAccess.getRegelAccess().getWennAssignment_1()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:520:1: ( rule__Regel__WennAssignment_1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:520:2: rule__Regel__WennAssignment_1
            {
            pushFollow(FOLLOW_rule__Regel__WennAssignment_1_in_rule__Regel__Group__1__Impl1001);
            rule__Regel__WennAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getWennAssignment_1()); 

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:530:1: rule__Regel__Group__2 : rule__Regel__Group__2__Impl rule__Regel__Group__3 ;
    public final void rule__Regel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:534:1: ( rule__Regel__Group__2__Impl rule__Regel__Group__3 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:535:2: rule__Regel__Group__2__Impl rule__Regel__Group__3
            {
            pushFollow(FOLLOW_rule__Regel__Group__2__Impl_in_rule__Regel__Group__21031);
            rule__Regel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Regel__Group__3_in_rule__Regel__Group__21034);
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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:542:1: rule__Regel__Group__2__Impl : ( 'dann' ) ;
    public final void rule__Regel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:546:1: ( ( 'dann' ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:547:1: ( 'dann' )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:547:1: ( 'dann' )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:548:1: 'dann'
            {
             before(grammarAccess.getRegelAccess().getDannKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Regel__Group__2__Impl1062); 
             after(grammarAccess.getRegelAccess().getDannKeyword_2()); 

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:561:1: rule__Regel__Group__3 : rule__Regel__Group__3__Impl ;
    public final void rule__Regel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:565:1: ( rule__Regel__Group__3__Impl )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:566:2: rule__Regel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Regel__Group__3__Impl_in_rule__Regel__Group__31093);
            rule__Regel__Group__3__Impl();

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
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:572:1: rule__Regel__Group__3__Impl : ( ( rule__Regel__DannAssignment_3 ) ) ;
    public final void rule__Regel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:576:1: ( ( ( rule__Regel__DannAssignment_3 ) ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:577:1: ( ( rule__Regel__DannAssignment_3 ) )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:577:1: ( ( rule__Regel__DannAssignment_3 ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:578:1: ( rule__Regel__DannAssignment_3 )
            {
             before(grammarAccess.getRegelAccess().getDannAssignment_3()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:579:1: ( rule__Regel__DannAssignment_3 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:579:2: rule__Regel__DannAssignment_3
            {
            pushFollow(FOLLOW_rule__Regel__DannAssignment_3_in_rule__Regel__Group__3__Impl1120);
            rule__Regel__DannAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRegelAccess().getDannAssignment_3()); 

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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:597:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:601:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:602:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01158);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01161);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:609:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:613:1: ( ( RULE_ID ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:614:1: ( RULE_ID )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:614:1: ( RULE_ID )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:615:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1188); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:626:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:630:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:631:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11217);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:637:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:641:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:642:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:642:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:643:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:644:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:644:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1244);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:658:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:662:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:663:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01279);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01282);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:670:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:674:1: ( ( '.' ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:675:1: ( '.' )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:675:1: ( '.' )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:676:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1310); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:689:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:693:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:694:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11341);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:700:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:704:1: ( ( RULE_ID ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:705:1: ( RULE_ID )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:705:1: ( RULE_ID )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:706:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1368); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__DeklarationenAssignment"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:722:1: rule__Model__DeklarationenAssignment : ( ruleDeklaration ) ;
    public final void rule__Model__DeklarationenAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:726:1: ( ( ruleDeklaration ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:727:1: ( ruleDeklaration )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:727:1: ( ruleDeklaration )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:728:1: ruleDeklaration
            {
             before(grammarAccess.getModelAccess().getDeklarationenDeklarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeklaration_in_rule__Model__DeklarationenAssignment1406);
            ruleDeklaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeklarationenDeklarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__DeklarationenAssignment"


    // $ANTLR start "rule__Geraet__NameAssignment_0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:737:1: rule__Geraet__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Geraet__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:741:1: ( ( RULE_ID ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:742:1: ( RULE_ID )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:742:1: ( RULE_ID )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:743:1: RULE_ID
            {
             before(grammarAccess.getGeraetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Geraet__NameAssignment_01437); 
             after(grammarAccess.getGeraetAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Geraet__NameAssignment_0"


    // $ANTLR start "rule__Geraet__ZustaendeAssignment_2_0"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:752:1: rule__Geraet__ZustaendeAssignment_2_0 : ( ruleZustand ) ;
    public final void rule__Geraet__ZustaendeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:756:1: ( ( ruleZustand ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:757:1: ( ruleZustand )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:757:1: ( ruleZustand )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:758:1: ruleZustand
            {
             before(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_2_01468);
            ruleZustand();

            state._fsp--;

             after(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Geraet__ZustaendeAssignment_2_0"


    // $ANTLR start "rule__Geraet__ZustaendeAssignment_2_1_1"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:767:1: rule__Geraet__ZustaendeAssignment_2_1_1 : ( ruleZustand ) ;
    public final void rule__Geraet__ZustaendeAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:771:1: ( ( ruleZustand ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:772:1: ( ruleZustand )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:772:1: ( ruleZustand )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:773:1: ruleZustand
            {
             before(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_2_1_11499);
            ruleZustand();

            state._fsp--;

             after(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Geraet__ZustaendeAssignment_2_1_1"


    // $ANTLR start "rule__Zustand__NameAssignment"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:782:1: rule__Zustand__NameAssignment : ( RULE_ID ) ;
    public final void rule__Zustand__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:786:1: ( ( RULE_ID ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:787:1: ( RULE_ID )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:787:1: ( RULE_ID )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:788:1: RULE_ID
            {
             before(grammarAccess.getZustandAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Zustand__NameAssignment1530); 
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


    // $ANTLR start "rule__Regel__WennAssignment_1"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:797:1: rule__Regel__WennAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Regel__WennAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:801:1: ( ( ruleQualifiedName ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:802:1: ( ruleQualifiedName )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:802:1: ( ruleQualifiedName )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:803:1: ruleQualifiedName
            {
             before(grammarAccess.getRegelAccess().getWennQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Regel__WennAssignment_11561);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegelAccess().getWennQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Regel__WennAssignment_1"


    // $ANTLR start "rule__Regel__DannAssignment_3"
    // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:812:1: rule__Regel__DannAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__Regel__DannAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:816:1: ( ( ruleQualifiedName ) )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:817:1: ( ruleQualifiedName )
            {
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:817:1: ( ruleQualifiedName )
            // ../de.jax.heim.ui/src-gen/de/jax/heim/ui/contentassist/antlr/internal/InternalRegelsprache.g:818:1: ruleQualifiedName
            {
             before(grammarAccess.getRegelAccess().getDannQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Regel__DannAssignment_31592);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRegelAccess().getDannQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Regel__DannAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeklarationenAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleDeklaration_in_entryRuleDeklaration122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeklaration129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deklaration__Alternatives_in_ruleDeklaration155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_entryRuleGeraet182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeraet189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__0_in_ruleGeraet215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_entryRuleZustand242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZustand249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Zustand__NameAssignment_in_ruleZustand275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_entryRuleRegel302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegel309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__0_in_ruleRegel335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_rule__Deklaration__Alternatives431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_rule__Deklaration__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__0__Impl_in_rule__Geraet__Group__0478 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Geraet__Group__1_in_rule__Geraet__Group__0481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__NameAssignment_0_in_rule__Geraet__Group__0__Impl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__1__Impl_in_rule__Geraet__Group__1538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Geraet__Group__2_in_rule__Geraet__Group__1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Geraet__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group__2__Impl_in_rule__Geraet__Group__2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2__0_in_rule__Geraet__Group__2__Impl627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2__0__Impl_in_rule__Geraet__Group_2__0664 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2__1_in_rule__Geraet__Group_2__0667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__ZustaendeAssignment_2_0_in_rule__Geraet__Group_2__0__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2__1__Impl_in_rule__Geraet__Group_2__1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2_1__0_in_rule__Geraet__Group_2__1__Impl751 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2_1__0__Impl_in_rule__Geraet__Group_2_1__0786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2_1__1_in_rule__Geraet__Group_2_1__0789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Geraet__Group_2_1__0__Impl817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__Group_2_1__1__Impl_in_rule__Geraet__Group_2_1__1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Geraet__ZustaendeAssignment_2_1_1_in_rule__Geraet__Group_2_1__1__Impl875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__0__Impl_in_rule__Regel__Group__0909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Regel__Group__1_in_rule__Regel__Group__0912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Regel__Group__0__Impl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__1__Impl_in_rule__Regel__Group__1971 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Regel__Group__2_in_rule__Regel__Group__1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__WennAssignment_1_in_rule__Regel__Group__1__Impl1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__2__Impl_in_rule__Regel__Group__21031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Regel__Group__3_in_rule__Regel__Group__21034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Regel__Group__2__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__Group__3__Impl_in_rule__Regel__Group__31093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Regel__DannAssignment_3_in_rule__Regel__Group__3__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1244 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedName__Group_1__0__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeklaration_in_rule__Model__DeklarationenAssignment1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Geraet__NameAssignment_01437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_2_01468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_rule__Geraet__ZustaendeAssignment_2_1_11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Zustand__NameAssignment1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Regel__WennAssignment_11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Regel__DannAssignment_31592 = new BitSet(new long[]{0x0000000000000002L});

}