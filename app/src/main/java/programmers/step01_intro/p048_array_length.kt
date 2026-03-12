package programmers.step01_intro

//문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 return

class p048_array_length {
    fun solution(strlist: Array<String>): IntArray {
        var answer = mutableListOf<Int>()
        for (i in strlist) {
            answer.add(i.length)
        }
        return answer.toIntArray()
    }
}