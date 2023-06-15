package ru.job4j.base

fun draw(size: Int) {
    require(size > 0 && size % 2 != 0) { "Size should be a positive odd number." }

    for (row in 0 until size) {
        for (col in 0 until size) {
            if (row == col || row == size - col - 1) print("X") else print(" ")
        }
        println()
    }
}

fun main() {
    draw(7)
}