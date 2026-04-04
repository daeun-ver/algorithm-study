package programmers.step02_basic

//정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return

class p042_num_list_n {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in 0 until n) {
            answer += num_list[i]
        }
        return answer
    }
}