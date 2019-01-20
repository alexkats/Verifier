package ru.ifmo.ctddev.verification.verifier.diagram

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import java.io.File

class DiagramParser(private val mapper: XmlMapper = XmlMapper()) {

    init {
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    }

    fun parse(file: File) = mapper.readValue(file, Diagram::class.java)!!
}