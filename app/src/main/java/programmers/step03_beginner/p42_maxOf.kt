package programmers.step03_beginner

//명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
//이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.

//모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
//모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

class p42_maxOf {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0

        for (size in sizes) {
            val w = maxOf(size[0], size[1])
            val h = minOf(size[0], size[1])

            maxWidth = maxOf(maxWidth, w)
            maxHeight = maxOf(maxHeight, h)
        }

        return maxWidth * maxHeight
    }
}