package Stack_Queue_자료구조;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Person {
    int sequence;
    int priority;
    public Person(int sequence, int priority) {
        this.sequence = sequence;
        this.priority = priority;
    }
}

public class Ex7_응급실 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) Q.offer(new Person(i, arr[i]));
        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person p : Q) {
                if (p.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.sequence == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        Ex7_응급실 main = new Ex7_응급실();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }

        System.out.println(main.solution(n, m, arr));
    }
}
