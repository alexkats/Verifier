package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName = "Statemachine")
@JsonIgnoreProperties(ignoreUnknown = true)
data class FSM(
    @JacksonXmlProperty(localName = "event")
    @JacksonXmlElementWrapper(useWrapping = false)
    var event: List<Event>? = null,

    @JacksonXmlProperty(localName = "autoreject")
    var autoReject: Boolean? = null
)