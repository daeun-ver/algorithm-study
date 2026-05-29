package programmers.step02_basic

//1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return

class p097_dice_game_3 {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val dice = listOf(a, b, c, d)
        val counts = dice.groupBy { it }.mapValues { it.value.size }

        return when (counts.size) {

            1 -> {
                val p = counts.keys.first()
                1111 * p
            }


            2 -> {
                if (counts.values.contains(3)) {
                    val p = counts.filterValues { it == 3 }.keys.first()
                    val q = counts.filterValues { it == 1 }.keys.first()
                    (10 * p + q) * (10 * p + q)
                } else {
                    // 두 개씩 같은 값이 나왔을 때 (2:2)
                    val p = counts.keys.first()
                    val q = counts.keys.last()
                    (p + q) * Math.abs(p - q)
                }
            }

            3 -> {
                val singles = counts.filterValues { it == 1 }.keys.toList()
                singles[0] * singles[1]
            }

            else -> dice.minOrNull()!!
        }
    }
}