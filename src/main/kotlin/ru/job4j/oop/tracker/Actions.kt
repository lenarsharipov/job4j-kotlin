package ru.job4j.oop.tracker

import java.util.*

class Actions private constructor() {
    companion object {
        fun create(tracker: Store): Boolean {
            println("=== Create new Item ===")
            val scanner = Scanner(System.`in`)
            println("Enter name: ")
            val name = scanner.nextLine()

            val item = Item(0, name)
            tracker.add(item)

            return true
        }

        fun showAll(tracker: Store): Boolean {
            println("=== Show all items ===")
            val items = tracker.findAll()
            if (items.isNotEmpty()) {
                items.forEach { println(it) }
            } else {
                println("No any item saved yet.")
            }
            return true
        }

        fun exit(): Boolean {
            println("Program has finished its work.")
            return false
        }
    }
}