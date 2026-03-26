package programmers.step02_basic

//정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return

class p027_count_up {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in start_num..end_num) {
            answer.add(i)
        }
        return answer.toIntArray()
    }

//    fun solution(start: Int, end: Int): IntArray {
//        var answer: IntArray = intArrayOf()
//        for (i in start..end) {
//            answer += i
//        }
//        return answer
//    }
}