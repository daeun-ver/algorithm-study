package programmers.intro

//덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return

class p091_polynomial {
    fun solution(polynomial: String): String {
        var answer: String = ""
        var xCount = 0
        var numCount = 0

        val arr = polynomial.split(" + ")

        for (i in arr) {
            if (i.contains("x")) {
                var temp = i.replace("x", "")
                xCount += if (temp == "") 1 else temp.toInt()
            } else {
                numCount += i.toInt()
            }
        }
        val xStr = if (xCount == 1) "x" else if (xCount > 1) "${xCount}x" else ""
        val numStr = if (numCount > 0) numCount.toString() else ""


        return if (xStr != "" && numStr != "") {
            "$xStr + $numStr"
        } else {
            xStr + numStr
        }
    }
}