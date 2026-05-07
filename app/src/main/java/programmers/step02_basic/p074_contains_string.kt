package programmers.step02_basic

//문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다.
//꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다.
//문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때, str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return

class p074_contains_string {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        for (i in str_list) {
            if (i.contains(ex) == false) {
                answer += i
            }
        }
        return answer
    }
}