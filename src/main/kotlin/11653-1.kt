import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.sqrt

fun main()=with(Scanner(System.`in`)) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = nextInt()
    val list = findFactor(n)
    for(i in list){
        bw.write("$i\n")
    }
    bw.flush()
}
fun findFactor(a:Int):MutableList<Int>{
    var list = mutableListOf<Int>()
    var a = a
    for(i in 2..sqrt(a.toDouble()).toInt()){
        while(a%i == 0){
            a /= i
            list.add(i)
        }
    }
    if(a != 1) list.add(a)
    return list
}

