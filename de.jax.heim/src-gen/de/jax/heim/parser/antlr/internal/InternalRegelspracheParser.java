package de.jax.heim.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.jax.heim.services.RegelspracheGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRegelspracheParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g"; }



     	private RegelspracheGrammarAccess grammarAccess;
     	
        public InternalRegelspracheParser(TokenStream input, RegelspracheGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RegelspracheGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:76:1: ruleModel returns [EObject current=null] : ( (lv_deklarationen_0_0= ruleDeklaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_deklarationen_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:79:28: ( ( (lv_deklarationen_0_0= ruleDeklaration ) )* )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:80:1: ( (lv_deklarationen_0_0= ruleDeklaration ) )*
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:80:1: ( (lv_deklarationen_0_0= ruleDeklaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:81:1: (lv_deklarationen_0_0= ruleDeklaration )
            	    {
            	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:81:1: (lv_deklarationen_0_0= ruleDeklaration )
            	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:82:3: lv_deklarationen_0_0= ruleDeklaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeklarationenDeklarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeklaration_in_ruleModel130);
            	    lv_deklarationen_0_0=ruleDeklaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"deklarationen",
            	            		lv_deklarationen_0_0, 
            	            		"Deklaration");
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


    // $ANTLR start "entryRuleDeklaration"
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:106:1: entryRuleDeklaration returns [EObject current=null] : iv_ruleDeklaration= ruleDeklaration EOF ;
    public final EObject entryRuleDeklaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeklaration = null;


        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:107:2: (iv_ruleDeklaration= ruleDeklaration EOF )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:108:2: iv_ruleDeklaration= ruleDeklaration EOF
            {
             newCompositeNode(grammarAccess.getDeklarationRule()); 
            pushFollow(FOLLOW_ruleDeklaration_in_entryRuleDeklaration166);
            iv_ruleDeklaration=ruleDeklaration();

            state._fsp--;

             current =iv_ruleDeklaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeklaration176); 

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
    // $ANTLR end "entryRuleDeklaration"


    // $ANTLR start "ruleDeklaration"
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:115:1: ruleDeklaration returns [EObject current=null] : (this_Regel_0= ruleRegel | this_Geraet_1= ruleGeraet ) ;
    public final EObject ruleDeklaration() throws RecognitionException {
        EObject current = null;

        EObject this_Regel_0 = null;

        EObject this_Geraet_1 = null;


         enterRule(); 
            
        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:118:28: ( (this_Regel_0= ruleRegel | this_Geraet_1= ruleGeraet ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:119:1: (this_Regel_0= ruleRegel | this_Geraet_1= ruleGeraet )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:119:1: (this_Regel_0= ruleRegel | this_Geraet_1= ruleGeraet )
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
                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:120:5: this_Regel_0= ruleRegel
                    {
                     
                            newCompositeNode(grammarAccess.getDeklarationAccess().getRegelParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRegel_in_ruleDeklaration223);
                    this_Regel_0=ruleRegel();

                    state._fsp--;

                     
                            current = this_Regel_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:130:5: this_Geraet_1= ruleGeraet
                    {
                     
                            newCompositeNode(grammarAccess.getDeklarationAccess().getGeraetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGeraet_in_ruleDeklaration250);
                    this_Geraet_1=ruleGeraet();

                    state._fsp--;

                     
                            current = this_Geraet_1; 
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
    // $ANTLR end "ruleDeklaration"


    // $ANTLR start "entryRuleGeraet"
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:146:1: entryRuleGeraet returns [EObject current=null] : iv_ruleGeraet= ruleGeraet EOF ;
    public final EObject entryRuleGeraet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeraet = null;


        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:147:2: (iv_ruleGeraet= ruleGeraet EOF )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:148:2: iv_ruleGeraet= ruleGeraet EOF
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
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:155:1: ruleGeraet returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'kann' ( ( (lv_zustaende_2_0= ruleZustand ) ) (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )* )? ) ;
    public final EObject ruleGeraet() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_zustaende_2_0 = null;

        EObject lv_zustaende_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:158:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'kann' ( ( (lv_zustaende_2_0= ruleZustand ) ) (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )* )? ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'kann' ( ( (lv_zustaende_2_0= ruleZustand ) ) (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )* )? )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:159:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'kann' ( ( (lv_zustaende_2_0= ruleZustand ) ) (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )* )? )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:159:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'kann' ( ( (lv_zustaende_2_0= ruleZustand ) ) (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )* )?
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:159:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:160:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:160:1: (lv_name_0_0= RULE_ID )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:161:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeraet337); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGeraetAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeraetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleGeraet354); 

                	newLeafNode(otherlv_1, grammarAccess.getGeraetAccess().getKannKeyword_1());
                
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:181:1: ( ( (lv_zustaende_2_0= ruleZustand ) ) (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==RULE_ID||(LA4_1>=12 && LA4_1<=13)) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:181:2: ( (lv_zustaende_2_0= ruleZustand ) ) (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )*
                    {
                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:181:2: ( (lv_zustaende_2_0= ruleZustand ) )
                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:182:1: (lv_zustaende_2_0= ruleZustand )
                    {
                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:182:1: (lv_zustaende_2_0= ruleZustand )
                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:183:3: lv_zustaende_2_0= ruleZustand
                    {
                     
                    	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleZustand_in_ruleGeraet376);
                    lv_zustaende_2_0=ruleZustand();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGeraetRule());
                    	        }
                           		add(
                           			current, 
                           			"zustaende",
                            		lv_zustaende_2_0, 
                            		"Zustand");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:199:2: (otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:199:4: otherlv_3= ',' ( (lv_zustaende_4_0= ruleZustand ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleGeraet389); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getGeraetAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:203:1: ( (lv_zustaende_4_0= ruleZustand ) )
                    	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:204:1: (lv_zustaende_4_0= ruleZustand )
                    	    {
                    	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:204:1: (lv_zustaende_4_0= ruleZustand )
                    	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:205:3: lv_zustaende_4_0= ruleZustand
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleZustand_in_ruleGeraet410);
                    	    lv_zustaende_4_0=ruleZustand();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGeraetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"zustaende",
                    	            		lv_zustaende_4_0, 
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


    // $ANTLR start "entryRuleZustand"
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:229:1: entryRuleZustand returns [EObject current=null] : iv_ruleZustand= ruleZustand EOF ;
    public final EObject entryRuleZustand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZustand = null;


        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:230:2: (iv_ruleZustand= ruleZustand EOF )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:231:2: iv_ruleZustand= ruleZustand EOF
            {
             newCompositeNode(grammarAccess.getZustandRule()); 
            pushFollow(FOLLOW_ruleZustand_in_entryRuleZustand450);
            iv_ruleZustand=ruleZustand();

            state._fsp--;

             current =iv_ruleZustand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZustand460); 

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
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:238:1: ruleZustand returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleZustand() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:241:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:242:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:242:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:243:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:243:1: (lv_name_0_0= RULE_ID )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:244:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleZustand501); 

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
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:268:1: entryRuleRegel returns [EObject current=null] : iv_ruleRegel= ruleRegel EOF ;
    public final EObject entryRuleRegel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegel = null;


        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:269:2: (iv_ruleRegel= ruleRegel EOF )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:270:2: iv_ruleRegel= ruleRegel EOF
            {
             newCompositeNode(grammarAccess.getRegelRule()); 
            pushFollow(FOLLOW_ruleRegel_in_entryRuleRegel541);
            iv_ruleRegel=ruleRegel();

            state._fsp--;

             current =iv_ruleRegel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegel551); 

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
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:277:1: ruleRegel returns [EObject current=null] : (otherlv_0= 'Wenn' ( (lv_wenn_1_0= ruleQualifiedName ) ) otherlv_2= 'dann' ( (lv_dann_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleRegel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_wenn_1_0 = null;

        AntlrDatatypeRuleToken lv_dann_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:280:28: ( (otherlv_0= 'Wenn' ( (lv_wenn_1_0= ruleQualifiedName ) ) otherlv_2= 'dann' ( (lv_dann_3_0= ruleQualifiedName ) ) ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:281:1: (otherlv_0= 'Wenn' ( (lv_wenn_1_0= ruleQualifiedName ) ) otherlv_2= 'dann' ( (lv_dann_3_0= ruleQualifiedName ) ) )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:281:1: (otherlv_0= 'Wenn' ( (lv_wenn_1_0= ruleQualifiedName ) ) otherlv_2= 'dann' ( (lv_dann_3_0= ruleQualifiedName ) ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:281:3: otherlv_0= 'Wenn' ( (lv_wenn_1_0= ruleQualifiedName ) ) otherlv_2= 'dann' ( (lv_dann_3_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRegel588); 

                	newLeafNode(otherlv_0, grammarAccess.getRegelAccess().getWennKeyword_0());
                
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:285:1: ( (lv_wenn_1_0= ruleQualifiedName ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:286:1: (lv_wenn_1_0= ruleQualifiedName )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:286:1: (lv_wenn_1_0= ruleQualifiedName )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:287:3: lv_wenn_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getRegelAccess().getWennQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRegel609);
            lv_wenn_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegelRule());
            	        }
                   		set(
                   			current, 
                   			"wenn",
                    		lv_wenn_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRegel621); 

                	newLeafNode(otherlv_2, grammarAccess.getRegelAccess().getDannKeyword_2());
                
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:307:1: ( (lv_dann_3_0= ruleQualifiedName ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:308:1: (lv_dann_3_0= ruleQualifiedName )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:308:1: (lv_dann_3_0= ruleQualifiedName )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:309:3: lv_dann_3_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getRegelAccess().getDannQualifiedNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRegel642);
            lv_dann_3_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRegelRule());
            	        }
                   		set(
                   			current, 
                   			"dann",
                    		lv_dann_3_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRegel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:333:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:334:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:335:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName679);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName690); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:342:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:345:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:346:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:346:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:346:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName730); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:353:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.jax.heim/src-gen/de/jax/heim/parser/antlr/internal/InternalRegelsprache.g:354:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName749); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName764); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeklaration_in_ruleModel130 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_ruleDeklaration_in_entryRuleDeklaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeklaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_ruleDeklaration223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_ruleDeklaration250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeraet_in_entryRuleGeraet285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeraet295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeraet337 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleGeraet354 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleZustand_in_ruleGeraet376 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleGeraet389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleZustand_in_ruleGeraet410 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleZustand_in_entryRuleZustand450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZustand460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleZustand501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegel_in_entryRuleRegel541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegel551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRegel588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRegel609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRegel621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRegel642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName730 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName764 = new BitSet(new long[]{0x0000000000008002L});

}