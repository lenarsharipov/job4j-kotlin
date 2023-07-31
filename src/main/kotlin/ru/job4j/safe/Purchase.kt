package ru.job4j.safe

import java.time.LocalDate

class Purchase(
    var name: String = "",
    var created: LocalDate = LocalDate.now(),
    var address: Address? = null
)

fun generateHtml(purchases: List<Purchase>): String {
    val table = StringBuilder()
    val ln = System.lineSeparator()
    val openTr = "<tr>"
    val closingTr = "</tr>"
    val openTh = "<th>"
    val closingTh = "</th>"
    val openTd = "<td>"
    val closingTd = "</td>"

    table.apply {
        append("<table>").append(ln)
            .append(openTr).append(ln)
                .append(openTh).append("Name").append(closingTh).append(ln)
                .append(openTh).append("Date").append(closingTh).append(ln)
                .append(openTh).append("Address").append(closingTh).append(ln)
            .append(closingTr).append(ln)

        for (purchase in purchases) {
            append(openTr).append(ln)
                with(purchase) {
                    append(openTd).append(name).append(closingTd).append(ln)
                    .append(openTd).append(created).append(closingTd).append(ln)
                    .append(openTd).append(address ?: "").append(closingTd).append(ln)
                }
            append((closingTr)).append(ln)
        }
        append("</table>").append(ln)
    }
    return table.toString()
}

fun main() {
    val purchases = listOf(
        Purchase(name = "name", address = null),
        Purchase(name = "name2", address = Address("street", "house", Zip(12345)))
    )
    val table = generateHtml(purchases)
    println(table)
}