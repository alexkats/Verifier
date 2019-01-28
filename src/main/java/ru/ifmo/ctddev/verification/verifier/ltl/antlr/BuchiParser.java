// Generated from /Users/Alex/Documents/Education/Verifier/src/main/antlr4/ru/ifmo/ctddev/verification/verifier/ltl/antlr/Buchi.g4 by ANTLR 4.7.2
package ru.ifmo.ctddev.verification.verifier.ltl.antlr;

import ru.ifmo.ctddev.verification.verifier.fsm.FSMAutomaton;
import ru.ifmo.ctddev.verification.verifier.fsm.FSMElement;
import ru.ifmo.ctddev.verification.verifier.fsm.FSMState;
import ru.ifmo.ctddev.verification.verifier.fsm.FSMTransition;
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
public class BuchiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, WS=17, 
		False=18, SL=19, One=20, BlockComment=21;
	public static final int
		RULE_fsm = 0, RULE_stateD = 1, RULE_stateN = 2, RULE_transitionD = 3, 
		RULE_expr = 4, RULE_lit = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"fsm", "stateD", "stateN", "transitionD", "expr", "lit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'never'", "'{'", "'}'", "':'", "'skip'", "'if'", "'fi'", "';'", 
			"'::'", "'->'", "'goto'", "'('", "')'", "'!'", "'&&'", "'||'", null, 
			"'false;'", null, "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WS", "False", "SL", "One", "BlockComment"
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
	public String getGrammarFileName() { return "Buchi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BuchiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FsmContext extends ParserRuleContext {
		public List<FSMState> l;
		public StateDContext stateD;
		public TerminalNode EOF() { return getToken(BuchiParser.EOF, 0); }
		public TerminalNode False() { return getToken(BuchiParser.False, 0); }
		public List<StateDContext> stateD() {
			return getRuleContexts(StateDContext.class);
		}
		public StateDContext stateD(int i) {
			return getRuleContext(StateDContext.class,i);
		}
		public FsmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fsm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).enterFsm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).exitFsm(this);
		}
	}

	public final FsmContext fsm() throws RecognitionException {
		FsmContext _localctx = new FsmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fsm);
		((FsmContext)_localctx).l =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(T__1);
			{
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case SL:
				{
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL) {
					{
					{
					setState(14);
					((FsmContext)_localctx).stateD = stateD();
					_localctx.l.add(((FsmContext)_localctx).stateD.state);
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case False:
				{
				setState(22);
				match(False);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(25);
			match(T__2);
			}
			setState(27);
			match(EOF);
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

	public static class StateDContext extends ParserRuleContext {
		public FSMState state;
		public StateNContext stateN;
		public TransitionDContext transitionD;
		public StateNContext stateN() {
			return getRuleContext(StateNContext.class,0);
		}
		public TerminalNode False() { return getToken(BuchiParser.False, 0); }
		public List<TransitionDContext> transitionD() {
			return getRuleContexts(TransitionDContext.class);
		}
		public TransitionDContext transitionD(int i) {
			return getRuleContext(TransitionDContext.class,i);
		}
		public StateDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).enterStateD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).exitStateD(this);
		}
	}

	public final StateDContext stateD() throws RecognitionException {
		StateDContext _localctx = new StateDContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stateD);
		List<FSMTransition> l = new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			((StateDContext)_localctx).stateN = stateN();
			setState(30);
			match(T__3);
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(31);
				match(T__4);
				}
				break;
			case False:
				{
				setState(32);
				match(False);
				}
				break;
			case T__5:
				{
				{
				setState(33);
				match(T__5);
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					((StateDContext)_localctx).transitionD = transitionD();
					l.add(((StateDContext)_localctx).transitionD.edge);
					}
					}
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(41);
				match(T__6);
				setState(42);
				match(T__7);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        String name = (((StateDContext)_localctx).stateN!=null?_input.getText(((StateDContext)_localctx).stateN.start,((StateDContext)_localctx).stateN.stop):null);
			        ((StateDContext)_localctx).state =  new FSMState(name, l);
			    
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

	public static class StateNContext extends ParserRuleContext {
		public TerminalNode SL() { return getToken(BuchiParser.SL, 0); }
		public StateNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).enterStateN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).exitStateN(this);
		}
	}

	public final StateNContext stateN() throws RecognitionException {
		StateNContext _localctx = new StateNContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stateN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(SL);
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

	public static class TransitionDContext extends ParserRuleContext {
		public FSMTransition edge;
		public ExprContext expr;
		public StateNContext stateN;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StateNContext stateN() {
			return getRuleContext(StateNContext.class,0);
		}
		public TransitionDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).enterTransitionD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).exitTransitionD(this);
		}
	}

	public final TransitionDContext transitionD() throws RecognitionException {
		TransitionDContext _localctx = new TransitionDContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transitionD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__8);
			setState(51);
			((TransitionDContext)_localctx).expr = expr(0);
			setState(52);
			match(T__9);
			setState(53);
			match(T__10);
			setState(54);
			((TransitionDContext)_localctx).stateN = stateN();
			((TransitionDContext)_localctx).edge =  new FSMTransition(((TransitionDContext)_localctx).expr.formula, (((TransitionDContext)_localctx).stateN!=null?_input.getText(((TransitionDContext)_localctx).stateN.start,((TransitionDContext)_localctx).stateN.stop):null));
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

	public static class ExprContext extends ParserRuleContext {
		public BaseFormula formula;
		public ExprContext left;
		public ExprContext expr;
		public LitContext lit;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LitContext lit() {
			return getRuleContext(LitContext.class,0);
		}
		public TerminalNode One() { return getToken(BuchiParser.One, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(58);
				match(T__11);
				setState(59);
				((ExprContext)_localctx).expr = expr(0);
				setState(60);
				match(T__12);
				 ((ExprContext)_localctx).formula =  ((ExprContext)_localctx).expr.formula;
				}
				break;
			case SL:
				{
				setState(63);
				((ExprContext)_localctx).lit = lit();
				((ExprContext)_localctx).formula =  new Var((((ExprContext)_localctx).lit!=null?_input.getText(((ExprContext)_localctx).lit.start,((ExprContext)_localctx).lit.stop):null));
				}
				break;
			case T__13:
				{
				setState(66);
				match(T__13);
				setState(67);
				((ExprContext)_localctx).expr = expr(4);
				((ExprContext)_localctx).formula =  new Not(((ExprContext)_localctx).expr.formula);
				}
				break;
			case One:
				{
				setState(70);
				match(One);
				((ExprContext)_localctx).formula =  new Const(true);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(75);
						match(T__14);
						setState(76);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(4);
						((ExprContext)_localctx).formula =  new BinaryFormula(((ExprContext)_localctx).left.formula, ((ExprContext)_localctx).right.formula, Operator.AND);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(80);
						match(T__15);
						setState(81);
						((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(3);
						((ExprContext)_localctx).formula =  new BinaryFormula(((ExprContext)_localctx).left.formula, ((ExprContext)_localctx).right.formula, Operator.OR);
						}
						break;
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class LitContext extends ParserRuleContext {
		public TerminalNode SL() { return getToken(BuchiParser.SL, 0); }
		public LitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuchiListener ) ((BuchiListener)listener).exitLit(this);
		}
	}

	public final LitContext lit() throws RecognitionException {
		LitContext _localctx = new LitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(SL);
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\5\2\32\n\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6W\n\6\f"+
		"\6\16\6Z\13\6\3\7\3\7\3\7\2\3\n\b\2\4\6\b\n\f\2\2\2a\2\16\3\2\2\2\4\37"+
		"\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\nJ\3\2\2\2\f[\3\2\2\2\16\17\7\3\2\2"+
		"\17\31\7\4\2\2\20\21\5\4\3\2\21\22\b\2\1\2\22\24\3\2\2\2\23\20\3\2\2\2"+
		"\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\32\3\2\2\2\27\25\3\2\2\2"+
		"\30\32\7\24\2\2\31\25\3\2\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\34\7\5\2"+
		"\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \5\6\4\2 .\7\6\2\2!/\7"+
		"\7\2\2\"/\7\24\2\2#\'\7\b\2\2$%\5\b\5\2%&\b\3\1\2&(\3\2\2\2\'$\3\2\2\2"+
		"()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\t\2\2,-\7\n\2\2-/\3\2\2"+
		"\2.!\3\2\2\2.\"\3\2\2\2.#\3\2\2\2/\60\3\2\2\2\60\61\b\3\1\2\61\5\3\2\2"+
		"\2\62\63\7\25\2\2\63\7\3\2\2\2\64\65\7\13\2\2\65\66\5\n\6\2\66\67\7\f"+
		"\2\2\678\7\r\2\289\5\6\4\29:\b\5\1\2:\t\3\2\2\2;<\b\6\1\2<=\7\16\2\2="+
		">\5\n\6\2>?\7\17\2\2?@\b\6\1\2@K\3\2\2\2AB\5\f\7\2BC\b\6\1\2CK\3\2\2\2"+
		"DE\7\20\2\2EF\5\n\6\6FG\b\6\1\2GK\3\2\2\2HI\7\26\2\2IK\b\6\1\2J;\3\2\2"+
		"\2JA\3\2\2\2JD\3\2\2\2JH\3\2\2\2KX\3\2\2\2LM\f\5\2\2MN\7\21\2\2NO\5\n"+
		"\6\6OP\b\6\1\2PW\3\2\2\2QR\f\4\2\2RS\7\22\2\2ST\5\n\6\5TU\b\6\1\2UW\3"+
		"\2\2\2VL\3\2\2\2VQ\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2Z"+
		"X\3\2\2\2[\\\7\25\2\2\\\r\3\2\2\2\t\25\31).JVX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}