import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    for(i in 1..t) {
        val floor = nextInt()
        val number = nextInt()
        var firstFloorArr = IntArray(number)
        for(i in firstFloorArr.indices){
            firstFloorArr[i]=i+1
        }
        println(countPersonInHouse(floor, number, firstFloorArr))
    }
}
fun countPersonInHouse(floor:Int, number:Int, arr:IntArray):Int{
    var floor = floor - 1
    var nextFloor = IntArray(number)
    if(floor <= 0){
        return arr.sum()
    }
    for(i in nextFloor.indices){
        nextFloor[i] = arr.copyOf(i+1).sum()
    }
    return countPersonInHouse(floor,number,nextFloor)
}