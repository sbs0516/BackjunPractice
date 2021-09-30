import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    var range = Array(y+1) { 0 }
    for(i in x..y){
        range[i] = i
    }
    val primeNumber = findPrimeNumber1(range)
    if(primeNumber.sum() == 0){
        println(-1)
    } else {
        println(primeNumber.sum())
        val pnList = primeNumber.toMutableList()
        pnList.remove(0)
        println(pnList.first())
    }
}
fun findPrimeNumber1(arr:Array<Int>): Array<Int> {
    var pnList = arr
    for (i in pnList.indices) {
        if (pnList[i] == 2) {
            continue
        } else {
            var j = 2
            while (j < pnList[i]) {
                if (pnList[i] % j == 0) {
                    pnList[i] = 0
                }
                j++
                if (j == pnList[i]) {
                    break
                }
            }
        }
    }
    return pnList
}