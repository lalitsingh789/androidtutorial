fun main() {
    val num = 5 
    for (i in 0 until num) {
        for (j in 0 until num - i) {
            print(" ")
        }
        for (k in 0 until 2 * i + 1) {
            print("*")
        }
        println()
    }

    
    for (i in num - 1 downTo 0) {
        for (j in 0 until num - i) {
            print(" ")
        }
        for (k in 0 until 2 * i + 1) {
            print("*")
        }
        println()
    }
}
