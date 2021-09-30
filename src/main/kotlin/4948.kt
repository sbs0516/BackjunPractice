import java.util.*
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main()=with(Scanner(System.`in`)) {
    while(true) {
        val n = nextInt()
        if( n ==0 ) exitProcess(0)
        val nDouble = n * 2
        val range = (0..nDouble).toMutableList()
        val list = countPN(n, range)
        println(list.size)
    }
}
fun countPN(n:Int, list:MutableList<Int>):MutableList<Int>{
    var list = list
    for(i in 0..n) list[i] = 0
    for(i in 2..sqrt(list.size.toDouble()).toInt()){
        for(j in 2*i until list.size step i){
            list[j] = 0
        }
    }
    list.removeAll(listOf(0))
    return list
}