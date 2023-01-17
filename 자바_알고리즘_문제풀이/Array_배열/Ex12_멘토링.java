package Array_배열;

import java.util.Scanner;

public class Ex12_멘토링 {

    // M == 테스트 횟수
    // N == 학생 수
    // arr[M][N]
    // 3 4 1 2
    // 4 3 2 1
    // 3 1 4 2
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                if (i == j) continue;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int t = 0; t < n; t++) {
                        if (arr[k][t] == i) pi = t;
                        if (arr[k][t] == j) pj = t;
                    }
                    if (pi < pj) count++;
                }
                if (count == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int t = 0; t < n; t++) {
                arr[i][t] = in.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));
    }
}
