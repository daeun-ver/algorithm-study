package programmers.step03_beginner

//숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

class p34_small_substring {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val pLen = p.length
        val pNum = p.toLong()

        for (i in 0..t.length - pLen) {
            val subStr = t.substring(i, i + pLen)

            if (subStr.toLong() <= pNum) {
                answer++
            }
        }
        return answer
    }
}