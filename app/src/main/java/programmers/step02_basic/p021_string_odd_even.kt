package programmers.step02_basic

//정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return

class p021_string_odd_even {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var odd = ""
        var even = ""
        for (i in num_list) {
            if (i % 2 == 0) {
                even += i.toString()
            } else {
                odd += i.toString()
            }
        }
        answer = odd.toInt() + even.toInt()
        return answer
    }
}