package ru.job4j.lambda

data class Account(
    val name: String,
    val balance: Int
)

fun main() {
    val acc1 = Account("Ivan", 0)
    val acc2 = Account("Dmitriy", 10)
    val acc3 = Account("Ivan", 20)
    val acc4 = Account("Olga", -10)
    val acc5 = Account("Ivan", 40)

    val list = listOf(acc1, acc2, acc3, acc4, acc5)

    println(list.filter { it.name == "Ivan" && it.balance > 0 })
}


