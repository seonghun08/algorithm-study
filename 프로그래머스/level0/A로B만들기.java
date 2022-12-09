package level0;

import java.util.Arrays;

// 120886
public class A로B만들기 {
    public int solution(String before, String after) {
        if (before.length() != after.length()) return 0;
        char[] bArr = before.toCharArray();
        char[] aArr = after.toCharArray();
        Arrays.sort(bArr);
        Arrays.sort(aArr);
        return String.valueOf(bArr).equals(String.valueOf(aArr)) ? 1 : 0;
    }

    public int solution2(String before, String after) {
        for(int i = 0; i < before.length(); i++){
            after = after.replaceFirst(before.substring(i,i+1),"");
        }
        return after.length() == 0? 1: 0;
    }
}
