package programmers.intro

//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return

class p050_digit_to_int {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for (i in n.toString()) {
            answer += i.digitToInt()
        }
        return answer
    }
}