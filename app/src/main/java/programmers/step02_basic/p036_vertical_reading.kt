package programmers.step02_basic

//문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return

class p036_vertical_reading {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        for (i in (c - 1) until my_string.length step m) {
            answer += my_string[i]
        }
        return answer
    }
}