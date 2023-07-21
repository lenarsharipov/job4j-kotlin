package ru.job4j.oop

class User(var name: String = "") {

    var login: String = ""

    /*
    Во вторичном конструкторе вызывается первичный конструктор
    через двоеточие и оператор this().
    */
    constructor(name: String, login: String): this(name) {
        this.login = login
    }

    fun show() {
        println("$name $login")
    }
}

fun main() {
    val user = User("Name")
    user.show()

    val user2 = User("name", "login")
}