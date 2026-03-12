package programmers.step01_intro

//자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return

class p073_prime_factor {
    fun solution(n: Int): IntArray {
        var answer = mutableSetOf<Int>()
        var num = n
        for (i in 2..n) {
            while (num % i == 0) {
                answer.add(i)
                num /= i
            }
        }
        return answer.toIntArray()
    }
}