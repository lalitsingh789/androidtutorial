import kotlinx.coroutines.*

suspend fun longRunningTask() {
    println("Task started...")
    delay(3000L)
    println("Task completed.")
}

fun main() = runBlocking {
    try {
        withTimeout(2000L) {
            longRunningTask()
        }
    } catch (e: TimeoutCancellationException) {
        println("Task was cancelled due to timeout.")
    }
    println("End of main function.")
}
