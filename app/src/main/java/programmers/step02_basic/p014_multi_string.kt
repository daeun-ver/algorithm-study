package programmers.step02_basic

//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return

class p014_multi_string {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        var s1 = a.toString() + b.toString()
        var s2 = 2 * a * b
        if (s1.toInt() > s2) {
            answer = s1.toInt()
        } else {
            answer = s2
        }
        return answer
    }
}