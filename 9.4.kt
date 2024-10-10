fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val sortedStr1 = str1.lowercase().toCharArray().sortedArray()
    val sortedStr2 = str2.lowercase().toCharArray().sortedArray()
    return sortedStr1.contentEquals(sortedStr2)
}

fun main() {
    print("Введите первую строку: ")
    val str1 = readLine() ?: ""
    print("Введите вторую строку: ")
    val str2 = readLine() ?: ""

    if (isAnagram(str1, str2)) {
        println("Строки являются анаграммами")
    } else {
        println("Строки не являются анаграммами")
    }
}