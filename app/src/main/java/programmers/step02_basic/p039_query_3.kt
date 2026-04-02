package programmers.step02_basic

//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
//각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return

class p039_query_3 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        answer += arr
        for (q in queries) {
            var i = q[0]
            var j = q[1]
            var temp = answer[i]

            answer[i] = answer[j]
            answer[j] = temp
        }

        return answer
    }
}