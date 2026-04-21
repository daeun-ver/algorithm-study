package programmers.step02_basic

//문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return

class p059_filter_ad {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        return strArr.filter { i ->
            !i.contains("ad")
        }.toTypedArray()
    }
}