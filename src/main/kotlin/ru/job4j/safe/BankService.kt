package ru.job4j.safe

class BankService(
    private val users: MutableMap<User, MutableList<Account>> = HashMap()
) {
    fun addUser(user: User) {
        users.putIfAbsent(user, ArrayList())
    }

    fun findByRequisite(passport: String, requisite: String): Account? {
        val user = findByPassport(passport) ?: return null

        return users[user]
            ?.stream()
            ?.filter { it.requisite == requisite }
            ?.findFirst()
            ?.orElse(null)
    }

    fun addAccount(passport: String, account: Account) {
        val user = findByPassport(passport) ?: return

        users[user]?.add(account)
    }

    fun findByPassport(passport: String): User? {
        for (user in users.keys) {
            if (user.passport == passport) return user
        }
        return null
    }

    fun transferMoney(
        srcPassport: String,
        srcRequisite: String,
        destPassport: String,
        descRequisite: String,
        amount: Double
    ): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, descRequisite)
        val rsl: Boolean = (source != null) && (dest != null)
        if (rsl) {
            source?.balance = source?.balance?.minus(amount)!!
            dest?.balance = dest?.balance?.plus(amount)!!
        }
        return rsl
    }

    class User(
        val passport: String,
        val name: String
    )

    class Account(
        val requisite: String,
        var balance: Double
    )
}

fun main() {
    val bank = BankService()
    bank.addUser(BankService.User("321", "Petr"))
    var user = bank.findByPassport("3211")
    println(user?.name)
    user = bank.findByPassport("321")
    println(user?.name)
}