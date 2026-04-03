package programmers.step02_basic

//정수 배열 arr와 자연수 k가 주어집니다.
//만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
//이러한 변환을 마친 후의 arr를 return

class p041_arr_k {
    fun solution(arr: IntArray, k: Int): IntArray {
        return if (k % 2 == 1) {
            arr.map { it * k }.toIntArray()
        } else {
            arr.map { it + k }.toIntArray()
        }
    }
}