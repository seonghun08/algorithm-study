package Array_배열;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_큰수출력하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        for (Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
