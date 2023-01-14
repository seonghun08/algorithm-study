package String_문자열;

import java.util.Scanner;

public class Ex9_숫자만추출 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

//        System.out.println(solution(str));
//        System.out.println(solution2(str));
        System.out.println(solution3(str));
    }

    // (A~Z) 65 ~ 90, (a~z) 97 ~ 122
    // '0' ~ '9' == 48 ~ 57
    public static int solution(String str) {
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(str);
    }

    public static int solution2(String str) {
        int answer = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 48 && ch <= 57) {
                answer = answer * 10 + (ch - 48);
            }
        }
        return answer;
    }

    public static int solution3(String str) {
        String answer = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                answer += ch;
            }
        }

//        if (answer.indexOf("0") == 0) {
//                answer = answer.substring(1);
//        }

        return Integer.parseInt(answer);
    }
}
