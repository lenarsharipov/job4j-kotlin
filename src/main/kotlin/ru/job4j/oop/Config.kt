package ru.job4j.oop

import java.io.File
import java.io.InputStream

class Config private constructor() {
    companion object {
        fun loadByFile(file: File): Config {
            return Config()
        }

        fun loadByInputStream(input: InputStream): Config {
            return Config()
        }

        fun loadByPlainText(text: String): Config {
            return Config()
        }
    }
}

fun main() {
    val config = Config.loadByFile(File("./app.properties"))
}
