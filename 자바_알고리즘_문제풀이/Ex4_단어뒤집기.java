import java.util.Scanner;

public class Ex4_단어뒤집기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        String answer = "";
        while (count-- != 0) {
            String str = in.next();

            for (int i = str.length() - 1; i >= 0; i--) {
                answer += str.charAt(i);
            }

            System.out.println(answer);
            answer = "";
        }
    }
}
