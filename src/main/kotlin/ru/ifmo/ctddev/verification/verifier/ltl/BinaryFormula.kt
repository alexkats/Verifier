package ru.ifmo.ctddev.verification.verifier.ltl

data class BinaryFormula(val left: BaseFormula, val right: BaseFormula, val operator: Operator) : BaseFormula {

    override fun changeNames(mapper: (String) -> String) =
        BinaryFormula(left.changeNames(mapper), right.changeNames(mapper), operator)

    override fun toString() = "($left$operator$right)"
}