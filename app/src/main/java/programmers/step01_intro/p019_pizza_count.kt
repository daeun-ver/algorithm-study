package programmers.step01_intro

//머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
//피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return

class p019_pizza_count {
    fun solution(n: Int): Int {
        var answer: Int = 0
        if(n % 7 == 0){
            answer = n / 7
        }else {
            answer = n / 7 + 1
        }
        return answer
    }
}