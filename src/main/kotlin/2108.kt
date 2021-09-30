import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.round

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var arr = IntArray(n)
    for(i in 0 until n){
        arr[i] = readLine().toInt()
    }
    if(n==1){
        println(arr[0])
        println(arr[0])
        println(arr[0])
        println(0)
    } else {
        println(round(arr.average()).toInt())
        arr.sort()
        println(arr[arr.size / 2])
        println(findMulti(arr))
        println(arr[arr.size - 1] - arr[0])
    }
}
fun findMulti(arr:IntArray):Int{
    var count = IntArray(8001)
    for(i in arr){
        count[i+4000]++
    }
    val max = count.maxOrNull()
    var cnt = 0
    var index = 0
    for(i in count.indices){
        if(count[i]==max) {
            cnt++
            index = i
        }
        if(cnt==2) return i-4000
    }
    return index-4000
}
