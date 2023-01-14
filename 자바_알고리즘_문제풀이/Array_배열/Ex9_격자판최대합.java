package Array_배열;

import java.util.Scanner;

public class Ex9_격자판최대합 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                arr[i][t] = in.nextInt();
            }
        }

        int answer = 0;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int t = 0; t < n; t++) {
                sum1 += arr[i][t];
                sum2 += arr[t][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[n - 1 - i][i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);
    }
}
