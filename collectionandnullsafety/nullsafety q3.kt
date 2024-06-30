fun printUppercase(str: String?) {
    str?.let {
        println(it.uppercase())
    } ?: println("String is null")
}

fun main() {
    val str: String? = "hello"
    printUppercase(str)
}