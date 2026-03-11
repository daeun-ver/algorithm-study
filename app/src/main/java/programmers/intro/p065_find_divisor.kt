package programmers.intro

//약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return

class p065_find_divisor {
    fun solution(n: Int): Int {
        var answer: Int = 0

        for (i in 4..n) {
            var num = 0
            for (j in 1..i) {
                if (i % j == 0) num++
            }
            if (num >= 3) answer++
        }
        return answer
    }
}