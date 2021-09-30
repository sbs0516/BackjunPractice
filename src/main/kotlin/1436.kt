import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    println(findNum(n))
}
fun findNum(n:Int):Int{
    if(n==1) return 666
    else {
        var count = 1
        var num = 1666
        while (true) {
            val numStr = num.toString()
            if(numStr.contains("666")){
                count++
            }
            if(n==count){
                return num
            }
            num++
        }
    }
}
