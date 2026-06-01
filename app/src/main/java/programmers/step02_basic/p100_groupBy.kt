package programmers.step02_basic

//문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return

class p100_groupBy {
    fun solution(strArr: Array<String>): Int {
        var answer: Int = 0
        var group = strArr.groupBy { it.length }
        var groupSize = group.mapValues { it.value.size }
        return groupSize.values.maxOrNull()!!
    }
}