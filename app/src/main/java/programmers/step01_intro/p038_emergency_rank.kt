package programmers.step01_intro

//응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
//정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return

class p038_emergency_rank {
    fun solution(emergency: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = emergency.map { emergency.sortedDescending().indexOf(it) + 1 }.toIntArray()

        return answer
    }
}