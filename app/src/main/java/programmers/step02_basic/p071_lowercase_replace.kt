package programmers.step02_basic

//문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return

class p071_lowercase_replace {
    fun solution(myString: String): String {

        return myString.lowercase().replace("a", "A")
    }
}