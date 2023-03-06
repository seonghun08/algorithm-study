package TwoPotinters_SlidingWindow_효율성;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_두배열합치기 {
    public static ArrayList<Integer> solution(int[] nArr, int[] mArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < nArr.length && p2 < mArr.length) {
            if (nArr[p1] < mArr[p2]) answer.add(nArr[p1++]);
            else answer.add(mArr[p2++]);
        }
        while (p1 < nArr.length) answer.add(nArr[p1++]);
        while (p2 < mArr.length) answer.add(mArr[p2++]);
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

        ArrayList<Integer> solution = solution(nArr, mArr);
        for (int x : solution) {
            System.out.print(x + " ");
        }
    }
}
