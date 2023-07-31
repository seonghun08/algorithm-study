import java.util.*;

public class Main {
    public int count(int[] arr, int dist) {
        int cnt = 1, ep = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 1, rt = arr[n];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    /**
     * - 마구간 정하기 (결정 알고리즘)
     * n: 마구간 갯수, c: 말 마릿 수
     */
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, c, arr));
    }
}