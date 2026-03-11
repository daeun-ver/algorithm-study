package programmers.level0

//지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
//지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return

class p100_safty_zone {
    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        val n = board.size
        val dangerBoard = Array(n) { IntArray(n) }

        for (r in 0 until n) {
            for (c in 0 until n) {
                if (board[r][c] == 1) {
                    for (dr in -1..1) {
                        for (dc in -1..1) {
                            val nr = r + dr
                            val nc = c + dc

                            if (nr in 0 until n && nc in 0 until n) {
                                dangerBoard[nr][nc] = 1
                            }
                        }
                    }
                }
            }
        }

        for (r in 0 until n) {
            for (c in 0 until n) {
                if (dangerBoard[r][c] == 0) {
                    answer++
                }
            }
        }

        return answer
    }
}