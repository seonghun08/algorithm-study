package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Scanner;

public class Ex3_삽입정렬 {
    private int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], t;
            for (t = i - 1; t >= 0; t--) {
                if (arr[t] > tmp) arr[t + 1] = arr[t];
                else break;
            }
            arr[t] = tmp;
        }
        return arr;
    }

    /**
     * 6
     * 11 7 5 6 10 9
     */
    public static void main(String[] args) {
        Ex3_삽입정렬 main = new Ex3_삽입정렬();
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
