package ru.job4j.oop

import ru.job4j.oop.tracker.Actions
import ru.job4j.oop.tracker.MemTracker
import ru.job4j.oop.tracker.Store
import java.util.*

object StartUi {

    private fun showMenu() {
        println("Menu:")
        println("0. Create new item.")
        println("1. Show all items.")
        println("2. Exit.")
    }

    fun init(tracker: Store) {
        var run = true
        while(run) {
            showMenu()
            val scanner = Scanner(System.`in`)
            print("Select: ")
            run = when (scanner.nextInt()) {
                0 -> Actions.create(tracker)
                1 -> Actions.showAll(tracker)
                2 -> Actions.exit()
                else -> {
                    println("Wrong input. Try again.")
                    continue
                }
            }
        }
    }
}

fun main() {
    val tracker = MemTracker()
    StartUi.init(tracker)
}