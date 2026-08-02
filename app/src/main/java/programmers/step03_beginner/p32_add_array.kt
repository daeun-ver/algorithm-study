package programmers.step03_beginner

//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

class p32_add_array {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val row = arr1.size
        val col = arr1[0].size
        var answer = Array(row) { IntArray(col) }

        for (i in 0 until row) {
            for (j in 0 until col) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        return answer
    }
}