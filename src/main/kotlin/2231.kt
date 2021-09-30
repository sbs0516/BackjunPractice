import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    var numArr = (1..1000000).toMutableList()
    var chgArr = makeSum(numArr)
    println(chgArr.indexOf(n)+1)
}
fun makeSum(numArr:MutableList<Int>):MutableList<Int>{
    var arr = numArr
    for(i in arr.indices){
        var fact = arr[i]
        var sum = 0
        while(true){
            sum += fact%10
            fact/=10
            if(fact<=0) {
                arr[i] += sum
                break
            }
        }
    }
    return arr
}
