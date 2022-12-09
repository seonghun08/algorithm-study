package level0;

// 120911
public class 문자열정렬하기2 {
    public String solution(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int t = i+1; t < chars.length; t++) {
                if (chars[i] > chars[t]) {
                    char temp = chars[i];
                    chars[i] = chars[t];
                    chars[t] = temp;
                }
            }
        }
        return String.valueOf(chars);
    }
}
