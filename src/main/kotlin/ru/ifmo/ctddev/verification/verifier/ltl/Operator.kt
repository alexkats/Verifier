package ru.ifmo.ctddev.verification.verifier.ltl

enum class Operator(val str: String) {
    AND(" && "), OR(" || "), RELEASE(" R "), UNTIL(" U ");

    override fun toString() = str
}