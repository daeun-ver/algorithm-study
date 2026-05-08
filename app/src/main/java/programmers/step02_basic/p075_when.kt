package programmers.step02_basic

//정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return

class p075_when {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        if (num_list.size >= 11) {
            for (i in num_list) {
                answer += i
            }
        } else {
            answer = 1
            for (i in num_list) {
                answer *= i
            }
        }
        return answer
    }

//    fun solution(num_list: IntArray): Int {
//        return when {
//            num_list.size > 10 -> num_list.sum()
//            else -> num_list.fold(1) { acc, i -> acc*i }
//        }
//    }
}