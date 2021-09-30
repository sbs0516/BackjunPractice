import java.util.*

fun main()=with(Scanner(System.`in`)) {
    var str = nextLine()
    val alphabet = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    alphabet.forEach{
        str = str.replace(it,"Z")
    }
    println(str.length)
}