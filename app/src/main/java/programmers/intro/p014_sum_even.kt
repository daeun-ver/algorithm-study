package programmers.intro

//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return

class p014_sum_even {
    fun solution(n: Int): Int {
        return (2..n step 2).sum()
    }
}