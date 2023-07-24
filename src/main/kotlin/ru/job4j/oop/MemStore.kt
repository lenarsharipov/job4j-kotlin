package ru.job4j.oop

object MemStore {
    private val data = ArrayList<String>()

    fun add(value: String) {
        data.add(value)
    }

    fun getAll() = data
}

fun main() {
    MemStore.add("Lenar")
    println("${MemStore.getAll()}")
}