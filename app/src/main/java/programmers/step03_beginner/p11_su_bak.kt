package programmers.step03_beginner

//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.

class p11_su_bak {
    fun solution(n: Int): String {
        var answer = ""
        for (i in 1..n) {
            if (i % 2 == 1) {
                answer += "수"
            } else {
                answer += "박"
            }
        }
        return answer
    }
}