fun main() {
    val origin = Array(10000,{i->i+1})
    var seq = IntArray(10000)
    for(i in origin.indices){
        val cal = calcSequence(origin[i])
        if(cal<=10000) {
            seq[i] = cal
        }
    }
    val minus = origin.toSet().minus(seq.toSet()).toTypedArray()
    for(i in minus.indices){
        println(minus[i])
    }
}
fun calcSequence(a:Int):Int{
    var sum = 0
    var ori = a
    sum += ori
    while(true){
        sum += ori%10
        ori /= 10
        if(ori<=0) {
            break
        }
    }
    return sum
}