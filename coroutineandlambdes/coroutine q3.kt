import Kotlinx.coroutines.*

class InvalidAgeException(message: String) : Exception(message)

fun checkAge(age: Int) {
    if (age < 18) {
        throw InvalidAgeException("Age must be at least 18. Provided age: $age")
    } else {
        println("Age is valid: $age")
    }
}

fun main() {
    val age1 = 16
    val age2 = 20
    
    try {
        checkAge(age1)
    } catch (e: InvalidAgeException) {
        println("Caught an exception: ${e.message}")
    }
    
    try {
        checkAge(age2)
    } catch (e: InvalidAgeException) {
        println("Caught an exception: ${e.message}")
    }
}

