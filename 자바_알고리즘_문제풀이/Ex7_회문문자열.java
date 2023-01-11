import java.util.Scanner;

public class Ex7_회문문자열 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        // solution
        System.out.println(solution(str));

        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        // equalsIgnoreCase => 대, 소문자를 무시하고 값이 값은지 확인
        if (str.equalsIgnoreCase(reverse)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) answer = "NO";
        }

        return answer;
    }

//    public static String solution2(String str) {
//        char[] chars = str.toCharArray();
//        int lt = 0, rt = chars.length - 1;
//
//        while (lt < rt) {
//            char tmp = chars[lt];
//            chars[lt] = chars[rt];
//            chars[rt] = tmp;
//            lt++;
//            rt--;
//        }
//
//        String reverse = String.valueOf(chars);
//        return str.equals(reverse) ? "YES" : "NO";
//    }
}
