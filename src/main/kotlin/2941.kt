//import java.util.*
//
//fun main()=with(Scanner(System.`in`)) {
//    val str = next().reversed()
//    println(countAlphabet(str))
//}
//fun countAlphabet(str:String):Int {
//    var i = 0
//    var count = 0
//    while(true){
//        try {
//            when (str[i]) {
//                '=' -> {
//                    count++
//                    i+=2
//                    if (str[i+2] == 'd') {
//                        i++
//                    }
//                }
//                '-' -> { count++; i+=2 }
//                'j' -> {
//                    count++
//                    if (str[i+1] == 'l' || str[i + 1] == 'n') {
//                        i+=2
//                    } else {
//                        i++
//                    }
//                }
//                else -> { count++; i++ }
//            }
//        } catch(e:StringIndexOutOfBoundsException){
//            count++
//            break
//        }
//        if(i>=str.length){
//            break
//        }
//    }
//    return count
//}
import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val str = next()
    println(countAlphabet(str))
}
fun countAlphabet(str:String):Int {
    var i = str.length-1
    var count = 0
    while(true){
        try {
            when (str[i]) {
                '=' -> {
                    if(str[i-1] == 'c' || str[i-1] == 's') {
                        count++
                        i-=2
                    }
                    if(str[i-1] == 'z') {
                        if(str[i-2] == 'd'){
                            count++
                            i-=3
                        } else {
                            count++
                            i-=2
                        }
                    }
                }
                '-' -> { count++; i-=2 }
                'j' -> {
                    count++
                    if (str[i-1] == 'l' || str[i-1] == 'n') {
                        i-=2
                    } else {
                        i--
                    }
                }
                else -> { count++; i-- }
            }
        } catch(e:StringIndexOutOfBoundsException){
            count++
            break
        }
        if(i<0){
            break
        }
    }
    return count
}