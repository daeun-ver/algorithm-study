package programmers.step02_basic

//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return

class p080_toString_toInt {
    fun solution(num_str: String): Int {
        var answer: Int = 0
        for (i in num_str) {
            answer += i.toString().toInt()
        }
        return answer
    }
}