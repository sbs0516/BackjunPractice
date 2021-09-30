import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val m = nextInt()
    val n = nextInt()
    val list = findPN(m,n)
    for(i in list) bw.write("$i\n")
    bw.flush()
}
fun findPN(m:Int, n:Int):MutableList<Int>{
    var list = mutableListOf<Int>()
    for(i in m..n){
        if(i == 1) continue
        if(i == 2) {
            list.add(i)
            continue
        }
        for(j in 2..i){
            if(j == i){
                list.add(i)
            }
            if(i%j == 0) break
        }
    }
    return list
}
