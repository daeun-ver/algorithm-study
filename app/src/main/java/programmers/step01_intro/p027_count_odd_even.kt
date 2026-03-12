package programmers.step01_intro

//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return

class p027_count_odd_even {
    fun solution(num_list: IntArray): IntArray {
        var odd: Int = 0
        var even: Int = 0

        for (i in num_list) {
            if (i % 2 == 1) odd++
            if (i % 2 == 0) even++
        }

        return intArrayOf(even, odd)
    }
}