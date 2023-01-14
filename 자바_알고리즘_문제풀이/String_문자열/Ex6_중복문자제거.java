package String_문자열;

import java.util.Scanner;

public class Ex6_중복문자제거 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String solution = solution(str);
        System.out.println(solution);

//        char[] chars = str.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            for (int t = 0; t < chars.length; t++) {
//                if (i == t) continue;
//                if (chars[i] == chars[t]) {
//                    chars[t] = ' ';
//                }
//            }
//        }
//
//        String answer = String.valueOf(chars).replaceAll(" ", "");
//        System.out.println(answer);
    }

    // indexOf() 조건에 맞는 값이 여러개여도 맨 앞의 인덱스 값을 알려준다.
    public static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
