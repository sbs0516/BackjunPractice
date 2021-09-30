import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    var count = 0
    for(i in 1..t){
        if(verifyHanSoo(i)){
            count++
        }
    }
    println(count)
}
fun verifyHanSoo(a:Int):Boolean{
    return if(a == 1000){
        false
    } else if(a/100 > 0){
        val com1 = a%10
        val com2 = (a/10)%10
        val com3 = (a/100)%10
        (com1-com2)==(com2-com3)
    } else if(a/10 > 0){
        true
    } else {
        true
    }
}