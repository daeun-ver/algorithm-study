package programmers.intro

//정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return

class p053_divisor {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        for (i in 1..n) {
            if (n % i == 0) {
                answer.add(i)
            }
        }
        return answer.toIntArray()
    }

//    fun solution(n: Int): IntArray {
//
//        return (1..n).filter{ n % it == 0}.toIntArray()
//    }
}