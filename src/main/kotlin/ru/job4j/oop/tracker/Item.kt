package ru.job4j.oop.tracker

class Item(var id: Long, var name: String) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }


}