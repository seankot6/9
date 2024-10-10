fun findLongestWord(text: String): String {
    val words = text.split("[\\s.,?!;:]+".toRegex()) // Разделяем на слова с учетом знаков препинания
    var longestWord = words[0]
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }
    return longestWord
}

fun main() {
    print("Введите строку: ")
    val text = readLine() ?: ""

    val longestWord = findLongestWord(text)
    println("Самое длинное слово: $longestWord")
}