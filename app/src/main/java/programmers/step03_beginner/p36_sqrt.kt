package programmers.step03_beginner

class p36_sqrt {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right) {
            val x = Math.sqrt(i.toDouble()).toInt()

            if (x * x == i) {
                answer -= i
            } else {
                answer += i
            }
        }
        return answer
    }
}