package level0;

// 120912
public class 칠의개수 {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i ++) {
            int temp = array[i];
            while (temp > 0) {
                if (temp % 10 == 7) answer++;
                temp /= 10;
            }
        }
        return answer;
    }
}
