package programmers.step01_intro

//머쓱이는 친구들과 369게임을 하고 있습니다. 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return

class p041_369_game {
    fun solution(order: Int): Int {
        var answer: Int = 0
        var num: String = order.toString()
        for (i in num) {
            if (i == '3' || i == '6' || i == '9') {
                answer++
            }
        }
        return answer
    }
}