import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    val w = nextInt()
    val h = nextInt()
    println(calcMinDistance(x,y,w,h).first())
}
fun calcMinDistance(x:Int,y:Int,w:Int,h:Int):List<Int>{
    return arrayOf((w-x),x,(h-y),y).sorted()
}