package programmers.step02_basic

//정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return

class p068_change_arr_1 {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in arr) {
            if (i >= 50 && i % 2 == 0) {
                answer += i / 2
            } else if (i < 50 && i % 2 == 1) {
                answer += i * 2
            } else {
                answer += i
            }
        }
        return answer
    }

//    fun solution(arr: IntArray): IntArray {
//
//        return arr.map { i ->
//            if (i >= 50 && i % 2 == 0) i / 2
//            else if (i < 50 && i % 2 == 1) i * 2
//            else i
//        }.toIntArray()
//    }
}