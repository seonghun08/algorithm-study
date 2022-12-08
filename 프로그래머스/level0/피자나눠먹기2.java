package level0;

public class 피자나눠먹기2 {
    public int solution(int n) {
        int pizza = 1;
        while (true) {
            if ((pizza*6) % n == 0) {
                break;
            } else {
                pizza++;
            }
        }
        return pizza;
    }
}
