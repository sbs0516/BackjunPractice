import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main()=with(Scanner(System.`in`)) {
    val n = nextInt()
    var person = mutableListOf<Pair<Int,Int>>()
    for (i in 0 until n) {
            person.add(Pair(nextInt(), nextInt()))
        }
    compareBody(person).flush()
}
    
fun compareBody(person:MutableList<Pair<Int,Int>>):BufferedWriter{
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    for(i in person.indices){
        var count = 0
        for(j in person.indices){
            if(person[i].first<person[j].first && person[i].second<person[j].second){
                count++
            }
        }
        bw.write("${count+1} ")
    }
    return bw
}