import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    var list = mutableListOf<Int>()
    for(i in 1..n) list.add(nextInt())
    list.sort()
    for(i in list) println(i)
}
