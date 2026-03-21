package programmers.step02_basic

//정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
//마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return

class p023_last_element {
    fun solution(num_list: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        answer = num_list.toMutableList()
        if (num_list[num_list.size - 1] > num_list[num_list.size - 2]) {
            answer.add(num_list[num_list.size - 1] - num_list[num_list.size - 2])
        } else {
            answer.add(num_list[num_list.size - 1] * 2)
        }
        return answer.toIntArray()
    }
}