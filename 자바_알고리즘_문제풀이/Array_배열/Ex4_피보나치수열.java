package Array_배열;

import java.util.Scanner;

public class Ex4_피보나치수열 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 2] + result[i - 1];
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public static void solution(int n) {
        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
