package programmers.step01_intro

//가위는 2 바위는 0 보는 5로 표현합니다.
//가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return

class p034_rsp {
    fun solution(rsp: String): String {

        return rsp.map {
            when (it) {
                '2' -> '0'
                '0' -> '5'
                '5' -> '2'
                else -> it
            }
        }.joinToString("")
    }
}