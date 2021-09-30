import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val t = nextInt()
    for(i in 1..t){
        val height = nextInt()
        val width = nextInt()
        val guest = nextInt()
        println(assignRoom(height, width, guest))
    }
}
fun assignRoom(height:Int, width:Int, guest:Int):String {
    var floor = guest%height
    var roomTh = (guest/height)+1
    if(guest%height == 0){
        floor = height
        roomTh = (guest/height)
    }
    return String.format("%d%02d",floor,roomTh)
}
