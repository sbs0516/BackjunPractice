import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    if(str.isEmpty() || str==" ") {
        println("0")
    } else {
        var str1 = str.trim().split(" ")
        println(str1.size)
    }
}