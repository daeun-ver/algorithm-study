package programmers.step03_beginner

//0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

class p17_contains {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0

        for (i in 0..9) {
            if (!numbers.contains(i)) {
                answer += i
            }
        }
        return answer
    }
}