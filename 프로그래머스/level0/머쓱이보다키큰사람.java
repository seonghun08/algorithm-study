package level0;

import java.util.Arrays;

// 120585
public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) cnt++;
        }
        return cnt;
    }

    public int solution2(int[] array, int height) {
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}
