package programmers.step02_basic

//2차원 정수 배열 board와 정수 k가 주어집니다.
//i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution

class p095_cross_array {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (i + j <= k) answer += board[i][j]
            }
        }
        return answer
    }
}