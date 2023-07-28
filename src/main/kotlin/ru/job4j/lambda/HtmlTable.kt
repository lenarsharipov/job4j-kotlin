package ru.job4j.lambda

import java.lang.StringBuilder

class HtmlTable {
    fun table(row: Int, cell: Int): String {
        val ln = System.lineSeparator()
        val table = StringBuilder()
        table.apply {
            append("<table>")
            append(ln)
            for (i in 1..row) {
                append("<tr>")
                append(ln)
                for (j in 1..cell) {
                    append("<td>")
                    append("</td>")
                    append(ln)
                }
                append("</tr>")
                append(ln)
            }
            append("</table>")
        }
        return table.toString()
    }
}

fun main() {
    val html = HtmlTable()
    println(html.table(4, 3))
}