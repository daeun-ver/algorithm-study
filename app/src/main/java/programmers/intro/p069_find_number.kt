package programmers.intro

//정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return

class p069_find_number {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        var count = 1
        for (i in num.toString()) {
            if (i == k.toString()[0]) {
                return count
            }
            count++
        }
        return -1
    }
}