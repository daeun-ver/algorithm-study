package programmers.step01_intro

//3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
//정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return

class p074_3x {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = 0
        while (num < n) {
            answer++

            if (answer % 3 !== 0 && !answer.toString().contains("3")) {
                num++
            }
        }
        return answer
    }


//    fun solution(n: Int): Int {
//        var answer = 0
//
//        for (i in 0 until n) {
//            answer++
//            while (answer % 3 == 0 || answer.toString().contains("3")) {
//                answer++
//            }
//        }
//        return answer
//    }

}