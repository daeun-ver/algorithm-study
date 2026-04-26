package programmers.step02_basic

//정수 배열 numbers와 정수 n이 매개변수로 주어집니다. numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 이때까지 더했던 원소들의 합을 return

class p064_over_n {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        for (i in numbers) {
            answer += i
            if (answer > n) break
        }
        return answer
    }
}