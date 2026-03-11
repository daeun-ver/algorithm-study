package programmers.intro

//연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return

class p096_total_sum {
    fun solution(num: Int, total: Int): IntArray {
        var answer = mutableListOf<Int>()
        val start = (total / num) - ((num - 1) / 2)

        for (i in start until start + num) {
            answer.add(i)
        }
        return answer.toIntArray()
    }
}