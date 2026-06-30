package programmers.step03_beginner

//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴

class p01_int_sum {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        val start = minOf(a, b)
        val end = maxOf(a, b)
        for (i in start..end) {
            answer += i
        }
        return answer
    }
}