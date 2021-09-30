import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    faintSquare(n)
}
fun faintSquare(n:Int){
    if(n==1){
        print('*')
    }
    val size = n/3
    for(i in 1..3){
        for(j in 1..3){
            if(i==2 && j==2){
                continue
            }
            faintSquare(size)
        }
        println()
    }
}
