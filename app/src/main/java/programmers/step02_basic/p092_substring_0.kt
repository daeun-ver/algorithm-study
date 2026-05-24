package programmers.step02_basic

//정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return

class p092_substring_0 {
    fun solution(n_str: String): String {
        var index = 0
        while (index < n_str.length && n_str[index] == '0') {
            index++
        }
        return n_str.substring(index)
    }
}