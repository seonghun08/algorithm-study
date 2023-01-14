package String_문자열;

import java.util.Scanner;

public class Ex2_대소문자변환 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        StringBuilder answer = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) answer.append(Character.toLowerCase(c));
            else answer.append(Character.toUpperCase(c));
        }

        System.out.println(answer);
    }
}
