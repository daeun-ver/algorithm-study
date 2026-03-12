package programmers.step01_intro

//머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
//balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return

class p059_share_balls {
    fun solution(balls: Int, share: Int): Long {
        var answer = 1L
        var k = minOf(share, balls - share)

        for (i in 1..k) {
            answer = answer * (balls - i + 1) / i
        }
        return answer
    }

}