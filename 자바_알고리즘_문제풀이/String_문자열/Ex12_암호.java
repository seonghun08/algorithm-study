package String_문자열;

import java.util.*;

public class Ex12_암호 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = in.next();

        // replaceAll() => 정규식으로 바꾸고 싶을 때 사용
        str = str.replace("*", "0").replace("#", "1");

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < num * 7; i += 7) {
            answer.append((char) Integer.parseInt(str.substring(i, i + 7), 2));
        }

        System.out.println(answer);
//        System.out.println(solution(num, str));
    }

    public static String solution(int num, String str) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace("*", "0").replace("#", "1");
            answer += (char) Integer.parseInt(tmp, 2);
            str = str.substring(7);
        }
        return answer;
    }
}
