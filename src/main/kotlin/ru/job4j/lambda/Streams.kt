package ru.job4j.lambda

fun count(list: List<Int>): Long {
    return list
        .stream()
        .filter { it % 2 == 0 }
        .mapToLong { (it + 1).toLong() }
        .sum()
}

fun main() {
    println(
        count(listOf(1, 2, 3))
    )
}