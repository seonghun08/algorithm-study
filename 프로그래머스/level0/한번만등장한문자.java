package level0;

import java.util.Arrays;

// 120896
public class 한번만등장한문자 {
    public String solution(String s) {
        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();
    }

    public String solution2(String s) {
        String answer = "";
        String[] split = s.split("");
        Arrays.sort(split);
        s = String.join("", split);
        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int k = 0; k < s.length(); k++) {
                if (k == i) continue;
                if (s.charAt(i) == s.charAt(k)) {
                    flag = true;
                }
            }
            if (flag == false) {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}
