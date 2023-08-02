import java.util.*;

public class TestCode {

    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    private int solution(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int level = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i <len; i++) {
                int x = Q.poll();
                for (int m : dis) {
                    int nx = x + m;
                    if (nx == e) return ++level;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        TestCode main = new TestCode();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        System.out.println(main.solution(s, e));
    }
}
