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


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link BuchiListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class BuchiBaseListener implements BuchiListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFsm(BuchiParser.FsmContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFsm(BuchiParser.FsmContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStateD(BuchiParser.StateDContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStateD(BuchiParser.StateDContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStateN(BuchiParser.StateNContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStateN(BuchiParser.StateNContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTransitionD(BuchiParser.TransitionDContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTransitionD(BuchiParser.TransitionDContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(BuchiParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(BuchiParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLit(BuchiParser.LitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLit(BuchiParser.LitContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}