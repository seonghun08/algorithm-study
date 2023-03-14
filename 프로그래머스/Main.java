import java.util.*;

public class Main {
    public static int solution(String str) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();

        /**
         * 3573*+5-323*++
         */
        for (char ch : str.toCharArray()) {
            if (isInteger(ch)) {
                st.push(Integer.parseInt(String.valueOf(ch)));
            } else {
                if (answer == 0) answer = st.pop();
                if (ch == '+') answer += st.pop();
                if (ch == '-') answer -= st.pop();
                if (ch == '*') answer *= st.pop();
                if (ch == '/') answer /= st.pop();
            }
        }
        return answer;
    }

    public static boolean isInteger(Character c) {
        try {
            Integer.parseInt(String.valueOf(c));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}