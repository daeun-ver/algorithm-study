package programmers.intro

//정수 배열 numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

class p045_maximun2 {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        val a = numbers[numbers.size - 1] * numbers[numbers.size - 2]
        val b = numbers[0] * numbers[1]
        return maxOf(a, b)
    }
}