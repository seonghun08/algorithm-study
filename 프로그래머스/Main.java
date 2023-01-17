import java.util.*;

public class Main {
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        int[] stu = new int[n];
        System.arraycopy(arr[0], 0, stu, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if (i == j) continue;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int t = 0; t < n; t++) {
                        if (arr[k][t] == stu[i]) pi = t;
                        if (arr[k][t] == stu[j]) pj = t;
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

        // n == 학생 수
        // m == 테스트 횟수
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));
    }
}