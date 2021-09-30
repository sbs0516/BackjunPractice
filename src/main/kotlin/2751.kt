import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = nextInt()
    var list = mutableListOf<Int>()
    for(i in 1..n) list.add(nextInt())
    list.sort()
    for(i in list) {
        bw.write("$i\n")
    }
    bw.flush()
}
