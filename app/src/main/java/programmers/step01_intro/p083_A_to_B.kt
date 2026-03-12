package programmers.step01_intro

//문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return

class p083_A_to_B {
    fun solution(before: String, after: String): Int {
        var answer: Int = 0
        if (before.toCharArray().sorted() == after.toCharArray().sorted()) {
            answer = 1
        } else {
            answer = 0
        }

        return answer
    }
}