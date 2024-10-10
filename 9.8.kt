import kotlin.random.Random

fun main() {
    val numberToGuess = Random.nextInt(1, 101) // Случайное число от 1 до 100
    var guess: Int
    var attempts = 0

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100.")

    do {
        print("Введите ваше число: ")
        guess = readLine()?.toIntOrNull() ?: 0
        attempts++

        if (guess < numberToGuess) {
            println("Загаданное число больше.")
        } else if (guess > numberToGuess) {
            println("Загаданное число меньше.")
        }
    } while (guess != numberToGuess)

    println("Поздравляю! Вы угадали число $numberToGuess за $attempts попыток.")
}
