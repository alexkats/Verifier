package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

@JacksonXmlRootElement(localName = "incoming")
@JsonIgnoreProperties(ignoreUnknown = true)
data class Incoming(
    @JacksonXmlProperty(localName = "id", isAttribute = true)
    var id: Int? = null
)