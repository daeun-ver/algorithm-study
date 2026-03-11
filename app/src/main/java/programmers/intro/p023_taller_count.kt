package programmers.intro

//머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return

class p023_taller_count {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        for (i in array) {
            if (i > height) {
                answer++
            }
        }
        return answer
    }
}