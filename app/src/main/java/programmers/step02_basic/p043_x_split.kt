package programmers.step02_basic

//문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return

class p043_x_split {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()
        var arr = myString.split('x')
        for (i in arr) {
            answer += i.length
        }
        return answer
    }

//    fun solution(myString: String): IntArray {
//
//        return myString.split('x')
//            .map { it.length }
//            .toIntArray()
//    }
}