package programmers.step01_intro

//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return

class p043_maximum {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        numbers.sort()
        answer = numbers[numbers.size - 1] * numbers[numbers.size - 2]
        return answer
    }
}