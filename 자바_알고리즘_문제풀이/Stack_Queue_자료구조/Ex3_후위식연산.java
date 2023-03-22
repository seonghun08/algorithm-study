package Stack_Queue_자료구조;

import java.util.Scanner;
import java.util.Stack;

public class Ex3_후위식연산 {
    public static int solution(String str) {
        Stack<Integer> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) st.push(ch - '0');
            else {
                int rt = st.pop();
                int lt = st.pop();
                if (ch == '+') lt += rt;
                if (ch == '-') lt -= rt;
                if (ch == '*') lt *= rt;
                if (ch == '/') lt /= rt;
                st.push(lt);
            }
        }
        return st.get(0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}