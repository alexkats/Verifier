grammar LTL;

@header {
import ru.ifmo.ctddev.verification.verifier.ltl.BaseFormula;
import ru.ifmo.ctddev.verification.verifier.ltl.BinaryFormula;
import ru.ifmo.ctddev.verification.verifier.ltl.Const;
import ru.ifmo.ctddev.verification.verifier.ltl.LtlVisitor;
import ru.ifmo.ctddev.verification.verifier.ltl.Next;
import ru.ifmo.ctddev.verification.verifier.ltl.Not;
import ru.ifmo.ctddev.verification.verifier.ltl.Operator;
import ru.ifmo.ctddev.verification.verifier.ltl.Var;
}

ltl returns [BaseFormula formula]:
        primary {$formula = $primary.formula;}
    |   NEXT ltl {$formula = new Next($ltl.formula);}
    |   GLOB ltl {$formula = new BinaryFormula(new Const(false), $ltl.formula, Operator.RELEASE);}
    |   FUTURE ltl {$formula = new BinaryFormula(new Const(true), $ltl.formula, Operator.UNTIL);}
    |   left=ltl RELEASE right=ltl {$formula = new BinaryFormula($left.formula, $right.formula, Operator.RELEASE);}
    |   left=ltl UNTIL right=ltl {$formula = new BinaryFormula($left.formula, $right.formula, Operator.UNTIL);}
    |   left=ltl AND right=ltl {$formula = new BinaryFormula($left.formula, $right.formula, Operator.AND);}
    |   left=ltl OR right=ltl {$formula = new BinaryFormula($left.formula, $right.formula, Operator.OR);}
    |   <assoc=right> left=ltl IMPL right=ltl {$formula = new BinaryFormula(new Not($left.formula), $right.formula, Operator.OR);}
    |   left=ltl EQ right=ltl {$formula = new BinaryFormula(new BinaryFormula(new Not($left.formula), $right.formula, Operator.OR), new BinaryFormula(new Not($right.formula), $left.formula, Operator.OR), Operator.AND);}
    ;

primary returns [BaseFormula formula]:
        constant {$formula = $constant.formula;}
    |   LP ltl RP {$formula = $ltl.formula;}
    |   NOT ltl {$formula = new Not($ltl.formula);}
    ;

constant returns [BaseFormula formula]:
        TRUE {$formula = new Const(true);}
    |   FALSE {$formula = new Const(false);}
    |   SL {
            String name = $SL.text;
            $formula = new Var(name.substring(1, name.length() - 1));
        }
    ;

NEXT : 'X' ;
GLOB : 'G' ;
FUTURE : 'F' ;
RELEASE : 'R' ;
UNTIL : 'U' ;
AND : '&' ;
OR : '|' ;
IMPL : '->' ;
EQ : '==' ;
LP : '(' ;
RP : ')' ;
NOT : '!' ;
TRUE : 'true' ;
FALSE : 'false' ;

SL : SL1 | SL2 ;

fragment
SL1 : '\'' (~['\\\r\n] | ESC)+ '\'' ;

fragment
SL2 : '"' (~["\\\r\n] | ESC)+ '"' ;

fragment
ESC : '\\' ['"abfnrtv\\] ;

WS : [ \t\r\n\f] -> skip;

ErrorChar : . {
        System.err.println("Invalid character: ");
    }
;