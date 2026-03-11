package programmers.intro

//프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
//쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
//시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return

class p087_chicken_coupons {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var coupons = 0
        coupons = (chicken / 10) + (chicken % 10)
        answer += chicken / 10
        while (coupons >= 10) {
            answer += (coupons / 10)
            coupons = (coupons / 10) + (coupons % 10)
        }
        return answer
    }
}