package Stack_Queue_자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex6_교육과정설계 {
    public String solution(String need, String plan) {
        Queue<Character> Q = new LinkedList<>();
        for (char ch : need.toCharArray()) Q.offer(ch);
        for (char ch : plan.toCharArray()) {
            if (Q.contains(ch)) {
                if (ch != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Ex6_교육과정설계 main = new Ex6_교육과정설계();
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(main.solution(s1, s2));
    }
}
