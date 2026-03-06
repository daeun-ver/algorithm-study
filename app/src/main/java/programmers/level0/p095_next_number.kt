package programmers.level0

//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return

class p095_next_number {
    fun solution(common: IntArray): Int {
        if (common[1] - common[0] == common[2] - common[1]) {
            val diff = common[1] - common[0]
            return common.last() + diff
        } else {
            val ratio = common[1] / common[0]
            return common.last() * ratio
        }
    }
}