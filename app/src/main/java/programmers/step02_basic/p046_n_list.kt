package programmers.step02_basic

//정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return

class p046_n_list {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in n - 1 until num_list.size) {
            answer += num_list[i]
        }
        return answer
    }
}