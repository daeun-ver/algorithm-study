package programmers.step02_basic

//양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return

class p109_spin_array {
    fun solution(n: Int): Array<IntArray> {
        var answer = Array(n) { IntArray(n) }
        val dr = intArrayOf(0, 1, 0, -1)
        val dc = intArrayOf(1, 0, -1, 0)

        var r = 0
        var c = 0
        var dir = 0

        for (num in 1..(n * n)) {
            answer[r][c] = num

            val nextR = r + dr[dir]
            val nextC = c + dc[dir]

            if (nextR !in 0 until n || nextC !in 0 until n || answer[nextR][nextC] != 0) {
                dir = (dir + 1) % 4
            }

            r += dr[dir]
            c += dc[dir]
        }
        return answer
    }
}