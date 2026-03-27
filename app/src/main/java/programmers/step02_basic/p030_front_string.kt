package programmers.step02_basic

//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return

class p030_front_string {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for (i in 0 until n) {
            answer += my_string[i]
        }
        return answer
    }
//    fun solution(my_string: String, n: Int): String {
//
//        return my_string.take(n)
//    }
}