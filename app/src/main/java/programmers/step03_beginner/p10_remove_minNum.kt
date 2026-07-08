package programmers.step03_beginner

//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
class p10_remove_minNum {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        answer = arr.toMutableList()
        if (answer.size <= 1) {
            return intArrayOf(-1)
        }
        answer.remove(answer.min())

        return answer.toIntArray()
    }
}