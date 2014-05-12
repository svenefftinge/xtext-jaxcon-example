package de.jax.smarthome.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.jax.smarthome.services.RegelSpracheGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegelSpracheParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'kann'", "','", "'und'", "'Der'", "'Die'", "'Das'", "'Wenn'", "'ist'", "'muss'", "'.'", "'der'", "'die'", "'das'"
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
    public String getGrammarFileName() { return "../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g"; }



     	private RegelSpracheGrammarAccess grammarAccess;
     	
        public InternalRegelSpracheParser(TokenStream input, RegelSpracheGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RegelSpracheGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:76:1: ruleModel returns [EObject current=null] : ( (lv_definitionen_0_0= ruleDefinition ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_definitionen_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:79:28: ( ( (lv_definitionen_0_0= ruleDefinition ) )* )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:80:1: ( (lv_definitionen_0_0= ruleDefinition ) )*
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:80:1: ( (lv_definitionen_0_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:81:1: (lv_definitionen_0_0= ruleDefinition )
            	    {
            	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:81:1: (lv_definitionen_0_0= ruleDefinition )
            	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:82:3: lv_definitionen_0_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionenDefinitionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleModel130);
            	    lv_definitionen_0_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitionen",
            	            		lv_definitionen_0_0, 
            	            		"Definition");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefinition"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:106:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:107:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:108:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition166);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition176); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:115:1: ruleDefinition returns [EObject current=null] : (this_Geraet_0= ruleGeraet | this_Regel_1= ruleRegel ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Geraet_0 = null;

        EObject this_Regel_1 = null;


         enterRule(); 
            
        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:118:28: ( (this_Geraet_0= ruleGeraet | this_Regel_1= ruleRegel ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:119:1: (this_Geraet_0= ruleGeraet | this_Regel_1= ruleRegel )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:119:1: (this_Geraet_0= ruleGeraet | this_Regel_1= ruleRegel )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:120:5: this_Geraet_0= ruleGeraet
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionAccess().getGeraetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGeraet_in_ruleDefinition223);
                    this_Geraet_0=ruleGeraet();

                    state._fsp--;

                     
                            current = this_Geraet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:130:5: this_Regel_1= ruleRegel
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionAccess().getRegelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRegel_in_ruleDefinition250);
                    this_Regel_1=ruleRegel();

                    state._fsp--;

                     
                            current = this_Regel_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleGeraet"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:146:1: entryRuleGeraet returns [EObject current=null] : iv_ruleGeraet= ruleGeraet EOF ;
    public final EObject entryRuleGeraet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeraet = null;


        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:147:2: (iv_ruleGeraet= ruleGeraet EOF )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:148:2: iv_ruleGeraet= ruleGeraet EOF
            {
             newCompositeNode(grammarAccess.getGeraetRule()); 
            pushFollow(FOLLOW_ruleGeraet_in_entryRuleGeraet285);
            iv_ruleGeraet=ruleGeraet();

            state._fsp--;

             current =iv_ruleGeraet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeraet295); 

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
    // $ANTLR end "entryRuleGeraet"


    // $ANTLR start "ruleGeraet"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:155:1: ruleGeraet returns [EObject current=null] : ( ( (lv_artikel_0_0= ruleArtikel ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'kann' ( ( (lv_zustaende_3_0= ruleZustand ) ) ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )* )? ) ;
    public final EObject ruleGeraet() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_artikel_0_0 = null;

        EObject lv_zustaende_3_0 = null;

        EObject lv_zustaende_5_0 = null;

        EObject lv_zustaende_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:158:28: ( ( ( (lv_artikel_0_0= ruleArtikel ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'kann' ( ( (lv_zustaende_3_0= ruleZustand ) ) ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )* )? ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:159:1: ( ( (lv_artikel_0_0= ruleArtikel ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'kann' ( ( (lv_zustaende_3_0= ruleZustand ) ) ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )* )? )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:159:1: ( ( (lv_artikel_0_0= ruleArtikel ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'kann' ( ( (lv_zustaende_3_0= ruleZustand ) ) ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )* )? )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:159:2: ( (lv_artikel_0_0= ruleArtikel ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'kann' ( ( (lv_zustaende_3_0= ruleZustand ) ) ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )* )?
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:159:2: ( (lv_artikel_0_0= ruleArtikel ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:160:1: (lv_artikel_0_0= ruleArtikel )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:160:1: (lv_artikel_0_0= ruleArtikel )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:161:3: lv_artikel_0_0= ruleArtikel
            {
             
            	        newCompositeNode(grammarAccess.getGeraetAccess().getArtikelArtikelParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleArtikel_in_ruleGeraet341);
            lv_artikel_0_0=ruleArtikel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGeraetRule());
            	        }
                   		set(
                   			current, 
                   			"artikel",
                    		lv_artikel_0_0, 
                    		"Artikel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:177:2: ( (lv_name_1_0= RULE_ID ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:178:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:178:1: (lv_name_1_0= RULE_ID )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeraet358); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGeraetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeraetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleGeraet375); 

                	newLeafNode(otherlv_2, grammarAccess.getGeraetAccess().getKannKeyword_2());
                
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:199:1: ( ( (lv_zustaende_3_0= ruleZustand ) ) ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:199:2: ( (lv_zustaende_3_0= ruleZustand ) ) ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )*
                    {
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:199:2: ( (lv_zustaende_3_0= ruleZustand ) )
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:200:1: (lv_zustaende_3_0= ruleZustand )
                    {
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:200:1: (lv_zustaende_3_0= ruleZustand )
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:201:3: lv_zustaende_3_0= ruleZustand
                    {
                     
                    	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleZustand_in_ruleGeraet397);
                    lv_zustaende_3_0=ruleZustand();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGeraetRule());
                    	        }
                           		add(
                           			current, 
                           			"zustaende",
                            		lv_zustaende_3_0, 
                            		"Zustand");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:217:2: ( (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:217:3: (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )* otherlv_6= 'und' ( (lv_zustaende_7_0= ruleZustand ) )
                    	    {
                    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:217:3: (otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) ) )*
                    	    loop3:
                    	    do {
                    	        int alt3=2;
                    	        int LA3_0 = input.LA(1);

                    	        if ( (LA3_0==12) ) {
                    	            alt3=1;
                    	        }


                    	        switch (alt3) {
                    	    	case 1 :
                    	    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:217:5: otherlv_4= ',' ( (lv_zustaende_5_0= ruleZustand ) )
                    	    	    {
                    	    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleGeraet411); 

                    	    	        	newLeafNode(otherlv_4, grammarAccess.getGeraetAccess().getCommaKeyword_3_1_0_0());
                    	    	        
                    	    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:221:1: ( (lv_zustaende_5_0= ruleZustand ) )
                    	    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:222:1: (lv_zustaende_5_0= ruleZustand )
                    	    	    {
                    	    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:222:1: (lv_zustaende_5_0= ruleZustand )
                    	    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:223:3: lv_zustaende_5_0= ruleZustand
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_0_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleZustand_in_ruleGeraet432);
                    	    	    lv_zustaende_5_0=ruleZustand();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getGeraetRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"zustaende",
                    	    	            		lv_zustaende_5_0, 
                    	    	            		"Zustand");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop3;
                    	        }
                    	    } while (true);

                    	    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleGeraet446); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getGeraetAccess().getUndKeyword_3_1_1());
                    	        
                    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:243:1: ( (lv_zustaende_7_0= ruleZustand ) )
                    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:244:1: (lv_zustaende_7_0= ruleZustand )
                    	    {
                    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:244:1: (lv_zustaende_7_0= ruleZustand )
                    	    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:245:3: lv_zustaende_7_0= ruleZustand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleZustand_in_ruleGeraet467);
                    	    lv_zustaende_7_0=ruleZustand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGeraetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"zustaende",
                    	            		lv_zustaende_7_0, 
                    	            		"Zustand");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleGeraet"


    // $ANTLR start "entryRuleArtikel"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:269:1: entryRuleArtikel returns [String current=null] : iv_ruleArtikel= ruleArtikel EOF ;
    public final String entryRuleArtikel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArtikel = null;


        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:270:2: (iv_ruleArtikel= ruleArtikel EOF )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:271:2: iv_ruleArtikel= ruleArtikel EOF
            {
             newCompositeNode(grammarAccess.getArtikelRule()); 
            pushFollow(FOLLOW_ruleArtikel_in_entryRuleArtikel508);
            iv_ruleArtikel=ruleArtikel();

            state._fsp--;

             current =iv_ruleArtikel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtikel519); 

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
    // $ANTLR end "entryRuleArtikel"


    // $ANTLR start "ruleArtikel"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:278:1: ruleArtikel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Der' | kw= 'Die' | kw= 'Das' ) ;
    public final AntlrDatatypeRuleToken ruleArtikel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:281:28: ( (kw= 'Der' | kw= 'Die' | kw= 'Das' ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:282:1: (kw= 'Der' | kw= 'Die' | kw= 'Das' )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:282:1: (kw= 'Der' | kw= 'Die' | kw= 'Das' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:283:2: kw= 'Der'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleArtikel557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArtikelAccess().getDerKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:290:2: kw= 'Die'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleArtikel576); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArtikelAccess().getDieKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:297:2: kw= 'Das'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleArtikel595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArtikelAccess().getDasKeyword_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleArtikel"


    // $ANTLR start "entryRuleZustand"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:310:1: entryRuleZustand returns [EObject current=null] : iv_ruleZustand= ruleZustand EOF ;
    public final EObject entryRuleZustand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZustand = null;


        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:311:2: (iv_ruleZustand= ruleZustand EOF )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:312:2: iv_ruleZustand= ruleZustand EOF
            {
             newCompositeNode(grammarAccess.getZustandRule()); 
            pushFollow(FOLLOW_ruleZustand_in_entryRuleZustand635);
            iv_ruleZustand=ruleZustand();

            state._fsp--;

             current =iv_ruleZustand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZustand645); 

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
    // $ANTLR end "entryRuleZustand"


    // $ANTLR start "ruleZustand"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:319:1: ruleZustand returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleZustand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:322:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:323:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:323:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:324:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:324:1: (lv_name_0_0= RULE_ID )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:325:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleZustand686); 

            			newLeafNode(lv_name_0_0, grammarAccess.getZustandAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getZustandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleZustand"


    // $ANTLR start "entryRuleRegel"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:349:1: entryRuleRegel returns [EObject current=null] : iv_ruleRegel= ruleRegel EOF ;
    public final EObject entryRuleRegel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegel = null;


        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:350:2: (iv_ruleRegel= ruleRegel EOF )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:351:2: iv_ruleRegel= ruleRegel EOF
            {
             newCompositeNode(grammarAccess.getRegelRule()); 
            pushFollow(FOLLOW_ruleRegel_in_entryRuleRegel726);
            iv_ruleRegel=ruleRegel();

            state._fsp--;

             current =iv_ruleRegel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegel736); 

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
    // $ANTLR end "entryRuleRegel"


    // $ANTLR start "ruleRegel"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:358:1: ruleRegel returns [EObject current=null] : (otherlv_0= 'Wenn' ( (lv_wennArtikel_1_0= ruleArtikelKlein ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ist' otherlv_5= ',' otherlv_6= 'muss' ( (lv_dannArtikel_7_0= ruleArtikelKlein ) ) ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '.' )? ) ;
    public final EObject ruleRegel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_wennArtikel_1_0 = null;

        AntlrDatatypeRuleToken lv_dannArtikel_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:361:28: ( (otherlv_0= 'Wenn' ( (lv_wennArtikel_1_0= ruleArtikelKlein ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ist' otherlv_5= ',' otherlv_6= 'muss' ( (lv_dannArtikel_7_0= ruleArtikelKlein ) ) ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '.' )? ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:362:1: (otherlv_0= 'Wenn' ( (lv_wennArtikel_1_0= ruleArtikelKlein ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ist' otherlv_5= ',' otherlv_6= 'muss' ( (lv_dannArtikel_7_0= ruleArtikelKlein ) ) ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '.' )? )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:362:1: (otherlv_0= 'Wenn' ( (lv_wennArtikel_1_0= ruleArtikelKlein ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ist' otherlv_5= ',' otherlv_6= 'muss' ( (lv_dannArtikel_7_0= ruleArtikelKlein ) ) ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '.' )? )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:362:3: otherlv_0= 'Wenn' ( (lv_wennArtikel_1_0= ruleArtikelKlein ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'ist' otherlv_5= ',' otherlv_6= 'muss' ( (lv_dannArtikel_7_0= ruleArtikelKlein ) ) ( (otherlv_8= RULE_ID ) ) ( (otherlv_9= RULE_ID ) ) (otherlv_10= '.' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRegel773); 

                	newLeafNode(otherlv_0, grammarAccess.getRegelAccess().getWennKeyword_0());
                
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:366:1: ( (lv_wennArtikel_1_0= ruleArtikelKlein ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:367:1: (lv_wennArtikel_1_0= ruleArtikelKlein )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:367:1: (lv_wennArtikel_1_0= ruleArtikelKlein )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:368:3: lv_wennArtikel_1_0= ruleArtikelKlein
            {
             
            	        newCompositeNode(grammarAccess.getRegelAccess().getWennArtikelArtikelKleinParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArtikelKlein_in_ruleRegel794);
            lv_wennArtikel_1_0=ruleArtikelKlein();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegelRule());
            	        }
                   		set(
                   			current, 
                   			"wennArtikel",
                    		lv_wennArtikel_1_0, 
                    		"ArtikelKlein");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:384:2: ( (otherlv_2= RULE_ID ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:385:1: (otherlv_2= RULE_ID )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:385:1: (otherlv_2= RULE_ID )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:386:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegelRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegel814); 

            		newLeafNode(otherlv_2, grammarAccess.getRegelAccess().getWennGeraetGeraetCrossReference_2_0()); 
            	

            }


            }

            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:397:2: ( (otherlv_3= RULE_ID ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:398:1: (otherlv_3= RULE_ID )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:398:1: (otherlv_3= RULE_ID )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:399:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegelRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegel834); 

            		newLeafNode(otherlv_3, grammarAccess.getRegelAccess().getWennZustandCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRegel846); 

                	newLeafNode(otherlv_4, grammarAccess.getRegelAccess().getIstKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRegel858); 

                	newLeafNode(otherlv_5, grammarAccess.getRegelAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleRegel870); 

                	newLeafNode(otherlv_6, grammarAccess.getRegelAccess().getMussKeyword_6());
                
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:422:1: ( (lv_dannArtikel_7_0= ruleArtikelKlein ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:423:1: (lv_dannArtikel_7_0= ruleArtikelKlein )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:423:1: (lv_dannArtikel_7_0= ruleArtikelKlein )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:424:3: lv_dannArtikel_7_0= ruleArtikelKlein
            {
             
            	        newCompositeNode(grammarAccess.getRegelAccess().getDannArtikelArtikelKleinParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleArtikelKlein_in_ruleRegel891);
            lv_dannArtikel_7_0=ruleArtikelKlein();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegelRule());
            	        }
                   		set(
                   			current, 
                   			"dannArtikel",
                    		lv_dannArtikel_7_0, 
                    		"ArtikelKlein");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:440:2: ( (otherlv_8= RULE_ID ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:441:1: (otherlv_8= RULE_ID )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:441:1: (otherlv_8= RULE_ID )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:442:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegelRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegel911); 

            		newLeafNode(otherlv_8, grammarAccess.getRegelAccess().getDannGeraetGeraetCrossReference_8_0()); 
            	

            }


            }

            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:453:2: ( (otherlv_9= RULE_ID ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:454:1: (otherlv_9= RULE_ID )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:454:1: (otherlv_9= RULE_ID )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:455:3: otherlv_9= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRegelRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegel931); 

            		newLeafNode(otherlv_9, grammarAccess.getRegelAccess().getDannZustandCrossReference_9_0()); 
            	

            }


            }

            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:466:2: (otherlv_10= '.' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:466:4: otherlv_10= '.'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleRegel944); 

                        	newLeafNode(otherlv_10, grammarAccess.getRegelAccess().getFullStopKeyword_10());
                        

                    }
                    break;

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
    // $ANTLR end "ruleRegel"


    // $ANTLR start "entryRuleArtikelKlein"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:478:1: entryRuleArtikelKlein returns [String current=null] : iv_ruleArtikelKlein= ruleArtikelKlein EOF ;
    public final String entryRuleArtikelKlein() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArtikelKlein = null;


        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:479:2: (iv_ruleArtikelKlein= ruleArtikelKlein EOF )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:480:2: iv_ruleArtikelKlein= ruleArtikelKlein EOF
            {
             newCompositeNode(grammarAccess.getArtikelKleinRule()); 
            pushFollow(FOLLOW_ruleArtikelKlein_in_entryRuleArtikelKlein983);
            iv_ruleArtikelKlein=ruleArtikelKlein();

            state._fsp--;

             current =iv_ruleArtikelKlein.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtikelKlein994); 

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
    // $ANTLR end "entryRuleArtikelKlein"


    // $ANTLR start "ruleArtikelKlein"
    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:487:1: ruleArtikelKlein returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'der' | kw= 'die' | kw= 'das' ) ;
    public final AntlrDatatypeRuleToken ruleArtikelKlein() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:490:28: ( (kw= 'der' | kw= 'die' | kw= 'das' ) )
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:491:1: (kw= 'der' | kw= 'die' | kw= 'das' )
            {
            // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:491:1: (kw= 'der' | kw= 'die' | kw= 'das' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:492:2: kw= 'der'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleArtikelKlein1032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArtikelKleinAccess().getDerKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:499:2: kw= 'die'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleArtikelKlein1051); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArtikelKleinAccess().getDieKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.jax.smarthome/src-gen/de/jax/smarthome/parser/antlr/internal/InternalRegelSprache.g:506:2: kw= 'das'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleArtikelKlein1070); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArtikelKleinAccess().getDasKeyword_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleArtikelKlein"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleModel130 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_ruleDefinition223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_ruleDefinition250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_entryRuleGeraet285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeraet295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtikel_in_ruleGeraet341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeraet358 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleGeraet375 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleZustand_in_ruleGeraet397 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleGeraet411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleZustand_in_ruleGeraet432 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13_in_ruleGeraet446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleZustand_in_ruleGeraet467 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_ruleArtikel_in_entryRuleArtikel508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtikel519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArtikel557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleArtikel576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleArtikel595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZustand_in_entryRuleZustand635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZustand645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleZustand686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_entryRuleRegel726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegel736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRegel773 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleArtikelKlein_in_ruleRegel794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegel814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegel834 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRegel846 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRegel858 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRegel870 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleArtikelKlein_in_ruleRegel891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegel911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegel931 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleRegel944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArtikelKlein_in_entryRuleArtikelKlein983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtikelKlein994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleArtikelKlein1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleArtikelKlein1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleArtikelKlein1070 = new BitSet(new long[]{0x0000000000000002L});

}