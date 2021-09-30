import java.util.*
import kotlin.math.ceil

fun main()=with(Scanner(System.`in`)) {
    val climb = nextInt()
    val slip = nextInt()
    val height = nextInt()
    println(climbSnail(climb, slip, height))
}
fun climbSnail(climb:Int, slip:Int, height:Int):Int {
    if(climb<=slip){
        return -1
    }
    return ceil((height-climb) / (climb - slip + 0.0)+1).toInt()
}