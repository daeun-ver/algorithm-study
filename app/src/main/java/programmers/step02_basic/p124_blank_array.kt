package programmers.step02_basic

//아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
//flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고,
//flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return

class p124_blank_array {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = mutableListOf<Int>()

        for (i in arr.indices) {
            if (flag[i]) {
                val repeatCount = arr[i] * 2
                repeat(repeatCount) {
                    answer.add(arr[i])
                }
            } else {
                repeat(arr[i]) {
                    if (answer.isNotEmpty()) {
                        answer.removeAt(answer.lastIndex)
                    }
                }
            }
        }
        return answer.toIntArray()
    }
}