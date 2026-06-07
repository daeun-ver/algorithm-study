package programmers.step02_basic

//알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수, ..., my_string에서 'Z'의 개수,
//my_string에서 'a'의 개수,  my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return

class p105_count_char {
    fun solution(my_string: String): IntArray {
        var answer = IntArray(52)
        for (ch in my_string) {
            if (ch.isUpperCase()) {
                answer[ch - 'A']++
            } else {
                answer[ch - 'a' + 26]++
            }
        }
        return answer
    }
}