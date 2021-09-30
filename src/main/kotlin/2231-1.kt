import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    println(getSum(n))
}

fun getSum(n:Int):Int{

    for(i in 1..1000000){
        var origin = i
        var sum = 0
        while(true){
            sum += origin%10
            origin /= 10
            if(origin <= 0) break
        }
        if(sum+i == n) return i
    }
    return 0
}