import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    println(calcThroughRoom(n))
}
fun calcThroughRoom(n:Int):Int {
    if(n == 1){
       return 1
    }
    var start = 2
    var end = 1
    var i = 0
    while (true) {
        val startStack = start
        val endStack = end
        start = startStack + 6 * i
        end = endStack + 6 * (i + 1)
        if (n in start..end) {
            break
        }
        i++
    }
    return i+2
}
