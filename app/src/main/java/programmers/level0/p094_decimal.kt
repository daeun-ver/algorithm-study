package programmers.level0

//분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
//기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
//두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return

class p094_decimal {
    fun solution(a: Int, b: Int): Int {
        var numA = a
        var numB = b
        val gcdValue = gcd(numA, numB)

        numB /= gcdValue

        while (numB % 2 == 0) numB /= 2
        while (numB % 5 == 0) numB /= 5

        return if (numB == 1) 1 else 2
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}