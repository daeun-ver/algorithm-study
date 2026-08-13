package programmers.step03_beginner

//국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다. 이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다.
//한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.

class p39_three_num {
    fun solution(number: IntArray): Int {
        var answer: Int = 0
        val len = number.size

        for (i in 0 until len - 2) {
            for (j in i + 1 until len - 1) {
                for (k in j + 1 until len) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++
                    }
                }
            }
        }
        return answer
    }
}