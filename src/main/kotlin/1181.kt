import java.util.*

fun main()=with(Scanner(System.`in`)) {

    val t = nextInt()
    val coordinateList = mutableListOf<String>()
    for(i in 1..t){
        coordinateList.add(next())
    }
    val sortedList = coordinateList.toMutableSet().toMutableList().sorted().sortedBy{it.length}
    for(i in sortedList) println(i)
}