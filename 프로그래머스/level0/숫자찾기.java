package level0;

import java.util.Arrays;

// 120904
public class 숫자찾기 {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        int answer = numStr.indexOf(kStr);
        return answer < 0 ? -1 : answer + 1 ;
    }

    public int another_solution(int num, int k) {
        int answer = -1;
        int[] split = Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < split.length; i++) {
            if (split[i] == k) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}
