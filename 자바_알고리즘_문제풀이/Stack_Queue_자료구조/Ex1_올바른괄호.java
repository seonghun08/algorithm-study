package Stack_Queue_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class Ex1_올바른괄호 {
    public static String solution(String str) {
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') st.push(ch);
            else {
                if (st.isEmpty()) return "NO";
                st.pop();
            }
        }
        if (!st.isEmpty()) return "NO";
        return "YES";
    }

    /**
     * (()(()))(())
     */
    public static void Ex1_올바른괄호(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
    }
}