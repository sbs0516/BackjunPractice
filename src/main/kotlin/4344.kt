import java.util.*
import kotlin.math.roundToInt

fun main()=with(Scanner(System.`in`)){
    val t = nextInt()
    var countStudent = 0
    var percentage = 0.0
    for(i in 1..t) {
        val student = nextInt()
        var score = IntArray(student)
        for (i in 0 until student) {
            score[i] = nextInt()
        }
        countStudent = countStudent(score)
        percentage = (countStudent * 100.0 / student    )
        println(String.format("%.3f",roundThird(percentage))+"%")
    }
}
fun countStudent(arr:IntArray):Int{
    val avg = arr.average()
    return arr.count { it > avg}
}
fun roundThird(a:Double):Double{
    val round = (a*1000.0).roundToInt()/1000.0
    return round
}