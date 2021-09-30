import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    var arr = IntArray(t)
    for(i in arr.indices) {
        val x1 = nextInt()
        val y1 = nextInt()
        val r1 = nextInt()
        val x2 = nextInt()
        val y2 = nextInt()
        val r2 = nextInt()
        arr[i] = countCase(x1,y1,r1,x2,y2,r2)
    }
    for(i in arr){
        println(i)
    }
}
fun countCase(x1:Int,y1:Int,r1:Int,x2:Int,y2:Int,r2:Int):Int{
    val dist = sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2).toDouble())).toInt()

    return if(((x1==x2)&&(y1==y2)) && r1==r2) {
        -1
    } else if((x1==x2&&y1==y2&&r1!=r2) || dist > r1+r2 || dist < abs(r1-r2)) {
        0
    } else if(dist == abs(r1-r2) || dist == r1+r2){
        1
    } else{
        2
    }
//    val rs = r1+r2
//    val rd = abs(r1-r2)
//    return if((x1 != x2 || y1 != y2) && dist < rs)
//        2
//    else if( dist == rs || dist == rd )
//        1
//    else
//        0
//
//    if( x1 == x2 && y1 == y2 && r1 == r2 )
//        return -1
}
