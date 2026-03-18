package programmers.step02_basic

//정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return

class p017_n_m_multiple {
    fun solution(number: Int, n: Int, m: Int): Int {
        return if (number % n == 0 && number % m == 0) 1 else 0
    }
}