package ru.job4j.oop.tracker

data class Item(
    var id: Long = 0,
    var name: String = ""
) {
    constructor(name: String): this(0, name)
}