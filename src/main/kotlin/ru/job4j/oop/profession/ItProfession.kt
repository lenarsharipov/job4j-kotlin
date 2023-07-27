package ru.job4j.oop.profession

open class ItProfession(
    title: String,
    experience: Int,
    var technicalSkills : String
) : Profession(title, experience)