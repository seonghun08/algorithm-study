package TwoPotinters_SlidingWindow_효율성;

import java.util.Scanner;

public class Ex5_연속된자연수의합 {
    public static int solution(int n) {
        int answer = 0, sum = 0, lt = 1;
        for (int rt = 1; rt <= (n / 2 + 1); rt++) {
            sum += rt;
            if (n == sum) answer++;
            while (sum >= n) {
                sum -= lt++;
                if (n == sum) answer++;
            }
        }
        return answer;
    }

    public static int solution2(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}