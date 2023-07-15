package ru.job4j.oop.tracker

interface Store {

    fun add(item: Item): Item

    fun replace(id: Long, item: Item): Boolean

    fun delete(id: Long): Boolean

    fun findAll(): List<Item>

    fun findByName(key: String): List<Item>

    fun findById(id: Long): Item?

}