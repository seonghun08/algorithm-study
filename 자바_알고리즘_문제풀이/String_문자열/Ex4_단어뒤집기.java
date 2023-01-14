package String_문자열;

import java.util.*;

public class Ex4_단어뒤집기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int count = in.nextInt();
//        String answer = "";
//        while (count-- != 0) {
//            String str = in.next();
//            for (int i = str.length() - 1; i >= 0; i--) {
//                answer += str.charAt(i);
//            }
//            System.out.println(answer);
//            answer = "";
//        }

        int count = in.nextInt();
        String[] str = new String[count];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
//
//        ArrayList<String> answer = new ArrayList<>();
//        for (String s : str) {
//            String tmp = new StringBuilder(s).reverse().toString();
//            answer.add(tmp);
//        }
//
//        for (String s : answer) {
//            System.out.println(s);
//        }

        ArrayList<String> answer = solution(count, str);
        System.out.println(answer);
    }

    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] chs = s.toCharArray();
            int lt = 0;
            int rt = chs.length - 1;

            while (lt < rt) {
                char tmp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt] = tmp;
                lt++;
                rt--;
            }

            answer.add(String.valueOf(chs));
        }

        return answer;
    }
}









