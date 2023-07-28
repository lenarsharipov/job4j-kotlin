package ru.job4j.lambda

import java.time.LocalDate

data class Company(
    val name: String,
    val address: Address,
    val created: LocalDate = LocalDate.now()
) {
    companion object {
        fun info(companies: List<Company>): List<String> {
            return companies.map { "${it.name}, ${it.address.city}, ${it.created.year}" }
        }
    }
}

data class Address(
    val street: String,
    val city: String,
    val country: String
)

fun main() {
    val companies = listOf(
        Company("ABC", Address("street1", "city1", "country1")),
        Company("QWERTY", Address("street2", "city2", "country2")),
        Company("XYZ", Address("street3", "city3", "country3")),
    )

    println(Company.info(companies))
}
