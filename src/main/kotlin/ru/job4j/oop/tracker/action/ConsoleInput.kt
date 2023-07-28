package ru.job4j.oop.tracker.action

import java.util.*

class ConsoleInput : Input {

    private val scanner = Scanner(System.`in`)

    override fun askInt(question: String): Int {
        return Integer.parseInt(askStr(question))
    }

    override fun askStr(question: String): String {
        println(question)
        return scanner.nextLine()
    }

}