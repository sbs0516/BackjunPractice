//import java.util.*
//
//fun main()=with(Scanner(System.`in`)) {
//    val str = next()
//    var count = 0
//    for(i in str.indices){
//        var char = str[i].toInt()
//        when(char){
//            65,66,67    -> count+=3
//            68,69,70    -> count+=4
//            71,72,73    -> count+=5
//            74,75,76    -> count+=6
//            77,78,79    -> count+=7
//            80,81,82,83 -> count+=8
//            84,85,86    -> count+=9
//            87,88,89,90 -> count+=10
//        }
//    }
//    println(count)
//}
//import java.util.*
////
//fun main()=with(Scanner(System.`in`)) {
//    val str = next()
//    val intArray = IntArray(str.length)
//    for ( i in intArray.indices) {
//        intArray[i] = str[i].toInt()
//    }
//    println(intArray.map{
//        when(it){
//                 in 65..67 -> 3
//                else -> 0
//            }
//    })
//}
//    var count = 0
//    for(i in str.indices){
//        var char = str[i]
//        when(char){
//            'A','B','C'     -> count+=3
//            'D','E','F'     -> count+=4
//            'G','H','I'     -> count+=5
//            'J','K','L'     -> count+=6
//            'M','N','O'     -> count+=7
//            'P','Q','R','S' -> count+=8
//            'T','U','V'     -> count+=9
//            'W','X','Y','Z' -> count+=10
//        }
//    }
import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val str = next().toCharArray().map{
        charToNum(it)
    }.sum()
    println(str)
}
fun charToNum(a:Char):Int{
    return when(a){
        in 'A'..'C' -> 3
        in 'D'..'F' -> 4
        in 'G'..'I' -> 5
        in 'J'..'L' -> 6
        in 'M'..'O' -> 7
        in 'P'..'S' -> 8
        in 'T'..'V' -> 9
        in 'W'..'Z' -> 10
        else        -> throw IllegalArgumentException()
    }
}