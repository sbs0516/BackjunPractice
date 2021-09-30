import java.util.*
import kotlin.math.ceil

fun main()=with(Scanner(System.`in`)) {
    val fixedCost = nextInt()
    val variableCost = nextInt()
    val price = nextInt()
    println(calcBreakEvenPoint(fixedCost,variableCost,price))

}
fun calcBreakEvenPoint(fixedCost:Int, variableCost:Int, price:Int):Int {
    var volume = 0
    if(price <= variableCost){
        return -1
    }
    volume = ceil(fixedCost / (price - variableCost)+1.0).toInt()
    return volume
}