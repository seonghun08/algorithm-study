package Array_배열;

import java.util.Scanner;

public class Ex5_소수_에라토스테네스체 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ch = new int[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                count++;
                for (int t = i; t <= n; t=t+i) {
                    ch[t] = 1;
                }
            }
        }
        System.out.println(count);
    }
}
