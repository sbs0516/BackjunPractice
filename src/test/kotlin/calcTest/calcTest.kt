package calcTest

import java.util.*

class Calc {



}
fun main() {
    var str = StringBuffer("9x9+9")
    var list = mutableListOf<String>()

    fun split(str:StringBuffer):MutableList<String>{
        for(i in str){
            if(i=='+'||i=='-'||i=='x'||i=='÷'||i=='('||i==')'){
                list.add(str.substring(0,str.indexOf(i)))
                list.add(i.toString())
                str.delete(0,str.indexOf(i)+1)
                split(str)
            }
        }
        return list
    }
    split(str)
    list.removeAll(listOf(""))
    list.add(str.toString())
    println(list)
    println(postFix(list))
    println(calculate(postFix(list)))
}

fun postFix(list:MutableList<String>):MutableList<String>{
    val stack = Stack<String>()
    val operatorList = listOf("x","-","+","(",")","÷")
    var postFixList = mutableListOf<String>()
    for(i in list){
        if(i !in operatorList){
            postFixList.add(i)
        } else {
            if(i == "(") {
                stack.push(i)
            } else if(i == ")"){
                while(true){
                    postFixList.add(stack.pop())
                    if(stack.peek() == "(") break
                }
                stack.pop()
            } else {
                if(stack.isEmpty()){
                    stack.push(i)
                } else {
                    if(getWeight(i)<=getWeight(stack.peek())){
                        if(stack.peek() != "(") {
                            postFixList.add(stack.pop())
                            stack.push(i)
                        } else {
                            stack.push(i)
                        }
                    } else {
                        stack.push(i)
                    }
                }
            }
        }
    }
    while(!stack.isEmpty()){
        postFixList.add(stack.pop())
    }
    return postFixList
}
private fun getWeight(str:String):Int{
    return when(str){
        "+" -> 2
        "-" -> 2
        "x" -> 3
        "÷" -> 3
        "(" -> 1
        else -> 1
    }
}
fun calculate(list:MutableList<String>):String {
    val numStack = Stack<String>()
    val operatorList = listOf("x","-","+","(",")","÷")
    var num1:Double
    var num2:Double
    for(i in list){
        if(i !in operatorList){
            numStack.push(i)
        } else {
            when (i) {
                "+" -> {
                    num1 = numStack.pop().toDouble()
                    num2 = numStack.pop().toDouble()
                    numStack.push((num2+num1).toString())
                }
                "-" -> {
                    num1 = numStack.pop().toDouble()
                    num2 = numStack.pop().toDouble()
                    numStack.push((num2-num1).toString())
                }
                "x" -> {
                    num1 = numStack.pop().toDouble()
                    num2 = numStack.pop().toDouble()
                    numStack.push((num2*num1).toString())
                }
                "÷" -> {
                    num1 = numStack.pop().toDouble()
                    num2 = numStack.pop().toDouble()
                    numStack.push((num2/num1).toString())
                }
            }
        }
    }
    return numStack.pop()
}
//fun main() {
//    var str = StringBuffer("1000x12x(541+5)÷54")
//    var list = mutableListOf<String>()
//
//    fun makeList(str:StringBuffer):MutableList<String>{
//        for(i in str){
//            if(i=='+'||i=='-'||i=='x'||i=='÷'||i=='('||i==')'){
//                list.add(str.substring(0,str.indexOf(i)))
//                list.add(i.toString())
//                str.delete(0,str.indexOf(i)+1)
//                makeList(str)
//            }
//        }
//        return list
//    }
//    makeList(str)
//    list.removeAll(listOf(""))
//    list.add(str.toString())
//
//    println(postFix(list))
//    println(calculate(postFix(list)))
//}
//fun postFix(list:MutableList<String>):MutableList<String>{
//    val stack = Stack<String>()
//    val operatorList = listOf("x","-","+","(",")","÷")
//    var postFixList = mutableListOf<String>()
//    for(i in list){
//        if(i !in operatorList){
//            postFixList.add(i)
//        } else {
//            if(i == "(") {
//                stack.push(i)
//            } else if(i == ")"){
//                while(true){
//                    postFixList.add(stack.pop())
//                    if(stack.peek() == "(") break
//                }
//                stack.pop()
//            } else if(stack.isEmpty()){
//                stack.push(i)
//            } else if(getWeight(i)>=getWeight(stack.peek())){
//                if(stack.peek() != "(") {
//                    postFixList.add(stack.pop())
//                    stack.push(i)
//                } else {
//                    stack.push(i)
//                }
//            } else {
//                postFixList.add(i)
//            }
//        }
//    }
//    while(!stack.isEmpty()){
//        postFixList.add(stack.pop())
//    }
//    return postFixList
//}
//fun getWeight(str:String):Int{
//    return when(str){
//        "+" -> 2
//        "-" -> 2
//        "x" -> 3
//        "÷" -> 3
//        "(" -> 1
//        else -> 1
//    }
//}
//fun calculate(list:MutableList<String>):String {
//    val numStack = Stack<String>()
//    val operatorList = listOf("x","-","+","(",")","÷")
//    var num1:Double
//    var num2:Double
//    for(i in list){
//        if(i !in operatorList){
//            numStack.push(i)
//        } else {
//            when (i) {
//                "+" -> {
//                    num1 = numStack.pop().toDouble()
//                    num2 = numStack.pop().toDouble()
//                    numStack.push((num2+num1).toString())
//                }
//                "-" -> {
//                    num1 = numStack.pop().toDouble()
//                    num2 = numStack.pop().toDouble()
//                    numStack.push((num2-num1).toString())
//                }
//                "x" -> {
//                    num1 = numStack.pop().toDouble()
//                    num2 = numStack.pop().toDouble()
//                    numStack.push((num2*num1).toString())
//                }
//                "÷" -> {
//                    num1 = numStack.pop().toDouble()
//                    num2 = numStack.pop().toDouble()
//                    numStack.push((num2/num1).toString())
//                }
//            }
//        }
//    }
//    return numStack.pop()
//}
