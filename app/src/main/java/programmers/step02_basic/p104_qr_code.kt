package programmers.step02_basic

//두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return

class p104_qr_code {
    fun solution(q: Int, r: Int, code: String): String {
        var answer: String = ""
        for (i in code.indices) {
            if (i % q == r) {
                answer += code[i]
            }
        }
        return answer
    }
}