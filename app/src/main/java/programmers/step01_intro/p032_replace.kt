package programmers.step01_intro

//문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return

class p032_replace {
    fun solution(my_string: String, letter: String): String {

        return my_string.replace(letter, "")
    }
}