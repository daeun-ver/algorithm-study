package programmers.intro

//i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return
//i! ≤ n

class p058_factorial {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = 1
        for (i in 1..n) {
            num *= i
            if (num > n)
                break;
            answer = i
        }
        return answer
    }
}