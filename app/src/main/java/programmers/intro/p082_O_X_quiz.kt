package programmers.intro

//덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
//수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return

class p082_O_X_quiz {
    fun solution(quiz: Array<String>): Array<String> {
        var answer = mutableListOf<String>()
        for (i in quiz) {
            val arr = i.split(" ")
            val a = arr[0].toInt()
            val op = arr[1]
            val b = arr[2].toInt()
            val c = arr[4].toInt()
            var an = true

            if (op == "+") {
                an = a + b == c
            } else {
                an = a - b == c
            }

            if (an) {
                answer.add("O")
            } else {
                answer.add("X")
            }
        }
        return answer.toTypedArray()
    }
}