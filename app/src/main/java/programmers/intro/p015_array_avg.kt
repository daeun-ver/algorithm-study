package programmers.intro

//정수 배열 numbers의 원소의 평균값을 return

class p015_array_avg {
    fun solution(numbers: IntArray): Double {

        return numbers.average()
    }

//    fun solution(numbers: IntArray): Double {
//        var sum = 0
//
//        for (i in numbers) {
//            sum += i
//        }
//
//        return sum.toDouble() / numbers.size
//    }
}