package ru.ifmo.ctddev.verification.verifier.ltl

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import ru.ifmo.ctddev.verification.verifier.ltl.antlr.LTLLexer
import ru.ifmo.ctddev.verification.verifier.ltl.antlr.LTLParser

fun String.parseLtl() = LTLParser(CommonTokenStream(LTLLexer(CharStreams.fromString(this)))).ltl().formula!!