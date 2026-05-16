package programmers.step02_basic

//문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다.
//myString의 "A"를 "B"로, "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return

class p084_map_contains {
    fun solution(myString: String, pat: String): Int {
        return if (myString.map { i ->
                when (i) {
                    'A' -> 'B'
                    'B' -> 'A'
                    else -> i
                }
            }.joinToString("").contains(pat)) 1 else 0
    }
}