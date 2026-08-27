package programmers.step03_beginner

//수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때, 대회를 위한 음식의 배치를 나타내는 문자열을 return 하는 solution 함수를 완성해주세요.

class p46_food_fight {
    fun solution(food: IntArray): String {
        var left = ""

        for (i in 1 until food.size) {
            val count = food[i] / 2
            for (j in 0 until count) {
                left += i
            }
        }

        var right = ""
        for (i in food.size - 1 downTo 1) {
            val count = food[i] / 2
            for (j in 0 until count) {
                right += i
            }
        }

        return left + "0" + right
    }
}