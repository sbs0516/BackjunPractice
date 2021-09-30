import java.util.*
import kotlin.math.floor
import kotlin.math.sqrt

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    for(i in 1..t) {
        val coordinateX = nextDouble()
        val coordinateY = nextDouble()
        val distance = coordinateY - coordinateX
        println(countMoveDistance(distance))
    }
}
fun countMoveDistance(distance:Double):Int {
    var count = 0
    if(distance == 0.0) return count
    val a = floor(sqrt(distance))
    val distance = distance
//    var a = 0
//    while(true){
//        if(a*a<=distance && distance<(a+1)*(a+1)){
//            break
//        }
//        a++
//    }
    if(distance == a*a){
        count = (2*a-1).toInt()
    } else if(a*a<distance && distance<=a*a+a){
        count = (2*a).toInt()
    } else if(a*a+a<distance && distance<(a+1)*(a+1)){
        count = (2*a+1).toInt()
    }
    return count
}
//fun countMoveDistance(distance:Double):Int {
//    var move = 0
//    var count = 0
//    if(distance == 0.0) return count
//    var i = 1
//    while(move<distance){
//        move += i
//        count++
//        if(move >= distance){
//            break
//        }
//        move += i
//        count++
//        i++
//    }
//    return count
//}
