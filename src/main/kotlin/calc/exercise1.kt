package calc

fun main() {
    val unit = "에이커"
    val areaMapBaseHa = mapOf(Pair("에이커",2.4710538147),Pair("아르",100),Pair("헥타르",1),Pair("제곱센티미터",100000000),
            Pair("제곱피트",107639.1041671),Pair("제곱인치",15500031.000062),Pair("제곱미터",10000),Pair("평",3025.0001134375))

    println(areaMapBaseHa[unit])
}