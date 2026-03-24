package programmers.step02_basic

//1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
//세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
//세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
//세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
//세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return

class p026_dice_game_2 {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        val s1 = a + b + c
        val s2 = a * a + b * b + c * c
        val s3 = a * a * a + b * b * b + c * c * c

        return when {
            a == b && b == c -> s1 * s2 * s3

            a == b || b == c || a == c -> s1 * s2

            else -> s1
        }
    }
}