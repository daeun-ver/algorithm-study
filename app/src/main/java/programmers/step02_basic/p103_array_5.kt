package programmers.step02_basic

//문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
//배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다. 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return

class p103_array_5 {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in intStrs) {
            val subStrs = i.substring(s, s + l)
            if (k < subStrs.toInt()) {
                answer += subStrs.toInt()
            }
        }
        return answer.toIntArray()
    }
}