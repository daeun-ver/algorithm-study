package programmers.step02_basic

//문자열 rny_string이 주어질 때, rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return

class p079_rny_string {
    fun solution(rny_string: String): String {

        return rny_string.replace("m", "rn")
    }
}