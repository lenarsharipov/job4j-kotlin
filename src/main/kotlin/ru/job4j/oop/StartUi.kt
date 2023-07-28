package ru.job4j.oop

import ru.job4j.oop.tracker.MemTracker
import ru.job4j.oop.tracker.Store
import ru.job4j.oop.tracker.action.Action
import ru.job4j.oop.tracker.action.ConsoleInput
import ru.job4j.oop.tracker.action.Input
import ru.job4j.oop.tracker.action.impl.AddAction
import ru.job4j.oop.tracker.action.impl.ExitAction
import ru.job4j.oop.tracker.action.impl.ShowAction

object StartUi {

    private fun showMenu(actions: List<Action>) {
        println("Menu:")
        for (index in actions.indices) {
            println("$index. ${actions[index].name()}")
        }
    }

    fun init(input: Input, tracker: Store, actions: List<Action>) {
        var run = true
        while(run) {
            showMenu(actions)
            val select = input.askInt("Select: ")
            if (select < 0 || select >= actions.size) {
                println("Wrong input. Try again.")
                continue
            }
            val action = actions[select]
            run = action.execute(tracker, input)
        }
    }
}

fun main() {
    val tracker = MemTracker()
    val input = ConsoleInput()
    val actions = listOf(AddAction(), ShowAction(), ExitAction())
    StartUi.init(input, tracker, actions)
}