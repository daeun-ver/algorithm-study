package programmers.step01_intro

//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return

class p031_repeat {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for (i in my_string) {
            repeat(n) {
                answer += i
            }
        }
        return answer
    }
}