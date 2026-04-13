package programmers.step02_basic

//정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return

class p051_step {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in 0 until num_list.size step n) {
            answer += num_list[i]
        }
        return answer
    }
}