package programmers.intro

//점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
//[[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
//주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return

class p099_parallel {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0

        fun getSlope(p1: IntArray, p2: IntArray): Double {
            return (p2[1] - p1[1]).toDouble() / (p2[0] - p1[0])
        }

        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) answer = 1
        else if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) answer = 1
        else if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) answer = 1
        else answer = 0

        return answer
    }
}