package programmers.step02_basic

//알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return

class p101_map {
    fun solution(myString: String): String {

        return myString.map { it -> if (it < 'l') 'l' else it }.joinToString("")
    }
}