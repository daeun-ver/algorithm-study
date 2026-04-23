package programmers.step02_basic

//정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return

class p062_rank_drop {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sorted().drop(5).toIntArray()
    }
}