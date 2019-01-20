package ru.ifmo.ctddev.verification.verifier.fsm

data class FSMState(
    val name: String,
    val transitions: MutableList<FSMTransition> = mutableListOf()
) : FSMElement(name)