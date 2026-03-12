package programmers.step01_intro

//머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
//다음과 같이 로그인 성공, 실패에 따른 메시지를 return
//아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 login"
//로그인이 실패했을 때 아이디가 일치하는 회원이 없다면" "fail"
//아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 "wrong pw"

class p064_login {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer: String = ""
        for (i in db) {
            if (i[0] == id_pw[0]) {
                if (i[1] == id_pw[1]) {
                    return "login"
                } else return "wrong pw"
            }
        }
        return "fail"
    }
}