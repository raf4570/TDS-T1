/*
package console

import modle.Game
import Piece


fun getFirstLine(size : Int): String {
    var currChar = 'A'-1;
    var str = ""
    for (i in 0..size*2) {
        str += if (i % 2 == 0) {
            ' '
        } else{
            (currChar + 1).also { currChar ++ }
        }
    }
    return str
}

fun writeGame(game: modle.Game){
    println(getFirstLine(game.boardSize.size))
    for(i in (0..<game.boardSize.size)) {
        println(getGameLine(game.boardSize.,i))
    }


}

fun getGameLine(pieces: List<Piece>, line : Int){
    var str = ""

    for (p in pieces) {
        if ( p.x == line) str += if( p.color == Color.WHITE)'O' else '#'

    }

    return str

}*/
