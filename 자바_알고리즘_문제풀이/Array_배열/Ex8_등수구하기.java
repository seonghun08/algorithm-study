package Array_배열;

import java.util.Scanner;

public class Ex8_등수구하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = 1;
            for (int t = 0; t < n; t++) {
                if (arr[i] < arr[t]) {
                    rank[i]++;
                }
            }
        }

        for (int x : rank) {
            System.out.print(x + " ");
        }
    }
}
