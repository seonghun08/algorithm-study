package level0;

// 120885
public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(num1 + num2);
    }
}
