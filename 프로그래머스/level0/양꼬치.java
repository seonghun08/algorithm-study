package level0;

// 120830
public class 양꼬치 {
    public int solution(int n, int k) {
        int a = 12000 * n;

        int service_cnt = n / 10;
        if (service_cnt > 0) k-=service_cnt;

        int b = 2000 * k;

        return a + b;
    }
}
