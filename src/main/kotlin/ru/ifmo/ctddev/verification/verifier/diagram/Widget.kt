package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Widget(
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    var id: Int? = null,

    @JacksonXmlProperty(localName = "type", isAttribute = true)
    var type: String? = null,

    @JacksonXmlProperty(localName = "attributes")
    var attributes: Attributes? = null
)

fun Widget.isState() = type == "State"

fun Widget.isTransition() = type == "Transition"