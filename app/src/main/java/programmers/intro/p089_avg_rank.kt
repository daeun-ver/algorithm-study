package programmers.intro

//영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return
class p089_avg_rank {
    fun solution(score: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        val sum = score.map { it[0] + it[1] }
        var sort = sum.sortedDescending()
        for (i in sum.indices) {
            answer.add(sort.indexOf(sum[i]) + 1)
        }

        return answer.toIntArray()
    }
}