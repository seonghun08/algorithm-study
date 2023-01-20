package String_문자열;

import java.util.Scanner;

public class Ex3_문장속단어 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

//        String[] split = str.split(" ");
//        int max = 0;
//        for (int i = 0; i < split.length; i++) {
//            if (split[max].length() < split[i].length()) {
//                max = i;
//            }
//        }
//        System.out.println(split[max]);

        String answer = "";
        int max = Integer.MIN_VALUE;
        int pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        if (str.length() > max) {
            answer = str;
        }

        System.out.println(answer);
    }
}
