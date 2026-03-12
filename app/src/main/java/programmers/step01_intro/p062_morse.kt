package programmers.step01_intro

//문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 return

class p062_morse {
    fun solution(letter: String): String {
        var answer: String = ""
        val morse = mapOf(
            ".-" to "a",
            "-..." to "b",
            "-.-." to "c",
            "-.." to "d",
            "." to "e",
            "..-." to "f",
            "--." to "g",
            "...." to "h",
            ".." to "i",
            ".---" to "j",
            "-.-" to "k",
            ".-.." to "l",
            "--" to "m",
            "-." to "n",
            "---" to "o",
            ".--." to "p",
            "--.-" to "q",
            ".-." to "r",
            "..." to "s",
            "-" to "t",
            "..-" to "u",
            "...-" to "v",
            ".--" to "w",
            "-..-" to "x",
            "-.--" to "y",
            "--.." to "z"
        )
        answer = letter.split(" ").map { morse[it] }.joinToString("")
        return answer
    }
}