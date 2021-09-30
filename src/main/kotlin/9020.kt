import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    var boolean = Array(10001) {true}
    var primeArr = prime(boolean)
    for(i in 1..t){
        val n = nextInt()
        val pair = goldPartition(n, primeArr)
        println(String.format("%d %d",pair.first,pair.second))
    }
}
fun goldPartition(n:Int, arr:Array<Boolean>):Pair<Int,Int>{
    val a = n/2
    var est = 0
    for(i in a downTo 2){
        if(arr[i] && arr[n-i]) {
            est = i
            break
        }
    }
    return Pair(est,n-est)
}
fun prime(arr:Array<Boolean>):Array<Boolean>{
    var arr = arr
    arr[0] = false
    arr[1] = false
    for(i in 2 until arr.size){
        for(j in 2*i until arr.size step i){
            arr[j] = false
        }
    }
    return arr
}
