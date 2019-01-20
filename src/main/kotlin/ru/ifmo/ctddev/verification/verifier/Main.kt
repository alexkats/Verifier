package ru.ifmo.ctddev.verification.verifier

import ru.ifmo.ctddev.verification.verifier.diagram.DiagramParser
import ru.ifmo.ctddev.verification.verifier.ltl.parseLtl
import java.io.File

fun main(args: Array<String>) {
    val f = "F('S(SName)' | 'S(ID)')"
    println(f.parseLtl())
    val d = File("src/main/resources/fsm/AChart.xstd")
    println(DiagramParser().parse(d))
}