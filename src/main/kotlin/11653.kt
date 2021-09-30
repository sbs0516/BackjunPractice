import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    var list = (0..n).toMutableList()
    val changeList = findMinPrime(list)
    val minPrimeArr = factorization(n, changeList)
    for(i in minPrimeArr){
        println(i)
    }
}
fun findMinPrime(list:MutableList<Int>):MutableList<Int>{
    var list = list
    list[0] = 0
    list[1] = 0
    for(i in 2 until list.size){
        if(list[i]!=i) continue
        for(j in 2*i until list.size step i){
            list[j] = i
        }
    }
    return list
}
fun factorization(n:Int, list:MutableList<Int>):MutableList<Int>{
    var n = n
    var mpArr = mutableListOf<Int>()
    while(n!=1){
        if(n%list[n]==0){
            mpArr.add(list[n])
        }
        n /= list[n]
    }
    mpArr.reverse()
    return mpArr
}