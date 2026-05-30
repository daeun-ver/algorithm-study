package programmers.step02_basic

//아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다.
//메뉴만 적은 팀원의 것은 차가운 것으로 통일하고 "아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.
//각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때, 카페에서 결제하게 될 금액을 return

class p098_coffee_order {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        for (i in order) {
            when (i) {
                "iceamericano", "americanoice", "hotamericano", "americanohot", "anything", "americano" -> answer += 4500
                "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte" -> answer += 5000

            }
        }
        return answer
    }
}