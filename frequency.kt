fun main() {
    val input = "my first kotlin program"
    val f = IntArray(256) { 0 } 
    
    for (char in input) {
        val index = char.toInt()
        f[index]++
    }
    
    for (i in 0 until 256) {
        if (f[i] != 0) {
            println("${i.toChar()} : ${f[i]}")
        }
    }
}
