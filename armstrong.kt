fun main() {
    val number = 371
    var originalNumber = number
    var result = 0

    while (originalNumber != 0) {
        val remainder = originalNumber % 10
        result += remainder * remainder * remainder
        originalNumber /= 10
    }

    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is not an Armstrong number.")
}
