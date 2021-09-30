import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    var countArr = IntArray(123)
    countArr = countChar(str,countArr)
    val max = countArr.maxOrNull()
    println(checkMaxChar(max, countArr).toUpperCase())
}
fun countChar(str:String, arr:IntArray):IntArray{
    var arr = arr
    for(i in str.indices){
        val char = str[i].toLowerCase()
        arr[char.toInt()]++
    }
    return arr
}
fun checkMaxChar(a:Int?, arr:IntArray):Char{
    var count = 0
    val max = a
    var index = 0
    for(i in arr.indices){
        if(arr[i] == max){
            count++
            index = i
        }
    }
    return if(count>1){
        '?'
    } else index.toChar()
}