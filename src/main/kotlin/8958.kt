import java.io.BufferedReader
import java.io.InputStreamReader

fun main()=with(BufferedReader(InputStreamReader(System.`in`))) {
    val t = readLine().toInt()
    for(i in 1..t) {
        val charArray = readLine().toCharArray()
        println(makeArray(charArray).sum())
//        println(makeArray(charArray))
    }
}
//fun makeArray(arr:CharArray):Int{
//    var continueValue = 0
//    var totalValue = 0
//    arr.forEach {
//        if(it == 'O'){
//            continueValue++
//            totalValue += continueValue
//        } else {
//            continueValue=0
//        }
//    }
//    return totalValue
//}

fun makeArray(arr:CharArray):IntArray{
    var continueValue = 0
    return arr.map{
        if(it == 'O'){
            continueValue++
        } else {
            continueValue = 0
        }
        continueValue
    }.toIntArray()
}

//fun makeArray(arr:CharArray):IntArray{
//    var scoreArray = IntArray(arr.size)
//    if(arr[0] == 'O'){
//        scoreArray[0] = 1
//    } else {
//        scoreArray[0] = 0
//    }
//    for(i in 1 until arr.size) {
//        if (arr[i] == 'O') {
//            if (arr[i] == arr[i-1]) {
//                scoreArray[i] = scoreArray[i-1] + 1
//            } else {
//                scoreArray[i] = 1
//            }
//        } else {
//            scoreArray[i] = 0
//        }
//    }
//    return scoreArray
//}
