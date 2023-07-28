package ru.job4j.oop.tracker.action.impl

import ru.job4j.oop.tracker.Item
import ru.job4j.oop.tracker.Store
import ru.job4j.oop.tracker.action.Action
import ru.job4j.oop.tracker.action.Input

class AddAction : Action {
    override fun name(): String {
        return "Create new item."
    }

    override fun execute(tracker: Store, input: Input): Boolean {
        println("=== Create a new Item ====")
        tracker.add(Item(input.askStr("Enter name")))
        return true
    }
}