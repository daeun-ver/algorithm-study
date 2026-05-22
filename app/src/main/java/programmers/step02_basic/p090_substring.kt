package programmers.step02_basic

//문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
//queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
//my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return

class p090_substring {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer = my_string
        for (query in queries) {
            var s = query[0]
            var e = query[1]

            answer = answer.substring(0, s) +
                    answer.slice(s..e).reversed() +
                    answer.substring(e + 1)
        }
        return answer
    }
}