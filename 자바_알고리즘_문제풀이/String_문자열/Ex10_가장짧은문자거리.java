package String_문자열;

import java.util.Scanner;

public class Ex10_가장짧은문자거리 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char t = in.next().charAt(0);

        int len = s.length();
        int[] answer = new int[len];
        int p = 1000;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == t) p = 0;
            else p++;
            answer[i] = p;
        }

        p = 1000;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else p++;
            answer[i] = Math.min(answer[i], p);
        }

        for (int i = 0; i < len; i++) {
            System.out.print(answer[i] + " ");
        }

//        System.out.println(Arrays.toString(answer));
    }
}
