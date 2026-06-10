package programmers.step02_basic

//정수 배열 arr와 query가 주어집니다.
//query를 순회하면서 다음 작업을 반복합니다.
//짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
//홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
//위 작업을 마친 후 남은 arr의 부분 배열을 return

class p107_slice_array {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = intArrayOf()
        var s = 0
        var e = 0

        for (i in 0..query.size - 1) {
            if (i % 2 == 0) {
                e = s + query[i] - 1
            } else {
                s += query[i]
            }
        }
        for (i in s..e) {
            answer += arr[i]
        }
        if (answer.isEmpty()) answer += (-1)

        return answer
    }
}