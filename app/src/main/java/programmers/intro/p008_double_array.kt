package programmers.intro

//정수 배열 numbers의 각 원소에 두배한 원소를 가진 배열을 return

class p008_double_array {
    fun solution(numbers: IntArray): IntArray {
        return numbers.map { it * 2 }.toIntArray()
    }
}