package programmers.step02_basic

//정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return

class p037_downTo {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in start_num downTo end_num) {
            answer += i
        }
        return answer
    }
}