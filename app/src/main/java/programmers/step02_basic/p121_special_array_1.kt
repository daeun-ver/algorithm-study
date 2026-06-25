package programmers.step02_basic

//정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return
//arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.

class p121_special_array_1 {
    fun solution(n: Int): Array<IntArray> {
        val answer = Array(n) { IntArray(n) }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (i == j) {
                    answer[i][j] = 1
                }
            }
        }
        return answer
    }
}