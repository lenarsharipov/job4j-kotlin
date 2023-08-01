package ru.job4j.dsl

import org.apache.commons.dbcp.BasicDataSource

class Pool private constructor(
    private val source: BasicDataSource
) {
    fun print() {
        with(source) {
            println(
                "Pool($driverClassName, $url, $username, $password, " +
                        "$minIdle, $maxIdle, $maxOpenPreparedStatements)"
            )
        }
    }

    companion object Builder {

        private val source: BasicDataSource = BasicDataSource()
        fun driverClassName(driverClassName: String) =
            apply { source.driverClassName = driverClassName }

        fun url(url: String) = apply { source.url = url }

        fun username(username: String) = apply { source.username = username }

        fun password(password: String) = apply { source.password = password }

        fun minIdle(minIdle: Int) = apply { source.minIdle = minIdle }

        fun maxIdle(maxIdle: Int) = apply { source.maxIdle = maxIdle }

        fun maxOpenPreparedStatements(max: Int) = apply { source.maxOpenPreparedStatements = max }

        fun build(): Pool = Pool(source)
    }

}

fun main() {
    val pool = Pool
        .driverClassName("org.postgres.Driver")
        .url("localhost")
        .username("postgres")
        .password("password")
        .minIdle(5)
        .maxIdle(10)
        .maxOpenPreparedStatements(100)
        .build()

    pool.print()

}