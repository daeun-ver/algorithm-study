package programmers.step01_intro

//첫 번째 분수의 분자와 분모 numer1, denom1,
//두 번째 분수의 분자와 분모 numer2, denom2
//두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return

class p007_add_fractions {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {

        var numer = numer1 * denom2 + numer2 * denom1
        var denom = denom1 * denom2

        val gcdValue = gcd(numer, denom)

        numer /= gcdValue
        denom /= gcdValue

        return intArrayOf(numer, denom)
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}