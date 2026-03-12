package programmers.step01_intro

//정수 배열 num_list와 정수 n이 매개변수로 주어집니다. num_list를 다음 설명과 같이 2차원 배열로 바꿔 return
//2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경

class p067_int_array {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        answer = Array(num_list.size / n) { IntArray(n) }
        for (i in 0..num_list.size / n - 1) {
            for (j in 0..n - 1) {
                answer[i][j] = num_list[i * n + j]
            }
        }
        return answer
    }
}