package programmers.step02_basic

//정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return

class p048_array_1 {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in k..n step k) {
            answer += i
        }
        return answer
    }
}