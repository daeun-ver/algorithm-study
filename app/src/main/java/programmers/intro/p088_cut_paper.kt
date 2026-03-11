package programmers.intro

//머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
//정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return

class p088_cut_paper {
    fun solution(M: Int, N: Int): Int {
        var answer: Int = 0
        answer = (M - 1) + (M * (N - 1))
        return answer
    }
}