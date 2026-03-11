package programmers.intro

//조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
//문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return

class p052_babbling {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val words = mutableListOf("aya", "ye", "woo", "ma")

        for (i in babbling) {
            var b = i
            for (j in words) {
                b = b.replace(j, " ")
            }
            if (b.trim().isEmpty()) {
                answer++
            }
        }
        return answer
    }
}