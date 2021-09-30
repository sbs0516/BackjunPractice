import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val kg = nextInt()
    println(calcSugarBag(kg))
}
fun calcSugarBag(kg:Int):Int {
    var kg = kg
    var count = 0
    while(true){
        if(kg%5 == 0){
            count += kg/5
            break
        }
        if(kg <= 0){
            return -1
        }
        kg -= 3
        count++
    }
    return count
}
//fun calcSugarBag(kg:Int):Int {
//    var five = kg/5
//    var three = 0
//    if(kg == 3 || kg == 5){
//        return 1
//    }
//    if(kg == 4 || kg == 7) {
//        return -1
//    }
//    while(true){
//        if((kg-5*five)%3 == 0){
//            three = (kg-5*five)/3
//            break
//        }
//        five--
//    }
//    return five+three
//}
