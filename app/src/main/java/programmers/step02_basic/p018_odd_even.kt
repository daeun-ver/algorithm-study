package programmers.step02_basic

//양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
//n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return

class p018_odd_even {
    fun solution(n: Int): Int {
        var answer: Int = 0
        if (n % 2 == 1) {
            for (i in 1..n step 2) {
                answer += i
            }
        } else {
            for (i in 0..n step 2) {
                answer += (i * i)
            }
        }
        return answer
    }
}