package programmers.step01_intro

//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return

class p055_isDigit {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        for (i in my_string) {
            if (i.isDigit()) {
                answer += i.digitToInt()
            }
        }

        return answer
    }
}