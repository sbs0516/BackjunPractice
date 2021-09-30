import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = nextInt()
    println(hanoi(n,1,3,bw))
    bw.flush()
    bw.close()
}
fun hanoi(n:Int, x:Int, y:Int, bw:BufferedWriter):Int{
    var count = 0
    return if(n==0) count
    else {
        count += hanoi(n-1,x,6-x-y,bw)
        count++
        bw.write("$x $y\n")
        count += hanoi(n-1,6-x-y,y,bw)
        count
    }
}
