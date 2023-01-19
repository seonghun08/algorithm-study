package TwoPotinters_SlidingWindow_효율성;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2_공통원소구하기 {
    public static ArrayList<Integer> solution(int n, int m, int[] nArr, int[] mArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        Arrays.sort(nArr);
        Arrays.sort(mArr);

        while (p1 < n && p2 < m) {
            if (nArr[p1] == mArr[p2]) {
                answer.add(nArr[p1++]);
                p2++;
            }
            else if (nArr[p1] < mArr[p2]) p1++;
            else p2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = in.nextInt();
        }

        ArrayList<Integer> answer = solution(n, m, nArr, mArr);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
