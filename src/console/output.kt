package console

import modle.Game
import kotlin.collections.chunked
import kotlin.collections.joinToString

fun Game.show(){
    val str = buildString {
        if (size > 10)
            append("  ")
        else append(' ')
        repeat(size) { i ->
            append(' ')
            append('A' + i)
        }
    }
    println(str)
    board.chunked(size).forEachIndexed {index, row ->
        val rowNum = size-index
        println( rowNum.toString() +
                if(rowNum <= 9 && size > 9)"  " else {' '} +
                row.joinToString(" ")
        )
    }
}