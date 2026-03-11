package programmers.intro

//my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return

class p086_calculate_string {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        val arr = my_string.split(" ")

        answer = arr[0].toInt()

        for (i in 1 until arr.size step 2) {

            if (arr[i] == "+") {
                answer += arr[i + 1].toInt()
            } else if (arr[i] == "-") {
                answer -= arr[i + 1].toInt()
            }
        }

        return answer
    }
}