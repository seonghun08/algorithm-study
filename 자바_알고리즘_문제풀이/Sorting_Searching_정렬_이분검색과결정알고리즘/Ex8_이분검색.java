package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Scanner;
import java.util.Arrays;

public class Ex8_이분검색 {
    private static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0, rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                return mid + 1;
            } else if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    /**
     * - 이분검색 알고리즘
     * 8 32
     * 23 87 65 12 57 32 99 81
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
