import java.util.*
import kotlin.math.PI
import kotlin.math.round

fun main()=with(Scanner(System.`in`)) {
    val r = nextInt()
    println(String.format("%.6f",calcEuclidean(r)))
    println(String.format("%.6f",calcTaxi(r)))
}
fun calcEuclidean(r:Int): Double {
    return round((r*r*PI)*100000)/100000.0
}
fun calcTaxi(r:Int): Double {
    return round((2.0*r*r)*100000)/100000.0
}