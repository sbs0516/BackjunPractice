import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val str1 = nextInt().toString().reversed().toInt()
    val str2 = nextInt().toString().reversed().toInt()
    if(str1 > str2){
        println(str1)
    } else println(str2)
}