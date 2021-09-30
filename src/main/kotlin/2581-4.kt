import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    var min = -1
    var sum = 0
    for(i in x..y){
        if(checkPrime(i)){
            sum += i
            if(min == -1) {
                min = i
            }
        }
    }
    if(sum != 0){
        println(sum)
    }
    println(min)
}
fun checkPrime(a:Int):Boolean {
    if(a == 1) {
        return false
    }
    for(i in 2 until a){
        if(a%i == 0){
            return false
        }
    }
    return true
}