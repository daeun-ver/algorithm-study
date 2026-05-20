package programmers.step02_basic

//문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return

class p088_indices {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = ""
        for (i in my_string.indices) {
            if (indices.contains(i)) {
                continue
            }
            answer += my_string[i]
        }
        return answer
    }
}