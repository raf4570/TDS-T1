package console

import modle.BoardSizes

/* isValidCord and readPos might be possible to be a single function for handling play cord/pos */
/* Is only capable of handling 2 characters coordinates*/
fun readPos(str:String, size: Int):Int{
    val c = str.toCharArray()
    var row: Int
    var col: Int
    if (c[0].isDigit()) {
        row = c[1] - 'A'
        col = size - c[0].digitToInt()
    }else{
        row = c[0] - 'A'
        col = size - c[1].digitToInt()
    }
    return col * size + row
}
/* Is only capable of handling 2 characters coordinates*/
fun isValidCord(str: String): Boolean{

    val c = str.uppercase().toCharArray()
    return c.size == 2 &&
        (
            c[0].isDigit() && !c[1].isDigit() ||
                    !c[0].isDigit() && c[1].isDigit()
        )

}


fun isValidSize(size: Int): Boolean = BoardSizes.entries.any { it.size == size }