import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex1_문자찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * File → Settings → Editor → General → Code Completion :: Show suggestions as you type
     * 자동 완성기능 끄기
     */
    public int solution(String str, char ch) {
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
                answer++;
            }
        }
        return answer;
    }
}
