package ru.job4j.oop

/**
 * 1. Объявление класс в котлин начинается с ключевого слова class.
 * В котлин по умолчанию модификатор доступа public.
 * Его не пишут и имеет он такое же значение, как и в Java.
 * Public - значит доступен всем.
 *
 * 2. Поля описываются внутри дела класса.
 * Поле var - может изменяться. Поле val - нет.
 *
 * 3. Методы написаны по аналогии с функцией внутри файла.
 * Обращение к полю идет напрямую без указания this.
 * Его можно написать, но делать этого не рекомендуется.
 */
class Driver {
    private val types = arrayOf('A', 'B', 'C')
    private var license = 'N'

    fun passExamOn(category: Char) {
        license = category
    }

    fun hasLicense(): Boolean {
        return types.contains(license)
    }

    fun canDrive(category: Char): Boolean {
        return this.license == category
    }

}

fun main() {
    val steve = Driver()
    println("Steve wants the trucker job.")
    if (!steve.hasLicense()) {
        println("Steve need to get a license!")
        steve.passExamOn('A')
    }
    if (steve.canDrive('C')) {
        println("Steve works on truckers!")
    } else if (steve.canDrive('B')) {
        println("Steve works in taxi.")
    } else {
        println("Steve does not have a job, but rides on motorbike!")
    }
}