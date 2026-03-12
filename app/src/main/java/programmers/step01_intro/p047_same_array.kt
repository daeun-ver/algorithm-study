package programmers.step01_intro

//문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return

class p047_same_array {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (i in s1) {
            for (j in s2) {
                if (i == j) {
                    answer++
                }
            }
        }
        return answer
    }
}