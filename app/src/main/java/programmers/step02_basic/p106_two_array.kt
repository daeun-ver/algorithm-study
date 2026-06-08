package programmers.step02_basic

//정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//단, arr에 2가 없는 경우 [-1]을 return

class p106_two_array {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var twoCount = arr.count { it == 2 }
        if (twoCount >= 2) {
            answer += arr.slice(arr.indexOf(2)..arr.lastIndexOf(2))

        } else if (twoCount == 1) {
            answer += 2
        } else answer += -1
        return answer.toIntArray()
    }
}