package ru.job4j.lambda

class DbApply {
    private val pool = Pool()

    fun config() {
        pool.apply{
            driver = "org.postgres.Driver"
            url = "jdbc://localhost:5432/job4j"
            username = "postgres"
            password = "password"
        }
    }
}

fun main() {
    val db = DbApply()
    db.config()
}