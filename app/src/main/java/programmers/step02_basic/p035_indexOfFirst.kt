package programmers.step02_basic

//정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return

class p035_indexOfFirst {
    fun solution(num_list: IntArray): Int {
        var answer: Int = -1
        for (i in 0 until num_list.size) {
            if (num_list[i] < 0) {
                answer = i
                break
            }
        }
        return answer
    }

//    fun solution(num_list: IntArray): Int {
//
//        return num_list.indexOfFirst{ it < 0 }
//    }
}