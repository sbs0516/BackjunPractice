import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    for(i in 1..t){
        val repeat = nextInt()
        val str = next()
        var sb = StringBuilder()
        for(i in str.indices){
            val str1 = str.substring(i,i+1)
            var sb1 = StringBuilder()
            for(j in 0 until repeat){
                sb1.append(str1)
            }
            sb.append(sb1)
        }
        println(sb)
    }
}