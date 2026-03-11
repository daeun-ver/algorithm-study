package programmers.intro

//문자열 my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return

class p079_sum_string_num {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        answer = my_string.split(Regex("[^0-9]"))
            .filter { it.isNotEmpty() }
            .sumOf { it.toInt() }


        return answer
    }
}