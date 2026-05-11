package programmers.step02_basic

//문자열 binomial이 매개변수로 주어집니다.
//binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return

class p078_split_when {
    fun solution(binomial: String): Int {
        var part = binomial.split(" ")

        return when (part[1]) {
            "+" -> part[0].toInt() + part[2].toInt()
            "-" -> part[0].toInt() - part[2].toInt()
            "*" -> part[0].toInt() * part[2].toInt()
            else -> 0
        }
    }
}