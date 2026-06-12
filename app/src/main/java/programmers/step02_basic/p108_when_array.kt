package programmers.step02_basic

//정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
//slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
//n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
//n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
//n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
//n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
//올바르게 슬라이싱한 리스트를 return

class p108_when_array {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val a = slicer[0]
        val b = slicer[1]
        val c = slicer[2]

        return when (n) {
            1 -> num_list.sliceArray(0..b)
            2 -> num_list.sliceArray(a..num_list.lastIndex)
            3 -> num_list.sliceArray(a..b)
            4 -> num_list.slice(a..b step c).toIntArray()
            else -> intArrayOf()
        }
    }
}