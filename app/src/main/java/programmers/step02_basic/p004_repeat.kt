package programmers.step02_basic

//문자열 str과 정수 n이 주어집니다.
//str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

class p004_repeat {
    fun main(args: Array<String>) {
        val input = readLine()!!.split(' ')
        val s1 = input[0]
        val a = input[1]!!.toInt()
        repeat(a) {
            print(s1)
        }
    }
}