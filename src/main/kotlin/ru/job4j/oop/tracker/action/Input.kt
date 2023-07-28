package ru.job4j.oop.tracker.action

interface Input {
    fun askInt(question: String): Int
    fun askStr(question: String): String
}