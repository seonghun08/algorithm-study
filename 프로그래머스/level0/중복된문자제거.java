package level0;

import java.util.*;
import java.util.stream.Collectors;

public class 중복된문자제거 {
    public String solution(String str) {
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }

    public String another_solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public String solution2(String str) {
        String[] answer = str.split("");

//         LinkedHashSet -> 삽입되는 순서로 넣어줌
        Set<String> set = new LinkedHashSet<>(List.of(answer));
        return String.join("", set);
    }
}
