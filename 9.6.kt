fun main() {
    print("Введите строки, разделенные пробелами: ")
    val input = readLine() ?: ""
    val strings = input.split(" ")

    val sortedStrings = strings.sortedArray()

    println("Отсортированные строки:")
    for (str in sortedStrings) {
        println(str)
    }
}
