package ru.job4j.safe

import java.time.LocalDate

class Stock(
    val name: String,
    val currency: String,
    val created: LocalDate = LocalDate.now()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stock) return false

        return name == other.name
                && currency == other.currency
                && created == other.created
    }

    override fun hashCode(): Int {
        var result = 17
        result = 31 * result + name.hashCode()
        result = 31 * result + currency.hashCode()
        result = 31 * result + created.hashCode()
        return result
    }

}