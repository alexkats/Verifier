package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
import ru.ifmo.ctddev.verification.verifier.fsm.FSMAutomaton
import ru.ifmo.ctddev.verification.verifier.ltl.Const
import ru.ifmo.ctddev.verification.verifier.ltl.Var

@JacksonXmlRootElement(localName = "diagram")
@JsonIgnoreProperties(ignoreUnknown = true)
data class Diagram(

    @JacksonXmlProperty(localName = "name")
    var name: String? = null,

    @JacksonXmlProperty(localName = "data")
    var data: Data? = null,

    @JacksonXmlProperty(localName = "widget")
    @JacksonXmlElementWrapper(useWrapping = false)
    var widget: List<Widget>? = null
)

fun Diagram.asAutomaton(): FSMAutomaton {
    val widgets = widget?.map { it.id to it }?.toMap() ?: mapOf()
    val next = mutableMapOf<Int, Int>()

    addNext(widgets, next)
    val result = constructAutomaton(widgets, next)

    result.nodes.forEach {
        result.addAccepting(it)

        if (result.getTransitions(it).isEmpty()) {
            result.addTransition(it, it, Const(true))
        }
    }

    return result
}

private fun Diagram.addNext(widgets: Map<Int?, Widget>, next: MutableMap<Int, Int>) =
    widget?.forEach { w ->
        if (w.isState()) {
            w.attributes?.incoming?.forEach { inc ->
                if (widgets[inc.id]?.isTransition() == true) {
                    next[inc.id!!] = w.id!!
                }
            }
        }
    }

private fun Diagram.constructAutomaton(widgets: Map<Int?, Widget>, next: MutableMap<Int, Int>): FSMAutomaton {
    val result = FSMAutomaton()
    var ids = 100000
    var initialId: Int? = null

    widget?.forEach { w ->
        if (w.isState()) {
            val stateNode = w.id!!

            if (w.attributes?.type == 1) {
                if (initialId == null) {
                    initialId = ids++
                    result.initialState = initialId
                }

                val stateTransition = Var("S(${w.attributes?.name})")
                result.addTransition(initialId!!, stateNode, stateTransition)
            }

            w.attributes?.outgoing?.forEach {
                val n = widgets[it.id]

                if (n?.isTransition() == true) {
                    val eventTransition = Var("E(${n.attributes?.event?.name})")
                    val eventNode = ids++
                    result.addTransition(stateNode, eventNode, eventTransition)
                    var addedNode = eventNode

                    n.attributes?.action?.forEach { act ->
                        val actionTransition = Var("A(${act.name})")
                        val actionNode = ids++
                        result.addTransition(addedNode, actionNode, actionTransition)
                        addedNode = actionNode
                    }

                    val nn = widgets[next[it.id]]
                    val nNode = nn?.id
                    val nTransition = Var("S(${nn?.attributes?.name})")
                    result.addTransition(addedNode, nNode!!, nTransition)
                }
            }
        }
    }

    return result
}