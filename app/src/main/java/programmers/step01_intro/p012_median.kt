package programmers.step01_intro

//정수 배열 array가 매개변수로 주어질 때, 중앙값을 return

class p012_median {
    fun solution(array: IntArray): Int {
        array.sort()
        return array[array.size / 2]
    }
}