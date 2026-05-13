package programmers.step02_basic

//길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.
//parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다.
//각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return

class p081_slice {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        for (i in my_strings.indices) {
            val start = parts[i][0]
            val end = parts[i][1]
            answer += my_strings[i].slice(start..end)
        }
        return answer
    }
}