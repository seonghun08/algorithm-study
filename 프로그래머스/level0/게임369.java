package level0;

// 120891
public class 게임369 {
    public int solution(int order) {
        int answer = 0;
        while (order > 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) answer++;
            order /= 10;
        }
        return answer;
    }

    public int solution2(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }
}
