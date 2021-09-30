import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    println(findFraction1(x))
}
fun findFraction1(x:Int):String{
    var n = x
    var i = 1
    while(n>i){
        n -= i++
    }
    return if(i%2 == 0){
        val s = "$n/${i+1-n}"
        s
    } else {
        val s = "${i+1-n}/$n"
        s
    }
}