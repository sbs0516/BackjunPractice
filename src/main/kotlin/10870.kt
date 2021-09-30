import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    println(fibonacci(n))
}
fun fibonacci(n:Int):Int = when(n){
        0 -> 0
        1 -> 1
        else -> fibonacci(n-1)+fibonacci(n-2)
    }