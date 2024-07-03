import kotlinx.coroutines.*

fun main() {
    try {
        var x = 10
        var y = 0
        var res = x / y
        println(res)
    } catch (e: ArithmeticException) {
        println("caught exception: ${e.message}")
    } finally {
        println("finally program is over")
    }
}
