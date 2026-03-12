package programmers.step01_intro

//이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return

class p081_binary {
    fun solution(bin1: String, bin2: String): String {
        var answer = 0
        answer = bin1.toInt(2) + bin2.toInt(2)
        return answer.toString(2)
    }
}