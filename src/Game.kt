const val EMPTY = ' '

data class Game(
    val size: Int,
    val board:List<Char> = List<Char>(size, EMPTY)

)
