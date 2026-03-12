package programmers.step01_intro

//머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return

class p077_count_7 {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        for (i in array) {
            for (j in i.toString()) {
                if (j == '7') {
                    answer++
                }
            }
        }
        return answer
    }

//    fun solution(array: IntArray): Int {
//        var answer: Int = 0
//        answer = array.joinToString("").count { it == '7' }
//        return answer
//    }
}