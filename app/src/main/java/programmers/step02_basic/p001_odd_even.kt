package programmers.step02_basic

//자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

class p001_odd_even {
    fun main(args: Array<String>) {
        val a = readLine()!!.toInt()

        println(if (a % 2 == 0) "$a is even" else "$a is odd")
    }
}