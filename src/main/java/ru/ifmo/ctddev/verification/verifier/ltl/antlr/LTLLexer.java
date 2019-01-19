// Generated from /Users/Alex/Documents/Education/Verifier/src/main/antlr4/ru/ifmo/ctddev/verification/verifier/ltl/antlr/LTL.g4 by ANTLR 4.7.2
package ru.ifmo.ctddev.verification.verifier.ltl.antlr;

import ru.ifmo.ctddev.verification.verifier.ltl.BaseFormula;
import ru.ifmo.ctddev.verification.verifier.ltl.BinaryFormula;
import ru.ifmo.ctddev.verification.verifier.ltl.Const;
import ru.ifmo.ctddev.verification.verifier.ltl.LtlVisitor;
import ru.ifmo.ctddev.verification.verifier.ltl.Next;
import ru.ifmo.ctddev.verification.verifier.ltl.Not;
import ru.ifmo.ctddev.verification.verifier.ltl.Operator;
import ru.ifmo.ctddev.verification.verifier.ltl.Var;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LTLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEXT=1, GLOB=2, FUTURE=3, RELEASE=4, UNTIL=5, AND=6, OR=7, IMPL=8, EQ=9, 
		LP=10, RP=11, NOT=12, TRUE=13, FALSE=14, SL=15, WS=16, ErrorChar=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEXT", "GLOB", "FUTURE", "RELEASE", "UNTIL", "AND", "OR", "IMPL", "EQ", 
			"LP", "RP", "NOT", "TRUE", "FALSE", "SL", "SL1", "SL2", "ESC", "WS", 
			"ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'X'", "'G'", "'F'", "'R'", "'U'", "'&'", "'|'", "'->'", "'=='", 
			"'('", "')'", "'!'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEXT", "GLOB", "FUTURE", "RELEASE", "UNTIL", "AND", "OR", "IMPL", 
			"EQ", "LP", "RP", "NOT", "TRUE", "FALSE", "SL", "WS", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LTLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 19:
			ErrorChar_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ErrorChar_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        System.err.println("Invalid character: ");
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20S\n\20"+
		"\3\21\3\21\3\21\6\21X\n\21\r\21\16\21Y\3\21\3\21\3\22\3\22\3\22\6\22a"+
		"\n\22\r\22\16\22b\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\2#\2%\2\'\22)\23\3\2\6\6\2\f\f\17\17))^^\6\2\f"+
		"\f\17\17$$^^\13\2$$))^^cdhhppttvvxx\5\2\13\f\16\17\"\"\2q\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2"+
		"\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17"+
		"\67\3\2\2\2\219\3\2\2\2\23<\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31C\3\2\2"+
		"\2\33E\3\2\2\2\35J\3\2\2\2\37R\3\2\2\2!T\3\2\2\2#]\3\2\2\2%f\3\2\2\2\'"+
		"i\3\2\2\2)m\3\2\2\2+,\7Z\2\2,\4\3\2\2\2-.\7I\2\2.\6\3\2\2\2/\60\7H\2\2"+
		"\60\b\3\2\2\2\61\62\7T\2\2\62\n\3\2\2\2\63\64\7W\2\2\64\f\3\2\2\2\65\66"+
		"\7(\2\2\66\16\3\2\2\2\678\7~\2\28\20\3\2\2\29:\7/\2\2:;\7@\2\2;\22\3\2"+
		"\2\2<=\7?\2\2=>\7?\2\2>\24\3\2\2\2?@\7*\2\2@\26\3\2\2\2AB\7+\2\2B\30\3"+
		"\2\2\2CD\7#\2\2D\32\3\2\2\2EF\7v\2\2FG\7t\2\2GH\7w\2\2HI\7g\2\2I\34\3"+
		"\2\2\2JK\7h\2\2KL\7c\2\2LM\7n\2\2MN\7u\2\2NO\7g\2\2O\36\3\2\2\2PS\5!\21"+
		"\2QS\5#\22\2RP\3\2\2\2RQ\3\2\2\2S \3\2\2\2TW\7)\2\2UX\n\2\2\2VX\5%\23"+
		"\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7)\2"+
		"\2\\\"\3\2\2\2]`\7$\2\2^a\n\3\2\2_a\5%\23\2`^\3\2\2\2`_\3\2\2\2ab\3\2"+
		"\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7$\2\2e$\3\2\2\2fg\7^\2\2gh\t\4\2"+
		"\2h&\3\2\2\2ij\t\5\2\2jk\3\2\2\2kl\b\24\2\2l(\3\2\2\2mn\13\2\2\2no\b\25"+
		"\3\2o*\3\2\2\2\b\2RWY`b\4\b\2\2\3\25\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}