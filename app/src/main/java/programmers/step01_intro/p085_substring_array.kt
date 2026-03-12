package programmers.step01_intro

//문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return

class p085_substring_array {
    fun solution(my_str: String, n: Int): Array<String> {
        var answer = mutableListOf<String>()
        for (i in 0 until my_str.length step n) {
            answer.add(my_str.substring(i, minOf(i + n, my_str.length)))
        }

        return answer.toTypedArray()
    }
}