package ru.ifmo.ctddev.verification.verifier.ltl

data class Var(val name: String) : BaseFormula {

    override fun changeNames(mapper: (String) -> String) = Var(mapper(name))

    override fun toString() = name
}