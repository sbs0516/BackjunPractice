import java.util.*

fun main()=with(Scanner(System.`in`)) {

    val t = nextInt()
    val coordinateList = mutableListOf<Pair<Int,Int>>()
    for(i in 1..t){
        coordinateList.add(Pair(nextInt(),nextInt()))
    }
    val sortedList = coordinateList.sortedWith(compareBy({it.second},{it.first}))
    for(i in sortedList){
        println("${i.first} ${i.second}")
    }
}