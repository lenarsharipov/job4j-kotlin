package ru.job4j.oop.profession

open class ItProfession(
    title: String,
    experience: Int,
    technicalSkills : String
) : Profession(title, experience) {
    override fun action() {
        super.action()
        println("action from ItProfession")
    }

    override fun getName() {
        println("name from ItProfession")
    }
}

fun main() {
    val prof = ItProfession("title", 1, "skills")
    prof.action()
    prof.getName()
}