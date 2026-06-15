package programmers.step02_basic

//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return

class p111_int_query {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = arr

        for (query in queries) {
            val s = query[0]
            val e = query[1]

            for (i in s..e) {
                answer[i]++
            }
        }
        return answer
    }
}