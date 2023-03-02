package String_문자열;

import java.util.Scanner;

public class Ex5_특정문자뒤집기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        char[] chs = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        // (A~Z)65 ~ 90, (a~z)97 ~ 122
        while (lt < rt) {
            if (!Character.isAlphabetic(chs[lt])) lt ++;
            else if (!Character.isAlphabetic(chs[rt])) rt--;
            else {
                char tmp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(chs));
    }

    public static String solution(String str) {
        String answer = "";

        char[] cs = str.toCharArray();
        int lt = 0, rt = cs.length - 1;

        while (lt < rt) {
            while (!Character.isAlphabetic(cs[lt])) lt++;
            while (!Character.isAlphabetic(cs[rt])) rt--;

            char tmp = cs[lt];
            cs[lt] = cs[rt];
            cs[rt] = tmp;

            lt++;
            rt--;
        }
        return String.valueOf(cs);
    }
}
