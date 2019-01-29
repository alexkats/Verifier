package ru.ifmo.ctddev.verification.verifier.fsm

import ru.ifmo.ctddev.verification.verifier.ltl.LtlJoiner

class FSMJoiner {

    private val newStates = mutableMapOf<Pair<Pair<Int, Int>, Boolean>, Int>()

    fun join(fsm1: FSMAutomaton, fsm2: FSMAutomaton): FSMAutomaton {
        val result = FSMAutomaton()
        val ltlJoiner = LtlJoiner()
        result.initialState = newStates.getOrPut(fsm1.initialState!! to fsm2.initialState!! to false) { newStates.size }

        fsm1.transitions.forEach { s1, n1 ->
            fsm2.transitions.forEach { s2, n2 ->
                n1.keys.forEach { f1 ->
                    n2.keys.forEach { f2 ->
                        val f = ltlJoiner.join(f1, f2)
                        f?.let {
                            n1[f1]?.forEach { n11 ->
                                n2[f2]?.forEach { n22 ->
                                    result.addTransition(
                                        newStates.getOrPut(s1 to s2 to false) { newStates.size },
                                        newStates.getOrPut(n11 to n22 to fsm1.accepts(s1)) { newStates.size },
                                        f
                                    )
                                    result.addTransition(
                                        newStates.getOrPut(s1 to s2 to true) { newStates.size },
                                        newStates.getOrPut(n11 to n22 to !fsm1.accepts(s2)) { newStates.size },
                                        f
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        fsm2.accepting.forEach { s2 ->
            fsm1.transitions.keys.forEach { s1 ->
                result.addAccepting(newStates.getOrPut(s1 to s2 to true) { newStates.size })
            }
        }

        return result
    }
}