import kotlin.random.Random

fun generatePassword(length: Int): String {
    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+"
    val password = StringBuilder()

    for (i in 1..length) {
        val randomIndex = Random.nextInt(chars.length)
        password.append(chars[randomIndex])
    }

    return password.toString()
}

fun main() {
    print("Введите желаемую длину пароля: ")
    val passwordLength = readLine()?.toIntOrNull() ?: 0

    val password = generatePassword(passwordLength)
    println("Сгенерированный пароль: $password")
}