import java.util.Stack

fun main() {
    var k = 2
    val n = 8
    val cmd = arrayOf("D 2","C","U 3","C","D 4","C","U 2","Z","Z")
    var stack = Stack<Int>()
    var array = CharArray(n){'O'}
    println(cmd[0].substring(2).toInt())
    for(i in cmd) {
        when(i[0]) {
            'U' -> k-=(i.substring(2).toInt())
            'D' -> k+=(i.substring(2).toInt())
            'C' -> {
                stack.push(k)
                if(k==n-1) {
                    k--
                } else {
                    k++
                }
            }
            else -> {
                if(stack.peek()<=k) {
                    k--
                }
                stack.pop()
            }
        }
    }
    do{
        if(stack.isEmpty()) {
            break
        }
        array[stack.peek()] = 'X'
        stack.pop()
    } while(!stack.isEmpty())
    println(array.joinToString(""))
}

fun solution(n: Int, k: Int, cmd: Array<String>): String {
    var k = k
    var stack = Stack<Int>()
    var array = CharArray(n){'O'}
    for(i in cmd) {
        when(i[0]) {
            'U' -> k-=(i[2].toInt()-48)
            'D' -> k+=(i[2].toInt()-48)
            'C' -> {
                stack.push(k)
                if(k==n-1) {
                    k--
                } else {
                    k++
                }
            }
            else -> {
                if(stack.peek()<=k) {
                    k--
                }
                stack.pop()
            }
        }
    }
    TODO()
}