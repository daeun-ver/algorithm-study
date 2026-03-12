package programmers.step01_intro

//문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
//이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
//A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return, 밀어서 B가 될 수 없으면 -1을 return

class p092_push_string {
    fun solution(A: String, B: String): Int {
        if (A == B) return 0

        var tempA = A

        for (i in 1 until A.length) {
            tempA = tempA.last() + tempA.substring(0, tempA.length - 1)

            if (tempA == B) return i
        }
        return -1
    }

//    fun solution(A: String, B: String): Int {
//        return (B+B).indexOf(A)
//    }
}