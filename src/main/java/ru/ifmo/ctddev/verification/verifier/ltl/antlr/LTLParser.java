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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEXT=1, GLOB=2, FUTURE=3, RELEASE=4, UNTIL=5, AND=6, OR=7, IMPL=8, EQ=9, 
		LP=10, RP=11, NOT=12, TRUE=13, FALSE=14, SL=15, WS=16, ErrorChar=17;
	public static final int
		RULE_ltl = 0, RULE_primary = 1, RULE_constant = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"ltl", "primary", "constant"
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

	@Override
	public String getGrammarFileName() { return "LTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LtlContext extends ParserRuleContext {
		public BaseFormula formula;
		public LtlContext left;
		public PrimaryContext primary;
		public LtlContext ltl;
		public LtlContext right;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(LTLParser.NEXT, 0); }
		public List<LtlContext> ltl() {
			return getRuleContexts(LtlContext.class);
		}
		public LtlContext ltl(int i) {
			return getRuleContext(LtlContext.class,i);
		}
		public TerminalNode GLOB() { return getToken(LTLParser.GLOB, 0); }
		public TerminalNode FUTURE() { return getToken(LTLParser.FUTURE, 0); }
		public TerminalNode RELEASE() { return getToken(LTLParser.RELEASE, 0); }
		public TerminalNode UNTIL() { return getToken(LTLParser.UNTIL, 0); }
		public TerminalNode AND() { return getToken(LTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(LTLParser.OR, 0); }
		public TerminalNode IMPL() { return getToken(LTLParser.IMPL, 0); }
		public TerminalNode EQ() { return getToken(LTLParser.EQ, 0); }
		public LtlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterLtl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitLtl(this);
		}
	}

	public final LtlContext ltl() throws RecognitionException {
		return ltl(0);
	}

	private LtlContext ltl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LtlContext _localctx = new LtlContext(_ctx, _parentState);
		LtlContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_ltl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case NOT:
			case TRUE:
			case FALSE:
			case SL:
				{
				setState(7);
				((LtlContext)_localctx).primary = primary();
				((LtlContext)_localctx).formula =  ((LtlContext)_localctx).primary.formula;
				}
				break;
			case NEXT:
				{
				setState(10);
				match(NEXT);
				setState(11);
				((LtlContext)_localctx).ltl = ltl(9);
				((LtlContext)_localctx).formula =  new Next(((LtlContext)_localctx).ltl.formula);
				}
				break;
			case GLOB:
				{
				setState(14);
				match(GLOB);
				setState(15);
				((LtlContext)_localctx).ltl = ltl(8);
				((LtlContext)_localctx).formula =  new BinaryFormula(new Const(false), ((LtlContext)_localctx).ltl.formula, Operator.RELEASE);
				}
				break;
			case FUTURE:
				{
				setState(18);
				match(FUTURE);
				setState(19);
				((LtlContext)_localctx).ltl = ltl(7);
				((LtlContext)_localctx).formula =  new BinaryFormula(new Const(true), ((LtlContext)_localctx).ltl.formula, Operator.UNTIL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(54);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(24);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(25);
						match(RELEASE);
						setState(26);
						((LtlContext)_localctx).right = ((LtlContext)_localctx).ltl = ltl(7);
						((LtlContext)_localctx).formula =  new BinaryFormula(((LtlContext)_localctx).left.formula, ((LtlContext)_localctx).right.formula, Operator.RELEASE);
						}
						break;
					case 2:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(29);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(30);
						match(UNTIL);
						setState(31);
						((LtlContext)_localctx).right = ((LtlContext)_localctx).ltl = ltl(6);
						((LtlContext)_localctx).formula =  new BinaryFormula(((LtlContext)_localctx).left.formula, ((LtlContext)_localctx).right.formula, Operator.UNTIL);
						}
						break;
					case 3:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(34);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(35);
						match(AND);
						setState(36);
						((LtlContext)_localctx).right = ((LtlContext)_localctx).ltl = ltl(5);
						((LtlContext)_localctx).formula =  new BinaryFormula(((LtlContext)_localctx).left.formula, ((LtlContext)_localctx).right.formula, Operator.AND);
						}
						break;
					case 4:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(39);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(40);
						match(OR);
						setState(41);
						((LtlContext)_localctx).right = ((LtlContext)_localctx).ltl = ltl(4);
						((LtlContext)_localctx).formula =  new BinaryFormula(((LtlContext)_localctx).left.formula, ((LtlContext)_localctx).right.formula, Operator.OR);
						}
						break;
					case 5:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(44);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(45);
						match(IMPL);
						setState(46);
						((LtlContext)_localctx).right = ((LtlContext)_localctx).ltl = ltl(2);
						((LtlContext)_localctx).formula =  new BinaryFormula(new Not(((LtlContext)_localctx).left.formula), ((LtlContext)_localctx).right.formula, Operator.OR);
						}
						break;
					case 6:
						{
						_localctx = new LtlContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ltl);
						setState(49);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(50);
						match(EQ);
						setState(51);
						((LtlContext)_localctx).right = ((LtlContext)_localctx).ltl = ltl(2);
						((LtlContext)_localctx).formula =  new BinaryFormula(new BinaryFormula(new Not(((LtlContext)_localctx).left.formula), ((LtlContext)_localctx).right.formula, Operator.OR), new BinaryFormula(new Not(((LtlContext)_localctx).right.formula), ((LtlContext)_localctx).left.formula, Operator.OR), Operator.AND);
						}
						break;
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public BaseFormula formula;
		public ConstantContext constant;
		public LtlContext ltl;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LP() { return getToken(LTLParser.LP, 0); }
		public LtlContext ltl() {
			return getRuleContext(LtlContext.class,0);
		}
		public TerminalNode RP() { return getToken(LTLParser.RP, 0); }
		public TerminalNode NOT() { return getToken(LTLParser.NOT, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primary);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case SL:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((PrimaryContext)_localctx).constant = constant();
				((PrimaryContext)_localctx).formula =  ((PrimaryContext)_localctx).constant.formula;
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(LP);
				setState(63);
				((PrimaryContext)_localctx).ltl = ltl(0);
				setState(64);
				match(RP);
				((PrimaryContext)_localctx).formula =  ((PrimaryContext)_localctx).ltl.formula;
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(NOT);
				setState(68);
				((PrimaryContext)_localctx).ltl = ltl(0);
				((PrimaryContext)_localctx).formula =  new Not(((PrimaryContext)_localctx).ltl.formula);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public BaseFormula formula;
		public Token SL;
		public TerminalNode TRUE() { return getToken(LTLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LTLParser.FALSE, 0); }
		public TerminalNode SL() { return getToken(LTLParser.SL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LTLListener ) ((LTLListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(TRUE);
				((ConstantContext)_localctx).formula =  new Const(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(FALSE);
				((ConstantContext)_localctx).formula =  new Const(false);
				}
				break;
			case SL:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((ConstantContext)_localctx).SL = match(SL);

				            String name = (((ConstantContext)_localctx).SL!=null?((ConstantContext)_localctx).SL.getText():null);
				            ((ConstantContext)_localctx).formula =  new Var(name.substring(1, name.length() - 1));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return ltl_sempred((LtlContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ltl_sempred(LtlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\31\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"9\n\2\f\2\16\2<\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\4\2\3\2\5\2\4\6\2\2\2]\2\30"+
		"\3\2\2\2\4I\3\2\2\2\6Q\3\2\2\2\b\t\b\2\1\2\t\n\5\4\3\2\n\13\b\2\1\2\13"+
		"\31\3\2\2\2\f\r\7\3\2\2\r\16\5\2\2\13\16\17\b\2\1\2\17\31\3\2\2\2\20\21"+
		"\7\4\2\2\21\22\5\2\2\n\22\23\b\2\1\2\23\31\3\2\2\2\24\25\7\5\2\2\25\26"+
		"\5\2\2\t\26\27\b\2\1\2\27\31\3\2\2\2\30\b\3\2\2\2\30\f\3\2\2\2\30\20\3"+
		"\2\2\2\30\24\3\2\2\2\31:\3\2\2\2\32\33\f\b\2\2\33\34\7\6\2\2\34\35\5\2"+
		"\2\t\35\36\b\2\1\2\369\3\2\2\2\37 \f\7\2\2 !\7\7\2\2!\"\5\2\2\b\"#\b\2"+
		"\1\2#9\3\2\2\2$%\f\6\2\2%&\7\b\2\2&\'\5\2\2\7\'(\b\2\1\2(9\3\2\2\2)*\f"+
		"\5\2\2*+\7\t\2\2+,\5\2\2\6,-\b\2\1\2-9\3\2\2\2./\f\4\2\2/\60\7\n\2\2\60"+
		"\61\5\2\2\4\61\62\b\2\1\2\629\3\2\2\2\63\64\f\3\2\2\64\65\7\13\2\2\65"+
		"\66\5\2\2\4\66\67\b\2\1\2\679\3\2\2\28\32\3\2\2\28\37\3\2\2\28$\3\2\2"+
		"\28)\3\2\2\28.\3\2\2\28\63\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\3\3"+
		"\2\2\2<:\3\2\2\2=>\5\6\4\2>?\b\3\1\2?J\3\2\2\2@A\7\f\2\2AB\5\2\2\2BC\7"+
		"\r\2\2CD\b\3\1\2DJ\3\2\2\2EF\7\16\2\2FG\5\2\2\2GH\b\3\1\2HJ\3\2\2\2I="+
		"\3\2\2\2I@\3\2\2\2IE\3\2\2\2J\5\3\2\2\2KL\7\17\2\2LR\b\4\1\2MN\7\20\2"+
		"\2NR\b\4\1\2OP\7\21\2\2PR\b\4\1\2QK\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\7\3\2"+
		"\2\2\7\308:IQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}