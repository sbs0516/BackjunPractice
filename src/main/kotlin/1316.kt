import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    var count = 0
    for(i in 1..t){
        val word = next()
        if(checkGroupWord(word)){
            count++
        }
    }
    println(count)
}
//fun checkGroupWord(str:String):Boolean{
//    val charList = ArrayList<Char>()
//    str.forEach { char ->
//        if(charList.contains(char) && charList.last() != char){
//            return false
//        }
//        if(!charList.contains(char)){
//            charList.add(char)
//        }
//    }
//    return true
//}
fun checkGroupWord(str:String):Boolean {
    if (str.length == 1) {
        return true
    }
    val lastChar = str.last()
    val lastDroppedStr = str.dropLast(1)

    if (lastDroppedStr.last() != lastChar && lastDroppedStr.contains(lastChar)) {
        return false
    } else {
        return checkGroupWord(lastDroppedStr)
    }
}
//fun checkGroupWord(str:String):Boolean{
//    var i = 0
//    if(str.length == 1){
//        return true
//    } else {
//        while (true) {
//            if (str[i] == str[i+1]) {
//                i++   
//            } else {
//                if (str.lastIndexOf(str[i]) == i) {
//                    i++
//                } else {
//                    return false
//                }
//            }
//            if (i == str.length - 1) break
//        }
//        return true
//    }
//}