import java.util.*;

public class Main {
    public static int solution(int n, int k, int[] arr) {
        int answer = 0, lt = 0;
        int cnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                int result = arr[lt++];
                if (result == 0) {
                    cnt--;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}