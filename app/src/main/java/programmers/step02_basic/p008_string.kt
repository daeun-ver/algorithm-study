package programmers.step02_basic

//두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
//입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

class p008_string {
    fun main(args: Array<String>) {
        val input = readLine()!!.split(' ')
        val s1 = input[0]
        val s2 = input[1]
        print("$s1$s2")
    }
}