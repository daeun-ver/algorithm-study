package programmers.step01_intro

//아이스 아메리카노는 한잔에 5,500원입니다.
//머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return

class p029_iced_americano {
    fun solution(money: Int): IntArray {
        var count = 0
        var change = 0

        count =money / 5500
        change = money % 5500

        return intArrayOf(count, change)
    }
}