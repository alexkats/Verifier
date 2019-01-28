grammar Buchi;

@header {
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
}

fsm returns [List<FSMState> l]
@init {$l = new ArrayList<>();}:
    'never' '{' ( ((stateD {$l.add($stateD.state);})* | False) '}' ) EOF;

stateD returns [FSMState state]
@init {List<FSMTransition> l = new ArrayList<>();}:
    stateN ':' ('skip' | False | ('if' (transitionD {l.add($transitionD.edge);})+ 'fi' ';')) {
        String name = $stateN.text;
        $state = new FSMState(name, l);
    };

stateN: SL;

transitionD returns [FSMTransition edge]:
    '::' expr '->' 'goto' stateN {$edge = new FSMTransition($expr.formula, $stateN.text);};

expr returns [BaseFormula formula]:
    '(' expr ')' { $formula = $expr.formula;}
        |   lit {$formula = new Var($lit.text);}
        |   '!' expr {$formula = new Not($expr.formula);}
        |   left=expr '&&' right=expr {$formula = new BinaryFormula($left.formula, $right.formula, Operator.AND);}
        |   left=expr '||' right=expr {$formula = new BinaryFormula($left.formula, $right.formula, Operator.OR);}
        |   One {$formula = new Const(true);};

lit : SL ;

WS : [ \t\r\n\f] -> skip;

False : 'false;';

SL : [a-zA-Z][a-zA-Z0-9_]* ;

One : '1' ;

BlockComment : '/*' .*? '*/' -> skip;