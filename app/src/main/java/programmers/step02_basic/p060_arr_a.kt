package programmers.step02_basic

//아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때,
//arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return

class p060_arr_a {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in arr) {
            for (j in 1..i) {
                answer += i
            }
        }
        return answer
    }
}