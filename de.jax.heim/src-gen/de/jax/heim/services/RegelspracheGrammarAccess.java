/*
* generated by Xtext
*/
package de.jax.heim.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RegelspracheGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cDeklarationenAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDeklarationenDeklarationParserRuleCall_0 = (RuleCall)cDeklarationenAssignment.eContents().get(0);
		
		//Model:
		//	deklarationen+=Deklaration*;
		public ParserRule getRule() { return rule; }

		//deklarationen+=Deklaration*
		public Assignment getDeklarationenAssignment() { return cDeklarationenAssignment; }

		//Deklaration
		public RuleCall getDeklarationenDeklarationParserRuleCall_0() { return cDeklarationenDeklarationParserRuleCall_0; }
	}

	public class DeklarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Deklaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRegelParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGeraetParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Deklaration:
		//	Regel | Geraet;
		public ParserRule getRule() { return rule; }

		//Regel | Geraet
		public Alternatives getAlternatives() { return cAlternatives; }

		//Regel
		public RuleCall getRegelParserRuleCall_0() { return cRegelParserRuleCall_0; }

		//Geraet
		public RuleCall getGeraetParserRuleCall_1() { return cGeraetParserRuleCall_1; }
	}

	public class GeraetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Geraet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cKannKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cZustaendeAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cZustaendeZustandParserRuleCall_2_0_0 = (RuleCall)cZustaendeAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cZustaendeAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cZustaendeZustandParserRuleCall_2_1_1_0 = (RuleCall)cZustaendeAssignment_2_1_1.eContents().get(0);
		
		//Geraet:
		//	name=ID "kann" (zustaende+=Zustand ("," zustaende+=Zustand)*)?;
		public ParserRule getRule() { return rule; }

		//name=ID "kann" (zustaende+=Zustand ("," zustaende+=Zustand)*)?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"kann"
		public Keyword getKannKeyword_1() { return cKannKeyword_1; }

		//(zustaende+=Zustand ("," zustaende+=Zustand)*)?
		public Group getGroup_2() { return cGroup_2; }

		//zustaende+=Zustand
		public Assignment getZustaendeAssignment_2_0() { return cZustaendeAssignment_2_0; }

		//Zustand
		public RuleCall getZustaendeZustandParserRuleCall_2_0_0() { return cZustaendeZustandParserRuleCall_2_0_0; }

		//("," zustaende+=Zustand)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//zustaende+=Zustand
		public Assignment getZustaendeAssignment_2_1_1() { return cZustaendeAssignment_2_1_1; }

		//Zustand
		public RuleCall getZustaendeZustandParserRuleCall_2_1_1_0() { return cZustaendeZustandParserRuleCall_2_1_1_0; }
	}

	public class ZustandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Zustand");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Zustand:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class RegelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Regel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWennKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cWennAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cWennQualifiedNameParserRuleCall_1_0 = (RuleCall)cWennAssignment_1.eContents().get(0);
		private final Keyword cDannKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDannAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDannQualifiedNameParserRuleCall_3_0 = (RuleCall)cDannAssignment_3.eContents().get(0);
		
		//Regel:
		//	"Wenn" wenn=QualifiedName "dann" dann=QualifiedName;
		public ParserRule getRule() { return rule; }

		//"Wenn" wenn=QualifiedName "dann" dann=QualifiedName
		public Group getGroup() { return cGroup; }

		//"Wenn"
		public Keyword getWennKeyword_0() { return cWennKeyword_0; }

		//wenn=QualifiedName
		public Assignment getWennAssignment_1() { return cWennAssignment_1; }

		//QualifiedName
		public RuleCall getWennQualifiedNameParserRuleCall_1_0() { return cWennQualifiedNameParserRuleCall_1_0; }

		//"dann"
		public Keyword getDannKeyword_2() { return cDannKeyword_2; }

		//dann=QualifiedName
		public Assignment getDannAssignment_3() { return cDannAssignment_3; }

		//QualifiedName
		public RuleCall getDannQualifiedNameParserRuleCall_3_0() { return cDannQualifiedNameParserRuleCall_3_0; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private ModelElements pModel;
	private DeklarationElements pDeklaration;
	private GeraetElements pGeraet;
	private ZustandElements pZustand;
	private RegelElements pRegel;
	private QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public RegelspracheGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.jax.heim.Regelsprache".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	deklarationen+=Deklaration*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Deklaration:
	//	Regel | Geraet;
	public DeklarationElements getDeklarationAccess() {
		return (pDeklaration != null) ? pDeklaration : (pDeklaration = new DeklarationElements());
	}
	
	public ParserRule getDeklarationRule() {
		return getDeklarationAccess().getRule();
	}

	//Geraet:
	//	name=ID "kann" (zustaende+=Zustand ("," zustaende+=Zustand)*)?;
	public GeraetElements getGeraetAccess() {
		return (pGeraet != null) ? pGeraet : (pGeraet = new GeraetElements());
	}
	
	public ParserRule getGeraetRule() {
		return getGeraetAccess().getRule();
	}

	//Zustand:
	//	name=ID;
	public ZustandElements getZustandAccess() {
		return (pZustand != null) ? pZustand : (pZustand = new ZustandElements());
	}
	
	public ParserRule getZustandRule() {
		return getZustandAccess().getRule();
	}

	//Regel:
	//	"Wenn" wenn=QualifiedName "dann" dann=QualifiedName;
	public RegelElements getRegelAccess() {
		return (pRegel != null) ? pRegel : (pRegel = new RegelElements());
	}
	
	public ParserRule getRegelRule() {
		return getRegelAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
