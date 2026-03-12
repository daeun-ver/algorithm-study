package programmers.step01_intro

//x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return

class p039_dot_four {
    fun solution(dot: IntArray): Int {

        return when {
            dot[0] > 0 && dot[1] > 0 -> 1
            dot[0] < 0 && dot[1] > 0 -> 2
            dot[0] < 0 && dot[1] < 0 -> 3
            dot[0] > 0 && dot[1] < 0 -> 4
            else -> 0
        }
    }
}