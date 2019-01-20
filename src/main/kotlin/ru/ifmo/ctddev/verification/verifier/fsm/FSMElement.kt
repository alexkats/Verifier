package ru.ifmo.ctddev.verification.verifier.fsm

abstract class FSMElement(val toCheck: String) {

    fun isAccept() = toCheck.startsWith("accept_")

    fun isInit() = toCheck.endsWith("_init")
}