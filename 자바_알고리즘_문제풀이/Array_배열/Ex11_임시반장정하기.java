package Array_배열;

import java.util.Scanner;

public class Ex11_임시반장정하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < 5; t++) {
                arr[i][t] = in.nextInt();
            }
        }

        // n번 학생과 같은 반 이였던 학생 수 => result[n]
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                for (int j = 0; j < 5; j++) {
                    if (i == t) continue;
                    if (arr[i][j] == arr[t][j]) {
                        result[i]++;
                        break;
                    }
                }
            }
        }

        int max_index = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > result[max_index]) {
                max_index = i;
            }
        }
        System.out.print(max_index + 1);
    }

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }
}
