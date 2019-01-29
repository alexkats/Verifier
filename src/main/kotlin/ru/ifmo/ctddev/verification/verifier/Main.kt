package ru.ifmo.ctddev.verification.verifier

import ru.ifmo.ctddev.verification.verifier.diagram.DiagramParser
import ru.ifmo.ctddev.verification.verifier.diagram.asAutomaton
import ru.ifmo.ctddev.verification.verifier.fsm.FSMJoiner
import ru.ifmo.ctddev.verification.verifier.ltl.Not
import ru.ifmo.ctddev.verification.verifier.ltl.asAutomaton
import ru.ifmo.ctddev.verification.verifier.ltl.parseLtl
import java.io.File

fun main(args: Array<String>) {

    val helper = { println("Usage: java -jar <file with ltl> <file with automaton schema> <output file>") }

    if (args.size != 3) {
        helper()
        return
    }

    val ltlFile = File(args[0])
    val automatonFile = File(args[1])
    val outputFile = File(args[2])

    ltlFile.bufferedReader().use { br ->
        outputFile.printWriter().use { pw ->
            br.readLines().forEach {
                pw.print("Checking formula: $it ... ")
                val xmlAutomaton = DiagramParser().parse(automatonFile).asAutomaton()
                val parsedNegativeFormula = Not(it.parseLtl()).asAutomaton()
                val path = FSMJoiner().join(xmlAutomaton, parsedNegativeFormula).findAcceptedWord()

                if (path == null) {
                    pw.println("correct")
                } else {
                    pw.println("incorrect")
                    pw.println("Example:")
                    pw.println(path.joinToString("\n"))
                }

                repeat(3) { pw.println() }
            }
        }
    }
}