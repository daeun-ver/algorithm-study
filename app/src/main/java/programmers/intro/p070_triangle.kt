package programmers.intro

//선분 세 개로 삼각형을 만들기 위해서는 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return

class p070_triangle {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        sides.sort()
        if (sides[0] + sides[1] > sides[2]) {
            answer = 1
        } else {
            answer = 2
        }
        return answer
    }
}