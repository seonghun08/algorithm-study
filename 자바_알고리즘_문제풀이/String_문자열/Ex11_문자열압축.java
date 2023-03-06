package String_문자열;

import java.util.Scanner;

public class Ex11_문자열압축 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int t = i + 1; t < s.length(); t++) {
                if (s.charAt(i) == s.charAt(t)) {
                    count++;
                    i++;
                } else break;
            }
            answer.append(s.charAt(i)).append(count > 1 ? count : "");
        }

        System.out.println(answer);
    }
}
