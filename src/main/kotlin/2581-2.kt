import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    var range = (x..y).toMutableList()
    range.remove(1)
    val primeNumber = makePrimeNumberList(range)

    if(primeNumber.sum() == 0){
        println(-1)
    } else {
        println(primeNumber.sum())
        primeNumber.removeAll(listOf(0))
        println(primeNumber.first())
    }
}
fun makePrimeNumberList(arr:MutableList<Int>):MutableList<Int> {
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