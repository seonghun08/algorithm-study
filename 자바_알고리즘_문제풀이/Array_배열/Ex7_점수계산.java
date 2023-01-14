package Array_배열;

import java.util.Scanner;

public class Ex7_점수계산 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int tmp = 0;
        int score = 0;

        for (int x : arr) {
            if (x == 1) {
                tmp++;
                score += tmp;
            } else {
                tmp = 0;
            }
        }

        System.out.println(score);
    }
}
