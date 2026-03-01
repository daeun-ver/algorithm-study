package programmers.level0

class p090_character_move {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        val maxX = board[0] / 2
        val maxY = board[1] / 2
        var x = 0
        var y = 0
        for (key in keyinput) {
            when (key) {
                "left" -> if (x > -maxX) x--
                "right" -> if (x < maxX) x++
                "up" -> if (y < maxY) y++
                "down" -> if (y > -maxY) y--
            }
        }

        return intArrayOf(x, y)
    }
}