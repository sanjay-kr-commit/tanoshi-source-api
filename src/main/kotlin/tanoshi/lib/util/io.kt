package tanoshi.lib.util

import java.io.File

fun String.validateDir() : String {
    this.toFile().run {
        if ( !isDirectory ) mkdirs()
    }
    return this
}

fun String.toFile() = File( this )

fun String.validateFile() : String {
    this.toFile().run {
        if ( !isFile ) createNewFile()
    }
    return this
}