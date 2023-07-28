package ru.job4j.oop.tracker.action.impl

import ru.job4j.oop.tracker.Store
import ru.job4j.oop.tracker.action.Action
import ru.job4j.oop.tracker.action.Input

class ShowAction : Action {
    override fun name(): String {
        return "Show all items."
    }

    override fun execute(tracker: Store, input: Input): Boolean {
        println("=== Show all items ===")
        val items = tracker.findAll()
        if (items.isNotEmpty()) {
            items.forEach { println(it) }
        } else {
            println("No any item saved yet.")
        }
        return true
    }

}