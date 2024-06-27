fun main() {
    val str = "this is my first kotlin program"
    val ch = 'o'  
    var f = 0  

    for (i in 0 until str.length) {  
        if (ch == str[i]) {  
            f++  
        }
    }

    println("Frequency of '$ch' = $f")
}
