package programmers.step01_intro

//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return

class p005_num_div_mul {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = (num1.toDouble() / num2.toDouble() * 1000).toInt()
        return answer
    }
}