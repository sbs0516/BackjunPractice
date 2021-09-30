import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    val numArr = IntArray(n)
    for(i in numArr.indices){
        numArr[i] = nextInt()
    }
    var numList = numArr.toMutableList()
    numList.remove(1)
    println(countPrimeNumber(numList))
}
fun countPrimeNumber(arr:MutableList<Int>):Int {
    var count = 0
    arr.forEach{
        if(it == 2){
            count++
        } else {
            var j = 2
            while (j < it) {
                if (it % j == 0) {
                    break
                }
                j++
                if (j == it) {
                    count++
                }
            }
        }
    }
    return count
}
/*
fun main(){
    var n = readLine()!!.toInt()
    val num:List<String> = readLine()!!.split(" ")
    for(i in num){
        if (i.toInt() == 1){
            n -= 1
        }else{
            for (j in 2 until i.toInt())
                if (i.toInt()%j == 0){
                    n -= 1
                    break
                }
        }
    }
    println(n)
}
 */