package Stack_Queue_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class Ex4_쇠막대기 {
    public static int solution(String str) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        str = str.replace("()", "*");
        for (char ch : str.toCharArray()) {
            if (ch == '(') st.push(ch);
            else if (ch == '*') answer += st.size();
            else {
                st.pop();
                answer += 1;
            }
        }
        return answer;
    }

    public static int solution2(String str) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') st.push(str.charAt(i));
            else {
                st.pop();
                if (str.charAt(i - 1) == '(') answer += st.size();
                else answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}