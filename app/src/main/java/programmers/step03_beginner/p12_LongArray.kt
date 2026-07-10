package programmers.step03_beginner

//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴하는 함수, solution을 완성해주세요.

class p12_LongArray {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()
        var num: Long = x.toLong()
        for (i in 1..n) {
            answer += num
            num += x
        }
        return answer.toLongArray()
    }
}