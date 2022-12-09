package level0;

// 120862
public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int max = -100000001;
        for (int i = 0; i < numbers.length; i++) {
            for (int t = 0; t < numbers.length; t++) {
                if (i == t) continue;
                int num = numbers[i] * numbers[t];
                if (max <= num) {
                    max = num;
                }
            }
        }
        return max;
    }
}
