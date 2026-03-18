package programmers.step02_basic

//문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return

class p015_replaceRange {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        answer = my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)
        return answer
    }
}