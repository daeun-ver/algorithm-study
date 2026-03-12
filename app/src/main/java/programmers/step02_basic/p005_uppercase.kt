package programmers.step02_basic

//영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

class p005_uppercase {
    fun main(args: Array<String>) {
        val s1 = readLine()!!
        var answer = ""
        for (c in s1) {
            if (c.isUpperCase()) {
                answer += c.lowercase()
            } else {
                answer += c.uppercase()
            }
        }
        println(answer)
    }
}