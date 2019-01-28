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

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BuchiParser}.
 */
public interface BuchiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BuchiParser#fsm}.
	 * @param ctx the parse tree
	 */
	void enterFsm(BuchiParser.FsmContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuchiParser#fsm}.
	 * @param ctx the parse tree
	 */
	void exitFsm(BuchiParser.FsmContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuchiParser#stateD}.
	 * @param ctx the parse tree
	 */
	void enterStateD(BuchiParser.StateDContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuchiParser#stateD}.
	 * @param ctx the parse tree
	 */
	void exitStateD(BuchiParser.StateDContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuchiParser#stateN}.
	 * @param ctx the parse tree
	 */
	void enterStateN(BuchiParser.StateNContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuchiParser#stateN}.
	 * @param ctx the parse tree
	 */
	void exitStateN(BuchiParser.StateNContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuchiParser#transitionD}.
	 * @param ctx the parse tree
	 */
	void enterTransitionD(BuchiParser.TransitionDContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuchiParser#transitionD}.
	 * @param ctx the parse tree
	 */
	void exitTransitionD(BuchiParser.TransitionDContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuchiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BuchiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuchiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BuchiParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuchiParser#lit}.
	 * @param ctx the parse tree
	 */
	void enterLit(BuchiParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuchiParser#lit}.
	 * @param ctx the parse tree
	 */
	void exitLit(BuchiParser.LitContext ctx);
}