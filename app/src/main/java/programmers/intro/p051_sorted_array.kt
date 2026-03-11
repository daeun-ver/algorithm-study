package programmers.intro

//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return

class p051_sorted_array {
    fun solution(my_string: String): IntArray {

        return my_string
            .filter { it.isDigit() }
            .map { it.digitToInt() }
            .sorted()
            .toIntArray()
    }
}