package programmers.step03_beginner

//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

class p03_sum_n {
    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1..n) {
            if (n % i == 0) {
                answer += i
            }
        }
        return answer
    }

//    fun solution(n: Int): Int {
//
//        return (1..n).filter { n % it == 0 }.sum()
//    }
}