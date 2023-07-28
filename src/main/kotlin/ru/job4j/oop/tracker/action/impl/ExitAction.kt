package ru.job4j.oop.tracker.action.impl

import ru.job4j.oop.tracker.Store
import ru.job4j.oop.tracker.action.Action
import ru.job4j.oop.tracker.action.Input

class ExitAction : Action {
    override fun name(): String {
        return "Exit program."
    }

    override fun execute(tracker: Store, input: Input): Boolean {
        return false
    }

}