package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Scanner;

public class Ex1_선택정렬 {
    private int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int t = i + 1; t < n; t++) {
                if (arr[idx] > arr[t]) idx = t;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    /**
     * 6
     * 13 5 11 7 23 15
     */
    public static void main(String[] args) {
        Ex1_선택정렬 main = new Ex1_선택정렬();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }

        for (int answer : main.solution(n, arr)) {
            System.out.print(answer + " ");
        }
    }
}
