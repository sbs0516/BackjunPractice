import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val coordinateOne = Pair(nextInt(),nextInt())
    val coordinateTwo = Pair(nextInt(),nextInt())
    val coordinateThree = Pair(nextInt(),nextInt())
    val coordinateFour = findCoordinateFour(coordinateOne,coordinateTwo,coordinateThree)
    println(String.format("%d %d",coordinateFour.first,coordinateFour.second))

}
fun findCoordinateFour(one:Pair<Int,Int>, two:Pair<Int,Int>, three:Pair<Int,Int>):Pair<Int,Int>{
    var a = one.first
    var b = one.second
    if(a == two.first){
        a = three.first
    } else if(a == three.first){
        a = two.first
    }
    if(b == two.second){
        b = three.second
    } else if(b == three.second){
        b = two.second
    }
    return Pair(a,b)
}
