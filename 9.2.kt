fun main() {
    print("Введите строку: ")
    val text = readLine() ?: "" // Получаем строку от пользователя

    var vowelsCount = 0
    var consonantsCount = 0

    for (char in text.lowercase()) {
        if (char in "aeiouy") {
            vowelsCount++
        } else if (char.isLetter()) {
            consonantsCount++
        }
    }

    println("Гласных: $vowelsCount")
    println("Согласных: $consonantsCount")
}