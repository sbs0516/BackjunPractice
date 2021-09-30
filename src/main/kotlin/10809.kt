import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val str = next()
    for(i in 0 until 26){
        val n = "${(97+i).toChar()}"
        print("${str.indexOf(n)} ")
    }
}