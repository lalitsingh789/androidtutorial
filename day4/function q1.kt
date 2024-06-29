fun main() {
    val num1 = 23
    val num2 = 10
    println("The larger number of $num1 and $num2 is ${maxOfTwo(num1, num2)}")
}

fun maxOfTwo(x: Int, y: Int): Int {
    return if (x > y) x else y
}
