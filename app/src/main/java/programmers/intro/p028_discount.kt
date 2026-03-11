package programmers.intro

//머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
//구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return

class p028_discount {
    fun solution(price: Int): Int {
        return when {
            price >= 500000 -> (price * 0.8).toInt()
            price >= 300000 -> (price * 0.9).toInt()
            price >= 100000 -> (price * 0.95).toInt()
            else -> price
        }
    }
}