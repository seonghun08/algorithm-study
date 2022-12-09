package level0;

// 120838
public class 모스부호1 {
    private final static String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    private final static String[] abc = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
    };

    public String solution(String letter) {
        String answer = "";
        String[] split = letter.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int t = 0; t < morse.length; t++) {
                if (split[i].equals(morse[t])) {
                    answer += abc[t];
                }
            }
        }
        return answer;
    }
}
