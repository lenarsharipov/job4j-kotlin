package ru.job4j.oop.tracker.action

import ru.job4j.oop.tracker.Store

interface Action {

    fun name(): String
    fun execute(tracker: Store, input: Input): Boolean
}