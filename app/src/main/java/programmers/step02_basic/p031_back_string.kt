package programmers.step02_basic

//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return

class p031_back_string {
    fun solution(my_string: String, n: Int): String {

        return my_string.takeLast(n)
    }
}