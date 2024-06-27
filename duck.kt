fun main() {
    val num = 3210 
    var n = num
    var isDuck = false

    while (n > 0) {
        val digit = n % 10
        if (digit == 0) {
            isDuck = true
            break
        }
        n /= 10
    }

    if (isDuck) {
        println("$num is a duck number.")
    } else {
        println("$num is not a duck number.")
    }
}
