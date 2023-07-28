package ru.job4j.oop.profession

open class Profession(
    var title: String,
    var experience: Int
) {
    open fun getName() {
        println("give name")
    }
    open fun action() {
        println("action from Profession")
    }
}