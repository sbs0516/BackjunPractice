import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    println(findFraction(x))
}
fun findFraction(x:Int):String{
    val n = checkLine(x)
    val turnInLine = x - sumNature(n-1)
    return if(n%2 == 0){
        val s = String.format("%d/%d",turnInLine,n-turnInLine+1)
        s
    } else {
        val s = String.format("%d/%d",n-turnInLine+1,turnInLine)
        s
    }
}
fun checkLine(x:Int):Int {
    var sum = 0
    var i = 1
    while(true){
        sum += i
        if(sum>=x){
            break
        }
        i++
    }
    return i
}
fun sumNature(n:Int):Int{
    var sum = 0
    for(i in 1..n){
        sum += i
    }
    return sum
}