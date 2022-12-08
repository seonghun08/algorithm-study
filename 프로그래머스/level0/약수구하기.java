package level0;

import java.util.stream.IntStream;

// 120897
public class 약수구하기 {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
