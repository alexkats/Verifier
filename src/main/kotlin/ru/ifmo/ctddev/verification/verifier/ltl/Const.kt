package ru.ifmo.ctddev.verification.verifier.ltl

data class Const(val value: Boolean) : BaseFormula {

    override fun changeNames(mapper: (String) -> String) = this

    override fun toString() = value.toString()
}