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
}
