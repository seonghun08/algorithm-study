package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 120905
public class n의배수고르기 {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }

    public int[] solution2(int n, int[] numList) {
        List<Integer> answer = new ArrayList<>();

        for(int num : numList){
            if(num % n == 0){
                answer.add(num);
            }
        }

        return answer.stream().mapToInt(x -> x).toArray();
    }
}
