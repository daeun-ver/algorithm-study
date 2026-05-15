package programmers.step02_basic

//정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return

class p083_contains {
    fun solution(num_list: IntArray, n: Int): Int {

        return if (num_list.contains(n)) 1 else 0
    }
}