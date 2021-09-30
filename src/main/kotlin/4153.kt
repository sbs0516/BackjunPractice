import java.util.*
import kotlin.system.exitProcess

fun main()=with(Scanner(System.`in`)) {
    while(true){
        val x = nextInt()
        val y = nextInt()
        val z = nextInt()
        if(x==0 && y==0 && z==0) exitProcess(0)
        if(trueOrFalse(x,y,z)){
            println("right")
        } else {
            println("wrong")
        }
    }
}
fun trueOrFalse(x:Int, y:Int, z:Int):Boolean{
    var arr = arrayOf(x,y,z).sorted()
    val com = (arr[0]*arr[0])+(arr[1]*arr[1])
    val com1 = arr[2]*arr[2]
    return com == com1
}