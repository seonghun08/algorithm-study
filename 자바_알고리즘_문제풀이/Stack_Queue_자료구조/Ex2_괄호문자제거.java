package Stack_Queue_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class Ex2_괄호문자제거 {
    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') st.push(ch);
            else if (ch == ')') st.pop();
            else if (st.isEmpty()) answer.append(ch);
        }
        return String.valueOf(answer);
    }

    public static String solution2(String str) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                while (st.pop() != '(');
            } else {
                st.push(ch);
            }
        }
        for (Character ch : st) {
            sb.append(ch);
        }
        return String.valueOf(sb);
    }

    /**
     * (A(BC)D)EF(G(H)(IJ)K)LM(N)
     */
    public static void Ex2_괄호문자제거(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
        System.out.println(solution2(str));
    }
}