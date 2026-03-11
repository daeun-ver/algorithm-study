package programmers.intro

//알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
//spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return

class p098_alien_words {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        var answer: Int = 0
        val target = spell.sorted().joinToString("")

        for (word in dic) {
            if (word.toCharArray().sorted().joinToString("") == target) {
                answer = 1
            }
        }

        if (answer == 0) answer = 2

        return answer
    }
}