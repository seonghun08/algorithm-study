package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9_뮤직비디오_결정알고리즘 {
    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().orElse(m);
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
     * - 결정알고리즘
     * 9 3
     * 1 2 3 4 5 6 7 8 9
     */
    public static void main(String[] args) {
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
