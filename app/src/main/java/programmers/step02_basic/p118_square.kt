package programmers.step02_basic

//이차원 정수 배열 arr이 매개변수로 주어집니다. arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고,
//열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 각 열의 끝에 0을 추가한 이차원 배열을 return

class p118_square {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val rowCount = arr.size
        val colCount = arr[0].size
        val maxSize = maxOf(rowCount, colCount)

        val answer = Array(maxSize) { IntArray(maxSize) }

        for (r in 0 until rowCount) {
            for (c in 0 until colCount) {
                answer[r][c] = arr[r][c]
            }
        }
        return answer
    }
}