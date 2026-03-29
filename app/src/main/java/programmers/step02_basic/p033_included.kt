package programmers.step02_basic

//두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
// 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return

class p033_included {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        for (i in 0..included.size) {
            if (included[i]) {
                answer += a + (i * d)
            }
        }
        return answer
    }
}