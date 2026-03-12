package programmers.step01_intro

//문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return
//암호화된 문자열 cipher를 주고받습니다.
//그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.

class p046_cipher_code {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        for (i in code - 1 until cipher.length step code) {
            answer += cipher[i]
        }
        return answer
    }
}