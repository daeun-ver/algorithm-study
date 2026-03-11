package programmers.intro

//문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return

class p057_lowercase {
    fun solution(my_string: String): String {
        var answer: String = ""
        answer = my_string.map {
            if (it.isLowerCase()) {
                it.uppercase()
            } else {
                it.lowercase()
            }
        }.joinToString("")
        return answer
    }
}