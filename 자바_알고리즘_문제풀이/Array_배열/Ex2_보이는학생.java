package Array_배열;

import java.util.Scanner;

public class Ex2_보이는학생 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] students = new int[n+1];
        for (int i = 0; i < n; i++) {
            students[i] = in.nextInt();
        }

        int count = 1;
        int max = students[0];

        for (int i = 0; i < n - 1; i++) {
            if (max < students[i]) {
                max = students[i];
            }
            if (max < students[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }
}
