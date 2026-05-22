package programmers.step02_basic

//정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return

class p091_delete_list {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for (i in arr) {
            if (!delete_list.contains(i)) {
                answer.add(i)
            }
        }
        return answer.toIntArray()
    }
}