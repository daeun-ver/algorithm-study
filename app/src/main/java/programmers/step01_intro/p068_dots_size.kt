package programmers.step01_intro

//2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
//직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return

class p068_dots_size {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var length = 0
        var height = 0
        var x = dots.map { it[0] }
        var y = dots.map { it[1] }

        length = x.maxOrNull()!! - x.minOrNull()!!
        height = y.maxOrNull()!! - y.minOrNull()!!

        answer = length * height
        return answer
    }
}