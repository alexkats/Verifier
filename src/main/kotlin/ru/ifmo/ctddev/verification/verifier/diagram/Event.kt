package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName = "event")
@JsonIgnoreProperties(ignoreUnknown = true)
data class Event(
    @JacksonXmlProperty(localName = "name", isAttribute = true)
    var name: String? = null,

    @JacksonXmlProperty(localName = "comment", isAttribute = true)
    var comment: String? = null
)