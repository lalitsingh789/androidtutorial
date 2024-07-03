fun main() {
    val animal = listOf(
        "tiger" to 15,
        "lion" to 5,
        "elephant" to 20,
        "zebra" to 14,
        "monkey" to 22
    )
    
    //val sortByAge = { list: List<Pair<String, Int>> -> list.sortedBy { it.second } }
val sortedanimal = { list: List<Pair<String, Int>> -> list.sortedBy { it.second } }(animal)
    println(sortedanimal)
}