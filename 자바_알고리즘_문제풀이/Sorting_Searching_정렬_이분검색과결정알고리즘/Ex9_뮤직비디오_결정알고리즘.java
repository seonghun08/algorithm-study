package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Scanner;
import java.util.Arrays;

public class Ex9_뮤직비디오_결정알고리즘 {
    public int count(int[] arr, int capacity) {
        int cnt = 0, sum = 0;
        for (int x : arr) {
            if (sum + x < capacity) {
                sum += x;
            } else {
                cnt++;
                sum = x;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) throws Exception {
        int answer = 0;
        int lt = Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    /**
     * - 결정 알고리즘 (이분 탐색)
     * 9 3
     * 1 2 3 4 5 6 7 8 9 → 17
     */
    public static void main(String[] args) throws Exception {
        Ex9_뮤직비디오_결정알고리즘 main = new Ex9_뮤직비디오_결정알고리즘();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}
