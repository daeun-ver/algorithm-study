package programmers.step01_intro

//수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return
class p021_odd_list {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 1..n step 2){
            answer += i
        }

        return answer
    }

//    fun solution(n: Int): IntArray {
//        var answer: IntArray = intArrayOf()
//        var list = mutableListOf<Int>()
//
//        for(i in 1..n step 2){
//            list.add(i)
//        }
//
//        answer = list.toIntArray()
//
//        return answer
//    }

}