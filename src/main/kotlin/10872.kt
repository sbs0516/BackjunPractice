import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    println(factorial(n))
}
fun factorial(n:Int):Int{
    return if(n>0){
        n*factorial(n-1)
    } else{
        1
    }
}
