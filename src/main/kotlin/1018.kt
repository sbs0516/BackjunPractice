import java.util.*

// 중도 포기

fun main()=with(Scanner(System.`in`)) {
    val m = nextInt()
    val n = nextInt()
    val board = Array(m){CharArray(n)}
    for(i in 0 until m){
        for(j in 0 until n){
            board[i][j]=nextShort().toChar()
        }
    }
    var list = mutableListOf<Int>()
    for(i in 0..board.size-8){
        for(j in 0..board[i].size-8){
            var booleanBoard = makeBoard(i,j,board)
            list.add(countRepaint(booleanBoard))
        }
    }
    list.sort()
    println(list[0])
}
fun makeBoard(x:Int,y:Int,board:Array<CharArray>):Array<BooleanArray>{
    var makeBoard = Array(8){CharArray(8)}
    var booleanBoard = Array(8){BooleanArray(8)}
    for(i in 0..7){
        for(j in 0..7){
            makeBoard[i][j] = board[x+i][y+j]
            booleanBoard[i][j] = makeBoard[i][j]=='W'
        }
    }
    return booleanBoard
}

fun countRepaint(booleanBoard:Array<BooleanArray>):Int{
    var count = 0
    if(booleanBoard[0][0]){
        for(i in 0..7){
            for(j in 1..7){
                if(booleanBoard[i][j]==booleanBoard[i][j-1]){
                    booleanBoard[i][j]=false
                    count++
                } else {
                    continue
                }
            }
        }
    }
    return count
}
//for(i in 0..board.size-8){
//    var count = 0
//    for(j in 0..board[i].size-8){
//        if(board[i][j]=='W'){
//            var check = true
//            for(k in j+1..j+7){
//                if(board[i][k]==board[i][k-1]) continue
//                else
//            }
//        }
//    }
//}
//val white = Array(8){CharArray(8)}
//for(i in white.indices){
//    var check = true
//    for(j in white[i].indices){
//        if(check){
//            white[i][j]='W'
//            check = false
//        } else {
//            white[i][j]='B'
//            check = true
//        }
//    }
//}
//val black = Array(8){CharArray(8)}
//for(i in black.indices){
//    var check = false
//    for(j in black[i].indices){
//        if(check){
//            black[i][j]='W'
//            check = false
//        } else {
//            black[i][j]='B'
//            check = true
//        }
//    }
//}
//