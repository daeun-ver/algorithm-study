package programmers.level0

//선분 3개가 평행하게 놓여 있습니다.
//세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
//두 개 이상의 선분이 겹치는 부분의 길이를 return

class p097_over_lines {
    fun solution(lines: Array<IntArray>): Int {
        val road = IntArray(200)

        for (line in lines) {
            val start = line[0] + 100
            val end = line[1] + 100

            for (i in start until end) {
                road[i]++
            }
        }
        return road.count { it >= 2 }
    }
}