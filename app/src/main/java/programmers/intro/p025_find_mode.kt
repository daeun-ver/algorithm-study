package programmers.intro

//정수 배열 array가 매개변수로 주어질 때, 최빈값을 return

class p025_find_mode {
    fun solution(array: IntArray): Int {
        val count = mutableMapOf<Int, Int>()

        for (i in array) {
            count[i] = (count[i] ?: 0) + 1
        }

        val maxFreq = count.values.maxOrNull()

        val modes = count.filter { it.value == maxFreq }.keys
        if (modes.size > 1) return -1

        return modes.first()
    }
}