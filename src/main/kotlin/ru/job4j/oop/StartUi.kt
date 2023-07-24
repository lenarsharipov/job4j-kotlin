package ru.job4j.oop

import ru.job4j.oop.tracker.Item
import ru.job4j.oop.tracker.MemTracker
import ru.job4j.oop.tracker.Store
import java.util.Scanner

object StartUi {

    private fun create(tracker: Store): Boolean {
        println("=== Create new Item ===")
        val scanner = Scanner(System.`in`)
        println("Enter name: ")
        val name = scanner.nextLine()

        val item = Item(0, name)
        tracker.add(item)

        return true
    }

    private fun showAll(tracker: Store): Boolean {
        println("=== Show all items ===")
        val items = tracker.findAll()
        if (items.isNotEmpty()) {
            for (item in items) {
                println(item)
            }
        } else {
            println("No any item saved yet.")
        }
        return true
    }

    private fun exit(): Boolean {
        return false
    }

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
                0 -> create(tracker)
                1 -> showAll(tracker)
                2 -> exit()
                else -> {
                    println("Wrong input. Try again.")
                    continue
                }
            }
        }
        println("Program has finished its work.")
    }

}

fun main() {
    val tracker = MemTracker()
    StartUi.init(tracker)
}