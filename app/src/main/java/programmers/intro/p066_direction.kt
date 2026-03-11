package programmers.intro

//배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return

class p066_direction {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = IntArray(numbers.size)
        when (direction) {
            "left" -> {
                for (i in 1..numbers.lastIndex) {
                    answer[i - 1] = numbers[i]
                    answer[numbers.lastIndex] = numbers[0]
                }
            }

            else -> {
                for (i in 0 until numbers.lastIndex) {
                    answer[i + 1] = numbers[i]
                    answer[0] = numbers[numbers.lastIndex]
                }
            }
        }
        return answer
    }
}