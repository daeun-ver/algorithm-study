package programmers.step01_intro

//정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return
//가장 가까운 수가 여러 개일 경우 더 작은 수를 return

class p076_near_number {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        var num = 0
        var min = 100
        for (i in array) {

            if (n > i) {
                num = n - i
            } else {
                num = i - n
            }

            if (min > num) {
                min = num
                answer = i
            } else if (min == num) {
                if (answer > i) {
                    answer = i
                }
            }
        }

        return answer
    }
}