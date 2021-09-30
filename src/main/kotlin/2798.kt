import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val st = StringTokenizer(readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val st1 = StringTokenizer(readLine())
    var numArr = IntArray(n)
    for(i in 0 until n){
        numArr[i] = st1.nextToken().toInt()
    }
    println(choiceCard(n,m,numArr))
}
fun choiceCard(n:Int, m:Int, numArr:IntArray):Int {
    var sum = 0
    for(i in 0 until n-2){
        for(j in i+1 until n-1){
            for(k in j+1 until n){
                if(numArr[i]+numArr[j]+numArr[k] in (sum+1)..m){
                    sum = numArr[i]+numArr[j]+numArr[k]
                }
            }
        }
    }
    return sum
}
