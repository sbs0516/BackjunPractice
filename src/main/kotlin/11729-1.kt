fun main() {
    val stack = readLine()!!.toInt()
    val sb = StringBuilder()
    println(hanoi(stack, 1, 3, sb))
    print(sb.toString())
}

fun hanoi(stack: Int, start: Int, end: Int, sb: StringBuilder): Int {
    var cnt = 0
    return if (stack == 0) {
        cnt
    } else {
        cnt += hanoi(stack - 1, start, 6 - start - end, sb)
        cnt++
        sb.append("$start $end\n")
        cnt += hanoi(stack - 1, 6 - start - end, end, sb)
        cnt
    }
}


