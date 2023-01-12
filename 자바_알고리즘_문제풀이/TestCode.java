import java.util.*;

public class TestCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char t = in.next().charAt(0);

        int[] answer = new int[s.length()];

        int count = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) count = 0;
            else count++;
            answer[i] = count;
        }

        count = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) count = 0;
            else count++;
            answer[i] = Math.min(answer[i], count);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
