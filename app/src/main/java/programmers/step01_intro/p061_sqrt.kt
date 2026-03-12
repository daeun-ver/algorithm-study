package programmers.step01_intro

//어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return

class p061_sqrt {
    fun solution(n: Int): Int {
        var answer: Int = 0
        answer = Math.sqrt(n.toDouble()).toInt()
        return if (answer * answer == n) 1 else 2
    }
}