fun greaterThan(numbers: List<Int>, n: Int): List<Int> {
    return numbers.filter { it > n }
}

fun main() {
    val originalList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val filterList = greaterThan(originalList, 4)
    println(filterList)
}