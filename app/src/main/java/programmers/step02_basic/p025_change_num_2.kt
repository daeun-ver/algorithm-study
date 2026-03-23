package programmers.step02_basic

//처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
//"w" : 수에 1을 더한다.
//"s" : 수에 1을 뺀다.
//"d" : 수에 10을 더한다.
//"a" : 수에 10을 뺀다.
//매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다.
//주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return

class p025_change_num_2 {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        for (i in 1..numLog.size - 1) {
            when (numLog[i] - numLog[i - 1]) {
                1 -> answer += 'w'
                -1 -> answer += 's'
                10 -> answer += 'd'
                -10 -> answer += 'a'

            }
        }
        return answer
    }
}