import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()
    var strArr = CharArray(n.length)
    for(i in strArr.indices){
        strArr[i]=n[i]
    }
    val numArr = strArr.toMutableList().sortedDescending()
    for(i in numArr) print(i)
}