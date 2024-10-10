fun main() {
    print("Введите строку: ")
    val text = readLine() ?: ""

    val reversedText = text.reversed()
    println("Строка с измененным регистром: $reversedText")
}