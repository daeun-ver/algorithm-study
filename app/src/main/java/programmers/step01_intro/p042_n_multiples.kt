package programmers.step01_intro

//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return

class p042_n_multiples {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer = mutableListOf<Int>()

        for (i in numlist) {
            if (i % n == 0)
                answer.add(i)
        }
        return answer.toIntArray()
    }
}