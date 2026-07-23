package programmers.step03_beginner

//숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.
//각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다. 단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고,
//제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.
//기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때,
//무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.

class p23_power_limit {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var totalWeight = 0

        for (n in 1..number) {
            val count = getDivisorCount(n)

            if (count > limit) {
                totalWeight += power
            } else {
                totalWeight += count
            }
        }

        return totalWeight
    }

    private fun getDivisorCount(n: Int): Int {
        var count = 0
        var i = 1

        while (i * i <= n) {
            if (n % i == 0) {
                if (i * i == n) {
                    count += 1
                } else {
                    count += 2
                }
            }
            i++
        }

        return count
    }
}