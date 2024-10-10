fun main() {
    print("Введите сумму в долларах: ")
    val dollars = readLine()?.toDoubleOrNull() ?: 0.0

    val euroRate = 0.9 // Текущий курс евро к доллару

    val euros = dollars * euroRate
    println("$dollars долларов = $euros евро")
}