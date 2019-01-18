package ru.ifmo.ctddev.verification.verifier.ltl

data class Not(val formula: BaseFormula) : BaseFormula {

    override fun changeNames(mapper: (String) -> String) = Not(formula.changeNames(mapper))

    override fun toString() = "!$formula"
}