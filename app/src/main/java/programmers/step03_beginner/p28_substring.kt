package programmers.step03_beginner

//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

class p28_substring {
    fun solution(s: String): String {
        var answer = ""
        var mid = s.length / 2
        if (s.length % 2 == 1) {
            answer = s.substring(mid, mid + 1)
        } else {
            answer = s.substring(mid - 1, mid + 1)
        }
        return answer
    }
}