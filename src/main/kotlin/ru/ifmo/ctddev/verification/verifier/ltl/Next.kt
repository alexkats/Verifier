package ru.ifmo.ctddev.verification.verifier.ltl

data class Next(val formula: BaseFormula) : BaseFormula {

    override fun changeNames(mapper: (String) -> String) = Next(formula.changeNames(mapper))

    override fun toString() = "(X $formula)"
}