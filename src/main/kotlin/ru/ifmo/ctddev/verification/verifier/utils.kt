package ru.ifmo.ctddev.verification.verifier

import org.apache.commons.io.IOUtils
import java.io.File

fun error(): Nothing = error("Unexpected error")

fun error(msg: String): Nothing = throw Exception(msg)

fun String.runCommand(workingDir: File): String = ProcessBuilder(*split(" ", limit = 3).toTypedArray())
    .directory(workingDir)
    .redirectOutput(ProcessBuilder.Redirect.PIPE)
    .redirectError(ProcessBuilder.Redirect.INHERIT)
    .start().run {
        waitFor()
        inputStream.use { IOUtils.toString(it) }
    }

fun isWindows() = System.getProperty("os.name").toLowerCase().startsWith("windows")