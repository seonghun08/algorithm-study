package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_마구간정하기_결정알고리즘 {
    public int count(int[] arr, int dist) {
        int cnt = 1, ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    /**
     * - 마구간 정하기
     * 5 3
     * 1 2 8 4 9
     * sort: 1 2 4 8 9
     */
    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        /*
         * lt: 두 좌표에서 가장 가까운 마구간 거리
         * rt: 두 좌표에서 가장 먼 마구간 거리
         */
        int lt = 1, rt = arr[n - 1];
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
     *   가장 가까운 두 말의 거리가 최대인 값 구하기
     * 5 3
     * 1 2 8 4 9 → 3
     */
    public static void main(String[] args) {
        Ex10_마구간정하기_결정알고리즘 main = new Ex10_마구간정하기_결정알고리즘();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 마구간 갯수
        int c = in.nextInt(); // 말 마릿 수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, c, arr));
    }
}
