package programmers.step02_basic

//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return

class p113_split_filter {
    fun solution(my_string: String): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        answer += my_string.split(" ")

        return answer.filter { it != "" }.toTypedArray()
    }
}