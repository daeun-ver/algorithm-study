package programmers.step02_basic

//문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return

class p077_windowed {
    fun solution(myString: String, pat: String): Int {

        return myString.windowed(pat.length).count { it == pat }
    }
}