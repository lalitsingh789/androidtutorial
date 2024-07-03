import kotlinx.coroutines.*

fun accessArrayElement(array: Array<Int>, index: Int): Int? {
    return try {
        array[index]
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Exception: Index out of bounds")
        null
    } finally {
        println("End of operation")
    }
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)


    val element1 = accessArrayElement(array, 2)
    println("Element at index 2: $element1")

   
    val element2 = accessArrayElement(array, 10)
    println("Element at index 10: $element2")
}
