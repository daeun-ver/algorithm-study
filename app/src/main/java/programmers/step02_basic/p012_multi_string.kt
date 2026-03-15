package programmers.step02_basic

//문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return

class p012_multi_string {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        repeat(k) {
            answer += my_string
        }
        return answer
    }
}