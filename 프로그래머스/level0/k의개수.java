package level0;

// 120887
public class k의개수 {
    public int solution(int f, int e, int k) {
        int answer = 0;
        for (int i = f; i <= e; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == k) {
                    answer++;
                }
                num /= 10;
            }
        }
        return answer;
    }
}
