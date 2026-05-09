package programmers.step02_basic

//정수 배열 arr과 정수 n이 매개변수로 주어집니다.
//arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return

class p076_mapIndexed {
    fun solution(arr: IntArray, n: Int): IntArray {

        return arr.mapIndexed { i, value ->
            when {
                arr.size % 2 == 1 && i % 2 == 0 -> value + n
                arr.size % 2 == 0 && i % 2 != 0 -> value + n
                else -> value
            }
        }.toIntArray()
    }
}