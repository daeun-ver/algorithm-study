package programmers.step01_intro

//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
//n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지 return

class p022_pizza_count2 {
    fun solution(n: Int): Int {

        return n * 6 / gcd(n, 6) / 6
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}