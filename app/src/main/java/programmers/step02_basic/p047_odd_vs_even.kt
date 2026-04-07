package programmers.step02_basic

//가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return
//두 값이 같을 경우 그 값을 return


class p047_odd_vs_even {
    fun solution(num_list: IntArray): Int {
        var odd = 0
        var even = 0
        for (i in 0 until num_list.size) {
            if (i % 2 == 1) {
                odd += num_list[i]
            } else {
                even += num_list[i]
            }
        }

        return if (odd > even) odd else even
    }
}