package programmers.step03_beginner

//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.

class p38_isLetter {
    fun solution(s: String): Boolean {
        var answer = true
        if (s.length != 4 && s.length != 6) {
            answer = false
        }

        for (i in s) {
            if (i.isLetter()) {
                answer = false
            }
        }
        return answer
    }
}