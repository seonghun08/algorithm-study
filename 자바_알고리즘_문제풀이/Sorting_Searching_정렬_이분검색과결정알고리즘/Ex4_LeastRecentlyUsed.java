package Sorting_Searching_정렬_이분검색과결정알고리즘;

import java.util.Scanner;

public class Ex4_LeastRecentlyUsed {
    public int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];
        for (int c : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) if (cache[i] == c) pos = i;
            if (pos == -1) for (int t = s - 1; t > 0; t--) cache[t] = cache[t - 1];
            else for (int t = pos; t > 0; t--) cache[t] = cache[t - 1];
            cache[0] = c;
        }
        return cache;
    }

    public int[] solution2(int s, int n, int[] arr) {
        int[] answer = new int[s];
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int t = 0; t < s; t++) {
                if (answer[t] == arr[i]) {
                    for (int j = t - 1; j >= 0; j--) answer[j + 1] = answer[j];
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int t = s - 2; t >= 0; t--) answer[t + 1] = answer[t];
            }
            answer[0] = arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Ex4_LeastRecentlyUsed main = new Ex4_LeastRecentlyUsed();
        Scanner in = new Scanner(System.in);

        int s = Integer.parseInt(in.next());
        int n = Integer.parseInt(in.next());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }

        for (int answer : main.solution(s, n, arr)) {
            System.out.print(answer + " ");
        }
    }
}
