/*
* generated by Xtext
*/
grammar InternalRegelSprache;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.jax.smarthome.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDefinitionenDefinitionParserRuleCall_0()); 
	    }
		lv_definitionen_0_0=ruleDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"definitionen",
        		lv_definitionen_0_0, 
        		"Definition");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDefinitionAccess().getGeraetParserRuleCall_0()); 
    }
    this_Geraet_0=ruleGeraet
    { 
        $current = $this_Geraet_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getDefinitionAccess().getRegelParserRuleCall_1()); 
    }
    this_Regel_1=ruleRegel
    { 
        $current = $this_Regel_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleGeraet
entryRuleGeraet returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGeraetRule()); }
	 iv_ruleGeraet=ruleGeraet 
	 { $current=$iv_ruleGeraet.current; } 
	 EOF 
;

// Rule Geraet
ruleGeraet returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getGeraetAccess().getArtikelArtikelParserRuleCall_0_0()); 
	    }
		lv_artikel_0_0=ruleArtikel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGeraetRule());
	        }
       		set(
       			$current, 
       			"artikel",
        		lv_artikel_0_0, 
        		"Artikel");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getGeraetAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeraetRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='kann' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGeraetAccess().getKannKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_0_0()); 
	    }
		lv_zustaende_3_0=ruleZustand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGeraetRule());
	        }
       		add(
       			$current, 
       			"zustaende",
        		lv_zustaende_3_0, 
        		"Zustand");
	        afterParserOrEnumRuleCall();
	    }

)
)((	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGeraetAccess().getCommaKeyword_3_1_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_0_1_0()); 
	    }
		lv_zustaende_5_0=ruleZustand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGeraetRule());
	        }
       		add(
       			$current, 
       			"zustaende",
        		lv_zustaende_5_0, 
        		"Zustand");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='und' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getGeraetAccess().getUndKeyword_3_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGeraetAccess().getZustaendeZustandParserRuleCall_3_1_2_0()); 
	    }
		lv_zustaende_7_0=ruleZustand		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGeraetRule());
	        }
       		add(
       			$current, 
       			"zustaende",
        		lv_zustaende_7_0, 
        		"Zustand");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleArtikel
entryRuleArtikel returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getArtikelRule()); } 
	 iv_ruleArtikel=ruleArtikel 
	 { $current=$iv_ruleArtikel.current.getText(); }  
	 EOF 
;

// Rule Artikel
ruleArtikel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='Der' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getArtikelAccess().getDerKeyword_0()); 
    }

    |
	kw='Die' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getArtikelAccess().getDieKeyword_1()); 
    }

    |
	kw='Das' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getArtikelAccess().getDasKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleZustand
entryRuleZustand returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getZustandRule()); }
	 iv_ruleZustand=ruleZustand 
	 { $current=$iv_ruleZustand.current; } 
	 EOF 
;

// Rule Zustand
ruleZustand returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getZustandAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getZustandRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleRegel
entryRuleRegel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRegelRule()); }
	 iv_ruleRegel=ruleRegel 
	 { $current=$iv_ruleRegel.current; } 
	 EOF 
;

// Rule Regel
ruleRegel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Wenn' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRegelAccess().getWennKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRegelAccess().getWennArtikelArtikelKleinParserRuleCall_1_0()); 
	    }
		lv_wennArtikel_1_0=ruleArtikelKlein		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRegelRule());
	        }
       		set(
       			$current, 
       			"wennArtikel",
        		lv_wennArtikel_1_0, 
        		"ArtikelKlein");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRegelRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getRegelAccess().getWennGeraetGeraetCrossReference_2_0()); 
	}

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRegelRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getRegelAccess().getWennZustandCrossReference_3_0()); 
	}

)
)	otherlv_4='ist' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRegelAccess().getIstKeyword_4());
    }
	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRegelAccess().getCommaKeyword_5());
    }
	otherlv_6='muss' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRegelAccess().getMussKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRegelAccess().getDannArtikelArtikelKleinParserRuleCall_7_0()); 
	    }
		lv_dannArtikel_7_0=ruleArtikelKlein		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRegelRule());
	        }
       		set(
       			$current, 
       			"dannArtikel",
        		lv_dannArtikel_7_0, 
        		"ArtikelKlein");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRegelRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getRegelAccess().getDannGeraetGeraetCrossReference_8_0()); 
	}

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRegelRule());
	        }
        }
	otherlv_9=RULE_ID
	{
		newLeafNode(otherlv_9, grammarAccess.getRegelAccess().getDannZustandCrossReference_9_0()); 
	}

)
)(	otherlv_10='.' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getRegelAccess().getFullStopKeyword_10());
    }
)?)
;





// Entry rule entryRuleArtikelKlein
entryRuleArtikelKlein returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getArtikelKleinRule()); } 
	 iv_ruleArtikelKlein=ruleArtikelKlein 
	 { $current=$iv_ruleArtikelKlein.current.getText(); }  
	 EOF 
;

// Rule ArtikelKlein
ruleArtikelKlein returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='der' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getArtikelKleinAccess().getDerKeyword_0()); 
    }

    |
	kw='die' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getArtikelKleinAccess().getDieKeyword_1()); 
    }

    |
	kw='das' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getArtikelKleinAccess().getDasKeyword_2()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

