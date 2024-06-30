fun main() {
    val list = listOf(1, null, 4, null, 5)
    val filter = list.filterNotNull()
    println(filter)
}
output:[1, 4, 5]