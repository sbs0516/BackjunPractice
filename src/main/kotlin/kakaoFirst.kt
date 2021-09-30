fun main() {
    var s = "one4seveneight"
    val wordList = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
    for(i in wordList) {
        val temp = s.replace(i,"${wordList.indexOf(i)}")
        s = temp
    }
    println(s)
}
fun solution(s: String): Int {
    val wordList = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine")
    for(i in wordList) {
        s.replace("i","${wordList.indexOf(i)}")
    }
    return s.toInt()
}
