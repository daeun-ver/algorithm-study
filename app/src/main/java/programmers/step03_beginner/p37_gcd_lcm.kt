package programmers.step03_beginner

//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.

class p37_gcd_lcm {
    fun solution(n: Int, m: Int): IntArray {
        var a = n
        var b = m
        while (b != 0) {
            val r = a % b
            a = b
            b = r
        }
        val gcd = a


        val lcm = (n * m) / gcd
        return intArrayOf(gcd, lcm)
    }
}