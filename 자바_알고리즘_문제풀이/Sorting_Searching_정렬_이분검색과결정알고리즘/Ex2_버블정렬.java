package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Scanner;

public class Ex2_버블정렬 {
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int t = 0; t < n - i - 1; t++) {
                if (arr[t] > arr[t + 1]) {
                    int tmp = arr[t];
                    arr[t] = arr[t + 1];
                    arr[t + 1] = tmp;
                }
            }
        }
        return arr;
    }

    /**
     * 6
     * 13 5 11 7 23 15
     */
    public static void main(String[] args) {
        Ex2_버블정렬 main = new Ex2_버블정렬();
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(in.next());

        for (int answer : main.solution(n, arr)) {
            System.out.print(answer + " ");
        }
    }
}
