package ru.job4j.oop.profession

class Developer(
    title: String,
    experience: Int,
    technicalSkills: String,
    var programmingLanguage: String,
    var database: String
) : ItProfession(title, experience, technicalSkills)