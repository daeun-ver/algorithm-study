package programmers.step03_beginner

//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

class p14_harshad_number {
    fun solution(x: Int): Boolean {
        var answer = true
        var num = 0
        for (i in x.toString()) {
            num += i.digitToInt()
        }
        if (x % num != 0) {
            answer = false
        }
        return answer
    }
}