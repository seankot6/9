import kotlin.random.Random

fun main() {
    for (i in 1..10) {
        val randomNumber = Random.nextInt(1, 101) // Генерация случайного числа от 1 до 100
        println("Случайное число $i: $randomNumber")
    }
}