package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName = "nested")
@JsonIgnoreProperties(ignoreUnknown = true)
data class Nested(
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    var type: String? = null,

    @JacksonXmlProperty(localName = "name", isAttribute = true)
    var name: String? = null
)