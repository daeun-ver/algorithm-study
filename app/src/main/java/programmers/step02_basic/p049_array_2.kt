package programmers.step02_basic

//l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return

class p049_array_2 {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in l..r) {
            if (i.toString().all { it == '0' || it == '5' }) {
                answer += i
            }
        }
        return if (answer.isNotEmpty()) answer else intArrayOf(-1)
    }
}