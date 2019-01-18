package ru.ifmo.ctddev.verification.verifier.ltl

interface LtlVisitor {

    fun visit(formula: BaseFormula)
}