package programmers.intro

//문자열 s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return
//한 번만 등장하는 문자가 없을 경우 빈 문자열을 return

class p080_groupingBy {
    fun solution(s: String): String {
        var answer: String = ""
        answer = s.groupingBy { it }
            .eachCount()
            .filter { it.value == 1 }
            .keys
            .sorted()
            .joinToString("")

        return answer
    }
}