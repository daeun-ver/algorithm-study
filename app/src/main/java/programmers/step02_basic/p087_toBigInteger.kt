package programmers.step02_basic

//0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return

class p087_toBigInteger {
    fun solution(a: String, b: String): String {

        return (a.toBigInteger() + b.toBigInteger()).toString()
    }
}