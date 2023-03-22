package Stack_Queue_자료구조;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Ex5_공주구하기 {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) Q.offer(i);
        while (!Q.isEmpty()) {
            for (int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll(); // k번째 값 제거
            if (Q.size() == 1) answer = Q.poll();
        }
        return answer;
    }

    /**
     * Queue<Integer> Q = new LinkedList<>();
     * Q.offer() → 값 추가
     * Q.poll()  → 첫번째 값을 버리고, 반환
     * Q.size()  → Q에 들어있는 갯수 반환
     */
    public static void main(String[] args) {
        Ex5_공주구하기 main = new Ex5_공주구하기();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int k = Integer.parseInt(in.next());
        System.out.println(main.solution(n, k));
    }
}