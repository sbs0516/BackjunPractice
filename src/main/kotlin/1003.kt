import java.util.*

fun main()= with(Scanner(System.`in`)) {
    val n = nextInt()
    println(fibo(n))
}
fun fibo(n:Int):Int {
    return when(n){
        0 -> 0
        1 -> 1
        else -> fibo(n-1)+fibo(n-2)
    }
}
// 풀이 일시중단