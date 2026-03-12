package programmers.step01_intro

//문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return
class p060_change_index {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var answer: String = ""
        var n = 0
        for (i in my_string) {
            answer += when (n) {
                num1 -> my_string[num2]
                num2 -> my_string[num1]
                else -> i
            }
            n += 1
        }
        return answer
    }
}