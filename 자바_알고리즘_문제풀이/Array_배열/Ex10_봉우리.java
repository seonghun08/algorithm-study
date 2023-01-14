package Array_배열;

import java.util.Scanner;

public class Ex10_봉우리 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                arr[i][t] = in.nextInt();
            }
        }
        System.out.println(solution(n, arr));


//        int len = n + 2;
//        int[][] arr = new int[len][len];
//
//        for (int i = 1; i < len - 1; i++) {
//            for (int t = 1; t < len - 1; t++) {
//                arr[i][t] = in.nextInt();
//            }
//        }
//
//        int answer = 0;
//        for (int i = 1; i < len - 1; i++) {
//            for (int t = 1; t < len - 1; t++) {
//                int tmp = arr[i][t];
//                if (tmp > arr[i - 1][t]
//                        && tmp > arr[i + 1][t]
//                        && tmp > arr[i][t + 1]
//                        && tmp > arr[i][t - 1]) {
//                    answer++;
//                }
//            }
//        }
    }

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int t = 0; t < arr.length; t++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = t + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                        if (arr[i][t] <= arr[nx][ny]) {
                            flag = false;
                        }
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
