package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement

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