package programmers.step01_intro

//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun

class p006_equal_check {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if (num1 == num2) answer = 1
        else answer = -1
        return answer
    }
}