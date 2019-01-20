package ru.ifmo.ctddev.verification.verifier.fsm

import ru.ifmo.ctddev.verification.verifier.ltl.BaseFormula

data class FSMTransition(
    val expression: BaseFormula,
    val stateName: String
) : FSMElement(stateName)