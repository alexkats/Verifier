package ru.ifmo.ctddev.verification.verifier

fun error(): Nothing = error("Unexpected error")

fun error(msg: String): Nothing = throw Exception(msg)