package programmers.step02_basic

//정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return

class p022_sum_or_mult {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var sum = 0
        var mult = 1
        for (i in num_list) {
            sum += i
            mult *= i
        }
        return if (sum * sum > mult) 1 else 0
    }
}