package level0;

// 120824
public class 짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;

        for (int n : num_list) {
            if (n % 2 == 0) a++;
            else b++;
        }

        return new int[] {a, b};
    }
}
