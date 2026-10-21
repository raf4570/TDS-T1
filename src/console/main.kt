package console

import modle.Game
import modle.canPlay
import modle.new
import modle.play

fun main() {
    var game: Game = Game()
    while (true) {
        game.show()
        print("> ")
        val cmd = readln().trim().uppercase().split(' ')
        when(val name = cmd[0]) {
            "NEW" -> {
                if (cmd.size > 1) {
                    val size = cmd[1].toInt()
                    if (isValidSize(size))
                        game = new(size)
                    else println("Invalid size: $size")
                }else game = new()
            }
            "EXIT" -> break
            "PLAY" -> {
                //if (game!=null) {
                    val cord = cmd[1]
                    if(isValidCord(cord)) {
                        val pos = readPos(cord, game.size)
                        if (game.canPlay(pos))
                            game = game.play(pos)
                    }else println("Invalid coordinate: $cord")
                //}else println("modle.Game has not been started yet. Try \"modle.new <size>\" or \"load <name>\"")
            }else -> println("Invalid command: $name")
        }
    }
}