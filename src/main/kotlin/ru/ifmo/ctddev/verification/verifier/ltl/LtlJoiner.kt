package ru.ifmo.ctddev.verification.verifier.ltl

class LtlJoiner {

    fun join(f1: BaseFormula, f2: BaseFormula): BaseFormula? {
        var vars = mutableSetOf<Var>()

        if (f1 != Const(true)) {
            val varVisitor = VarVisitor()
            f1.go(varVisitor)
            vars = varVisitor.vars
        }

        val exprVisitor = ExprVisitor(vars)
        f2.go(exprVisitor)
        return if (exprVisitor.value) f1 else null

    }
}

private class VarVisitor : LtlVisitor {
    val vars = mutableSetOf<Var>()

    override fun visit(formula: BaseFormula) {
        when (formula) {
            is BinaryFormula -> {
                if (formula.operator == Operator.OR) {
                    formula.left.go(this)
                    formula.right.go(this)
                }
            }
            is Var -> vars.add(formula)
        }
    }
}

private class ExprVisitor(private val trueVars: MutableSet<Var>) : LtlVisitor {
    var value = false

    override fun visit(formula: BaseFormula) {
        when (formula) {
            is BinaryFormula -> {
                formula.left.go(this)
                val l = value
                formula.right.go(this)
                val r = value
                value = if (formula.operator == Operator.AND) (l && r) else (l || r)
            }
            is Const -> value = formula.value
            is Var -> value = formula in trueVars
            is Not -> {
                formula.formula.go(this)
                value = !value
            }
        }
    }
}