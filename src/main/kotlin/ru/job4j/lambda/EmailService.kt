package ru.job4j.lambda

class EmailService {
    fun emailTo(message: Message): String {
        return with(StringBuilder()) {
            append("Subject : ").append(message.email)
            append("Body : ").append("Hello, ").append(message.email).append(" ")
            append("You win!")
        }.toString()
    }
}

fun main() {
    val service = EmailService()
    println(service.emailTo(Message("username", "email")))
}