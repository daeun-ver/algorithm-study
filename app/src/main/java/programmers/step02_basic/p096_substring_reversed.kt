package programmers.step02_basic

//문자열 my_string과 정수 s, e가 매개변수로 주어질 때, my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return

class p096_substring_reversed {
    fun solution(my_string: String, s: Int, e: Int): String {
        var answer: String = ""
        answer = my_string.substring(0, s) +
                my_string.substring(s..e).reversed() +
                my_string.substring(e + 1)
        return answer
    }
}