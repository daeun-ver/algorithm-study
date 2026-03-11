package programmers.intro

//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return

class p049_contains_string {
    fun solution(str1: String, str2: String): Int {

        return if (str1.contains(str2)) 1 else 2
    }
}