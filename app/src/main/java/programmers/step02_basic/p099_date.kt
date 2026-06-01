package programmers.step02_basic

//정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다.
//각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
//만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return

class p099_date {
    fun solution(date1: IntArray, date2: IntArray): Int {
        var answer: Int = 0
        for (i in date1.indices) {
            if (date1[i] < date2[i]) {
                answer = 1
                break
            } else if (date1[i] > date2[i]) {
                answer = 0
                break
            } else continue
        }
        return answer
    }
}