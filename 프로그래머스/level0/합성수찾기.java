package level0;

// 120846
public class 합성수찾기 {
    public int solution(int n) {
        if (n < 4) return 0;
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            int cnt = 0;
            for(int k = 1; k <= i; k++) {
                if (i % k == 0) cnt ++;
            }
            if (cnt >= 3) answer++;
        }
        return answer;
    }
}
