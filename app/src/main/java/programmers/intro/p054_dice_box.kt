package programmers.intro

//상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
//상자에 들어갈 수 있는 주사위의 최대 개수를 return

class p054_dice_box {
    fun solution(box: IntArray, n: Int): Int {
        var answer: Int = 1
        answer *= box[0] / n
        answer *= box[1] / n
        answer *= box[2] / n

        return answer
    }
}