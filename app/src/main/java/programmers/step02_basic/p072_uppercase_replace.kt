package programmers.step02_basic

//영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
//my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return

class p072_uppercase_replace {
    fun solution(my_string: String, alp: String): String {
        return my_string.replace(alp, alp.uppercase())
    }
}