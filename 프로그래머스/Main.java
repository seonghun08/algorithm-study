import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                arr[i][t] = in.nextInt();
            }
        }

//        int len = n + 2;
//        int[][] arr = new int[len][len];
//
//        for (int i = 1; i < len - 1; i++) {
//            for (int t = 1; t < len - 1; t++) {
//                arr[i][t] = in.nextInt();
//            }
//        }
//
//        int answer = 0;
//        for (int i = 1; i < len - 1; i++) {
//            for (int t = 1; t < len - 1; t++) {
//                int tmp = arr[i][t];
//                if (tmp > arr[i - 1][t]
//                        && tmp > arr[i + 1][t]
//                        && tmp > arr[i][t + 1]
//                        && tmp > arr[i][t - 1]) {
//                    answer++;
//                }
//            }
//        }

//        System.out.println(answer);
        System.out.println(solution(n, arr));
    }


    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = t + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][t]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    answer++;
                }

            }
        }
        return answer;
    }
}
