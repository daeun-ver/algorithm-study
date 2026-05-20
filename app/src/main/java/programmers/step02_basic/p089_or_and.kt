package programmers.step02_basic

//boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
//(x1 ∨ x2) ∧ (x3 ∨ x4)

class p089_or_and {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
        var answer: Boolean = true
        var x5 = x1 || x2
        var x6 = x3 || x4
        answer = x5 && x6
        return answer
    }

//    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
//
//        return (x1 || x2) && (x3 || x4)
//    }
}