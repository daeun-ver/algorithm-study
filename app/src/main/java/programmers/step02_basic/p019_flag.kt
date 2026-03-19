package programmers.step02_basic

//두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return

class p019_flag {
    fun solution(a: Int, b: Int, flag: Boolean): Int {

        return if (flag) a + b else a - b
    }
}