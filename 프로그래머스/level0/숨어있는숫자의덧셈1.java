package level0;

// 120851
public class 숨어있는숫자의덧셈1 {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[a-zA-Z]", "");
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}
