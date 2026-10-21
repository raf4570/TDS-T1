package modle

const val EMPTY = '.'
const val WHITE_PIECE = 'O'
const val BLACK_PIECE = '#'
const val STARTING_BOARD_SIZE = 9
enum class BoardSizes(val size: Int) {
    SMALL(9),
    MEDIUM(13),
    LARGE(19)
}


data class Game(
    val first:Char = BLACK_PIECE,
    val turn:Char = first,
    val size: Int = STARTING_BOARD_SIZE,
    val board:List<Char> = List<Char>(size*size){EMPTY}
)

fun new(size: Int = STARTING_BOARD_SIZE): Game = Game(size = size)

val Char.other get() = if(this == WHITE_PIECE) BLACK_PIECE else WHITE_PIECE




fun Game.canPlay(pos: Int): Boolean = board[pos] == EMPTY

fun Game.play(pos: Int) = Game(
    first = first,
    turn = turn.other,
    size = size,
    board = board.mapIndexed { i, p ->
        if (i==pos) turn else p
    }
)