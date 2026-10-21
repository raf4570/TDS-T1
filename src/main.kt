enum class Color() {
    WHITE,
    BLACK
}

enum class BoardSizes(val size: Int) {
    SMALL(9),
    MEDIUM(13),
    LARGE(19)
}

//data class Position(val x: Int, val y:Int)

// Auxiliary function that adds an offset to a position.
operator fun Position.plus (pos:Position) = Position(this.x+pos.x,this.y+pos.y)

data class Piece(
    val color: Color,
    val position: Position
)
//val board = List(BoardSizes.SMALL.size)


data class Game(
    val boardState: List<Piece>,
    val boardSize: BoardSizes
);

fun main() {

}

fun isAdjacent(firstPiece: Piece, secondPiece: Piece): Boolean {
    return secondPiece.position in firstPiece.position.getAdj()
}

fun Position.isOccupied(board: List<Piece>): Boolean {
    board.forEach { if (it.position == this) return false }
    return true
}

// Returns a list of positions adjacent to the selected position.
fun Position.getAdj(): List<Position> {
    return listOf<Position>(
        this+Position(0,1),
        this+Position(0,-1),
        this+Position(1,0),
        this+Position(-1,0)
    )
}

/*fun Piece.getLiberties(board: List<Piece>): List<Game> {

}*/

fun tryPlacePiece(piece: Piece, board: List<Piece>): Boolean {
    // Piece can't be placed if the space is already occupied by another piece.
    if (piece.position.isOccupied(board)) return false

    // Piece can't be placed if it would have no remaining liberties (self-capture)

    // UNLESS this results in the capture of the opponent's pieces

    // Piece can't be placed if it would loop back to the previous game state
}



