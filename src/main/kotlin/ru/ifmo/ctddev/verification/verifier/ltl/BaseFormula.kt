package ru.ifmo.ctddev.verification.verifier.ltl

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import ru.ifmo.ctddev.verification.verifier.fsm.FSMAutomaton
import ru.ifmo.ctddev.verification.verifier.isWindows
import ru.ifmo.ctddev.verification.verifier.ltl.antlr.BuchiLexer
import ru.ifmo.ctddev.verification.verifier.ltl.antlr.BuchiParser
import ru.ifmo.ctddev.verification.verifier.runCommand
import java.io.File

interface BaseFormula {

    fun go(visitor: LtlVisitor) = visitor.visit(this)

    fun changeNames(mapper: (String) -> String): BaseFormula
}

fun BaseFormula.asAutomaton(): FSMAutomaton {
    val names = mutableMapOf<String, String>()
    val ltl = changeNames { names.getOrPut(it) { "v${names.size}" } }
    val spinFormula = ltl.toString().replace("R", "V")
    val backNames = names.map { val p = it.toPair(); p.second to p.first }.toMap()
    val automaton = spinFormula.toFSM()
    return automaton.changeNames { it.changeNames { n -> backNames.getValue(n) } }
}

private fun String.toFSM(): FSMAutomaton {
    val result = FSMAutomaton()
    val buchi = convertToBuchi()
    val states = BuchiParser(CommonTokenStream(BuchiLexer(CharStreams.fromString(buchi)))).fsm().l
    var ids = 0
    val idMap = mutableMapOf<String, Int>()

    states.forEach {
        val nodeId = idMap.getOrPut(it.name) { ids++ }

        if (it.isAccept()) {
            result.addAccepting(nodeId)
        }

        if (it.isInit()) {
            result.initialState = nodeId
        }

        it.transitions.forEach { t ->
            val nId = idMap.getOrPut(t.stateName) { ids++ }
            result.addTransition(nodeId, nId, t.expression)

            if (t.isAccept()) {
                result.addAccepting(nId)
            }

            if (t.isInit()) {
                result.initialState = nId
            }
        }
    }

    result.nodes.forEach {
        result.transitions[it] ?: result.addTransition(it, it, Const(true))
    }

    return result
}

private fun String.convertToBuchi() =
    "${if (isWindows()) "ltl2ba.exe" else "./ltl2ba"} -f $this".runCommand(File("."))