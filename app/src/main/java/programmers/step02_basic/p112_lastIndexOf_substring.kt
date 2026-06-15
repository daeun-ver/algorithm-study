package programmers.step02_basic

//문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return

class p112_lastIndexOf_substring {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""
        var num = myString.lastIndexOf(pat) + pat.length
        answer = myString.substring(0 until num)
        return answer
    }
}