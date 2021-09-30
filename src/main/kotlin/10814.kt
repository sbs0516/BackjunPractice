import java.util.*

fun main()=with(Scanner(System.`in`)) {

    val t = nextInt()
    val coordinateList = mutableListOf<Pair<Int,String>>()
    for(i in 1..t){
        coordinateList.add(Pair(nextInt(),next()))
    }
    val sortedList = coordinateList.sortedBy{it.first}
    for(i in sortedList) {
        println("${i.first} ${i.second}")
    }
}