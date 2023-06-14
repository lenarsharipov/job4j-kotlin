package ru.job4j.base

fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

fun divide(first: Int, second: Int): Int {
    return first / second
}

fun multiply(first: Int, second: Int): Int {
    return first * second
}

fun main() {
    val first = 10
    val second = 2
    println("$first + $second = ${add(first, second)}")
    println("$first - $second = ${subtract(first, second)}")
    println("$first / $second = ${divide(first, second)}")
    println("$first * $second = ${multiply(first, second)}")
}