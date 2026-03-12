package programmers.step01_intro

//문자열 my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return

class p071_contains_char {
    fun solution(my_string: String): String {
        var answer: String = ""
        var have = mutableSetOf<Char>()
        for (i in my_string) {
            if (have.contains(i)) {
                have.add(i)
            } else {
                answer += i
                have.add(i)
            }
        }
        return answer
    }
}