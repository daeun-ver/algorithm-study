package programmers.intro

//정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return

class p072_find_k {
    fun solution(i: Int, j: Int, k: Int): Int {
        var answer: Int = 0
        for (n in i..j) {
            for (c in n.toString()) {
                if (c.toString() == k.toString()) {
                    answer++
                }
            }
        }
        return answer
    }
}