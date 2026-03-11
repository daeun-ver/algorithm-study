package programmers.intro

//a는 0, b는 1, c는 2, ..., j는 9입니다.
//예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return

class p033_planet_age {
    fun solution(age: Int): String {
        var answer = ""

        for (ch in age.toString()) {
            answer += ('a' + (ch - '0'))
        }

        return answer
    }
}