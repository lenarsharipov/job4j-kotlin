package ru.job4j.oop.profession

class NetworkEngineer(
    title: String,
    experience: Int,
    technicalSkills: String,
    networks: String
) : ItProfession(title, experience, technicalSkills) {
    override fun action() {
        super.action()
        println("action from network engineer")
    }

    override fun getName() {
        super.getName()
        println("name of network engineer")
    }
}

fun main() {
    val eng = NetworkEngineer("title", 1, "skills", "OSI")
    eng.action()
    eng.getName()
}