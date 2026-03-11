package programmers.intro

//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return

class p026_count_n {
    fun solution(array: IntArray, n: Int): Int {

        return array.count { it == n }
    }
}