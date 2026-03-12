package programmers.step01_intro

//숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다.
//이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return

class p075_ctrl_Z {
    fun solution(s: String): Int {
        var answer: Int = 0
        var list = s.split(" ")
        var count = 0
        for (i in list) {
            if (i == "Z") {
                answer -= list[count - 1].toInt()
            } else {
                answer += i.toInt()
            }
            count++
        }
        return answer
    }
}