package programmers.step01_intro

//"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고 합니다.
//정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성

class p030_right_triangle {
    fun main(args: Array<String>) {
        val (n) = readLine()!!.split(' ').map(String::toInt)
        for(i in 1..n){
            for (j in 1..i){
                print("*")
            }
            println()
        }
    }
}