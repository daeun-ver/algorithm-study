package programmers.step01_intro

//장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
//사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return

class p035_ant_hp {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var h: Int = hp
        answer += hp / 5
        h = hp % 5
        if( h >= 3 ) {
            h -= 3
            answer++
        }
        answer += h
        return answer
    }

//    fun solution(hp: Int): Int {
//        var h = hp
//        var answer = 0
//
//        answer += h / 5
//        h %= 5
//
//        answer += h / 3
//        h %= 3
//
//        answer += h
//
//        return answer
//    }

}