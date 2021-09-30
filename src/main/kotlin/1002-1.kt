import java.util.*
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
        val dist = sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2).toDouble()))
        arr[i] = countCase1(dist, r1, r2)
    }
    for(i in arr){
        println(i)
    }
}
fun countCase1(dist:Double, r1:Int, r2:Int):Int {
    return if((dist==0.0 && r1!=r2)||(dist>r1+r2)||(dist+r1<r2)) 0
    else if(dist.equals(r1+r2)||(dist+r1).equals(r2)) 1
    else if(dist==0.0 && r1==r2) -1
    else 2
}