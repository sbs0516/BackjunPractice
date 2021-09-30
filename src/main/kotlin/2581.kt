import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    var range = Array(y+1) { 0 }
    for(i in x..y){
        range[i] = i
    }
    var rangeList = range.toMutableList()
    rangeList.remove(0)
    rangeList.remove(1)

    val primeNumberList = findPrimeNumber(rangeList).sorted()
    if(primeNumberList.toIntArray().sum() == 0){
        println(-1)
    } else {
        println(primeNumberList.toIntArray().sum())
        println(primeNumberList.first())
    }
}
fun findPrimeNumber(list:MutableList<Int>): List<Int> {
    var pnList = list
    for (i in pnList) {
        if (i == 2) {
            continue
        } else {
            var j = 2
            while (j < i) {
                if (i % j == 0) {
                    pnList[pnList.indexOf(i)] = 0
                }
                j++
                if (j == i) {
                    break
                }
            }
        }
    }
    return pnList
}
//    return pnList.filter {
//        if(it == 2){
//            true
//        }
//        var j = 2
//        while (j < it) {
//            if (it % j == 0) {
//                return false
//            }
//            j++
//            if (j == it) {
//                return true
//            }
//        }
//    }
//}
