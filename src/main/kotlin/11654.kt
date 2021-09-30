import java.util.*

fun main()=with(Scanner(System.`in`)){
    val t = nextInt()
    var str = next()
    var sum = 0
    for(i in 0 until t){
        sum+=str.substring(i,i+1).toInt()
    }
    println(sum)
}
