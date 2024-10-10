fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    print("Введите число N: ")
    val n = readLine()?.toIntOrNull() ?: 0

    println("Простые числа до $n:")
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}
