package programmers.step02_basic

//어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
//문자열 my_string이 매개변수로 주어질 때, my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return

class p091_substring_sort {
    fun solution(my_string: String): Array<String> {
        var answer = mutableListOf<String>()
        for (i in my_string.indices) {
            answer += my_string.substring(i)
        }
        return answer.sorted().toTypedArray()
    }
}