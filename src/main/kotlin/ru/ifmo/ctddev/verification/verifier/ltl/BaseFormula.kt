package ru.ifmo.ctddev.verification.verifier.ltl

interface BaseFormula {

    fun go(visitor: LtlVisitor) = visitor.visit(this)

    fun changeNames(mapper: (String) -> String): BaseFormula
}