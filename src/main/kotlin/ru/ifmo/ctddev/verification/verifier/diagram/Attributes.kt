package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Attributes(
    @JacksonXmlProperty(localName = "name")
    var name: String? = null,

    @JacksonXmlProperty(localName = "type")
    var type: Int? = null,

    @JacksonXmlProperty(localName = "code")
    var code: String? = null,

    @JacksonXmlProperty(localName = "guard")
    var guard: String? = null,

    @JacksonXmlProperty(localName = "action")
    @JacksonXmlElementWrapper(useWrapping = false)
    var action: List<Action>? = null,

    @JacksonXmlProperty(localName = "event")
    var event: Event? = null,

    @JacksonXmlProperty(localName = "incoming")
    @JacksonXmlElementWrapper(useWrapping = false)
    var incoming: List<Incoming>? = null,

    @JacksonXmlProperty(localName = "nested")
    var nested: Nested? = null,

    @JacksonXmlProperty(localName = "outgoing")
    @JacksonXmlElementWrapper(useWrapping = false)
    var outgoing: List<Outgoing>? = null
)