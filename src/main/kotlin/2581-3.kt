import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    var rangeNumberList = MutableList(y+1) {true}
    var changeList = findPrime(x,rangeNumberList)
    if(sumTrueIndex(changeList) != 0){
        println(sumTrueIndex(changeList))
    }
    println(changeList.indexOf(true))
}
fun findPrime(x:Int, list:MutableList<Boolean>):MutableList<Boolean>{
    var list = list
    list[0] = false
    list[1] = false
    for(i in 2..list.lastIndex){
        if(list[i]){
            for(j in 2*i..list.lastIndex step i){
                list[j] = false
            }
        }
    }
    for(i in 0 until x){
        list[i] = false
    }
    return list
}
fun sumTrueIndex(list:MutableList<Boolean>):Int {
    var sum = 0
    for(i in list.indices){
        if(list[i]) sum += i
    }
    return sum
}


fun findPrime10000(list:MutableList<Boolean>):MutableList<Boolean>{
    var list = list
    list[0] = false
    list[1] = false
    for(i in 2..list.lastIndex){
        if(list[i]){
            for(j in 2*i..list.lastIndex step i){
                list[j] = false
            }
        }
    }
    return list
}