package programmers.step02_basic

//문자열에 따라 다음과 같이 두 수의 크기를 비교하려고 합니다.
//">", "=" : n >= m
//"<", "=" : n <= m
//">", "!" : n > m
//"<", "!" : n < m
//ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다. 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return

class p020_ineq_eq {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when {
            ineq == ">" && eq == "=" -> if (n >= m) 1 else 0
            ineq == "<" && eq == "=" -> if (n <= m) 1 else 0
            ineq == ">" && eq == "!" -> if (n > m) 1 else 0
            ineq == "<" && eq == "!" -> if (n < m) 1 else 0
            else -> 0
        }
    }
}