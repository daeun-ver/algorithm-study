package programmers.step02_basic

//정수 리스트 num_list와 정수 n이 주어질 때, num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return

class p102_slice {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer = mutableListOf<Int>()
        answer += num_list.slice(n..num_list.size - 1)
        answer += num_list.slice(0..n - 1)
        return answer.toIntArray()
    }
}