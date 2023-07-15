package ru.job4j.base

fun createArray() {
    /*
    arrayOfNulls<String>(10) - создаст массив на 10 элементов, в котором может быть null.
    То есть в Kotlin добавились обертки для контейнеров, которые могут содержать null и тех,
    что не могут. С контейнерами, которые могут содержать null нужно использовать дополнительный
    оператор проверки - ?
    */
    val names = arrayOfNulls<String>(10)
    names[0] = "John Dow"

    /*
    Цикл for позволяет сразу получить значение индекса элемента.
    Для этого у каждой коллекции есть метод .withIndex()
     */
    for ((index, name) in names.withIndex()) {
        /*
        Проверка через ? (Знак вопроса). Если переменная не равна null,
        то выполняем дальнейшее действие, если нет, вернуть null.
         */
        println("Index: $index. Name: $name. Length: ${name?.length}")
    }
}

fun createArrayList() {
    val names = ArrayList<String>()
    names.add("John Dow")
    for ((index, name) in names.withIndex()) {
        println("Index: $index. Name: $name")
    }
}

/**
 * Метод defragment(array: Array<String?>) перемещает заполненные ячейки массива в начало, а пустые в конец.
 * Когда мы создаем массив строк, то по умолчанию все ячейки в нем заполняются null-ссылке.
 * Мы помним, что массив в Java создается с фиксированной длинной. То есть добавить новую ячейку или
 * удалить старую ячейку нельзя. Можно только заполнить ячейку или освободить ее.
 *
 * При работе с массивами будут возникать ситуации, когда в массиве часть ячеек будет заполнена,
 * а часть нет. Заполненные ячейки могут быть разбросаны по всему массиву.
 * Нам бы хотелось расположить все эти ячейки в начале массива.
 */
fun defragment(array: Array<String?>) {
    var pointer = 0
    for (index in array.indices) {
        if (array[index] != null) {
            array[pointer] = array[index]
            pointer++
        }
    }
    for (i in pointer until array.size) {
        array[i] = null
    }
}

fun main() {
    createArray()
    println("*".repeat(50))
    createArrayList()
}