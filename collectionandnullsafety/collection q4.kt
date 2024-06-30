fun isSubset(subset: List<Int>, superset: List<Int>): Boolean {
    return subset.all { it in superset }
}

fun main() {
    val originalList = listOf(1, 2, 3, 4, 5)
    val subsetList1 = listOf(2, 4)
    val subsetList2 = listOf(1, 3, 6)

    println("Is $subsetList1 a subset of $originalList is ${isSubset(subsetList1, originalList)}")
    println("Is $subsetList2 a subset of $originalList is ${isSubset(subsetList2, originalList)}")
}