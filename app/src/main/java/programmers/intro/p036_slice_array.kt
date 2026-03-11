package programmers.intro

//정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return

class p036_slice_array {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer = mutableListOf<Int>()

        for(i in num1..num2) {
            answer.add(numbers[i])
        }

        return answer.toIntArray()
    }

//    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        answer = numbers.sliceArray(num1..num2);
//
//        return answer
//    }
}