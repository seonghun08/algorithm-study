package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

// 120895
public class 인덱스바꾸기 {
    public String solution(String str, int num1, int num2) {
        String[] split = str.split("");
        String tmp = split[num1];
        split[num1] = split[num2];
        split[num2] = tmp;
        return Arrays.stream(split).collect(Collectors.joining());
    }

    public String solution2(String str, int num1, int num2) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == num1) {
                answer += str.charAt(num2);
                continue;
            } else if (i == num2) {
                answer += str.charAt(num1);
                continue;
            }
            answer += str.charAt(i);
        }
        return answer;
    }
}
