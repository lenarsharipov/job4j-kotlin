package ru.job4j.safe

class Account {
    var address: Address? = null

}

data class Address(
    var street: String? = null,
    var house: String? = null,
    var zip : Zip? = null
)

data class Zip(
    var code: Int? = null
)

fun main() {
    val list = listOf(
        Account(),
        Account().apply { address = Address() },
        Account().apply { address = Address().apply { zip = Zip().apply { code = 123 } } }
    )

    list.forEach {
        val code = it.address?.zip?.code ?: "not defined"
        println(code)
    }
}