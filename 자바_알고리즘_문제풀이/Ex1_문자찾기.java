import java.util.Scanner;

public class Ex1_문자찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char ch = Character.toLowerCase(sc.next().charAt(0));

        int answer = 0;
        for(char c : str.toCharArray()) {
            if (c == ch) answer++;
        }

        System.out.println(answer);
    }

    /**
     * File → Settings → Editor → General → Code Completion :: Show suggestions as you type
     * 자동 완성기능 끄기
     */
    public int solution(String str, char ch) {
        int answer = 0;
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ch) {
//                answer++;
//            }
//        }

        for (char c : str.toCharArray()) {
            if (c == ch) {
                answer++;
            }
        }

        return answer;
    }
}
