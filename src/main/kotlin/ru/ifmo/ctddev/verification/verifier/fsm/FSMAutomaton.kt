package ru.ifmo.ctddev.verification.verifier.fsm

import ru.ifmo.ctddev.verification.verifier.ltl.BaseFormula

data class FSMAutomaton(
    val initialState: Int,
    val nodes: MutableSet<Int> = mutableSetOf(),
    val accepting: MutableSet<Int> = mutableSetOf(),
    val transitions: MutableMap<Int, MutableMap<BaseFormula, MutableList<Int>>> = mutableMapOf()
) {

    fun getTransitions(stateId: Int) = transitions.getOrPut(stateId) { mutableMapOf() }

    fun addTransition(stateId1: Int, stateId2: Int, transition: BaseFormula) {
        nodes.add(stateId1)
        nodes.add(stateId2)
        val outgoing = getTransitions(stateId1)
        outgoing.getOrPut(transition) { mutableListOf() }.add(stateId2)
    }

    fun addAccepting(stateId: Int) {
        nodes.add(stateId)
        accepting.add(stateId)
    }

    fun accepts(stateId: Int) = stateId in accepting
}