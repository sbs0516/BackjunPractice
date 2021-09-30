import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val m = nextInt()
    val n = nextInt()
    var range = (0..n).toMutableList()
    val primeList = writePrimeList(m,range)
    for(i in primeList){
        println(i)
    }
}
fun writePrimeList(m:Int, list:MutableList<Int>):MutableList<Int>{
    var list = list
    list[0] = 0
    list[1] = 0
    for(i in 0 until m) list[i] = 0
    for(i in 2 until list.size){
        for(j in 2*i until list.size step i){
            list[j] = 0
        }
    }
    list.removeAll(listOf(0))
    return list
}
