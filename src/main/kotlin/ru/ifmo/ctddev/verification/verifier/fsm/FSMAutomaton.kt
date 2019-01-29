package ru.ifmo.ctddev.verification.verifier.fsm

import ru.ifmo.ctddev.verification.verifier.ltl.BaseFormula
import java.util.ArrayDeque
import java.util.Deque

data class FSMAutomaton(
    var initialState: Int? = null,
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

    fun changeNames(mapper: (BaseFormula) -> BaseFormula): FSMAutomaton {
        val result = FSMAutomaton()

        transitions.forEach { k, v ->
            v.forEach { f, value ->
                value.forEach { result.addTransition(k, it, mapper(f)) }
            }
        }

        accepting.forEach { result.addAccepting(it) }
        result.initialState = initialState
        return result
    }

    fun findAcceptedWord(): Collection<BaseFormula>? {
        val path = ArrayDeque<BaseFormula>()
        dfs1(initialState!!, mutableMapOf(), mutableMapOf(), path)
        return if (path.isEmpty()) null else path
    }

    private fun dfs1(curr: Int,
                     colors1: MutableMap<Int, Color>,
                     colors2: MutableMap<Int, Color>,
                     path: Deque<BaseFormula>): Boolean {
        colors1[curr] = Color.GRAY

        transitions.getOrPut(curr) { mutableMapOf() }.keys.forEach { f ->
            getTransitions(curr)[f]?.forEach {
                if (colors1[it] == null) {
                    path.addLast(f)

                    if (dfs1(it, colors1, colors2, path)) {
                        return true
                    }

                    path.removeLast()
                }
            }
        }

        if (accepts(curr) && dfs2(curr, colors1, colors2, path)) {
            return true
        }

        colors1[curr] = Color.BLACK
        return false
    }

    private fun dfs2(curr: Int,
                     colors1: MutableMap<Int, Color>,
                     colors2: MutableMap<Int, Color>,
                     path: Deque<BaseFormula>): Boolean {
        colors2[curr] = Color.GRAY

        transitions.getOrPut(curr) { mutableMapOf() }.keys.forEach { f ->
            getTransitions(curr)[f]?.forEach {
                if (colors1[it] == Color.GRAY) {
                    path.addLast(f)
                    return true
                }

                if (colors2[it] == null) {
                    path.addLast(f)

                    if (dfs2(it, colors1, colors2, path)) {
                        return true
                    }

                    path.removeLast()
                }
            }
        }

        colors2[curr] = Color.BLACK
        return false
    }
}

private enum class Color {
    GRAY, BLACK;
}