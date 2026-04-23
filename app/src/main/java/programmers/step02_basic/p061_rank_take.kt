package programmers.step02_basic

//정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return

class p061_rank_take {
    fun solution(num_list: IntArray): IntArray {

        return num_list.sorted().take(5).toIntArray()
    }
}