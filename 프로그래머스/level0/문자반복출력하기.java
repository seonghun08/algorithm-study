package level0;

public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n);
        }
        return answer;
    }

    public String solution2(String my_string, int n) {
        String answer = "";
        String[] split = my_string.split("");
        StringBuilder ab = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            for (int t = 0; t < n; t++) {
                ab.append(split[i]);
            }
        }
        answer = ab.toString();
        return answer;
    }
}
