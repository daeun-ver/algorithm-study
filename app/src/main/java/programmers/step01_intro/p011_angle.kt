package programmers.step01_intro

//각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return

class p011_angle {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        if (angle < 90) {
            answer = 1
        } else if (angle == 90) {
            answer = 2
        } else if (angle < 180 && angle > 90) {
            answer = 3
        } else if (angle == 180) {
            answer = 4
        }
        return answer
    }
}