package programmers.step02_basic

//my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return

class p028_string_index {
    fun solution(my_string: String, index_list: IntArray): String {
        var answer: String = ""
        for (i in index_list) {
            answer += my_string[i]
        }
        return answer
    }
}